package main

import Cil.CilLexer
import Cil.CilParser
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.nodes.DirectCallNode
import nodes.DispatchNode
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import parser.cil.DeclVisitor
import parser.generic.AppDomain
import java.io.FileReader
import java.util.*
import java.io.File
import nodes.Method
import parser.generic.LengauerTarjan
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

fun String.runCommand() {
    ProcessBuilder(*split(" ").toTypedArray())
        .directory(File("."))
        .start()
}

/*
 Evidance that some work is done, start with overview (what is the problem, why is it worth tackeling)
 Plan of things to do, priorities, and planned time estimates.

 Tell what does not work
*/

fun main() {

    var appDomain = AppDomain()

    var reader = FileReader("./test/break_continue.il");

    var stream = CharStreams.fromReader(reader, "useless");
    var lexer = CilLexer(stream)

    val tstream = CommonTokenStream(lexer);

    var parser = CilParser(tstream)
    var tree = parser.decls()
    var rootVisitor = DeclVisitor(appDomain)
    for (decl in tree.children) {
        decl.accept(rootVisitor)
    }



    for(assembly in appDomain.assemblies) {
        val types = assembly.types
        println(types)
        for(type in types) {
            println(type.methods)
            type.methods.forEach {
                it.value.compile()
                it.value.graph.visualise()
                it.value.graph.dominators.visualise()
            }

        }
    }

    println(appDomain.entryPoint.locals)
    val time = measureTimeMillis {
        println(DirectCallNode.create(appDomain.entryPoint.callTarget).call(5))
    }

    println("Completed in: ${time}")
}

/*
TODO: List
- Check if my symbolic evaluation is correct:
    - Done: If, IfElse, For, While, While inside another one, DoWhile, Recursion (fac, fib)
    - Todo: Closure, Loops with receiving.

- Instead of merging blocks create new ones that will hold both the receiver and the giver. This way even support of many to many is possible.
- Compare CFG results with the ones obtained from ILSpy to verify my outputs
- Implement method calling of static method that are from other classes
- Implement support for structs in the begining all the structs are going to be on the heap and after I find a way to put them on the stack that is going to change. TruffleObjects will be used.
- Implement arrays same as prev.
- Implement objects and real methods.


- Check the control flow optimizations that ILSpy uses to detect loops
- Read about either the Relooper or the Stackifier algorithms so loops can be produced withouth gotos
- Reimplement parts of mscorelib

*/