package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "ldstr")
class LoadString(val string: String): ExpressionNode() {
    override fun execute(env: VirtualFrame): String {
        return string;
    }

    override fun toString(): String {
        return "(ldstr \"$string\")"
    }
}