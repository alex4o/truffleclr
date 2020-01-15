package nodes.controlflow

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ControlFlowNode
import nodes.ExpressionNode

@NodeInfo(shortName = "brbool")
class BoolBranch(
    @Child @JvmField var a: ExpressionNode,
    @CompilerDirectives.CompilationFinal @JvmField val cond: Boolean,
    @CompilerDirectives.CompilationFinal var same: Int,
    @CompilerDirectives.CompilationFinal var diff: Int,
    var label: String
) : ControlFlowNode() {

    override fun executeControlFlow(env: VirtualFrame): Int {
        val adata = a.executeBool(env)
        return if (adata == cond) {
//            same
            0
        } else {
//            diff
            1
        }

    }

    override fun toString(): String {
        return "(br$cond $a $label) // (same: $same, diff: $diff)"
    }
}