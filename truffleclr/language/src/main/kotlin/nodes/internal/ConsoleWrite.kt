package nodes.internal

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
import com.oracle.truffle.api.frame.VirtualFrame
import main.Clr
import main.bytecode.ManagedReference
import nodes.ExpressionNode
import runtime.ClrObject
import runtime.CorElementType
import types.CTSNull
import java.text.DecimalFormat

class ConsoleWrite(private val argumentType: CorElementType = CorElementType.OBJECT,
                   private val newline: Boolean = false) : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any = write(env.arguments[0])
    @TruffleBoundary
    private fun write(value: Any?): Any {
        val formatted = when {
            value == null || value === CTSNull -> ""
            argumentType == CorElementType.BOOLEAN -> if (value == true || value is Int && value != 0) "True" else "False"
            argumentType == CorElementType.CHAR -> if (value is Number) value.toInt().toChar().toString() else value.toString()
            argumentType == CorElementType.U4 -> Integer.toUnsignedString((value as Number).toInt())
            argumentType == CorElementType.U8 -> java.lang.Long.toUnsignedString((value as Number).toLong())
            value is ClrObject -> value.type.virtualTable.first { it.metadata.name == "ToString" }.callTarget.call(value).let { if (it == null || it === CTSNull) "" else it.toString() }
            value is ManagedReference.Box -> value.toString()
            value is Boolean -> if (value) "True" else "False"
            value is Double || value is Float -> DecimalFormat.getInstance().apply { maximumFractionDigits = 15 }.format(value)
            else -> value.toString()
        }
        val stream = Clr.contextReference.get(this).output
        if (newline) stream.println(formatted) else stream.print(formatted)
        return CTSNull
    }
}
