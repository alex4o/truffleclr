import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.prompt
import com.github.ajalt.clikt.parameters.types.*
import com.oracle.truffle.api.frame.FrameSlotTypeException
import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Source
import java.io.ByteArrayOutputStream
import java.io.File
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

// TODO: Show the strange behaviour of mono

class App : CliktCommand(printHelpOnEmptyArgs = true) {
    private val file: File? by argument(help="The file to run").file(mustExist = true)
    private val `class`: String by option(help="The class containing the Main method").prompt("Class with Main method")

    override fun run() {
        val out = ByteArrayOutputStream()

        val context = Context.newBuilder().allowAllAccess(true).out(out).build()

        context.eval(
            Source.newBuilder(
                "clr",
                file
            ).build()
        )

        val bindings = context.getBindings("clr")
        val programClass = bindings.getMember(`class`)

        val mainMethod = programClass.memberKeys.find { it.contains("Main(") }
        val world = programClass.getMember(mainMethod)
        val me = arrayOf<String>()

        try {
            val time = measureTimeMillis {
                world.execute(me)
                println(out.toString("utf-8"))
            }
            println("Completed in: ${time}ms")
        }catch (e: FrameSlotTypeException) {
            e.printStackTrace()
        }
    }
}

fun main(args: Array<String>) {
    App().main(args)
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