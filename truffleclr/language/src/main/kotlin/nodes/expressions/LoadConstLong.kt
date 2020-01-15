package nodes.expressions

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

@NodeInfo(shortName = "ldc.i8")
class LoadConstLong(val number: Long): ExpressionNode() {
    override fun execute(env: VirtualFrame): Long {
        return number;
    }

    override fun toString(): String {
        return "(ldc $number)"
    }
}