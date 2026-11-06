package nodes.internal

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
import com.oracle.truffle.api.frame.VirtualFrame
import main.bytecode.ClrException
import nodes.ExpressionNode

class StringConcat : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any = concat(env.arguments[0])
    @TruffleBoundary
    private fun concat(value: Any?): String {
        val strings = value as? Array<*> ?: throw ClrException.create("ArgumentNullException", "args")
        return strings.joinToString("") { it?.toString() ?: "" }
    }
}
