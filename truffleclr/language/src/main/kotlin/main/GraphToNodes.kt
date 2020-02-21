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
import parser.generic.Graph
import parser.generic.InstructionBlock
import parser.generic.instruction.*
import runtime.Method
import java.util.*

@Suppress("UNREACHABLE_CODE")
@CompilerDirectives.TruffleBoundary
fun Graph.getNodes(root: Int, language: TruffleLanguage<*>): Block {
    val stack = Stack<Pair<String, ExpressionNode>>()
    val res = mutableListOf<StatementNode>()
    var block = nodes[root]
    val context = (language as Clr).tmp

    val blocks: Map<Int, InstructionBlock> = nodes.mapIndexed({ index, node -> Pair(index, node) }).toMap()

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
            if (instruction.instruction == "nop" && instruction is InstructionNone) {

            }
            if (instruction.instruction == "dup" && instruction is InstructionNone) {
                val s0 = stack.pop()
                val slot = compileNode.genDupSlot()

                res.add(StoreLocalNodeGen.create(99, s0.second, slot))
                stack.push(Pair(s0.first, LoadLocalNodeGen.create(99, slot)))
                stack.push(Pair(s0.first, LoadLocalNodeGen.create(99, slot)))
            }
            if (instruction.instruction == "pop" && instruction is InstructionNone) {
                val s0 = stack.pop()
                res.add(s0.second)
            }
            if (instruction.instruction == "jmp" && instruction is InstructionMethod) {
                TODO("not implemented")

                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "ret" && instruction is InstructionNone) {
                val node = if (compileNode.method.returnType == "void") {
                    Return()
                } else {
                    val s0 = stack.pop()
                    ReturnValue(s0.second)
                }
                node.successors = intArrayOf()

                res.add(node)
            }
            if (instruction.instruction == "switch" && instruction is InstructionSwitch) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "int32") {
                    error("")
                }

                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "add" && instruction is InstructionNone) {
                val s0 = stack.pop()

                val s1 = stack.pop()


                val node = AddNodeGen.create((s1.second)!!, (s0.second)!!)
                stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "add.ovf" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()

                val s1 = stack.pop()


                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "add.ovf.un" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()

                val s1 = stack.pop()


                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "sub" && instruction is InstructionNone) {
                val s0 = stack.pop()
                val s1 = stack.pop()
                val node = SubtractNodeGen.create(s1.second, s0.second)
                stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "sub.ovf" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()

                val s1 = stack.pop()


                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "sub.ovf.un" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()

                val s1 = stack.pop()


                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "mul" && instruction is InstructionNone) {
                val s0 = stack.pop()
                val s1 = stack.pop()

                val node = MultiplyNodeGen.create(s1.second, s0.second)
                stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "mul.ovf" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()

                val s1 = stack.pop()


                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "mul.ovf.un" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()

                val s1 = stack.pop()


                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "div" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()

                val s1 = stack.pop()


                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "div.un" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()

                val s1 = stack.pop()


                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "rem" && instruction is InstructionNone) {
                val s0 = stack.pop()
                val s1 = stack.pop()

                val node = ReminderNodeGen.create(s1.second, s0.second)
                stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "rem.un" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()

                val s1 = stack.pop()


                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "and" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()

                val s1 = stack.pop()


                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "or" && instruction is InstructionNone) {
                val s0 = stack.pop()

                val s1 = stack.pop()


                val node = OrNodeGen.create(s1.second, s0.second)
                stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "xor" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()

                val s1 = stack.pop()


                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "shl" && instruction is InstructionNone) {
                val s0 = stack.pop()

                val s1 = stack.pop()

                val node = ShiftLeftNodeGen.create(s1.second, s0.second)
                stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "shr" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()

                val s1 = stack.pop()


                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "shr.un" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()

                val s1 = stack.pop()


                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "neg" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()


                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "not" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()


                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "newobj" && instruction is InstructionMethod) {
                val args = instruction.method.arguments.map { stack.pop() }

                val node = NewObject(args.map { it.second }.toTypedArray(), instruction.method.toString())
                stack.push(Pair("Ref", node))
            }
            if (instruction.instruction == "isinst" && instruction is InstructionType) {
                val s0 = stack.pop()
//                if (s0.first != "Ref") {
//                    error("")
//                }

                val node = IsInstance(s0.second)
                stack.push(Pair("int32", node))
            }
            if (instruction.instruction == "unbox" && instruction is InstructionType) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "Ref") {
                    error("")
                }

                //val node = null
                //stack.push(Pair("int32", node))
            }
            if (instruction.instruction == "unbox.any" && instruction is InstructionType) {
                val s0 = stack.pop()
//                if (s0.first != "Ref") {
//                    error("")
//                }

                val node = Unbox(s0.second)
                stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "throw" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "Ref") {
                    error("")
                }

                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "newarr" && instruction is InstructionType) {
                val s0 = stack.pop()
                if (s0.first != "int32") {
                    error("")
                }

                //TODO: fix types for array creation


                val type = context.types.getValue(instruction.type).info.type
                val node = NewArrayNodeGen.create(type, s0.second)

                stack.push(Pair("Ref", node))
            }
            if (instruction.instruction == "refanyval" && instruction is InstructionType) {
                TODO("not implemented")
                val s0 = stack.pop()


                //val node = null
                //stack.push(Pair("int32", node))
            }
            if (instruction.instruction == "mkrefany" && instruction is InstructionType) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "int32") {
                    error("")
                }

                //val node = null
                //stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "endfinally" && instruction is InstructionNone) {
                TODO("not implemented")

                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "leave" && instruction is InstructionBrTarget) {
                TODO("not implemented")

                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "leave.s" && instruction is InstructionBrTarget) {
                TODO("not implemented")

                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "arglist" && instruction is InstructionNone) {
                TODO("not implemented")

                //val node = null
                //stack.push(Pair("int32", node))
            }
            if (instruction.instruction == "localloc" && instruction is InstructionNone) {
                TODO("not implemented")

                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "endfilter" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "int32") {
                    error("")
                }

                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "unaligned." && instruction is InstructionI) {
                TODO("not implemented")

                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "volatile." && instruction is InstructionNone) {
                TODO("not implemented")

                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "tail." && instruction is InstructionNone) {
                TODO("not implemented")

                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "initobj" && instruction is InstructionType) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "int32") {
                    error("")
                }

                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "initblk" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "int32") {
                    error("")
                }
                val s1 = stack.pop()
                if (s1.first != "int32") {
                    error("")
                }
                val s2 = stack.pop()
                if (s2.first != "int32") {
                    error("")
                }

                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "rethrow" && instruction is InstructionNone) {
                TODO("not implemented")

                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "sizeof" && instruction is InstructionType) {
                TODO("not implemented")

                //val node = null
                //stack.push(Pair("int32", node))
            }
            if (instruction.instruction == "refanytype" && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()


                //val node = null
                //stack.push(Pair("int32", node))
            }
            if (instruction.instruction == "readonly." && instruction is InstructionNone) {
                TODO("not implemented")

                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "endmac" && instruction is InstructionNone) {
                TODO("not implemented")

                // val node = null
// res.add(node)
            }
