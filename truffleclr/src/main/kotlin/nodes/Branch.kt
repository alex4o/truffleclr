package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node

class Branch(@Child var a: ExpressionNode, @Child var b: ExpressionNode, val cond: String, @Child var goa: ExpressionNode, @Child var gob: ExpressionNode): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        val adata: Long = a.execute(env) as Long
        val bdata: Long = b.execute(env) as Long

        return if(adata >= bdata) {
            goa.execute(env)
        }else{
            gob.execute(env)
        }

    }

    override fun toString(): String {
        return "if($a $cond $b) {\n$goa\n} else {\n$gob\n}"
    }
}