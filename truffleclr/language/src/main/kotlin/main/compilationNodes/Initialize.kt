package main.compilationNodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.Scope
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
import nodes.MethodBody
import nodes.expressions.LoadConstInt
import nodes.expressions.LoadLocalNodeGen
import nodes.expressions.Subtract
import nodes.statements.StoreLocalNodeGen
import parser.generic.IlAppDomain
import runtime.Method
import runtime.Methods

class Initialize(
    appDomain: IlAppDomain,
    var scopes: MutableList<Scope>,
    frameDescriptor: FrameDescriptor,
    val language: TruffleLanguage<*>
) :
    RootNode(language, frameDescriptor) {

    val counter = frameDescriptor.findOrAddFrameSlot("counter", FrameSlotKind.Int)
    val compileChildren = appDomain.assemblies.flatMap {
        val methods = Methods()
        val scope = Scope.newBuilder(it.name, methods).build()
        scopes.add(scope)
        it.types.values.filter { it.name.contains("Program") }.flatMap {
            it.methods.values.map {
                methods.functions[it.toString()] = Method(it.toString(), null)
                CompileMethod(it, language, methods)
            }
        }
    }

    var runtime = Truffle.getRuntime()

    @Child
    var writeCounter: ExpressionNode = StoreLocalNodeGen.create(LoadConstInt(compileChildren.lastIndex), 0, counter)

    @Child
    var compileNodes = runtime.createLoopNode(IterateFunctions(compileChildren.toTypedArray(), language, counter))

    override fun execute(env: VirtualFrame): Any? {
        writeCounter.execute(env)
        compileNodes.execute(env)

        return 0
    }

    override fun getName() = "Compile"

    override fun toString(): String {
        return name
    }

    public class IterateFunctions(@Children var list: Array<CompileMethod>, val language: TruffleLanguage<*>, counterSlot: FrameSlot) :
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
                finish(node, method)

                counterWrite.execute(env)
                true;
            } else {
                false
            }
        }

        @CompilerDirectives.TruffleBoundary
        fun finish(node: CompileMethod, method: MethodBody) {
            node.graph.visualise(language)
        }

    }
}