//types: "ldarg.0","ldarg.1","ldarg.2","ldarg.3"
            if (instruction.instruction.startsWith("ldarg") && instruction is InstructionNone) {
                val arg = instruction.instruction.split(".")[1]
                val number = arg.toInt()

                if (compileNode.method.static) {
                    val node = LoadArgumentNodeGen.create(
                        number,
                        compileNode.argumentsSlots[number]
                    )

                    stack.push(Pair(compileNode.method.arguments[number], node))
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

                    stack.push(Pair(compileNode.method.arguments[number - 1], node))
                }
            }
//types: "ldarg.s","ldarg"
            if (instruction.instruction.startsWith("ldarg") && instruction is InstructionVar) {
                TODO("not implemented")

                val node = null
//                stack.push(Pair(s0.first, node))
            }
//types: "ldloc.0","ldloc.1","ldloc.2","ldloc.3"
            if (instruction.instruction.startsWith("ldloc") && instruction is InstructionNone) {
                val arg = instruction.instruction.split(".")[1]
                val number = arg.toInt()
                val node = LoadLocalNodeGen.create(number, compileNode.frameSlots[number])

                val type = compileNode.method.locals[number]
                stack.push(
                    Pair(
                        if (compileNode.frameSlots[number].kind == FrameSlotKind.Object) {
                            "Ref"
                        } else {
                            type
                        }, node
                    )
                )
            }
