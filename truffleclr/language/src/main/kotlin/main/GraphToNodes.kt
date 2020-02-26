package main

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.frame.FrameSlotKind
import nodes.*
import nodes.controlflow.*
import nodes.expressions.*
import nodes.expressions.`object`.*
import nodes.expressions.array.*
import nodes.expressions.math.*
import nodes.statements.*
import metadata.instruction.*
import runtime.CorElementType
import runtime.Method
import java.util.*

@Suppress("UNREACHABLE_CODE")
@CompilerDirectives.TruffleBoundary
fun Graph.getNodes(root: Int, language: TruffleLanguage<*>, d: Int = 0): Block {
    val stack = Stack<Pair<String, ExpressionNode>>()
    val res = mutableListOf<StatementNode>()
    var block = nodes[root]
    val context = (language as Clr).tmp

    if (compileNode.compiled.contains(root)) {
        return compileNode.compiled.getValue(root)
    }

    val result = Block(root, nodes[root].label)
    compileNode.compiled[root] = result

    if (block.stolen == 1) {
        return result
    }

    do {
        for ((index, instruction) in block.instructions.withIndex()) {
            instruction.let {
                if (it.instruction == "nop" && it is InstructionNone) {

                }
                if (it.instruction == "dup" && it is InstructionNone) {
                    val s0 = stack.pop()

                    val slot = compileNode.genDupSlot(
                        if (s0.first == "System.Int32") {
                            FrameSlotKind.Int
                        } else {
                            FrameSlotKind.Object
                        }
                    )


                    res.add(StoreLocalNodeGen.create(s0.second, slot))
                    stack.push(Pair(s0.first, LoadLocalNodeGen.create(slot)))
                    stack.push(Pair(s0.first, LoadLocalNodeGen.create(slot)))
                }
                if (it.instruction == "pop" && it is InstructionNone) {
                    val s0 = stack.pop()
                    res.add(s0.second)
                }
                if (it.instruction == "jmp" && it is InstructionMethod) {
                    TODO("not implemented")

                    // val node = null
// res.add(node)
                }
                if (it.instruction == "ret" && it is InstructionNone) {
                    val node = if (compileNode.method.returnType.type == CorElementType.VOID) {
                        Return()
                    } else {
                        val s0 = stack.pop()
                        ReturnValue(s0.second)
                    }
                    node.successors = intArrayOf()

                    res.add(node)
                }
                if (it.instruction == "switch" && it is InstructionSwitch) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "System.Int32") {
                        error("")
                    }

                    // val node = null
// res.add(node)
                }
                if (it.instruction == "add" && it is InstructionNone) {
                    val s0 = stack.pop()
                    val s1 = stack.pop()
                    val node = AddNodeGen.create(s1.second, s0.second)
                    stack.push(Pair(s0.first, node))
                }
                if (it.instruction == "sub" && it is InstructionNone) {
                    val s0 = stack.pop()
                    val s1 = stack.pop()
                    val node = SubtractNodeGen.create(s1.second, s0.second)
                    stack.push(Pair(s0.first, node))
                }
                if (it.instruction == "mul" && it is InstructionNone) {
                    val s0 = stack.pop()
                    val s1 = stack.pop()
                    val node = MultiplyNodeGen.create(s1.second, s0.second)
                    stack.push(Pair(s0.first, node))
                }
                if (it.instruction == "div" && it is InstructionNone) {
                    val s0 = stack.pop()
                    val s1 = stack.pop()
                    val node = DivideNodeGen.create(s1.second, s0.second)
                    stack.push(Pair(s0.first, node))
                }
                if (it.instruction == "rem" && it is InstructionNone) {
                    val s0 = stack.pop()
                    val s1 = stack.pop()
                    val node = ReminderNodeGen.create(s1.second, s0.second)
                    stack.push(Pair(s0.first, node))
                }
                if (it.instruction == "and" && it is InstructionNone) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    val s1 = stack.pop()
                    //val node = null
                    //stack.push(Pair(s0.first, node))
                }
                if (it.instruction == "or" && it is InstructionNone) {
                    val s0 = stack.pop()
                    val s1 = stack.pop()
                    val node = OrNodeGen.create(s1.second, s0.second)
                    stack.push(Pair(s0.first, node))
                }
                if (it.instruction == "xor" && it is InstructionNone) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    val s1 = stack.pop()
                    //val node = null
                    //stack.push(Pair(s0.first, node))
                }
                if (it.instruction == "shl" && it is InstructionNone) {
                    val s0 = stack.pop()
                    val s1 = stack.pop()
                    val node = ShiftLeftNodeGen.create(s1.second, s0.second)
                    stack.push(Pair(s0.first, node))
                }
                if (it.instruction == "shr" && it is InstructionNone) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    val s1 = stack.pop()
                    //val node = null
                    //stack.push(Pair(s0.first, node))
                }
                if (it.instruction == "shr.un" && it is InstructionNone) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    val s1 = stack.pop()
                    //val node = null
                    //stack.push(Pair(s0.first, node))
                }
                if (it.instruction == "neg" && it is InstructionNone) {
                    val s0 = stack.pop()
                    val node = NegativeNodeGen.create(s0.second)
                    stack.push(Pair(s0.first, node))
                }
                if (it.instruction == "not" && it is InstructionNone) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    //val node = null
                    //stack.push(Pair(s0.first, node))
                }
                if (it.instruction == "newobj" && it is InstructionMethod) {
                    val args = it.method.arguments.map { stack.pop() }

                    val type = context.types.getValue(it.method.memberOf!!.fullName)
                    val ctor = type.members.getValue(
                        it.method.toString()
                    )

                    val node = NewObject(args.map { it.second }.toTypedArray(), ctor, type.shape)
                    stack.push(Pair("Ref", node))
                }
                if (it.instruction == "isinst" && it is InstructionType) {
                    val s0 = stack.pop()
//                if (s0.first != "Ref") {
//                    error("")
//                }
                    val node = IsInstance(s0.second)
                    stack.push(Pair("System.Int32", node))
                }
                if (it.instruction == "unbox" && it is InstructionType) {
                    val s0 = stack.pop()
//                if (s0.first != "Ref") {
//                    error("")
//                }
                    val node = Unbox(s0.second)
                    stack.push(Pair(s0.first, node))
                }
                if (it.instruction == "throw" && it is InstructionNone) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "Ref") {
                        error("")
                    }
                    // val node = null
