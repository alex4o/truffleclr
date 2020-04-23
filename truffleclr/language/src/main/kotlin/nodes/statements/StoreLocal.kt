package nodes.statements

import com.oracle.truffle.api.dsl.NodeChild
import com.oracle.truffle.api.dsl.NodeField
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node
import nodes.ExpressionNode

/**
 * Stores a value inside of a frame slot.
 * Contains the specializations fro each type.
 */
@NodeField(name = "slot", type = FrameSlot::class)
@NodeChild("expressionNode")
abstract class StoreLocal: ExpressionNode() {

    protected abstract val slot: FrameSlot?

    abstract override fun execute(env: VirtualFrame): Any

    @Specialization(guards = ["isLong(env)"])
    protected fun writeLong(env: VirtualFrame, value: Long): Long {
        env.setLong(slot, value);
        return value;
    }

    @Specialization(guards = ["isBoolean(env)"])
    protected fun writeBoolean(env: VirtualFrame, value: Boolean): Boolean {
        env.setBoolean(slot, value);
        return value;
    }

    @Specialization(guards = ["isBoolean(env)"])
    protected fun writeBoolean(env: VirtualFrame, value: Int): Boolean {
        env.setBoolean(slot, value != 0);
        return value != 0;
    }

    @Specialization(guards = ["isFloat(env)"])
    protected fun writeFloat(env: VirtualFrame, value: Float): Any? {
        env.setFloat(slot, value);
        return value;
    }


    @Specialization(guards = ["isDouble(env)"])
    protected fun writeDouble(env: VirtualFrame, value: Double): Any? {
        env.setDouble(slot, value);
        return value;
    }

    @Specialization(guards = ["isInt(env)"])
    protected fun writeInt(env: VirtualFrame, value: Int): Int {
        env.setInt(slot, value);
        return value;
    }

    @Specialization(guards = ["isObject(env)"])
    protected fun writeObject(env: VirtualFrame, value: Any): Any? {
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

    protected fun isFloat(env: VirtualFrame): Boolean {
        val kind = env.frameDescriptor.getFrameSlotKind(slot)
        return kind == FrameSlotKind.Float
    }

    protected fun isDouble(env: VirtualFrame): Boolean {
        val kind = env.frameDescriptor.getFrameSlotKind(slot)
        return kind == FrameSlotKind.Double
    }

    protected fun isObject(env: VirtualFrame): Boolean {
        val kind = env.frameDescriptor.getFrameSlotKind(slot)
        return kind == FrameSlotKind.Object
    }

    override fun toString(): String {
        return "(stloc ${slot!!.kind} ${slot!!.identifier} ${this.children.joinToString(" ")})"
    }

}