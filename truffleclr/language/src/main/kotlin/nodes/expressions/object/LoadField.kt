package nodes.expressions.`object`

import com.oracle.truffle.api.frame.VirtualFrame
import nodes.ExpressionNode
import nodes.StatementNode

class LoadField(@Child var arrayNode: ExpressionNode, var fieldName: String) : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
//        val array: IntArray = arrayNode.execute(env) as IntArray
//        val index = indexNode.executeInt(env)
//
//        return array[index]
        return 0
    }


    override fun toString(): String {
        return "(ldfld $fieldName)"
    }
}