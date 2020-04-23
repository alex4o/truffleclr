package nodes.internal

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import main.Clr
import nodes.ExpressionNode
import types.CTSNull
import java.io.PrintStream
import java.text.DecimalFormat

@NodeInfo(description = "Write")
class ConsoleWrite() :
    ExpressionNode() {

    val context by lazy {
        lookupContextReference(Clr::class.java).get()
    }

    val stream by lazy {
        PrintStream(context.env.out())
    }

    @CompilerDirectives.CompilationFinal
    var type: Class<*>? = null

    override fun execute(env: VirtualFrame): Any? {

        when (type) {
            Double::class.java -> {
                write(env.arguments[0] as Double)
            }
            Float::class.java -> {
                write(env.arguments[0] as Float)
            }
            Boolean::class.java -> {
                write(env.arguments[0] as Boolean)
            }
            Any::class.java -> {
                write(env.arguments[0])

            }
            null -> {
                type = env.arguments[0].javaClass
                this.execute(env)
            }
            else -> {
                write(env.arguments[0])
            }
        }


        return CTSNull
    }

    val formater = DecimalFormat.getInstance()
    init {
        formater.maximumFractionDigits = 15
    }

    @CompilerDirectives.TruffleBoundary
    fun write(any: Any?) {
        stream.print(any)
    }

    @CompilerDirectives.TruffleBoundary
    fun write(any: Double) {
        stream.println(formater.format(any))
    }

    @CompilerDirectives.TruffleBoundary
    fun write(any: Float) {
        stream.println(formater.format(any))
    }


}
