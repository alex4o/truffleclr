package nodes.expressions.math

import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "div")
abstract class Divide(): BinaryExpression() {
        
    @Specialization
    fun div(left: Byte, right: Byte): Int {
        return left / right
    }
    
    @Specialization
    fun div(left: Short, right: Short): Int {
        return left / right
    }
    
    @Specialization
    fun div(left: Int, right: Int): Int {
        return left / right
    }

    @Specialization
    fun div(left: Long, right: Long): Long {
        return left / right
    }

    @Specialization
    fun div(left: Float, right: Float): Float {
        return left / right
    }

    @Specialization
    fun div(left: Double, right: Double): Double {
        return left / right
    }

    override fun toString(): String {
        return "(div ${this.children.joinToString(" ")})"
    }
}