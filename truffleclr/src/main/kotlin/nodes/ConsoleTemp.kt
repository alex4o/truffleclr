package nodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo

@NodeInfo(shortName = "print")
class ConsoleTemp(@CompilerDirectives.CompilationFinal val name: String, @Children var args: Array<ExpressionNode>): ExpressionNode() {
    override fun execute(env: VirtualFrame): Any? {
        if(name.startsWith("WriteLine")) {
            this.writeLine(args[0].execute(env))
        }else{
            this.write(args[0].execute(env))
        }
        return 0
    }

    @CompilerDirectives.TruffleBoundary
    fun writeLine(any: Any?) {
        println("$any")
    }

    @CompilerDirectives.TruffleBoundary
    fun write(any: Any?) {
        print(any)
    }

    override fun toString(): String {
        return "(call $name ${args.joinToString(" ")})";
    }
}