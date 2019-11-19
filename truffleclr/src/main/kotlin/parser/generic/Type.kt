package parser.generic

class Type(var name: String) {
    var methods: MutableMap<String, Method> = mutableMapOf()
    var fields: MutableMap<String, Field> = mutableMapOf()
    var attribtes: Set<String> = setOf()
    var namespace: String = ""
}