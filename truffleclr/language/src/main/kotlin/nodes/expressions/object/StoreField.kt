package nodes.expressions.`object`

import com.oracle.truffle.`object`.DynamicObjectImpl
import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.`object`.DynamicObject
import com.oracle.truffle.api.`object`.Property
import com.oracle.truffle.api.dsl.NodeChild
import com.oracle.truffle.api.dsl.NodeChildren
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.library.CachedLibrary
import nodes.ExpressionNode
import nodes.StatementNode

/**
 * Store a value inside of a property's location.
 */
@NodeChildren(
    NodeChild("receiver", type = ExpressionNode::class),
    NodeChild("value", type = ExpressionNode::class)
)
abstract class StoreField(@CompilerDirectives.CompilationFinal val property: Property) : StatementNode() {
    @CompilerDirectives.CompilationFinal
    val location = property.location

    // TODO: Add type checking

    @Specialization
    fun write(receiver: DynamicObject, value: Any) {
        location.set(receiver, value)
    }

    val label = "(stfld  ${property.key} ... )"

    override fun toString(): String {
        val (receiver, valueNode) = this.children.toList()
        return "(stfld ${property.key} $receiver $valueNode)"
    }
}