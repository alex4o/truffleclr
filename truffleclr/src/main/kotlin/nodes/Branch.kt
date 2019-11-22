package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node

class Branch(@Child var a: ExpressionNode, val label: String): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        return a.execute(env)
    }

    override fun toString(): String {
        return "goto $label"
    }
}