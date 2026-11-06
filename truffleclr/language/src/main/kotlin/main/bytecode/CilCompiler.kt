package main.bytecode

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.bytecode.BytecodeConfig
import com.oracle.truffle.api.bytecode.BytecodeLabel
import com.oracle.truffle.api.bytecode.BytecodeLocal
import main.Clr
import metadata.IlMethod
import metadata.IlType
import metadata.instruction.*
import nodes.expressions.CompareCondition
import runtime.ClrContext
import runtime.ClrObject
import runtime.CorElementType
import runtime.Method
import types.CTSNull

/** Compile-time symbolic stacks fuse expressions inside each basic block. Pending
 * values are materialized bottom-to-top before statements and dup, preserving calls,
 * exceptions and reads across mutations. Edge slots and entry snapshots implement
 * parallel stack transfers without keeping an operand stack in the interpreter.
 */
class CilCompiler(private val method: IlMethod, private val language: Clr, private val context: ClrContext) {
    private val code = method.instructions
    private data class Block(val start: Int, val end: Int, val successors: List<Int>)
    private lateinit var b: CilRootNodeGen.Builder
    private lateinit var locals: List<BytecodeLocal>
    private lateinit var carry: List<BytecodeLocal>
    private class Value(var emit: () -> Unit, val isBoolean: Boolean, var materialized: Boolean = false)
    private val stack = mutableListOf<Value>()
    private var pendingOperations = 0

    private fun target(i: InstructionBrTarget) = method.labels.getValue(i.target)
    private fun blocks(): List<Block> {
        val starts = sortedSetOf(0)
        code.forEachIndexed { index, i ->
            if (i is InstructionBrTarget) starts.add(target(i))
            if ((i is InstructionBrTarget || i.instruction == "ret") && index + 1 < code.size) starts.add(index + 1)
        }
        val orderedStarts = starts.toList()
        return orderedStarts.mapIndexed { n, start ->
            val end = orderedStarts.getOrNull(n + 1) ?: code.size
            val last = code[end - 1]
            val successors = when {
                last is InstructionBrTarget && last.instruction == "br" -> listOf(target(last))
                last is InstructionBrTarget -> listOf(target(last), end)
                last.instruction == "ret" -> emptyList()
                else -> listOf(end)
            }
            Block(start, end, successors.distinct())
        }
    }

    private fun effect(i: Instruction): Pair<Int, Int> = when (i.instruction) {
        "nop", "break", "br" -> 0 to 0
        "dup" -> 1 to 2
        "pop", "stloc", "stsfld", "brtrue", "brfalse" -> 1 to 0
        "ret" -> (if (method.returnType.type == CorElementType.VOID) 0 else 1) to 0
        "ldarg", "ldloc", "ldnull", "ldc", "ldstr" -> 0 to 1
        "add", "sub", "mul", "div", "rem", "and", "or", "xor", "shl", "shr", "ceq", "clt", "cgt", "ldelem", "ldelema" -> 2 to 1
        "neg", "newarr", "isinst", "unbox", "ldind", "ldfld", "ldlen", "box", "conv", "castclass" -> 1 to 1
        "stfld", "beq", "bne", "bge", "bgt", "ble", "blt" -> 2 to 0
        "stelem" -> 3 to 0
        "call", "callvirt", "newobj" -> {
            val callee = (i as InstructionMethod).method
            val constructor = i.instruction == "newobj"
            (callee.arguments.size + if (!constructor && !callee.static) 1 else 0) to
                (if (constructor || callee.returnType.type != CorElementType.VOID) 1 else 0)
        }
        else -> throw NotImplementedError("not implemented: "+i.instruction)
    }

