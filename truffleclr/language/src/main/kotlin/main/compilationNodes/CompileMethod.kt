package main.compilationNodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.RootCallTarget
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import main.getNodes
import nodes.*
import parser.generic.Graph
import parser.generic.IlMethod
import parser.generic.InstructionBlock
import parser.generic.instruction.InstructionBrTarget
import runtime.Methods
import java.lang.Exception
import java.util.*

class CompileMethod(val method: IlMethod, val language: TruffleLanguage<*>, val methods: Methods) : ExpressionNodeGeneric<MethodBody>() {
    val frameDescriptor = FrameDescriptor();

    var compiled = sortedMapOf<Int, Block>()

    // TODO: Type parser
    val frameSlots = method.locals.mapIndexed { index, local ->
        val kind = when (local) {
            "int32" -> FrameSlotKind.Int
            "int64" -> FrameSlotKind.Long
            "bool" -> FrameSlotKind.Boolean
            "int32[]" -> FrameSlotKind.Object
            else -> FrameSlotKind.Illegal
        }
        frameDescriptor.addFrameSlot("local$index", kind)
    }

    val argumentsSlots = method.arguments.mapIndexed { index, local ->
        val kind = when (local) {
            "int32" -> FrameSlotKind.Int
            "int64" -> FrameSlotKind.Long
            "bool" -> FrameSlotKind.Boolean
            "int32[]" -> FrameSlotKind.Object
            else -> FrameSlotKind.Illegal
        }
        frameDescriptor.addFrameSlot("argument$index", kind)
    }.filter { it.kind != FrameSlotKind.Illegal }


    private fun body(dispatchNode: DispatchNode): MethodBody {
        return MethodBody(method.name, dispatchNode, argumentsSlots.toTypedArray(), frameDescriptor, language)
    }

//    private fun callTarget(): RootCallTarget {
//        return Truffle.getRuntime()
//            .createCallTarget(body())
//    }
    val runtime = Truffle.getRuntime()

    @ExplodeLoop
    override fun execute(env: VirtualFrame): MethodBody {
        val queue = ArrayDeque<Int>()
        val visited = mutableSetOf<Int>()
        try {
            queue.add(graph.root)
            while (queue.isNotEmpty()) {
                val index = queue.pop();
                val block = graph.nodes[index]
                if (visited.contains(index)) {
                    continue
                }

                if (block.stolen == 0) {
                    graph.getNodes(block.index, language)
                }

                visited.add(index)
                queue.addAll(block.targets)
            }

            var blocks = arrayOfNulls<Block>(compiled.lastKey() + 1);
            compiled.forEach {
                blocks[it.key] = it.value
            }

            val dispatchNode = DispatchNode(blocks as Array<Block>)

            val methodBody = body(dispatchNode)
            methods.functions[method.toString()]!!.callTarget = runtime.createCallTarget(methodBody)
            return methodBody

        } catch (e: Exception) {
            println("Compilation failed for method: $method")
            e.printStackTrace()
            throw e
        }
    }

    val graph: Graph by lazy() @CompilerDirectives.TruffleBoundary
    {
        val indexLabels = method.labels.map { Pair(it.value, it.key) }.toMap()
        val jumpLabelsLocations = method.jumpLabels.map { Pair(method.labels[it]!!, it) }.toMap()

        val blocks = ArrayList<InstructionBlock>()


        if (method.instructions.isNotEmpty()) {
            val entrypoint = method.labels.keys.first()

            lateinit var block: InstructionBlock

            fun nextBlock(name: String) {
                block = InstructionBlock(name, blocks.size)
                blocks.add(block)

                block.instructions = mutableListOf()
                block.targets = linkedSetOf()
                method.blockByLabel.put(block.label, block)
            }

            nextBlock(entrypoint)

            for ((index, instruction) in method.instructions.withIndex()) {
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
                    if (index != method.instructions.lastIndex) {
                        nextBlock(indexLabels[index + 1] ?: error("No ret instruction"))
                    }
                }
            }

            for (block in blocks) {
                block.targets = LinkedHashSet(block.targetLabels.map { method.blockByLabel.getValue(it).index })
            }

            Graph(blocks, this)
        } else {
            Graph(blocks, this)
        }
    }
}