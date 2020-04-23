package nodes.expressions

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal
import com.oracle.truffle.api.dsl.NodeField
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

//TODO: Spliting the arguments and locals is a bad design decsion
@NodeInfo(shortName = "ldarg")
class LoadArgument(@CompilationFinal val index: Int, @CompilationFinal val slot: FrameSlot?) : ExpressionNode() {

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
        return "(ldarg $index)"
    }

    val label = this.toString()
}