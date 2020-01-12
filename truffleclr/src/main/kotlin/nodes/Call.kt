package nodes

import com.oracle.truffle.api.CallTarget
import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "call")
class Call(@CompilerDirectives.CompilationFinal val name: String, var callTarget: CallTarget,  @Children var args: Array<ExpressionNode>): ExpressionNode() {

    @ExplodeLoop
    override fun execute(env: VirtualFrame): Any? {
        val arguments = arrayOfNulls<Any>(args.size)
        for(i in 0 until args.size) {
            arguments[i] = args[i].execute(env)
        }
        return callTarget.call(*arguments)
//        println("Res: $res")
    }

    override fun toString(): String {
        return "(call $name ${args.joinToString(" ")})";
    }
}