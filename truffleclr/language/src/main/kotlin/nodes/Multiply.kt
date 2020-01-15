package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "mul")
class Multiply(@Child var a: ExpressionNode, @Child var b: ExpressionNode): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        return a.execute(env) as Int * b.execute(env) as Int
    }

    override fun toString(): String {
        return "(mul $a $b)"
    }
}