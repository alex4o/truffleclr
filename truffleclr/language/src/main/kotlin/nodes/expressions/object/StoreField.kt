package nodes.expressions.`object`

import com.oracle.truffle.api.frame.VirtualFrame
import nodes.ExpressionNode
import nodes.StatementNode

class StoreField(@Child var objectNode: ExpressionNode, var fieldName: String, @Child var valueNode: ExpressionNode) : StatementNode() {
    override fun executeVoid(env: VirtualFrame) {

    }

    override fun toString(): String {
        return "(stfld $objectNode $fieldName $valueNode)"
    }
}