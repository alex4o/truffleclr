package tests

import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Engine
import org.graalvm.polyglot.PolyglotException
import org.junit.jupiter.api.Test
import programSource
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.io.ByteArrayOutputStream
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.util.stream.Stream

class FullOutputTest {
    @DisplayName("Runs a program and compares its output line by line")
    @ParameterizedTest(name = "{0}")
    @MethodSource("testFiles")
    fun runFile(file: String, expectedName: String) {
        val output = testRunProgram(file, "HelloWorld.Program")
        val expected = Files.readAllLines(Paths.get("./test/expected/$expectedName.out"))

        println(output.joinToString("\n"))
        assertLinesEquals(expected, output)
    }

    @DisplayName("Rejects unsupported IL declarations with a clear error")
    @ParameterizedTest(name = "{0}")
    @MethodSource("rejectedFiles")
    fun rejectFile(file: String) {
        val expected = Files.readString(Paths.get("./test/rejected/$file.error")).trim()
        val failure = Assertions.assertThrows(org.graalvm.polyglot.PolyglotException::class.java) {
            testRunProgram("./test/rejected/$file.il", "HelloWorld.Program")
        }
        Assertions.assertTrue(failure.message.orEmpty().contains(expected), failure.message)
    }

    @Test
    fun nativeLoaderSurvivesClosedContextWithSharedEngine() {
        val source = programSource(File("./test/dll/native_loader_lifetime.dll"))
        Engine.create().use { engine ->
            Context.newBuilder("clr").engine(engine).allowAllAccess(true).build().use { second ->
                Context.newBuilder("clr").engine(engine).allowAllAccess(true).build().use { first ->
                    first.eval(source)
                    second.eval(source)
                    val program = first.getBindings("clr").getMember("HelloWorld.Program")
                    Assertions.assertEquals(42, program.getMember(program.memberKeys.single { it.contains("Good(") }).execute().asInt())
                }
                // This body has not been decoded in either context before the first closes.
                val program = second.getBindings("clr").getMember("HelloWorld.Program")
                Assertions.assertEquals("native: Български 漢字 😀",
                    program.getMember(program.memberKeys.single { it.contains("Lazy(") }).execute().asString())
                Assertions.assertEquals(42, program.getMember(program.memberKeys.single { it.contains("Good(") }).execute().asInt())
            }
        }
    }

    @Test
    fun nativeLoaderPublishesTypesAfterFailedSpecialization() {
        Context.newBuilder("clr").allowAllAccess(true).build().use { context ->
            context.eval(programSource(File("./test/dll/native_loader_lifetime.dll")))
            val program = context.getBindings("clr").getMember("HelloWorld.Program")
            val failure = Assertions.assertThrows(PolyglotException::class.java) {
                program.getMember(program.memberKeys.single { it.contains("Bad(") }).execute()
            }
            Assertions.assertTrue(failure.message.orEmpty().contains("Acos"), failure.message)
            // Good uses only the same closed Box<int> discovered before Bad failed.
            Assertions.assertEquals(42, program.getMember(program.memberKeys.single { it.contains("Good(") }).execute().asInt())
        }
    }

    @Test
    fun nativeLoaderRejectsGenericVariance() {
        val failure = Assertions.assertThrows(PolyglotException::class.java) {
            testRunProgram("./test/rejected/generic_variance.dll", "HelloWorld.Program")
        }
        Assertions.assertTrue(failure.message.orEmpty().contains("variance"), failure.message)
    }

    companion object {
        @JvmStatic
        fun rejectedFiles(): Stream<String> =
            Files.list(Paths.get("./test/rejected/")).filter { it.toString().endsWith(".il") }
                .map { it.fileName.toString().removeSuffix(".il") }

        @JvmStatic
        fun testFiles(): Stream<Arguments> {
            return Files.list(Paths.get("./test/expected/"))
                .filter { Files.isRegularFile(it) && it.toString().endsWith(".out") }
                .sorted()
                .flatMap {
                    val name = it.fileName.toString().removeSuffix(".out")
                    Stream.of("./test/dll/$name.dll", "./test/$name.il")
                        .filter { path -> Files.isRegularFile(Paths.get(path)) }
                        .map { path -> Arguments.of(path, name) }
                }
        }
    }
}

var builder =  Context.newBuilder().allowAllAccess(true)
fun testRunProgram(file: String, klass: String, args: Array<String> = arrayOf()): List<String> {
    val out = ByteArrayOutputStream()

    builder.out(out).build().use { context ->
        context.eval(programSource(File(file)))
        val ProgramClass = context.getBindings("clr").getMember(klass)
        val mainMethod = ProgramClass.memberKeys.find { it.contains("<Main>(") }
            ?: ProgramClass.memberKeys.find { it.contains("Main(") }
        ProgramClass.getMember(mainMethod).execute(args)
    }
    return out.toString("utf-8").removeSuffix("\n").lines()
}

fun assertLinesEquals(expected: Iterable<String>, output: Iterable<String>) {
    Assertions.assertEquals(expected.count(), output.count(), "Output line count")
    expected.zip(output).forEachIndexed() { line, (expectedLine, outpuLine) ->
        Assertions.assertEquals(expectedLine, outpuLine, "Error on line $line")
    }
}