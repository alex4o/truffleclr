package nodes.internal

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import main.Clr
import nodes.ExpressionNode
import types.CTSNull
import java.io.PrintStream

@NodeInfo(shortName = "CanCompareBits")
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
