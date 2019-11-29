package nodes

import com.oracle.truffle.api.CompilerAsserts
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.ExplodeLoop.LoopExplosionKind
import com.oracle.truffle.api.nodes.LoopNode

class DispatchNode(@Children var blocks: Array<Block>) : ExpressionNode() {

    // TODO: Exceptions

    @ExplodeLoop(kind = LoopExplosionKind.MERGE_EXPLODE)
    override fun execute(env: VirtualFrame): Any? {
        CompilerAsserts.compilationConstant<Int>(blocks.size)

        var basicBlockIndex = 0
        var backEdgeCount = 0

        while (basicBlockIndex != -1) {
            CompilerAsserts.partialEvaluationConstant<Int>(basicBlockIndex)
            val block = blocks[basicBlockIndex]

            block.execute(env)

            val successor = block.controlFlowNode.executeControlFlow(env)
            if(successor <= basicBlockIndex) {
                backEdgeCount += 1
            }
            basicBlockIndex = successor
        }

        LoopNode.reportLoopCount(this, backEdgeCount)
        return null;

    }

    override fun toString(): String {
        return blocks.map { it.toString() }.joinToString("\n")
    }
}