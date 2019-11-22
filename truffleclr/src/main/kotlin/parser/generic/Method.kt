package parser.generic

import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.FrameSlotKind
import nodes.Block
import parser.generic.instruction.Instruction
import parser.generic.instruction.InstructionBrTarget

class Method(var name: String, var arguments: List<String>) {
    var maxstack: Int = 0
    var locals: List<String> = mutableListOf()
    var instructions = mutableListOf<Instruction>()
    var jumpLabels = mutableListOf<String>()
    var labels = linkedMapOf<String, Int>()
    var returnType: String = ""

    var compiled = mutableMapOf<String, Block>()

    val frameDescriptor = FrameDescriptor();
    val frameSlots by lazy {
        locals.mapIndexed { index, local ->
            val kind = when(local) {
                "int32" -> FrameSlotKind.Int
                "int64" -> FrameSlotKind.Long
                "bool" -> FrameSlotKind.Boolean
                else -> FrameSlotKind.Illegal
            }
            frameDescriptor.addFrameSlot(index, kind)
        }
    }


    val graph: Graph
        get() {
            val indexLabels = labels.map { Pair(it.value, it.key) }.toMap()
            val jumpLabelsLocations = jumpLabels.map { Pair(labels[it]!!, it) }.toMap()

            val blocks = linkedMapOf<String, InstructionBlock>()



            return if (instructions.isNotEmpty()) {
                val entrypoint = labels.keys.first()
                var block = InstructionBlock(entrypoint)
                blocks.put(block.name, block)

                fun nextBlock(name: String) {
                    block = InstructionBlock(name)
                    block.instructions = mutableListOf()
                    block.targets = mutableSetOf()
                    blocks.put(block.name, block)
                }

                for ((index, instruction) in instructions.withIndex()) {
                    if (block.instructions.size != 0 && jumpLabelsLocations.containsKey(index)) {
                        block.targets.addAll(listOf(indexLabels[index]!!))
                        nextBlock(indexLabels[index] ?: error("No ret instruction"))
                    }

                    block.instructions.add(instruction)

                    if (instruction is InstructionBrTarget) {
                        if (instruction.instruction == "br" || instruction.instruction == "br.s" || instruction.instruction.startsWith(
                                "leave"
                            )
                        ) {
                            block.targets.addAll(listOf(instruction.target))
                        } else {
                            block.targets.addAll(listOf(indexLabels[index + 1]!!, instruction.target))
                        }
                        nextBlock(indexLabels[index + 1] ?: error("No ret instruction"))
                    }

                    if (instruction.instruction == "ret") {
                        if (index != instructions.lastIndex) {
                            nextBlock(indexLabels[index + 1] ?: error("No ret instruction"))
                        }
                    }
                }

                Graph(entrypoint, blocks, this)
            } else {
                Graph("", blocks, this)
            }
        }
}