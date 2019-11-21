package mylang

import Cil.CilBaseListener
import Cil.CilLexer
import Cil.CilParser
import com.oracle.truffle.api.*
import com.oracle.truffle.api.debug.DebuggerTags
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.instrumentation.ProvidedTags
import com.oracle.truffle.api.instrumentation.StandardTags
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.nodes.*
import org.graalvm.polyglot.Source
import org.graalvm.polyglot.Context
import java.io.Reader
import java.nio.charset.Charset
import java.util.*
import com.oracle.truffle.api.library.ExportMessage
import com.oracle.truffle.api.frame.FrameSlotKind
import com.oracle.truffle.api.frame.FrameUtil
import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.dsl.NodeField


import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.TokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.Tree
import sun.misc.Unsafe
import java.io.FileReader
import kotlin.system.exitProcess


@NodeField(name = "slot", type = FrameSlot::class)
abstract class SLReadLocalVariableNode() : Node() {

    @CompilationFinal
    protected var slot: FrameSlot? = null

    public abstract fun execute(frame: VirtualFrame): Any

    @Specialization(guards = ["isLong(frame)"])
    protected fun readLong(frame: VirtualFrame): Long {
        /*
         * When the FrameSlotKind is Long, we know that only primitive long values have ever been
         * written to the local variable. So we do not need to check that the frame really contains
         * a primitive long value.
         */
        return FrameUtil.getLongSafe(frame, slot)
    }

    @Specialization(guards = ["isBoolean(frame)"])
    protected fun readBoolean(frame: VirtualFrame): Boolean {
        return FrameUtil.getBooleanSafe(frame, slot)
    }

    @Specialization(replaces = ["readLong", "readBoolean"])
    protected fun readObject(frame: VirtualFrame): Any {
        if (!frame.isObject(slot)) {
            /*
             * The FrameSlotKind has been set to Object, so from now on all writes to the local
             * variable will be Object writes. However, now we are in a frame that still has an old
             * non-Object value. This is a slow-path operation: we read the non-Object value, and
             * write it immediately as an Object value so that we do not hit this path again
             * multiple times for the same variable of the same frame.
             */
            CompilerDirectives.transferToInterpreter()
            val result = frame.getValue(slot)
            frame.setObject(slot, result)
            return result
        }

        return FrameUtil.getObjectSafe(frame, slot)
    }

    /**
     * Guard function that the local variable has the type `long`.
     *
     * @param frame The parameter seems unnecessary, but it is required: Without the parameter, the
     * Truffle DSL would not check the guard on every execution of the specialization.
     * Guards without parameters are assumed to be pure, but our guard depends on the
     * slot kind which can change.
     */
    protected fun isLong(frame: VirtualFrame): Boolean {
        return frame.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Long
    }

    protected fun isBoolean(frame: VirtualFrame): Boolean {
        return frame.frameDescriptor.getFrameSlotKind(slot) == FrameSlotKind.Boolean
    }
}


class Env() {
    val stack = Stack<Int>()
}

@NodeInfo(language = "MyForth", description = "", shortName = "")
abstract class MyNode : Node() {
    abstract fun execute(env: VirtualFrame): Any?
}

abstract class Word : MyNode() {
}

class Call(@Child var program: Program) : MyNode() {
    var target = Truffle.getRuntime().createCallTarget(program)

    override fun execute(env: VirtualFrame): Any? {
        var res = target.call()
        return res
    }
}

class Program(@Children val nodes: Array<MyNode>, frameDescriptor: FrameDescriptor) : RootNode(null, frameDescriptor) {
    @ExplodeLoop
    override fun execute(frame: VirtualFrame): Any {
        for (node in nodes) {
            node.execute(frame)

        }
        return 0
    }

//    @ExportMessage
//    fun isExecutable(): Boolean {
//        return true
//    }
}


class NumberWord(val stack: Stack<Int>, val value: Int) : Word() {
    override fun execute(frame: VirtualFrame): Any {
        stack.push(value)
        return value
    }
}


class IfWord(val stack: Stack<Int>, val then: Program, val e: Program) : Word() {
    override fun execute(env: VirtualFrame) {
        if (stack.pop() == 0) {
            then.callTarget.call()
        } else {
            e.callTarget.call()
        }
    }
}

class NameWord(val name: String) : Word() {
    override fun execute(frame: VirtualFrame): Any {

        return name
    }
}

enum class Op {
    Add,
    Sub,
    Mul,
    Div,
    Print,
    Eq,
    Nop;


}


class OpWord(val stack: Stack<Int>, val op: Op) : Word() {
    override fun execute(env: VirtualFrame): Any {
        when (op) {
            Op.Add -> stack.push(stack.pop() + stack.pop())
            Op.Sub -> stack.push(stack.pop() - stack.pop())
            Op.Mul -> TODO()
            Op.Div -> TODO()
            Op.Print -> {
                stack.pop()
//                print(" ")
            }
            Op.Eq -> stack.push(stack.pop().compareTo(stack.pop()))
            Op.Nop -> {
            }
        }

        return op

    }
}

class NopWord() : Word() {
    override fun execute(env: VirtualFrame): Any {
        return arrayOf<Int>()
    }
}

class WordParser(val stack: Stack<Int>) {
    fun stringToOp(name: String): Op {
        return when (name) {
            "+" -> Op.Add
            "-" -> Op.Sub
            "." -> Op.Print
            "=" -> Op.Eq
            else -> Op.Nop
        }
    }


