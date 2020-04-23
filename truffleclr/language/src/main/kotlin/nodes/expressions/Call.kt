package nodes.expressions

import com.oracle.truffle.api.CallTarget
import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.nodes.DirectCallNode
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode
import runtime.Method

/**
 * Uses manual specialization, this needs to be done because the call node cannot be obtained
 * during object construction.
 */
@NodeInfo(shortName = "call")
class Call(var method: Method, @Children var args: Array<ExpressionNode>) : ExpressionNode() {
//    @Child var interopLib = InteropLibrary.getFactory().createDispatched(5)

    @Child
    @CompilerDirectives.CompilationFinal
    var callNode: DirectCallNode? = method.callNode

    @CompilerDirectives.CompilationFinal
    var nodeRady = false

    @ExplodeLoop(kind = ExplodeLoop.LoopExplosionKind.FULL_EXPLODE)
    override fun execute(env: VirtualFrame): Any? {
        val arguments = arrayOfNulls<Any>(args.size)
        for (i in args.indices) {
            arguments[i] = args[i].execute(env)
        }

//        if(CompilerDirectives.inInterpreter()) {
//            println("${method} (${arguments.joinToString(",")})")
//        }

//        return interopLib.execute(method, *arguments)
        return if (nodeRady)  {
            callNode!!.call(*arguments)
        } else {
            CompilerDirectives.transferToInterpreterAndInvalidate()
            callNode = method.callNode!!
            nodeRady = true
//            callTarget = callNode!!.callTarget as HotSpotOptimizedCallTarget
            callNode!!.call(*arguments)
        }
    }

    override fun toString(): String {
        return "(call ${method} ${args.joinToString(" ")})";
    }
}