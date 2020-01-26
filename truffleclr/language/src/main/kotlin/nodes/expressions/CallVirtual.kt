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

@NodeInfo(shortName = "callvirt")
class CallVirtual(var methodName: String, @Children var args: Array<ExpressionNode>): ExpressionNode() {

    @Child var callNode: IndirectCallNode = Truffle.getRuntime().createIndirectCallNode()
//    @Child var callNode: DirectCallNode = Truffle.getRuntime().createDirectCallNode(callTarget)
    @Child var interopLib = InteropLibrary.getFactory().createDispatched(5)

    @ExplodeLoop(kind = ExplodeLoop.LoopExplosionKind.FULL_EXPLODE_UNTIL_RETURN)
    override fun execute(env: VirtualFrame): Any? {
        return 0
    }

    override fun toString(): String {
        return "(callvirt ${methodName} ${args.joinToString(" ")})";
    }
}