package parser.cil

import Cil.CilBaseVisitor
import Cil.CilParser
import org.antlr.v4.runtime.ParserRuleContext
import metadata.IlAppDomain
import metadata.IlField
import metadata.IlMethod
import metadata.IlType
import org.omg.CORBA.CTX_RESTRICT_SCOPE
import types.CTSNull
import java.util.*

@kotlin.ExperimentalUnsignedTypes
class ClassVisitor(var appDomain: IlAppDomain, var type: IlType) : Cil.CilBaseVisitor<Any>() {

    companion object {
        val class_children: Queue<Pair<CilBaseVisitor<*>, ParserRuleContext>> = LinkedList()

        fun layerVisit() {
            while (!class_children.isEmpty()) {
                val (visitor, tree) = class_children.remove()
                tree.accept(visitor)
            }
        }
    }

    override fun visitCustomAttrDecl(ctx: CilParser.CustomAttrDeclContext) {
        if(ctx.text.contains("Polyglot")) {
            type.polyglot = true
        }
    }

    override fun visitClass_method(ctx: CilParser.Class_methodContext): Any {
        val name: String = match(ctx.methodHead().methodName()) {
            case(this.dottedName()) {
                Regex("'(.*?)'").replace(text, "$1")
            }
            case(this.D_CCTOR()) { ".cctor" }
            case(this.D_CTOR()) { ".ctor" }
        }

        var arguments = listOf<IlType>()

        if (ctx.methodHead().sigArgs0().sigArgs1() != null) {
            arguments = ctx.methodHead().sigArgs0().sigArgs1().sigArg().map { it.type().getType(appDomain) }
        }

        val method = IlMethod(
            name,
            arguments
        )

        method.static = ctx.methodHead().methAttr().map { it.text }.toSet().contains("static")
        method.internal = ctx.methodHead().implAttr().map { it.text }.toSet().contains("internalcall")
        method.memberOf = type
        method.returnType = ctx.methodHead().type().getType(appDomain)
        type.methods[method.toString()] = method

        class_children.add(Pair(MethodVisitor(appDomain, method), ctx.methodDecls()))

        return method
    }

    override fun visitClass_field(ctx: CilParser.Class_fieldContext): Any {
        var name = ctx.fieldDecl().dottedName().text

        val value: Any = if (ctx.fieldDecl().initOpt().fieldInit() != null) {
            match<Any, CilParser.FieldInitContext>(ctx.fieldDecl().initOpt().fieldInit()) {
                case(fieldSerInit()) {
                    if (K_CHAR() != null) {
                        return@case if (int32().text.startsWith("0x")) {
                            int32().text.drop(2).toUShort(16)
                        } else {
                            int32().text.toUShort()
                        }
                    }
                    if (K_UINT8() != null) {
                        return@case if (int32().text.startsWith("0x")) {
                            int32().text.drop(2).toUByte(16)
                        } else {
                            int32().text.toUByte()
                        }
                    }
                    if (K_INT32() != null) {
                        return@case if (int32().text.startsWith("0x")) {
                            int32().text.drop(2).toUInt(16).toInt()
                        } else {
                            int32().text.toInt()
                        }
                    }
                    if (K_INT64() != null) {
                        return@case if (int64().text.startsWith("0x")) {
                            int64().text.drop(2).toULong(16).toLong()
                        } else {
                            int64().text.toLong()
                        }
                    }
                    if (K_UINT32() != null) {
                        return@case if (int32().text.startsWith("0x")) {
                            int32().text.drop(2).toUInt(16)
                        } else {
                            int32().text.toUInt()
                        }
                    }
                    if (K_UINT64() != null) {
                        return@case if (int64().text.startsWith("0x")) {
                            int64().text.drop(2).toULong(16)
                        } else {
                            int64().text.toULong()
                        }
                    }
                    if (K_FLOAT32() != null) {
                        return@case float64().text.toFloat()
                    }
                    if (K_FLOAT64() != null) {
                        return@case float64().text.toDouble()
                    }
                    error("Unknown type")
                }
                case(K_NULLREF()) {
                    CTSNull
                }
                case(compQstring()) {
                    text
                }
            }
        } else {
            CTSNull
        }

        type.fields[name] = IlField(name, ctx.fieldDecl().type().getType(appDomain), value)

        return type
    }
}