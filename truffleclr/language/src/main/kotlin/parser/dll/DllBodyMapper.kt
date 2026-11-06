package parser.dll

import com.google.gson.JsonObject
import metadata.CodeBoundary
import metadata.ExceptionClause
import metadata.IlMethod
import metadata.instruction.*

/** The native stream combines prefixes with their following instruction. Expand
 * once, then remap every control-flow/EH boundary through the same index table.
 */
internal class DllBodyMapper(private val metadata: DllMetadataMapper) {
    fun map(method: IlMethod, body: JsonObject) {
        val source = body.items("code")
        val expanded = source.map(::instruction)
        val boundaries = IntArray(source.size + 1)
        for (index in source.indices) boundaries[index + 1] = boundaries[index] + expanded[index].size
        fun position(index: Int): Int {
            require(index in boundaries.indices) { "Invalid DLL instruction boundary $index in $method" }
            return boundaries[index]
        }
        // Targets remain symbolic while expansion is computed; labels and EH are
        // both assigned from sourceToExpanded, including the exclusive end entry.
        source.forEach { instruction ->
            instruction.optional("target")?.let {
                require(it.asInt in source.indices) { "Invalid DLL branch target ${it.asInt}" }
            }
            instruction.optional("targets")?.asJsonArray?.forEach {
                require(it.asInt in source.indices) { "Invalid DLL switch target ${it.asInt}" }
            }
        }
        val locals = body.items("locals").map {
            if (it.text("kind") != "variable") unsupported("typed-reference local in $method")
            metadata.modifiers(it)
            val type = metadata.type(it.getAsJsonObject("type"))
            if (it.flag("by_ref")) type.makeByRef() else type
        }
        val clauses = body.items("eh").map { clause ->
            fun boundary(key: String) = CodeBoundary.Index(position(clause.get(key).asInt))
            val kind = clause.text("kind")
            require(kind in setOf("catch", "filter", "finally", "fault")) { "Unknown DLL EH kind $kind" }
            val tryStart = boundary("try_start")
            val tryEnd = boundary("try_end")
            val handlerStart = boundary("handler_start")
            val handlerEnd = boundary("handler_end")
            require(tryStart.instruction < tryEnd.instruction && handlerStart.instruction < handlerEnd.instruction) {
                "Empty or reversed DLL exception range in $method"
            }
            ExceptionClause(tryStart, tryEnd, handlerStart, handlerEnd, kind,
                clause.optional("catch_type")?.let { metadata.type(it.asJsonObject).name },
                clause.optional("filter_start")?.let { CodeBoundary.Index(position(it.asInt)) })
        }
        method.locals = locals
        method.initLocals = body.flag("init_locals")
        method.pinnedLocals = body.items("locals").mapIndexedNotNull { index, local -> index.takeIf { local.flag("pinned") } }.toSet()
        method.maxstack = body.get("max_stack").asInt
        method.instructions = expanded.flatten().toMutableList()
        method.labels.clear()
        boundaries.forEachIndexed { index, expandedIndex -> method.labels[label(index)] = expandedIndex }
        method.exceptionClauses.clear()
        method.exceptionClauses.addAll(clauses)
    }

