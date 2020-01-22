package nodes;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.frame.VirtualFrame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@NodeChild(value = "left", type = ExpressionNode.class)
@NodeChild(value = "right", type = ExpressionNode.class)
public abstract class BinaryNode extends ExpressionNode {
}
