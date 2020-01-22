package nodes.test;

import com.oracle.truffle.api.CompilerAsserts
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import nodes.ControlFlowNode
import nodes.ExpressionNode
import nodes.StatementNode
import types.CTSNull

@NodeInfo(shortName = "block")
class Loop(@Node.Child var testNode: ExpressionNode) : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        for(i in 0 .. 1000) {
            testNode.execute(env)
        }
        return CTSNull;
    }
}