// res.add(node)
                }
                if (it.instruction == "newarr" && it is InstructionType) {
                    val s0 = stack.pop()
                    if (s0.first != "System.Int32") {
                        error("")
                    }
                    //TODO: fix types for array creation
                    val type = context.types.getValue(it.type).info.type
                    val node = NewArrayNodeGen.create(type, s0.second)
                    stack.push(Pair("Ref", node))
                }
                if (it.instruction == "refanyval" && it is InstructionType) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    //val node = null
                    //stack.push(Pair("System.Int32", node))
                }
                if (it.instruction == "mkrefany" && it is InstructionType) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "System.Int32") {
                        error("")
                    }
                    //val node = null
                    //stack.push(Pair(s0.first, node))
                }
                if (it.instruction == "endfinally" && it is InstructionNone) {
                    TODO("not implemented")
                    // val node = null
// res.add(node)
                }
                if (it.instruction == "leave" && it is InstructionBrTarget) {
                    TODO("not implemented")
                    // val node = null
// res.add(node)
                }
                if (it.instruction == "leave.s" && it is InstructionBrTarget) {
                    TODO("not implemented")
                    // val node = null
// res.add(node)
                }
                if (it.instruction == "arglist" && it is InstructionNone) {
                    TODO("not implemented")
                    //val node = null
                    //stack.push(Pair("System.Int32", node))
                }
                if (it.instruction == "localloc" && it is InstructionNone) {
                    TODO("not implemented")
                    // val node = null
// res.add(node)
                }
                if (it.instruction == "endfilter" && it is InstructionNone) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "System.Int32") {
                        error("")
                    }
                    // val node = null
// res.add(node)
                }
                if (it.instruction == "unaligned." && it is InstructionI) {
                    TODO("not implemented")
                    // val node = null
// res.add(node)
                }
                if (it.instruction == "volatile." && it is InstructionNone) {
                    TODO("not implemented")
                    // val node = null
// res.add(node)
                }
                if (it.instruction == "tail." && it is InstructionNone) {
                    TODO("not implemented")
                    // val node = null
// res.add(node)
                }
                if (it.instruction == "initobj" && it is InstructionType) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "System.Int32") {
                        error("")
                    }
                    // val node = null
