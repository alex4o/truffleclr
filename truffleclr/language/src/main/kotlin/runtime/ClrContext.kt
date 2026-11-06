package runtime

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import runtime.util.Keys
import main.Clr

@ExportLibrary(InteropLibrary::class)
class ClrContext(): TruffleObject {
    private val domains = mutableListOf<metadata.IlAppDomain>()

    fun own(domain: metadata.IlAppDomain) { domains.add(domain) }

    fun close() {
        var failure: Throwable? = null
        for (domain in domains.asReversed()) {
            try {
                domain.close()
            } catch (error: Throwable) {
                if (failure == null) failure = error else failure.addSuppressed(error)
            }
        }
        domains.clear()
        failure?.let { throw it }
    }

    lateinit var env: TruffleLanguage.Env
    val output by lazy { java.io.PrintStream(env.out()) }
    val types: MutableMap<String, Type> = mutableMapOf()
    // Only array kinds whose signedness is erased by JVM storage need an override.
    val arrayTypeNames = java.util.WeakHashMap<Any, String>()

    @CompilerDirectives.TruffleBoundary
    fun recordArrayType(array: Any, name: String) { arrayTypeNames[array] = name }



    @ExportMessage
    fun isScope(): Boolean = true

    @ExportMessage
    fun hasLanguage(): Boolean = true

    @ExportMessage
    fun getLanguage(): Class<out TruffleLanguage<*>> = Clr::class.java

    @ExportMessage
    fun toDisplayString(allowSideEffects: Boolean): String = "global"

    @ExportMessage
    fun hasMembers(): Boolean = true

    @ExportMessage
    @CompilerDirectives.TruffleBoundary
    fun readMember(member: String): Type {
        return types.getValue(member)
    }

    @ExportMessage
    @CompilerDirectives.TruffleBoundary
    fun isMemberReadable(member: String): Boolean {
        return types.containsKey(member)
    }

    @ExportMessage
    @CompilerDirectives.TruffleBoundary
    fun getMembers(includeInternal: Boolean): Any? {
        return Keys(types.keys.toTypedArray())
    }

    fun isInstance(obj: TruffleObject?): Boolean {
        return obj is ClrContext
    }
}