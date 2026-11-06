package parser.cil

import Cil.CilParser
import metadata.CodeBoundary
import metadata.IlAppDomain
import metadata.IlMethod
import metadata.genericDefinitionName
import metadata.instruction.*

/**
 * Visits the declarations inside of a method.
 * Collects all the instructions and useful method attributes.
 */
class MethodVisitor(var appDomain: IlAppDomain, var method: IlMethod) : Cil.CilBaseVisitor<Any>() {

    var instructions = mutableListOf<Pair<String, Instruction>>()
    var labels = mutableMapOf<String, Int>()
    var entryPoint: String? = null

    private var byteOffset = 0
    private fun mark() = CodeBoundary.Index(method.instructions.size)

    private fun boundary(ctx: org.antlr.v4.runtime.tree.ParseTree): CodeBoundary =
        if (ctx is CilParser.IdContext) CodeBoundary.Label(ctx.text)
        else CodeBoundary.Offset(ctx.text.let { if (it.startsWith("0x")) it.drop(2).toInt(16) else it.toInt() })

    private fun instructionSize(instruction: Instruction): Int {
        val opcode = instruction.instruction
        val opcodeBytes = if (opcode in twoByteOpcodes) 2 else 1
        val operandBytes = when (instruction) {
            is InstructionNone -> 0
            is InstructionVar, is InstructionVarS -> if (opcode.endsWith(".s")) 1 else 2
            is InstructionI -> if (opcode == "ldc.i4.s" || opcode == "unaligned.") 1 else 4
            is InstructionI8, is InstructionR8 -> 8
            is InstructionR -> 4
            is InstructionBrTarget -> if (opcode.endsWith(".s")) 1 else 4
            is InstructionSwitch -> 4 + instruction.targets.size * 4
            is InstructionMethod, is InstructionField, is InstructionType, is InstructionString -> 4
            else -> error("Unknown instruction size: $opcode")
        }
        return opcodeBytes + operandBytes
    }

    companion object {
        private val twoByteOpcodes = setOf(
            "arglist", "ceq", "cgt", "cgt.un", "clt", "clt.un", "ldftn", "ldvirtftn",
            "ldarg", "ldarga", "starg", "ldloc", "ldloca", "stloc", "localloc", "endfilter",
            "unaligned.", "volatile.", "tail.", "initobj", "constrained.", "cpblk", "initblk",
            "rethrow", "sizeof", "refanytype", "readonly."
        )
    }

    override fun visitSehBlock(ctx: CilParser.SehBlockContext): Any {
        val block = ctx.tryBlock()
        val start: CodeBoundary
        val end: CodeBoundary
        if (block.scopeBlock() != null) {
            start = mark(); visit(block.scopeBlock()); end = mark()
        } else {
            start = boundary(block.getChild(1))
            end = boundary(block.getChild(3))
        }
        var clauses: CilParser.SehClausesContext? = ctx.sehClauses()
        while (clauses != null) {
            val clause = clauses.sehClause()
            val filter = clause.filterClause()
            val filterStart = if (filter == null) null else if (filter.scopeBlock() != null) {
                mark().also { visit(filter.scopeBlock()) }
            } else boundary(filter.getChild(1))
            val handler = clause.handlerBlock()
            val handlerStart: CodeBoundary
            val handlerEnd: CodeBoundary
            if (handler.scopeBlock() != null) {
                handlerStart = mark(); visit(handler.scopeBlock()); handlerEnd = mark()
            } else {
                handlerStart = boundary(handler.getChild(1))
                handlerEnd = boundary(handler.getChild(3))
            }
            val kind = when {
                clause.catchClause() != null -> "catch"
                filter != null -> "filter"
                clause.finallyClause() != null -> "finally"
                else -> "fault"
            }
            method.exceptionClauses.add(metadata.ExceptionClause(start, end, handlerStart, handlerEnd,
                kind, clause.catchClause()?.typeSpec()?.toClassName(), filterStart))
            clauses = clauses.sehClauses()
        }
        return method
    }

    override fun visitMethod_label(ctx: CilParser.Method_labelContext): Any {
        method.labels[ctx.id().text] = method.instructions.size
        return method
    }

    override fun visitMethod_entrypoint(ctx: CilParser.Method_entrypointContext): Any {
        appDomain.entryPoint = method
        return method
    }

    override fun visitMethod_override(ctx: CilParser.Method_overrideContext): Any {
        val owner = ctx.typeSpec().toClassName()
        val name = ctx.methodName().text.trim('\'')
        val ownerDefinition = appDomain.getType(owner.genericDefinitionName())
        val signature = (ctx.type()?.text ?: "") + (ctx.sigArgs0()?.text ?: "")
        val namedParameters = Regex("!!([A-Za-z_][A-Za-z_0-9]*)").findAll(signature).map { it.groupValues[1] }.toSet()
        val methodParameters = if (namedParameters.isEmpty()) emptyList() else {
            val count = ctx.sigArgs0()?.sigArgs1()?.sigArg()?.size ?: 0
            val candidates = ownerDefinition.methods.values.filter {
                it.name == name && it.arguments.size == count && it.genericParameters.containsAll(namedParameters)
            }.map { it.genericParameters }.distinct()
            require(candidates.size == 1) { "Cannot resolve named generic parameters in " + ctx.text }
            candidates.single()
        }
        // Signature names belong to the referenced declaration; owner arguments
        // belong to the implementing method's context.
        val arguments = ctx.sigArgs0()?.sigArgs1()?.sigArg()?.map {
            "" to it.type().getType(appDomain, ownerDefinition.genericParameters, methodParameters)
        } ?: method.arguments
        val reference = IlMethod(name, arguments)
        reference.genericParameters = methodParameters
        reference.memberOf = appDomain.getType(owner.normalizeParameters(method.memberOf!!.genericParameters, method.genericParameters))
        reference.returnType = ctx.type()?.getType(appDomain, ownerDefinition.genericParameters, methodParameters) ?: method.returnType
        method.overrideReferences.add(reference)
        return method
    }

