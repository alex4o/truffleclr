package main.bytecode;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.bytecode.*;
import com.oracle.truffle.api.dsl.*;
import com.oracle.truffle.api.nodes.*;
import runtime.Type;
import runtime.Field;
import main.Clr;
import runtime.Method;
import runtime.ClrObject;
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


    @Override
    public Throwable interceptInternalException(Throwable failure, VirtualFrame frame, BytecodeNode node, int bci) {
        String name;
        if (failure instanceof NegativeArraySizeException) name = "OverflowException";
        else if (failure instanceof ArithmeticException) name = "DivideByZeroException";
        else if (failure instanceof NullPointerException) name = "NullReferenceException";
        else if (failure instanceof ArrayIndexOutOfBoundsException) name = "IndexOutOfRangeException";
        else if (failure instanceof ClassCastException) name = "InvalidCastException";
        else if (failure instanceof ArrayStoreException) name = "ArrayTypeMismatchException";
        else if (failure instanceof UnsupportedSpecializationException unsupported) {
            for (Object value : unsupported.getSuppliedValues()) {
                if (value == null || value == types.CTSNull.INSTANCE) return ClrException.create("NullReferenceException", "Object reference not set to an instance of an object.");
            }
            return failure;
        } else return failure;
        return ClrException.create(name, failure.getMessage() == null ? "" : failure.getMessage());
    }

    @Operation public static final class Raise {
        @Specialization static void execute(com.oracle.truffle.api.exception.AbstractTruffleException exception) { throw exception; }
    }
    @Operation public static final class GuestException {
        @Specialization static ClrException execute(Object value) {
            if (value == null || value == types.CTSNull.INSTANCE) return ClrException.create("NullReferenceException", "Object reference not set to an instance of an object.");
            return new ClrException((ClrObject) value);
        }
    }
    @Operation public static final class ExceptionObject {
        @Specialization static ClrObject execute(ClrException exception) { return exception.object; }
    }
    @Operation @ConstantOperand(type = Type.class)
    public static final class ExceptionMatches {
        @Specialization static boolean execute(Type type, ClrException exception) { return type.isAssignableFrom(exception.object.getType()); }
    }

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
    static void checkDivision(boolean unsigned, long left, long right, long minimum) {
        if (right == 0) throw ClrException.create("DivideByZeroException", "Attempted to divide by zero.");
        if (!unsigned && left == minimum && right == -1) throw ClrException.create("OverflowException", "Arithmetic operation resulted in an overflow.");
    }
    @Operation @ConstantOperand(type = boolean.class, name = "unsigned") public static final class Div {
        @Specialization static int dobyte(boolean unsigned, byte left, byte right) { checkDivision(unsigned, left, right, Integer.MIN_VALUE); return unsigned ? Integer.divideUnsigned(left, right) : left / right; }
        @Specialization static int doshort(boolean unsigned, short left, short right) { checkDivision(unsigned, left, right, Integer.MIN_VALUE); return unsigned ? Integer.divideUnsigned(left, right) : left / right; }
        @Specialization static int doint(boolean unsigned, int left, int right) { checkDivision(unsigned, left, right, Integer.MIN_VALUE); return unsigned ? Integer.divideUnsigned(left, right) : left / right; }
        @Specialization static long dolong(boolean unsigned, long left, long right) { checkDivision(unsigned, left, right, Long.MIN_VALUE); return unsigned ? Long.divideUnsigned(left, right) : left / right; }
        @Specialization(guards = "!unsigned") static float dofloat(boolean unsigned, float left, float right) { return left / right; }
        @Specialization(guards = "!unsigned") static double dodouble(boolean unsigned, double left, double right) { return left / right; }
    }
    @Operation @ConstantOperand(type = boolean.class, name = "unsigned") public static final class Rem {
        @Specialization static int dobyte(boolean unsigned, byte left, byte right) { checkDivision(unsigned, left, right, Integer.MIN_VALUE); return unsigned ? Integer.remainderUnsigned(left, right) : left % right; }
        @Specialization static int doshort(boolean unsigned, short left, short right) { checkDivision(unsigned, left, right, Integer.MIN_VALUE); return unsigned ? Integer.remainderUnsigned(left, right) : left % right; }
        @Specialization static int doint(boolean unsigned, int left, int right) { checkDivision(unsigned, left, right, Integer.MIN_VALUE); return unsigned ? Integer.remainderUnsigned(left, right) : left % right; }
        @Specialization static long dolong(boolean unsigned, long left, long right) { checkDivision(unsigned, left, right, Long.MIN_VALUE); return unsigned ? Long.remainderUnsigned(left, right) : left % right; }
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
        @Fallback static Object invalid(Object array, Object index) { throw ClrException.invalidReference(array); }
        @Specialization(guards = "array.type == type", limit = "3")
        static Object struct(ManagedReference.ObjectArray array, int index, @Cached("array.type") Type type) { ClrException.checkIndex(index, array.values.length); return type.isValueType() ? type.copyValue((ClrObject) array.values[index]) : array.values[index]; }
        @Specialization(replaces = "struct") @com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
        static Object genericObjectArray(ManagedReference.ObjectArray array, int index) { ClrException.checkIndex(index, array.values.length); return array.type.isValueType() ? array.type.copyValue((ClrObject) array.values[index]) : array.values[index]; }
        @Specialization static int bool(boolean[] array, int index) { ClrException.checkIndex(index, array.length); return array[index] ? 1 : 0; }
        @Specialization(guards = {"index >= 0", "index < array.length"})
        static int doint(int[] array, int index) { return array[index]; }
        @Specialization(guards = "index < 0 || index >= array.length")
        static int intBounds(int[] array, int index) { throw ClrException.create("IndexOutOfRangeException", "Index was outside the bounds of the array."); }
        @Specialization static long dolong(long[] array, int index) { ClrException.checkIndex(index, array.length); return array[index]; }
        @Specialization static float dofloat(float[] array, int index) { ClrException.checkIndex(index, array.length); return array[index]; }
        @Specialization static double dodouble(double[] array, int index) { ClrException.checkIndex(index, array.length); return array[index]; }
        @Specialization static int dochar(char[] array, int index) { ClrException.checkIndex(index, array.length); return array[index]; }
        @Specialization static int dobyte(byte[] array, int index) { ClrException.checkIndex(index, array.length); return array[index]; }
        @Specialization static int doshort(short[] array, int index) { ClrException.checkIndex(index, array.length); return array[index]; }
        @Specialization static String doString(String[] array, int index) { ClrException.checkIndex(index, array.length); return array[index]; }
        @Specialization static Object doObject(Object[] array, int index) { ClrException.checkIndex(index, array.length); return array[index]; }
    }
    @Operation public static final class ArrayLength {
        @Fallback static int invalid(Object array) { throw ClrException.invalidReference(array); }
        @Specialization static int struct(ManagedReference.ObjectArray array) { return array.values.length; }
        @Specialization static int bool(boolean[] array) { return array.length; }
        @Specialization static int bytes(byte[] array) { return array.length; }
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
        @Fallback static void invalid(Object array, Object index, Object value) { throw ClrException.invalidReference(array); }
        @Specialization(guards = "array.type == type", limit = "3")
        static void struct(ManagedReference.ObjectArray array, int index, Object value, @Cached("array.type") Type type) {
            ClrException.checkIndex(index, array.values.length);
            if (type.isValueType()) type.copyInto((ClrObject) array.values[index], (ClrObject) value); else array.store(index, value);
        }
        @Specialization(replaces = "struct") @com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
        static void genericObjectArray(ManagedReference.ObjectArray array, int index, Object value) {
            ClrException.checkIndex(index, array.values.length);
            if (array.type.isValueType()) array.type.copyInto((ClrObject) array.values[index], (ClrObject) value); else array.store(index, value);
        }
        @Specialization static void bool(boolean[] array, int index, int value) { ClrException.checkIndex(index, array.length); array[index] = value != 0; }
        @Specialization static void doObject(Object[] array, int index, Object value) { ClrException.checkIndex(index, array.length); ManagedReference.storeObject(array, index, value); }
        @Specialization static void dolong(long[] array, int index, long value) { ClrException.checkIndex(index, array.length); array[index] = value; }
        @Specialization(guards = {"index >= 0", "index < array.length"})
        static void doint(int[] array, int index, int value) { array[index] = value; }
        @Specialization(guards = "index < 0 || index >= array.length")
        static void intBounds(int[] array, int index, int value) { throw ClrException.create("IndexOutOfRangeException", "Index was outside the bounds of the array."); }
        @Specialization static void doshort(short[] array, int index, int value) { ClrException.checkIndex(index, array.length); array[index] = (short) value; }
        @Specialization static void dofloat(float[] array, int index, float value) { ClrException.checkIndex(index, array.length); array[index] = value; }
        @Specialization static void dodouble(double[] array, int index, double value) { ClrException.checkIndex(index, array.length); array[index] = value; }
        @Specialization static void dobyte(byte[] array, int index, int value) { ClrException.checkIndex(index, array.length); array[index] = (byte) value; }
        @Specialization static void dochar(char[] array, int index, int value) { ClrException.checkIndex(index, array.length); array[index] = (char) value; }
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
            boolean equal = left == right || left instanceof ManagedReference reference && reference.equals(right);
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
                @Cached(value = "createPrimitive(type)", neverDefault = true) NewArray node) {
            if (((Number) size).longValue() < 0) throw ClrException.create("OverflowException", "Array dimensions exceeded supported range.");
            return node.executeOperands(frame, size);
        }
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
    @Operation @ConstantOperand(type = Method.class)
    public static final class InvokeNonVirtual {
        @Specialization static Object execute(Method method, @Variadic Object[] args,
                @Cached("create(method.getCallTarget())") DirectCallNode call) {
            if (args[0] == null || args[0] == types.CTSNull.INSTANCE) throw ClrException.create("NullReferenceException", "callvirt receiver");
            return call.call(args);
        }
    }
    @Operation @ConstantOperand(type = int.class)
    public static final class InvokeVirtual {
        static boolean isNull(Object[] args) { return args[0] == null || args[0] == types.CTSNull.INSTANCE; }
        @Specialization(guards = "isNull(args)")
        static Object nullReceiver(int index, @Variadic Object[] args) { throw ClrException.invalidReference(args[0]); }
        static Type type(Object[] args) { return args[0] instanceof ManagedReference.Box box ? box.type : ManagedReference.receiver(args[0]).getType(); }
        static com.oracle.truffle.api.CallTarget target(Type type, int index) {
            return type.getVirtualTable()[index].getCallTarget();
        }
        @Specialization(guards = {"!isNull(args)", "type(args) == cachedType"}, limit = "5")
        static Object cached(int index, @Variadic Object[] args,
                @Cached("type(args)") Type cachedType,
                @Cached("create(target(cachedType, index))") DirectCallNode call) { return call.call(args); }
        @Specialization(replaces = "cached", guards = "!isNull(args)")
        static Object generic(int index, @Variadic Object[] args,
                @Cached IndirectCallNode call) { return call.call(target(type(args), index), args); }
    }
    @Operation @ConstantOperand(type = Type.class) @ConstantOperand(type = Method.class)
    @ConstantOperand(type = int.class, name = "argumentCount")
    public static final class ObjectNew {
        @Specialization @ExplodeLoop
        static Object execute(Type type, Method ctor, int argumentCount, @Variadic Object[] args,
                @Cached("create(ctor.getCallTarget())") DirectCallNode call) {
            type.ensureInitialized();
            ClrObject object = type.newValue();
            Object[] arguments = new Object[argumentCount + 1];
            arguments[0] = type.isValueType() ? new ManagedReference.Cell(type, object) : object;
            for (int i = 0; i < argumentCount; i++) arguments[i + 1] = args[i];
            call.call(arguments);
            return object;
        }
    }
    @Operation @ConstantOperand(type = Field.class)
    public static final class FieldLoad {
        @Specialization static Object execute(Field field, ClrObject receiver) { return field.read(receiver); }
        @Fallback static Object other(Field field, Object receiver) { return field.read(ManagedReference.receiver(receiver)); }
    }
    @Operation @ConstantOperand(type = Field.class)
    public static final class FieldLoadInt {
        @Specialization static int execute(Field field, ClrObject receiver) { return field.getInt(receiver); }
        @Fallback static int other(Field field, Object receiver) { return field.getInt(ManagedReference.receiver(receiver)); }
    }
    @Operation @ConstantOperand(type = Field.class)
    public static final class FieldLoadDouble {
        @Specialization static double execute(Field field, ClrObject receiver) { return field.getDouble(receiver); }
        @Fallback static double other(Field field, Object receiver) { return field.getDouble(ManagedReference.receiver(receiver)); }
    }
    @Operation @ConstantOperand(type = Field.class)
    public static final class FieldStore {
        static boolean isInt(Field field) { return field.getStorageType() == int.class; }
        static boolean isDouble(Field field) { return field.getStorageType() == double.class; }
        @Specialization(guards = "isInt(field)")
        static void writeInt(Field field, ClrObject receiver, int value) { field.setInt(receiver, value); }
        @Specialization(guards = "isDouble(field)")
        static void writeDouble(Field field, ClrObject receiver, double value) { field.setDouble(receiver, value); }
        @Specialization static void execute(Field field, ClrObject receiver, Object value) { field.write(receiver, value); }
        @Fallback static void other(Field field, Object receiver, Object value) { field.write(ManagedReference.receiver(receiver), value); }
    }
    @Operation @ConstantOperand(type = Field.class)
    public static final class StructFieldLoad {
        @Specialization static Object execute(Field field, Object receiver) { return field.read(ManagedReference.receiver(receiver)); }
    }
    @Operation @ConstantOperand(type = Field.class)
    public static final class StructFieldStore {
        @Specialization static void execute(Field field, Object receiver, Object value) { field.write(ManagedReference.receiver(receiver), value); }
    }
    @Operation @ConstantOperand(type = Field.class)
    public static final class StaticLoad {
        @Specialization static Object execute(Field field) {
            field.getOwner().ensureInitialized();
            return field.read(field.getOwner().getStaticObject());
        }
    }
    @Operation @ConstantOperand(type = String.class)
    public static final class Convert {
        @Specialization static Object integer(String kind, int value) { return convert(kind, value); }
        @Specialization static Object wide(String kind, long value) { return convert(kind, value); }
        @Specialization static Object single(String kind, float value) { return convert(kind, value); }
        @Specialization static Object floating(String kind, double value) { return convert(kind, value); }
        @Specialization static Object small(String kind, byte value) { return convert(kind, (int) value); }
        @Specialization static Object narrow(String kind, short value) { return convert(kind, (int) value); }
        @Specialization static Object character(String kind, char value) { return convert(kind, (int) value); }
        @Specialization static Object bool(String kind, boolean value) { return convert(kind, value ? 1 : 0); }
        @Fallback static Object reference(String kind, Object value) {
            if (!kind.equals("ref")) throw ClrException.create("InvalidCastException", "Not a numeric value");
            return value;
        }
        static Object convert(String kind, Object value) {
            if (kind.equals("ref")) return value;
            Number number = value instanceof Character c ? (int) c : value instanceof Boolean b ? (b ? 1 : 0) : (Number) value;
            return switch (kind) {
                case "i1" -> (int) number.byteValue();
                case "u1" -> number.intValue() & 0xff;
                case "i2" -> (int) number.shortValue();
                case "u2" -> number.intValue() & 0xffff;
                case "i4" -> number.intValue();
                case "u4" -> value instanceof Float || value instanceof Double ? (int) number.longValue() : number.intValue();
                case "i8", "i" -> number.longValue();
                case "u8", "u" -> value instanceof Integer ? Integer.toUnsignedLong(number.intValue())
                        : (value instanceof Float || value instanceof Double) && number.doubleValue() >= 0x1.0p63
                        ? (long) (number.doubleValue() - 0x1.0p63) + Long.MIN_VALUE : number.longValue();
                case "r4" -> number.floatValue();
                case "r8" -> number.doubleValue();
                case "r" -> value instanceof Integer ? (double) Integer.toUnsignedLong(number.intValue()) : value instanceof Long ? Double.parseDouble(Long.toUnsignedString(number.longValue())) : number.doubleValue();
                default -> throw new UnsupportedOperationException("Unsupported conversion: " + kind);
            };
        }
    }
    @Operation @ConstantOperand(type = Type.class)
    public static final class Box {
        @Specialization static Object execute(Type type, Object value) {
            return type.isValueType() || type.isEnum() || type.getInfo().isPrimitive() ? new ManagedReference.Box(type, value) : value;
        }
    }
    @Operation @ConstantOperand(type = Type.class) @ConstantOperand(type = boolean.class, name = "copy")
    public static final class Unbox {
        @Fallback static Object invalid(Type type, boolean copy, Object value) {
            if (value == null || value == types.CTSNull.INSTANCE) throw ClrException.create("NullReferenceException", "unbox receiver");
            throw ClrException.create("InvalidCastException", "Invalid unbox to " + type.getName());
        }
        @Specialization static Object execute(Type type, boolean copy, ManagedReference.Box box) {
            if (box == null) throw ClrException.create("NullReferenceException", "unbox receiver");
            if (box.type != type) throw ClrException.create("InvalidCastException", "Invalid unbox to " + type.getName());
            if (!copy) return box;
            return type.isValueType() ? type.copyValue((ClrObject) box.get()) : box.get();
        }
    }
    @Operation @ConstantOperand(type = Type.class) @ConstantOperand(type = boolean.class, name = "checked")
    public static final class TypeTest {
        static Type actualType(Object value) { return value instanceof ManagedReference.Box box ? box.type : value instanceof ClrObject object ? object.getType() : null; }
        @Specialization(guards = "actualType(value) == actual", limit = "5")
        static Object execute(Type type, boolean checked, Object value, @Cached(value = "actualType(value)", neverDefault = false) Type actual) {
            if (value == null || value == types.CTSNull.INSTANCE) return types.CTSNull.INSTANCE;
            if ((value.getClass().isArray() || value instanceof ManagedReference.ObjectArray) && (type.getName().equals("System.Object") || type.getName().equals("System.Array"))) return value;
            if (actual != null && type.isAssignableFrom(actual) || value instanceof String && (type.getName().equals("System.String") || type.getName().equals("System.Object"))) return value;
            if (checked) throw ClrException.create("InvalidCastException", "Invalid cast to " + type.getName());
            return types.CTSNull.INSTANCE;
        }
        @Specialization(replaces = "execute") @com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
        static Object generic(Type type, boolean checked, Object value) { return execute(type, checked, value, actualType(value)); }
    }
    @Operation @ConstantOperand(type = Type.class) @ConstantOperand(type = boolean.class, name = "checked")
    public static final class ArrayTypeTest {
        @Specialization static Object execute(Type element, boolean checked, Object value) {
            if (value == null || value == types.CTSNull.INSTANCE) return types.CTSNull.INSTANCE;
            boolean matches;
            if (value instanceof ManagedReference.ObjectArray array) matches = array.type.isValueType() ? array.type == element : element.isAssignableFrom(array.type);
            else matches = switch (element.getInfo().getType()) {
                case BOOLEAN -> value instanceof boolean[];
                case I1, U1 -> value instanceof byte[];
                case I2, U2 -> value instanceof short[];
                case CHAR -> value instanceof char[];
                case I4, U4 -> value instanceof int[];
                case I8, U8 -> value instanceof long[];
                case R4 -> value instanceof float[];
                case R8 -> value instanceof double[];
                case STRING -> value instanceof String[];
                default -> element.getName().equals("System.Object") && value instanceof Object[];
            };
            if (matches) return value;
            if (checked) throw ClrException.create("InvalidCastException", "Invalid array cast to " + element.getName());
            return types.CTSNull.INSTANCE;
        }
    }
    @Operation @ConstantOperand(type = Type.class) public static final class CopyValue {
        @Specialization static Object execute(Type type, ClrObject value) { return type.copyValue(value); }
    }
    @Operation @ConstantOperand(type = Type.class)
    public static final class DefaultValue {
        @Specialization static Object execute(Type type) { return type.newValue(); }
    }
    @Operation @ConstantOperand(type = Type.class) public static final class CellNew {
        @Specialization static ManagedReference.Cell execute(Type type, Object value) { return new ManagedReference.Cell(type.isValueType() ? type : null, value); }
    }
    @Operation public static final class ReferenceLoad {
        static boolean isNull(Object reference) { return reference == null || reference == types.CTSNull.INSTANCE; }
        @Specialization(guards = "isNull(reference)") static Object invalid(Object reference) { throw ClrException.invalidReference(reference); }
        @Specialization(guards = "reference.getType() == type", limit = "3")
        static Object struct(ClrObject reference, @Cached("reference.getType()") Type type) { return type.copyValue(reference); }
        @Specialization(guards = "reference.valueType() == type", limit = "3")
        static Object cell(ManagedReference.Cell reference, @Cached(value = "reference.valueType()", neverDefault = false) Type type) {
            return type == null ? reference.get() : type.copyValue((ClrObject) reference.get());
        }
        @Specialization(guards = "reference.valueType() == type", limit = "3")
        static Object member(ManagedReference.Member reference, @Cached(value = "reference.valueType()", neverDefault = false) Type type) {
            return type == null ? reference.get() : type.copyValue((ClrObject) reference.get());
        }
        @Specialization(guards = "reference.valueType() == type", limit = "3")
        static Object element(ManagedReference.Element reference, @Cached(value = "reference.valueType()", neverDefault = false) Type type) {
            return type == null ? reference.get() : type.copyValue((ClrObject) reference.get());
        }
        @Specialization(guards = "reference.valueType() == type", limit = "3")
        static Object box(ManagedReference.Box reference, @Cached(value = "reference.valueType()", neverDefault = false) Type type) {
            return type == null ? reference.get() : type.copyValue((ClrObject) reference.get());
        }
    }
    @Operation public static final class ReferenceStore {
        static boolean isNull(Object reference) { return reference == null || reference == types.CTSNull.INSTANCE; }
        @Specialization(guards = "isNull(reference)") static void invalid(Object reference, Object value) { throw ClrException.invalidReference(reference); }
        @Specialization(guards = "reference.getType() == type", limit = "3")
        static void struct(ClrObject reference, ClrObject value, @Cached("reference.getType()") Type type) { type.copyInto(reference, value); }
        @Specialization(guards = "reference.valueType() == type", limit = "3")
        static void cell(ManagedReference.Cell reference, Object value, @Cached(value = "reference.valueType()", neverDefault = false) Type type) {
            if (type == null) reference.setRaw(value); else type.copyInto((ClrObject) reference.get(), (ClrObject) value);
        }
        @Specialization(guards = "reference.valueType() == type", limit = "3")
        static void member(ManagedReference.Member reference, Object value, @Cached(value = "reference.valueType()", neverDefault = false) Type type) {
            if (type == null) reference.setRaw(value); else type.copyInto((ClrObject) reference.get(), (ClrObject) value);
        }
        @Specialization(guards = "reference.valueType() == type", limit = "3")
        static void element(ManagedReference.Element reference, Object value, @Cached(value = "reference.valueType()", neverDefault = false) Type type) {
            if (type == null) reference.setRaw(value); else type.copyInto((ClrObject) reference.get(), (ClrObject) value);
        }
        @Specialization(guards = "reference.valueType() == type", limit = "3")
        static void box(ManagedReference.Box reference, Object value, @Cached(value = "reference.valueType()", neverDefault = false) Type type) {
            if (type == null) reference.setRaw(value); else type.copyInto((ClrObject) reference.get(), (ClrObject) value);
        }
    }
    @Operation @ConstantOperand(type = Field.class)
    public static final class FieldAddress {
        @Specialization static Object execute(Field field, Object receiver) {
            ClrObject object = ManagedReference.receiver(receiver);
            return field.getValueType() == null ? new ManagedReference.Member(object, field) : field.readRaw(object);
        }
    }
    @Operation @ConstantOperand(type = Field.class)
    public static final class StaticAddress {
        @Specialization static Object execute(Field field) {
            field.getOwner().ensureInitialized();
            return field.getValueType() == null ? new ManagedReference.Member(field.getOwner().getStaticObject(), field) : field.readRaw(field.getOwner().getStaticObject());
        }
    }
    @Operation @ConstantOperand(type = Type.class) @ConstantOperand(type = boolean.class, name = "readOnly")
    public static final class ArrayAddress {
        @Specialization static Object execute(Type type, boolean readOnly, Object array, int index) {
            if (array == null || array == types.CTSNull.INSTANCE) throw ClrException.create("NullReferenceException", "ldelema receiver");
            int length = array instanceof ManagedReference.ObjectArray a ? a.values.length : java.lang.reflect.Array.getLength(array);
            if (index < 0 || index >= length) throw ClrException.create("IndexOutOfRangeException", "Index was outside the bounds of the array.");
            if (!readOnly && !ManagedReference.hasElementType(type, array)) throw ClrException.create("ArrayTypeMismatchException", "Array element type is incompatible with " + type.getName());
            return type.isValueType() ? ((ManagedReference.ObjectArray) array).values[index] : new ManagedReference.Element(null, array, index);
        }
    }
    @Operation @ConstantOperand(type = Type.class)
    public static final class ObjectArrayNew {
        @Specialization static Object execute(Type type, int size) {
            return new ManagedReference.ObjectArray(type, size);
        }
    }
    @Operation @ConstantOperand(type = Type.class)
    public static final class InitializeType {
        @Specialization static void execute(Type type) { type.ensureInitialized(); }
    }
    @Operation @ConstantOperand(type = main.compilationNodes.Initialize.class)
    public static final class InitializeContext {
        @Specialization static void initialize(main.compilationNodes.Initialize initializer) { initializer.install(); }
    }
    @Operation @ConstantOperand(type = Field.class)
    public static final class StaticStore {
        @Specialization static void execute(Field field, Object value) {
            field.getOwner().ensureInitialized();
            field.write(field.getOwner().getStaticObject(), value);
        }
    }
}
