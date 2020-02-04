package nodes.expressions.array

import com.oracle.truffle.api.dsl.NodeChild
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.VirtualFrame
import nodes.ExpressionNode

@NodeChild("arrayNode")
abstract class LoadLength() : ExpressionNode() {
    @Specialization
    fun size(array: LongArray): Int {
        return array.size
    }

    @Specialization
    fun size(array: IntArray): Int {
        return array.size
    }

    @Specialization
    fun size(array: ShortArray): Int {
        return array.size
    }

    @Specialization
    fun size(array: CharArray): Int {
        return array.size
    }

    @Specialization
    fun size(array: DoubleArray): Int {
        return array.size
    }

    @Specialization
    fun size(array: FloatArray): Int {
        return array.size
    }

    @Specialization
    fun size(array: Array<String>): Int {
        return array.size
    }

    @Specialization
    fun size(array: Array<*>): Int {
        return array.size
    }

    override fun toString(): String {
        return "(ldlen ${this.children.joinToString(" ")})"
    }
}