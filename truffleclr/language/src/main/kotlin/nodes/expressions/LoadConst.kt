package nodes.expressions

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode
import kotlin.reflect.KClass
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder

@NodeInfo(shortName = "ldc")
class LoadConst(@CompilerDirectives.CompilationFinal @JvmField val number: Long, @CompilerDirectives.CompilationFinal @JvmField val type: KClass<*>): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        if(type == Int::class) {
            return executeInt(env)
        }
        if(type == Long::class) {
            return executeLong(env)
        }
        if(type == Float::class) {
            return executeFloat(env)
        }
        if(type == Double::class) {
            return executeDouble(env)
        }
        CompilerDirectives.transferToInterpreter()
        error("Unknown constant type")
    }

    override fun executeInt(env: VirtualFrame): Int {
        return number.toInt()
    }

    override fun executeLong(env: VirtualFrame): Long {
        return number
    }

    override fun executeFloat(env: VirtualFrame): Float {
        return number.toFloat()
    }

    override fun executeDouble(env: VirtualFrame): Double {
        return number.toDouble()
    }

    override fun toString(): String {
        return "(ldc $number)"
    }

    val label = this.toString()
}