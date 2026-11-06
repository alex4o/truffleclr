package runtime

import com.oracle.truffle.api.CallTarget
import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.dsl.Cached
import com.oracle.truffle.api.dsl.Fallback
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import com.oracle.truffle.api.nodes.DirectCallNode
import metadata.IlMethod

/** Metadata owns a lazy target; every caller owns its own call node. */
@ExportLibrary(InteropLibrary::class)
class Method(val metadata: IlMethod, private var compiler: (() -> CallTarget)? = null) : TruffleObject {
    val dispatchKey: String = metadata.key()
    var virtualSlot: Int = -1
    @Volatile private var target: CallTarget? = null
    val callTarget: CallTarget
        get() = target ?: compile()

    @Synchronized
    @CompilerDirectives.TruffleBoundary
    private fun compile(): CallTarget {
        target?.let { return it }
        val compiled = checkNotNull(compiler) { "No compiler for $metadata" }()
        target = compiled
        compiler = null
        return compiled
    }

    @Synchronized
    fun setCompiler(compile: () -> CallTarget) { if (target == null && compiler == null) compiler = compile }
    val memberType = MemberType.Method
    val name get() = metadata.name
    @ExportMessage fun isExecutable() = true

    @ExportMessage abstract class Execute {
        companion object {
            @Specialization(limit = "1", guards = ["method == cachedMethod"], excludeForUncached = true)
            @JvmStatic fun call(method: Method, arguments: Array<Any?>,
                @Cached("method") cachedMethod: Method,
                @Cached("create(method.getCallTarget())") callNode: DirectCallNode): Any? = callNode.call(*arguments)

            @Fallback @JvmStatic fun callSlower(method: Method, arguments: Array<Any?>): Any? =
                method.callTarget.call(*arguments)
        }
    }
    override fun toString() = metadata.toString()
}
