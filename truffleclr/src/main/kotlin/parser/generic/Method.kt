package parser.generic

import parser.generic.instruction.Instruction

class Method(var name: String, var arguments: List<String>) {
    var maxstack: Int = 0
    var locals: List<String> = mutableListOf()
    var instructions: MutableList<Instruction> = mutableListOf()
    var returnType: String = ""

}