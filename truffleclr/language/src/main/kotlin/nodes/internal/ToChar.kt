package nodes.internal

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import main.Clr
import nodes.ExpressionNode
import types.CTSNull
import java.io.PrintStream

@NodeInfo(description = "ToChar")
class ToChar() :
    ExpressionNode() {

    override fun execute(env: VirtualFrame): Any? {
        return (env.arguments[0] as Number).toChar()
    }
}
