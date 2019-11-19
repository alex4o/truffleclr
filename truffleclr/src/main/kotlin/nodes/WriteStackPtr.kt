package nodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.dsl.NodeChild
import com.oracle.truffle.api.dsl.NodeField
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.FrameUtil
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node

@NodeField(name = "WriteStack", type = FrameSlot::class)
abstract class WriteStackPtr() : Node() {

    @CompilerDirectives.CompilationFinal
    protected var slot: FrameSlot? = null

    public abstract fun execute(frame: VirtualFrame, value: Long): Long

    @Specialization(guards = ["isLongOrIllegal(frame)"])
    protected fun writeLong(frame: VirtualFrame, value: Long): Long {
        frame.frameDescriptor.setFrameSlotKind(slot, FrameSlotKind.Long);
        frame.setLong(slot, value);
        return value;
    }
    
    protected fun isLongOrIllegal(frame: VirtualFrame): Boolean {
        val kind = frame.frameDescriptor.getFrameSlotKind(slot)

        return kind == FrameSlotKind.Long || kind == FrameSlotKind.Illegal
    }
}