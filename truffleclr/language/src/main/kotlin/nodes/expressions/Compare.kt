package nodes.expressions

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

@NodeInfo(shortName = "cmp")
class Compare(@Child var a: ExpressionNode, @Child var b: ExpressionNode, val cond: String): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        return executeBool(env);
    }

    override fun executeBool(env: VirtualFrame): Boolean {
        val adata = a.executeInt(env)
        val bdata = b.executeInt(env)
//        println("$adata $cond $bdata")

        return when (cond) {
            "<" -> {
                adata < bdata
            }
            ">" -> {
                adata > bdata
            }
            ">=" -> {
                adata >= bdata
            }
            "<=" -> {
                adata <= bdata
            }
            else -> {
                adata == bdata
            }
        }

    }

    override fun toString(): String {
        return "(${when(cond) { ">" -> "cgt" "<" -> "clt" ">=" -> "cge" "<=" -> "cle" else -> "ceq"}} $a  $b)"
    }
}