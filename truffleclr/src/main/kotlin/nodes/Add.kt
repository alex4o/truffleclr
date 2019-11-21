package nodes

import com.oracle.truffle.api.frame.VirtualFrame

class Add(): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
//        val ptr = readStackPtr.execute(env)
//        val res = stack[ptr.toInt()] + stack[(ptr - 1).toInt()]
//        stack[ptr.toInt() - 1] = res
//
//        return writeStackPtr.execute(env, ptr)
        return null
    }
}