package tests

import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Engine
import org.graalvm.polyglot.Source
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BytecodeRegressionTest {
    @Test
    fun pendingExceptionPrecedesLaterCall() {
        val source = Source.newBuilder("clr", """
            .assembly extern System.Runtime {}
            .assembly HelloWorld {}
            .module HelloWorld.dll
            .class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object
            {
              .method public static void Run() cil managed
              {
                .maxstack 3
                IL_0: ldc.i4.1
                IL_1: ldc.i4.0
                IL_2: div
                IL_3: ldc.i4.7
                IL_4: call void [System.Runtime]System.Console::WriteLine(int32)
                IL_5: pop
                IL_6: ret
              }
            }
        """.trimIndent(), "exception-order.il").build()
        val output = java.io.ByteArrayOutputStream()
        Context.newBuilder().allowAllAccess(true).out(output).build().use { context ->
            context.eval(source)
            val program = context.getBindings("clr").getMember("HelloWorld.Program")
            val run = program.getMember(program.memberKeys.single { it.contains("Run(") })
            val error = org.junit.jupiter.api.Assertions.assertThrows(org.graalvm.polyglot.PolyglotException::class.java) { run.execute() }
            org.junit.jupiter.api.Assertions.assertTrue(error.message.orEmpty().contains("/ by zero"))
            assertEquals("", output.toString("UTF-8"))
        }
    }

    @Test
    fun longExpressionUsesBoundedCompilerStack() {
        val instructions = buildString {
            appendLine("IL_0: ldc.i4.0")
            repeat(5000) { index ->
                appendLine("IL_${index * 2 + 1}: ldc.i4.1")
                appendLine("IL_${index * 2 + 2}: add")
            }
            appendLine("IL_10001: ret")
        }
        val source = Source.newBuilder("clr", """
            .assembly extern System.Runtime {}
            .assembly HelloWorld {}
            .module HelloWorld.dll
            .class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object
            {
              .method public static int32 Run() cil managed
              {
                .maxstack 2
                $instructions
              }
            }
        """.trimIndent(), "long-expression.il").build()
        Context.newBuilder().allowAllAccess(true).build().use { context ->
            context.eval(source)
            val program = context.getBindings("clr").getMember("HelloWorld.Program")
            assertEquals(5000, program.getMember(program.memberKeys.single { it.contains("Run(") }).execute().asInt())
        }
    }

    @Test
    fun repeatedEvaluationRetainsCompiledMethods() {
        val source = Source.newBuilder("clr", java.io.File("./test/boolean_local.il")).build()
        Context.newBuilder().allowAllAccess(true).out(java.io.ByteArrayOutputStream()).build().use { context ->
            repeat(2) {
                context.eval(source)
                val program = context.getBindings("clr").getMember("HelloWorld.Program")
                program.getMember(program.memberKeys.single { it.contains("Main(") }).execute(emptyArray<String>())
            }
        }
    }

    @Test
    fun lazyCompilationUsesTheOwningContext() {
        fun source(value: Int) = Source.newBuilder("clr", """
            .assembly extern System.Runtime {}
            .assembly HelloWorld {}
            .module HelloWorld.dll
            .class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object
            {
              .method public static int32 Value() cil managed
              {
                .maxstack 1
                IL_0: ldc.i4.$value
                IL_1: ret
              }
              .method public static int32 Run() cil managed
              {
                .maxstack 1
                IL_0: call int32 HelloWorld.Program::Value()
                IL_1: ret
              }
            }
        """.trimIndent(), "context-$value.il").build()

        Engine.create().use { engine ->
            Context.newBuilder().engine(engine).allowAllAccess(true).build().use { first ->
                Context.newBuilder().engine(engine).allowAllAccess(true).build().use { second ->
                    first.eval(source(1))
                    second.eval(source(2))
                    fun run(context: Context): Int {
                        val program = context.getBindings("clr").getMember("HelloWorld.Program")
                        return program.getMember(program.memberKeys.single { it.contains("Run(") }).execute().asInt()
                    }
                    assertEquals(1, run(first))
                    assertEquals(2, run(second))
                    assertEquals(1, run(first))
                }
            }
        }
    }
}
