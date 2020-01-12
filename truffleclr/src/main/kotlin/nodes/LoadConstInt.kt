package nodes

import com.oracle.truffle.api.frame.VirtualFrame

class LoadConstInt(val number: Int): ExpressionNode() {
    override fun execute(env: VirtualFrame): Int {
        return number;
    }

    override fun toString(): String {
        return "(ldc $number)"
    }
}