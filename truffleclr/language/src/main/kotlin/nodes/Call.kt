package nodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.RootCallTarget
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.IndirectCallNode
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "call")
class Call(@CompilerDirectives.CompilationFinal val name: String, var callTarget: RootCallTarget, @Children var args: Array<ExpressionNode>): ExpressionNode() {

    @Child var callNode: IndirectCallNode = Truffle.getRuntime().createIndirectCallNode()

    @ExplodeLoop(kind = ExplodeLoop.LoopExplosionKind.FULL_EXPLODE_UNTIL_RETURN)
    override fun execute(env: VirtualFrame): Any? {
        val arguments = arrayOfNulls<Any>(args.size)
        for(i in 0 until args.size) {
            arguments[i] = args[i].execute(env)
        }
        return callNode.call(callTarget, *arguments)
//        println("Res: $res")
    }

    override fun toString(): String {
        return "(call $name ${args.joinToString(" ")})";
    }
}