package nodes.internal

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode
import kotlin.math.sqrt

@NodeInfo(description = "Math.Sqrt")
class Sqrt() :
    ExpressionNode() {

    override fun execute(env: VirtualFrame): Any? {
        return sqrt(env.arguments[0] as Double)
    }
}
