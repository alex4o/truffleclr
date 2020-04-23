package nodes.expressions.math

import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "sub")
abstract class Subtract(): BinaryExpression() {
    @Specialization
    fun sub(left: Char, right: Char): Char {
        return left - right.toInt()
    }

    @Specialization
    fun sub(left: Byte, right: Byte): Int {
        return left - right
    }

    @Specialization
    fun sub(left: Short, right: Short): Int {
        return left - right
    }
    
    @Specialization
    fun sub(left: Int, right: Int): Int {
        return left - right
    }

    @Specialization
    fun sub(left: Long, right: Long): Long {
        return left - right
    }

    @Specialization
    fun sub(left: Float, right: Float): Float {
        return left - right
    }

    @Specialization
    fun sub(left: Double, right: Double): Double {
        return left - right
    }

    override fun toString(): String {
        return "(sub ${this.children.joinToString(" ")})"
    }
}