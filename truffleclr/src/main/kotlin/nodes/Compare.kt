package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node

class Compare(@Child var a: ExpressionNode, @Child var b: ExpressionNode, val cond: String): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        val adata = a.execute(env) as Int
        val bdata = b.execute(env) as Int

        return adata < bdata

    }

    override fun toString(): String {
        return "$a $cond $b"
    }
}