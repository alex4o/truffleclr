package parser.cil

import Cil.CilParser
import parser.generic.AppDomain
import parser.generic.Method
import parser.generic.Type
import parser.generic.instruction.*

class MethodVisitor(var appDomain: AppDomain, var method: Method) : Cil.CilBaseVisitor<Any>() {

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
        var labelText = ctx.id().text
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

                val method = Method(methodName, arguments)
                if (!methodRef.typeSpec().isEmpty) {

                    val typeSpec = methodRef.typeSpec()
                    if (typeSpec.type().text == "object") {
                        method.memberOf = Type("object")
                    }

                    if (typeSpec.type().K_CLASS() != null) {

                        val className = typeSpec.type().className().slashedName().text.split(".")

                        method.memberOf = Type(className.last())
                        method.memberOf!!.namespace = className.dropLast(1).joinToString(".")
                    }
                }

                method.returnType = methodRef.type().text

                InstructionMethod(instr.INSTR_METHOD().text, method)
            }
            is CilParser.Instr_stringContext -> {

                InstructionString(instr.INSTR_STRING().toString(), instr.compQstring().text)
            }
            else -> {
                throw Exception("Unknown instruction detected: ${instr.text}")
            }
        }

        method.instructions.add(instruction)

        if (!label.isEmpty) {
            method.labels[labelText] = method.instructions.lastIndex
        }


        return instruction
    }

}