package nodes.expressions.`object`

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.dsl.NodeChild
import com.oracle.truffle.api.dsl.NodeChildren
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.library.CachedLibrary
import nodes.ExpressionNode
import nodes.StatementNode

@NodeChildren(
    NodeChild("receiver", type = ExpressionNode::class),
    NodeChild("value", type = ExpressionNode::class)
)
abstract class StoreField(@CompilerDirectives.CompilationFinal val fieldName: String) : StatementNode() {

    // TODO: Add type checking

    @Specialization(limit = "5")
    fun write(receiver: Any, value: Any, @CachedLibrary("receiver") objectLibrary: InteropLibrary) {
        objectLibrary.writeMember(receiver, fieldName, value)
    }

    override fun toString(): String {
        val (receiver, valueNode) = this.children.toList()
        return "(stfld $receiver $fieldName $valueNode)"
    }
}