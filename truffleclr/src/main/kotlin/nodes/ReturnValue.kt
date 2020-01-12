package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "retval")
class ReturnValue(@Child var expr: ExpressionNode): ControlFlowNode() {
    override fun executeControlFlow(env: VirtualFrame): Int {
        return -2
    }

    override fun execute(env: VirtualFrame): Any? {
        return expr.execute(env)
    }

    override fun toString(): String {
        return "(return $expr)"
    }

}