//types: "ldloc.s","ldloc"
            if (instruction.instruction == "ldloc" && instruction is InstructionVar) {
                TODO("not implemented")

                val node = null
//                stack.push(Pair(s0.first, node))
            }
            if (instruction.instruction == "ldloc.s" && instruction is InstructionVarS) {
                val arg = instruction.instruction.split(".")[1]
                val number = instruction.id.drop(2).toInt()
                val node = LoadLocalNodeGen.create(number, compileNode.frameSlots[number])

                val type = compileNode.method.locals[number]
                stack.push(
                    Pair(
                        if (type.endsWith("[]")) {
                            "Ref"
                        } else {
                            type
                        }, node
                    )
                )
            }
//types: "ldarga.s","ldarga"
            if (instruction.instruction.startsWith("ldarga") && instruction is InstructionVar) {
                TODO("not implemented")

                //val node = null
                //stack.push(Pair("int32", node))
            }
//types: "ldloca.s","ldloca"
            if (instruction.instruction.startsWith("ldloca") && instruction is InstructionVar) {
                TODO("not implemented")

                //val node = null
                //stack.push(Pair("int32", node))
            }
//types: "ldnull"
            if (instruction.instruction.startsWith("ldnull") && instruction is InstructionNone) {
                val node = LoadNull()
                stack.push(Pair("Ref", node))
            }
//types: "ldc.i4.m1","ldc.i4.0","ldc.i4.1","ldc.i4.2","ldc.i4.3","ldc.i4.4","ldc.i4.5","ldc.i4.6","ldc.i4.7","ldc.i4.8"
            if (instruction.instruction.startsWith("ldc") && instruction is InstructionNone) {

                val arg = instruction.instruction.split(".")[2]
                var number = if (arg == "m1") {
                    -1
                } else {
                    arg.toLong()
                }

                val node = LoadConst(number, Int::class)
                stack.push(Pair("int32", node))
            }
//types: "ldc.i4.s","ldc.i4"
            if (instruction.instruction.startsWith("ldc") && instruction is InstructionI) {


                val node = LoadConst(instruction.arg.toLong(), Int::class)
                stack.push(Pair("int32", node))
            }
//types: "ldc.i8"
            if (instruction.instruction.startsWith("ldc") && instruction is InstructionI8) {
                TODO("not implemented")

                //val node = null
                //stack.push(Pair("int64", node))
            }
//types: "ldc.r4","ldc.r8"
            if (instruction.instruction.startsWith("ldc") && instruction is InstructionR) {
                TODO("not implemented")

                //val node = null
                //stack.push(Pair("float32", node))
            }
//types: "ldind.i1","ldind.u1","ldind.i2","ldind.u2","ldind.i4","ldind.u4","ldind.i8","ldind.i","ldind.r4","ldind.r8","ldind.ref"
            if (instruction.instruction.startsWith("ldind") && instruction is InstructionNone) {
                val s0 = stack.pop()
//                if (s0.first != "int32") {
//                    error("")
//                }

                val node = LoadIndirect(s0.second)
                stack.push(Pair("int32", node))
            }
//types: "ldobj"
            if (instruction.instruction.startsWith("ldobj") && instruction is InstructionType) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "int32") {
                    error("")
                }

                //val node = null
                //stack.push(Pair(s0.first, node))
            }
