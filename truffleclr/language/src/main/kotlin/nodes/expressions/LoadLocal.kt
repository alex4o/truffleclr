package nodes.expressions

import com.oracle.truffle.api.dsl.UnsupportedSpecializationException
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

@NodeInfo(shortName = "ldloc")
class LoadLocal(val index: Int, var slot: FrameSlot) : ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        if(isInt(env)) {
            return executeInt(env)
        }else if(isBoolean(env)) {
            return executeBool(env)
        }else{
            throw UnsupportedSpecializationException(this, arrayOf())
        }
    }

    override fun executeInt(env: VirtualFrame): Int {
        return env.getInt(slot)
    }

    override fun executeBool(env: VirtualFrame): Boolean {
        return env.getBoolean(slot)
    }

    fun isInt(frame: VirtualFrame): Boolean {
        return frame.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Int
    }

    fun isBoolean(frame: VirtualFrame): Boolean {
        return frame.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Boolean
    }

    override fun toString(): String {
        return "(ldloc $index)"
    }

}