package parser.cil
import Cil.CilParser
import org.antlr.v4.runtime.ParserRuleContext
import parser.generic.IlMethod
import parser.generic.IlType

fun ParserRuleContext.case(any: Any?): Boolean {
    return any != null
}

fun MethodVisitor.extractFromMethodRef(methodRef: CilParser.MethodRefContext): IlMethod {
    val methodName = methodRef.methodName().run {
        when {
            case(dottedName()) -> dottedName().text.let {
                if (it.matches("'.*?'".toRegex())) {
                    it.subSequence(1, it.lastIndex).toString()
                } else {
                    it
                }
            }
            case(D_CCTOR()) -> D_CCTOR().text
            case(D_CTOR()) -> D_CTOR().text
            else -> error("Impossible")
        }
    }

    // TODO: fix with metaprogramming
    val className = methodRef.typeSpec().run {
        when {
            case(type()) -> {
                type().run {
                    when {
                        case(K_CLASS()) -> {
                            className().slashedName().text
                        }
                        case(K_OBJECT()) -> {
                            "object"
                        }
                        else -> {
                            error("Unable to determine method typeSpec type: ${methodRef.start.line}")
                        }
                    }
                }
            }
            case(className()) -> {
                className().slashedName().text
            }
            else -> {
                error("Unable to determine method typeSpec: ${methodRef.start.line}")
            }
        }
    }


    val arguments = if (methodRef.sigArgs0().sigArgs1() != null) {
        methodRef.sigArgs0().sigArgs1().sigArg().map { it.text }
    }else{
        listOf<String>()
    }

    val method = IlMethod(methodName, arguments)
    method.memberOf = IlType(className)
    method.returnType = methodRef.type().text

    return this.appDomain.getMethod(method.toString()) ?: method
}