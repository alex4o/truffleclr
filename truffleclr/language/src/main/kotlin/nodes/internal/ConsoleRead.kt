package nodes.internal

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

@NodeInfo(description = "Write")
class ConsoleRead() :
    ExpressionNode() {

    override fun execute(env: VirtualFrame): Any? {
        return read()
    }

    @CompilerDirectives.TruffleBoundary
    fun read(): Int {
        return 0 // TODO: Real Reed
    }
}
