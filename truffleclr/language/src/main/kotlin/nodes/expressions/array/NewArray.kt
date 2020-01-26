package nodes.expressions.array

import com.oracle.truffle.api.frame.VirtualFrame
import nodes.ExpressionNode

class NewArray(@Child var sizeNode: ExpressionNode): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        val size = sizeNode.executeInt(env)
        return IntArray(size)
    }

    override fun toString(): String {
        return "(newarr int32 $sizeNode)"
    }
}