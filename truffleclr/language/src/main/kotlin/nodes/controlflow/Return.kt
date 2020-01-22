package nodes.controlflow

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ControlFlowNode
import types.CTSNull

@NodeInfo(shortName = "ret")
class Return(): ControlFlowNode() {
    override fun executeControlFlow(env: VirtualFrame): Int {
        return -1
    }

    override fun execute(env: VirtualFrame): Any? {
        return CTSNull;
    }

    override fun toString(): String {
        return "(return)"
    }
}