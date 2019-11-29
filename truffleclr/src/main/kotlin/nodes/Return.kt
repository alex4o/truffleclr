package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import kotlin.system.exitProcess

class Return(): ControlFlowNode() {
    override fun executeControlFlow(env: VirtualFrame): Int {
        return -1
    }

    override fun toString(): String {
        return "return"
    }
}