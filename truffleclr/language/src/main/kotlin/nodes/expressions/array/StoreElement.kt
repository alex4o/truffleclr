package nodes.expressions.array

import com.oracle.truffle.api.dsl.NodeChild
import com.oracle.truffle.api.dsl.NodeChildren
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.VirtualFrame
import nodes.ExpressionNode
import nodes.StatementNode

@NodeChildren(
    NodeChild("arrayNode", type = ExpressionNode::class),
    NodeChild("indexNode", type = ExpressionNode::class),
    NodeChild("valueNode", type = ExpressionNode::class)
)
abstract class StoreElement() : StatementNode() {
    @Specialization
    fun store(array: IntArray, index: Int, value: Int) {
        array[index] = value
    }

    @Specialization
    fun store(array: ShortArray, index: Int, value: Short) {
        array[index] = value
    }

    @Specialization
    fun store(array: FloatArray, index: Int, value: Float) {
        array[index] = value
    }

    @Specialization
    fun store(array: DoubleArray, index: Int, value: Double) {
        array[index] = value
    }

    @Specialization
    fun store(array: ByteArray, index: Int, value: Byte) {
        array[index] = value
    }

    @Specialization
    fun store(array: CharArray, index: Int, value: Char) {
        array[index] = value
    }

    override fun toString(): String {
        return "(stelem ${this.children.joinToString(" ")})"
    }
}