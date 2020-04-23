package main

import com.oracle.truffle.api.frame.FrameSlotTypeException
import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Source
import java.io.BufferedWriter
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileWriter
import java.time.Duration
import java.time.LocalTime
import java.time.temporal.Temporal
import java.util.*
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

/*
-Dgraal.Dump=Truffle:1
-Dgraal.PrintGraph=Network
-Dgraal.TraceTruffleCompilation=false
-Dgraal.TraceTruffleCompilationDetails=false
-Dgraal.TruffleCompilationThreshold=1000
-Dgraal.TruffleBackgroundCompilation=true
-Dgraal.TruffleCompileImmediately=false
 */

// TODO: Show the strange behaviour of mono
fun main() {
    val out = ByteArrayOutputStream()
    val file = File("./test/richards.il")
    val csvOutput = BufferedWriter(FileWriter("./${file.nameWithoutExtension}.csv"))

    val context = Context.newBuilder().allowAllAccess(true).out(out).build()

        var execution = context.eval(
            Source.newBuilder(
                "clr",
                file
            ).build()
        )

        println(
            execution
        )

    val bindings = context.getBindings("clr")
    val ProgramClass = bindings.getMember("HelloWorld.Program")
//    println(bindings.getMember("HelloWorld.Car").memberKeys)

    val mainMethod = ProgramClass.memberKeys.find { it.contains("Main(") }
    val world = ProgramClass.getMember(mainMethod)
    val me = arrayOf<String>()
    var last = 0L
    val date = LocalTime.now()

    val size = 1000
    for(i in 0..size) {
        val time = measureTimeMillis {
            world.execute(me)
        }
        out.reset()
        csvOutput.write("${file.nameWithoutExtension},$i,$time\n")



        println("Finished $i in: $time ms, time until end: ${date + Duration.ofMillis((size - i)*(time + last)/2 )}")
        csvOutput.flush()
        last = time
    }

    println()

    try {
        val time = measureTimeMillis {
            world.execute(me)
            println(out.toString("utf-8"))
        }

        println("Final completed in: ${time} ms")
    }catch (e: FrameSlotTypeException) {
        e.printStackTrace()
    }

}

/*
TODO: List
- Check if my symbolic evaluation is correct:
    - Done: Loops with receiving, If, IfElse, For, While, While inside another one, DoWhile, Recursion (fac, fib)
    - Todo: Closure

- Organize things in a better manner where: Done
    This way I can expose an API that both works from Polyglot and Looks like the standard C# Reflection API.
    Namespace -> Scope
    Type -> Type ( TruffleObject inside Scope )
    Method -> Method ( TruffleObject inside Type )

- Instead of merging blocks create new ones that will hold both the receiver and the giver. This way even support of many to many is possible: Too Complicated
- Compare CFG results with the ones obtained from ILSpy to verify my outputs: Done
- Implement method calling of static method that are from other classes: Done
- Implement support for structs in the begining all the structs are going to be on the heap and after I find a way to put them on the stack that is going to change. TruffleObjects will be used: Impossile
- Implement arrays same as prev: Done
- Implement objects and real methods: Done


- Check the control flow optimizations that ILSpy uses to detect loops
- Read about either the Relooper or the Stackifier algorithms so loops can be optimised with on stack replacement.
- Reimplement parts of mscorelib: Done

*/