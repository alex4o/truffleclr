package parser.generic

class IlType(var name: String) {

    var methods: MutableMap<String, IlMethod> = mutableMapOf()
    var fields: MutableMap<String, IlField> = mutableMapOf()
    var attribtes: Set<String> = setOf()

    override fun toString(): String {
        return name
    }

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

    var isClass = false
    var isInterface = false
    var isPrimiteive = false
    var isArray = false
    var isGeneric = false
    var isValueType = false
    var isEnum = false
}