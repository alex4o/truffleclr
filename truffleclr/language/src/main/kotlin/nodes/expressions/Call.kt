package nodes.expressions

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.RootCallTarget
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.nodes.DirectCallNode
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.IndirectCallNode
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode
import runtime.Method

@NodeInfo(shortName = "call")
class Call(var method: Method, @Children var args: Array<ExpressionNode>): ExpressionNode() {

    @Child var callNode: IndirectCallNode = Truffle.getRuntime().createIndirectCallNode()
//    @Child var callNode: DirectCallNode = Truffle.getRuntime().createDirectCallNode(callTarget)
    @Child var interopLib = InteropLibrary.getFactory().createDispatched(5)

    @ExplodeLoop(kind = ExplodeLoop.LoopExplosionKind.FULL_EXPLODE_UNTIL_RETURN)
    override fun execute(env: VirtualFrame): Any? {
        val arguments = arrayOfNulls<Any>(args.size)
        for(i in 0 until args.size) {
            arguments[i] = args[i].execute(env)
        }
        if(CompilerDirectives.inInterpreter()) {
            println("${method.name} (${arguments.joinToString(",")})")
        }
        return interopLib.execute(method, *arguments)
//        println("Res: $res")
//        return callNode.call(*arguments)
    }

    override fun toString(): String {
        return "(call ${method.name} ${args.joinToString(" ")})";
    }
}