package nodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame

class Call(@CompilerDirectives.CompilationFinal val name: String, @Children var args: Array<ExpressionNode>): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {

        this.writeLine(args[0].execute(env))
        return null
    }


    @CompilerDirectives.TruffleBoundary
    fun writeLine(any: Any?) {
        println("$name($any)")
    }

    override fun toString(): String {
        return name
    }
}