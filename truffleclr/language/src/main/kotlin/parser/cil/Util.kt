package parser.cil

import Cil.CilParser.*
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTree
import parser.generic.IlMethod
import parser.generic.IlType
import java.util.*


fun <T : ParseTree> ParserRuleContext.case(any: T?): Boolean {
    return any != null
}

fun <K : ParseTree> ParserRuleContext.case(context: K?, returnMethod: K.() -> Any) {
    if (context != null) {
        if (result.peek() != null) error("Multiple match should be impossible")
        result.pop()
        result.push(returnMethod(context!!))
    }
}

fun default(returnMethod: () -> Any) {
    if (result.peek() == null) {
        result.pop()
        result.push(returnMethod())
    }
}

//
var result = Stack<Any?>()

inline fun <reified T, R : ParseTree> match(rule: R, method: R.() -> Unit): T {
    result.push(null)
    method(rule)
    val finalResult = result.pop()
    return if (finalResult is T) {
        finalResult
    } else {
        error("Result is wrong type")
    }
}


fun test(methodRef: MethodRefContext) {
    val methodName: String = match(methodRef.methodName()) {
        case(dottedName()) { text }
        case(D_CCTOR()) { text }
        case(D_CTOR()) { text }
    }
}

fun TypeSpecContext.toClassName(): String {
    return match(this) {
        case(type()) {
            toParsedType()
        }
        case(className()) {
            slashedName().text
        }
        default {
            error("Unable to determine typeSpec for $parent (line: ${ start.line})")
        }
    }
}

fun MethodVisitor.extractFromMethodRefTest(methodRef: MethodRefContext): IlMethod {
    val methodName: String = Regex("'(.*?)'").replace(match(methodRef.methodName()) {
        case(dottedName()) {
            text
        }
        case(D_CCTOR()) {
            text
        }
        case(D_CTOR()) {
            text
        }
    }, "$1")

    val className: String = methodRef.typeSpec().toClassName()

    val arguments = if (methodRef.sigArgs0().sigArgs1() != null) {
        methodRef.sigArgs0().sigArgs1().sigArg().map { it.text }
    } else {
        listOf<String>()
    }

    val method = IlMethod(methodName, arguments)
    method.memberOf = appDomain.getType(className)
    method.returnType = methodRef.type().text

//    method.static = methodRef.callConv().K_INSTANCE().isEmpty()

    return appDomain.getType(className).getMethod(method.toString())
}

class ParsedType() {

}

fun TypeContext.toParsedType(): String {
    return when (this) {
        is TypeClassContext -> {
            className().slashedName().text
        }
        is TypePrimitiveContext -> {
            when (text) {
                "int32" -> "System.Int32"
                "uint32" -> "System.UInt32"
                "int8" -> "System.UInt8"
                "uint8" -> "System.UInt8"
                "string" -> "System.String"
                "bool" -> "System.Boolean"
                else -> error("Unsupported primitive: ${this.start.line}")
            }
        }
        is TypeObjectContext -> {
            "System.Object"
        }
        is TypeValueTypeContext -> {
            className().text
        }
        is TypeArrayContext -> {
            this.type().toParsedType() + "[]"
        }
        else -> error("Bad TypeContext: ${this.start.line}")
    }
}