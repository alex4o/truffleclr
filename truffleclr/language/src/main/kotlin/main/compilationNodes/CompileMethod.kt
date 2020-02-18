package main.compilationNodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.RootCallTarget
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import main.getNodes
import nodes.*
import nodes.expressions.LoadArgument
import nodes.expressions.LoadArgumentNodeGen
import nodes.internal.InternalMethod
import nodes.internal.InternalTable.staticMethods
import parser.generic.Graph
import parser.generic.IlMethod
import parser.generic.InstructionBlock
import parser.generic.instruction.InstructionBrTarget
import runtime.Type
import java.util.*

class CompileMethod(val method: IlMethod, val language: TruffleLanguage<*>, val type: Type) :
    StatementNode() {
    val frameDescriptor = FrameDescriptor();

    var compiled = sortedMapOf<Int, Block>()

    // TODO: Type parser
    val frameSlots = method.locals.mapIndexed { index, local ->
        val kind = when (local) {
            "int32" -> FrameSlotKind.Int
            "int64" -> FrameSlotKind.Long
            "bool" -> FrameSlotKind.Boolean
            "string" -> FrameSlotKind.Object
            "object" -> FrameSlotKind.Object
            else -> FrameSlotKind.Object
        }
        frameDescriptor.addFrameSlot("local$index", kind)
    }

    val argumentsSlots = if (method.static) {
        method.arguments
    } else {
        listOf("object") + method.arguments
    }.mapIndexed { index, local ->
        val kind = when (local) {
            "int32" -> FrameSlotKind.Int
            "int64" -> FrameSlotKind.Long
            "bool" -> FrameSlotKind.Boolean
            "string" -> FrameSlotKind.Object
            "object" -> FrameSlotKind.Object
            else -> FrameSlotKind.Object
        }
        frameDescriptor.addFrameSlot("argument$index", kind)
    }.filter { it.kind != FrameSlotKind.Illegal }

    var dupCount = 0
    fun genDupSlot(): FrameSlot {
//        return frameDescriptor.findOrAddFrameSlot("dup$dupCount", FrameSlotKind.Object)
        return frameDescriptor.findOrAddFrameSlot("dup$dupCount")
    }

    private fun body(dispatchNode: DispatchNode): MethodBody {
        return MethodBody(method.name, dispatchNode, argumentsSlots.toTypedArray(), frameDescriptor, language)
    }

    //    private fun callTarget(): RootCallTarget {
//        return Truffle.getRuntime()
//            .createCallTarget(body())
//    }
    val runtime = Truffle.getRuntime()

    @CompilerDirectives.TruffleBoundary
    fun log() {
//        println("Compiling: ${method.toString()}")
    }


    fun compileInternal() {
//        println("Internal: ${method.toString()}")
        val methodBody = InternalMethod(staticMethods[method.toString()]!!, frameDescriptor, language)
        type.members[method.toString()]!!.callTarget = runtime.createCallTarget(methodBody)
    }

    fun compileDefault() {
        val queue = ArrayDeque<Int>()
        val visited = mutableSetOf<Int>()
        log()

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
        type.members[method.toString()]!!.callTarget = runtime.createCallTarget(methodBody)

        if(CompilerDirectives.inInterpreter()) {
//            graph.visualise(language)
        }
    }

    val compile = if (method.internal) {
        this::compileInternal
    } else {
        this::compileDefault
    }

    @ExplodeLoop
    override fun executeVoid(env: VirtualFrame) {
//        try {
        compile()
//        } catch (e: Exception) {
//            println("Compilation failed for method: $method")
//            e.printStackTrace()
//            throw e
//        }
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

    override fun toString(): String {
        return "Compile: ${method.toString()}"
    }
}