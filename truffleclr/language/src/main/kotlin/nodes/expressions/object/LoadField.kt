package nodes.expressions.`object`

import com.oracle.truffle.`object`.DynamicObjectImpl
import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.TruffleRuntime
import com.oracle.truffle.api.`object`.DynamicObject
import com.oracle.truffle.api.`object`.Location
import com.oracle.truffle.api.`object`.Property
import com.oracle.truffle.api.dsl.Cached
import com.oracle.truffle.api.dsl.NodeChild
import com.oracle.truffle.api.dsl.NodeChildren
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.UnknownIdentifierException
import com.oracle.truffle.api.interop.UnsupportedMessageException
import com.oracle.truffle.api.interop.UnsupportedTypeException
import com.oracle.truffle.api.library.CachedLibrary
import nodes.ExpressionNode
import types.CTSNull

/**
 * Load a value from a property.
 */
@NodeChildren(
    NodeChild("receiver")
)
abstract class LoadField(@CompilerDirectives.CompilationFinal val property: Property) : ExpressionNode() {
    @CompilerDirectives.CompilationFinal
    val location = property.location

    // TODO: Add type checking

    @Specialization
    fun load(receiver: DynamicObject): Any? {
        return location.get(receiver)
    }

    val label = "(ldfld  ${property.key} ... )"

    override fun toString(): String {
        return "(ldfld ${property.key} ${children.joinToString(" ")})"
    }
}