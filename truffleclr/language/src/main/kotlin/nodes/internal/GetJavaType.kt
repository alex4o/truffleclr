package nodes.internal

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import main.Clr
import nodes.ExpressionNode
import types.CTSNull
import java.io.PrintStream

@NodeInfo(description = "GetJavaType")
class GetJavaType() :
    ExpressionNode() {

    val context by lazy {
        lookupContextReference(Clr::class.java).get()
    }

    override fun execute(env: VirtualFrame): Any? {
        run(env.arguments[0] as String)
    }

    @CompilerDirectives.TruffleBoundary
    fun run(name: String): Any {
        return context.env.lookupHostSymbol(name);

    }
}
