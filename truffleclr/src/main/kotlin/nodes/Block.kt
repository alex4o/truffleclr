package nodes

import com.oracle.truffle.api.CompilerDirectives.CompilationFinal
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "block")
class Block(var id: Int, var name: String): ExpressionNode() {

    @Children var nodes: Array<ExpressionNode> = arrayOf()
    lateinit var controlFlowNode: ControlFlowNode

    @ExplodeLoop(kind = ExplodeLoop.LoopExplosionKind.FULL_EXPLODE_UNTIL_RETURN)
    override fun execute(env: VirtualFrame): Any? {
        for(node in nodes) {
            node.execute(env)
        }
        return 0
    }

    override fun toString(): String {
        return (nodes + controlFlowNode).joinToString("\n", postfix = "\n");
    }
}