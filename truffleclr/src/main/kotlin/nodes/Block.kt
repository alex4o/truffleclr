package nodes

import com.oracle.truffle.api.CompilerDirectives.CompilationFinal
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop


class Block(var id: Int, var name: String): ExpressionNode() {

    @Children var nodes: Array<ExpressionNode> = arrayOf()
    lateinit var controlFlowNode: ControlFlowNode

    @ExplodeLoop
    override fun execute(env: VirtualFrame): Any? {
        for(node in nodes) {
            node.execute(env)
        }
        return null
    }

    override fun toString(): String {
        return nodes.joinToString("\n", postfix = "\n") + controlFlowNode;
    }
}