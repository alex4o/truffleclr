package nodes.expressions

import com.oracle.truffle.api.dsl.NodeField
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.dsl.UnsupportedSpecializationException
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

@NodeInfo(shortName = "ldloc")
@NodeField(name = "slot", type = FrameSlot::class)
abstract class LoadLocal(val index: Int) : ExpressionNode() {
    public abstract val slot: FrameSlot?

    override abstract fun execute(env: VirtualFrame): Any?

    @Specialization(guards = ["isInt(env)"])
    override fun executeInt(env: VirtualFrame): Int {
        return env.getInt(slot)
    }
    @Specialization(guards = ["isBoolean(env)"])
    override fun executeBool(env: VirtualFrame): Boolean {
        return env.getBoolean(slot)
    }

    @Specialization(guards = ["isObject(env)"], replaces = ["executeInt", "executeBool"])
    fun executeObject(env: VirtualFrame): Any? {
        return env.getObject(slot)
    }

    fun isInt(env: VirtualFrame): Boolean {
        return env.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Int
    }

    fun isBoolean(env: VirtualFrame): Boolean {
        return env.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Boolean
    }

    fun isObject(env: VirtualFrame): Boolean {
        return env.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Object
    }

    fun isLong(env: VirtualFrame): Boolean {
        return env.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Long
    }

    fun isFloat(env: VirtualFrame): Boolean {
        return env.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Float
    }

    fun isDouble(env: VirtualFrame): Boolean {
        return env.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Double
    }

    override fun toString(): String {
        return "(ldloc $index)"
    }
}