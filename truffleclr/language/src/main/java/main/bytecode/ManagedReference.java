package main.bytecode;

import runtime.ClrObject;
import runtime.Field;
import runtime.Type;
import com.oracle.truffle.api.interop.TruffleObject;

/** Locations, not values: copying a byref preserves its identity. Address-taken
 * locals use cells so non-escaping references can be scalar replaced, without
 * materializing an entire Bytecode DSL frame. */
public abstract class ManagedReference implements TruffleObject {
    public abstract Object get();
    public abstract void setRaw(Object value);
    public abstract Type valueType();

    public static ClrObject receiver(Object value) {
        return (ClrObject) (value instanceof ManagedReference reference ? reference.get() : value);
    }
    public static final class Cell extends ManagedReference {
        private Object value;
        private final Type type;
        public void setRaw(Object next) { value = next; }
        public Cell(Type type, Object value) { this.type = type; this.value = value; }
        public Type valueType() { return type; }
        public Object get() { return value; }
    }
    public static final class Member extends ManagedReference {
        private final ClrObject receiver;
        private final Field field;
        public Member(ClrObject receiver, Field field) { this.receiver = java.util.Objects.requireNonNull(receiver); this.field = field; }
        @Override public boolean equals(Object other) { return other instanceof Member ref && receiver == ref.receiver && field == ref.field; }
        @Override public int hashCode() { return System.identityHashCode(receiver) * 31 + System.identityHashCode(field); }
        public Type valueType() { return field.getValueType(); }
        public Object get() { return field.readRaw(receiver); }
        public void setRaw(Object value) { field.writeRaw(receiver, value); }
    }
    public static final class ObjectArray implements TruffleObject {
        public final Type type;
        public final Object[] values;
        public void store(int index, Object value) {
            if (value == types.CTSNull.INSTANCE) value = null;
            Type actual = value instanceof Box box ? box.type : value instanceof ClrObject object ? object.getType() : null;
            if (value != null && (actual == null || !type.isAssignableFrom(actual)))
                throw new ArrayStoreException("Invalid element for " + type.getName());
            values[index] = value;
        }
        public ObjectArray(Type type, int size) {
            this.type = type;
            values = new Object[size];
            if (type.isValueType()) for (int i = 0; i < size; i++) values[i] = type.newValue();
        }
    }
    /** Kept distinct so guest exception handling can map this to System.ArrayTypeMismatchException. */
    public static final class ArrayTypeMismatchException extends RuntimeException {
        public ArrayTypeMismatchException(Type expected) {
            super("ldelema: array element type is incompatible with " + expected.getName());
        }
    }
    static boolean hasElementType(Type element, Object array) {
        if (array instanceof ObjectArray a) return a.type == element;
        return switch (element.getInfo().getType()) {
            case BOOLEAN -> array instanceof boolean[];
            case I1, U1 -> array instanceof byte[];
            case I2, U2 -> array instanceof short[];
            case CHAR -> array instanceof char[];
            case I4, U4 -> array instanceof int[];
            case I8, U8 -> array instanceof long[];
            case R4 -> array instanceof float[];
            case R8 -> array instanceof double[];
            case STRING -> array instanceof String[];
            default -> element.getName().equals("System.Object") && array.getClass() == Object[].class;
        };
    }
    public static final class Element extends ManagedReference {
        private final Object array;
        private final int index;
        private final Type type;
        public Type valueType() { return type; }
        @Override public boolean equals(Object other) { return other instanceof Element ref && array == ref.array && index == ref.index; }
        @Override public int hashCode() { return System.identityHashCode(array) * 31 + index; }
        public Element(Type type, Object array, int index) {
            this.type = type; this.array = array; this.index = index;
        }
        public Object get() {
            if (array instanceof ObjectArray a) return a.values[index];
            if (array instanceof Object[] a) return a[index];
            if (array instanceof int[] a) return a[index];
            if (array instanceof long[] a) return a[index];
            if (array instanceof double[] a) return a[index];
            if (array instanceof float[] a) return a[index];
            if (array instanceof byte[] a) return (int) a[index];
            if (array instanceof short[] a) return (int) a[index];
            if (array instanceof char[] a) return (int) a[index];
            if (array instanceof boolean[] a) return a[index] ? 1 : 0;
            throw new IllegalArgumentException("Not a managed array");
        }
        public void setRaw(Object value) {
            if (array instanceof ObjectArray a) a.store(index, value);
            else if (array instanceof Object[] a) {
                a[index] = value == types.CTSNull.INSTANCE ? null : value;
            }
            else if (array instanceof int[] a) a[index] = ((Number) value).intValue();
            else if (array instanceof long[] a) a[index] = ((Number) value).longValue();
            else if (array instanceof double[] a) a[index] = ((Number) value).doubleValue();
            else if (array instanceof float[] a) a[index] = ((Number) value).floatValue();
            else if (array instanceof byte[] a) a[index] = ((Number) value).byteValue();
            else if (array instanceof short[] a) a[index] = ((Number) value).shortValue();
            else if (array instanceof char[] a) a[index] = (char) ((Number) value).intValue();
            else if (array instanceof boolean[] a) a[index] = ((Number) value).intValue() != 0;
            else throw new IllegalArgumentException("Not a managed array");
        }
    }
    /** A box is a reference object, never an unboxed value for copy purposes. */
    public static final class Box extends ManagedReference {
        public final Type type;
        private Object value;
        public void setRaw(Object next) { value = next; }
        public Box(Type type, Object value) { this.type = type; this.value = type.isValueType() ? type.copyValue((ClrObject) value) : value; }
        public Type valueType() { return type.isValueType() ? type : null; }
        @Override @com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
        public String toString() {
            if (!type.isValueType()) return switch (type.getName()) {
                case "System.Boolean" -> (value instanceof Boolean b ? b : ((Number) value).intValue() != 0) ? "True" : "False";
                case "System.Char" -> String.valueOf(value instanceof Character c ? c.charValue() : (char) ((Number) value).intValue());
                case "System.UInt32" -> Integer.toUnsignedString(((Number) value).intValue());
                case "System.UInt64" -> Long.toUnsignedString(((Number) value).longValue());
                default -> String.valueOf(value);
            };
            for (runtime.Method method : type.getVirtualTable()) {
                if (method.getMetadata().getName().equals("ToString") && method.getMetadata().getArguments().isEmpty()
                        && method.getMetadata().getMemberOf().getFullName().equals(type.getName()))
                    return (String) method.getCallTarget().call(this);
            }
            return type.getName();
        }
        public Object get() { return value; }
    }
}
