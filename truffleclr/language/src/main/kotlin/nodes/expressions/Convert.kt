package nodes.expressions

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

@NodeInfo(shortName = "convert")
class Convert(@Child var expressionNode: ExpressionNode): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        return expressionNode.execute(env) == 1
    }

    override fun toString(): String {
        return "(boolean $expressionNode)"
    }


}