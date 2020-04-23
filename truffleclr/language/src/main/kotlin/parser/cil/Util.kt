package parser.cil

import Cil.CilParser.*
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTree
import metadata.IlAppDomain
import metadata.IlMethod
import metadata.IlType
import java.util.*

fun <T : ParseTree> ParserRuleContext.case(any: T?): Boolean {
    return any != null
}


/**
 * Simulates a switch case matching similar to the `when` in kotlin but for parse trees.
 */
fun <K : ParseTree> ParserRuleContext.case(context: K?, returnMethod: K.() -> Any) {
    if (context != null) {
        if (result.peek() != null) error("Multiple match should be impossible")
        result.pop()
        result.push(returnMethod(context!!))
    }
}

/**
 * The dfault case
 */
fun default(returnMethod: () -> Any) {
    if (result.peek() == null) {
        result.pop()
        result.push(returnMethod())
    }
}

//
var result = Stack<Any?>()

/**
 * The starting expression for the match
 */
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

/**
 * Get the class name for a TypeSpec
 */
fun TypeSpecContext.toClassName(): String {
    return match(this) {
        case(type()) {
            toParsedType()
        }
        case(className()) {
            slashedName().text
        }
        default {
            error("Unable to determine typeSpec for $parent (line: ${start.line})")
        }
    }
}

/**
 * Get the metadata of a already parsed class from a TypeContext.
 */
fun TypeContext.getType(appDomain: IlAppDomain): IlType {
    return if (this is TypeArrayContext) {
        appDomain.getType(this.type().toClassName()).makeArray(1)
    } else {
        appDomain.getType(this.toClassName())
    }
}

/**
 * Parse the class name from a TypeContext
 */
fun TypeContext.toClassName(): String {
    return when (this) {
        is TypeClassContext -> {
            className().text
        }
        is TypeObjectContext -> {
            "System.Object"
        }
        is TypePrimitiveContext -> {
            when (text.trim()) {
                "bool" -> "System.Boolean"
                "uint8" -> "System.Byte"
                "char" -> "System.Char"
                "int32" -> "System.Int32"
                "uint32" -> "System.UInt32"
                "float32" -> "System.Float"
                "float64" -> "System.Double"
                "string" -> "System.String"
                else -> {
                    error("Encountered unknown primitive type: ${this.text}")
                }
            }
        }
        is TypeValueTypeContext -> {
            this.className().text
        }
        is TypeVoidContext -> {
            "System.Void"
        }
        else -> error("Unrecognized type context encountered: ${this.javaClass.name}")
    }
}

/**
 * Extract the method method reference from method instructions.
 */
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
        methodRef.sigArgs0().sigArgs1().sigArg().map {
            Pair(
                if (it.id() == null) {
                    ""
                } else {
                    it.id().text
                }, it.type().getType(appDomain)
            )
        }
    } else {
        mutableListOf<Pair<String, IlType>>()
    }

    val method = IlMethod(methodName, arguments)
    method.memberOf = appDomain.getType(className)
    method.returnType = methodRef.type().getType(appDomain)

//    method.static = methodRef.callConv().K_INSTANCE().isEmpty()

    return appDomain.getType(className).getMethod(method.toString())
}

class ParsedType() {

}

/**
 * Transforms cil types to be CTS type names.
 * I don't understand why the need for 3 different type systems in the CLI.
 */
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