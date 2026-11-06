package nodes.internal

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

@NodeInfo(description = "FastEqualsCheck")
class FastEqualsCheck() :
    ExpressionNode() {

    override fun execute(env: VirtualFrame): Any? {
        return run(env.arguments[0], env.arguments[1])
    }

    @CompilerDirectives.TruffleBoundary
    fun run(a: Any, b: Any): Any {
        return false
    }
}
