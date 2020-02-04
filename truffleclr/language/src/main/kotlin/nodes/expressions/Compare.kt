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

@ExperimentalUnsignedTypes
@NodeInfo(shortName = "cmp")
abstract class Compare(
    @CompilerDirectives.CompilationFinal @JvmField private val condition: CompareCondition,
    @CompilerDirectives.CompilationFinal @JvmField val unsigned: Boolean = false):
    BinaryNode() {

    val compare: (Int) -> Boolean = genCompare()

    @Specialization
    protected open fun op(left: Int, right: Int): Boolean {
        return if (unsigned) {
            compare(left.toUInt().compareTo(right.toUInt()))
        }else{
            compare(left.compareTo(right))
        }
    }

    @Specialization
    protected open fun op(left: Long, right: Long): Boolean {
        return if (unsigned) {
            compare(left.toULong().compareTo(right.toULong()))
        }else{
            compare(left.compareTo(right))
        }
    }

    @Specialization
    protected open fun op(left: Float, right: Float): Boolean {
        return compare(left.compareTo(right))
    }

    @Specialization
    protected open fun op(left: Double, right: Double): Boolean {
        return compare(left.compareTo(right))
    }

    private inline fun genCompare(): (Int) -> Boolean = when (condition) {
        EQ -> {
            { a -> a == 0 }
        }
        LT -> {
            { a -> a < 0 }
        }
        GT -> {
            { a -> a > 0 }
        }
        GE -> {
            { a -> a >= 0 }
        }
        LE -> {
            { a -> a <= 0 }
        }
    }

    override fun toString(): String {
        return "(c${condition.toString().toLowerCase()} ${this.children.joinToString(" ")})"
    }
}