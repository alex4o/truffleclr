package runtime

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import runtime.util.Keys
import sun.reflect.generics.tree.BaseType
import types.CTSNull
import util.iterate
import util.mutableLazy

@ExportLibrary(InteropLibrary::class)
class Type(val name: String, val baseType: Type?): TruffleObject {
    // TODO: a single field will be a single type you wont be able to have two fields with the same names and different types
    @JvmField
    val members: MutableMap<String, TruffleObject> = mutableMapOf()

    val info: TypeInfo by lazy {
        if (CoreTypeInfo.typeByName.contains(name)) {
            // Dealing with a core type, use type table
            CoreTypeInfo.typeByName.getValue(name)
        } else {
            // This goes down the type tree to find the base TypeInfo
            baseType!!.info
        }
    }

    @ExportMessage
    fun hasMembers(): Boolean {
        return members.isNotEmpty()
    }

    @ExportMessage
    @CompilerDirectives.TruffleBoundary
    fun readMember(member: String): TruffleObject {
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