package nodes.internal

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode
import types.CTSNull

@NodeInfo(description = "GetHashCode")
class GetHashCode() :
    ExpressionNode() {

    override fun execute(env: VirtualFrame): Any? {
        env.arguments[0].hashCode()
        return CTSNull
    }
}
