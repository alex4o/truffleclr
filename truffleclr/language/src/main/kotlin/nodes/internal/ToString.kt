package nodes.internal

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

@NodeInfo(description = "ToString")
class ToString() :
    ExpressionNode() {

    override fun execute(env: VirtualFrame): Any? {
        val value = env.arguments[0]
        return (if (value is main.bytecode.ManagedReference) value.get() else value).toString()
    }
}
