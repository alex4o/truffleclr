package nodes

import com.oracle.truffle.api.frame.VirtualFrame

class StoreLocal(@Child var expressionNode: ExpressionNode, val index: Int, @Child var write: WriteLocal): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        return write.execute(env, expressionNode.execute(env)!!)
    }

    override fun toString(): String {
        return "local$index = $expressionNode"
    }


}