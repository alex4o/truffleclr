package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import kotlin.system.exitProcess

class Return(): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        exitProcess(0)
        return null
    }

    override fun toString(): String {
        return "return"
    }
}