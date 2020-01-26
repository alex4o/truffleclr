package nodes.expressions.`object`

import com.oracle.truffle.api.frame.VirtualFrame
import nodes.ExpressionNode
import nodes.StatementNode

class LoadIndirect(@Child var refNode: ExpressionNode) : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
//        val array: IntArray = arrayNode.execute(env) as IntArray
//        val index = indexNode.executeInt(env)
//
//        return array[index]
        return 0
    }


    override fun toString(): String {
        return "(ldind $refNode)"
    }
}