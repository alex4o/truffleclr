package metadata

import runtime.CorElementType
import runtime.CoreTypeInfo

class IlType(var name: String, val type: CorElementType) {

    var methods: MutableMap<String, IlMethod> = mutableMapOf()
    var fields: MutableMap<String, IlField> = mutableMapOf()
    var attribtes: Set<String> = setOf()
    var extends: IlType? = null

    var rank: Int = 0
    lateinit var elementClass: IlType

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

    val arrayCache = mutableMapOf<Int, IlType>()

    fun makeArray(rank: Int): IlType {
        if(arrayCache.contains(rank)) {
            return arrayCache.getValue(rank)
        }

        val array = IlType("$name[]", CorElementType.ARRAY)
        array.elementClass = this
        return array
    }

    override fun toString(): String {
        return name
    }

    var isClass = false
    var isInterface = false
    var isPrimiteive = false
    var isArray = false
    var isGeneric = false
    var isValueType = false
    var isEnum = false

    init {
        val typeInfo = CoreTypeInfo.typeByElementType.getValue(type)
        isArray = typeInfo.isArray
        isPrimiteive = typeInfo.isPrimitive
    }
}