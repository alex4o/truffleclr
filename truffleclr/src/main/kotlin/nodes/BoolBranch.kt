package nodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "brbool")
class BoolBranch(
    @Child var a: ExpressionNode,
    @CompilerDirectives.CompilationFinal val cond: Boolean,
    @CompilerDirectives.CompilationFinal var same: Int,
    @CompilerDirectives.CompilationFinal var diff: Int,
    var label: String
) : ControlFlowNode() {

    override fun executeControlFlow(env: VirtualFrame): Int {
        val adata = a.execute(env) as Boolean
        return if (adata == cond) {
            same
        } else {
            diff
        }

    }

    override fun toString(): String {
        return "(br$cond $a $label) // (same: $same, diff: $diff)"
    }
}