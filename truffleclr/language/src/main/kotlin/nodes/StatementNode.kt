package nodes

import com.oracle.truffle.api.TruffleLogger
import com.oracle.truffle.api.dsl.TypeSystemReference
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo
import types.TypeSystem

/**
 * Root node that all other nodes should inherit from.
 */
@NodeInfo(shortName = "statement")
@TypeSystemReference(TypeSystem::class)
abstract class StatementNode: Node() {

    val logger = TruffleLogger.getLogger("clr")

    abstract fun executeVoid(env: VirtualFrame)

}