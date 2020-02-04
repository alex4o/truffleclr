package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo
import types.TypeSystemGen

@NodeInfo(shortName = "expression")
abstract class ExpressionNode: StatementNode() {
    abstract fun execute(env: VirtualFrame): Any?

    override fun executeVoid(env: VirtualFrame) {
        TypeSystemGen.expectCTSNull(execute(env))
    }

    open fun executeBool(env: VirtualFrame): Boolean {
        return TypeSystemGen.expectBoolean(execute(env))
    }

    open fun executeInt(env: VirtualFrame): Int {
        return TypeSystemGen.expectInteger(execute(env))
    }

    open fun executeLong(env: VirtualFrame): Long {
        return TypeSystemGen.expectLong(execute(env))
    }

    open fun executeFloat(env: VirtualFrame): Float {
        return TypeSystemGen.expectFloat(execute(env))
    }

    open fun executeDouble(env: VirtualFrame): Double {
        return TypeSystemGen.expectDouble(execute(env))
    }

    open fun executeString(env: VirtualFrame): String {
        return TypeSystemGen.expectString(execute(env))
    }
}

abstract class ExpressionNodeGeneric<T>: ExpressionNode() {
    abstract override fun execute(env: VirtualFrame): T
}