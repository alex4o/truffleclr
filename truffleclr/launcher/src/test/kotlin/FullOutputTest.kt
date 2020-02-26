package tests

import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Source
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.io.ByteArrayOutputStream
import java.io.File
import java.nio.file.FileVisitOption
import java.nio.file.Files
import java.nio.file.Paths
import java.util.stream.Stream

class FullOutputTest {
    @DisplayName("Runs a program and compares its output line by line")
    @ParameterizedTest(name = "{0}.il")
    @MethodSource("testFiles")
    fun runFile(file: String) {
        val output = testRunProgram("./test/$file.il", "HelloWorld.Program")
        val expected = Files.readAllLines(Paths.get("./test/out/$file.out"))

        assertLinesEquals(expected, output)
    }

    companion object {
        @JvmStatic
        fun testFiles(): Stream<String> {
            return Files.walk(Paths.get("./test/out/")).filter { Files.isRegularFile(it) }
                .map { it.fileName.toString().replace(".out", "") }
        }
    }
}

var builder =  Context.newBuilder().allowAllAccess(true)
fun testRunProgram(file: String, klass: String, args: Array<String> = arrayOf()): List<String> {
    val out = ByteArrayOutputStream()

    val context = builder.out(out).build()

    var execution = context.eval(
        Source.newBuilder(
            "clr",
            File(file)
        ).build()
    )

    val bindings = context.getBindings("clr")
    val ProgramClass = bindings.getMember(klass)

    val mainMethod = ProgramClass.memberKeys.find { it.contains("Main(") }
    val main = ProgramClass.getMember(mainMethod)

    main.execute(args)
    context.close()
    return out.toString("utf-8").lines()
}

fun assertLinesEquals(expected: Iterable<String>, output: Iterable<String>) {
    expected.zip(output).forEachIndexed() { line, (expectedLine, outpuLine) ->
        Assertions.assertEquals(expectedLine, outpuLine, "Error on line $line")
    }
}