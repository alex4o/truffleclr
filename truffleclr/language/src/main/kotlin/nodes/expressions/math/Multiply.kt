package nodes.expressions.math

import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "mul")
abstract class Multiply(): BinaryExpression() {
    @Specialization
    fun mul(left: Char, right: Char): Int {
        return left.toInt() * right.toInt()
    }

    @Specialization
    fun mul(left: Byte, right: Byte): Int {
        return left * right
    }

    @Specialization
    fun mul(left: Short, right: Short): Int {
        return left * right
    }
    
    @Specialization
    fun mul(left: Int, right: Int): Int {
        return left * right
    }

    @Specialization
    fun mul(left: Long, right: Long): Long {
        return left * right
    }

    @Specialization
    fun mul(left: Float, right: Float): Float {
        return left * right
    }

    @Specialization
    fun mul(left: Double, right: Double): Double {
        return left * right
    }

    override fun toString(): String {
        return "(mul ${this.children.joinToString(" ")})"
    }
}