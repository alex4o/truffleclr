package nodes.expressions

import com.oracle.truffle.`object`.DynamicObjectImpl
import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.RootCallTarget
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.`object`.DynamicObject
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.nodes.DirectCallNode
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.IndirectCallNode
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode
import runtime.ClrObject
import runtime.Method
import java.util.*

@NodeInfo(shortName = "callvirt")
class CallVirtual(@CompilerDirectives.CompilationFinal var methodName: String, @CompilerDirectives.CompilationFinal var methodIndex: Int, @Children var args: Array<ExpressionNode>): ExpressionNode() {

    // TODO: Add type checking

    @Child var callNode: IndirectCallNode = Truffle.getRuntime().createIndirectCallNode()

    @Child var interopLib = InteropLibrary.getFactory().createDispatched(5)

    @ExplodeLoop(kind = ExplodeLoop.LoopExplosionKind.FULL_EXPLODE_UNTIL_RETURN)
    override fun execute(env: VirtualFrame): Any? {
        val arguments = arrayOfNulls<Any>(args.size)
        for(i in args.indices) {
            arguments[i] = args[i].execute(env)
        }

//        if(CompilerDirectives.inInterpreter()) {
//            println("${method} (${arguments.joinToString(",")})")
//        }
        val method = ((arguments[0] as DynamicObject).shape.objectType as ClrObject).virtualTable[methodIndex]
        return interopLib.execute(method, *arguments)
    }

    override fun toString(): String {
        return "(callvirt ${methodName} ${args.joinToString(" ")})";
    }
}