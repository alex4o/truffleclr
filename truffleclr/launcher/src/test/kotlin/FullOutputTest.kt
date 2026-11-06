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
import java.net.URLClassLoader
import java.nio.file.attribute.PosixFilePermissions
import java.util.concurrent.TimeUnit
import java.util.zip.CRC32
import parser.dll.NativeDll
import org.junit.jupiter.api.Assumptions

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
    fun nativeLoaderRejectsRepeatedFailedSpecialization() {
        Context.newBuilder("clr").allowAllAccess(true).build().use { context ->
            context.eval(programSource(File("./test/dll/publication_failure.dll")))
            val program = context.getBindings("clr").getMember("HelloWorld.Program")
            fun call(name: String) = program.getMember(program.memberKeys.single { it.contains("$name(") }).execute()
            Assertions.assertEquals(42, call("Good").asInt())
            for (name in listOf("First", "Second")) {
                val failure = Assertions.assertThrows(PolyglotException::class.java) { call(name) }
                Assertions.assertTrue(failure.message.orEmpty().contains("Generic virtual methods are unsupported"), failure.message)
            }
            Assertions.assertEquals(42, call("Good").asInt())
        }
    }

    @Test
    fun nativeLoaderRejectsGenericVariance() {
        val failure = Assertions.assertThrows(PolyglotException::class.java) {
            testRunProgram("./test/rejected/generic_variance.dll", "HelloWorld.Program")
        }
        Assertions.assertTrue(failure.message.orEmpty().contains("variance"), failure.message)
    }

    @Test
    fun nativeLoaderMaterializesUnrelatedHostTypeOnDemand() {
        Context.newBuilder("clr").allowAllAccess(true).build().use { context ->
            context.eval(programSource(File("./test/dll/native_loader_lazy.dll")))
            val bindings = context.getBindings("clr")
            // Enumerating the index must not materialize the unused malformed type.
            Assertions.assertTrue(bindings.memberKeys.containsAll(listOf("HelloWorld.Unrelated", "HelloWorld.Recursive")))
            val program = bindings.getMember("HelloWorld.Program")
            Assertions.assertEquals(7, program.getMember(program.memberKeys.single { it.contains("Main(") }).execute().asInt())
            val unrelated = bindings.getMember("HelloWorld.Unrelated")
            Assertions.assertEquals(42, unrelated.getMember(unrelated.memberKeys.single { it.contains("Answer(") }).execute().asInt())
        }
    }

    @ParameterizedTest
    @org.junit.jupiter.params.provider.ValueSource(booleans = [false, true])
    fun nativeLoaderFailsClosedAfterTypeLayoutFailure(bodyFirst: Boolean) {
        Context.newBuilder("clr").allowAllAccess(true).build().use { context ->
            context.eval(programSource(File("./test/dll/native_loader_lazy.dll")))
            val bindings = context.getBindings("clr")
            val program = bindings.getMember("HelloWorld.Program")
            val touchBad = program.getMember(program.memberKeys.single { it.contains("TouchBad(") })
            Assertions.assertEquals(7, program.getMember(program.memberKeys.single { it.contains("Main(") }).execute().asInt())
            fun assertLayoutFailure(action: () -> Unit) {
                val failure = Assertions.assertThrows(PolyglotException::class.java, action)
                Assertions.assertTrue(failure.message.orEmpty().contains("Recursive value-type layout"), failure.message)
            }
            if (bodyFirst) assertLayoutFailure { touchBad.execute() }
            else assertLayoutFailure { bindings.getMember("HelloWorld.Recursive") }
            // Runtime refresh inserted this shape before detecting its recursive field.
            assertLayoutFailure { bindings.getMember("HelloWorld.Recursive") }
            // This method value was published before failure, but its body is still lazy.
            assertLayoutFailure { touchBad.execute() }
        }
    }

    @Test
    fun nativeLoaderRejectsDirectRvaStorageAccess() {
        Context.newBuilder("clr").allowAllAccess(true).build().use { context ->
            context.eval(programSource(File("./test/dll/native_loader_lazy.dll")))
            val program = context.getBindings("clr").getMember("HelloWorld.Program")
            val failure = Assertions.assertThrows(PolyglotException::class.java) {
                program.getMember(program.memberKeys.single { it.contains("ReadRva(") }).execute()
            }
            Assertions.assertTrue(failure.message.orEmpty().contains("Runtime storage for RVA field is unsupported"), failure.message)
        }
    }

    @Test
    fun nativeLoaderRejectsWritableCachedLibraryInFreshJvm() {
        val home = Files.createTempDirectory("truffleclr-cache-test-")
        try {
            Assumptions.assumeTrue(home.fileSystem.supportedFileAttributeViews().contains("posix"))
            val name = System.mapLibraryName("dllreader")
            val bytes = NativeDll::class.java.getResourceAsStream("/native/$name")!!.use { it.readAllBytes() }
            val checksum = CRC32().apply { update(bytes) }
            val directory = home.resolve(".truffleclr/native/" + java.lang.Long.toHexString(checksum.value) + "-" + bytes.size)
            Files.createDirectories(directory, PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rwx------")))
            val cached = Files.write(directory.resolve(name), bytes)
            Files.setPosixFilePermissions(cached, PosixFilePermissions.fromString("rw-rw----"))
            // Gradle's worker java.class.path alone omits the test runtime URLs.
            val classpath = (System.getProperty("java.class.path").split(File.pathSeparator) +
                generateSequence(javaClass.classLoader) { it.parent }.filterIsInstance<URLClassLoader>()
                    .flatMap { it.urLs.asSequence() }.map { File(it.toURI()).path }.toList())
                .distinct().joinToString(File.pathSeparator)
            val log = home.resolve("launcher.log").toFile()
            val process = ProcessBuilder(
                File(System.getProperty("java.home"), "bin/java").path,
                "--enable-native-access=ALL-UNNAMED", "--sun-misc-unsafe-memory-access=allow",
                "-Duser.home=$home", "-Dclr.traceLoading=true", "-cp", classpath,
                "AppKt", "--class", "HelloWorld.Program", "./test/dll/loop.dll"
            ).redirectErrorStream(true).redirectOutput(log).start()
            try {
                Assertions.assertTrue(process.waitFor(60, TimeUnit.SECONDS), "Launcher timed out; see $log")
                val output = log.readText()
                Assertions.assertEquals(0, process.exitValue(), output)
                Assertions.assertTrue(output.contains("native cache unavailable: Writable native cache file:"), output)
                Assertions.assertEquals(File("./test/expected/loop.out").readLines(), output.lines().filter { it == "Hello" })
                Assertions.assertTrue(output.contains("Completed in:"), output)
                Assertions.assertArrayEquals(bytes, Files.readAllBytes(cached))
                Assertions.assertEquals(PosixFilePermissions.fromString("rw-rw----"), Files.getPosixFilePermissions(cached),
                    "The loader must leave the unsafe cache entry untouched")
            } finally {
                if (process.isAlive) process.destroyForcibly().waitFor()
            }
        } finally {
            home.toFile().deleteRecursively()
        }
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