import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Source
import org.junit.jupiter.api.Assertions
import java.io.ByteArrayOutputStream
import java.io.File

var builder =  Context.newBuilder().allowAllAccess(true)
fun testRunProgram(file: String, klass: String, method: String, args: Array<String> = arrayOf()): List<String> {
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
    val main = ProgramClass.getMember(method)

    main.execute(args)
    context.close()
    return out.toString("utf-8").lines()
}

fun assertLinesEquals(expected: Iterable<String>, output: Iterable<String>) {
    expected.zip(output).forEachIndexed() { line, (expectedLine, outpuLine) ->
        Assertions.assertEquals(expectedLine, outpuLine, "Error on line $line")
    }
}