    @CompilerDirectives.TruffleBoundary
    fun compile(): CilRootNode {
        require(code.isNotEmpty()) { "No body for $method" }
        val blocks = blocks()
        val byStart = blocks.associateBy { it.start }
        val heights = mutableMapOf(0 to 0)
        val queue = ArrayDeque<Int>().apply { add(0) }
        var maxStack = 0
        while (queue.isNotEmpty()) {
            val block = byStart.getValue(queue.removeFirst())
            var height = heights.getValue(block.start)
            for (index in block.start until block.end) {
                val (pop, push) = effect(code[index])
                require(height >= pop) { "Stack underflow in $method at $index" }
                height += push - pop
                maxStack = maxOf(maxStack, height)
            }
            if (code[block.end - 1].instruction == "ret") require(height == 0) { "Nonempty return stack in $method" }
            for (next in block.successors) {
                require(next in byStart) { "Control falls outside $method" }
                val previous = heights.putIfAbsent(next, height)
                require(previous == null || previous == height) { "Inconsistent stack height at $next in $method" }
                if (previous == null) queue.add(next)
            }
        }
        val reachable = blocks.filter { it.start in heights }
        // Nest loop intervals, expanding side entries so every generated While is
        // single-entry. Crossing intervals are merged (irreducible flow fallback).
        data class Region(var first: Int, var last: Int)
        val indices = reachable.mapIndexed { index, block -> block.start to index }.toMap()
        val edges = reachable.flatMap { block -> block.successors.map { indices.getValue(block.start) to indices.getValue(it) } }
        val regions = edges.filter { (from, to) -> to <= from }.groupBy { it.second }
            .map { (to, incoming) -> Region(to, incoming.maxOf { it.first }) }.toMutableList()
        var changed: Boolean
        do {
            changed = false
            for (region in regions) {
                val entry = edges.filter { (from, to) -> from < region.first && to > region.first && to <= region.last }
                    .minOfOrNull { it.first }
                if (entry != null) { region.first = entry; changed = true }
                val backwardEntry = edges.filter { (from, to) -> from > region.last && to > region.first && to <= region.last }
                    .maxOfOrNull { it.first }
                if (backwardEntry != null) { region.last = backwardEntry; changed = true }
            }
            outer@ for (a in regions.indices) for (c in a + 1 until regions.size) {
                val x = regions[a]; val y = regions[c]
                val overlaps = x.first <= y.last && y.first <= x.last
                val contains = (x.first <= y.first && x.last >= y.last) || (y.first <= x.first && y.last >= x.last)
                if (overlaps && (!contains || x == y)) {
                    x.first = minOf(x.first, y.first); x.last = maxOf(x.last, y.last)
                    regions.removeAt(c); changed = true; break@outer
                }
            }
        } while (changed)
        val roots = CilRootNodeGen.create(language, BytecodeConfig.DEFAULT) { builder ->
            b = builder
            b.beginRoot()
            locals = method.locals.map { b.createLocal() }
            carry = List(maxStack) { b.createLocal() }
            locals.forEachIndexed { index, local -> store(local) { b.emitLoadConstant(defaultValue(method.locals[index])) } }
            class Scope(val region: Region?, val parent: Scope?) {
                val labels = mutableMapOf<Int, BytecodeLabel>()
                var pc: BytecodeLocal? = null
                var continueLabel: BytecodeLabel? = null
                fun label(index: Int): BytecodeLabel = labels[index] ?: checkNotNull(parent).label(index)
            }
            fun edge(from: Int, next: Int, scope: Scope) {
                if (next <= from) {
                    var loop = scope
                    while (loop.region == null || next < loop.region!!.first || from > loop.region!!.last) loop = checkNotNull(loop.parent)
                    store(checkNotNull(loop.pc)) { b.emitLoadConstant(next) }
                    b.emitBranch(checkNotNull(loop.continueLabel))
                } else b.emitBranch(scope.label(next))
            }
            fun emitRange(first: Int, last: Int, scope: Scope) {
                val children = regions.filter { it !== scope.region && it.first >= first && it.last <= last }
                    .filter { child -> regions.none { other -> other !== child && other !== scope.region && other.first >= first && other.last <= last && other.first <= child.first && other.last >= child.last } }
                    .associateBy { it.first }
                var index = first
                while (index <= last) {
                    scope.labels[index] = b.createLabel()
                    index = children[index]?.let { it.last + 1 } ?: (index + 1)
                }
                if (scope.region != null) {
                    scope.continueLabel = b.createLabel()
                    val destinations = edges.filter { (from, to) -> to <= from && from in first..last && to in first..last }
                        .filter { (from, to) -> children.values.none { to >= it.first && from <= it.last } }.map { it.second }.distinct()
                    for (destination in destinations.filter { it != first }) {
                        b.beginIfThen()
                        b.beginCmp(CompareCondition.EQ); b.emitLoadLocal(scope.pc!!); b.emitLoadConstant(destination); b.endCmp()
                        b.emitBranch(scope.label(destination)); b.endIfThen()
                    }
                }
                index = first
                while (index <= last) {
                    b.emitLabel(scope.labels.getValue(index))
                    val child = children[index]
                    if (child != null) {
                        val inner = Scope(child, scope)
                        inner.pc = b.createLocal()
                        store(inner.pc!!) { b.emitLoadConstant(child.first) }
                        b.beginWhile(); b.emitLoadConstant(true); b.beginBlock()
                        emitRange(child.first, child.last, inner)
                        b.emitLabel(inner.continueLabel!!)
                        b.endBlock(); b.endWhile()
                        index = child.last + 1
                        continue
                    }
                    val block = reachable[index]
                    stack.clear()
                    repeat(heights.getValue(block.start)) { n -> push { b.emitLoadLocal(carry[n]) } }
                    materialize()
                    for (instructionIndex in block.start until block.end) {
                        val i = code[instructionIndex]
                        when {
                            i is InstructionBrTarget -> {
                                val condition = when (i.instruction) {
                                    "br" -> null
                                    "brtrue", "brfalse" -> pop()
                                    else -> {
                                        val right = pop(); val left = pop()
                                        push(true) { b.beginCmp(condition(i.instruction)); load(left, right); b.endCmp() }
                                        pop()
                                    }
                                }
                                spill()
                                if (condition == null) edge(index, indices.getValue(target(i)), scope) else {
                                    b.beginIfThenElse()
                                    if (condition.isBoolean) load(condition)
                                    else { b.beginTruth(); load(condition); b.endTruth() }
                                    val positive = if (i.instruction == "brfalse") block.end else target(i)
                                    val negative = if (i.instruction == "brfalse") target(i) else block.end
                                    b.beginBlock(); edge(index, indices.getValue(positive), scope); b.endBlock()
                                    b.beginBlock(); edge(index, indices.getValue(negative), scope); b.endBlock()
                                    b.endIfThenElse()
                                }
                            }
                            i.instruction == "ret" -> {
                                b.beginReturn()
                                if (method.returnType.type == CorElementType.VOID) b.emitLoadConstant(0) else load(pop())
                                b.endReturn()
                            }
                            else -> emit(i)
                        }
                    }
                    val tail = code[block.end - 1]
                    if (tail !is InstructionBrTarget && tail.instruction != "ret") {
                        spill(); edge(index, index + 1, scope)
                    }
                    index++
                }
            }
            b.beginBlock()
            emitRange(0, reachable.lastIndex, Scope(null, null))
            b.endBlock()
            b.endRoot()
        }
        return roots.nodes.single().also { it.setMethodName(method.toString()) }
    }

