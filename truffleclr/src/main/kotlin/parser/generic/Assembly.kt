package parser.generic

class Assembly(var name: String) {
    var modules: MutableList<Module> = mutableListOf()

    val types: List<Type> by lazy {
        modules.flatMap { it.types.values }
    }

    fun getType(name: String): Type? {
        if(modules.count() == 1) {
            return modules[0].getType(name)
        }

        for(module in modules) {
            val type = module.getType(name)
            type ?: return type
        }

        return null
    }


}