package main.bytecode

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.bytecode.BytecodeConfig
import com.oracle.truffle.api.bytecode.BytecodeLabel
import com.oracle.truffle.api.bytecode.BytecodeLocal
import main.Clr
import metadata.CodeBoundary
import metadata.IlMethod
import metadata.IlType
import metadata.instruction.*
import nodes.expressions.CompareCondition
import runtime.ClrContext
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
    private lateinit var arguments: List<BytecodeLocal?>
    private val mutableArguments by lazy { addressedArguments + code.filter { it.instruction == "starg" }.map { number(it, true) } }
    private val addressedLocals by lazy { code.filter { it.instruction == "ldloca" }.map { number(it) }.toSet() }
    private val addressedArguments by lazy { code.filter { it.instruction == "ldarga" }.map { number(it, true) }.toSet() }
    private val argumentTypes by lazy {
        val receiver = if (method.static) emptyList() else {
            val owner = method.memberOf!!
            listOf(if (context.types.getValue(owner.fullName).isValueType) owner.makeByRef() else owner)
        }
        receiver + method.arguments.map { it.second }
    }
    // isBoolean proves a Boolean-local load; comparison instructions always push int32.
    private class Value(var emit: () -> Unit, val isBoolean: Boolean, var materialized: Boolean = false)
    private val stack = mutableListOf<Value>()
    private var pendingOperations = 0

    private val terminals = setOf("ret", "throw", "rethrow", "endfinally", "endfault", "endfilter")
    private fun position(boundary: CodeBoundary): Int = when (boundary) {
        is CodeBoundary.Index -> boundary.instruction
        is CodeBoundary.Label -> method.labels.getValue(boundary.name)
        is CodeBoundary.Offset -> method.instructionOffsets[boundary.bytes]
            ?: error("Exception offset "+boundary.bytes+" is not an instruction boundary in $method")
    }
    private fun target(i: InstructionBrTarget) = method.labels.getValue(i.target)
    private fun blocks(): List<Block> {
        val starts = sortedSetOf(0)
        for (clause in method.exceptionClauses) {
            listOfNotNull(clause.tryStart, clause.tryEnd, clause.handlerStart, clause.handlerEnd, clause.filterStart)
                .map(::position).filter { it < code.size }.forEach { starts.add(it) }
        }
        code.forEachIndexed { index, i ->
            if (i is InstructionBrTarget) starts.add(target(i))
            if ((i is InstructionBrTarget || i.instruction in terminals) && index + 1 < code.size) starts.add(index + 1)
        }
        val orderedStarts = starts.toList()
        return orderedStarts.mapIndexed { n, start ->
            val end = orderedStarts.getOrNull(n + 1) ?: code.size
            val last = code[end - 1]
            val successors = when {
                last is InstructionBrTarget && last.instruction in listOf("br", "leave") -> listOf(target(last))
                last is InstructionBrTarget -> listOf(target(last), end)
                last.instruction in terminals -> emptyList()
                else -> listOf(end)
            }
            Block(start, end, successors.distinct())
        }
    }

    private fun effect(i: Instruction): Pair<Int, Int> = when (i.instruction) {
        "nop", "break", "br", "readonly", "constrained", "leave", "rethrow", "endfinally", "endfault" -> 0 to 0
        "throw", "endfilter" -> 1 to 0
        "dup" -> 1 to 2
        "pop", "stloc", "starg", "stsfld", "initobj", "brtrue", "brfalse" -> 1 to 0
        "ret" -> (if (method.returnType.type == CorElementType.VOID) 0 else 1) to 0
        "ldarg", "ldarga", "ldloc", "ldloca", "ldnull", "ldc", "ldstr", "ldsfld", "ldsflda" -> 0 to 1
        "add", "sub", "mul", "div", "rem", "and", "or", "xor", "shl", "shr", "ceq", "clt", "cgt", "ldelem", "ldelema" -> 2 to 1
        "neg", "newarr", "isinst", "unbox", "ldind", "ldobj", "ldfld", "ldflda", "ldlen", "box", "conv", "castclass" -> 1 to 1
        "stfld", "stind", "stobj", "cpobj", "beq", "bne", "bge", "bgt", "ble", "blt" -> 2 to 0
        "stelem" -> 3 to 0
        "localloc" -> throw UnsupportedOperationException("localloc: unmanaged stack allocation is unsupported")
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
        code.forEachIndexed { index, instruction ->
            if (instruction.instruction == "constrained") require(
                instruction is InstructionType && code.getOrNull(index + 1)?.instruction == "callvirt"
            ) { "constrained. must immediately precede callvirt in $method at $index" }
        }
        val blocks = blocks()
        val byStart = blocks.associateBy { it.start }
        val heights = mutableMapOf(0 to 0)
        // Validate and emit every EH body, including dormant protected ranges.
        for (clause in method.exceptionClauses) {
            heights[position(clause.tryStart)] = 0
            heights[position(clause.handlerStart)] = if (clause.kind in listOf("catch", "filter")) 1 else 0
            clause.filterStart?.let { heights[position(it)] = 1 }
        }
        val queue = ArrayDeque<Int>().apply { addAll(heights.keys) }
        var maxStack = heights.values.max()
        while (queue.isNotEmpty()) {
            val block = byStart.getValue(queue.removeFirst())
            var height = heights.getValue(block.start)
            for (index in block.start until block.end) {
                val (pop, push) = effect(code[index])
                require(height >= pop) { "Stack underflow in $method at $index" }
                height = if (code[index].instruction == "leave") 0 else height + push - pop
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
        val groups = method.exceptionClauses.groupBy { position(it.tryStart) to position(it.tryEnd) }.values.toList()
        fun instructionRanges(clauses: List<metadata.ExceptionClause>): List<IntRange> =
            listOf(position(clauses.first().tryStart) until position(clauses.first().tryEnd)) +
                clauses.map { position(it.filterStart ?: it.handlerStart) until position(it.handlerEnd) }
        val reachable = mutableListOf<Block>()
        // Canonicalize physical EH layout only; successors retain their original targets.
        // Raw tables may put handlers before their try or leave ordinary code between clauses.
        fun layout(first: Int, end: Int, enclosing: Set<List<metadata.ExceptionClause>>) {
            val candidates = groups.filter { it !in enclosing && instructionRanges(it).all { range -> range.first >= first && range.last < end } }
            var index = first
            while (index < end) {
                val handler = candidates.flatMap { instructionRanges(it).drop(1) }.firstOrNull { index in it }
                if (handler != null) { index = handler.last + 1; continue }
                val group = candidates.filter { position(it.first().tryStart) == index }.maxByOrNull { position(it.first().tryEnd) }
                if (group != null) {
                    for (range in instructionRanges(group)) layout(range.first, range.last + 1, enclosing + listOf(group))
                    index = position(group.first().tryEnd)
                } else {
                    val block = byStart.getValue(index)
                    if (index in heights) reachable.add(block)
                    index = block.end
                }
            }
        }
        layout(0, code.size, emptySet())
        require(reachable.map { it.start }.toSet() == heights.keys) { "Overlapping exception regions in $method" }
        fun blockRange(start: CodeBoundary, end: CodeBoundary): IntRange {
            val members = reachable.indices.filter { reachable[it].start in position(start) until position(end) }
            return members.min()..members.max()
        }
        // Nest loop intervals, expanding side entries so every generated While is
        // single-entry. Crossing intervals are merged (irreducible flow fallback).
        data class Region(var first: Int, var last: Int, val clauses: List<metadata.ExceptionClause> = emptyList())
        val indices = reachable.mapIndexed { index, block -> block.start to index }.toMap()
        val edges = reachable.flatMap { block -> block.successors.map { indices.getValue(block.start) to indices.getValue(it) } }
        val exceptionRegions = groups.map { clauses ->
            val first = blockRange(clauses.first().tryStart, clauses.first().tryEnd).first
            val last = clauses.maxOf { blockRange(it.handlerStart, it.handlerEnd).last }
            Region(first, last, clauses)
        }
        val regions = edges.filter { (from, to) -> to <= from }.groupBy { it.second }
            .map { (to, incoming) -> Region(to, incoming.maxOf { it.first }) }.toMutableList()
        var changed: Boolean
        do {
            changed = false
            for (region in regions) {
                for (exception in exceptionRegions) {
                    val overlaps = region.first <= exception.last && exception.first <= region.last
                    val contains = region.first <= exception.first && region.last >= exception.last
                    val parts = listOf(blockRange(exception.clauses.first().tryStart, exception.clauses.first().tryEnd)) +
                        exception.clauses.map { blockRange(it.filterStart ?: it.handlerStart, it.handlerEnd) }
                    if (overlaps && !contains && parts.none { region.first >= it.first && region.last <= it.last }) {
                        region.first = minOf(region.first, exception.first)
                        region.last = maxOf(region.last, exception.last)
                        changed = true
                    }
                }
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
        regions.addAll(exceptionRegions)
        val roots = CilRootNodeGen.create(language, BytecodeConfig.DEFAULT) { builder ->
            b = builder
            b.beginRoot()
            val owner = context.types.getValue(method.memberOf!!.fullName)
            if (method.name != ".cctor" && owner.initializer != null &&
                (method.static || method.name == ".ctor" || "beforefieldinit" in method.memberOf!!.attribtes)) {
                b.emitInitializeType(owner)
            }
            locals = method.locals.map { b.createLocal() }
            carry = List(maxStack) { b.createLocal() }
            locals.forEachIndexed { index, local -> store(local) {
                if (index in addressedLocals) b.beginCellNew(context.types[method.locals[index].fullName] ?: context.types.getValue("System.Object"))
                emitDefault(method.locals[index])
                if (index in addressedLocals) b.endCellNew()
            } }
            arguments = argumentTypes.mapIndexed { index, type -> if (index !in mutableArguments) null else b.createLocal().also { local -> store(local) {
                if (index in addressedArguments) b.beginCellNew(context.types[type.fullName] ?: context.types.getValue("System.Object"))
                if (index != 0 || method.static) copy(type) { b.emitLoadArgument(index) } else b.emitLoadArgument(index)
                if (index in addressedArguments) b.endCellNew()
            } } }
            class Scope(val region: Region?, val parent: Scope?) {
                val labels = mutableMapOf<Int, BytecodeLabel>()
                var exception: BytecodeLocal? = parent?.exception
                var finish: BytecodeLabel? = parent?.finish
                var filterResult: BytecodeLocal? = parent?.filterResult
                var pc: BytecodeLocal? = null
                var continueLabel: BytecodeLabel? = null
                fun label(index: Int): BytecodeLabel = labels[index] ?: checkNotNull(parent).label(index)
            }
            fun edge(from: Int, next: Int, scope: Scope) {
                if (next <= from) {
                    var loop = scope
                    while (loop.pc == null || next < loop.region!!.first || from > loop.region!!.last) loop = checkNotNull(loop.parent)
                    store(checkNotNull(loop.pc)) { b.emitLoadConstant(next) }
                    b.emitBranch(checkNotNull(loop.continueLabel))
                } else b.emitBranch(scope.label(next))
            }
            fun emitRange(first: Int, last: Int, scope: Scope) {
                val ancestors = generateSequence(scope) { it.parent }.mapNotNull { it.region }.toSet()
                val candidates = regions.filter { it !in ancestors && it.first >= first && it.last <= last }
                val children = candidates.filter { child -> candidates.none { other ->
                    other !== child && other.first <= child.first && other.last >= child.last &&
                        (other.first < child.first || other.last > child.last || other.clauses.isEmpty())
                } }.associateBy { it.first }
                var index = first
                while (index <= last) {
                    scope.labels.getOrPut(index) { b.createLabel() }
                    index = children[index]?.let { it.last + 1 } ?: (index + 1)
                }
                if (scope.pc != null) {
                    scope.continueLabel = b.createLabel()
                    val destinations = edges.filter { (from, to) -> to <= from && from in first..last && to in first..last }
                        .filter { (from, to) -> children.values.none { to >= it.first && from <= it.last } }.map { it.second }.distinct()
                    for (destination in destinations.filter { it != first }) {
                        b.beginIfThen()
                        b.beginTruth()
                        b.beginCmp(CompareCondition.EQ, false); b.emitLoadLocal(scope.pc!!); b.emitLoadConstant(destination); b.endCmp()
                        b.endTruth()
                        b.emitBranch(scope.label(destination)); b.endIfThen()
                    }
                }
                index = first
                while (index <= last) {
                    b.emitLabel(scope.labels.getValue(index))
                    val child = children[index]
                    if (child != null) {
                        val inner = Scope(child, scope)
                        if (child.clauses.isEmpty()) {
                            inner.pc = b.createLocal()
                            store(inner.pc!!) { b.emitLoadConstant(child.first) }
                            b.beginWhile(); b.emitLoadConstant(true); b.beginBlock()
                            emitRange(child.first, child.last, inner)
                            b.emitLabel(inner.continueLabel!!)
                            b.endBlock(); b.endWhile()
                        } else {
                            val clauses = child.clauses
                            val firstClause = clauses.first()
                            fun part(start: CodeBoundary, end: CodeBoundary, partScope: Scope) {
                                b.beginBlock()
                                val range = blockRange(start, end)
                                emitRange(range.first, range.last, partScope)
                                b.endBlock()
                            }
                            if (firstClause.kind == "finally") {
                                require(clauses.size == 1)
                                b.beginTryFinally {
                                    val saved = stack.toList()
                                    val operations = pendingOperations
                                    val handler = Scope(child, scope)
                                    b.beginBlock()
                                    handler.finish = b.createLabel()
                                    part(firstClause.handlerStart, firstClause.handlerEnd, handler)
                                    b.emitLabel(handler.finish!!)
                                    b.endBlock()
                                    stack.clear(); stack.addAll(saved); pendingOperations = operations
                                }
                                part(firstClause.tryStart, firstClause.tryEnd, Scope(child, inner))
                                b.endTryFinally()
                            } else {
                                b.beginTryCatch()
                                part(firstClause.tryStart, firstClause.tryEnd, Scope(child, inner))
                                b.beginBlock()
                                inner.exception = b.createLocal()
                                store(inner.exception!!) { b.emitLoadException() }
                                val done = b.createLabel()
                                for (clause in clauses) {
                                    val handler = Scope(child, inner)
                                    if (clause.kind == "fault") {
                                        handler.finish = b.createLabel()
                                        part(clause.handlerStart, clause.handlerEnd, handler)
                                        b.emitLabel(handler.finish!!)
                                        continue
                                    }
                                    b.beginIfThen()
                                    if (clause.kind == "filter") {
                                        b.beginBlock()
                                        val result = b.createLocal()
                                        store(result) { b.emitLoadConstant(0) }
                                        // Filters are evaluated after inner frames unwind (one-pass semantics).
                                        b.beginTryCatch()
                                        b.beginBlock()
                                        val filter = Scope(child, inner)
                                        filter.finish = b.createLabel(); filter.filterResult = result
                                        store(carry[0]) { b.beginExceptionObject(); b.emitLoadLocal(inner.exception!!); b.endExceptionObject() }
                                        part(clause.filterStart!!, clause.handlerStart, filter)
                                        b.emitLabel(filter.finish!!)
                                        b.endBlock()
                                        b.beginBlock(); b.endBlock() // A throwing filter is false.
                                        b.endTryCatch()
                                        b.beginTruth(); b.emitLoadLocal(result); b.endTruth()
                                        b.endBlock()
                                    } else {
                                        b.beginExceptionMatches(context.types.getValue(clause.catchType!!))
                                        b.emitLoadLocal(inner.exception!!); b.endExceptionMatches()
                                    }
                                    b.beginBlock()
                                    store(carry[0]) { b.beginExceptionObject(); b.emitLoadLocal(inner.exception!!); b.endExceptionObject() }
                                    part(clause.handlerStart, clause.handlerEnd, handler)
                                    b.emitBranch(done)
                                    b.endBlock(); b.endIfThen()
                                }
                                b.beginRaise(); b.emitLoadLocal(inner.exception!!); b.endRaise()
                                b.emitLabel(done)
                                b.endBlock(); b.endTryCatch()
                            }
                        }
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
                                    "br", "leave" -> null
                                    "brtrue", "brfalse" -> pop()
                                    else -> {
                                        val right = pop(); val left = pop()
                                        push { b.beginCmp(condition(i.instruction), "un" in i.instructionArgs); load(left, right); b.endCmp() }
                                        pop()
                                    }
                                }
                                if (i.instruction == "leave") { materialize(); stack.clear() }
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
                            i.instruction == "throw" -> {
                                val value = pop(); materialize()
                                b.beginRaise(); b.beginGuestException(); load(value); b.endGuestException(); b.endRaise()
                            }
                            i.instruction == "rethrow" -> {
                                b.beginRaise(); b.emitLoadLocal(checkNotNull(scope.exception)); b.endRaise()
                            }
                            i.instruction in listOf("endfinally", "endfault", "endfilter") -> {
                                if (i.instruction == "endfilter") store(checkNotNull(scope.filterResult)) { load(pop()) }
                                b.emitBranch(checkNotNull(scope.finish))
                            }
                            i.instruction == "ret" -> {
                                b.beginReturn()
                                if (method.returnType.type == CorElementType.VOID) b.emitLoadConstant(0) else load(pop())
                                b.endReturn()
                            }
                            else -> emit(i, instructionIndex)
                        }
                    }
                    val tail = code[block.end - 1]
                    if (tail !is InstructionBrTarget && tail.instruction !in terminals) {
                        spill(); edge(index, indices.getValue(block.successors.single()), scope)
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
    private fun copy(type: IlType, emit: () -> Unit) {
        if (type.isByRef || context.types[type.fullName]?.isValueType != true) emit()
        else { b.beginCopyValue(context.types.getValue(type.fullName)); emit(); b.endCopyValue() }
    }
    private fun emitDefault(type: IlType) {
        val runtimeType = context.types[type.fullName]
        if (!type.isByRef && runtimeType?.isValueType == true) b.emitDefaultValue(runtimeType)
        else b.emitLoadConstant(defaultValue(type))
    }
    private fun defaultValue(type: IlType): Any = if (!type.isPrimiteive) CTSNull else when (type.type) {
        CorElementType.BOOLEAN -> false
        CorElementType.I1, CorElementType.U1, CorElementType.I2, CorElementType.U2,
        CorElementType.CHAR, CorElementType.I4, CorElementType.U4 -> 0
        CorElementType.I8, CorElementType.U8 -> 0L
        CorElementType.R4 -> 0.0f
        CorElementType.R8 -> 0.0
        else -> error("Unknown local type encountered: "+type.type)
    }

    private fun typeTest(name: String, checked: Boolean, value: Value) {
        if (name.endsWith("[]")) {
            val element = context.types.getValue(name.removeSuffix("[]"))
            push { b.beginArrayTypeTest(element, checked); load(value); b.endArrayTypeTest() }
        } else {
            val type = context.types.getValue(name)
            push { b.beginTypeTest(type, checked); load(value); b.endTypeTest() }
        }
    }

    private fun narrowConversion(i: Instruction): String? = when {
        i is InstructionType && i.type == "System.SByte" -> "i1"
        i is InstructionType && i.type == "System.Int16" -> "i2"
        i is InstructionType && i.type == "System.Byte" -> "u1"
        i is InstructionType && (i.type == "System.UInt16" || i.type == "System.Char") -> "u2"
        i.instructionArgs.firstOrNull() in listOf("u1", "u2") -> i.instructionArgs.first()
        else -> null
    }

    private fun emit(i: Instruction, instructionIndex: Int) {
        when (i.instruction) {
            "nop", "break", "readonly", "constrained" -> Unit
            "dup" -> { materialize(); stack.add(stack.last()) }
            "pop" -> { materialize(); pop() }
            "ldarga" -> push { b.emitLoadLocal(arguments[number(i, true)]!!) }
            "ldloca" -> push { b.emitLoadLocal(locals[number(i)]) }
            "ldarg", "ldloc" -> {
                val argument = i.instruction == "ldarg"
                val index = number(i, argument)
                val type = if (argument) argumentTypes[index] else method.locals[index]
                val local = if (argument) arguments[index] else locals[index]
                val addressed = index in if (argument) addressedArguments else addressedLocals
                val emitLoad = { if (local == null) b.emitLoadArgument(index) else b.emitLoadLocal(local) }
                push(!argument && !addressed && type.type == CorElementType.BOOLEAN) {
                    if (addressed) { b.beginReferenceLoad(); emitLoad(); b.endReferenceLoad() }
                    else if (argument && index == 0 && !method.static) emitLoad()
                    else copy(type, emitLoad)
                }
            }
            "stloc", "starg" -> {
                val argument = i.instruction == "starg"
                val value = pop()
                val index = number(i, argument)
                val type = if (argument) argumentTypes[index] else method.locals[index]
                val local = if (argument) arguments[index]!! else locals[index]
                materialize()
                if (index in if (argument) addressedArguments else addressedLocals) {
                    b.beginReferenceStore(); b.emitLoadLocal(local); load(value); b.endReferenceStore()
                } else store(local) {
                    if (type.type == CorElementType.BOOLEAN && !value.isBoolean) {
                        b.beginTruth(); load(value); b.endTruth()
                    } else copy(type) { load(value) }
                }
            }
            "ldnull" -> push { b.emitLoadConstant(CTSNull) }
            "ldstr" -> push { b.emitLoadConstant((i as InstructionString).content.drop(1).dropLast(1).intern()) }
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
                    "div" -> { b.beginDiv("un" in i.instructionArgs); load(left, right); b.endDiv() }
                    "rem" -> { b.beginRem("un" in i.instructionArgs); load(left, right); b.endRem() }
                    "and" -> { b.beginAnd(); load(left, right); b.endAnd() }
                    "or" -> { b.beginOr(); load(left, right); b.endOr() }
                    "xor" -> { b.beginXor(); load(left, right); b.endXor() }
                    "shl" -> { b.beginShl(); load(left, right); b.endShl() }
                    "shr" -> { b.beginShr("un" in i.instructionArgs); load(left, right); b.endShr() }
                } }
            }
            "neg" -> { val v = pop(); push { b.beginNeg(); load(v); b.endNeg() } }
            "ceq", "clt", "cgt" -> { val right = pop(); val left = pop(); push { b.beginCmp(condition(i.instruction), "un" in i.instructionArgs); load(left, right); b.endCmp() } }
            "conv" -> {
                require("ovf" !in i.instructionArgs) { "Checked conversion is unsupported: $i" }
                val value = pop(); push { b.beginConvert(i.instructionArgs.first()); load(value); b.endConvert() }
            }
            "castclass", "isinst" -> typeTest((i as InstructionType).type, i.instruction == "castclass", pop())
            "unbox" -> {
                val name = (i as InstructionType).type
                val value = pop()
                val type = context.types[name]
                if ("any" in i.instructionArgs && (name.endsWith("[]") || type != null && !type.isValueType && !type.isEnum && !type.info.isPrimitive)) {
                    typeTest(name, true, value)
                } else {
                    requireNotNull(type) { "Unknown unbox type: $name" }
                    push { b.beginUnbox(type, "any" in i.instructionArgs); load(value); b.endUnbox() }
                }
            }
            "ldind", "ldobj" -> {
                val value = pop()
                val conversion = if (i.instruction == "ldind") i.instructionArgs.first() else narrowConversion(i)
                push {
                    if (conversion != null) b.beginConvert(conversion)
                    b.beginReferenceLoad(); load(value); b.endReferenceLoad()
                    if (conversion != null) b.endConvert()
                }
            }
            "stind", "stobj", "cpobj" -> {
                val value = pop(); val reference = pop(); materialize()
                b.beginReferenceStore(); load(reference)
                if (i.instruction == "cpobj") { b.beginReferenceLoad(); load(value); b.endReferenceLoad() }
                else if (i.instruction == "stind") { b.beginConvert(i.instructionArgs.first()); load(value); b.endConvert() }
                else if (narrowConversion(i) != null) { b.beginConvert(narrowConversion(i)!!); load(value); b.endConvert() }
                else load(value)
                b.endReferenceStore()
            }
            "initobj" -> {
                val reference = pop(); materialize()
                val name = (i as InstructionType).type
                val type = context.types.getValue(if (name.endsWith("[]")) "System.Array" else name)
                b.beginReferenceStore(); load(reference)
                if (type.isValueType) b.emitDefaultValue(type) else b.emitLoadConstant(when (type.info.type) {
                    CorElementType.I8, CorElementType.U8 -> 0L
                    CorElementType.R4 -> 0.0f
                    CorElementType.R8 -> 0.0
                    CorElementType.CLASS, CorElementType.OBJECT, CorElementType.STRING -> CTSNull
                    else -> 0
                })
                b.endReferenceStore()
            }
            "box" -> {
                val name = (i as InstructionType).type
                if (!name.endsWith("[]")) {
                    val type = context.types.getValue(name)
                    // The operand type is known here; keep lazy Type.info lookup out of guest execution.
                    if (type.isValueType || type.isEnum || type.info.isPrimitive) {
                        val value = pop()
                        push { b.beginBox(type); load(value); b.endBox() }
                    }
                }
            }
            "newarr" -> { val size = pop(); val type = context.types.getValue((i as InstructionType).type)
                push {
                    if (type.isValueType || (!type.info.isPrimitive && type.name != "System.Object" && type.name != "System.String")) { b.beginObjectArrayNew(type); load(size); b.endObjectArrayNew() }
                    else { b.beginArrayNew(type.info.type); load(size); b.endArrayNew() }
                } }
            "ldlen" -> { val v = pop(); push { b.beginArrayLength(); load(v); b.endArrayLength() } }
            "ldelem", "ldelema" -> {
                val index = pop(); val array = pop()
                val conversion = narrowConversion(i)
                push {
                    if (i.instruction == "ldelema") { b.beginArrayAddress(context.types.getValue((i as InstructionType).type), instructionIndex > 0 && code[instructionIndex - 1].instruction == "readonly"); load(array, index); b.endArrayAddress() }
                    else {
                        if (conversion != null) b.beginConvert(conversion)
                        b.beginArrayLoad(); load(array, index); b.endArrayLoad()
                        if (conversion != null) b.endConvert()
                    }
                }
            }
            "stelem" -> {
                val value = pop(); val index = pop(); val array = pop()
                materialize()
                b.beginArrayStore(); load(array, index, value); b.endArrayStore()
            }
            "ldflda" -> {
                i as InstructionField
                val field = context.types.getValue(i.member).resolveField(i.name)
                val receiver = pop()
                if (field.metadata.static) {
                    materialize(); b.beginBlock(); load(receiver); b.endBlock()
                    push { b.emitStaticAddress(field) }
                }
                else push { b.beginFieldAddress(field); load(receiver); b.endFieldAddress() }
            }
            "ldsflda" -> {
                i as InstructionField
                val field = context.types.getValue(i.member).resolveField(i.name)
                require(field.metadata.static) { "Not a static field: $i" }
                push { b.emitStaticAddress(field) }
            }
            "ldfld", "stfld" -> {
                i as InstructionField
                val field = context.types.getValue(i.member).resolveField(i.name)
                if (field.metadata.static) {
                    // Materialize both operands in order: the ignored receiver may have effects.
                    materialize()
                    if (i.instruction == "ldfld") {
                        pop()
                        push { b.emitStaticLoad(field) }
                    } else {
                        val value = pop(); pop()
                        b.beginStaticStore(field); load(value); b.endStaticStore()
                    }
                    return
                }
                if (field.owner.isValueType) {
                    if (i.instruction == "ldfld") {
                        val receiver = pop(); push { b.beginStructFieldLoad(field); load(receiver); b.endStructFieldLoad() }
                    } else {
                        val value = pop(); val receiver = pop(); materialize()
                        b.beginStructFieldStore(field); load(receiver, value); b.endStructFieldStore()
                    }
                    return
                }
                if (i.instruction == "ldfld") { val receiver = pop(); push {
                    when (field.storageType) {
                        Int::class.javaPrimitiveType -> { b.beginFieldLoadInt(field); load(receiver); b.endFieldLoadInt() }
                        Double::class.javaPrimitiveType -> { b.beginFieldLoadDouble(field); load(receiver); b.endFieldLoadDouble() }
                        else -> { b.beginFieldLoad(field); load(receiver); b.endFieldLoad() }
                    }
                } }
                else { val value = pop(); val receiver = pop(); materialize(); b.beginFieldStore(field); load(receiver, value); b.endFieldStore() }
            }
            "ldsfld", "stsfld" -> {
                i as InstructionField
                val field = context.types.getValue(i.member).resolveField(i.name)
                require(field.metadata.static) { "Not a static field: $i" }
                if (i.instruction == "ldsfld") push { b.emitStaticLoad(field) }
                else { val value = pop(); materialize(); b.beginStaticStore(field); load(value); b.endStaticStore() }
            }
            "call", "callvirt", "newobj" -> {
                val callee = (i as InstructionMethod).method
                val constructor = i.instruction == "newobj"
                val args = List(callee.arguments.size + if (!constructor && !callee.static) 1 else 0) { pop() }.reversed()
                val type = context.types.getValue(callee.memberOf!!.fullName)
                val emitCall = {
                    when (i.instruction) {
                        "callvirt" -> {
                            require(!callee.static)
                            val target = type.members.getValue(callee.key()) as Method
                            val prefix = code.getOrNull(instructionIndex - 1)
                                ?.takeIf { it.instruction == "constrained" } as? InstructionType
                            val constraint = prefix?.let { context.types.getValue(if (it.type.endsWith("[]")) "System.Array" else it.type) }
                            val valueReceiver = constraint != null &&
                                (constraint.isValueType || constraint.isEnum || constraint.info.isPrimitive)
                            val implementation = if (valueReceiver) constraint!!.resolveDispatch(target) else null
                            val unboxed = implementation?.metadata?.memberOf?.fullName == constraint?.name && valueReceiver
                            fun emitArguments() {
                                args.forEachIndexed { index, value ->
                                    if (index == 0 && constraint != null && !unboxed) {
                                        b.beginConstrainedReceiver(constraint)
                                        load(value)
                                        b.endConstrainedReceiver()
                                    } else load(value)
                                }
                            }
                            when {
                                unboxed -> {
                                    b.beginInvokeNonVirtual(implementation!!); emitArguments(); b.endInvokeNonVirtual()
                                }
                                type.isInterface -> {
                                    b.beginInvokeInterface(target); emitArguments(); b.endInvokeInterface()
                                }
                                target.virtualSlot >= 0 -> {
                                    b.beginInvokeVirtual(target.virtualSlot); emitArguments(); b.endInvokeVirtual()
                                }
                                else -> {
                                    b.beginInvokeNonVirtual(target); emitArguments(); b.endInvokeNonVirtual()
                                }
                            }
                        }
                        "newobj" -> { b.beginObjectNew(type, type.members.getValue(callee.key()) as Method, args.size); args.forEach { load(it) }; b.endObjectNew() }
                        else -> { val target = type.members.getValue(callee.key()) as Method
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
