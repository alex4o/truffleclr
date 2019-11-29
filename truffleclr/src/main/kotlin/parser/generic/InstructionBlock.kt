package parser.generic

import parser.generic.instruction.Instruction

class InstructionBlock(var label: String = "", var index: Int = -1) {

    constructor(instructions: MutableList<Instruction>) : this() {
        this.instructions = instructions
    }

    var instructions = mutableListOf<Instruction>()

    var parents = mutableSetOf<Int>()
    var targets = mutableSetOf<Int>()
    var targetLabels = mutableSetOf<String>()
    var loopHeader = false

    override fun toString(): String {
//        return "\ninstructions: ${instructions}\ntargets: $targets"
        return label
    }

}