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

/** Load a field by key, independent of the receiver's current storage layout. */
@NodeChildren(NodeChild("receiver"))
abstract class LoadField(@CompilerDirectives.CompilationFinal val property: Property) : ExpressionNode() {
    @Specialization(limit = "5")
    fun load(receiver: DynamicObject,
             @CachedLibrary("receiver") objects: DynamicObjectLibrary): Any? =
        objects.getOrDefault(receiver, property.key, null)

    val label = "(ldfld  ${property.key} ... )"

    override fun toString(): String = "(ldfld ${property.key} ${children.joinToString(" ")})"
}
