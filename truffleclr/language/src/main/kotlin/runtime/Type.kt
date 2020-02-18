package runtime

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import runtime.util.Keys
import types.CTSNull

@ExportLibrary(InteropLibrary::class)
class Type: TruffleObject {
    // TODO: Change to methods, fields, etc...
    @JvmField
    val members: MutableMap<String, Method> = mutableMapOf()
    var name: String = ""

    lateinit var info: TypeInfo
    lateinit var baseType: Type

    @ExportMessage
    fun hasMembers(): Boolean {
        return members.isNotEmpty()
    }

    @ExportMessage
    @CompilerDirectives.TruffleBoundary
    fun readMember(member: String): Method {
        return members.getValue(member)
    }

    @ExportMessage
    @CompilerDirectives.TruffleBoundary
    fun isMemberReadable(member: String): Boolean {
        return members.containsKey(member)
    }

    @ExportMessage
    @CompilerDirectives.TruffleBoundary
    fun getMembers(includeInternal: Boolean): Any? {
        return Keys(members.keys.toTypedArray())
    }

    @ExportMessage
    fun isInstantiable(): Boolean {
        return true
    }

    @ExportMessage
    @CompilerDirectives.TruffleBoundary
    fun instantiate(args: Array<Any>): TruffleObject  {
        println("trying to create ${name} with ${args.joinToString(",")}")
        return CTSNull
    }

    fun isInstance(obj: TruffleObject?): Boolean {
        return obj is Type
    }
}