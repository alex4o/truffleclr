package nodes.statements

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.dsl.NodeField
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node
import nodes.ExpressionNode
import types.TypeSystemGen

@NodeField(name = "slot", type = FrameSlot::class)
abstract class StoreArgument(val index: Int): ExpressionNode() {

    protected abstract val slot: FrameSlot?

    abstract override fun execute(env: VirtualFrame): Any

    @Specialization(guards = ["isLong(env)"])
    protected fun writeLong(env: VirtualFrame): Long {
//        env.frameDescriptor.setFrameSlotKind(slot, FrameSlotKind.Long);

        val value = env.arguments[index] as Long
        env.setLong(slot, value);
        return value;
    }

    @Specialization(guards = ["isBoolean(env)"])
    protected fun writeBoolean(env: VirtualFrame): Boolean {
//        env.frameDescriptor.setFrameSlotKind(slot, FrameSlotKind.Long);
        val value =  TypeSystemGen.expectBoolean(env.arguments[index])
        env.setBoolean(slot, value);
        return value;
    }

    @Specialization(guards = ["isInt(env)"])
    protected fun writeInt(env: VirtualFrame): Int {
//        env.frameDescriptor.setFrameSlotKind(slot, FrameSlotKind.Long);
        val value = TypeSystemGen.expectInteger(env.arguments[index])
        env.setInt(slot, value);
        return value;
    }

    @Specialization(guards = ["isObject(env)"])
    protected fun writeObject(env: VirtualFrame): Any {
//        env.frameDescriptor.setFrameSlotKind(slot, FrameSlotKind.Long);
        val value = env.arguments[index]
        env.setObject(slot, value);
        return value;
    }

    protected fun isLong(env: VirtualFrame): Boolean {
        val kind = env.frameDescriptor.getFrameSlotKind(slot)
        return kind == FrameSlotKind.Long
    }

    protected fun isInt(env: VirtualFrame): Boolean {
        val kind = env.frameDescriptor.getFrameSlotKind(slot)
        return kind == FrameSlotKind.Int
    }

    protected fun isBoolean(env: VirtualFrame): Boolean {
        val kind = env.frameDescriptor.getFrameSlotKind(slot)
        return kind == FrameSlotKind.Boolean
    }

    protected fun isObject(env: VirtualFrame): Boolean {
        val kind = env.frameDescriptor.getFrameSlotKind(slot)
        return kind == FrameSlotKind.Object
    }

    override fun toString(): String {
        return "(starg $index)"
    }
}