package runtime

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.interop.UnknownIdentifierException
import com.oracle.truffle.api.interop.UnsupportedTypeException
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import runtime.util.Keys

/** StaticShape subclasses preserve CLR identity. Struct instances are unboxed owned
 * storage; boxing must use a separate wrapper rather than alias this value.
 */
@ExportLibrary(InteropLibrary::class)
open class ClrObject(val type: Type) : TruffleObject {
    @ExportMessage fun hasMembers(): Boolean = true

    @ExportMessage
    @TruffleBoundary
    @Throws(UnknownIdentifierException::class)
    fun readMember(member: String): Any {
        val field = type.instanceFields[member] ?: throw UnknownIdentifierException.create(member)
        return when (field.storageType) {
            Boolean::class.javaPrimitiveType -> field.getBoolean(this)
            Char::class.javaPrimitiveType -> field.getChar(this).toString()
            else -> field.read(this)
        }
    }

    @ExportMessage
    @TruffleBoundary
    @Throws(UnknownIdentifierException::class, UnsupportedTypeException::class)
    fun writeMember(member: String, value: Any) {
        val field = type.instanceFields[member] ?: throw UnknownIdentifierException.create(member)
        try {
            field.write(this, if (field.storageType == Char::class.javaPrimitiveType && value is String && value.length == 1) value[0] else value)
        } catch (e: ClassCastException) {
            throw UnsupportedTypeException.create(arrayOf(value), "Invalid value for $member")
        }
    }

    @ExportMessage @TruffleBoundary
    fun isMemberReadable(member: String): Boolean = type.instanceFields.containsKey(member)
    @ExportMessage @TruffleBoundary
    fun isMemberModifiable(member: String): Boolean = type.instanceFields.containsKey(member)
    @ExportMessage fun isMemberInsertable(member: String): Boolean = false
    @ExportMessage @TruffleBoundary
    fun getMembers(includeInternal: Boolean): Keys = Keys(type.instanceFields.keys.toTypedArray())
}

interface ClrObjectFactory {
    fun create(type: Type): ClrObject
}
