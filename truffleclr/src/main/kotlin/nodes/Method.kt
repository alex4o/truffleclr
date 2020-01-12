package nodes

import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo
import com.oracle.truffle.api.nodes.RootNode
import main.Clr

@NodeInfo(shortName = "method")
class Method(@Child var startBlock: ExpressionNode, frameDescriptor: FrameDescriptor, language: TruffleLanguage<*>): RootNode(language, frameDescriptor) {
    override fun execute(frame: VirtualFrame): Any? {
        return startBlock.execute(frame)
    }
}
