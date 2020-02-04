package main

import com.oracle.truffle.api.Scope
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.instrumentation.TruffleInstrument
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
    clr.parseFile(appDomain, CharStreams.fromFileName("./test/do_while.il"))

    val context = ClrContext()
    val methods = appDomain.assemblies.flatMap {
        clr.tmp = context
        it.types.values
//            .filter { it.name.contains("Program") }
            .flatMap {
                val type = Type()
                type.name = it.fullName
                context.types.put(type.name, type)
                it.methods.values.map {
                    type.members[it.toString()] = Method(it.toString(), null)
                    CompileMethod(it, clr, type)
                }
            }
    }

    methods.forEach {
        it.executeVoid(Truffle.getRuntime().createMaterializedFrame(arrayOf()))
        it.graph.visualise(clr)

    }
}