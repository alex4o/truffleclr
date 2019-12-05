package nodes

import com.oracle.truffle.api.frame.VirtualFrame

class Convert(@Child var expressionNode: ExpressionNode): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        return expressionNode.execute(env) == 1
    }

    override fun toString(): String {
        return "($expressionNode as boolean)"
    }


}