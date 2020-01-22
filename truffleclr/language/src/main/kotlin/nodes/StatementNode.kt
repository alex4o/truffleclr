package nodes

import com.oracle.truffle.api.dsl.TypeSystemReference
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo
import types.TypeSystem

@NodeInfo(shortName = "statement")
@TypeSystemReference(TypeSystem::class)
abstract class StatementNode: Node() {
    abstract fun executeVoid(env: VirtualFrame)

}