// res.add(node)
                }
                if (it.instruction == "initblk" && it is InstructionNone) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "System.Int32") {
                        error("")
                    }
                    val s1 = stack.pop()
                    if (s1.first != "System.Int32") {
                        error("")
                    }
                    val s2 = stack.pop()
                    if (s2.first != "System.Int32") {
                        error("")
                    }
                    // val node = null
// res.add(node)
                }
                if (it.instruction == "rethrow" && it is InstructionNone) {
                    TODO("not implemented")
                    // val node = null
// res.add(node)
                }
                if (it.instruction == "sizeof" && it is InstructionType) {
                    TODO("not implemented")

                    //val node = null
                    //stack.push(Pair("System.Int32", node))
                }
                if (it.instruction == "refanytype" && it is InstructionNone) {
                    TODO("not implemented")
                    val s0 = stack.pop()

                    //val node = null
                    //stack.push(Pair("System.Int32", node))
                }
                if (it.instruction == "readonly." && it is InstructionNone) {
                    TODO("not implemented")

                    // val node = null
// res.add(node)
                }
                if (it.instruction == "endmac" && it is InstructionNone) {
                    TODO("not implemented")

                    // val node = null
// res.add(node)
                }
//types: "ldarg.0","ldarg.1","ldarg.2","ldarg.3"
                if (it.instruction == "ldarg") {
                    val number = if (it is InstructionNone) {
                        it.instructionArgs[0].toInt()
                    } else if (it is InstructionVar) {
                        it.value
                    } else if (it is InstructionVarS) {
                        it.id.drop(2).toInt()
                    } else {
                        error("Wrong instruction type")
                    }

                    if (compileNode.method.static) {
                        val node = LoadArgumentNodeGen.create(
                            number,
                            compileNode.argumentsSlots[number]
                        )

                        stack.push(Pair(compileNode.method.arguments[number].name, node))
                    } else if (number == 0) {
                        // this pointer
                        val node = LoadArgumentNodeGen.create(
                            number,
                            compileNode.argumentsSlots[number]
                        )

                        stack.push(Pair("Ref", node))
                        // Not doing the call instance thing rn
                    } else {
                        val node = LoadArgumentNodeGen.create(
                            number,
                            compileNode.argumentsSlots[number]
                        )

                        stack.push(Pair(compileNode.method.arguments[number - 1].name, node))
                    }
                }

//types: "ldloc.0","ldloc.1","ldloc.2","ldloc.3"
                if (it.instruction == "ldloc") {
                    val number = if (it is InstructionNone) {
                        it.instructionArgs[0].toInt()
                    } else if (it is InstructionVar) {
                        it.value
                    } else if (it is InstructionVarS) {
                        it.id.drop(2).toInt()
                    } else {
                        error("Wrong instruction type")
                    }

                    val node = LoadLocalNodeGen.create(compileNode.frameSlots[number])

                    val type = compileNode.method.locals[number]
                    stack.push(
                        Pair(
                            if (compileNode.frameSlots[number].kind == FrameSlotKind.Object) {
                                "Ref"
                            } else {
                                type.name
                            }, node
                        )
                    )
                }
//types: "ldarga.s","ldarga"
                if (it.instruction == "ldarga" && it is InstructionVar) {
                    TODO("not implemented")

                    //val node = null
                    //stack.push(Pair("System.Int32", node))
                }

                if (it.instruction == "ldarga" && it is InstructionVarS) {
                    TODO("not implemented")

                    //val node = null
                    //stack.push(Pair("System.Int32", node))
                }
//types: "ldloca.s","ldloca"
                if (it.instruction == "ldloca" && it is InstructionVar) {
                    TODO("not implemented")

                    //val node = null
                    //stack.push(Pair("System.Int32", node))
                }
                if (it.instruction == "ldloca" && it is InstructionVarS) {
                    TODO("not implemented")

                    //val node = null
                    //stack.push(Pair("System.Int32", node))
                }
//types: "ldnull"
                if (it.instruction == "ldnull" && it is InstructionNone) {
                    val node = LoadNull()
                    stack.push(Pair("Ref", node))
                }
