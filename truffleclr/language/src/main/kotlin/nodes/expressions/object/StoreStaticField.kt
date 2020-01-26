package nodes.expressions.`object`

import com.oracle.truffle.api.frame.VirtualFrame
import nodes.ExpressionNode
import nodes.StatementNode

class StoreStaticField(var fieldName: String, @Child var valueNode: ExpressionNode) : StatementNode() {
    override fun executeVoid(env: VirtualFrame) {

    }

    override fun toString(): String {
        return "(stsfld $fieldName $valueNode)"
    }
}