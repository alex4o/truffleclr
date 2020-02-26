package main.compilationNodes

import com.oracle.truffle.api.*
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import main.getNodes
import nodes.*
import nodes.internal.InternalMethod
import main.Graph
import metadata.IlMethod
import main.InstructionBlock
import metadata.instruction.InstructionBrTarget
import runtime.CorElementType
import runtime.Method
import runtime.Type
import java.lang.Exception
import java.util.*

class CompileMethod(val method: IlMethod, val initialize: Initialize, val language: TruffleLanguage<*>, val type: Type) :
    StatementNode() {
    val frameDescriptor = FrameDescriptor();

    var compiled = sortedMapOf<Int, Block>()

    // TODO: Type parser
    val frameSlots = method.locals.mapIndexed { index, local ->
        if(local.isPrimiteive) {
            val kind = when (local.type) {
                CorElementType.BOOLEAN -> FrameSlotKind.Boolean
                CorElementType.CHAR -> FrameSlotKind.Int
                CorElementType.I1 -> FrameSlotKind.Byte
                CorElementType.U1 -> FrameSlotKind.Byte
//                CorElementType.I2 -> TODO()
//                CorElementType.U2 -> TODO()
                CorElementType.I4 -> FrameSlotKind.Int
                CorElementType.U4 -> FrameSlotKind.Int
                CorElementType.I8 -> FrameSlotKind.Long
                CorElementType.U8 -> FrameSlotKind.Long
                CorElementType.R4 -> FrameSlotKind.Float
                CorElementType.R8 -> FrameSlotKind.Double
//                CorElementType.VALUETYPE -> TODO()
                else -> error("Unknown local type encountered: ${local.type}")
            }
            frameDescriptor.addFrameSlot("local$index", kind)
        }else{
            frameDescriptor.addFrameSlot("local$index", FrameSlotKind.Object)
        }
    }

    val argumentsSlots = if (method.static) {
        method.arguments
    } else {
        listOf(method.memberOf!!) + method.arguments
    }.mapIndexed { index, local ->
        if(local.isPrimiteive) {
            val kind = when (local.type) {
                CorElementType.BOOLEAN -> FrameSlotKind.Boolean
                CorElementType.CHAR -> FrameSlotKind.Int
                CorElementType.I1 -> FrameSlotKind.Byte
                CorElementType.U1 -> FrameSlotKind.Byte
//                CorElementType.I2 -> TODO()
//                CorElementType.U2 -> TODO()
                CorElementType.I4 -> FrameSlotKind.Int
                CorElementType.U4 -> FrameSlotKind.Int
                CorElementType.I8 -> FrameSlotKind.Long
                CorElementType.U8 -> FrameSlotKind.Long
                CorElementType.R4 -> FrameSlotKind.Float
                CorElementType.R8 -> FrameSlotKind.Double
//                CorElementType.VALUETYPE -> TODO()
                else -> error("Unknown local type encountered: ${local.type}")
            }
            frameDescriptor.addFrameSlot("argument$index", kind)
        }else{
            frameDescriptor.addFrameSlot("argument$index", FrameSlotKind.Object)
        }
    }.filter { it.kind != FrameSlotKind.Illegal }

    var dupCount = 0
    fun genDupSlot(kind: FrameSlotKind): FrameSlot {
//        return frameDescriptor.findOrAddFrameSlot("dup$dupCount", FrameSlotKind.Object)
        return frameDescriptor.findOrAddFrameSlot("dup${dupCount++}", kind)
    }

    private fun body(dispatchNode: DispatchNode): MethodBody {
        return MethodBody(method.name, dispatchNode, argumentsSlots.toTypedArray(), frameDescriptor, language)
    }

    val runtime = Truffle.getRuntime()

    fun compileInternal() {
        try {
            val methodBody = InternalMethod(initialize.internalMethods[method.toString()]!!, frameDescriptor, language)
            val member = type.members.getValue(method.toString())
            if(member is Method) {
                    member.callTarget = runtime.createCallTarget(methodBody)
            }else{
                error("Trying to compile a non method as a method")
            }
        } catch (exception: Exception) {
            println("Internal: ${method}")
            exception.printStackTrace()
        }
    }

    fun compileDefault() {
//        println(method.name)
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
                graph.getNodes(block.index, language)
            }

            visited.add(index)
            queue.addAll(block.targets)
        }

        val blocks = arrayOfNulls<Block>(compiled.lastKey() + 1);
        compiled.forEach {
            blocks[it.key] = it.value
        }

        val dispatchNode = DispatchNode(blocks as Array<Block>)

        val methodBody = body(dispatchNode)
        val member = type.members.getValue(method.toString())
        if(member is Method) {
            member.callTarget = runtime.createCallTarget(methodBody)
        }else{
            error("Trying to compile a non method as a method")
        }
    }

    val compile = if (method.internal) {
        this::compileInternal
    } else {
        this::compileDefault
    }

    @ExplodeLoop
    override fun executeVoid(env: VirtualFrame) {
        compile()
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
                    if (instruction.instruction == "br" || instruction.instruction.startsWith("leave")) {
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
        return "Compile(${method})"
    }
}