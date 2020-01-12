package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "ldloc")
class LoadLocal(val index: Int, @Child var read: ReadLocal) : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        return read.execute(env)
    }

    override fun toString(): String {
        return "(ldloc $index)"
    }

}