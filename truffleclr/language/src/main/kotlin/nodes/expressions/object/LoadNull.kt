package nodes.expressions.`object`

import com.oracle.truffle.api.frame.VirtualFrame
import nodes.ExpressionNode
import nodes.StatementNode
import types.CTSNull

class LoadNull() : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        return CTSNull
    }


    override fun toString(): String {
        return "(ldnull)"
    }
}