package nodes.expressions

import com.oracle.truffle.api.frame.VirtualFrame
import nodes.ExpressionNode
import nodes.StatementNode

class StoreElement(@Child var arrayNode: ExpressionNode, @Child var indexNode: ExpressionNode, @Child var valueNode: ExpressionNode) : StatementNode() {
    override fun executeVoid(env: VirtualFrame) {
        val array: IntArray = arrayNode.execute(env) as IntArray
        val index = indexNode.executeInt(env)
        val value = valueNode.executeInt(env)
        array[index] = value
    }

    override fun toString(): String {
        return "(stelem $arrayNode $indexNode $valueNode)"
    }
}