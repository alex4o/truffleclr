package nodes.controlflow

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ControlFlowNode

@NodeInfo(shortName = "ret")
class Return(): ControlFlowNode() {
    override fun executeControlFlow(env: VirtualFrame): Int {
        return -1
    }

    override fun execute(env: VirtualFrame): Any? {
        return 0;
    }

    override fun toString(): String {
        return "(return)"
    }
}