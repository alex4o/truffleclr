package parser.generic

class IlAppDomain {

    var assemblies: MutableList<IlAssembly> = mutableListOf()


    lateinit var entryPoint: IlMethod
    lateinit var entryAssembly: IlAssembly

    fun getMethod(id: String): IlMethod? {
        val typeName = id.split("::")[0]
        val methodName = id.split("::")[1]
        for (assembly in assemblies) {
            val type = assembly.types.getValue(typeName)
            return type?.methods?.getValue(methodName)
        }
        return null
    }
}