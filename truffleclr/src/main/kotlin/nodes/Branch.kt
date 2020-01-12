package nodes

import com.oracle.truffle.api.CompilerDirectives.CompilationFinal
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "br")
class Branch(@CompilationFinal var jump: Int, val label: String): ControlFlowNode() {
    override fun executeControlFlow(env: VirtualFrame): Int {
        return jump
    }

    override fun toString(): String {
        return "(br $label)"
    }
}