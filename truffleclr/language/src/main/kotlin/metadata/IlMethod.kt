package metadata


import main.InstructionBlock
import metadata.instruction.Instruction


// TODO: Split into two distinct method types the Runtime one and the parsing one.
class IlMethod(var name: String, var arguments: List<Pair<String, IlType>>) {
    var maxstack: Int = 0
    var locals: List<IlType> = mutableListOf()
    var instructions = mutableListOf<Instruction>()
    var jumpLabels = mutableListOf<String>()
    var labels = linkedMapOf<String, Int>()
    lateinit var returnType: IlType

    var memberOf: IlType? = null

    var static = false
    var internal = false
    var abstract = false

    val blockByLabel = mutableMapOf<String, InstructionBlock>()

    override fun toString(): String {
//        return
//        if (memberOf == null) {
          return "$returnType $memberOf::$name(${arguments.map { it.second }.joinToString(",")})"
//        } else {
//            "$memberOf::$name(${arguments.joinToString(",")})"
//        }
    }

    fun toString(memberOf: Boolean = false) : String {
        return "$returnType $name(${arguments.map { it.second }.joinToString(",")})"
    }
}
