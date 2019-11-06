package parser.generic

class AppDomain {

    var assemblies: MutableList<Assembly> = mutableListOf()

    lateinit var entryPoint: Method
    lateinit var entryAssembly: Assembly

}