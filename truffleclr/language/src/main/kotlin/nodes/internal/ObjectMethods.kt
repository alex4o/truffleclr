package nodes.internal

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
import com.oracle.truffle.api.frame.VirtualFrame
import main.bytecode.ManagedReference
import main.Clr
import nodes.ExpressionNode
import runtime.ClrObject
import types.CTSNull

class ObjectTypeName : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any = typeName(env.arguments[0])
    @TruffleBoundary
    private fun typeName(value: Any): String = when (value) {
        is ManagedReference.Box -> value.type.displayName
        is ClrObject -> value.type.displayName
        is String -> "System.String"
        else -> checkNotNull(arrayTypeName(value)) { "Unknown CLR object type: " + value.javaClass.name }
    }
}

@TruffleBoundary
internal fun arrayTypeName(value: Any): String? {
    Clr.contextReference.get(null).arrayTypeNames[value]?.let { return it }
    val element = when (value) {
        is ManagedReference.ObjectArray -> value.type.displayName
        is BooleanArray -> "System.Boolean"
        is ByteArray -> "System.Byte"
        is ShortArray -> "System.Int16"
        is CharArray -> "System.Char"
        is IntArray -> "System.Int32"
        is LongArray -> "System.Int64"
        is FloatArray -> "System.Single"
        is DoubleArray -> "System.Double"
        is Array<*> -> if (value.javaClass.componentType == String::class.java) "System.String" else "System.Object"
        else -> return null
    }
    return "$element[]"
}

class IdentityHashCode : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any = System.identityHashCode(env.arguments[0])
}

class ValueEquals : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any = equal(env.arguments[0] as ManagedReference.Box, env.arguments[1])
    @TruffleBoundary
    private fun equal(left: ManagedReference.Box, value: Any?): Boolean {
        val right = value as? ManagedReference.Box ?: return false
        if (left.type !== right.type) return false
        val a = left.get()
        val b = right.get()
        return if (a is ClrObject && b is ClrObject) equalFields(a, b) else equalValue(a, b)
    }
}

class ValueHashCode : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any = hash((env.arguments[0] as ManagedReference.Box).get())
    @TruffleBoundary
    private fun hash(value: Any?): Int = if (value is ClrObject) hashFields(value) else hashValue(value)
}

private fun equalFields(left: ClrObject, right: ClrObject): Boolean =
    left.type.layoutFields.all { equalValue(it.readRaw(left), it.readRaw(right)) }

private fun hashFields(value: ClrObject): Int =
    value.type.layoutFields.fold(0) { hash, field -> hash * 31 + hashValue(field.readRaw(value)) }

private fun equalValue(left: Any?, right: Any?): Boolean {
    if (left === right) return true
    if (left == null || left === CTSNull) return right == null || right === CTSNull
    if (right == null || right === CTSNull) return false
    if (left is ClrObject) {
        if (left.type.isValueType) {
            if (right !is ClrObject || left.type !== right.type) return false
            val method = left.type.virtualTable.first { it.metadata.name == "Equals" && it.metadata.arguments.size == 1 }
            if (method.metadata.memberOf!!.fullName != "System.ValueType") {
                val result = method.callTarget.call(ManagedReference.Box(left.type, left), ManagedReference.Box(right.type, right))
                return result == true || result == 1
            }
            return equalFields(left, right)
        }
        val method = left.type.virtualTable.first { it.metadata.name == "Equals" && it.metadata.arguments.size == 1 }
        val result = method.callTarget.call(left, right)
        return result == true || result == 1
    }
    if (left is ManagedReference.Box) {
        val method = left.type.virtualTable.first { it.metadata.name == "Equals" && it.metadata.arguments.size == 1 }
        val result = method.callTarget.call(left, right)
        return result == true || result == 1
    }
    // CLR floating-point Equals considers NaNs equal and both zeros equal.
    if (left is Double && right is Double) return left == right || left.isNaN() && right.isNaN()
    if (left is Float && right is Float) return left == right || left.isNaN() && right.isNaN()
    return left == right
}

@TruffleBoundary
private fun hashValue(value: Any?): Int = when (value) {
    null, CTSNull -> 0
    is ClrObject -> {
        val method = value.type.virtualTable.first { it.metadata.name == "GetHashCode" }
        if (method.metadata.memberOf!!.fullName == "System.ValueType")
            hashFields(value)
        else method.callTarget.call(if (value.type.isValueType) ManagedReference.Box(value.type, value) else value) as Int
    }
    is ManagedReference.Box -> value.type.virtualTable.first { it.metadata.name == "GetHashCode" }.callTarget.call(value) as Int
    is Double -> if (value == 0.0) 0 else value.hashCode()
    is Float -> if (value == 0.0f) 0 else value.hashCode()
    else -> value.hashCode()
}
