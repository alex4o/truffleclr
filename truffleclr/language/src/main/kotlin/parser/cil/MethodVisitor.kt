package parser.cil

import Cil.CilParser
import org.antlr.v4.runtime.ParserRuleContext
import parser.generic.IlAppDomain
import parser.generic.IlMethod
import parser.generic.IlType
import parser.generic.instruction.*

class MethodVisitor(var appDomain: IlAppDomain, var method: IlMethod) : Cil.CilBaseVisitor<Any>() {

    var instructions = mutableListOf<Pair<String, Instruction>>()
    var labels = mutableMapOf<String, Int>()
    var entryPoint: String? = null

    override fun visitMethod_entrypoint(ctx: CilParser.Method_entrypointContext): Any {
        appDomain.entryPoint = method
        return method
    }

    override fun visitMethod_locals(ctx: CilParser.Method_localsContext): Any {
        method.locals = ctx.sigArgs0().sigArgs1().sigArg().map { it.type().text }
        return method.locals
    }

    override fun visitMethod_maxstack(ctx: CilParser.Method_maxstackContext): Any {
        method.maxstack = ctx.int32().text.toInt()
        return method.maxstack
    }

    override fun visitMethod_instruction(ctx: CilParser.Method_instructionContext): Any {
        val label = ctx.id()
        var labelText = if (ctx.id() != null) {
            ctx.id().text
        } else {
            ""
        }


        val instr = ctx.instr().getChild(0);

        if (entryPoint == null) {
            entryPoint = if (label.isEmpty) {
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
                is CilParser.Instr_iContext -> {
                    val arg: Int = if (int64().text.startsWith("0x")) {
                        int64().text.substring(2).toInt(16)
                    } else {
                        int64().text.toInt(10)
                    }
                    InstructionI(INSTR_I().text, arg)
                }
                is CilParser.Instr_methodContext -> {
                    val methodRef = methodRef();

                    val method = extractFromMethodRef(methodRef)
                    InstructionMethod(INSTR_METHOD().text, method)
                }
                is CilParser.Instr_stringContext -> {
                    InstructionString(INSTR_STRING().toString(), compQstring().text)
                }
                is CilParser.Instr_typeContext -> {
                    InstructionType(INSTR_TYPE().text)
                }
                is CilParser.Instr_fieldContext -> {
                    InstructionField(INSTR_FIELD().text)
                }
                is CilParser.Instr_varContext -> {
                    if(INSTR_VAR().text.endsWith(".s")) {
                        InstructionVarS(INSTR_VAR().text, id().text)
                    }else{
                        InstructionVar(INSTR_VAR().text, int32().text.toInt())
                    }
                }
                else -> {
                    throw Exception("Unknown instruction detected: ${instr.text}")
                }
            }
        }

        method.instructions.add(instruction)

        if (label != null) {
            method.labels[labelText] = method.instructions.lastIndex
        }


        return instruction
    }



}