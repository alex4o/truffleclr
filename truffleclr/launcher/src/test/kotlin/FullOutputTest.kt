import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
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