    private fun instruction(value: JsonObject): List<Instruction> {
        val op = value.text("op")
        for (flag in listOf("skip_type_check", "skip_range_check", "skip_null_check")) {
            if (value.flag(flag)) unsupported("$op with $flag")
        }
        if (op in setOf("LoadFieldSkipNullCheck", "StoreFieldSkipNullCheck")) unsupported(op)
        val prefix = mutableListOf<Instruction>()
        value.optional("unaligned")?.let {
            val alignment = it.asInt
            require(alignment in setOf(1, 2, 4)) { "Invalid DLL unaligned prefix: $alignment" }
            prefix.add(InstructionI("unaligned", alignment))
        }
        if (value.flag("volatile")) prefix.add(InstructionNone("volatile"))
        if (value.flag("tail_call") || op == "CallVirtualTail") prefix.add(InstructionNone("tail"))
        if (op == "CallVirtualConstrained") prefix.add(InstructionType("constrained", metadata.type(value.getAsJsonObject("type")).name))
        if (op == "LoadElementAddressReadonly") prefix.add(InstructionNone("readonly"))

        fun none(mnemonic: String): Instruction = InstructionNone(mnemonic)
        fun typed(mnemonic: String): Instruction = InstructionType(mnemonic, metadata.type(value.getAsJsonObject("type")).name)
        fun variable(mnemonic: String): Instruction = InstructionVar(mnemonic, value.get("index").asInt)
        fun branch(mnemonic: String): Instruction = InstructionBrTarget(mnemonic, label(value.get("target").asInt))
        fun call(mnemonic: String): Instruction {
            val method = metadata.methodReference(value.getAsJsonObject("method"))
            return InstructionMethod(mnemonic, method, if (method.static) emptySet() else setOf("instance"))
        }
        fun field(mnemonic: String): Instruction {
            val (type, owner, name) = metadata.fieldReference(value.getAsJsonObject("field"))
            return InstructionField(mnemonic, type, owner, name)
        }
        fun primitiveInstruction(mnemonic: String): Instruction = none("$mnemonic.${primitive(value.text("type"))}")
        val instruction = when (op) {
            "NoOperation" -> none("nop")
            "Breakpoint" -> none("break")
            "LoadNull" -> none("ldnull")
            "Duplicate" -> none("dup")
            "Pop" -> none("pop")
            "Return" -> none("ret")
            "Throw" -> none("throw")
            "Rethrow" -> none("rethrow")
            "EndFilter" -> none("endfilter")
            "EndFinally" -> none("endfinally")
            "Add" -> none("add")
            "Subtract" -> none("sub")
            "Multiply" -> none("mul")
            "Divide" -> none("div")
            "Remainder" -> none("rem")
            "And" -> none("and")
            "Or" -> none("or")
            "Xor" -> none("xor")
            "ShiftLeft" -> none("shl")
            "ShiftRight" -> none("shr")
            "Negate" -> none("neg")
            "CompareEqual" -> none("ceq")
            "CompareGreater" -> none("cgt")
            "CompareLess" -> none("clt")
            "Branch" -> branch("br")
            "BranchEqual" -> branch("beq")
            "BranchNotEqual" -> branch("bne.un")
            "BranchGreaterOrEqual" -> branch("bge")
            "BranchGreater" -> branch("bgt")
            "BranchLessOrEqual" -> branch("ble")
            "BranchLess" -> branch("blt")
            "BranchFalsy" -> branch("brfalse")
            "BranchTruthy" -> branch("brtrue")
            "Leave" -> branch("leave")
            "Switch" -> InstructionSwitch("switch", value.getAsJsonArray("targets").map { label(it.asInt) })
            "LoadArgument" -> variable("ldarg")
            "LoadArgumentAddress" -> variable("ldarga")
            "StoreArgument" -> variable("starg")
            "LoadLocal" -> variable("ldloc")
            "LoadLocalAddress" -> variable("ldloca")
            "StoreLocal" -> variable("stloc")
            "LoadConstantInt32" -> InstructionI("ldc.i4", value.get("value").asInt)
            "LoadConstantInt64" -> InstructionI8("ldc.i8", value.get("value").asLong)
            "LoadConstantFloat32" -> InstructionR("ldc.r4", Float.fromBits(value.get("bits").asLong.toInt()))
            "LoadConstantFloat64" -> InstructionR8("ldc.r8", Double.fromBits(value.get("bits").asBigInteger.toLong()))
            // CilCompiler strips only the two delimiters; no escaping/unescaping
            // or UTF-8 round trip may alter literal UTF-16 units, including surrogates.
            "LoadString" -> InstructionString("ldstr", "\"" + utf16(value.get("value")) + "\"")
            "Convert" -> primitiveInstruction("conv")
            "ConvertFloat32" -> none("conv.r4")
            "ConvertFloat64" -> none("conv.r8")
            "ConvertUnsignedToFloat" -> none("conv.r.un")
            "LoadIndirect" -> primitiveInstruction("ldind")
            "StoreIndirect" -> primitiveInstruction("stind")
            "LoadElementPrimitive" -> primitiveInstruction("ldelem")
            "StoreElementPrimitive" -> primitiveInstruction("stelem")
            "Call" -> call("call")
            "CallVirtual", "CallVirtualConstrained", "CallVirtualTail" -> call("callvirt")
            "NewObject" -> call("newobj")
            "BoxValue" -> typed("box")
            "CastClass" -> typed("castclass")
            "CopyObject" -> typed("cpobj")
            "InitializeForObject" -> typed("initobj")
            "IsInstance" -> typed("isinst")
            "LoadElement" -> typed("ldelem")
            "LoadElementAddress", "LoadElementAddressReadonly" -> typed("ldelema")
            "LoadLength" -> none("ldlen")
            "LoadObject" -> typed("ldobj")
            "NewArray" -> typed("newarr")
            "StoreElement" -> typed("stelem")
            "StoreObject" -> typed("stobj")
            "UnboxIntoAddress" -> typed("unbox")
            "UnboxIntoValue" -> typed("unbox.any")
            "LoadField" -> field("ldfld")
            "LoadFieldAddress" -> field("ldflda")
            "LoadStaticField" -> field("ldsfld")
            "LoadStaticFieldAddress" -> field("ldsflda")
            "StoreField" -> field("stfld")
            "StoreStaticField" -> field("stsfld")
            // These cannot be approximated by unchecked math, normal calls, or
            // generic operands. Fail before bytecode generation, naming the variant.
            else -> unsupported("instruction $op")
        }
        val parts = instruction.instruction.split('.')
        instruction.instruction = parts.first()
        instruction.instructionArgs.addAll(parts.drop(1))
        if (value.optional("sign")?.asString == "unsigned") instruction.instructionArgs.add("un")
        prefix.add(instruction)
        return prefix
    }

    private fun primitive(type: String): String = when (type) {
        "Int8" -> "i1"
        "UInt8" -> "u1"
        "Int16" -> "i2"
        "UInt16" -> "u2"
        "Int32" -> "i4"
        "UInt32" -> "u4"
        "Int64" -> "i8"
        "UInt64" -> "u8"
        "Float32" -> "r4"
        "Float64" -> "r8"
        "IntPtr" -> "i"
        "UIntPtr" -> "u"
        "Object" -> "ref"
        else -> unsupported("primitive operand $type")
    }

    private fun label(index: Int) = "dll_$index"
}
