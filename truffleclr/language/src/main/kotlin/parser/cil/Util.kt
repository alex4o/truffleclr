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
fun SlashedNameContext.canonicalName(): String = dottedName().joinToString("/") { it.text.trim('\'') }

fun TypeSpecContext.toClassName(appDomain: IlAppDomain): String {
    return match(this) {
        case(type()) {
            toClassName(appDomain)
        }
        case(className()) {
            slashedName().canonicalName()
        }
        default {
            error("Unable to determine typeSpec for $parent (line: ${start.line})")
        }
    }
}

/**
 * Get the metadata of a already parsed class from a TypeContext.
 */
fun TypeContext.getType(appDomain: IlAppDomain, typeParameters: List<String> = emptyList(), methodParameters: List<String> = emptyList()): IlType =
    appDomain.getType(toClassName(appDomain).normalizeParameters(appDomain, typeParameters, methodParameters))

fun TyparsClauseContext.parameterNames(): List<String> =
    generateSequence(typars()) { it.typarsRest()?.typars() }.map { parameter ->
        var attributes: TyparAttribsContext? = parameter.typarAttribs()
        while (attributes != null) {
            val variance = attributes.typarAttrib()?.text
            if (variance == "+" || variance == "-") {
                throw UnsupportedOperationException("Generic parameter variance '$variance' is not supported: ${parameter.dottedName().text}")
            }
            attributes = attributes.typarAttribs()
        }
        parameter.dottedName().text.trim('\'')
    }.toList()

fun String.normalizeParameters(appDomain: IlAppDomain, typeParameters: List<String>, methodParameters: List<String> = emptyList()): String =
    appDomain.mapTypeName(this) { text ->
        Regex("(!!?)([A-Za-z_][A-Za-z_0-9]*)").replace(text) { match ->
            val parameters = if (match.groupValues[1] == "!!") methodParameters else typeParameters
            val index = parameters.indexOf(match.groupValues[2])
            require(index >= 0) { "Unknown generic parameter "+match.value }
            match.groupValues[1] + index
        }
    }

/**
 * Parse the class name from a TypeContext
 */
fun TypeContext.toClassName(appDomain: IlAppDomain): String {
    return when (this) {
        is TypeGenericContext -> appDomain.genericTypeName(type().toClassName(appDomain),
            tyArgs1().tyArgs2().type().map { it.toClassName(appDomain) })
        is TypeU1Context, is TypeU2Context, is TypeU3Context, is TypeU4Context -> text
        is TypeManageRefContext -> type().toClassName(appDomain) + "&"
        is TypeArrayContext -> type().toClassName(appDomain) + "[]"
        is TypeNativeContext -> "System.IntPtr"
        is TypeClassContext -> {
            className()?.slashedName()?.canonicalName() ?: "System.Object"
        }
        is TypePrimitiveContext -> {
            when (text.trim()) {
                "bool" -> "System.Boolean"
                "int8" -> "System.SByte"
                "uint8" -> "System.Byte"
                "int16" -> "System.Int16"
                "uint16" -> "System.UInt16"
                "int64" -> "System.Int64"
                "uint64" -> "System.UInt64"
                "char" -> "System.Char"
                "int32" -> "System.Int32"
                "uint32" -> "System.UInt32"
                "float32" -> "System.Single"
                "float64" -> "System.Double"
                "string" -> "System.String"
                else -> {
                    error("Encountered unknown primitive type: ${this.text}")
                }
            }
        }
        is TypeValueTypeContext -> {
            this.className().slashedName().canonicalName()
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


    val className: String = methodRef.typeSpec().toClassName(appDomain)

    val owner = appDomain.getType(className)
    val ownerDefinition = owner.genericInstance?.let { appDomain.getType(it.definition) } ?: owner
    val signature = methodRef.type().text + methodRef.sigArgs0().text
    val namedParameters = Regex("!!([A-Za-z_][A-Za-z_0-9]*)").findAll(signature).map { it.groupValues[1] }.toSet()
    val methodParameters = if (namedParameters.isEmpty()) emptyList() else {
        val arity = methodRef.tyArgs0()?.tyArgs1()?.tyArgs2()?.type()?.size ?: 0
        val count = methodRef.sigArgs0().sigArgs1()?.sigArg()?.size ?: 0
        val candidates = ownerDefinition.methods.values.filter {
            it.name == methodName && it.genericParameters.size == arity && it.arguments.size == count &&
                it.genericParameters.containsAll(namedParameters)
        }.map { it.genericParameters }.distinct()
        require(candidates.size == 1) { "Cannot resolve named generic parameters in "+methodRef.text }
        candidates.single()
    }
    val arguments = if (methodRef.sigArgs0().sigArgs1() != null) {
        methodRef.sigArgs0().sigArgs1().sigArg().map {
            Pair(
                if (it.id() == null) {
                    ""
                } else {
                    it.id().text
                }, it.type().getType(appDomain, ownerDefinition.genericParameters, methodParameters)
            )
        }
    } else {
        mutableListOf<Pair<String, IlType>>()
    }

    val method = IlMethod(methodName, arguments)
    method.memberOf = appDomain.getType(className.normalizeParameters(appDomain, this.method.memberOf!!.genericParameters, this.method.genericParameters))
    method.returnType = methodRef.type().getType(appDomain, ownerDefinition.genericParameters, methodParameters)
    method.static = methodRef.callConv().K_INSTANCE().isEmpty()
    method.genericArguments = methodRef.tyArgs0()?.tyArgs1()?.tyArgs2()?.type()?.map {
        appDomain.getType(it.toClassName(appDomain).normalizeParameters(appDomain, this.method.memberOf!!.genericParameters, this.method.genericParameters))
    } ?: emptyList()
    return method
}

class ParsedType() {

}

/**
 * Transforms cil types to be CTS type names.
 * I don't understand why the need for 3 different type systems in the CLI.
 */
fun TypeContext.toParsedType(appDomain: IlAppDomain): String = toClassName(appDomain)