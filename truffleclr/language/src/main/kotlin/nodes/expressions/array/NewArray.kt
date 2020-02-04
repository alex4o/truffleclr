package nodes.expressions.array

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.dsl.NodeChild
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.VirtualFrame
import nodes.ExpressionNode

@NodeChild("sizeNode")
abstract class NewArray(@CompilerDirectives.CompilationFinal @JvmField val type: Class<*>) : ExpressionNode() {

    @Specialization
    fun create(size: Int): Any {
        return if (type == LongArray::class) {
            LongArray(size)
        } else if (type == IntArray::class) {
            IntArray(size)
        } else if (type == ShortArray::class) {
            ShortArray(size)
        } else if (type == CharArray::class) {
            CharArray(size)
        } else if (type == ShortArray::class) {
            ShortArray(size)
        }  else if (type == FloatArray::class) {
            FloatArray(size)
        }  else if (type == DoubleArray::class) {
            DoubleArray(size)
        } else {
            error("Undefined array type or improper type: $type")
        }
    }

    override fun toString(): String {
        return "(newarr int32 ${this.children.joinToString(" ")})"
    }
}