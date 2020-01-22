package nodes.test;

import com.oracle.truffle.api.CompilerAsserts
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import nodes.ControlFlowNode
import nodes.ExpressionNode
import nodes.StatementNode

@NodeInfo(shortName = "block")
class BlockTest(@Node.Children var nodes: Array<ExpressionNode>, @Node.Child var controlFlowNode: ControlFlowNode) : ExpressionNode() {


    @ExplodeLoop
    override fun execute(env: VirtualFrame): Any? {
        CompilerAsserts.compilationConstant<Any>(nodes.size)
        for (node in nodes) {
            node.execute(env)
        }
        return controlFlowNode.execute(env)
    }

    override fun toString(): String {
        return (nodes).joinToString("\n", postfix = "\n") + controlFlowNode.toString();
    }

}