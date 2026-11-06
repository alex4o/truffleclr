package metadata

class IlAppDomain : AutoCloseable {
    private val resources = mutableListOf<AutoCloseable>()
    private var closed = false

    fun own(resource: AutoCloseable) {
        check(!closed) { "Assembly domain is closed" }
        resources.add(resource)
    }

    override fun close() {
        if (closed) return
        closed = true
        metadataChanged = null
        materializeType = null
        entryPointLoader = null
        var failure: Throwable? = null
        for (resource in resources.asReversed()) {
            try {
                resource.close()
            } catch (error: Throwable) {
                if (failure == null) failure = error else failure.addSuppressed(error)
            }
        }
        resources.clear()
        failure?.let { throw it }
    }

    private val references = mutableMapOf<String, IlType>()
    internal var metadataChanged: ((List<IlType>, List<IlMethod>) -> Unit)? = null
    var assemblies: MutableList<IlAssembly> = mutableListOf()
    internal var materializeType: ((String) -> Unit)? = null
    internal var availableTypes: Set<String> = emptySet()
    var entryTypeName: String? = null
    private var entryPointLoader: (() -> IlMethod)? = null
    private var loadedEntryPoint: IlMethod? = null
    var entryPoint: IlMethod
        get() = loadedEntryPoint ?: checkNotNull(entryPointLoader) { "Assembly has no entry point" }.invoke().also { loadedEntryPoint = it }
        set(value) { loadedEntryPoint = value; entryTypeName = value.memberOf?.name }

    fun deferEntryPoint(loader: () -> IlMethod) { entryPointLoader = loader }
    lateinit var entryAssembly: IlAssembly

    fun getType(id: String): IlType {
        for (assembly in assemblies) {
            val type = assembly.types[id]
            if(type != null) {
                return type
            }
        }

        // Signatures may refer forward, or contain open generic parameters. The
        // specialization pass resolves these symbolic references before execution.
        return references.getOrPut(id) {
            when {
                id.endsWith("&") -> getType(id.dropLast(1)).makeByRef()
                id.endsWith("[]") -> getType(id.dropLast(2)).makeArray(1)
                else -> IlType(id, runtime.CorElementType.CLASS)
            }
        }
    }

    fun genericTypeName(definition: String, arguments: List<String>): String {
        val name = arguments.joinToString(",", "$definition<", ">")
        getType(name).genericInstance = GenericTypeName(definition, arguments)
        return name
    }

    fun mapTypeName(name: String, transform: (String) -> String): String {
        if (name.endsWith("&")) return mapTypeName(name.dropLast(1), transform) + "&"
        if (name.endsWith("[]")) return mapTypeName(name.dropLast(2), transform) + "[]"
        val instance = getType(name).genericInstance ?: return transform(name)
        return genericTypeName(instance.definition, instance.arguments.map { mapTypeName(it, transform) })
    }

    fun displayTypeName(name: String): String {
        if (name.endsWith("&")) return displayTypeName(name.dropLast(1)) + "&"
        if (name.endsWith("[]")) return displayTypeName(name.dropLast(2)) + "[]"
        val instance = getType(name).genericInstance ?: return name.replace('/', '+')
        return instance.arguments.joinToString(",", instance.definition.replace('/', '+') + "[", "]") { displayTypeName(it) }
    }

    fun getMethod(id: String): IlMethod? {
        val typeName = id.split("::")[0]
        val methodName = id.split("::")[1]
        for (assembly in assemblies) {
            val type = assembly.types[typeName]
            if(type != null) {
                return type.methods[methodName]
            }
        }
//        error("Cannot find: $id")
        return null
    }
}