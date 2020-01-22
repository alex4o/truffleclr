package parser.cil

import Cil.CilBaseVisitor
import Cil.CilParser
import org.antlr.v4.runtime.ParserRuleContext
import parser.generic.IlAppDomain
import parser.generic.IlField
import parser.generic.IlMethod
import parser.generic.IlType
import java.util.*

class ClassVisitor(var appDomain: IlAppDomain, var type: IlType) : Cil.CilBaseVisitor<Any>() {

    companion object {
        val class_children = LinkedList<Pair<CilBaseVisitor<*>, ParserRuleContext>>()

        fun layerVisit() {
            for((visitor, tree) in class_children) {
                tree.accept(visitor)
            }
        }
    }

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
        type.methods[method.toString()] = method

        class_children.add(Pair(MethodVisitor(appDomain, method), ctx.methodDecls()))

        return method
    }

    override fun visitClass_field(ctx: CilParser.Class_fieldContext): Any {
        var name = ctx.fieldDecl().dottedName().text
        type.fields[name] = IlField(name)
        return type
    }

}