package nodes.expressions.math

import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "rem")
abstract class Reminder(): BinaryExpression() {
        
    @Specialization
    fun rem(left: Byte, right: Byte): Int {
        return left % right
    }
    
    @Specialization
    fun rem(left: Short, right: Short): Int {
        return left % right
    }
    
    @Specialization
    fun rem(left: Int, right: Int): Int {
        return left % right
    }

    @Specialization
    fun rem(left: Long, right: Long): Long {
        return left % right
    }

    @Specialization
    fun rem(left: Float, right: Float): Float {
        return left % right
    }

    @Specialization
    fun rem(left: Double, right: Double): Double {
        return left % right
    }

    override fun toString(): String {
        return "(rem ${this.children.joinToString(" ")})"
    }
}