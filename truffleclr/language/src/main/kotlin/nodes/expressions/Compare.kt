package nodes.expressions

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.dsl.NodeField
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.nodes.NodeInfo
import com.sun.org.apache.xpath.internal.compiler.Compiler
import nodes.BinaryNode
import nodes.ExpressionNode
import nodes.expressions.CompareCondition.*
import java.util.concurrent.Callable


enum class CompareCondition {
    EQ
//    {
//        override fun toString(): String {
//            return "ceq"
//        }
//    }
    ,
    LT
//    {
//        override fun toString(): String {
//            return "clt"
//        }
//    }
    ,
    GT
//    {
//        override fun toString(): String {
//            return "cgt"
//        }
//    }
    ,
    LE
//    {
//        override fun toString(): String {
//            return "cle"
//        }
//    }
    ,
    GE
//    {
//        override fun toString(): String {
//            return "cge"
//        }
//    }
}

@NodeInfo(shortName = "cmp")
abstract class Compare(
    @CompilerDirectives.CompilationFinal @JvmField private val condition: CompareCondition,
    @CompilerDirectives.CompilationFinal @JvmField val unsigned: Boolean = false) :
    BinaryNode() {

    val compare: (Comparable<Number>, Number) -> Boolean = genCompare()

    @Specialization
    protected open fun op(left: Int, right: Int): Boolean {
        val a = if (unsigned) {
            left xor Int.MIN_VALUE
        } else {
            left
        } as Comparable<Number>
        val b = if (unsigned) {
            right xor Int.MIN_VALUE
        } else {
            right
        } as Number
        return compare(a, b)
    }

    @Specialization
    protected open fun op(left: Long, right: Long): Boolean {
        val a = if (unsigned) {
            left xor Long.MIN_VALUE
        } else {
            left
        } as Comparable<Number>
        val b = if (unsigned) {
            right xor Long.MIN_VALUE
        } else {
            right
        } as Number
        return compare(a, b)
    }

    @Specialization
    protected open fun op(left: Float, right: Float): Boolean {
        return compare(left as Comparable<Number>, right as Number)
    }

    @Specialization
    protected open fun op(left: Double, right: Double): Boolean {
        return compare(left as Comparable<Number>, right as Number)
    }

    private inline fun genCompare(): (Comparable<Number>, Number) -> Boolean = when (condition) {
        EQ -> {
            { a, b -> a == b }
        }
        LT -> {
            { a, b -> a < b }
        }
        GT -> {
            { a, b -> a > b }
        }
        GE -> {
            { a, b -> a >= b }
        }
        LE -> {
            { a, b -> a <= b }
        }
    }

    override fun toString(): String {
        return "(c${condition.toString().toLowerCase()} ${this.children.joinToString(" ")})"
    }
}