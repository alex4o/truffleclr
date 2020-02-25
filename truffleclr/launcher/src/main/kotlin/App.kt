import com.oracle.truffle.api.TruffleException
import com.oracle.truffle.api.frame.FrameSlotTypeException
import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Source
import org.graalvm.polyglot.Value
import org.graalvm.polyglot.impl.AbstractPolyglotImpl.AbstractContextImpl
import java.io.ByteArrayOutputStream
import java.io.File
import java.lang.Exception
import kotlin.reflect.KCallable
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
//    for(member in context::class.members) {
//        if(member.name.contains("requirePublicLanguage")) {
//            requirePublicLanguage = member
//        }
//
//        if(member.name.contains("getContext")) {
//
//        }
//    }

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
                "clr",
                File("./test/car_simple.il")
            ).build()
        )

        println(
            execution
        )

    val bindings = context.getBindings("clr")
    val ProgramClass = bindings.getMember("HelloWorld.Program")
    println(bindings.getMember("HelloWorld.Car").memberKeys)

    val mainMethod = ProgramClass.memberKeys.find { it.contains("Main(") }
    val main = ProgramClass.getMember(mainMethod)

//    for(i in 0..2) {
//        val time = measureTimeMillis {
//            main.execute(0)
//            out.reset()
//        }
//        println("Step #$i completed in: ${time}ms")
//    }
//    println()

        val time = measureTimeMillis {
            main.execute(0)
            println(out.toString("utf-8"))
        }
        println("Final completed in: ${time}ms")


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