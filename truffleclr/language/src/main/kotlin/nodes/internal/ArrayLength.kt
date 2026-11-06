package nodes.internal

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
import com.oracle.truffle.api.frame.VirtualFrame
import main.bytecode.ManagedReference
import nodes.ExpressionNode

class ArrayLength : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any = length(env.arguments[0])
    @TruffleBoundary
    private fun length(array: Any): Int = if (array is ManagedReference.ObjectArray) array.values.size
        else java.lang.reflect.Array.getLength(array)
}
