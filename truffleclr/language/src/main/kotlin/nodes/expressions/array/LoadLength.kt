package nodes.expressions.array

import com.oracle.truffle.api.frame.VirtualFrame
import nodes.ExpressionNode

class LoadLength(@Child var arrayNode: ExpressionNode): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        val array: IntArray = arrayNode.execute(env) as IntArray
        return array.size
    }

    override fun toString(): String {
        return "(ldlen $arrayNode)"
    }
}