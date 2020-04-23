package nodes.expressions

import com.oracle.truffle.`object`.DynamicObjectImpl
import com.oracle.truffle.api.*
import com.oracle.truffle.api.`object`.DynamicObject
import com.oracle.truffle.api.`object`.Shape
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.nodes.DirectCallNode
import com.oracle.truffle.api.nodes.ExplodeLoop
import com.oracle.truffle.api.nodes.IndirectCallNode
import com.oracle.truffle.api.nodes.NodeInfo
import nodes.ExpressionNode
import runtime.ClrObject

/**
 * Uses manual specialization to execute a method, when the class changes the node is replaced with
 * the CallVirtualSlow node which uses IndirectCallNode which doesn't use inlining.
 */
@NodeInfo(shortName = "callvirt")
class CallVirtual(
    @CompilerDirectives.CompilationFinal var methodName: String,
    @CompilerDirectives.CompilationFinal var methodIndex: Int,
    @Children var args: Array<ExpressionNode>): ExpressionNode() {

    @CompilerDirectives.CompilationFinal var callNode: DirectCallNode? = null
    @CompilerDirectives.CompilationFinal var cachedShape: Shape? = null

    // TODO: Add type checking

    @ExplodeLoop(kind = ExplodeLoop.LoopExplosionKind.FULL_EXPLODE)
    override fun execute(env: VirtualFrame): Any? {
        val arguments = arrayOfNulls<Any>(args.size)
        for(i in args.indices) {
            arguments[i] = args[i].execute(env)
        }

        val shape = (arguments[0] as DynamicObject).shape
        return if(callNode != null && cachedShape == shape) {
            callNode!!.call(*arguments)
        }else if(callNode != null && cachedShape != shape) {
            CompilerDirectives.transferToInterpreterAndInvalidate()
            val newNode = replace(CallVirtualSlow(methodIndex, args))
            return newNode.execute(env)
        }else{
            CompilerDirectives.transferToInterpreterAndInvalidate()
            val method = (shape.objectType as ClrObject).virtualTable[methodIndex]
            callNode = method.callNode!!
            cachedShape = shape
            callNode!!.call(*arguments)
        }
    }

    class CallVirtualSlow(@CompilerDirectives.CompilationFinal var methodIndex: Int, @Children var args: Array<ExpressionNode>): ExpressionNode() {
        @Child
        @CompilerDirectives.CompilationFinal
        var indirectCallNode: IndirectCallNode = IndirectCallNode.create()

        @ExplodeLoop(kind = ExplodeLoop.LoopExplosionKind.FULL_EXPLODE)
        override fun execute(env: VirtualFrame): Any? {
            val arguments = arrayOfNulls<Any>(args.size)
            for(i in args.indices) {
                arguments[i] = args[i].execute(env)
            }

            val shape = (arguments[0] as DynamicObject).shape
            val method = (shape.objectType as ClrObject).virtualTable[methodIndex]
            return indirectCallNode.call(method.callNode!!.callTarget, *arguments)
        }

    }

    override fun toString(): String {
        return "(callvirt ${methodName} ${args.joinToString(" ")})";
    }
}