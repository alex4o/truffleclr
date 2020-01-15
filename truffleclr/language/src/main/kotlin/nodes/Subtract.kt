package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "sub")
class Subtract(@Child var a: ExpressionNode, @Child var b: ExpressionNode): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
//        val ptr = readStackPtr.execute(env)
//        val res = stack[ptr.toInt()] + stack[(ptr - 1).toInt()]
//        stack[ptr.toInt() - 1] = res
//
//        return writeStackPtr.execute(env, ptr)
        return a.execute(env) as Int - b.execute(env) as Int
    }

    override fun toString(): String {
        return "(sub $a $b)"
    }
}