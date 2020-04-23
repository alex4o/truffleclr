package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import types.CTSNull


/**
 * The break instruction produces this node. Useful for debugging.
 */
@NodeInfo(shortName = "break")
class BreakPoint : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        return CTSNull
    }

}