//types: "ldc.i4.m1","ldc.i4.0","ldc.i4.1","ldc.i4.2","ldc.i4.3","ldc.i4.4","ldc.i4.5","ldc.i4.6","ldc.i4.7","ldc.i4.8"
                if (it.instruction == "ldc" && it is InstructionNone) {

                    val arg = it.instructionArgs[1]
                    var number = if (arg == "m1") {
                        -1
                    } else {
                        arg.toInt()
                    }

                    val node = LoadConst(number)
                    stack.push(Pair("System.Int32", node))
                }
//types: "ldc.i4.s","ldc.i4"
                if (it.instruction == "ldc" && it is InstructionI) {
                    val node = LoadConst(it.arg)
                    stack.push(Pair("System.Int32", node))
                }
//types: "ldc.i8"
                if (it.instruction == "ldc" && it is InstructionI8) {
                    val node = LoadConst(it.arg)
                    stack.push(Pair("System.Int64", node))
                }
//types: "ldc.r4","ldc.r8"
                if (it.instruction == "ldc" && it is InstructionR) {
                    val node = LoadConst(it.arg)
                    stack.push(Pair("System.Float", node))
                }
                if (it.instruction == "ldc" && it is InstructionR8) {
                    val node = LoadConst(it.arg)
                    stack.push(Pair("System.Double", node))
                }
//types: "ldind.i1","ldind.u1","ldind.i2","ldind.u2","ldind.i4","ldind.u4","ldind.i8","ldind.i","ldind.r4","ldind.r8","ldind.ref"
                if (it.instruction == "ldind" && it is InstructionNone) {
                    val s0 = stack.pop()
//                if (s0.first != "System.Int32") {
//                    error("")
//                }

                    val node = LoadIndirect(s0.second)
                    stack.push(Pair("System.Int32", node))
                }
//types: "ldobj"
                if (it.instruction == "ldobj" && it is InstructionType) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "System.Int32") {
                        error("")
                    }

                    //val node = null
                    //stack.push(Pair(s0.first, node))
                }
//types: "ldstr"
                if (it.instruction == "ldstr" && it is InstructionString) {
                    val node = LoadString(
                        it.content.substring(
                            1,
                            it.content.length - 1
                        )
                    )
                    stack.push(Pair("Ref", node))
                }
//types: "ldfld"
                if (it.instruction == "ldfld" && it is InstructionField) {
                    val s0 = stack.pop()
                    if (s0.first != "Ref") {
                        error("")
                    }

                    val node = LoadFieldNodeGen.create(it.name, s0.second)
                    stack.push(Pair(s0.first, node))
                }
//types: "ldflda"
                if (it.instruction == "ldflda" && it is InstructionField) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "Ref") {
                        error("")
                    }

                    //val node = null
                    //stack.push(Pair("System.Int32", node))
                }
//types: "ldsfld"
                if (it.instruction == "ldsfld" && it is InstructionField) {
                    TODO("not implemented")

                    val node = null
//                stack.push(Pair(s0.first, node))
                }
//types: "ldsflda"
                if (it.instruction == "ldsflda" && it is InstructionField) {
                    TODO("not implemented")

                    //val node = null
                    //stack.push(Pair("System.Int32", node))
                }
//types: "ldlen"
                if (it.instruction == "ldlen" && it is InstructionNone) {
                    val s0 = stack.pop()
                    if (s0.first != "Ref") {
                        error("")
                    }

                    val node = LoadLengthNodeGen.create(s0.second)
                    stack.push(Pair("System.Int32", node))
                }
//types: "ldelema"
                if (it.instruction == "ldelema" && it is InstructionType) {
                    val s0 = stack.pop()
                    if (s0.first != "System.Int32") {
                        error("")
                    }
                    val s1 = stack.pop()
                    if (s1.first != "Ref") {
//                    error("")
                    }

                    val node = LoadElementNodeGen.create(s1.second, s0.second)
                    stack.push(Pair("System.Int32", node)) // TODO: fix type
                }
//types: "ldelem.i1","ldelem.u1","ldelem.i2","ldelem.u2","ldelem.i4","ldelem.u4","ldelem.i8","ldelem.i","ldelem.r4","ldelem.r8","ldelem.ref"
                if (it.instruction == "ldelem" && it is InstructionNone) {
                    val s0 = stack.pop()
                    if (s0.first != "System.Int32") {
                        error("")
                    }

                    val s1 = stack.pop()
//                if (s1.first != ) {
//                    error("")
//                }

                    val node = LoadElementNodeGen.create(s1.second, s0.second)
                    stack.push(Pair("System.Int32", node)) // TODO: fix type
                }
