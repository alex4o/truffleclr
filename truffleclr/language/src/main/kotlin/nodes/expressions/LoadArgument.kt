package nodes.expressions

import com.oracle.truffle.api.CompilerDirectives.CompilationFinal
import com.oracle.truffle.api.dsl.NodeField
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode

@NodeInfo(shortName = "ldarg")
@NodeField(name = "slot", type = FrameSlot::class)
abstract class LoadArgument(@CompilationFinal val index: Int) : ExpressionNode() {
    abstract val slot: FrameSlot?

    abstract override fun execute(env: VirtualFrame): Any?

    @Specialization(guards = ["isInt(env)"])
    override fun executeInt(env: VirtualFrame): Int {
        return env.getInt(slot)
    }
    @Specialization(guards = ["isBoolean(env)"])
    override fun executeBool(env: VirtualFrame): Boolean {
        return env.getBoolean(slot)
    }

    fun isInt(env: VirtualFrame): Boolean {
        return env.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Int
    }

    fun isBoolean(env: VirtualFrame): Boolean {
        return env.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Boolean
    }

    override fun toString(): String {
        return "(ldarg $index)"
    }

    val label = this.toString()
}