package tests

import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Source
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.io.ByteArrayOutputStream
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.util.stream.Stream

class FullOutputTest {
    @DisplayName("Runs a program and compares its output line by line")
    @ParameterizedTest(name = "{0}.il")
    @MethodSource("testFiles")
    fun runFile(file: String) {
        val output = testRunProgram("./test/$file.il", "HelloWorld.Program")
        val expected = Files.readAllLines(Paths.get("./test/expected/$file.out"))

        println(output.joinToString("\n"))
        assertLinesEquals(expected, output)
    }

    @org.junit.jupiter.api.Test
    fun rejectsIncompatibleArrayAddress() {
        val failure = Assertions.assertThrows(org.graalvm.polyglot.PolyglotException::class.java) {
            testRunProgram("./test/array_address_mismatch.il", "HelloWorld.Program")
        }
        Assertions.assertTrue(failure.message.orEmpty().contains("ManagedReference\$ArrayTypeMismatchException"), failure.message)
    }

    companion object {
        @JvmStatic
        fun testFiles(): Stream<String> {
            return Files.walk(Paths.get("./test/expected/")).filter { Files.isRegularFile(it) }
                .map { it.fileName.toString().replace(".out", "") }
        }
    }
}

var builder =  Context.newBuilder().allowAllAccess(true)
fun testRunProgram(file: String, klass: String, args: Array<String> = arrayOf()): List<String> {
    val out = ByteArrayOutputStream()

    builder.out(out).build().use { context ->
        context.eval(Source.newBuilder("clr", File(file)).build())
        val ProgramClass = context.getBindings("clr").getMember(klass)
        val mainMethod = ProgramClass.memberKeys.find { it.contains("Main(") }
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