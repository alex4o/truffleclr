package nodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.dsl.NodeField
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.FrameUtil
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node

@NodeField(name = "slot", type = FrameSlot::class)
abstract class ReadLocal() : Node() {

    protected abstract val slot: FrameSlot?

    public abstract fun execute(frame: VirtualFrame): Any

    @Specialization(guards = ["isLong(frame)"])
    protected fun readLong(frame: VirtualFrame): Long {
        return frame.getLong(slot)
    }

    @Specialization(guards = ["isInt(frame)"])
    protected fun readInt(frame: VirtualFrame): Int {
        return frame.getInt(slot)
    }

    @Specialization(guards = ["isBoolean(frame)"])
    protected fun readBoolean(frame: VirtualFrame): Boolean {
        return frame.getBoolean(slot)
    }

    protected fun isLong(frame: VirtualFrame): Boolean {
        return frame.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Long
    }

    protected fun isInt(frame: VirtualFrame): Boolean {
        return frame.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Int
    }

    protected fun isBoolean(frame: VirtualFrame): Boolean {
        return frame.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Boolean
    }
}