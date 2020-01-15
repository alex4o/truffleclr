package nodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.NodeInfo
import com.oracle.truffle.api.nodes.RootNode

@NodeInfo(shortName = "method")
class Method(private val id: String, @Child var startBlock: DispatchNode, @CompilerDirectives.CompilationFinal(dimensions = 1) val arguments: Array<FrameSlot>, frameDescriptor: FrameDescriptor, language: TruffleLanguage<*>): RootNode(language, frameDescriptor) {

    @Children val argumentWriters: Array<WriteLocal> = arguments.map { WriteLocalNodeGen.create(it) }.toTypedArray()

    @ExplodeLoop
    override fun execute(frame: VirtualFrame): Any? {
        for((index, writer) in argumentWriters.withIndex()) {
            writer.execute(frame, frame.arguments[index])
        }
        return startBlock.execute(frame)
    }

    override fun getName() = id

    override fun toString(): String {
        return name
    }
}
