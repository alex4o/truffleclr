package parser.generic

class Module(val name: String) {
    var types: MutableMap<String, Type> = mutableMapOf()

    fun getType(name: String): Type? {
        return types[name]
    }
}