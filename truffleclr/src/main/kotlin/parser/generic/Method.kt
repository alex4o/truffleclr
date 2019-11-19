package parser.generic

import parser.generic.instruction.Instruction
import parser.generic.instruction.InstructionBrTarget

class Method(var name: String, var arguments: List<String>) {
    var maxstack: Int = 0
    var locals: List<String> = mutableListOf()
    var instructions = mutableListOf<Instruction>()
    var jumpLabels = mutableListOf<String>()
    var labels = linkedMapOf<String, Int>()
    var returnType: String = ""

    val tree: Pair<String, LinkedHashMap<String, Block>>
        get() {
            val indexLabels = labels.map { Pair(it.value, it.key) }.toMap()
            val jumpLabelsLocations = jumpLabels.map { Pair(labels[it]!!, it) }.toMap()

            val blocks = linkedMapOf<String, Block>()

            return if(instructions.isNotEmpty()) {
                val entrypoint = labels.keys.first()
                var blockName = entrypoint
                var block = Block()
                blocks.put(blockName, block)

                for ((index, instruction) in instructions.withIndex()) {
                    if (block.instructions.size != 0 && jumpLabelsLocations.containsKey(index)) {
                        block.targets.addAll(listOf(indexLabels[index]!!))

                        block = Block()
                        blockName = indexLabels[index]!!
                        block.instructions = mutableListOf()
                        block.targets = mutableListOf()
                        blocks.put(blockName, block)


                    }

                    block.instructions.add(instruction)

                    if(instruction is InstructionBrTarget) {
                        block.targets.addAll(listOf(indexLabels[index + 1]!!, instruction.target))


                        block = Block()
                        blockName = indexLabels[index + 1] ?: error("No ret instruction")
                        block.instructions = mutableListOf()
                        block.targets = mutableListOf()
                        blocks.put(blockName, block)

                    }
                }

                Pair(entrypoint, blocks)
            }else{
                Pair("", blocks)
            }
        }
}