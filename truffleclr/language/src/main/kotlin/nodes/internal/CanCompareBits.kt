package nodes.internal

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

@NodeInfo(description = "CanCompareBits")
class CanCompareBits() :
    ExpressionNode() {

    override fun execute(env: VirtualFrame): Any? {
        return run(env.arguments[0])
    }

    @CompilerDirectives.TruffleBoundary
    fun run(any: Any): Any {
        return false
    }
}
