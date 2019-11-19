package nodes

import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.RootNode

class Block(@Children val nodes: Array<Node>, frameDescriptor: FrameDescriptor): RootNode(null, frameDescriptor) {

    @ExplodeLoop
    override fun execute(frame: VirtualFrame?): Any {


        return 0;
    }

}