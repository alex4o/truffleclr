package nodes.expressions.math

import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "xor")
abstract class Xor(): BinaryExpression() {
    @Specialization
    fun or(left: Int, right: Int): Int {
        return left xor right
    }

    @Specialization
    fun or(left: Long, right: Long): Long {
        return left xor right
    }

    override fun toString(): String {
        return "(xor ${this.children.joinToString(" ")})"
    }
}