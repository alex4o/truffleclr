package parser.generic

import parser.generic.instruction.Instruction

class InstructionBlock(var label: String = "", var index: Int = -1) {

    constructor(instructions: MutableList<Instruction>) : this() {
        this.instructions = instructions
    }

    // Instruction stealing is implemented for the situation when a block has the receiving instructions but the giving instructions are in another block.

    var stolen = 0
    var instructions = mutableListOf<Instruction>()

    var parents = mutableSetOf<Int>()
    var targets = linkedSetOf<Int>()
    var targetLabels = linkedSetOf<String>()
    var loopHeader = false

    override fun toString(): String {
//        return "\ninstructions: ${instructions}\ntargets: $targets"
        return label
    }

}