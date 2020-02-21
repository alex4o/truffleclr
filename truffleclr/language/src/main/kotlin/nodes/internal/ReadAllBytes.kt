package nodes.internal

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode
import java.nio.file.Files
import java.nio.file.Paths

@NodeInfo(description = "ToChar")
class ReadAllBytes() :
    ExpressionNode() {

    override fun execute(env: VirtualFrame): Any? {
        return Files.readAllBytes(Paths.get(env.arguments[0] as String))
    }
}
