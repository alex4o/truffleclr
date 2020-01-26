package nodes.expressions.`object`

import com.oracle.truffle.api.frame.VirtualFrame
import nodes.ExpressionNode

class IsInstance(@Child var refNode: ExpressionNode): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        return false
    }

    override fun toString(): String {
        return "(isinst $refNode)"
    }
}