package parser.generic

import com.oracle.truffle.api.RootCallTarget
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.FrameSlotKind
import main.getNodes
import nodes.Block
import nodes.DispatchNode
import nodes.Method
import parser.generic.instruction.Instruction
import parser.generic.instruction.InstructionBrTarget
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.LinkedHashSet


// TODO: Split into two distinct method types the Runtime one and the parsing one.
class Method(var name: String, var arguments: List<String>) {
    var maxstack: Int = 0
    var locals: List<String> = mutableListOf()
    var instructions = mutableListOf<Instruction>()
    var jumpLabels = mutableListOf<String>()
    var labels = linkedMapOf<String, Int>()
    var returnType: String = ""

    var memberOf: Type? = null

    var compiled = sortedMapOf<Int, Block>()

    var static = false

    val frameDescriptor = FrameDescriptor();
    val frameSlots by lazy {
        locals.mapIndexed { index, local ->
            val kind = when (local) {
                "int32" -> FrameSlotKind.Int
                "int64" -> FrameSlotKind.Long
                "bool" -> FrameSlotKind.Boolean
                else -> FrameSlotKind.Illegal
            }
            frameDescriptor.addFrameSlot(index, kind)
        }
    }

    private val dispatchNode = DispatchNode(arrayOf())

    fun callTarget(language: TruffleLanguage<*>): RootCallTarget {
        return Truffle.getRuntime().createCallTarget(Method(dispatchNode, frameDescriptor, language))
    }

    val blockByLabel = mutableMapOf<String, InstructionBlock>()

    val graph: Graph by lazy() {
        val indexLabels = labels.map { Pair(it.value, it.key) }.toMap()
        val jumpLabelsLocations = jumpLabels.map { Pair(labels[it]!!, it) }.toMap()

        val blocks = ArrayList<InstructionBlock>()


        if (instructions.isNotEmpty()) {
            val entrypoint = labels.keys.first()

            lateinit var block: InstructionBlock

            fun nextBlock(name: String) {
                block = InstructionBlock(name, blocks.size)
                blocks.add(block)

                block.instructions = mutableListOf()
                block.targets = linkedSetOf()
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
                    if (instruction.instruction == "br" ||
                        instruction.instruction == "br.s" ||
                        instruction.instruction.startsWith("leave")
                    ) {
                        block.targetLabels.addAll(listOf(instruction.target))
                    } else {
                        block.targetLabels.addAll(listOf(instruction.target, indexLabels[index + 1]!!))
                    }
                    nextBlock(indexLabels[index + 1] ?: error("No ret instruction"))
                }

                if (instruction.instruction == "ret") {
                    if (index != instructions.lastIndex) {
                        nextBlock(indexLabels[index + 1] ?: error("No ret instruction"))
                    }
                }
            }

            for (block in blocks) {
                block.targets = LinkedHashSet(block.targetLabels.map { blockByLabel.getValue(it).index })
            }

            Graph(blocks, this)
        } else {
            Graph(blocks, this)
        }
    }

    fun compile() {
        val queue = ArrayDeque<Int>()
        val visited = mutableSetOf<Int>()
        queue.add(graph.root)

        while (queue.isNotEmpty()) {
            val index = queue.pop();
            val block = graph.nodes[index]
            if (visited.contains(index)) {
                continue
            }

            if (block.stolen == 0) {
                graph.getNodes(block.index, language = Graph.language!!)
            }

            visited.add(index)
            queue.addAll(block.targets)
        }

        var a = arrayOfNulls<Block>(compiled.lastKey() + 1);
        compiled.forEach {
            a[it.key] = it.value
        }

        dispatchNode.blocks = a as Array<Block>

    }

    override fun toString(): String {
        return if (memberOf == null) {
            "$name($arguments)"
        } else {
            "$memberOf::$name(${arguments.joinToString(",")})"
        }
    }
}
