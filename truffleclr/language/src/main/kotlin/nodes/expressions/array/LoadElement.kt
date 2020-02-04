package nodes.expressions.array

import com.oracle.truffle.api.dsl.NodeChild
import com.oracle.truffle.api.dsl.NodeChildren
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.VirtualFrame
import nodes.ExpressionNode
import nodes.StatementNode

@NodeChildren(
    NodeChild("arrayNode"),
    NodeChild("indexNode")
)
abstract class LoadElement : ExpressionNode() {

    @Specialization
    fun loadElement(array: IntArray, index: Int): Int {
        return array[index]
    }

    @Specialization
    fun loadElement(array: LongArray, index: Int): Long {
        return array[index]
    }

    @Specialization
    fun loadElement(array: FloatArray, index: Int): Float {
        return array[index]
    }


    @Specialization
    fun loadElement(array: DoubleArray, index: Int): Double {
        return array[index]
    }


    @Specialization
    fun loadElement(array: CharArray, index: Int): Char {
        return array[index]
    }

    @Specialization
    fun loadElement(array: ByteArray, index: Int): Byte {
        return array[index]
    }

    @Specialization
    fun loadElement(array: ShortArray, index: Int): Short {
        return array[index]
    }

    @Specialization
    fun loadElement(array: Array<String>, index: Int): String {
        return array[index]
    }

    @Specialization
    fun loadElement(array: Array<*>, index: Int): Any? {
        return array[index]
    }

    override fun toString(): String {
        return "(ldelem ${this.children.joinToString(" ")})"
    }
}