package runtime

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.staticobject.StaticShape
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import runtime.util.Keys
import types.CTSNull

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

    @CompilerDirectives.CompilationFinal lateinit var shape: StaticShape<ClrObjectFactory>
    @CompilerDirectives.CompilationFinal lateinit var staticObject: ClrObject
    @CompilerDirectives.CompilationFinal(dimensions = 1) lateinit var virtualTable: Array<Method>
    val instanceFields: MutableMap<String, Field> = linkedMapOf()
    val staticFields: MutableMap<String, Field> = linkedMapOf()
    var initializer: Method? = null
    @CompilerDirectives.CompilationFinal private var initialized = false
    private var initializing = false
    private var initializationFailure: Throwable? = null

    fun resolveField(name: String, static: Boolean): Field =
        (if (static) staticFields[name] else instanceFields[name])
            ?: baseType?.resolveField(name, static) ?: error("No field $name in "+this.name)

    /** Initialize on first field access, newobj or method entry (except .cctor).
     * This also eagerly initializes beforefieldinit types on their first method call.
     * Reentrant accesses see the zeroed storage; a failed initializer is never rerun.
     */
    fun ensureInitialized() {
        if (!initialized) initialize()
    }

    @Synchronized
    @CompilerDirectives.TruffleBoundary
    private fun initialize() {
        if (initialized || initializing) return
        initializationFailure?.let { throw it }
        CompilerDirectives.transferToInterpreterAndInvalidate()
        initializing = true
        try {
            initializer?.callTarget?.call()
            initialized = true
        } catch (failure: Throwable) {
            initializationFailure = failure
            throw failure
        } finally {
            initializing = false
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

    fun isAssignableFrom(type: Type): Boolean = this === type || type.baseType?.let { isAssignableFrom(it) } == true

    fun isInstance(obj: TruffleObject?): Boolean {
        return obj is ClrObject && isAssignableFrom(obj.type)
    }
}