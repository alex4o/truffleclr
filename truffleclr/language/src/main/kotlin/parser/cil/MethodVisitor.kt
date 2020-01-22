package parser.cil

import Cil.CilParser
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
        var labelText = if(ctx.id() != null) {
            ctx.id().text
        }else{
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

        var instruction: Instruction = when (instr) {
            is CilParser.Instr_noneContext -> {
                InstructionNone(instr.INSTR_NONE().text)
            }
            is CilParser.Instr_brtargetContext -> {
                method.jumpLabels.add(instr.id().text)
                InstructionBrTarget(instr.INSTR_BRTARGET().text, instr.id().text)
            }
            is CilParser.Instr_iContext -> {
                val arg: Int = if(instr.int64().text.startsWith("0x"))
                {
                    instr.int64().text.substring(2).toInt(16)
                }else{
                    instr.int64().text.toInt(10)
                }
                InstructionI(instr.INSTR_I().text, arg)
            }
            is CilParser.Instr_methodContext -> {
                val methodRef = instr.methodRef();

                val methodName = methodRef.methodName().text
//                val callConv = methodRef.callConv().text


                var arguments = listOf<String>()

                if (methodRef.sigArgs0().sigArgs1() != null) {
                    arguments = methodRef.sigArgs0().sigArgs1().sigArg().map { it.text }
                }

                val method = IlMethod(methodName, arguments)
                if (!methodRef.typeSpec().isEmpty) {

                    val typeSpec = methodRef.typeSpec()
                    if(typeSpec.type() == null) {
                        println("$methodName ${typeSpec.text}")
                    }else{
                        if (typeSpec.type().text == "object") {
                            method.memberOf = IlType("object")
                        }

                        if (typeSpec.type().K_CLASS() != null) {

                            val className = typeSpec.type().className().slashedName().text.split(".")

                            method.memberOf = IlType(className.joinToString("."))
//                            method.memberOf!!.namespace = className.dropLast(1).joinToString(".")
                        }
                    }


                }

                method.returnType = methodRef.type().text

                InstructionMethod(instr.INSTR_METHOD().text, method)
            }
            is CilParser.Instr_stringContext -> {

                InstructionString(instr.INSTR_STRING().toString(), instr.compQstring().text)
            }
            is CilParser.Instr_typeContext -> {
                InstructionType(instruction = instr.INSTR_TYPE().text)
            }
            is CilParser.Instr_fieldContext -> {
                InstructionField(instruction = instr.INSTR_FIELD().text)
            }
            is CilParser.Instr_varContext -> {
                InstructionVar(instruction = instr.INSTR_VAR().text)
            }
            else -> {
                throw Exception("Unknown instruction detected: ${instr.text}")
            }
        }

        method.instructions.add(instruction)

        if (label != null) {
            method.labels[labelText] = method.instructions.lastIndex
        }


        return instruction
    }

}