package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(language = "truffleclr", description = "", shortName = "expression")
abstract class ExpressionNode: Node() {
    abstract fun execute(env: VirtualFrame): Any?
    open fun executeBool(env: VirtualFrame): Boolean {
        return execute(env) as Boolean
    }

    open fun executeInt(env: VirtualFrame): Int {
        return execute(env) as Int
    }

}