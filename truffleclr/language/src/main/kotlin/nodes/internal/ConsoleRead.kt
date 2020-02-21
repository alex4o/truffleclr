package nodes.internal

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import main.Clr
import nodes.ExpressionNode
import types.CTSNull
import java.io.PrintStream

@NodeInfo(description = "Write")
class ConsoleRead() :
    ExpressionNode() {

    val context by lazy {
        lookupContextReference(Clr::class.java).get()
    }

    val stream by lazy {
        PrintStream(context.env.out())
    }

    override fun execute(env: VirtualFrame): Any? {
        return read()
    }

    @CompilerDirectives.TruffleBoundary
    fun read(): Int {
        return 0 // TODO: Real Reed
    }
}
