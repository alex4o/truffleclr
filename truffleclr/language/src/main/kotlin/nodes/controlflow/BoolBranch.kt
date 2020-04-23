package nodes.controlflow

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.dsl.NodeChild
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ControlFlowNode
import nodes.ExpressionNode

@NodeInfo(shortName = "brbool")
@NodeChild("value", type = ExpressionNode::class)
abstract class BoolBranch(
    @CompilerDirectives.CompilationFinal @JvmField val cond: Boolean,
    @CompilerDirectives.CompilationFinal val same: Int,
    @CompilerDirectives.CompilationFinal val diff: Int,
    val l: String
) : ControlFlowNode() {

    @Specialization
    fun executeControlFlow(value: Boolean): Int {
//        println("branch $value == $cond")
        return if (value == cond) {
//          same
            0
        } else {
//          diff
            1
        }
    }

    @Specialization
    fun executeControlFlow(value: Int): Int {
        return if ((value != 0) == cond) {
//          same
            0
        } else {
//          diff
            1
        }
    }

    val label = "BoolBranch $cond $same $diff"

    override fun toString(): String {
        return "(br$cond ${this.children.joinToString("")} $l)" // (same: $same, diff: $diff)
    }
}