//types: "ldstr"
            if (instruction.instruction.startsWith("ldstr") && instruction is InstructionString) {
                val node = LoadString(
                    instruction.content.substring(
                        1,
                        instruction.content.length - 1
                    )
                )
                stack.push(Pair("Ref", node))
            }
//types: "ldfld"
            if (instruction.instruction.startsWith("ldfld") && instruction is InstructionField) {
                val s0 = stack.pop()
                if (s0.first != "Ref") {
                    error("")
                }

                val node = LoadField(s0.second, instruction.member + "." + instruction.name)
                stack.push(Pair(s0.first, node))
            }
//types: "ldflda"
            if (instruction.instruction.startsWith("ldflda") && instruction is InstructionField) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "Ref") {
                    error("")
                }

                //val node = null
                //stack.push(Pair("int32", node))
            }
//types: "ldsfld"
            if (instruction.instruction.startsWith("ldsfld") && instruction is InstructionField) {
                TODO("not implemented")

                val node = null
//                stack.push(Pair(s0.first, node))
            }
//types: "ldsflda"
            if (instruction.instruction.startsWith("ldsflda") && instruction is InstructionField) {
                TODO("not implemented")

                //val node = null
                //stack.push(Pair("int32", node))
            }
//types: "ldlen"
            if (instruction.instruction.startsWith("ldlen") && instruction is InstructionNone) {
                val s0 = stack.pop()
                if (s0.first != "Ref") {
                    error("")
                }

                val node = LoadLengthNodeGen.create(s0.second)
                stack.push(Pair("int32", node))
            }
//types: "ldelema"
            if (instruction.instruction.startsWith("ldelema") && instruction is InstructionType) {
                val s0 = stack.pop()
                if (s0.first != "int32") {
                    error("")
                }
                val s1 = stack.pop()
                if (s1.first != "Ref") {
//                    error("")
                }

                val node = LoadElementNodeGen.create(s1.second, s0.second)
                stack.push(Pair("int32", node)) // TODO: fix type
            }
//types: "ldelem.i1","ldelem.u1","ldelem.i2","ldelem.u2","ldelem.i4","ldelem.u4","ldelem.i8","ldelem.i","ldelem.r4","ldelem.r8","ldelem.ref"
            if (instruction.instruction.startsWith("ldelem") && instruction is InstructionNone) {
                val s0 = stack.pop()
                if (s0.first != "int32") {
                    error("")
                }

                val s1 = stack.pop()
//                if (s1.first != ) {
//                    error("")
//                }

                val node = LoadElementNodeGen.create(s1.second, s0.second)
                stack.push(Pair("int32", node)) // TODO: fix type
            }
//types: "ldelem"
            if (instruction.instruction.startsWith("ldelem") && instruction is InstructionType) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "Ref") {
                    error("")
                }
                val s1 = stack.pop()
                if (s1.first != "int32") {
                    error("")
                }

                //val node = null
                //stack.push(Pair(s0.first, node))
            }
//types: "ldtoken"
            if (instruction.instruction.startsWith("ldtoken") && instruction is InstructionTok) {
                TODO("not implemented")

                //val node = null
                //stack.push(Pair("int32", node))
            }
//types: "ldftn"
            if (instruction.instruction.startsWith("ldftn") && instruction is InstructionMethod) {
                TODO("not implemented")

                //val node = null
                //stack.push(Pair("int32", node))
            }
//types: "ldvirtftn"
            if (instruction.instruction.startsWith("ldvirtftn") && instruction is InstructionMethod) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "Ref") {
                    error("")
                }

                //val node = null
                //stack.push(Pair("int32", node))
            }
