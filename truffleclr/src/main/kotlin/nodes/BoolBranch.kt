package nodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node

class BoolBranch(
    @Child var a: ExpressionNode,
    @CompilerDirectives.CompilationFinal val cond: Boolean,
    @CompilerDirectives.CompilationFinal var trueCond: Int,
    @CompilerDirectives.CompilationFinal var falseCond: Int,
    var label: String
) : ControlFlowNode() {

    override fun executeControlFlow(env: VirtualFrame): Int {
        val adata = a.execute(env) as Boolean
        return if (adata == cond) {
            return trueCond
        } else {
            return falseCond
        }

    }

    override fun toString(): String {
        return "if($a == $cond) goto $label"
    }
}