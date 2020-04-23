package nodes.expressions.math

import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "or")
abstract class Or(): BinaryExpression() {
    @Specialization
    fun or(left: Int, right: Int): Int {
        return left or right
    }

    @Specialization
    fun or(left: Long, right: Long): Long {
        return left or right
    }

    val label = "(or ... )"


    override fun toString(): String {
        return "(or ${this.children.joinToString(" ")})"
    }
}