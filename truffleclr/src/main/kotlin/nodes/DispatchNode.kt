package nodes

import com.oracle.truffle.api.CompilerAsserts
import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.ExplodeLoop.LoopExplosionKind
import com.oracle.truffle.api.nodes.LoopNode
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "dispatch")
class DispatchNode(@Children var blocks: Array<Block>) : ExpressionNode() {

    // TODO: Exceptions

    @ExplodeLoop(kind = LoopExplosionKind.MERGE_EXPLODE)
    override fun execute(env: VirtualFrame): Any? {
        CompilerAsserts.compilationConstant<Int>(blocks.size)

        var basicBlockIndex = 0
        var backEdgeCount = 0
        var returnValue: Any? = 0

        loop@ while (basicBlockIndex >= 0) {
//            CompilerAsserts.partialEvaluationConstant<Int>(basicBlockIndex)
            val block = blocks[basicBlockIndex]
//            println("Executing basic block: $basicBlockIndex");

            block.execute(env)

            val successor = block.controlFlowNode.executeControlFlow(env)
            if (CompilerDirectives.inInterpreter() && successor <= basicBlockIndex) {
                backEdgeCount += 1;
            }

            if(successor == -2) {
                returnValue = (block.controlFlowNode as ReturnValue).execute(env)
            }

            basicBlockIndex = successor
            continue@loop
        }

        LoopNode.reportLoopCount(this, backEdgeCount)
        return returnValue;

    }

    override fun toString(): String {
        return blocks.map { it.toString() }.joinToString("\n")
    }
}