package parser.generic

import parser.generic.instruction.Instruction

class InstructionBlock(var name: String = "") {

    constructor(instructions: MutableList<Instruction>) : this() {
        this.instructions = instructions
    }

    var instructions = mutableListOf<Instruction>()
    var targets = mutableSetOf<String>()
    var loopHeader = false

    override fun toString(): String {
//        return "\ninstructions: ${instructions}\ntargets: $targets"
        return name
    }

}