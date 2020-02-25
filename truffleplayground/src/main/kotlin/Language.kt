package mylang

import com.oracle.truffle.api.CallTarget
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.`object`.Layout
import com.oracle.truffle.api.`object`.ObjectType
import com.oracle.truffle.api.`object`.Property
import com.oracle.truffle.api.debug.DebuggerTags
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.instrumentation.ProvidedTags
import com.oracle.truffle.api.instrumentation.StandardTags
import com.oracle.truffle.api.interop.InteropLibrary
import org.graalvm.polyglot.Value
import java.util.*
import kotlin.system.exitProcess

@TruffleLanguage.Registration(
    id = "test",
    name = "test",
    defaultMimeType = "application/test",
    characterMimeTypes = ["application/test"],
    contextPolicy = TruffleLanguage.ContextPolicy.SHARED,
    fileTypeDetectors = [TestFiledetector::class]
)
@ProvidedTags(
    StandardTags.CallTag::class,
    StandardTags.StatementTag::class,
    StandardTags.RootTag::class,
    StandardTags.RootBodyTag::class,
    StandardTags.ExpressionTag::class,
    DebuggerTags.AlwaysHalt::class
)
class Language : TruffleLanguage<Context>() {
    override fun createContext(env: Env?): Context {

        return Context(env!!)
    }

    override fun isObjectOfLanguage(`object`: Any?): Boolean {
        println("Obj of lang: $`object`")
        return false;
    }

    override fun parse(request: ParsingRequest?): CallTarget {

        val frameDescriptor = FrameDescriptor()
        val vars = mutableListOf<FrameSlot>()
        vars.add(frameDescriptor.findOrAddFrameSlot(0, FrameSlotKind.Object))
        vars.add(frameDescriptor.findOrAddFrameSlot(1, FrameSlotKind.Object))
        vars.add(frameDescriptor.findOrAddFrameSlot(2, FrameSlotKind.Object))
        vars.add(frameDescriptor.findOrAddFrameSlot(3, FrameSlotKind.Object))

        var stack = Stack<Int>()


        val l = Layout.createLayout()
        val alocator = l.createAllocator()
        alocator.locationForValue(5);


        val s = l.createShape(TestObject())
        val location = s.allocator().locationForValue(15)
        s.addProperty(Property.create("test", location, 0))

        val interopLibrary = InteropLibrary.getFactory().uncached

        val testValue = Value.asValue(TEEST())
        if(testValue.isProxyObject) {
            println("proxy")
        }
        if(testValue.isHostObject) {
            println("host")
        }

        println( testValue.hasMembers() )
        println( testValue.memberKeys )
        println( testValue.getMember("hello") )


        val t = Context.envg.lookupHostSymbol(TEEST::class.java.name)

        val aho = Context.envg.asGuestValue(TEEST())

        println(interopLibrary.getMembers(interopLibrary.instantiate(t)))

        val mems = interopLibrary.getMembers(t)
        for(i in 0 until interopLibrary.getArraySize(mems)) {
            println( interopLibrary.readArrayElement(mems, i)  )

        }

        println(interopLibrary.execute(interopLibrary.readMember(t, "test")))
        exitProcess(0)
        println( interopLibrary.readMember(aho, "hello") )



        val block = Block(
            arrayOf(
                SetLocal(vars[0], Const(12)),
                SetLocal(vars[1], New(s)),
                SetLocal(vars[2], Const(Context.envg.asGuestValue(TEEST()))),
                WriteKey(GetLocal(vars[1]), "hello", GetLocal(vars[0])),
                Print(ReadKey(GetLocal(vars[1]), "hello")),
                Print(ReadKey(GetLocal(vars[2]), "hello"))
            ), frameDescriptor, this
        )



        return Truffle.getRuntime().createCallTarget(block)
    }
}