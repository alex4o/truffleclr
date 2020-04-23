package runtime

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.RootCallTarget
import com.oracle.truffle.api.dsl.Cached
import com.oracle.truffle.api.dsl.Fallback
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import com.oracle.truffle.api.nodes.DirectCallNode
import com.oracle.truffle.api.nodes.IndirectCallNode
import metadata.IlMethod


/**
 * Used to allow methods to be called using the Polyglot API.
 */
@ExportLibrary(InteropLibrary::class)
class Method(val metadata: IlMethod, @CompilerDirectives.CompilationFinal var callNode: DirectCallNode?) :
    TruffleObject {

    val memberType = MemberType.Method

    val name
        get() = metadata.name

    @ExportMessage
    fun isExecutable(): Boolean {
        return true
    }

    fun isInstance(obj: TruffleObject?): Boolean {
        return obj is Method
    }

    @ExportMessage
    abstract class Execute {
        companion object {
            @Specialization(
                limit = "1",
                guards = [
                    "method == cachedMethod"
                ]
            )
            @JvmStatic
            fun call(
                method: Method, arguments: Array<Any?>,
                @Cached("method") cachedMethod: Method,
                @Cached(
                    "method.getCallNode()",
                    uncached = "method.getCallNode()"
                ) callNode: DirectCallNode
            ): Any {
                return callNode.call(*arguments)
            }

            @Fallback
            @JvmStatic
            fun callSlower(
                method: Method, arguments: Array<Any?>
            ): Any {
                return method.callNode!!.callTarget.call(*arguments)
            }

        }
    }

    override fun toString(): String {
        return metadata.toString()
    }
}
