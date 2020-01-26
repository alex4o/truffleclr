package nodes.internal

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.RootNode
import nodes.ExpressionNode

class InternalMethod(@Child var block: ExpressionNode, frameDescriptor: FrameDescriptor, language: TruffleLanguage<*>): RootNode(language, frameDescriptor) {
    override fun execute(frame: VirtualFrame): Any? {
        return block.execute(frame)
    }
}