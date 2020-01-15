package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "break")
class BreakPoint : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        
        return 0
    }

}
