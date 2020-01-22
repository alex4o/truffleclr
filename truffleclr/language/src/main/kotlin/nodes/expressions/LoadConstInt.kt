package nodes.expressions

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

@NodeInfo(shortName = "ldc.i4")
class LoadConstInt(val number: Int): ExpressionNode() {
    override fun execute(env: VirtualFrame): Int {
        return executeInt(env);
    }

    override fun executeInt(env: VirtualFrame): Int {
        return number
    }

    override fun toString(): String {
        return "(ldc $number)"
    }

    val label = this.toString()
}