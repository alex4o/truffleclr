package nodes.expressions

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode
import kotlin.reflect.KClass
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder

@NodeInfo(shortName = "ldc")
class LoadConst(@CompilerDirectives.CompilationFinal @JvmField val number: Number): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        return number
    }

    val label = this.toString()

    override fun toString(): String {
        return "(ldc $number)"
    }
}