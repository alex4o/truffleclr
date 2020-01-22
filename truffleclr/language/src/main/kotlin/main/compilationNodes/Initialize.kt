package main.compilationNodes

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
import nodes.expressions.LoadConstInt
import nodes.expressions.LoadLocalNodeGen
import nodes.expressions.Subtract
import nodes.statements.StoreLocalNodeGen
import parser.generic.IlAppDomain
import runtime.Method
import runtime.Methods

class Initialize(
    appDomain: IlAppDomain,
    var methods: Methods,
    frameDescriptor: FrameDescriptor,
    val language: TruffleLanguage<*>
) :
    RootNode(language, frameDescriptor) {

    val counter = frameDescriptor.findOrAddFrameSlot("counter", FrameSlotKind.Int)
    val compileChildren = appDomain.assemblies.flatMap {
        it.types.values.filter { it.name.contains("Program") }.flatMap {
            it.methods.values.map {
                methods.functions[it.toString()] = Method(it.toString(), null)
                CompileMethod(it, language)
            }
        }
    }

    var runtime = Truffle.getRuntime()

    @Child
    var writeCounter: ExpressionNode = StoreLocalNodeGen.create(LoadConstInt(compileChildren.lastIndex), 0, counter)

    @Child
    var compileNodes = runtime.createLoopNode(IterateFunctions(compileChildren.toTypedArray(), language, methods, counter))

    override fun execute(env: VirtualFrame): Methods {

//        for (assembly in appDomain.assemblies) {
//            val types = assembly.types.values
////                println(types)
//
//            for (type in types) {
//                if (type.name.contains("Program")) {
//                    println(type.methods)
//                    type.methods.forEach {
//                        it.value.compile()
//                        it.value.graph.visualise()
//                        methods.functions[it.value.toString()] =
//                            Method(it.value.name, it.value.callTarget(language))
////                    it.value.graph.dominators.visualise()
//                    }
//                }
//            }
//        }

//        Truffle.getRuntime().createLoopNode {
//            if(iterator.hasNext()) {
//                val node = iterator.next()
//                val method = node.execute(env)
//                methods.functions[node.method.toString()]!!.callTarget = runtime.createCallTarget(method)
//                node.graph.visualise(language)
//
//                return@createLoopNode true
//            }else{
//                return@createLoopNode false
//            }
//        }
//
//
//        for(node in compileNodes) {
//            val method = node.execute(env)
//            methods.functions[node.method.toString()]!!.callTarget = runtime.createCallTarget(method)
//            node.graph.visualise(language)
//
//        }


//            if (main != null) {
//                return mainNode.call(CTSNull())
//            }
        writeCounter.execute(env)
        compileNodes.execute(env)

        return methods
    }

    override fun getName() = "Compile"

    override fun toString(): String {
        return name
    }

    public class IterateFunctions(@Children var list: Array<CompileMethod>, val language: TruffleLanguage<*>, val methods: Methods, counterSlot: FrameSlot) :
        RepeatingNode, Node() {

        val runtime = Truffle.getRuntime()
        @Child
        var counter: ExpressionNode = LoadLocalNodeGen.create(0, counterSlot)

        @Child
        var counterWrite: ExpressionNode = StoreLocalNodeGen.create(Subtract(counter, LoadConstInt(1)), 0, counterSlot)
        override fun executeRepeating(env: VirtualFrame): Boolean {
            val index = counter.executeInt(env)
            return if (index >= 0) {
                val node = list[index]
                val method = node.execute(env)
                methods.functions[node.method.toString()]!!.callTarget = runtime.createCallTarget(method)
                node.graph.visualise(language)
                counterWrite.execute(env)
                true;
            } else {
                false
            }
        }

    }
}