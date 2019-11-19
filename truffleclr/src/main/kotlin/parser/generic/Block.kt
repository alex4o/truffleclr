package parser.generic

import parser.generic.instruction.Instruction

class Block() {
    var instructions = mutableListOf<Instruction>()
    var targets = mutableListOf<String>()

    override fun toString(): String {
        return "\ninstructions: ${instructions}\ntargets: $targets"
    }

}