    private fun store(local: BytecodeLocal, emit: () -> Unit) { b.beginStoreLocal(local); emit(); b.endStoreLocal() }
    private fun push(isBoolean: Boolean = false, emit: () -> Unit) {
        stack.add(Value(emit, isBoolean))
        // Bound emitter recursion independently of the CIL operand-stack depth.
        if (++pendingOperations >= 64) materialize()
    }
    private fun pop() = stack.removeAt(stack.lastIndex)
    private fun load(vararg values: Value) { values.forEach { it.emit() } }
    private fun materialize() {
        pendingOperations = 0
        for (value in stack) if (!value.materialized) {
            val local = b.createLocal()
            store(local, value.emit)
            value.emit = { b.emitLoadLocal(local) }
            value.materialized = true
        }
    }
    private fun spill() { stack.forEachIndexed { index, value -> store(carry[index]) { load(value) } } }
    private fun condition(op: String) = when (op) {
        "beq", "ceq" -> CompareCondition.EQ
        "bne" -> CompareCondition.NE
        "bge" -> CompareCondition.GE
        "bgt", "cgt" -> CompareCondition.GT
        "ble" -> CompareCondition.LE
        "blt", "clt" -> CompareCondition.LT
        else -> error("Unknown condition $op")
    }
    private fun number(i: Instruction, argument: Boolean = false) = when (i) {
        is InstructionNone -> i.instructionArgs[0].toInt()
        is InstructionVar -> i.value
        is InstructionVarS -> if (argument) {
            val names = (if (method.static) emptyList() else listOf("this")) + method.arguments.map { it.first }
            names.indexOf(i.id).also { require(it >= 0) { "Unknown argument "+i.id } }
        } else i.id.removePrefix("V_").toInt()
        else -> error("Wrong variable instruction $i")
    }
    private fun defaultValue(type: IlType): Any = if (!type.isPrimiteive) CTSNull else when (type.type) {
        CorElementType.BOOLEAN -> false
        CorElementType.I1, CorElementType.U1 -> 0.toByte()
        CorElementType.CHAR, CorElementType.I4, CorElementType.U4 -> 0
        CorElementType.I8, CorElementType.U8 -> 0L
        CorElementType.R4 -> 0.0f
        CorElementType.R8 -> 0.0
        else -> error("Unknown local type encountered: "+type.type)
    }

