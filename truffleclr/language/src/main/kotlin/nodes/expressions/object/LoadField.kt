package nodes.expressions.`object`

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.dsl.Cached
import com.oracle.truffle.api.dsl.NodeChild
import com.oracle.truffle.api.dsl.NodeChildren
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.UnknownIdentifierException
import com.oracle.truffle.api.interop.UnsupportedMessageException
import com.oracle.truffle.api.interop.UnsupportedTypeException
import com.oracle.truffle.api.library.CachedLibrary
import nodes.ExpressionNode

@NodeChildren(
    NodeChild("receiver")
)
abstract class LoadField(@CompilerDirectives.CompilationFinal val fieldName: String) : ExpressionNode() {

    // TODO: Add type checking

    @Specialization(limit = "5")
    fun load(receiver: Any, @CachedLibrary("receiver") objectLibrary: InteropLibrary): Any? {
        return objectLibrary.readMember(receiver, fieldName)
    }

    override fun toString(): String {
        return "(ldfld $fieldName)"
    }
}