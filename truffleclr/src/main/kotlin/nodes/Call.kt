package nodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame

class Call(val name: String, @Children var args: Array<ExpressionNode>): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        this.print(args[0].execute(env))
        return null
    }

    @CompilerDirectives.TruffleBoundary
    fun print(any: Any?) {
        println(any)
    }

    override fun toString(): String {
        return name
    }
}