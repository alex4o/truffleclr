package nodes.expressions.`object`

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.`object`.DynamicObject
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

//@NodeChildren(
//    NodeChild("receiver")
//)
//abstract
class LoadField(@CompilerDirectives.CompilationFinal val fieldName: String, @Child var receiverNode: ExpressionNode) : ExpressionNode() {
    @Child var interopLib = InteropLibrary.getFactory().createDispatched(5)

    // TODO: Add type checking

    override fun execute(env: VirtualFrame): Any? {
//    @Specialization
//    fun load(
//        receiver: Any
//             ,@CachedLibrary("receiver") interopLib: InteropLibrary
        val r = receiverNode.execute(env)
        if(r is DynamicObject) {
//            println("ldfld: ${r.shape.keyList}")
        }
        return interopLib.readMember(r, fieldName)
    }

    override fun toString(): String {
        return "(ldfld $fieldName ${children.joinToString(" ")})"
    }
}