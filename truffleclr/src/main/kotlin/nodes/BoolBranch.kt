package nodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node

class BoolBranch(
    @Child var a: ExpressionNode, @CompilerDirectives.CompilationFinal val cond: Boolean, @Child var goa: ExpressionNode, @Child var gob: ExpressionNode,
    val label: String
) : ExpressionNode() {

    override fun execute(env: VirtualFrame): Any? {
        val adata = a.execute(env) as Boolean
        return if (adata == cond) {
            goa.execute(env)
        } else {
            gob.execute(env)
        }

    }

    override fun toString(): String {
        return "if($a == $cond) goto $label"
    }
}