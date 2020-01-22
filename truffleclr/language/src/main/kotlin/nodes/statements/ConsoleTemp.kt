package nodes.statements

import com.oracle.truffle.api.CompilerAsserts
import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import main.Clr
import nodes.ExpressionNode
import types.CTSNull
import java.io.PrintStream

@NodeInfo(shortName = "print")
class ConsoleTemp(@CompilerDirectives.CompilationFinal val name: String, @Children var args: Array<ExpressionNode>) :
    ExpressionNode() {
    val context by lazy {
        lookupContextReference(Clr::class.java).get()
    }

    val stream by lazy {
        PrintStream(context.env.out())
    }

    var method = if (name.startsWith("WriteLine")) {
        this::writeLine
    } else {
        this::write
    }

    override fun execute(env: VirtualFrame): Any? {
        method(args[0].execute(env))
        return CTSNull
    }

    @CompilerDirectives.TruffleBoundary
    fun writeLine(any: Any?) {
        stream.println(any)
    }

    @CompilerDirectives.TruffleBoundary
    fun write(any: Any?) {
        stream.print(any)
    }

    override fun toString(): String {
        return "(call $name ${args.joinToString(" ")})";
    }
}
