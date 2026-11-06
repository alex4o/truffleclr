package nodes.internal

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

@NodeInfo(description = "ToBoolean")
class ToBoolean() :
    ExpressionNode() {

    override fun execute(env: VirtualFrame): Any? {
        return env.arguments[0] != 0
    }


}
