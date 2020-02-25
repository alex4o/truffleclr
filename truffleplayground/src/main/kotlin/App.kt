package mylang


import com.oracle.truffle.api.CompilerAsserts
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.TruffleFile
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.`object`.DynamicObject
import com.oracle.truffle.api.`object`.Location
import com.oracle.truffle.api.`object`.ObjectType
import com.oracle.truffle.api.`object`.Shape
import com.oracle.truffle.api.dsl.Cached
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.UnknownIdentifierException
import com.oracle.truffle.api.library.CachedLibrary
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import com.oracle.truffle.api.nodes.*
import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Engine
import org.graalvm.polyglot.Source
import java.nio.charset.Charset

class TEEST {
    @JvmField
    var hello: Int = 33

    companion object {
        @JvmStatic
        fun test() {
            println("test")
        }
    }


    fun run() {
        println("lolo")
    }
}

@NodeInfo(language = "TestLang", description = "expression", shortName = "")
abstract class Expression : Node() {
    val context by lazy {
        lookupContextReference(Language::class.java).get()
    }

    abstract fun execute(env: VirtualFrame): Any
}

class Call(@Child var program: Block) : Expression() {
    var target = Truffle.getRuntime().createCallTarget(program)

    override fun execute(env: VirtualFrame): Any {
        var res = target.call()
        return res
    }
}

class Block(@Children val nodes: Array<Expression>, frameDescriptor: FrameDescriptor, langugae: TruffleLanguage<*>) :
    RootNode(langugae, frameDescriptor) {
    @ExplodeLoop
    override fun execute(frame: VirtualFrame): Any {
        lateinit var res: Any
        for (node in nodes) {
            res = node.execute(frame)
        }
        return res
    }
}



class Print(@Child var expression: Expression) : Expression() {
    override fun execute(env: VirtualFrame): Any {
        println(expression.execute(env))
        return 0
    }
}

class Const(val value: Any) : Expression() {
    override fun execute(env: VirtualFrame): Any {
        return value
    }

}

class SetLocal(val frameSlot: FrameSlot, @Child var expression: Expression) : Expression() {
    override fun execute(env: VirtualFrame): Any {
        return env.setObject(frameSlot, expression.execute(env))
    }
}

class GetLocal(val frameSlot: FrameSlot) : Expression() {
    override fun execute(env: VirtualFrame): Any {
        return env.getObject(frameSlot)
    }
}

class New(val shape: Shape) : Expression() {
    override fun execute(env: VirtualFrame): Any {
        return shape.newInstance()
    }
}

class WriteKey(@Child var o: Expression, val key: String, @Child var value: Expression) : Expression() {
    @Child
    var interopLib = InteropLibrary.getFactory().createDispatched(5)

    override fun execute(env: VirtualFrame): Any {
        return interopLib.writeMember(o.execute(env), key, value.execute(env))
    }

}

class ReadKey(@Child var o: Expression, val key: String) : Expression() {
    @Child
    var interopLib = InteropLibrary.getFactory().createDispatched(5)

    override fun execute(env: VirtualFrame): Any {
        return interopLib.readMember(o.execute(env), key)
    }

}

class Repeat(private var count: Int, @Child var program: Block) : Node(), RepeatingNode {

    override fun executeRepeating(frame: VirtualFrame): Boolean {
        program.execute(frame);
        count -= 1
        return count > 0
    }
}


class MyRep(count: Int, program: Block, frameDescriptor: FrameDescriptor) : RootNode(null, frameDescriptor) {
    var loopNode = Truffle.getRuntime().createLoopNode(Repeat(count, program))

    override fun execute(frame: VirtualFrame): Any? {
        loopNode.executeLoop(frame)
        return null
    }
}


class MyContext {

}

class MyFileDetector : TruffleFile.FileTypeDetector {
    override fun findMimeType(file: TruffleFile?): String? {
        return file?.name?.endsWith(".ml")?.let { ml ->
            if (ml) {
                return "application/mylang"
            } else {
                null
            }
        }
    }

    override fun findEncoding(file: TruffleFile?): Charset? {
        return null
    }

}

class Test(val i: Long = 0) {

    /* Overriding finalize method to check which object is garbage collected */
    @Throws(Throwable::class)
    protected fun finalize() {
        println("Test successfully garbage collected")
    }
}

fun main(args: Array<String>) {
    val engine = Engine.create()

    println(engine.languages)
    val context = Context.newBuilder().engine(engine).allowAllAccess(true).build();
    val init = context.initialize("test")
    context.eval(Source.create("test", ""))
//    engine.


}