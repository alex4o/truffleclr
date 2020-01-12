package main

import Cil.CilLexer
import Cil.CilParser
import com.oracle.truffle.api.nodes.DirectCallNode
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Engine
import org.graalvm.polyglot.Source
import parser.cil.DeclVisitor
import parser.generic.AppDomain
import java.io.File
import java.io.FileReader
import kotlin.system.exitProcess
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
    ClrProvider()

    var appDomain = AppDomain()

    val context = Context.newBuilder("trufflecrl").out(System.out).build()


    val time = measureTimeMillis {
        println(
            context.eval(
                Source.newBuilder(
                    "trufflecrl",
                    FileReader("./test/func_fib.il"),
                    "test.il"
                ).build()
            )
        )
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