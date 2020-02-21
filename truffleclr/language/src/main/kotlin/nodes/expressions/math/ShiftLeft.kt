package nodes.expressions.math

import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.BinaryNode

@NodeInfo(shortName = "shl")
abstract class ShiftLeft(): BinaryNode() {
    @Specialization
    fun shl(left: Int, right: Int): Int {
        return left shl right
    }

    @Specialization
    fun shl(left: Long, right: Long): Long {
        return left shl right.toInt()
    }

    @Specialization
    fun shl(left: Long, right: Int): Long {
        return left shl right
    }

    override fun toString(): String {
        return "(shl ${this.children.joinToString(" ")})"
    }
}