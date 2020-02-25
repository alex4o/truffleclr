package metadata


import main.InstructionBlock
import metadata.instruction.Instruction


// TODO: Split into two distinct method types the Runtime one and the parsing one.
class IlMethod(var name: String, var arguments: List<IlType>) {
    var maxstack: Int = 0
    var locals: List<IlType> = mutableListOf()
    var instructions = mutableListOf<Instruction>()
    var jumpLabels = mutableListOf<String>()
    var labels = linkedMapOf<String, Int>()
    lateinit var returnType: IlType

    var memberOf: IlType? = null

    var static = false
    var internal = false

    val blockByLabel = mutableMapOf<String, InstructionBlock>()

    override fun toString(): String {
//        return
//        if (memberOf == null) {
          return "$returnType $memberOf::$name(${arguments.joinToString(",")})"
//        } else {
//            "$memberOf::$name(${arguments.joinToString(",")})"
//        }
    }
}
