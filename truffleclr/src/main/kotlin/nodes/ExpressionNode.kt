package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(language = "truffleclr", description = "", shortName = "")
abstract class ExpressionNode: Node() {
    abstract fun execute(env: VirtualFrame): Any?
}