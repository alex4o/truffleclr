package tests

import org.graalvm.polyglot.Context
import org.graalvm.polyglot.PolyglotException
import org.graalvm.polyglot.Source
import org.graalvm.polyglot.Value
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.File

/** End-to-end host accesses exercise the same IL fixtures as FullOutputTest. */
class StaticObjectInteropTest {
    private fun load(context: Context, fixture: String): Value {
        context.eval(Source.newBuilder("clr", File("test/$fixture.il")).build())
        return context.getBindings("clr").getMember("HelloWorld.Program")
    }

    private fun call(type: Value, name: String): Value =
        type.getMember(type.memberKeys.single { it.contains("::$name(") }).execute()

    @Test
    fun fixedLayoutMembers() {
        Context.newBuilder().allowAllAccess(true).build().use { context ->
            val program = load(context, "typed_fields")
            val instance = call(program, "CreateFields")
            assertFalse(instance.getMember("Flag").asBoolean())
            instance.putMember("Flag", true)
            assertTrue(instance.getMember("Flag").asBoolean())
            instance.putMember("Character", "Z")
            assertEquals("Z", instance.getMember("Character").asString())
            instance.putMember("SignedInt", 42)
            assertEquals(42, instance.getMember("SignedInt").asInt())
            instance.putMember("Next", call(program, "CreateFields"))
            assertEquals(0, instance.getMember("Next").getMember("SignedInt").asInt())
            assertFalse(instance.hasMember("Missing"))
            assertThrows(UnsupportedOperationException::class.java) { instance.putMember("Missing", 1) }
            assertThrows(UnsupportedOperationException::class.java) { instance.removeMember("Flag") }
            assertThrows(IllegalArgumentException::class.java) { instance.putMember("SignedInt", "bad") }
        }
    }

    @Test
    fun failedInitializerIsNotRetried() {
        Context.newBuilder().allowAllAccess(true).build().use { context ->
            val program = load(context, "static_initialization")
            repeat(2) {
                assertThrows(PolyglotException::class.java) { call(program, "TryFailure") }
                assertEquals(1, call(program, "FailureAttempts").asInt())
            }
        }
    }

    @Test
    fun hostMethodEntryInitializesType() {
        val output = ByteArrayOutputStream()
        Context.newBuilder().allowAllAccess(true).out(output).build().use { context ->
            load(context, "static_initialization")
            val type = context.getBindings("clr").getMember("HelloWorld.MethodOnly")
            call(type, "Run")
            call(type, "Run")
            assertEquals("500\n501\n501\n", output.toString("UTF-8"))
        }
    }
}
