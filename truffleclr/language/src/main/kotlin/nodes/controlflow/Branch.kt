package nodes.controlflow

import com.oracle.truffle.api.CompilerDirectives.CompilationFinal
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ControlFlowNode

@NodeInfo(shortName = "br")
class Branch(@CompilationFinal var jump: Int, val l: String): ControlFlowNode() {
    override fun executeControlFlow(env: VirtualFrame): Int {
        return jump
    }

    val label = "Branch $jump"

    override fun toString(): String {
        return "(br $l)"
    }
}