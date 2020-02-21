package nodes.expressions.math

import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.BinaryNode

@NodeInfo(shortName = "shr")
abstract class ShiftRight(): BinaryNode() {
    @Specialization
    fun shr(left: Int, right: Int): Int {
        return left shr right
    }

    @Specialization
    fun shr(left: Long, right: Long): Long {
        return left shr right.toInt()
    }

    @Specialization
    fun shr(left: Long, right: Int): Long {
        return left shr right
    }

    override fun toString(): String {
        return "(shr ${this.children.joinToString(" ")})"
    }
}