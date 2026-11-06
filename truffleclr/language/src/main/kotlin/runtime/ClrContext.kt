package runtime

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.`object`.Shape
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import runtime.util.Keys
import main.Clr

@ExportLibrary(InteropLibrary::class)
class ClrContext(): TruffleObject {
    lateinit var env: TruffleLanguage.Env
    val output by lazy { java.io.PrintStream(env.out()) }
    val types: MutableMap<String, Type> = mutableMapOf()

    val baseObject: Shape = Shape.newBuilder()
        .layout(ClrDynamicObject::class.java, java.lang.invoke.MethodHandles.lookup())
        .dynamicType(ClrObject("System.Object"))
        .build()


    @ExportMessage
    fun isScope(): Boolean {
        return true
    }

    @ExportMessage
    fun hasLanguage(): Boolean {
        return true
    }

    @ExportMessage
    fun getLanguage(): Class<out TruffleLanguage<*>> {
        return Clr::class.java
    }

    @ExportMessage
    fun toDisplayString(allowSideEffects: Boolean): String {
        return "global"
    }

    @ExportMessage
    fun hasMembers(): Boolean {
        return true
    }

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