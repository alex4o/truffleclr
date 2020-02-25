package metadata

class IlAppDomain {

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

        return error("Trying to get a non existent type $id")
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