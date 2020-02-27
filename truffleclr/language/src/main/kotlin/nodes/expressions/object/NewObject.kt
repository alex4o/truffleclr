package nodes.expressions.`object`

import com.oracle.truffle.`object`.DynamicObjectImpl
import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.`object`.DynamicObject
import com.oracle.truffle.api.`object`.Shape
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.nodes.ExplodeLoop
import main.Clr
import nodes.ExpressionNode
import nodes.StatementNode

class NewObject(@Children var arguments: Array<ExpressionNode>, val ctor: TruffleObject, val shape: Shape) : ExpressionNode() {

    val context by lazy {
        lookupContextReference(Clr::class.java).get()
    }

    @Child var interopLib = InteropLibrary.getFactory().createDispatched(5)

    @ExplodeLoop(kind = ExplodeLoop.LoopExplosionKind.FULL_EXPLODE_UNTIL_RETURN)
    override fun execute(env: VirtualFrame): Any? {
        val argumentArray = arrayOfNulls<Any>(arguments.size + 1)
        val createdObject = shape.newInstance()
        argumentArray[0] = createdObject

        for(i in arguments.indices) {
            argumentArray[i + 1] = arguments[i].execute(env)
        }


//        if(CompilerDirectives.inInterpreter()) {
//            println("${ctor} (${arguments.joinToString(",")})")
//        }

//        println("$this, ${argumentArray.contentToString()}")
        interopLib.execute(ctor, *argumentArray)
//        println( (createdObject as DynamicObjectImpl).debugDump(0) )
        return createdObject
    }


    override fun toString(): String {
        return "(newobj $ctor ${arguments.joinToString(" ") })"
    }
}