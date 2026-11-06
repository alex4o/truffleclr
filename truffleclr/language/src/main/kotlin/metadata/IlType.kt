package metadata

import runtime.CorElementType
import runtime.CoreTypeInfo

class IlType(var name: String, val type: CorElementType) {
    var genericParameters: List<String> = emptyList()
    var genericInstance: GenericTypeName? = null
    private var metadataLoader: (() -> Unit)? = null
    private var metadataFailure: Throwable? = null
    private var loadingMetadata = false
    var hasDeferredMetadata = false
        private set

    fun deferMetadata(loader: () -> Unit) {
        check(!hasDeferredMetadata) { "Metadata loader already set for $name" }
        hasDeferredMetadata = true
        metadataLoader = loader
    }

    @Synchronized
    fun ensureMetadata() {
        metadataFailure?.let { throw it }
        if (loadingMetadata) return // The loader populates this type through its own accessors.
        val loader = metadataLoader ?: return
        loadingMetadata = true
        try {
            loader()
            metadataLoader = null
        } catch (failure: Throwable) {
            metadataFailure = failure
            throw failure
        } finally { loadingMetadata = false }
    }

    var interfaces: List<IlType> = emptyList()
        get() { ensureMetadata(); return field }

    var methods: MutableMap<String, IlMethod> = mutableMapOf()
        get() { ensureMetadata(); return field }
    var fields: MutableMap<String, IlField> = mutableMapOf()
        get() { ensureMetadata(); return field }
    var attribtes: Set<String> = setOf()
    var extends: IlType? = null
        get() { ensureMetadata(); return field }
    var polyglot: Boolean = false

    var isByRef = false
    fun makeByRef(): IlType = IlType("$name&", CorElementType.BYREF).also {
        it.isByRef = true
        it.elementClass = this
    }

    var rank: Int = 0
    lateinit var elementClass: IlType

    fun getMethod(id: String): IlMethod {
        if(methods.contains(id)) {
            return methods[id]!!
        }else{
            error("Trying to get unexisting method $id from $name ")
        }
    }

    val fullName: String
        get() {
            return name
        }

    val arrayCache = mutableMapOf<Int, IlType>()

    fun makeArray(rank: Int): IlType {
        if(arrayCache.contains(rank)) {
            return arrayCache.getValue(rank)
        }

        val array = IlType("$name[]", CorElementType.ARRAY)
        array.elementClass = this
        array.rank = rank
        arrayCache[rank] = array
        return array
    }

    override fun toString(): String {
        return name
    }

    var isClass = false
    var isInterface = false
        get() { ensureMetadata(); return field }
    var isPrimiteive = false
    var isArray = false
    var isGeneric = false
    var isValueType = false
    var isEnum = false

    init {
        val typeInfo = CoreTypeInfo.typeByElementType.getValue(type)
        isArray = typeInfo.isArray
        isPrimiteive = typeInfo.isPrimitive
    }
}