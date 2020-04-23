package nodes.expressions.`object`

import com.oracle.truffle.`object`.DynamicObjectImpl
import com.oracle.truffle.api.CompilerAsserts
import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.`object`.DynamicObject
import com.oracle.truffle.api.`object`.Property
import com.oracle.truffle.api.`object`.Shape
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.nodes.ExplodeLoop
import main.Clr
import nodes.ExpressionNode
import nodes.StatementNode
import types.CTSNull

/**
 * Create an object and call its constructor.
 * Also responsible for initializing object fields.
 * Can be split into two nodes a Call node and this node.
 * It uses the shape of the class to create a new instance.
 */
class NewObject(@Children var arguments: Array<ExpressionNode>, val ctor: TruffleObject, @CompilerDirectives.CompilationFinal val shape: Shape) : ExpressionNode() {

    val context by lazy {
        lookupContextReference(Clr::class.java).get()
    }

    @Child var interopLib = InteropLibrary.getFactory().createDispatched(5)

    @CompilerDirectives.CompilationFinal(dimensions = 1)
    val nullableFields = shape.propertyList.filter { it.flags == 1 }.toTypedArray()

    @ExplodeLoop(kind = ExplodeLoop.LoopExplosionKind.FULL_EXPLODE)
    override fun execute(env: VirtualFrame): Any? {
        val argumentArray = arrayOfNulls<Any>(arguments.size + 1)
        val createdObject = shape.newInstance()

        for(property in nullableFields) {
            property.setInternal(createdObject, CTSNull)
        }

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