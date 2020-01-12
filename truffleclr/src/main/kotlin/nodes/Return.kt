package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import kotlin.system.exitProcess

@NodeInfo(shortName = "ret")
class Return(): ControlFlowNode() {
    override fun executeControlFlow(env: VirtualFrame): Int {
        return -1
    }

    override fun toString(): String {
        return "(return)"
    }
}