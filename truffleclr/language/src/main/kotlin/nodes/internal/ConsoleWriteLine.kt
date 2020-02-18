package nodes.internal

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import main.Clr
import nodes.ExpressionNode
import types.CTSNull
import java.io.PrintStream

@NodeInfo(description = "WriteLine")
class ConsoleWriteLine() :
    ExpressionNode() {
    val context by lazy {
        lookupContextReference(Clr::class.java).get()
    }

    val stream by lazy {
        PrintStream(context.env.out())
    }

    override fun execute(env: VirtualFrame): Any? {
        writeLine(env.arguments[0])
        return CTSNull
    }

    @CompilerDirectives.TruffleBoundary
    fun writeLine(any: Any?) {
        stream.println(any)
    }
}

@NodeInfo(shortName = "WriteLine")
class ConsoleWriteLine0() :
    ExpressionNode() {
    val context by lazy {
        lookupContextReference(Clr::class.java).get()
    }

    val stream by lazy {
        PrintStream(context.env.out())
    }

    override fun execute(env: VirtualFrame): Any? {
        writeLine()
        return CTSNull
    }

    @CompilerDirectives.TruffleBoundary
    fun writeLine() {
        stream.println()
    }
}
