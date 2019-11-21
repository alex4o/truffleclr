package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.Node

class Block(@Children val nodes: Array<ExpressionNode>): ExpressionNode() {
    @ExplodeLoop
    override fun execute(env: VirtualFrame): Any? {
        for(node in nodes) {
            node.execute(env)
        }
        return null
    }

    override fun toString(): String {
        return nodes.joinToString("\n")
    }
}