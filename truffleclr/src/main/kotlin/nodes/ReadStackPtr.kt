package nodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.dsl.NodeField
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.FrameUtil
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node

@NodeField(name = "ReadStack", type = FrameSlot::class)
abstract class ReadStackPtr() : Node() {

    @CompilerDirectives.CompilationFinal
    protected var slot: FrameSlot? = null

    public abstract fun execute(frame: VirtualFrame): Long

    @Specialization(guards = ["isLong(frame)"])
    protected fun readLong(frame: VirtualFrame): Long {

        return FrameUtil.getLongSafe(frame, slot)
    }

    protected fun isLong(frame: VirtualFrame): Boolean {
        return frame.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Long
    }
}