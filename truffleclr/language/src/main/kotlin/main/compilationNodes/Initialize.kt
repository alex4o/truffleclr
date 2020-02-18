package main.compilationNodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.RepeatingNode
import com.oracle.truffle.api.nodes.RootNode
import nodes.ExpressionNode
import nodes.expressions.LoadConst
import nodes.expressions.LoadLocalNodeGen
import nodes.expressions.math.SubtractNodeGen
import nodes.statements.StoreLocalNodeGen
import parser.generic.IlAppDomain
import parser.generic.IlType
import runtime.ClrContext
import runtime.CoreTypeInfo
import runtime.Method
import runtime.Type
import java.util.*

class Initialize(
    appDomain: IlAppDomain,
    var context: ClrContext,
    frameDescriptor: FrameDescriptor,
    val language: TruffleLanguage<*>
) :
    RootNode(
//        language, frameDescriptor
        null, null
    ) {


    //    val counter = frameDescriptor.findOrAddFrameSlot("counter", FrameSlotKind.Int)

    var compileChildren = mutableListOf<CompileMethod>()

    init {
        for (assembly in appDomain.assemblies) {
            assembly.types.forEach { k, v ->
                if (!context.types.contains(v.fullName)) {
                    context.types.put(v.fullName, processType(v))
                }

                val type = context.types.getValue(v.fullName)

                compileChildren.addAll(v.methods.values
                    .map {
                        type.members[it.toString()] = Method(it.toString(), null)
                        CompileMethod(it, language, type)
                    })
            }
        }
    }

    fun processType(ilType: IlType): Type {
        val type = Type()
        type.name = ilType.fullName
        if (CoreTypeInfo.typeByName.contains(ilType.fullName)) {
            //Dealing with a core type, use type table
            type.info = CoreTypeInfo.typeByName.getValue(ilType.fullName)
        } else {
            // Find the closest element with populated info prop and use his
        }
        if (ilType.extends != null) {
            if (context.types.contains(ilType.extends?.fullName)) {
                type.baseType = context.types.getValue(ilType.extends!!.fullName)
            } else {
                type.baseType = processType(ilType.extends!!)
            }
        }
        return type
    }

    var runtime = Truffle.getRuntime()

//    @Child
//    var writeCounter: ExpressionNode = StoreLocalNodeGen.create(LoadConstInt(compileChildren.lastIndex), 0, counter)

//    @Child
//    var compileNodes = runtime.createLoopNode(IterateFunctions(compileChildren.toTypedArray(), language, counter))

    override fun execute(env: VirtualFrame): Any? {
//        writeCounter.execute(env)
//        compileNodes.execute(env)

        for (compileNode in compileChildren) {
            compileNode.executeVoid(env)
        }

        return 0
    }

    override fun getName() = "Compile"

    override fun toString(): String {
        return name
    }

    public class IterateFunctions(
        @Children var list: Array<CompileMethod>, val language: TruffleLanguage<*>,
        counterSlot: FrameSlot
    ) :
        RepeatingNode, Node() {

        val runtime = Truffle.getRuntime()
        @Child
        var counter: ExpressionNode = LoadLocalNodeGen.create(0, counterSlot)

        @Child
        var counterWrite: ExpressionNode =
            StoreLocalNodeGen.create(
                0,
                SubtractNodeGen.create(counter, LoadConst(1, Int::class)),
                counterSlot
            )

        override fun executeRepeating(env: VirtualFrame): Boolean {
            val index = counter.executeInt(env)
            return if (index >= 0) {

                val node = list[index]
                val method = node.executeVoid(env)
                finish(node)

                counterWrite.execute(env)
                true;
            } else {
                false
            }
        }

        @CompilerDirectives.TruffleBoundary
        fun finish(node: CompileMethod) {
            node.graph.visualise(language)
        }

    }
}