//types: "stloc.0","stloc.1","stloc.2","stloc.3"
            if (instruction.instruction.startsWith("stloc") && instruction is InstructionNone) {

                val s0 = stack.pop()
                val arg = instruction.instruction.split(".")[1]
                val number = arg.toInt()

                val node = if (s0.first == compileNode.method.locals[number]) {
                    StoreLocalNodeGen.create(
                        number,
                        s0.second,
                        compileNode.frameSlots[number]
                    )
                } else if (s0.first == "Ref") {
                    StoreLocalNodeGen.create(
                        number,
                        s0.second,
                        compileNode.frameSlots[number]
                    )
                } else {
                    StoreLocalNodeGen.create(
                        number,
                        s0.second,
                        compileNode.frameSlots[number]
                    )
                }

                res.add(node)
            }
//types: "stloc.s","stloc"
            if (instruction.instruction == "stloc" && instruction is InstructionVar) {
                TODO("not implemented")
                val s0 = stack.pop()


                // val node = null
// res.add(node)
            }
            if (instruction.instruction == "stloc.s" && instruction is InstructionVarS) {
                val s0 = stack.pop()

                val number = instruction.id.drop(2).toInt()
                val node = if (s0.first == compileNode.method.locals[number]) {
                    StoreLocalNodeGen.create(
                        number,
                        s0.second,
                        compileNode.frameSlots[number]
                    )
                } else {
                    StoreLocalNodeGen.create(
                        number,
                        s0.second,
                        compileNode.frameSlots[number]
                    )
                }

                res.add(node)
            }
//types: "starg.s","starg"
            if (instruction.instruction.startsWith("starg") && instruction is InstructionVar) {
                TODO("not implemented")
                val s0 = stack.pop()


                // val node = null
// res.add(node)
            }
//types: "stind.ref","stind.i1","stind.i2","stind.i4","stind.i8","stind.r4","stind.r8","stind.i"
            if (instruction.instruction.startsWith("stind") && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "int32") {
                    error("")
                }
                val s1 = stack.pop()
                if (s1.first != "int32") {
                    error("")
                }

                // val node = null
// res.add(node)
            }
//types: "stfld"
            if (instruction.instruction.startsWith("stfld") && instruction is InstructionField) {
                if (stack.size < 2) {
                    error("needs 2")
                }
                val s1 = stack.pop()

                val s0 = stack.pop()
                if (s0.first != "Ref") {
                    error("")
                }

                val node = StoreField(s0.second, instruction.member, s1.second)
                res.add(node)
            }
//types: "stsfld"
            if (instruction.instruction.startsWith("stsfld") && instruction is InstructionField) {
                if (stack.size < 1) {
                    error("needs 1")
                }
                val s0 = stack.pop()


                val node = StoreStaticField(instruction.member, s0.second)
                res.add(node)
            }
//types: "stobj"
            if (instruction.instruction.startsWith("stobj") && instruction is InstructionType) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "int32") {
                    error("")
                }
                val s1 = stack.pop()


                // val node = null
// res.add(node)
            }
//types: "stelem.i","stelem.i1","stelem.i2","stelem.i4","stelem.i8","stelem.r4","stelem.r8","stelem.ref"
            if (instruction.instruction.startsWith("stelem") && instruction is InstructionNone) {
                val suffix = when (instruction.instruction.split(".")[1]) {
                    "i1" -> "uint8"
                    "i4" -> "int32"
                    "i" -> "int32"
                    else -> error("Unkown type detectd")
                }
                val s2 = stack.pop()
                if (s2.first != suffix) {
                    error("")
                }
                val s1 = stack.pop()
                if (s1.first != "int32") {
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
            if (instruction.instruction.startsWith("stelem") && instruction is InstructionType) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "Ref") {
                    error("")
                }
                val s1 = stack.pop()
                if (s1.first != "int32") {
                    error("")
                }
                val s2 = stack.pop()


                // val node = null
// res.add(node)
            }
//types: "break"
            if (instruction.instruction.startsWith("break") && instruction is InstructionNone) {

                val node = BreakPoint()

                res.add(node)
            }
