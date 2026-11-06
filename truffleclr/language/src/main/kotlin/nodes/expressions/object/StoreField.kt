package nodes.expressions.`object`

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.`object`.DynamicObject
import com.oracle.truffle.api.`object`.DynamicObjectLibrary
import com.oracle.truffle.api.`object`.Property
import com.oracle.truffle.api.dsl.NodeChild
import com.oracle.truffle.api.dsl.NodeChildren
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.library.CachedLibrary
import nodes.ExpressionNode
import nodes.StatementNode

/** Store a field by key, allowing the object library to generalize its storage. */
@NodeChildren(
    NodeChild("receiver", type = ExpressionNode::class),
    NodeChild("value", type = ExpressionNode::class)
)
abstract class StoreField(@CompilerDirectives.CompilationFinal val property: Property) : StatementNode() {
    @Specialization(limit = "5")
    fun write(receiver: DynamicObject, value: Any,
              @CachedLibrary("receiver") objects: DynamicObjectLibrary) {
        objects.put(receiver, property.key, value)
    }

    val label = "(stfld  ${property.key} ... )"

    override fun toString(): String {
        val (receiver, valueNode) = this.children.toList()
        return "(stfld ${property.key} $receiver $valueNode)"
    }
}
