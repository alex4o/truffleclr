package nodes

import com.oracle.truffle.api.CompilerDirectives.CompilationFinal
import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame

class LoadArgument(@CompilationFinal val index: Int) : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        return env.arguments[index]
    }

    override fun toString(): String {
        return "argument$index"
    }

}