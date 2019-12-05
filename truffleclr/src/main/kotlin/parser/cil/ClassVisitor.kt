package parser.cil

import Cil.CilParser
import parser.generic.AppDomain
import parser.generic.Field
import parser.generic.Method
import parser.generic.Type

class ClassVisitor(var appDomain: AppDomain, var namespace: String, var type: Type) : Cil.CilBaseVisitor<Any>() {

    override fun visitClass_method(ctx: CilParser.Class_methodContext): Any {
        val name = ctx.methodHead().methodName().text

        var arguments = listOf<String>()

        if(ctx.methodHead().sigArgs0().sigArgs1() != null){
            arguments = ctx.methodHead().sigArgs0().sigArgs1().sigArg().map { it.type().text /*+ " " + it.id().text*/ }
        }

        val method = Method(
            name,
            arguments
        )

        method.static = ctx.methodHead().methAttr().map { it.text }.toSet().contains("static")

        method.memberOf = type
        method.memberOf!!.namespace = namespace
        method.returnType = ctx.methodHead().type().text
        type.methods[name] = method

        ctx.methodDecls().accept(MethodVisitor(appDomain, method))
        return method
    }

    override fun visitClass_field(ctx: CilParser.Class_fieldContext): Any {
        var name = ctx.fieldDecl().dottedName().text
        type.fields[name] = Field(name)
        return type
    }

}