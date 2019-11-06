package parser.cil

import Cil.CilParser
import parser.generic.AppDomain
import parser.generic.Method
import parser.generic.instruction.*

class MethodVisitor(var appDomain: AppDomain, var method: Method) : Cil.CilBaseVisitor<Any>() {
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
        var label = ctx.id()
        val instr = ctx.instr().getChild(0);
        var instruction: Instruction = when(instr) {
            is CilParser.Instr_noneContext -> {
                InstructionNone(instr.INSTR_NONE().text)
            }
            is CilParser.Instr_brtargetContext -> {
                InstructionBrTarget(instr.INSTR_BRTARGET().text, instr.id().text)
            }
            is CilParser.Instr_methodContext -> {
                val methodName = instr.methodRef().methodName().text
                var arguments = listOf<String>()

                if(instr.methodRef().sigArgs0().sigArgs1() != null){
                    arguments = instr.methodRef().sigArgs0().sigArgs1().sigArg().map { it.text }
                }

                val method = Method(methodName, arguments)
                method.returnType = instr.methodRef().type().text

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
        return instruction
    }

}