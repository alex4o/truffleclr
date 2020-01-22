package nodes

import com.oracle.truffle.api.CompilerAsserts
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "block")
class Block(var id: Int,var name: String) : StatementNode() {
    @Children lateinit var nodes: Array<StatementNode>
    @Child lateinit var controlFlowNode: ControlFlowNode

    @ExplodeLoop
    override fun executeVoid(env: VirtualFrame) {
        CompilerAsserts.compilationConstant<Any>(nodes.size)
        for (node in nodes) {
            node.executeVoid(env)
        }
    }

    override fun toString(): String {
        return (nodes).joinToString("\n", postfix = "\n") + controlFlowNode.toString();
    }

}