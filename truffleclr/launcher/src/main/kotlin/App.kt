import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Source
import org.graalvm.polyglot.Value
import org.graalvm.polyglot.impl.AbstractPolyglotImpl.AbstractContextImpl
import java.io.ByteArrayOutputStream
import java.io.File
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

//
//fun PolyglotContextImpl.myeval(languageId: String?, sourceImpl: Any): Value? {
//
//    val language: PolyglotLanguage = this.requirePublicLanguage(languageId)
//    val prev: Any = engine.enterIfNeeded(this)
//    val languageContext: PolyglotLanguageContext = getContext(language)
//        languageContext.checkAccess(null)
//        languageContext.ensureInitialized(null)
//        val source = sourceImpl as com.oracle.truffle.api.source.Source
//        val target = languageContext.parseCached(null, source, null)
//        val result = target.call(*PolyglotImpl.EMPTY_ARGS)
//        val hostValue: Value
//        hostValue = try {
//            languageContext.asValue(result)
//        } catch (e: NullPointerException) {
//            throw AssertionError(
//                String.format(
//                    "Language %s returned an invalid return value %s. Must be an interop value.",
//                    languageId,
//                    result
//                ), e
//            )
//        } catch (e: ClassCastException) {
//            throw AssertionError(
//                String.format(
//                    "Language %s returned an invalid return value %s. Must be an interop value.",
//                    languageId,
//                    result
//                ), e
//            )
//        }
//        if (source.isInteractive) {
//            PolyglotContextImpl.printResult(languageContext, result)
//        }
//        hostValue
//    } catch (e: Throwable) {
//        throw PolyglotImpl.wrapGuestException(languageContext, e)
//    } finally {
//        engine.leaveIfNeeded(prev, this)
//    }
//}


fun main() {
    val out = ByteArrayOutputStream()

    val context = Context.newBuilder().allowAllAccess(true).out(out).build()

    lateinit var requirePublicLanguage: KCallable<*>
    lateinit var getContext: KCallable<*>

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

//    val main = bindings.getMember("HelloWorld.Program::Main(string[])")
    val ProgramClass = bindings.getMember("HelloWorld.Program")

    println(ProgramClass.memberKeys)

    val main = ProgramClass.getMember("void Main(string[])")

    for(i in 0..2) {
        main.execute(0)
        out.reset()
        print("$i ")
    }
    println()

    val time = measureTimeMillis {
        main.execute(0)
        println(out.toString("utf-8"))
    }

    println("Completed in: ${time}ms")
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