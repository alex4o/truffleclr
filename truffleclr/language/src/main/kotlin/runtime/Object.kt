package runtime

import com.oracle.truffle.api.CompilerAsserts
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
import com.oracle.truffle.api.`object`.DynamicObject
import com.oracle.truffle.api.`object`.Location
import com.oracle.truffle.api.`object`.ObjectType
import com.oracle.truffle.api.`object`.Shape
import com.oracle.truffle.api.dsl.Cached
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.UnknownIdentifierException
import com.oracle.truffle.api.library.CachedLibrary
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import runtime.util.Keys

@ExportLibrary(value = InteropLibrary::class, receiverType = DynamicObject::class)
class ClrObject(val name: String) : ObjectType() {

    lateinit var virtualTable: Array<Method>

    override fun dispatch(): Class<*>? {
        return ClrObject::class.java
    }

    @ExportMessage
    abstract class hasMembers {
        companion object {
            @Specialization
            @JvmStatic
            fun hasMembers(receiver: DynamicObject?): Boolean {
                return true
            }
        }
    }

    @ExportMessage
    abstract class removeMember {
        companion object {
            @Throws(UnknownIdentifierException::class)
            @Specialization
            @JvmStatic
            fun removeMember(receiver: DynamicObject, member: String?) {
                if (receiver.containsKey(member)) {
                    receiver.delete(member)
                } else {
                    throw UnknownIdentifierException.create(member)
                }
            }
        }
    }

    @ExportMessage
    abstract class isMemberInsertable {
        companion object {
            @Specialization
            @JvmStatic
            fun isMemberInsertable(
                receiver: DynamicObject?, member: String?,
                @CachedLibrary("receiver") receivers: InteropLibrary
            ): Boolean {
                return !receivers.isMemberExisting(receiver, member)
            }
        }
    }


    @ExportMessage()
    abstract class WriteMember {
        companion object {
            @Specialization(
                limit = "5",
                guards = [
                    "cachedKey.equals(key)",
                    "shapeCheck(shape, receiver)",
                    "location != null"
                ], assumptions = [
                "shape.getValidAssumption()"
            ])
            @JvmStatic
            fun doCached(receiver: DynamicObject, key: String, value: Any,
                         @Cached("key") cachedKey: String,
                         @Cached("receiver.getShape()") shape: Shape,
                         @Cached("lookupLocation(shape, key)") location: Location) {
//                println("set_field: $key ${receiver.shape.keyList} ${if(value is DynamicObject) { value.shape.keyList } else { value }}")

                location.set(receiver, value)
            }

            @Specialization(
                replaces = [ "doCached" ]
            )
            @JvmStatic
            fun doUncached(receiver: DynamicObject, key: String, value: Any) {
//                println("set_field_u: $key ${receiver.shape.keyList} $value")
                lookupLocation(receiver.shape, key)!!.set(receiver, value)
            }

            @JvmStatic
            fun shapeCheck(shape: Shape?, receiver: DynamicObject?): Boolean {
                return shape != null && shape.check(receiver)
            }

            @JvmStatic
            fun lookupLocation(
                shape: Shape,
                name: String?
            ): Location? {
                CompilerAsserts.neverPartOfCompilation()

                val property = shape.getProperty(name)
                    ?: /* Property does not exist yet, so a shape change is necessary. */
                    return null
                return property.location
            }
        }
    }


    @ExportMessage
    abstract class ReadMember {
        companion object {
            @Specialization
            @JvmStatic
            fun read(receiver: DynamicObject, key: String): Any {
                return receiver.get(key)
            }
        }
    }

    @ExportMessage
    abstract class GetMembers {
        companion object {
            @Specialization
            @TruffleBoundary
            @JvmStatic
            fun doGeneric(receiver: DynamicObject, includeInternal: Boolean): Keys {
                return Keys(receiver.shape.keyList.toTypedArray())
            }
        }
    }

    @ExportMessage(name = "isMemberReadable")
    abstract class ExistsMemberReadable {
        companion object {
            @Specialization
            @JvmStatic
            @TruffleBoundary
            fun doGeneric(receiver: DynamicObject, member: String?): Boolean {
                return receiver.shape.getProperty(member) != null
            }
        }
    }
    
    @ExportMessage(name = "isMemberModifiable")
    abstract class ExistsMemberModifiable {
        companion object {
            @Specialization
            @JvmStatic
            @TruffleBoundary
            fun doGeneric(receiver: DynamicObject, member: String?): Boolean {
                return receiver.shape.getProperty(member) != null
            }
        }
    }
    
    @ExportMessage(name = "isMemberRemovable")
    abstract class ExistsMemberRemovable {
        companion object {
            @Specialization
            @JvmStatic
            @TruffleBoundary
            fun doGeneric(receiver: DynamicObject, member: String?): Boolean {
                return false
            }
        }
    }

    override fun toString(): String {
        return name
    }
}