//types: "ldelem"
                if (it.instruction == "ldelem" && it is InstructionType) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "Ref") {
                        error("")
                    }
                    val s1 = stack.pop()
                    if (s1.first != "System.Int32") {
                        error("")
                    }

                    //val node = null
                    //stack.push(Pair(s0.first, node))
                }
//types: "ldtoken"
                if (it.instruction == "ldtoken" && it is InstructionTok) {
                    TODO("not implemented")

                    //val node = null
                    //stack.push(Pair("System.Int32", node))
                }
//types: "ldftn"
                if (it.instruction == "ldftn" && it is InstructionMethod) {
                    TODO("not implemented")

                    //val node = null
                    //stack.push(Pair("System.Int32", node))
                }
//types: "ldvirtftn"
                if (it.instruction == "ldvirtftn" && it is InstructionMethod) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "Ref") {
                        error("")
                    }

                    //val node = null
                    //stack.push(Pair("System.Int32", node))
                }
//types: "stloc.0","stloc.1","stloc.2","stloc.3"
                if (it.instruction == "stloc") {

                    val s0 = stack.pop()
                    val arg = it.instructionArgs[0]
                    val number = if (it is InstructionNone) {
                        arg.toInt()
                    } else if (it is InstructionVar) {
                        it.value
                    } else if (it is InstructionVarS) {
                        it.id.drop(2).toInt()
                    } else {
                        error("")
                    }

                    val node = if (s0.first == compileNode.method.locals[number].name) {
                        StoreLocalNodeGen.create(
                            s0.second,
                            compileNode.frameSlots[number]
                        )
                    } else if (s0.first == "Ref") {
                        StoreLocalNodeGen.create(
                            s0.second,
                            compileNode.frameSlots[number]
                        )
                    } else {
                        StoreLocalNodeGen.create(
                            s0.second,
                            compileNode.frameSlots[number]
                        )
                    }

                    res.add(node)
                }
//types: "starg.s","starg"
                if (it.instruction == "starg") {
                    TODO("not implemented")
                    val s0 = stack.pop()


                    // val node = null
// res.add(node)
                }
//types: "stind.ref","stind.i1","stind.i2","stind.i4","stind.i8","stind.r4","stind.r8","stind.i"
                if (it.instruction == "stind" && it is InstructionNone) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "System.Int32") {
                        error("")
                    }
                    val s1 = stack.pop()
                    if (s1.first != "System.Int32") {
                        error("")
                    }

                    // val node = null
// res.add(node)
                }
//types: "stfld"
                if (it.instruction == "stfld" && it is InstructionField) {
                    if (stack.size < 2) {
                        error("needs 2")
                    }
                    val s1 = stack.pop()

                    val s0 = stack.pop()
                    if (s0.first != "Ref") {
                        error("")
                    }

                    val node = StoreFieldNodeGen.create(it.name, s0.second, s1.second)
                    res.add(node)
                }
//types: "stsfld"
                if (it.instruction == "stsfld" && it is InstructionField) {
                    if (stack.size < 1) {
                        error("needs 1")
                    }
                    val s0 = stack.pop()


                    val node = StoreStaticField(it.member, s0.second)
                    res.add(node)
                }
//types: "stobj"
                if (it.instruction == "stobj" && it is InstructionType) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "System.Int32") {
                        error("")
                    }
                    val s1 = stack.pop()


                    // val node = null
// res.add(node)
                }
//types: "stelem.i","stelem.i1","stelem.i2","stelem.i4","stelem.i8","stelem.r4","stelem.r8","stelem.ref"
                if (it.instruction == "stelem" && it is InstructionNone) {
                    val suffix = when (it.instructionArgs[0]) {
                        "i1" -> "System.Byte"
                        "i4" -> "System.Int32"
                        "i" -> "System.Int32"
                        "ref" -> "System.Object"
                        else -> error("Unkown type detectd")
                    }
                    val s2 = stack.pop()
                    if (s2.first != suffix) {
//                        error("")
                    }
                    val s1 = stack.pop()
                    if (s1.first != "System.Int32") {
                        error("")
                    }
                    val s0 = stack.pop()
//                if (s0.first != "Ref") {
//                    error("")
//                }

                    val node =
                        StoreElementNodeGen.create(s0.second, s1.second, s2.second)
                    res.add(node)
                }
