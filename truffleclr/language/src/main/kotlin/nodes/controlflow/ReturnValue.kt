package nodes.controlflow

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ControlFlowNode
import nodes.ExpressionNode

@NodeInfo(shortName = "retval")
class ReturnValue(@Child var expr: ExpressionNode): ControlFlowNode() {
    override fun executeControlFlow(env: VirtualFrame): Int {
        return -1
    }

    override fun execute(env: VirtualFrame): Any? {
        return expr.execute(env)
    }

    override fun toString(): String {
        return "(return $expr)"
    }

}