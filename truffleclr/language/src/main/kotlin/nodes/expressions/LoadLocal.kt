package nodes.expressions

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

/**
 * Read a local from the VirtualFrame slot.
 */
@NodeInfo(shortName = "ldloc")
class LoadLocal(val slot: FrameSlot?) : ExpressionNode() {

    /**
     * The use of a final lambda in Truffle allows the whole thing to be inlined
     * and the code inside takes part in the partial evaluation, this allows specialization
     * without the use of the `@Specialization` annotation, when the methods are known at runtime.
     */
    @CompilerDirectives.CompilationFinal
    val get = when (slot?.kind) {
        FrameSlotKind.Int -> {
            this::executeInt
        }
        FrameSlotKind.Long -> {
            this::executeFloat
        }
        FrameSlotKind.Boolean -> {
            this::executeBool
        }
        FrameSlotKind.Byte -> {
            this::executeByte
        }
        FrameSlotKind.Double -> {
            this::executeDouble
        }
        FrameSlotKind.Float -> {
            this::executeFloat
        }
        FrameSlotKind.Object -> {
            this::executeObject
        }
        else -> {
            error("Can not determine frame slot kind")
        }
    }


    override fun execute(env: VirtualFrame): Any? {
        return get(env)
    }

    override fun executeInt(env: VirtualFrame): Int {
        return env.getInt(slot)
    }

    override fun executeBool(env: VirtualFrame): Boolean {
        return env.getBoolean(slot)
    }

    override fun executeFloat(env: VirtualFrame): Float {
        return env.getFloat(slot)
    }

    override fun executeDouble(env: VirtualFrame): Double {
        return env.getDouble(slot)
    }

    fun executeByte(env: VirtualFrame): Byte {
        return env.getByte(slot)
    }

    fun executeObject(env: VirtualFrame): Any? {
        return env.getObject(slot)
    }


    override fun toString(): String {
        return "(ldloc ${slot?.identifier} ${slot?.kind})"
    }
}