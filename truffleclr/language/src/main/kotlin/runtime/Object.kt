package runtime

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
import com.oracle.truffle.api.`object`.DynamicObject
import com.oracle.truffle.api.`object`.DynamicObjectLibrary
import com.oracle.truffle.api.`object`.Shape
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.UnknownIdentifierException
import com.oracle.truffle.api.library.CachedLibrary
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import runtime.util.Keys

/** CLR type metadata, shared by all shapes of the same guest type. */
class ClrObject(val name: String) {
    lateinit var virtualTable: Array<Method>
    lateinit var allocationShape: Shape
    val fieldDefaults: MutableMap<String, Any> = linkedMapOf()

    override fun toString(): String = name
}

/** Guest instances export interop directly rather than through ObjectType dispatch. */
@ExportLibrary(InteropLibrary::class)
class ClrDynamicObject(shape: Shape) : DynamicObject(shape) {
    @ExportMessage
    fun hasMembers(): Boolean = true

    @ExportMessage
    @Throws(UnknownIdentifierException::class)
    fun readMember(member: String,
                   @CachedLibrary("this") objects: DynamicObjectLibrary): Any {
        if (!objects.containsKey(this, member)) {
            throw UnknownIdentifierException.create(member)
        }
        return objects.getOrDefault(this, member, null)
    }

    @ExportMessage
    fun writeMember(member: String, value: Any,
                    @CachedLibrary("this") objects: DynamicObjectLibrary) {
        objects.put(this, member, value)
    }

    @ExportMessage
    @Throws(UnknownIdentifierException::class)
    fun removeMember(member: String,
                     @CachedLibrary("this") objects: DynamicObjectLibrary) {
        if (!objects.removeKey(this, member)) {
            throw UnknownIdentifierException.create(member)
        }
    }

    @ExportMessage
    fun isMemberReadable(member: String,
                         @CachedLibrary("this") objects: DynamicObjectLibrary): Boolean =
        objects.containsKey(this, member)

    @ExportMessage
    fun isMemberModifiable(member: String,
                           @CachedLibrary("this") objects: DynamicObjectLibrary): Boolean =
        objects.containsKey(this, member)

    @ExportMessage
    fun isMemberInsertable(member: String,
                           @CachedLibrary("this") objects: DynamicObjectLibrary): Boolean =
        !objects.containsKey(this, member)

    @ExportMessage
    fun isMemberRemovable(member: String): Boolean = false

    @ExportMessage
    @TruffleBoundary
    fun getMembers(includeInternal: Boolean): Keys =
        Keys(DynamicObjectLibrary.getUncached().getKeyArray(this))
}
