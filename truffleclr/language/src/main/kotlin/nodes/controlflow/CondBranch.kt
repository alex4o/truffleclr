package nodes.controlflow

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

@NodeInfo(shortName = "cndbr")
class CondBranch(
    @Child var a: ExpressionNode, @Child var b: ExpressionNode, @CompilerDirectives.CompilationFinal val cond: String, @Child var goa: ExpressionNode, @Child var gob: ExpressionNode,
    val label: String
) : ExpressionNode() {

    override fun execute(env: VirtualFrame): Any? {
        val adata: Long = a.execute(env) as Long
        val bdata: Long = b.execute(env) as Long

        val bool = if (cond == "==") {
            adata == bdata
        } else if (cond == "<") {
            adata < bdata
        } else {
            false
        }

        return if (bool) {
            goa.execute(env)
        } else {
            gob.execute(env)
        }

    }

    override fun toString(): String {
        return "(br$cond $a $b $label)"
    }
}