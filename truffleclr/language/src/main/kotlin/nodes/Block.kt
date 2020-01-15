package nodes

import com.oracle.truffle.api.CompilerAsserts
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "block")
class Block(var id: Int,var name: String) : Node() {
    @Children lateinit var nodes: Array<ExpressionNode>
    @Child lateinit var controlFlowNode: ControlFlowNode

    @ExplodeLoop
    fun executeStatements(env: VirtualFrame?) {
        CompilerAsserts.compilationConstant<Any>(nodes.size)
        for (node in nodes) {
            node.execute(env!!)
        }
    }

    override fun toString(): String {
        return (nodes + controlFlowNode).joinToString("\n", postfix = "\n");
    }

}