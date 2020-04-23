package main

import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.frame.FrameDescriptor
import main.compilationNodes.Initialize
import org.antlr.v4.runtime.CharStreams
import metadata.IlAppDomain
import runtime.ClrContext
import java.io.File

/**
 * A main class used to debug the system while being able to break on exception.
 */
fun main() {
    println("test")
    val clr = Clr()

    val appDomain = IlAppDomain()
    clr.parseFile(
        appDomain, CharStreams.fromPath(
            File("./language/src/main/resources/System.Private.CoreLib.il").toPath()
        )
    )
    clr.parseFile(appDomain, CharStreams.fromFileName("./test/spectralnorm.il"))

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