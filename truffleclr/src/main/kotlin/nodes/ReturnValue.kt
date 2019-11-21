package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node

class ReturnValue(@Child var expr: Node): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        return null
    }

    override fun toString(): String {
        return "return $expr"
    }

}