//types: "stelem"
                if (it.instruction == "stelem" && it is InstructionType) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "Ref") {
//                    error("")
                    }
                    val s1 = stack.pop()
                    if (s1.first != "System.Int32") {
                        error("")
                    }
                    val s2 = stack.pop()


                    // val node = null
// res.add(node)
                }
//types: "break"
                if (it.instruction == "break" && it is InstructionNone) {

                    val node = BreakPoint()

                    res.add(node)
                }
//types: "br.s","br"
                if (it.instruction == "br" && it is InstructionBrTarget) {
                    val node = Branch(
                        compileNode.method.blockByLabel.getValue(it.target).index,
                        it.target
                    )
                    node.successors = intArrayOf(compileNode.method.blockByLabel.getValue(it.target).index)
                    res.add(node)
                }
//types: "brfalse.s","brfalse"
                if (it.instruction == "brfalse" && it is InstructionBrTarget) {
                    val s0 = stack.pop()
                    var cond = s0.second
                    if (s0.first == "System.Int32") {
                        cond = cond
                    } else if (s0.first != "System.Boolean") {
                        error("")
                    }

                    val nodes = block.targets.map { this.getNodes(it, language, d + 1) }

                    val goa = nodes[0].id
                    val gob = nodes[1].id


                    val node =
//                    BoolBranch(s0.second, false, goa, gob, it.target)
                        BoolBranchNodeGen.create(false, goa, gob, it.target, cond)
                    node.successors = intArrayOf(goa, gob)

                    res.add(node)
                }
//types: "brtrue.s","brtrue"
                if (it.instruction == "brtrue" && it is InstructionBrTarget) {
                    val s0 = stack.pop()
                    var cond = s0.second
                    if (s0.first == "System.Int32") {
                        cond = cond
                    } else if (s0.first != "System.Boolean") {
                        error("")
                    }

                    val nodes = block.targets.map { this.getNodes(it, language, d + 1) }

                    val goa = nodes[0].id
                    val gob = nodes[1].id

                    val node =
                        BoolBranchNodeGen.create(true, goa, gob, it.target, cond)
                    node.successors = intArrayOf(goa, gob)

                    res.add(node)
                }
//types: "beq.s","beq"
                if (it.instruction == "beq" && it is InstructionBrTarget) {

                    val s0 = stack.pop()

                    val s1 = stack.pop()

                    val nodes = block.targets.map { this.getNodes(it, language, d + 1) }

                    val goa = nodes[0].id
                    val gob = nodes[1].id

                    val node = BoolBranchNodeGen.create(
                        true,
                        goa,
                        gob,
                        it.target,
                        CompareNodeGen.create(CompareCondition.EQ, false, s1.second, s0.second)
                    )
                    node.successors = intArrayOf(goa, gob)

                    res.add(node)
                }
//types: "bge.s","bge.un.s","bge","bge.un"
                if (it.instruction == "bge" && it is InstructionBrTarget) {
                    val s0 = stack.pop()
                    val s1 = stack.pop()

                    val nodes = block.targets.map { this.getNodes(it, language, d + 1) }

                    val goa = nodes[0].id
                    val gob = nodes[1].id

//                val node = CondBranch(s1.second, s0.second, "ge", goa, gob, it.target)
                    val node = BoolBranchNodeGen.create(
                        true,
                        goa,
                        gob,
                        it.target,
                        CompareNodeGen.create(CompareCondition.GE, false, s1.second, s0.second)
                    )
                    node.successors = intArrayOf(goa, gob)

                    res.add(node)
                }
//types: "bgt.s","bgt.un.s","bgt","bgt.un"
                if (it.instruction == "bgt" && it is InstructionBrTarget) {
                    TODO("not implemented")
                    val s0 = stack.pop()

                    val s1 = stack.pop()


                    // val node = null
// res.add(node)
                }
