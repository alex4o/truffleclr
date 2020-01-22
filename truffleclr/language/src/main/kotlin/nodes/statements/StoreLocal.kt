package nodes.statements

import com.oracle.truffle.api.dsl.NodeField
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node
import nodes.ExpressionNode

@NodeField(name = "slot", type = FrameSlot::class)
abstract class StoreLocal(@Child var expressionNode: ExpressionNode, val index: Int): ExpressionNode() {

    protected abstract val slot: FrameSlot?

    abstract override fun execute(env: VirtualFrame): Any

    @Specialization(guards = ["isLong(env)"])
    protected fun writeLong(env: VirtualFrame): Long {
//        frame.frameDescriptor.setFrameSlotKind(slot, FrameSlotKind.Long);
        val value = expressionNode.execute(env) as Long
        env.setLong(slot, value);
        return value;
    }

    @Specialization(guards = ["isBoolean(env)"])
    protected fun writeBoolean(env: VirtualFrame): Boolean {
//        frame.frameDescriptor.setFrameSlotKind(slot, FrameSlotKind.Long);
        val value = expressionNode.executeBool(env)
        env.setBoolean(slot, value);
        return value;
    }

    @Specialization(guards = ["isInt(env)"])
    protected fun writeInt(env: VirtualFrame): Int {
//        frame.frameDescriptor.setFrameSlotKind(slot, FrameSlotKind.Long);
        val value = expressionNode.executeInt(env)
        env.setInt(slot, value);
        return value;
    }

    @Specialization(guards = ["isObject(env)"])
    protected fun writeObject(env: VirtualFrame): Any? {
        val value = expressionNode.execute(env)
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
        return "\t\t(stloc $index $expressionNode)"
    }

}