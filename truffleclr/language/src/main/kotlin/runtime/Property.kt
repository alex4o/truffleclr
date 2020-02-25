package runtime

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.RootCallTarget
import com.oracle.truffle.api.dsl.Cached
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import com.oracle.truffle.api.nodes.DirectCallNode
import com.oracle.truffle.api.nodes.IndirectCallNode

@ExportLibrary(InteropLibrary::class)
class Property(val name: String, @CompilerDirectives.CompilationFinal var callTarget: RootCallTarget?): TruffleObject {

    val memberType = MemberType.Property


    @ExportMessage
    fun isExecutable(): Boolean {
        return true
    }

    fun isInstance(obj: TruffleObject?): Boolean {
        return obj is Property
    }

    @ExportMessage
    abstract class Execute {
        companion object {
            @Specialization(
                limit = "1",
                guards = ["method.getCallTarget() == cachedTarget"]
            )
            @JvmStatic
            fun doDirect(
                method: Property, arguments: Array<Any?>,
                @Cached("method.getCallTarget()") cachedTarget: RootCallTarget?,
//                @Cached callNode: IndirectCallNode
                @Cached("create(cachedTarget)") callNode: DirectCallNode
            ): Any { /* Inline cache hit, we are safe to execute the cached call target. */
//                return callNode.call(method.callTarget, *arguments)
                return callNode.call(*arguments)
            }

            /**
             * Slow-path code for a call, used when the polymorphic inline cache exceeded its maximum
             * size specified in `INLINE_CACHE_SIZE`. Such calls are not optimized any
             * further, e.g., no method inlining is performed.
             */
            @Specialization(replaces = ["doDirect"])
            @JvmStatic
            fun doIndirect(
                method: Property, arguments: Array<Any?>,
                @Cached callNode: IndirectCallNode
            ): Any {
                return callNode.call(method.callTarget, *arguments)
            }
        }
    }
}