//types: "ble.s","ble.un.s","ble","ble.un"
                if (it.instruction == "ble" && it is InstructionBrTarget) {
                    val s0 = stack.pop()
                    val s1 = stack.pop()

                    val nodes = block.targets.map { this.getNodes(it, language, d + 1) }

                    val goa = nodes[0].id
                    val gob = nodes[1].id

//                val node = CondBranch(s1.second, s0.second, "ge", goa, gob, it.target)
                    val node = BoolBranchNodeGen.create(
                        true,
                        goa,
                        gob,
                        it.target,
                        CompareNodeGen.create(CompareCondition.LE, false, s1.second, s0.second)
                    )
                    node.successors = intArrayOf(goa, gob)

                    res.add(node)
                }
//types: "blt.s","blt.un.s","blt","blt.un"
                if (it.instruction == "blt" && it is InstructionBrTarget) {
                    val s0 = stack.pop()
                    val s1 = stack.pop()

                    val nodes = block.targets.map { this.getNodes(it, language, d + 1) }

                    val goa = nodes[0].id
                    val gob = nodes[1].id

//                val node = CondBranch(s1.second, s0.second, "ge", goa, gob, it.target)
                    val node = BoolBranchNodeGen.create(
                        true,
                        goa,
                        gob,
                        it.target,
                        CompareNodeGen.create(CompareCondition.LT, false, s1.second, s0.second)
                    )
                    node.successors = intArrayOf(goa, gob)

                    res.add(node)
                }
//types: "bne.un.s","bne.un"
                if (it.instruction == "bne" && it is InstructionBrTarget) {
                    TODO("not implemented")
                    val s0 = stack.pop()

                    val s1 = stack.pop()


                    // val node = null
// res.add(node)
                }
//types: "box"
                if (it.instruction == "box" && it is InstructionType) {
                    TODO("not implemented")
                    val s0 = stack.pop()


                    //val node = null
                    //stack.push(Pair("Ref", node))
                }
//types: "call"
                if (it.instruction == "call" && it is InstructionMethod) {

                    val args = it.method.arguments.map { stack.pop() }

                    val thisValue = if (it.method.static) {
                        LoadConst(0)
                    } else {
                        stack.pop().second
                    }

                    if (it.method.name == ".ctor") {
                        val method = context.types.getValue(it.method.memberOf!!.fullName).members.getValue(
                            it.method.toString()
                        )
                        res.add(
                            Call(
                                method,
                                (listOf(thisValue) + args.map { it.second }.reversed()).toTypedArray()
                            )
                        )
                        return@let
                    }

                    val node = if (compileNode.method.memberOf == null) {
                        error("Expression 'compileNode.method.memberOf' must not be null")
                    } else {
//                    val callee = compileNode.method.memberOf!!.compileNode.methods.getValue("${it.method.name}(${it.method.arguments.joinToString(",")})")

                        val method = context.types.getValue(it.method.memberOf!!.fullName).members.getValue(
                            it.method.toString()
                        )
                        Call(
                            method,
                            args.map { it.second }.reversed().toTypedArray()
                        )
                    }



                    if (it.method.returnType.type == CorElementType.VOID) {
                        res.add(node);
                    } else {
                        stack.push(Pair(it.method.returnType.name, node))
                    }
                }
//types: "calli"
                if (it.instruction == "calli" && it is InstructionSig) {
                    TODO("not implemented")

                    // val node = null
// res.add(node)
                }
//types: "conv.i1","conv.i2","conv.i4","conv.i8","conv.r4","conv.r8","conv.u4","conv.u8","conv.r.un","conv.ovf.i1.un","conv.ovf.i2.un","conv.ovf.i4.un","conv.ovf.i8.un","conv.ovf.u1.un","conv.ovf.u2.un","conv.ovf.u4.un","conv.ovf.u8.un","conv.ovf.i.un","conv.ovf.u.un","conv.ovf.i1","conv.ovf.u1","conv.ovf.i2","conv.ovf.u2","conv.ovf.i4","conv.ovf.u4","conv.ovf.i8","conv.ovf.u8","conv.u2","conv.u1","conv.i","conv.ovf.i","conv.ovf.u","conv.u"
                if (it.instruction == "conv" && it is InstructionNone) {
                    val s0 = stack.pop()


//                val node = null
                    stack.push(Pair("System.Int32", s0.second))
                }