//types: "br.s","br"
            if (setOf("br", "br.s").contains(instruction.instruction) && instruction is InstructionBrTarget) {

                val node = Branch(
                    compileNode.method.blockByLabel.getValue(instruction.target).index,
                    instruction.target
                )
                node.successors = intArrayOf(compileNode.method.blockByLabel.getValue(instruction.target).index)
                res.add(node)
            }
//types: "brfalse.s","brfalse"
            if (instruction.instruction.startsWith("brfalse") && instruction is InstructionBrTarget) {
                val s0 = stack.pop()
                var cond = s0.second
                if (s0.first == "int32") {
                    cond = cond
                } else if (s0.first != "bool") {
                    error("")
                }

                val nodes = block.targets.map { this.getNodes(it, language) }

                val goa = nodes[0].id
                val gob = nodes[1].id


                val node =
//                    BoolBranch(s0.second, false, goa, gob, instruction.target)
                    BoolBranchNodeGen.create(false, goa, gob, instruction.target, cond)
                node.successors = intArrayOf(goa, gob)

                res.add(node)
            }
//types: "brtrue.s","brtrue"
            if (instruction.instruction.startsWith("brtrue") && instruction is InstructionBrTarget) {
                val s0 = stack.pop()
                var cond = s0.second
                if (s0.first == "int32") {
                    cond = cond
                } else if (s0.first != "bool") {
                    error("")
                }

                val nodes = block.targets.map { this.getNodes(it, language) }

                val goa = nodes[0].id
                val gob = nodes[1].id

                val node =
                    BoolBranchNodeGen.create( true, goa, gob, instruction.target, cond)
                node.successors = intArrayOf(goa, gob)

                res.add(node)
            }
//types: "beq.s","beq"
            if (instruction.instruction.startsWith("beq") && instruction is InstructionBrTarget) {

                val s0 = stack.pop()

                val s1 = stack.pop()

                val nodes = block.targets.map { this.getNodes(it, language) }

                val goa = nodes[0].id
                val gob = nodes[1].id

                val node = BoolBranchNodeGen.create(
                    true,
                    goa,
                    gob,
                    instruction.target,
                    CompareNodeGen.create(CompareCondition.EQ, false, s1.second, s0.second)
                )
                node.successors = intArrayOf(goa, gob)

                res.add(node)
            }
//types: "bge.s","bge.un.s","bge","bge.un"
            if (instruction.instruction.startsWith("bge") && instruction is InstructionBrTarget) {
                val s0 = stack.pop()
                val s1 = stack.pop()

                val nodes = block.targets.map { this.getNodes(it, language) }

                val goa = nodes[0].id
                val gob = nodes[1].id

//                val node = CondBranch(s1.second, s0.second, "ge", goa, gob, instruction.target)
                val node = BoolBranchNodeGen.create(
                    true,
                    goa,
                    gob,
                    instruction.target,
                    CompareNodeGen.create(CompareCondition.GE, false, s1.second, s0.second)
                )
                node.successors = intArrayOf(goa, gob)

                res.add(node)
            }
//types: "bgt.s","bgt.un.s","bgt","bgt.un"
            if (instruction.instruction.startsWith("bgt") && instruction is InstructionBrTarget) {
                TODO("not implemented")
                val s0 = stack.pop()

                val s1 = stack.pop()


                // val node = null
// res.add(node)
            }
//types: "ble.s","ble.un.s","ble","ble.un"
            if (instruction.instruction.startsWith("ble") && instruction is InstructionBrTarget) {
                val s0 = stack.pop()
                val s1 = stack.pop()

                val nodes = block.targets.map { this.getNodes(it, language) }

                val goa = nodes[0].id
                val gob = nodes[1].id

//                val node = CondBranch(s1.second, s0.second, "ge", goa, gob, instruction.target)
                val node = BoolBranchNodeGen.create(
                    true,
                    goa,
                    gob,
                    instruction.target,
                    CompareNodeGen.create(CompareCondition.LE, false, s1.second, s0.second)
                )
                node.successors = intArrayOf(goa, gob)

                res.add(node)
            }
