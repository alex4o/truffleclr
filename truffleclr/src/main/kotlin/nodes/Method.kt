package nodes

import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.RootNode

class Method(@Child var startBlock: ExpressionNode, frameDescriptor: FrameDescriptor): RootNode(null, frameDescriptor) {
    override fun execute(frame: VirtualFrame): Any? {
        return startBlock.execute(frame)
    }

}
