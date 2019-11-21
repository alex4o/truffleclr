package nodes

import com.oracle.truffle.api.frame.VirtualFrame

class LoadConstLong(val number: Long): ExpressionNode() {
    override fun execute(env: VirtualFrame): Long {
        return number;
    }

    override fun toString(): String {
        return number.toString()
    }
}