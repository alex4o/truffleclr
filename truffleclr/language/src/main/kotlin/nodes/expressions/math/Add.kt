package nodes.expressions.math

import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "add")
abstract class Add(): BinaryExpression() {

    @Specialization
    fun add(left: Char, right: Char): Char {
        return left + right.toInt()
    }

    @Specialization
    fun add(left: Byte, right: Byte): Int {
        return left + right
    }

    @Specialization
    fun add(left: Short, right: Short): Int {
        return left + right
    }

    @Specialization
    fun add(left: Int, right: Int): Int {
        return left + right
    }

    @Specialization
    fun add(left: Long, right: Long): Long {
        return left + right
    }

    @Specialization
    fun add(left: Float, right: Float): Float {
        return left + right
    }

    @Specialization
    fun add(left: Double, right: Double): Double {
        return left + right
    }

    override fun toString(): String {
        return "(add ${this.children.joinToString(" ")})"
    }
}