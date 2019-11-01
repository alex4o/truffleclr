import com.oracle.truffle.api.CallTarget
import com.oracle.truffle.api.RootCallTarget
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo
import com.oracle.truffle.api.nodes.RootNode
import java.io.Reader
import java.util.*



class Env() {
    val stack = Stack<Int>()
}

@NodeInfo(language = "MyForth", description = "", shortName = "")
abstract class MyNode: Node() {
    abstract fun execute(env: VirtualFrame): Any
}

abstract class Word: MyNode() {
}

class Program(val nodes: List<MyNode>, frameDescriptor: FrameDescriptor): RootNode(null, frameDescriptor) {
    @ExplodeLoop
    override fun execute(frame: VirtualFrame): Any {
        for(node in nodes) {
            node.execute(frame)

        }
        return 0
    }
}


class NumberWord(val stack: Stack<Int>, val value: Int): Word() {
    override fun execute(frame: VirtualFrame): Any {
        stack.push(value)
        return value
    }
}


class IfWord(val stack: Stack<Int>, val then: Program, val e: Program): Word() {
    override fun execute(env: VirtualFrame): Any {
        if(stack.pop() == 0) {
            then.callTarget.call()
        }else{
            e.callTarget.call()
        }
    }
}

class NameWord(val name: String): Word() {
    override fun execute(frame: VirtualFrame): Any {

        return name
    }
}

class OpWord(val stack: Stack<Int>, val op: String): Word() {
    override fun execute(env: VirtualFrame): Any {
        if(op == ".") {
            println(stack.pop())
        }

        if(op == "+") {
            stack.push(stack.pop() + stack.pop())
        }

        if(op == "-") {
            stack.push(stack.pop() - stack.pop())
        }

        if(op == "=") {
            stack.push( stack.pop().compareTo(stack.pop()) )
        }

        return op

    }
}

class NopWord(): Word() {
    override fun execute(env: VirtualFrame): Any {
        return arrayOf<Int>()
    }
}

class WordParser(val stack: Stack<Int>) {
    fun parse(word: String): Word {

        if(word.matches(Regex("\\d*"))) {
            return NumberWord(stack, word.toInt() )
        }else if(word.matches(Regex("\\w*"))){
            return NameWord(word)
        }else if(word.matches(Regex("[-+*/.=!@]"))) {
            return OpWord(stack, word)
        }else{
            return NopWord()
        }
    }
}

class MyContext {

}

class MyLang : TruffleLanguage<MyContext>() {
    override fun createContext(env: Env?): MyContext {
        return MyContext()
    }

    override fun isObjectOfLanguage(o: Any?): Boolean {
        if(o is Word) {
            return true
        }else{
            return false
        }
    }
}

fun run() {
    val frameDescriptor = FrameDescriptor()


    val topFrame = Truffle.getRuntime().createVirtualFrame(
        arrayOf(), frameDescriptor
    )
    var env = Env()
    val parser = WordParser(env.stack)
    var running = true
    while(running) {
        val line = readLine()

        val program = Program(line!!.split(' ').map(String::trim).filter { !it.isEmpty() }.map(parser::parse), frameDescriptor)


        Truffle.getRuntime().createCallTarget(program).call()

    }
}

fun main(args: Array<String>) {
    println("Hello wolrd")
    run()
}