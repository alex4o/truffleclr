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

    var compiled = mutableMapOf<Int, Block>()

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

    val blockByLabel = mutableMapOf<String, InstructionBlock>()

    val graph: Graph
        get() {
            val indexLabels = labels.map { Pair(it.value, it.key) }.toMap()
            val jumpLabelsLocations = jumpLabels.map { Pair(labels[it]!!, it) }.toMap()

            val blocks = ArrayList<InstructionBlock>()


            return if (instructions.isNotEmpty()) {
                val entrypoint = labels.keys.first()

                lateinit var block: InstructionBlock

                fun nextBlock(name: String) {
                    block = InstructionBlock(name, blocks.size)
                    blocks.add(block)

                    block.instructions = mutableListOf()
                    block.targets = mutableSetOf()
                    blockByLabel.put(block.label, block)
                }

                nextBlock(entrypoint)

                for ((index, instruction) in instructions.withIndex()) {
                    if (block.instructions.size != 0 && jumpLabelsLocations.containsKey(index)) {
                        block.targetLabels.addAll(listOf(indexLabels[index]!!))
                        nextBlock(indexLabels[index] ?: error("No ret instruction"))
                    }

                    block.instructions.add(instruction)

                    if (instruction is InstructionBrTarget) {
                        if (instruction.instruction == "br" || instruction.instruction == "br.s" || instruction.instruction.startsWith(
                                "leave"
                            )
                        ) {
                            block.targetLabels.addAll(listOf(instruction.target))
                        } else {
                            block.targetLabels.addAll(listOf(indexLabels[index + 1]!!, instruction.target))
                        }
                        nextBlock(indexLabels[index + 1] ?: error("No ret instruction"))
                    }

                    if (instruction.instruction == "ret") {
                        if (index != instructions.lastIndex) {
                            nextBlock(indexLabels[index + 1] ?: error("No ret instruction"))
                        }
                    }
                }

                for( block in blocks ) {
                    block.targets = block.targetLabels.map { blockByLabel.getValue(it).index }.toHashSet()
                }

                Graph(blocks, this)
            } else {
                Graph(blocks, this)
            }
        }
}