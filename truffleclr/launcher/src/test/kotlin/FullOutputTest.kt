import org.junit.jupiter.api.Test
import java.nio.file.Files
import java.nio.file.Paths

class FullOutputTest {
    @Test
    fun condition() {
        val output = testRunProgram("./test/cond.il", "HelloWorld.Program", "System.Void HelloWorld.Program::Main(System.String[])")
        val expected = Files.readAllLines(Paths.get("./test/out/cond.out"))

        assertLinesEquals(expected, output)
    }

    @Test
    fun compareLowerThen() {
        val output = testRunProgram("./test/op_clt.il", "HelloWorld.Program", "System.Void HelloWorld.Program::Main(System.String[])")
        val expected = Files.readAllLines(Paths.get("./test/out/op_clt.out"))

        assertLinesEquals(expected, output)
    }

    @Test
    fun loop() {
        val output = testRunProgram("./test/loop.il", "HelloWorld.Program", "System.Void HelloWorld.Program::Main(System.String[])")
        val expected = Files.readAllLines(Paths.get("./test/out/loop.out"))

        assertLinesEquals(expected, output)
    }

    @Test
    fun loopP() {
        val output = testRunProgram("./test/loop_p.il", "HelloWorld.Program", "System.Void HelloWorld.Program::Main(System.String[])")
        val expected = Files.readAllLines(Paths.get("./test/out/loop_p.out"))

        assertLinesEquals(expected, output)
    }

    @Test
    fun loop2() {
        val output = testRunProgram("./test/loop2.il", "HelloWorld.Program", "System.Void HelloWorld.Program::Main(System.String[])")
        val expected = Files.readAllLines(Paths.get("./test/out/loop2.out"))

        assertLinesEquals(expected, output)
    }

    @Test
    fun doWhile() {
        val output = testRunProgram("./test/do_while.il", "HelloWorld.Program", "System.Void HelloWorld.Program::Main(System.String[])")
        val expected = Files.readAllLines(Paths.get("./test/out/do_while.out"))

        assertLinesEquals(expected, output)
    }

    @Test
    fun read() {
        val output = testRunProgram("./test/read_p.il", "HelloWorld.Program", "System.Void HelloWorld.Program::Main(System.String[])")
        val expected = Files.readAllLines(Paths.get("./test/out/read_p.out"))

        assertLinesEquals(expected, output)
    }

    @Test
    fun `while`() {
        val output = testRunProgram("./test/while.il", "HelloWorld.Program", "System.Void HelloWorld.Program::Main(System.String[])")
        val expected = Files.readAllLines(Paths.get("./test/out/while.out"))

        assertLinesEquals(expected, output)
    }

    @Test
    fun whileIf() {
        val output = testRunProgram("./test/while_if.il", "HelloWorld.Program", "System.Void HelloWorld.Program::Main(System.String[])")
        val expected = Files.readAllLines(Paths.get("./test/out/while_if.out"))
        assertLinesEquals(expected, output)
    }

    @Test
    fun breakContinue() {
        val output = testRunProgram("./test/break_continue.il", "HelloWorld.Program", "System.Void HelloWorld.Program::Main(System.String[])")
        val expected = Files.readAllLines(Paths.get("./test/out/break_continue.out"))
        assertLinesEquals(expected, output)
    }

    @Test
    fun funcFac() {
        val output = testRunProgram("./test/func.il", "HelloWorld.Program", "System.Void HelloWorld.Program::Main(System.String[])")
        val expected = Files.readAllLines(Paths.get("./test/out/func.out"))
        assertLinesEquals(expected, output)
    }

    @Test
    fun funcFib() {
        val output = testRunProgram("./test/func_fib.il", "HelloWorld.Program", "System.Void HelloWorld.Program::Main(System.String[])")
        val expected = Files.readAllLines(Paths.get("./test/out/func_fib.out"))
        assertLinesEquals(expected, output)
    }

    @Test
    fun funcFacNew() {
        val output = testRunProgram("./test/func_fac_new.il", "HelloWorld.Program", "System.Void HelloWorld.Program::Main(System.String[])")
        val expected = Files.readAllLines(Paths.get("./test/out/func_fac_new.out"))
        assertLinesEquals(expected, output)
    }

    @Test
    fun array() {
        val output = testRunProgram("./test/array.il", "HelloWorld.Program", "System.Void HelloWorld.Program::Main()")
        val expected = Files.readAllLines(Paths.get("./test/out/array.out"))
        assertLinesEquals(expected, output)
    }

    @Test
    fun nqueen() {
        val output = testRunProgram("./test/nqueen.il", "HelloWorld.Program", "System.Void HelloWorld.Program::Main()")
        val expected = Files.readAllLines(Paths.get("./test/out/nqueen.out"))
        assertLinesEquals(expected, output)
    }
}