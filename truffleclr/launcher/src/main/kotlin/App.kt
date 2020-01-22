import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Source
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
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
    val out = ByteArrayOutputStream()

    val context = Context.newBuilder().allowAllAccess(true).out(out).build()


//    val cpart = context.eval(
//        Source.newBuilder(
//            "llvm",
//            File("./test.bc")
//        ).build()
//    )
//
//    println(cpart.getMember("fac").execute(10));
//    exitProcess(0)

        var execution = context.eval(
            Source.newBuilder(
                "trufflecrl",
//                    File("./test/func.il")
                File("./test/func_fib.il")
            ).build()
        )

//        execution.getMember("main");

        println(
            execution
        )

    val bindings = context.getBindings("trufflecrl")
    val members = bindings.memberKeys
    println(members)

    val main = bindings.getMember("HelloWorld.Program::Main(string[])")

    for(i in 0..2) {
        main.execute()
        out.reset()
        print("$i ")
    }
    println()

    val time = measureTimeMillis {
        main.execute()
        println(out.toString("utf-8"))
    }

    println("Completed in: ${time}")
}

/*
TODO: List
- Check if my symbolic evaluation is correct:
    - Done: If, IfElse, For, While, While inside another one, DoWhile, Recursion (fac, fib)
    - Todo: Closure, Loops with receiving.

- Organize things in a better manner where
    This way I can expose an API that both works from Polyglot and Looks like the standard C# Reflection API.
    Namespace -> Scope
    Type -> Type ( TruffleObject inside Scope )
    Method -> Method ( TruffleObject inside Type )

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