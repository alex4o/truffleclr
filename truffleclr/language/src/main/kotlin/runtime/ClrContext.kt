package runtime

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.Scope
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.`object`.Layout
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import runtime.util.Keys

@ExportLibrary(InteropLibrary::class)
class ClrContext(): TruffleObject {
    lateinit var env: TruffleLanguage.Env
    val types: MutableMap<String, Type> = mutableMapOf()
    val scopes = mutableListOf(Scope.newBuilder("global", this).build())

    val layout = Layout.createLayout()
    val baseObject = layout.createShape(ClrObject("System.Object"))


    @ExportMessage
    fun hasMembers(): Boolean {
        return types.isNotEmpty()
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