//types: "blt.s","blt.un.s","blt","blt.un"
            if (instruction.instruction.startsWith("blt") && instruction is InstructionBrTarget) {
                val s0 = stack.pop()
                val s1 = stack.pop()

                val nodes = block.targets.map { this.getNodes(it, language) }

                val goa = nodes[0].id
                val gob = nodes[1].id

//                val node = CondBranch(s1.second, s0.second, "ge", goa, gob, instruction.target)
                val node = BoolBranchNodeGen.create(
                    true,
                    goa,
                    gob,
                    instruction.target,
                    CompareNodeGen.create(CompareCondition.LT, false, s1.second, s0.second)
                )
                node.successors = intArrayOf(goa, gob)

                res.add(node)
            }
//types: "bne.un.s","bne.un"
            if (instruction.instruction.startsWith("bne") && instruction is InstructionBrTarget) {
                TODO("not implemented")
                val s0 = stack.pop()

                val s1 = stack.pop()


                // val node = null
// res.add(node)
            }
//types: "box"
            if (instruction.instruction.startsWith("box") && instruction is InstructionType) {
                TODO("not implemented")
                val s0 = stack.pop()


                //val node = null
                //stack.push(Pair("Ref", node))
            }
//types: "call"
            if (instruction.instruction == "call" && instruction is InstructionMethod) {

                val args = instruction.method.arguments.map { stack.pop() }

                val thisValue = if (instruction.method.static) {
                    LoadConst(0, Long::class)
                } else {
                    stack.pop().second
                }

//                if (instruction.method.name == "Write") {
//                    res.add(
//                        ConsoleWrite(
//                            args.map { it.second }.toTypedArray()
//                        )
//                    )
//                    continue
//                } else if(instruction.method.name == "WriteLine") {
//                    res.add(
//                        ConsoleWriteLine(
//                            args.map { it.second }.toTypedArray()
//                        )
//                    )
//                    continue
//                }

                if (instruction.method.name == ".ctor") {
                    res.add(
                        Call(
                            Method(instruction.method.toString(), null),
                            (listOf(thisValue) + args.map { it.second }.reversed()).toTypedArray()
                        )
                    );
                    continue
                }

                val node = if (compileNode.method.memberOf == null) {
                    error("Expression 'compileNode.method.memberOf' must not be null")
                } else {
//                    val callee = compileNode.method.memberOf!!.compileNode.methods.getValue("${instruction.method.name}(${instruction.method.arguments.joinToString(",")})")

                    val method = context.types.getValue(instruction.method.memberOf!!.fullName).members.getValue(
                        instruction.method.toString()
                    )
                    Call(
                        method,
                        args.map { it.second }.reversed().toTypedArray()
                    )
                }

                if (instruction.method.returnType == "void") {
                    res.add(node);
                } else {
                    stack.push(Pair(instruction.method.returnType, node))
                }
            }
//types: "calli"
            if (instruction.instruction.startsWith("calli") && instruction is InstructionSig) {
                TODO("not implemented")

                // val node = null
// res.add(node)
            }
//types: "conv.i1","conv.i2","conv.i4","conv.i8","conv.r4","conv.r8","conv.u4","conv.u8","conv.r.un","conv.ovf.i1.un","conv.ovf.i2.un","conv.ovf.i4.un","conv.ovf.i8.un","conv.ovf.u1.un","conv.ovf.u2.un","conv.ovf.u4.un","conv.ovf.u8.un","conv.ovf.i.un","conv.ovf.u.un","conv.ovf.i1","conv.ovf.u1","conv.ovf.i2","conv.ovf.u2","conv.ovf.i4","conv.ovf.u4","conv.ovf.i8","conv.ovf.u8","conv.u2","conv.u1","conv.i","conv.ovf.i","conv.ovf.u","conv.u"
            if (instruction.instruction.startsWith("conv") && instruction is InstructionNone) {
                val s0 = stack.pop()


//                val node = null
                stack.push(Pair("int32", s0.second))
            }
