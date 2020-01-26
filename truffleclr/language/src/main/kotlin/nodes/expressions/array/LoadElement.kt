package nodes.expressions.array

import com.oracle.truffle.api.frame.VirtualFrame
import nodes.ExpressionNode
import nodes.StatementNode

class LoadElement(@Child var arrayNode: ExpressionNode, @Child var indexNode: ExpressionNode) : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        val array: IntArray = arrayNode.execute(env) as IntArray
        val index = indexNode.executeInt(env)

        return array[index]
    }


    override fun toString(): String {
        return "(ldelem $arrayNode $indexNode)"
    }
}