    fun parse(word: String): Word {

        if (word.matches(Regex("\\d*"))) {
            return NumberWord(stack, word.toInt())
        } else if (word.matches(Regex("\\w*"))) {
            return NameWord(word)
        } else if (word.matches(Regex("[-+*/.=!@]"))) {
            return OpWord(stack, stringToOp(word))
        } else {
            return NopWord()
        }
    }
}


class Repeat(private val count: Int, @Child var program: MyNode) : Node(), RepeatingNode {

    override fun executeRepeating(frame: VirtualFrame): Boolean {
        program.execute(frame);
//        count -= 1
        print()
        return count > 0
    }

    @CompilerDirectives.TruffleBoundary
    fun print() {
        print(this)
        print(": ")
        println(count)
    }
}


class MyRep(count: Int, program: MyNode, frameDescriptor: FrameDescriptor) : RootNode(null, frameDescriptor) {
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

@TruffleLanguage.Registration(
    id = "mylang",
    name = "ml",
    defaultMimeType = "application/ml",
    characterMimeTypes = ["application/ml"],
    contextPolicy = TruffleLanguage.ContextPolicy.SHARED,
    fileTypeDetectors = [MyFileDetector::class]
)
@ProvidedTags(
    StandardTags.CallTag::class,
    StandardTags.StatementTag::class,
    StandardTags.RootTag::class,
    StandardTags.RootBodyTag::class,
    StandardTags.ExpressionTag::class,
    DebuggerTags.AlwaysHalt::class
)
open class MyLang : TruffleLanguage<MyContext>() {
    override fun createContext(env: Env?): MyContext {
        return MyContext()
    }

    override fun isObjectOfLanguage(o: Any?): Boolean {
        if (o is Word) {
            return true
        } else {
            return false
        }
    }

//    override fun parse(request: ParsingRequest?): CallTarget {
//
//
//    }
}

fun run() {
    val frameDescriptor = FrameDescriptor()

    val topFrame = Truffle.getRuntime().createVirtualFrame(
        arrayOf(), frameDescriptor
    )
    var env = Env()
    val parser = WordParser(env.stack)
    var running = true
    while (running) {
        val line = readLine()

        val program = Program(
            line!!.split(' ').map(String::trim).filter { !it.isEmpty() }.map(parser::parse).toTypedArray(),
            frameDescriptor
        )


        var target = Truffle.getRuntime().createCallTarget(program)


        target.call()

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
//    var field = Unsafe::class.java.getDeclaredField("theUnsafe")
//
//    field.setAccessible(true);
//    var unsafe = field.get(null) as Unsafe
//
//    var stack = arrayOfNulls<Any>(5)
////    var stack = IntArray(5)
//
//
//    stack[1] = 99
//
//    unsafe.putLong(stack, 16L, 100)
//
//    var a: Test? = Test(15)
//
//    unsafe.putOrderedObject(stack, 20L, a)
//
//    for(i in 16L until 28L ) {
//        var char = unsafe.getByteVolatile(stack, i)
//        print("$char ")
//
//    }
//    println()
//
////    unsafe.getAndSetObject(stack, 0, a);
////    println(unsafe.getAndSetLong(stack, 0, 0))
//
//    for(item in stack) {
//        print("$item ")
//    }
//    println()
//
//    a = null
//
//    System.gc()
//    System.runFinalization()
//
//    println((unsafe.getObject(stack, 20L) as Test).i)

//    exitProcess(0);
//    var reader = FileReader("/home/alex4o/test.il");
//
//    var stream = CharStreams.fromReader(reader, "useless");
//    var lexer = CilLexer(stream)
//
//    val tstream = CommonTokenStream(lexer);
//
//    var parser = CilParser(tstream)
//    var tree: ParseTree = parser.decls()
//
//    for(index in 0 until tree.childCount) {
//        var child: ParseTree = tree.getChild(index)
//        ParseTreeWalker.DEFAULT.walk(object : CilBaseListener() {
//            override fun enterDecls(ctx: CilParser.DeclsContext?) {
//                println("ENTER decls")
//            }
//
//            override fun enterNamespace(ctx: CilParser.NamespaceContext) {
//                println("ENTER: namespace " + ctx.nameSpaceHead().dottedName.text)
//            }
//
//            override fun exitNamespace(ctx: CilParser.NamespaceContext) {
//                println("EXIT: " + ctx.nameSpaceHead().dottedName.text)
//            }
//
//            override fun enterClass(ctx: CilParser.ClassContext) {
//                println("ENTER: class " + ctx.classHead().classHeadBegin().dottedName.text)
//                ctx.classHead().classHeadBegin().classAttr()
//            }
//
//            override fun exitClass(ctx: CilParser.ClassContext) {
//                println("EXIT: " + ctx.classHead().classHeadBegin().dottedName.text)
//
//            }
//
//        }, child);
//    }
//
////    tree.accept(NamespaceVisitor(Global.getNamespace("global")))
////    parser.parseListeners.add()
//
//
//
//
//
//    exitProcess(0);
//
    val frameDescriptor = FrameDescriptor()
    var repeatDescriptor = FrameDescriptor()

    var counter = repeatDescriptor.findOrAddFrameSlot("counter", 0, FrameSlotKind.Int)

    var stack = Stack<Int>()


    val program = Program(
        arrayOf(
            NumberWord(stack, 4),
            NumberWord(stack, 6),
            NumberWord(stack, 9),
            OpWord(stack, Op.Add),
            OpWord(stack, Op.Add),
            OpWord(stack, Op.Print)
        ), frameDescriptor
    )

    val loop = MyRep(4, Call(program), repeatDescriptor)


//    read.execute()

    var target = Truffle.getRuntime().createCallTarget(loop)
    target.call()
}