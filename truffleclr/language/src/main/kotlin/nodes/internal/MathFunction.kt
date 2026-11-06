package nodes.internal

import com.oracle.truffle.api.frame.VirtualFrame
import nodes.ExpressionNode

class MathFunction(private val operation: String) : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any {
        val a = (env.arguments[0] as Number).toDouble()
        return when (operation) {
            "Abs" -> Math.abs(a)
            "Floor" -> Math.floor(a)
            "Ceiling" -> Math.ceil(a)
            "Round" -> Math.rint(a)
            "Sin" -> Math.sin(a)
            "Cos" -> Math.cos(a)
            "Tan" -> Math.tan(a)
            "Atan" -> Math.atan(a)
            "Exp" -> Math.exp(a)
            "Log" -> Math.log(a)
            "Sqrt" -> Math.sqrt(a)
            "Min" -> Math.min(a, (env.arguments[1] as Number).toDouble())
            "Max" -> Math.max(a, (env.arguments[1] as Number).toDouble())
            "Pow" -> {
                val exponent = (env.arguments[1] as Number).toDouble()
                // .NET follows C pow: these identities also hold for NaN/infinite exponents.
                if (a == 1.0 || a == -1.0 && exponent.isInfinite()) 1.0 else Math.pow(a, exponent)
            }
            "Atan2" -> Math.atan2(a, (env.arguments[1] as Number).toDouble())
            else -> error(operation)
        }
    }
}
