package nodes.internal

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.nodes.NodeInfo
import main.Clr
import nodes.ExpressionNode
import types.CTSNull
import java.io.PrintStream

@NodeInfo(description = "GetJavaType")
class CallJavaMethod() :
    ExpressionNode() {
    @Child var interopLib = InteropLibrary.getFactory().createDispatched(5)

    val context by lazy {
        lookupContextReference(Clr::class.java).get()
    }

    override fun execute(env: VirtualFrame): Any? {
        return run(env.arguments[0])
    }

    @CompilerDirectives.TruffleBoundary
    fun run(clazz: Any): Any {
        return interopLib.execute(clazz)
    }
}
