package nodes.expressions.math

import com.oracle.truffle.api.dsl.NodeChild
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.BinaryNode
import nodes.ExpressionNode

@NodeInfo(shortName = "neg")
@NodeChild("op")
abstract class Negative(): ExpressionNode() {

    @Specialization
    fun neg(op: Char): Char {
        return (-op.toInt()).toChar()
    }

    @Specialization
    fun neg(op: Byte): Int {
        return -op
    }

    @Specialization
    fun neg(op: Short): Int {
        return -op
    }

    @Specialization
    fun neg(op: Int): Int {
        return -op
    }

    @Specialization
    fun neg(op: Long): Long {
        return -op
    }

    @Specialization
    fun neg(op: Float): Float {
        return -op
    }

    @Specialization
    fun neg(op: Double): Double {
        return -op
    }

    override fun toString(): String {
        return "(neg ${this.children.joinToString(" ")})"
    }
}