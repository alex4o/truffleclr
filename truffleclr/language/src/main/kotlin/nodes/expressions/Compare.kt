package nodes.expressions

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.expressions.math.BinaryExpression
import nodes.expressions.CompareCondition.*


enum class CompareCondition {
    NE,
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
    @CompilerDirectives.CompilationFinal @JvmField val condition: CompareCondition,
    @CompilerDirectives.CompilationFinal @JvmField val unsigned: Boolean = false):
    BinaryExpression() {

    val compare: (Int) -> Boolean = genCompare()

    @Specialization
    protected open fun op(left: Boolean, right: Int): Boolean {
        return compare(left.compareTo(right != 0))
    }

    @Specialization
    protected open fun op(left: Int, right: Boolean): Boolean {
        return compare(right.compareTo(left != 0))
    }

    @Specialization
    protected open fun op(left: Boolean, right: Boolean): Boolean {
        return compare(left.compareTo(right))
    }

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

    @Specialization
    protected open fun op(left: Any, right: Any): Boolean {
        // TODO: Unsafe and Unsigned types can be used to compare objects in dotnet
        return if(condition == EQ) {
            left == right
        }else{
            left != right
        }
    }

    private inline fun genCompare(): (Int) -> Boolean = when (condition) {
        NE -> {
            { comparison -> comparison != 0 }
        }
        EQ -> {
            { comparison -> comparison == 0 }
        }
        LT -> {
            { comparison -> comparison < 0 }
        }
        GT -> {
            { comparison -> comparison > 0 }
        }
        GE -> {
            { comparison -> comparison >= 0 }
        }
        LE -> {
            { comparison -> comparison <= 0 }
        }
    }

    override fun toString(): String {
        return "(c${condition.toString().toLowerCase()} ${this.children.joinToString(" ")})"
    }
}