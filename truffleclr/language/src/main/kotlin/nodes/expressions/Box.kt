package nodes.expressions

import com.oracle.truffle.api.dsl.*
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

@NodeInfo(shortName = "box")
@NodeChild("value")
abstract class Box : ExpressionNode() {
    override abstract fun execute(env: VirtualFrame): Any?

    @Specialization
    fun executeObject(value: Int): Any {
        return value
    }


    override fun toString(): String {
        return "(box ${this.children.joinToString(" ")})"
    }
}