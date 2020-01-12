package nodes

import com.oracle.truffle.api.frame.VirtualFrame

class StoreLocal(@Child var expressionNode: ExpressionNode, val index: Int, @Child var write: WriteLocal): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        val value = expressionNode.execute(env)!!
        return write.execute(env, value)
    }

    override fun toString(): String {
        return "(stloc $index $expressionNode)"
    }


}