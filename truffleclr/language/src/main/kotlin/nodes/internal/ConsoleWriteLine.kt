package nodes.internal

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
import com.oracle.truffle.api.frame.VirtualFrame
import main.Clr
import nodes.ExpressionNode
import types.CTSNull

class ConsoleWriteLine0 : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any {
        writeLine()
        return CTSNull
    }
    @TruffleBoundary
    private fun writeLine() { Clr.contextReference.get(this).output.println() }
}
