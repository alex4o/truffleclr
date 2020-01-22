package nodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.NodeInfo
import com.oracle.truffle.api.nodes.RootNode
import nodes.expressions.LoadArgument
import nodes.statements.StoreArgument
import nodes.statements.StoreArgumentNodeGen
import nodes.statements.StoreLocal
import nodes.statements.StoreLocalNodeGen

@NodeInfo(shortName = "method")
class MethodBody(private val id: String, @Child var startBlock: ExpressionNode, @CompilerDirectives.CompilationFinal(dimensions = 1) val arguments: Array<FrameSlot>, frameDescriptor: FrameDescriptor, language: TruffleLanguage<*>): RootNode(language, frameDescriptor) {

    @Children val argumentWriters: Array<StoreArgument> = arguments.mapIndexed { index, it -> StoreArgumentNodeGen.create(index, it) }.toTypedArray()

    @ExplodeLoop
    override fun execute(frame: VirtualFrame): Any? {
        for(writer in argumentWriters) {
            writer.execute(frame)
        }
        return startBlock.execute(frame)
    }

    override fun getName() = id

    override fun toString(): String {
        return name
    }
}
