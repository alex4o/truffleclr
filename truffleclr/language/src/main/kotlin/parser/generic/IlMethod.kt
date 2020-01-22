package parser.generic


import nodes.Block

import parser.generic.instruction.Instruction
import parser.generic.instruction.InstructionBrTarget
import kotlin.collections.ArrayList
import kotlin.collections.LinkedHashSet


// TODO: Split into two distinct method types the Runtime one and the parsing one.
class IlMethod(var name: String, var arguments: List<String>) {
    var maxstack: Int = 0
    var locals: List<String> = mutableListOf()
    var instructions = mutableListOf<Instruction>()
    var jumpLabels = mutableListOf<String>()
    var labels = linkedMapOf<String, Int>()
    var returnType: String = ""

    var memberOf: IlType? = null

    var static = false

    val blockByLabel = mutableMapOf<String, InstructionBlock>()

    override fun toString(): String {
        return if (memberOf == null) {
            "$name($arguments)"
        } else {
            "$memberOf::$name(${arguments.joinToString(",")})"
        }
    }
}
