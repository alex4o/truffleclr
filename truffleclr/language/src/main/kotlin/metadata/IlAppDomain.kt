package metadata

class IlAppDomain {

    private val references = mutableMapOf<String, IlType>()
    var assemblies: MutableList<IlAssembly> = mutableListOf()
    lateinit var entryPoint: IlMethod
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