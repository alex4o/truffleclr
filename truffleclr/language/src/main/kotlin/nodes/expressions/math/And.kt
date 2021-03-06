package nodes.expressions.math

import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "and")
abstract class And(): BinaryExpression() {
    @Specialization
    fun or(left: Int, right: Int): Int {
        return left and right
    }

    @Specialization
    fun or(left: Long, right: Long): Long {
        return left and right
    }

    override fun toString(): String {
        return "(and ${this.children.joinToString(" ")})"
    }
}