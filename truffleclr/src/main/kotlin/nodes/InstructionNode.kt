package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(language = "truffleclr", description = "", shortName = "")
abstract class InstructionNode: Node() {
    abstract fun execute(env: VirtualFrame, stack: Array<Long>, locals: Array<Long>): Any?
}