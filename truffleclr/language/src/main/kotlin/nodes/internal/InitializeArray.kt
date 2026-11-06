package nodes.internal

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
import com.oracle.truffle.api.frame.VirtualFrame
import main.bytecode.ClrException
import nodes.ExpressionNode
import runtime.ClrObject
import types.CTSNull
import java.nio.ByteBuffer
import java.nio.ByteOrder

/** Copies only the bounded field payload supplied by the native metadata reader. */
class InitializeArray : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any = initialize(env.arguments[0], env.arguments[1])

    @TruffleBoundary
    private fun initialize(array: Any?, token: Any?): Any {
        if (array == null || array === CTSNull) throw ClrException.create("ArgumentNullException", "array")
        val handle = (token as? ClrObject)?.takeIf { it.type.name == "System.RuntimeFieldHandle" }
            ?: throw ClrException.create("ArgumentException", "Expected a managed field handle")
        val bytes = handle.type.resolveField("_data").read(handle) as? ByteArray
            ?: throw ClrException.create("ArgumentException", "Field has no static RVA data")
        val width = when (array) {
            is BooleanArray, is ByteArray -> 1
            is CharArray, is ShortArray -> 2
            is IntArray, is FloatArray -> 4
            is LongArray, is DoubleArray -> 8
            else -> throw ClrException.create("ArgumentException", "Expected a primitive vector array")
        }
        val count = java.lang.reflect.Array.getLength(array)
        // Division avoids overflowing count * width; validate before modifying any element.
        if (count > bytes.size / width) throw ClrException.create("ArgumentException", "RVA data is shorter than the array")
        val data = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
        when (array) {
            is BooleanArray -> for (i in array.indices) array[i] = data.get().toInt() != 0
            is ByteArray -> data.get(array)
            is CharArray -> for (i in array.indices) array[i] = data.char
            is ShortArray -> for (i in array.indices) array[i] = data.short
            is IntArray -> for (i in array.indices) array[i] = data.int
            is LongArray -> for (i in array.indices) array[i] = data.long
            is FloatArray -> for (i in array.indices) array[i] = data.float
            is DoubleArray -> for (i in array.indices) array[i] = data.double
        }
        return CTSNull
    }
}
