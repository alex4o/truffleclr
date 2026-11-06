package main.bytecode;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.bytecode.*;
import com.oracle.truffle.api.dsl.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.object.*;
import com.oracle.truffle.api.library.CachedLibrary;
import main.Clr;
import runtime.Method;
import runtime.ClrObject;
import runtime.ClrDynamicObject;
import runtime.CorElementType;
import nodes.expressions.array.*;
import nodes.expressions.CompareCondition;

/** Generated interpreter: control flow, locals and OSR belong to the Bytecode DSL. */
@GenerateBytecode(languageClass = Clr.class, enableUncachedInterpreter = false,
    enableSerialization = false, enableQuickening = true, enableBlockScoping = false,
    boxingEliminationTypes = {})
public abstract class CilRootNode extends RootNode implements BytecodeRootNode {
    protected CilRootNode(Clr language, FrameDescriptor descriptor) { super(language, descriptor); }
    private String methodName;
    public void setMethodName(String name) { methodName = name; }
    @Override public String getName() { return methodName; }
    @Override public String toString() { return methodName; }


    @Operation public static final class Add {
        @Specialization static char dochar( char left, char right) { return (char) (left + right); }
        @Specialization static int dobyte( byte left, byte right) { return left + right; }
        @Specialization static int doshort( short left, short right) { return left + right; }
        @Specialization static int doint( int left, int right) { return left + right; }
        @Specialization static long dolong( long left, long right) { return left + right; }
        @Specialization static float dofloat( float left, float right) { return left + right; }
        @Specialization static double dodouble( double left, double right) { return left + right; }
    }
    @Operation public static final class Sub {
        @Specialization static char dochar( char left, char right) { return (char) (left - right); }
        @Specialization static int dobyte( byte left, byte right) { return left - right; }
        @Specialization static int doshort( short left, short right) { return left - right; }
        @Specialization static int doint( int left, int right) { return left - right; }
        @Specialization static long dolong( long left, long right) { return left - right; }
        @Specialization static float dofloat( float left, float right) { return left - right; }
        @Specialization static double dodouble( double left, double right) { return left - right; }
    }
    @Operation public static final class Mul {
        @Specialization static int dochar( char left, char right) { return left * right; }
        @Specialization static int dobyte( byte left, byte right) { return left * right; }
        @Specialization static int doshort( short left, short right) { return left * right; }
        @Specialization static int doint( int left, int right) { return left * right; }
        @Specialization static long dolong( long left, long right) { return left * right; }
        @Specialization static float dofloat( float left, float right) { return left * right; }
        @Specialization static double dodouble( double left, double right) { return left * right; }
    }
    @Operation @ConstantOperand(type = boolean.class, name = "unsigned") public static final class Div {
        @Specialization static int dobyte(boolean unsigned, byte left, byte right) { return unsigned ? Integer.divideUnsigned(left, right) : left / right; }
        @Specialization static int doshort(boolean unsigned, short left, short right) { return unsigned ? Integer.divideUnsigned(left, right) : left / right; }
        @Specialization static int doint(boolean unsigned, int left, int right) { return unsigned ? Integer.divideUnsigned(left, right) : left / right; }
        @Specialization static long dolong(boolean unsigned, long left, long right) { return unsigned ? Long.divideUnsigned(left, right) : left / right; }
        @Specialization(guards = "!unsigned") static float dofloat(boolean unsigned, float left, float right) { return left / right; }
        @Specialization(guards = "!unsigned") static double dodouble(boolean unsigned, double left, double right) { return left / right; }
    }
    @Operation @ConstantOperand(type = boolean.class, name = "unsigned") public static final class Rem {
        @Specialization static int dobyte(boolean unsigned, byte left, byte right) { return unsigned ? Integer.remainderUnsigned(left, right) : left % right; }
        @Specialization static int doshort(boolean unsigned, short left, short right) { return unsigned ? Integer.remainderUnsigned(left, right) : left % right; }
        @Specialization static int doint(boolean unsigned, int left, int right) { return unsigned ? Integer.remainderUnsigned(left, right) : left % right; }
        @Specialization static long dolong(boolean unsigned, long left, long right) { return unsigned ? Long.remainderUnsigned(left, right) : left % right; }
        @Specialization(guards = "!unsigned") static float dofloat(boolean unsigned, float left, float right) { return left % right; }
        @Specialization(guards = "!unsigned") static double dodouble(boolean unsigned, double left, double right) { return left % right; }
    }
    @Operation public static final class And {
        @Specialization static int doint( int left, int right) { return left & right; }
        @Specialization static long dolong( long left, long right) { return left & right; }
    }
    @Operation public static final class Or {
        @Specialization static int doint( int left, int right) { return left | right; }
        @Specialization static long dolong( long left, long right) { return left | right; }
    }
    @Operation public static final class Xor {
        @Specialization static int doint( int left, int right) { return left ^ right; }
        @Specialization static long dolong( long left, long right) { return left ^ right; }
    }
    @Operation public static final class Shl {
        @Specialization static int doint( int left, int right) { return left << right; }
        @Specialization static long dolong( long left, long right) { return left << right; }
        @Specialization static long doLongInt(long left, int right) { return left << right; }
    }
    @Operation @ConstantOperand(type = boolean.class, name = "unsigned") public static final class Shr {
        @Specialization static int doint(boolean unsigned, int left, int right) { return unsigned ? left >>> right : left >> right; }
        @Specialization static long dolong(boolean unsigned, long left, long right) { return unsigned ? left >>> right : left >> right; }
        @Specialization static long doLongInt(boolean unsigned, long left, int right) { return unsigned ? left >>> right : left >> right; }
    }
    @Operation public static final class Neg {
        @Specialization static char dochar(char value) { return (char) -value; }
        @Specialization static int dobyte(byte value) { return -value; }
        @Specialization static int doshort(short value) { return -value; }
        @Specialization static int doint(int value) { return -value; }
        @Specialization static long dolong(long value) { return -value; }
        @Specialization static float dofloat(float value) { return -value; }
        @Specialization static double dodouble(double value) { return -value; }
    }
    @Operation public static final class ArrayLoad {
        @Specialization static int doint(int[] array, int index) { return array[index]; }
        @Specialization static long dolong(long[] array, int index) { return array[index]; }
        @Specialization static float dofloat(float[] array, int index) { return array[index]; }
        @Specialization static double dodouble(double[] array, int index) { return array[index]; }
        @Specialization static char dochar(char[] array, int index) { return array[index]; }
        @Specialization static byte dobyte(byte[] array, int index) { return array[index]; }
        @Specialization static short doshort(short[] array, int index) { return array[index]; }
        @Specialization static String doString(String[] array, int index) { return array[index]; }
        @Specialization static Object doObject(Object[] array, int index) { return array[index]; }
    }
    @Operation public static final class ArrayLength {
        @Specialization static int dolong(long[] array) { return array.length; }
        @Specialization static int doint(int[] array) { return array.length; }
        @Specialization static int doshort(short[] array) { return array.length; }
        @Specialization static int dochar(char[] array) { return array.length; }
        @Specialization static int dodouble(double[] array) { return array.length; }
        @Specialization static int dofloat(float[] array) { return array.length; }
        @Specialization static int doString(String[] array) { return array.length; }
        @Specialization static int doObject(Object[] array) { return array.length; }
    }
    @Operation public static final class ArrayStore {
        @Specialization static void doObject(Object[] array, int index, Object value) { array[index] = value; }
        @Specialization static void doint(int[] array, int index, int value) { array[index] = value; }
        @Specialization static void doshort(short[] array, int index, short value) { array[index] = value; }
        @Specialization static void dofloat(float[] array, int index, float value) { array[index] = value; }
        @Specialization static void dodouble(double[] array, int index, double value) { array[index] = value; }
        @Specialization static void dobyte(byte[] array, int index, byte value) { array[index] = value; }
        @Specialization static void dochar(char[] array, int index, char value) { array[index] = value; }
    }
    /** ECMA-335 III.3.21-26: comparison results are int32, never host booleans. */
    @Operation @ConstantOperand(type = CompareCondition.class)
    @ConstantOperand(type = boolean.class, name = "unsigned")
    public static final class Cmp {
        static int test(CompareCondition condition, int comparison) {
            boolean result = switch (condition) {
                case EQ -> comparison == 0; case NE -> comparison != 0;
                case LT -> comparison < 0; case GT -> comparison > 0;
                case LE -> comparison <= 0; case GE -> comparison >= 0;
            };
            return result ? 1 : 0;
        }
        static int floating(CompareCondition condition, boolean unordered, double left, double right) {
            if (Double.isNaN(left) || Double.isNaN(right)) return unordered ? 1 : 0;
            // Direct relations preserve CIL equality of positive and negative zero.
            boolean result = switch (condition) {
                case EQ -> left == right; case NE -> left != right;
                case LT -> left < right; case GT -> left > right;
                case LE -> left <= right; case GE -> left >= right;
            };
            return result ? 1 : 0;
        }
        @Specialization static int doint(CompareCondition c, boolean unsigned, int left, int right) {
            return test(c, unsigned ? Integer.compareUnsigned(left, right) : Integer.compare(left, right));
        }
        @Specialization static int dolong(CompareCondition c, boolean unsigned, long left, long right) {
            return test(c, unsigned ? Long.compareUnsigned(left, right) : Long.compare(left, right));
        }
        @Specialization static int dofloat(CompareCondition c, boolean unsigned, float left, float right) {
            return floating(c, unsigned, left, right);
        }
        @Specialization static int dodouble(CompareCondition c, boolean unsigned, double left, double right) {
            return floating(c, unsigned, left, right);
        }
        @Specialization static int doFloatDouble(CompareCondition c, boolean unsigned, float left, double right) {
            return floating(c, unsigned, left, right);
        }
        @Specialization static int doDoubleFloat(CompareCondition c, boolean unsigned, double left, float right) {
            return floating(c, unsigned, left, right);
        }
        @Specialization static int doboolean(CompareCondition c, boolean unsigned, boolean left, boolean right) {
            return doint(c, unsigned, left ? 1 : 0, right ? 1 : 0);
        }
        @Specialization static int doBoolInt(CompareCondition c, boolean unsigned, boolean left, int right) {
            return doint(c, unsigned, left ? 1 : 0, right);
        }
        @Specialization static int doIntBool(CompareCondition c, boolean unsigned, int left, boolean right) {
            return doint(c, unsigned, left, right ? 1 : 0);
        }
        @Fallback static int doObject(CompareCondition c, boolean unsigned, Object left, Object right) {
            // Both representations are used by ldnull and zero-initialized reference arrays.
            if (left == types.CTSNull.INSTANCE) left = null;
            if (right == types.CTSNull.INSTANCE) right = null;
            boolean equal = java.util.Objects.equals(left, right);
            return (c == CompareCondition.EQ ? equal : !equal) ? 1 : 0;
        }
    }
    @Operation public static final class Truth {
        @Specialization static boolean execute(byte value) { return value != 0; }
        @Specialization static boolean execute(short value) { return value != 0; }
        @Specialization static boolean execute(char value) { return value != 0; }
        @Specialization static boolean execute(int value) { return value != 0; }
        @Specialization static boolean execute(long value) { return value != 0; }
        @Specialization static boolean execute(boolean value) { return value; }
        @Fallback static boolean reference(Object value) { return value != null && value != types.CTSNull.INSTANCE; }
    }
    @Operation @ConstantOperand(type = CorElementType.class)
    public static final class ArrayNew {
        static NewArray createPrimitive(CorElementType type) { return NewArrayNodeGen.create(type, null); }
        @Specialization static Object execute(VirtualFrame frame, CorElementType type, Object size,
                @Cached(value = "createPrimitive(type)", neverDefault = true) NewArray node) { return node.executeOperands(frame, size); }
    }
    @Operation @ConstantOperand(type = Method.class)
    public static final class Invoke {
        @Specialization static Object execute(Method method, @Variadic Object[] args,
                @Cached("create(method.getCallTarget())") DirectCallNode call) { return call.call(args); }
    }
    @Operation @ConstantOperand(type = Method.class)
    public static final class Invoke0 {
        @Specialization static Object invoke(Method method, @Cached("create(method.getCallTarget())") DirectCallNode call) { return call.call(); }
    }
    @Operation @ConstantOperand(type = Method.class)
    public static final class Invoke1 {
        @Specialization static Object invoke(Method method, Object v0, @Cached("create(method.getCallTarget())") DirectCallNode call) { return call.call(v0); }
    }
    @Operation @ConstantOperand(type = Method.class)
    public static final class Invoke2 {
        @Specialization static Object invoke(Method method, Object v0, Object v1, @Cached("create(method.getCallTarget())") DirectCallNode call) { return call.call(v0, v1); }
    }
    @Operation @ConstantOperand(type = Method.class)
    public static final class Invoke3 {
        @Specialization static Object invoke(Method method, Object v0, Object v1, Object v2, @Cached("create(method.getCallTarget())") DirectCallNode call) { return call.call(v0, v1, v2); }
    }
    @Operation @ConstantOperand(type = Method.class)
    public static final class Invoke4 {
        @Specialization static Object invoke(Method method, Object v0, Object v1, Object v2, Object v3, @Cached("create(method.getCallTarget())") DirectCallNode call) { return call.call(v0, v1, v2, v3); }
    }
    @Operation @ConstantOperand(type = int.class)
    public static final class InvokeVirtual {
        static Shape shape(Object[] args) { return ((DynamicObject) args[0]).getShape(); }
        static com.oracle.truffle.api.CallTarget target(Shape shape, int index) {
            return ((ClrObject) shape.getDynamicType()).getVirtualTable()[index].getCallTarget();
        }
        @Specialization(guards = "shape(args) == cachedShape", limit = "5")
        static Object cached(int index, @Variadic Object[] args,
                @Cached("shape(args)") Shape cachedShape,
                @Cached("create(target(cachedShape, index))") DirectCallNode call) { return call.call(args); }
        @Specialization(replaces = "cached")
        static Object generic(int index, @Variadic Object[] args,
                @Cached IndirectCallNode call) { return call.call(target(shape(args), index), args); }
    }
    @Operation @ConstantOperand(type = Shape.class) @ConstantOperand(type = Method.class)
    @ConstantOperand(type = int.class, name = "argumentCount")
    public static final class ObjectNew {
        static Shape allocationShape(Shape shape) { return ((ClrObject) shape.getDynamicType()).getAllocationShape(); }
        static Object[] names(Shape shape) { return ((ClrObject) shape.getDynamicType()).getFieldDefaults().keySet().toArray(); }
        static Object[] defaults(Shape shape) { return ((ClrObject) shape.getDynamicType()).getFieldDefaults().values().toArray(); }
        @Specialization @ExplodeLoop
        static Object execute(Shape shape, Method ctor, int argumentCount, @Variadic Object[] args,
                @Cached("allocationShape(shape)") Shape allocationShape,
                @Cached(value = "names(shape)", dimensions = 1) Object[] names,
                @Cached(value = "defaults(shape)", dimensions = 1) Object[] defaults,
                @CachedLibrary(limit = "5") DynamicObjectLibrary objects,
                @Cached("create(ctor.getCallTarget())") DirectCallNode call) {
            ClrDynamicObject object = new ClrDynamicObject(allocationShape);
            for (int i = 0; i < names.length; i++) objects.put(object, names[i], defaults[i]);
            Object[] arguments = new Object[argumentCount + 1];
            arguments[0] = object;
            for (int i = 0; i < argumentCount; i++) arguments[i + 1] = args[i];
            call.call(arguments);
            return object;
        }
    }
    @Operation @ConstantOperand(type = String.class)
    public static final class FieldLoad {
        @Specialization(limit = "5") static Object execute(String key, DynamicObject receiver,
                @CachedLibrary("receiver") DynamicObjectLibrary objects) { return objects.getOrDefault(receiver, key, null); }
    }
    @Operation @ConstantOperand(type = String.class)
    public static final class FieldLoadInt {
        @Specialization(limit = "5", rewriteOn = UnexpectedResultException.class)
        static int typed(String key, DynamicObject receiver, @CachedLibrary("receiver") DynamicObjectLibrary objects) throws UnexpectedResultException {
            return objects.getIntOrDefault(receiver, key, null);
        }
        @Specialization(limit = "5", replaces = "typed")
        static Object generic(String key, DynamicObject receiver, @CachedLibrary("receiver") DynamicObjectLibrary objects) {
            return objects.getOrDefault(receiver, key, null);
        }
    }
    @Operation @ConstantOperand(type = String.class)
    public static final class FieldLoadDouble {
        @Specialization(limit = "5", rewriteOn = UnexpectedResultException.class)
        static double typed(String key, DynamicObject receiver, @CachedLibrary("receiver") DynamicObjectLibrary objects) throws UnexpectedResultException {
            return objects.getDoubleOrDefault(receiver, key, null);
        }
        @Specialization(limit = "5", replaces = "typed")
        static Object generic(String key, DynamicObject receiver, @CachedLibrary("receiver") DynamicObjectLibrary objects) {
            return objects.getOrDefault(receiver, key, null);
        }
    }
    @Operation @ConstantOperand(type = String.class)
    public static final class FieldStore {
        @Specialization(limit = "5") static void writeInt(String key, DynamicObject receiver, int value,
                @CachedLibrary("receiver") DynamicObjectLibrary objects) { objects.putInt(receiver, key, value); }
        @Specialization(limit = "5") static void writeDouble(String key, DynamicObject receiver, double value,
                @CachedLibrary("receiver") DynamicObjectLibrary objects) { objects.putDouble(receiver, key, value); }

        @Specialization(limit = "5") static void execute(String key, DynamicObject receiver, Object value,
                @CachedLibrary("receiver") DynamicObjectLibrary objects) { objects.put(receiver, key, value); }
    }
    @Operation public static final class Box {
        @Specialization static Object execute(int value) { return value; }
    }
    @Operation @ConstantOperand(type = main.compilationNodes.Initialize.class)
    public static final class InitializeContext {
        @Specialization static void initialize(main.compilationNodes.Initialize initializer) { initializer.install(); }
    }
    @Operation public static final class StaticStore {
        @Specialization static void execute(Object value) { throw new kotlin.NotImplementedError("Not implemented"); }
    }
}
