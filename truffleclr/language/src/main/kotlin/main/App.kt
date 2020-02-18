package main

import com.oracle.truffle.api.Scope
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.instrumentation.TruffleInstrument
import com.oracle.truffle.api.nodes.IndirectCallNode
import main.compilationNodes.CompileMethod
import main.compilationNodes.Initialize
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import parser.generic.IlAppDomain
import runtime.ClrContext
import runtime.Method
import runtime.Type
import java.io.File

fun main() {
    val clr = Clr()

    val appDomain = IlAppDomain()
    clr.parseFile(
        appDomain, CharStreams.fromPath(
            File("./language/src/main/resources/System.Private.CoreLib.il").toPath()
        )
    )
    clr.parseFile(appDomain, CharStreams.fromFileName("./test/nqueen.il"))

    val context = ClrContext()
    clr.tmp = context

    val frameDescriptor = FrameDescriptor()
    val initNode = Initialize(appDomain, context, frameDescriptor, clr)
    initNode.execute(Truffle.getRuntime().createMaterializedFrame(arrayOf()))

    initNode.compileChildren.forEach {
        it.graph.visualise(clr)
    }

//    var callNode = IndirectCallNode.create()
//    print(callNode.call(context.types.getValue("HelloWorld.Program").members.getValue("void HelloWorld.Program::Main(string[])").callTarget, 0))
}