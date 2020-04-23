package nodes.expressions.math;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren
import com.oracle.truffle.api.frame.VirtualFrame;
import nodes.ExpressionNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@NodeChildren(NodeChild("left"), NodeChild("right"))
abstract class BinaryExpression : ExpressionNode()
