package nodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo

/**
 * The root node for branch nodes as they all need to have a successors array
 * and a custom execute method.
 */
@NodeInfo(shortName = "cfn")
abstract class ControlFlowNode : ExpressionNode() /*, InstrumentableNode */{

    @CompilerDirectives.CompilationFinal(dimensions = 1)
    lateinit var successors: IntArray

    //    @Specialization(replaces = ["execute(env)"])
    abstract fun executeControlFlow(env: VirtualFrame): Int

    override fun execute(env: VirtualFrame): Any? {
        return executeControlFlow(env)
    }



   /* override fun isInstrumentable(): Boolean {
        return true;
    }

    override fun createWrapper(probe: ProbeNode?): InstrumentableNode.WrapperNode {

    }*/
}