    private fun emit(i: Instruction) {
        when (i.instruction) {
            "nop", "break" -> Unit
            "dup" -> { materialize(); stack.add(stack.last()) }
            "pop" -> { materialize(); pop() }
            "ldarg" -> push { b.emitLoadArgument(number(i, true)) }
            "ldloc" -> { val index = number(i); push(method.locals[index].type == CorElementType.BOOLEAN) { b.emitLoadLocal(locals[index]) } }
            "stloc" -> {
                val value = pop()
                val index = number(i)
                materialize()
                store(locals[index]) {
                    if (method.locals[index].type == CorElementType.BOOLEAN && !value.isBoolean) {
                        b.beginTruth(); load(value); b.endTruth()
                    } else load(value)
                }
            }
            "ldnull" -> push { b.emitLoadConstant(CTSNull) }
            "ldstr" -> push { b.emitLoadConstant((i as InstructionString).content.drop(1).dropLast(1)) }
            "ldc" -> push { b.emitLoadConstant(when (i) {
                is InstructionI -> i.arg
                is InstructionI8 -> i.arg
                is InstructionR -> i.arg
                is InstructionR8 -> i.arg
                is InstructionNone -> i.instructionArgs[1].let { if (it == "m1") -1 else it.toInt() }
                else -> error("Invalid constant $i")
            }) }
            "add", "sub", "mul", "div", "rem", "and", "or", "xor", "shl", "shr" -> {
                val right = pop(); val left = pop()
                push { when (i.instruction) {
                    "add" -> { b.beginAdd(); load(left, right); b.endAdd() }
                    "sub" -> { b.beginSub(); load(left, right); b.endSub() }
                    "mul" -> { b.beginMul(); load(left, right); b.endMul() }
                    "div" -> { b.beginDiv(); load(left, right); b.endDiv() }
                    "rem" -> { b.beginRem(); load(left, right); b.endRem() }
                    "and" -> { b.beginAnd(); load(left, right); b.endAnd() }
                    "or" -> { b.beginOr(); load(left, right); b.endOr() }
                    "xor" -> { b.beginXor(); load(left, right); b.endXor() }
                    "shl" -> { b.beginShl(); load(left, right); b.endShl() }
                    "shr" -> { b.beginShr(); load(left, right); b.endShr() }
                } }
            }
            "neg" -> { val v = pop(); push { b.beginNeg(); load(v); b.endNeg() } }
            "ceq", "clt", "cgt" -> { val right = pop(); val left = pop(); push(true) { b.beginCmp(condition(i.instruction)); load(left, right); b.endCmp() } }
            "conv", "castclass", "unbox" -> Unit // Preserve the existing pass-through semantics.
            "isinst" -> { materialize(); pop(); push { b.emitLoadConstant(false) } }
            "ldind" -> { materialize(); pop(); push { b.emitLoadConstant(0) } }
            "box" -> { val v = pop(); push { b.beginBox(); load(v); b.endBox() } }
            "newarr" -> { val size = pop(); val type = context.types.getValue((i as InstructionType).type).info.type
                push { b.beginArrayNew(type); load(size); b.endArrayNew() } }
            "ldlen" -> { val v = pop(); push { b.beginArrayLength(); load(v); b.endArrayLength() } }
            "ldelem", "ldelema" -> {
                if (i.instruction == "ldelem" && i is InstructionType) throw NotImplementedError("not implemented")
                val index = pop(); val array = pop(); push { b.beginArrayLoad(); load(array, index); b.endArrayLoad() }
            }
            "stelem" -> {
                if (i !is InstructionNone) throw NotImplementedError("not implemented")
                require(i.instructionArgs[0] in listOf("i1", "i4", "i", "ref", "r8")) { "Unknown element type" }
                val value = pop(); val index = pop(); val array = pop()
                materialize()
                b.beginArrayStore(); load(array, index, value); b.endArrayStore()
            }
            "ldfld", "stfld" -> {
                i as InstructionField
                require(context.types.getValue(i.member).shape.getProperty(i.name) != null) { "Not a field: $i" }
                if (i.instruction == "ldfld") { val receiver = pop(); push {
                    when (i.type) {
                        "int32", "uint32" -> { b.beginFieldLoadInt(i.name); load(receiver); b.endFieldLoadInt() }
                        "float64" -> { b.beginFieldLoadDouble(i.name); load(receiver); b.endFieldLoadDouble() }
                        else -> { b.beginFieldLoad(i.name); load(receiver); b.endFieldLoad() }
                    }
                } }
                else { val value = pop(); val receiver = pop(); materialize(); b.beginFieldStore(i.name); load(receiver, value); b.endFieldStore() }
            }
            "stsfld" -> { val value = pop(); materialize(); b.beginStaticStore(); load(value); b.endStaticStore() }
            "call", "callvirt", "newobj" -> {
                val callee = (i as InstructionMethod).method
                val constructor = i.instruction == "newobj"
                val args = List(callee.arguments.size + if (!constructor && !callee.static) 1 else 0) { pop() }.reversed()
                val type = context.types.getValue(callee.memberOf!!.fullName)
                val emitCall = {
                    when (i.instruction) {
                        "callvirt" -> {
                            require(!callee.static)
                            val index = (type.shape.dynamicType as ClrObject).virtualTable.indexOfFirst { it.metadata.toString(false) == callee.toString(false) }
                            require(index >= 0) { "No virtual method $callee" }
                            b.beginInvokeVirtual(index); args.forEach { load(it) }; b.endInvokeVirtual()
                        }
                        "newobj" -> { b.beginObjectNew(type.shape, type.members.getValue(callee.toString()) as Method, args.size); args.forEach { load(it) }; b.endObjectNew() }
                        else -> { val target = type.members.getValue(callee.toString()) as Method
                            when (args.size) {
                            0 -> { b.emitInvoke0(target) }
                            1 -> { b.beginInvoke1(target); args.forEach { load(it) }; b.endInvoke1() }
                            2 -> { b.beginInvoke2(target); args.forEach { load(it) }; b.endInvoke2() }
                            3 -> { b.beginInvoke3(target); args.forEach { load(it) }; b.endInvoke3() }
                            4 -> { b.beginInvoke4(target); args.forEach { load(it) }; b.endInvoke4() }
                                else -> { b.beginInvoke(target); args.forEach { load(it) }; b.endInvoke() }
                            }
                        }
                    }
                }
                if (constructor || callee.returnType.type != CorElementType.VOID) push(emit = emitCall) else { materialize(); b.beginBlock(); emitCall(); b.endBlock() }
            }
            else -> throw NotImplementedError("not implemented: "+i.instruction)
        }
    }
}
