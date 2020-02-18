package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import types.CTSNull

@NodeInfo(shortName = "break")
class BreakPoint : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        return CTSNull
    }

}
