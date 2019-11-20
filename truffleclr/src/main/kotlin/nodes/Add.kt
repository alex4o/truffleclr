package nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node

class Add(@Child var readStackPtr: ReadStackPtr, @Child var writeStackPtr: WriteStackPtr): InstructionNode() {
    override fun execute(env: VirtualFrame, stack: Array<Long>, locals: Array<Long>): Any? {
        val ptr = readStackPtr.execute(env)
        val res = stack[ptr.toInt()] + stack[(ptr - 1).toInt()]
        stack[ptr.toInt() - 1] = res

        return writeStackPtr.execute(env, ptr)
    }
}