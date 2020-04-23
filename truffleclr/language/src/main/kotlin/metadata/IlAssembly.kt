package metadata

class IlAssembly(var name: String = "") {
    var types: MutableMap<String, IlType> = mutableMapOf()
    var modules: MutableList<IlModule> = mutableListOf()



    fun getType(name: String) {

    }
}