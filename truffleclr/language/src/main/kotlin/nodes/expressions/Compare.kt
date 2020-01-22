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
abstract class Compare(@CompilerDirectives.CompilationFinal private var condition: CompareCondition) : BinaryNode() {

    val compare: (Int, Int) -> Boolean = genCompare()

    @Specialization
    protected open fun op(left: Int, right: Int): Boolean = compare(left, right)

    private inline fun <reified T: Comparable<T>> genCompare(): (T, T) -> Boolean = when (condition) {
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