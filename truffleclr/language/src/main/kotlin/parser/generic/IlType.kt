package parser.generic

class IlType(var name: String) {
    var methods: MutableMap<String, IlMethod> = mutableMapOf()
    var fields: MutableMap<String, IlField> = mutableMapOf()
    var attribtes: Set<String> = setOf()

    override fun toString(): String {
        return name
    }

    var isClass: Boolean = false
    var isInterface: Boolean = false
}