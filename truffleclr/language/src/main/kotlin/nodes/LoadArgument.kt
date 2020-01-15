package nodes

import com.oracle.truffle.api.CompilerDirectives.CompilationFinal
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "ldarg")
class LoadArgument(@CompilationFinal val index: Int, @Child var reader: ReadLocal) : ExpressionNode() {

    override fun execute(env: VirtualFrame): Any? {
        return reader.execute(env)
    }

    override fun executeInt(env: VirtualFrame): Int {
        return reader.readInt(env)
    }

    override fun executeBool(env: VirtualFrame): Boolean {
        return reader.readBoolean(env)
    }

    override fun toString(): String {
        return "(ldarg $index)"
    }

}