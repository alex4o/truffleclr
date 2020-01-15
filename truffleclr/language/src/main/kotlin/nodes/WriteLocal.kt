package nodes

import com.oracle.truffle.api.dsl.NodeField
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node

@NodeField(name = "slot", type = FrameSlot::class)
abstract class WriteLocal() : Node() {

    protected abstract val slot: FrameSlot?

    public abstract fun execute(frame: VirtualFrame, value: Any): Any

    @Specialization(guards = ["isLong(frame)"])
    protected fun writeLong(frame: VirtualFrame, value: Long): Long {
//        frame.frameDescriptor.setFrameSlotKind(slot, FrameSlotKind.Long);
        frame.setLong(slot, value);
        return value;
    }

    @Specialization(guards = ["isBoolean(frame)"])
    protected fun writeBoolean(frame: VirtualFrame, value: Boolean): Boolean {
//        frame.frameDescriptor.setFrameSlotKind(slot, FrameSlotKind.Long);
        frame.setBoolean(slot, value);
        return value;
    }

    @Specialization(guards = ["isInt(frame)"])
    protected fun writeInt(frame: VirtualFrame, value: Int): Int {
//        frame.frameDescriptor.setFrameSlotKind(slot, FrameSlotKind.Long);
        frame.setInt(slot, value);
        return value;
    }

    protected fun isLong(frame: VirtualFrame): Boolean {
        val kind = frame.frameDescriptor.getFrameSlotKind(slot)
        return kind == FrameSlotKind.Long
    }

    protected fun isInt(frame: VirtualFrame): Boolean {
        val kind = frame.frameDescriptor.getFrameSlotKind(slot)
        return kind == FrameSlotKind.Int
    }

    protected fun isBoolean(frame: VirtualFrame): Boolean {
        val kind = frame.frameDescriptor.getFrameSlotKind(slot)
        return kind == FrameSlotKind.Boolean
    }
}