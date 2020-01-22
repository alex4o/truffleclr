package parser.cil

import Cil.CilParser
import parser.generic.IlAppDomain
import parser.generic.IlField
import parser.generic.IlMethod
import parser.generic.IlType

class ClassVisitor(var appDomain: IlAppDomain, var type: IlType) : Cil.CilBaseVisitor<Any>() {

    override fun visitClass_method(ctx: CilParser.Class_methodContext): Any {
        val name = ctx.methodHead().methodName().text

        var arguments = listOf<String>()

        if(ctx.methodHead().sigArgs0().sigArgs1() != null){
            arguments = ctx.methodHead().sigArgs0().sigArgs1().sigArg().map { it.type().text /*+ " " + it.id().text*/ }
        }

        val method = IlMethod(
            name,
            arguments
        )

        method.static = ctx.methodHead().methAttr().map { it.text }.toSet().contains("static")

        method.memberOf = type
        method.returnType = ctx.methodHead().type().text
        type.methods["$name(${arguments.joinToString(",")})"] = method

        ctx.methodDecls().accept(MethodVisitor(appDomain, method))
        return method
    }

    override fun visitClass_field(ctx: CilParser.Class_fieldContext): Any {
        var name = ctx.fieldDecl().dottedName().text
        type.fields[name] = IlField(name)
        return type
    }

}