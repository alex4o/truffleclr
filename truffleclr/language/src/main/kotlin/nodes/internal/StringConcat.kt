package nodes.internal

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

@NodeInfo(description = "String.Concat")
class StringConcat() :
    ExpressionNode() {

    override fun execute(env: VirtualFrame): Any? {
        return (env.arguments[0] as Array<String>).joinToString()
    }
}