//types: "callvirt"
            if (instruction.instruction.startsWith("callvirt") && instruction is InstructionMethod) {
//                println(instruction.method)
                val args = instruction.method.arguments.map { stack.pop() }

                val thisValue = if (instruction.method.static) {
                    LoadConst(0, Long::class)
                } else {
                    stack.pop().second
                }

                val node = if (compileNode.method.memberOf == null) {
                    error("Expression 'compileNode.method.memberOf' must not be null")
                } else {
//                    val callee = compileNode.method.memberOf!!.compileNode.methods.getValue("${instruction.method.name}(${instruction.method.arguments.joinToString(",")})")
//                    val clr = language as Clr
//                    val method = clr.methods.functions.getValue(instruction.method.toString())
                    CallVirtual(
                        compileNode.method.toString(),
                        args.map { it.second }.toTypedArray()
                    )
                }

                if (instruction.method.returnType == "void") {
                    res.add(node);
                } else {
                    stack.push(Pair(instruction.method.returnType, node))
                }
            }
//types: "cpobj"
            if (instruction.instruction.startsWith("cpobj") && instruction is InstructionType) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "int32") {
                    error("")
                }
                val s1 = stack.pop()
                if (s1.first != "int32") {
                    error("")
                }

                // val node = null
// res.add(node)
            }
//types: "castclass"
            if (instruction.instruction.startsWith("castclass") && instruction is InstructionType) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "Ref") {
                    error("")
                }

                //val node = null
                //stack.push(Pair("Ref", node))
            }
//types: "ckfinite"
            if (instruction.instruction.startsWith("ckfinite") && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()


                //val node = null
                //stack.push(Pair("float64", node))
            }
//types: "ceq"
            if (instruction.instruction.startsWith("ceq") && instruction is InstructionNone) {
                val s0 = stack.pop()

                val s1 = stack.pop()

                val node = CompareNodeGen.create(CompareCondition.EQ, false, s1.second, s0.second)
                stack.push(Pair("int32", node))
            }
//types: "cgt","cgt.un"
            if (instruction.instruction.startsWith("cgt") && instruction is InstructionNone) {
                val s0 = stack.pop()

                val s1 = stack.pop()


                val node = CompareNodeGen.create(CompareCondition.GT, false, s1.second, s0.second)
                stack.push(Pair("int32", node))
            }
//types: "clt","clt.un"
            if (instruction.instruction.startsWith("clt") && instruction is InstructionNone) {
                val s0 = stack.pop()

                val s1 = stack.pop()


                val node = CompareNodeGen.create(CompareCondition.LT, false, s1.second, s0.second)
                stack.push(Pair("int32", node))
            }
//types: "constrained."
            if (instruction.instruction.startsWith("constrained") && instruction is InstructionType) {
                TODO("not implemented")

                // val node = null
// res.add(node)
            }
//types: "cpblk"
            if (instruction.instruction.startsWith("cpblk") && instruction is InstructionNone) {
                TODO("not implemented")
                val s0 = stack.pop()
                if (s0.first != "int32") {
                    error("")
                }
                val s1 = stack.pop()
                if (s1.first != "int32") {
                    error("")
                }
                val s2 = stack.pop()
                if (s2.first != "int32") {
                    error("")
                }

                // val node = null
// res.add(node)
            }
//types: "codelabel"
            if (instruction.instruction.startsWith("codelabel") && instruction is InstructionNone) {
                TODO("not implemented")

                // val node = null
// res.add(node)
            }
//            println("$index, $instruction, $res, $stack")
        }

        if (!stack.empty() && block.targets.size == 1) {
            if (block.instructions.last() is InstructionBrTarget && block.targets.size == 1) {
                res.removeAt(res.lastIndex)
            }
            block = nodes[block.targets.first()]
            block.stolen = 1
//            println(stack)
//            error("Stack should be empty at the end of a block")
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
