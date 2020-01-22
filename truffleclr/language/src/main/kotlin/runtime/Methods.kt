package runtime

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.CompilerDirectives.*
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.InvalidArrayIndexException
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import runtime.util.Keys

@ExportLibrary(InteropLibrary::class)
class Methods : TruffleObject {
    val functions: MutableMap<String, Method> = mutableMapOf<String, Method>()

    @ExportMessage
    fun hasMembers(): Boolean {
        return true
    }

    @ExportMessage
    @TruffleBoundary
    fun readMember(member: String?): Any? {
        return functions.get(member)
    }

    @ExportMessage
    @TruffleBoundary
    fun isMemberReadable(member: String?): Boolean {
        return functions.containsKey(member)
    }

    @ExportMessage
    @TruffleBoundary
    fun getMembers(includeInternal: Boolean): Any? {
        return Keys(functions.keys.toTypedArray())
    }

    fun isInstance(obj: TruffleObject?): Boolean {
        return obj is Methods
    }


}