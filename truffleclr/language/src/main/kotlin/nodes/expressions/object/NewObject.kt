package nodes.expressions.`object`

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.`object`.DynamicObjectLibrary
import com.oracle.truffle.api.`object`.Shape
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.nodes.ExplodeLoop
import main.Clr
import nodes.ExpressionNode
import runtime.ClrDynamicObject
import runtime.ClrObject

/** Create an instance, initialize inherited and declared fields, then call its constructor. */
class NewObject(@Children var arguments: Array<ExpressionNode>, val ctor: TruffleObject, @CompilerDirectives.CompilationFinal val shape: Shape) : ExpressionNode() {
    val context: runtime.ClrContext
        get() {
            return Clr.contextReference.get(this)
        }

    private val instanceShape = (shape.dynamicType as ClrObject).allocationShape

    @Child var interopLib = InteropLibrary.getFactory().createDispatched(5)
    @Child var objects = DynamicObjectLibrary.getFactory().createDispatched(5)

    @CompilerDirectives.CompilationFinal(dimensions = 1)
    val fieldNames = (shape.dynamicType as ClrObject).fieldDefaults.keys.toTypedArray()

    @CompilerDirectives.CompilationFinal(dimensions = 1)
    val fieldDefaults = (shape.dynamicType as ClrObject).fieldDefaults.values.toTypedArray()

    @ExplodeLoop(kind = ExplodeLoop.LoopExplosionKind.FULL_EXPLODE)
    override fun execute(env: VirtualFrame): Any? {
        val argumentArray = arrayOfNulls<Any>(arguments.size + 1)
        val createdObject = ClrDynamicObject(instanceShape)
        for (i in fieldNames.indices) {
            objects.put(createdObject, fieldNames[i], fieldDefaults[i])
        }
        argumentArray[0] = createdObject
        for (i in arguments.indices) {
            argumentArray[i + 1] = arguments[i].execute(env)
        }
        interopLib.execute(ctor, *argumentArray)
        return createdObject
    }

    override fun toString(): String {
        return "(newobj $ctor ${arguments.joinToString(" ")})"
    }
}