    override fun visitMethod_locals(ctx: CilParser.Method_localsContext): Any {
        method.locals = ctx.sigArgs0().sigArgs1().sigArg().map { it.type().getType(appDomain, method.memberOf!!.genericParameters, method.genericParameters) }
        return method.locals
    }

    override fun visitMethod_maxstack(ctx: CilParser.Method_maxstackContext): Any {
        method.maxstack = ctx.int32().text.toInt()
        return method.maxstack
    }

    /**
     * Parse the instruction into the Instruction Class
     */
    override fun visitMethod_instruction(ctx: CilParser.Method_instructionContext): Any {
        val label = ctx.id()
        var labelText = if (ctx.id() != null) {
            ctx.id().text
        } else {
            ""
        }

        val instr = ctx.instr().getChild(0);

        if (entryPoint == null) {
            entryPoint = if (label == null || label.isEmpty) {
                "ENTRY_POINT"
            } else {
                labelText
            }
            labelText = entryPoint
        }



        var instruction: Instruction = instr.run {
            when (this) {
                is CilParser.Instr_noneContext -> {
                    InstructionNone(INSTR_NONE().text)
                }
                is CilParser.Instr_brtargetContext -> {
                    method.jumpLabels.add(id().text)
                    InstructionBrTarget(INSTR_BRTARGET().text, id().text)
                }
                is CilParser.Instr_switchContext -> {
                    val operands = generateSequence(labels()) { it.labels() }.toList()
                    require(operands.none { it.int32() != null }) { "Numeric switch destinations are unsupported; use IL labels" }
                    val targets = operands.mapNotNull { it.id()?.text }
                    method.jumpLabels.addAll(targets)
                    InstructionSwitch(INSTR_SWITCH().text, targets)
                }
                is CilParser.Instr_iContext -> {
                    val arg: Int = if (int64().text.startsWith("0x")) {
                        Integer.parseUnsignedInt(int64().text.substring(2), 16)
                    } else {
                        int64().text.toInt(10)
                    }
                    InstructionI(INSTR_I().text, arg)
                }
                is CilParser.Instr_i8Context -> {
                    val literal = int64().text
                    val value = if (literal.startsWith("0x")) {
                        java.lang.Long.parseUnsignedLong(literal.substring(2), 16)
                    } else literal.toLong()
                    InstructionI8(INSTR_I8().text, value)
                }
                is CilParser.Instr_methodContext -> {
                    val methodRef = methodRef();

                    val method = extractFromMethodRefTest(methodRef)
                    var callConv = setOf<String>()
                    if(methodRef.callConv().K_INSTANCE().size != 0) {
                        callConv += setOf("instance")
                    }
                    if(methodRef.callConv().K_EXPLICIT().size != 0) {
                        callConv += setOf("explicit")
                    }

                    InstructionMethod(INSTR_METHOD().text, method, callConv)
                }
                is CilParser.Instr_stringContext -> {
                    InstructionString(INSTR_STRING().toString(), compQstring().text.replace("\\t", "\t"))
                }
                is CilParser.Instr_typeContext -> {
                    InstructionType(INSTR_TYPE().text, typeSpec().toClassName().normalizeParameters(method.memberOf!!.genericParameters, method.genericParameters))
                }
                is CilParser.Instr_fieldContext -> {
                    InstructionField(INSTR_FIELD().text, type().toClassName(), typeSpec().toClassName().normalizeParameters(method.memberOf!!.genericParameters, method.genericParameters), dottedName().text.trim('\''))
                }
                is CilParser.Instr_varContext -> {
                    if (id() != null) {
                        InstructionVarS(INSTR_VAR().text, id().text)
                    }else{
                        InstructionVar(INSTR_VAR().text, int32().text.toInt())
                    }
                }
                is CilParser.Instr_rContext -> {
                    if(INSTR_R().text.endsWith(".r8")) {
                        InstructionR8(INSTR_R().text, if(f != null) {
                            f.text.toDouble()
                        }else if(i != null) {
                            i.text.toDouble()
                        }else{
                            error("")
                        })
                    }else{
                        InstructionR(INSTR_R().text, if(f != null) {
                            f.text.toFloat()
                        }else{
                            error("")
                        })
                    }
                }
                else -> {
                    throw Exception("Unknown instruction detected: ${instr.text}")
                }
            }
        }

        byteOffset += instructionSize(instruction)
        method.instructionOffsets[byteOffset] = method.instructions.size + 1

        val split = instruction.instruction.split(".")

        instruction.instructionArgs.addAll(split.drop(1))
        instruction.instruction = split[0]

        method.instructions.add(instruction)

        if (label != null) {
            method.labels[labelText] = method.instructions.lastIndex
        }


        return instruction
    }



}