//types: "callvirt"
                if (it.instruction == "callvirt" && it is InstructionMethod) {
//                println(it.method)
                    val args = it.method.arguments.map { stack.pop() }

                    val thisValue = if (it.method.static) {
                        LoadConst(0)
                    } else {
                        stack.pop().second
                    }

                    val node = if (compileNode.method.memberOf == null) {
                        error("Expression 'compileNode.method.memberOf' must not be null")
                    } else {
                        val method = context.types.getValue(it.method.memberOf!!.fullName).members.getValue(
                            it.method.toString()
                        )
                        CallVirtual(
                            method,
                            (listOf(thisValue) + args.map { it.second }.reversed()).toTypedArray()
                        )
                    }

                    if (it.method.returnType.type == CorElementType.VOID) {
                        res.add(node);
                    } else {
                        stack.push(Pair(it.method.returnType.name, node))
                    }
                }
//types: "cpobj"
                if (it.instruction == "cpobj" && it is InstructionType) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "System.Int32") {
                        error("")
                    }
                    val s1 = stack.pop()
                    if (s1.first != "System.Int32") {
                        error("")
                    }

                    // val node = null
// res.add(node)
                }
//types: "castclass"
                if (it.instruction == "castclass" && it is InstructionType) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "Ref") {
                        error("")
                    }

                    //val node = null
                    //stack.push(Pair("Ref", node))
                }
//types: "ckfinite"
                if (it.instruction == "ckfinite" && it is InstructionNone) {
                    TODO("not implemented")
                    val s0 = stack.pop()


                    //val node = null
                    //stack.push(Pair("float64", node))
                }
//types: "ceq"
                if (it.instruction == "ceq" && it is InstructionNone) {
                    val s0 = stack.pop()

                    val s1 = stack.pop()

                    val node = CompareNodeGen.create(CompareCondition.EQ, false, s1.second, s0.second)
                    stack.push(Pair("System.Int32", node))
                }
//types: "cgt","cgt.un"
                if (it.instruction == "cgt" && it is InstructionNone) {
                    val s0 = stack.pop()

                    val s1 = stack.pop()


                    val node = CompareNodeGen.create(CompareCondition.GT, false, s1.second, s0.second)
                    stack.push(Pair("System.Int32", node))
                }
//types: "clt","clt.un"
                if (it.instruction == "clt" && it is InstructionNone) {
                    val s0 = stack.pop()

                    val s1 = stack.pop()


                    val node = CompareNodeGen.create(CompareCondition.LT, false, s1.second, s0.second)
                    stack.push(Pair("System.Int32", node))
                }
//types: "constrained."
                if (it.instruction == "constrained" && it is InstructionType) {
                    TODO("not implemented")

                    // val node = null
// res.add(node)
                }
//types: "cpblk"
                if (it.instruction == "cpblk" && it is InstructionNone) {
                    TODO("not implemented")
                    val s0 = stack.pop()
                    if (s0.first != "System.Int32") {
                        error("")
                    }
                    val s1 = stack.pop()
                    if (s1.first != "System.Int32") {
                        error("")
                    }
                    val s2 = stack.pop()
                    if (s2.first != "System.Int32") {
                        error("")
                    }

                    // val node = null
// res.add(node)
                }
//types: "codelabel"
                if (it.instruction == "codelabel" && it is InstructionNone) {
                    TODO("not implemented")

                    // val node = null
// res.add(node)
                }
            }

//            println("${"\t".repeat(d)}$index, $instruction, $res, $stack")

        }



        if (!stack.empty() && block.targets.size == 1) {
            if (block.instructions.last() is InstructionBrTarget && block.targets.size == 1) {
                res.removeAt(res.lastIndex)
            }
            block = nodes[block.targets.first()]
            block.stolen = 1
            continue
//            println(stack)
//            error("Stack should be empty at the end of a block")
        }

        if (!stack.empty()) {
            error("Stack not empty and doesn't finish with a jump")
        }

    } while (!stack.empty())


    if (block.instructions.last() !is InstructionBrTarget && block.targets.size == 1) {
        val node =
            Branch(block.targets.first(), nodes[block.targets.first()].label)
        node.successors = intArrayOf(block.targets.first())
        res.add(node)
    }




    result.controlFlowNode = res.takeLast(1).first()!! as ControlFlowNode

    result.nodes = res.dropLast(1).map { it!! }.toTypedArray()
    return result
//        println("")
}
