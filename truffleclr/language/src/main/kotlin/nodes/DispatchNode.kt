package nodes

import com.oracle.truffle.api.CompilerAsserts
import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.ExplodeLoop.LoopExplosionKind
import com.oracle.truffle.api.nodes.LoopNode
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.controlflow.BoolBranch
import nodes.controlflow.Branch
import nodes.controlflow.Return
import nodes.controlflow.ReturnValue

/**
 * Dispatches basic blocks the same way that sulong does.
 * There are no profiling and probabilities for branches.
 */
@NodeInfo(shortName = "dispatch")
class DispatchNode(@Children var blocks: Array<Block>) : ExpressionNode() {

    // TODO: Exceptions

    @ExplodeLoop(kind = LoopExplosionKind.MERGE_EXPLODE)
    override fun execute(env: VirtualFrame): Any? {
        CompilerAsserts.compilationConstant<Int>(blocks.size)

        var basicBlockIndex = 0
        var backEdgeCount = 0
        var returnValue: Any? = 0

        while (basicBlockIndex != -1) {
            CompilerAsserts.partialEvaluationConstant<Any>(basicBlockIndex)
            val block = blocks[basicBlockIndex]
            block.executeVoid(env)
//            println(block.controlFlowNode)
            if (block.controlFlowNode is BoolBranch) {
                val br = block.controlFlowNode as BoolBranch
                if (br.executeInt(env) == 0) {
                    val successor = block.controlFlowNode.successors[0]
                    if (CompilerDirectives.inInterpreter() && successor <= basicBlockIndex) {
                        backEdgeCount += 1
                    }
                    basicBlockIndex = successor
                    continue
                } else {
                    val successor = block.controlFlowNode.successors[1]
                    if (CompilerDirectives.inInterpreter() && successor <= basicBlockIndex) {
                        backEdgeCount += 1
                    }
                    basicBlockIndex = successor
                    continue
                }
            } else if (block.controlFlowNode is Branch) {
                basicBlockIndex = block.controlFlowNode.successors[0]
                continue
            } else if (block.controlFlowNode is Return) {
                basicBlockIndex = -1
                continue
            } else if (block.controlFlowNode is ReturnValue) {
                returnValue = block.controlFlowNode.execute(env)
                basicBlockIndex = -1
                continue
            } else {
                Truffle.getRuntime().notifyTransferToInterpreter()
                error("Encountered unknown control flow node")
            }
        }

        LoopNode.reportLoopCount(this, backEdgeCount)
        return returnValue

    }

    override fun toString(): String {
        return blocks.map { it.toString() }.joinToString("\n", postfix = "\n")
    }
}