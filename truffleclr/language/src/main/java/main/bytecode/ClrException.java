package main.bytecode;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.exception.AbstractTruffleException;
import main.Clr;
import runtime.ClrObject;
import runtime.Type;

/** The host throwable preserves the guest object across calls and rethrow. */
public final class ClrException extends AbstractTruffleException {
    public final ClrObject object;

    public ClrException(ClrObject object) {
        super(null, null, UNLIMITED_STACK_TRACE, null);
        this.object = object;
    }

    @Override @TruffleBoundary
    public String getMessage() {
        Type type = object.getType();
        while (!type.getName().equals("System.Exception")) type = type.getBaseType();
        Object message = type.resolveField("_message").readRaw(object);
        return object.getType().getName() + ": " + (message == null || message == types.CTSNull.INSTANCE ? "" : message);
    }

    public static void checkIndex(int index, int length) {
        if (index < 0 || index >= length) throw create("IndexOutOfRangeException", "Index was outside the bounds of the array.");
    }

    @TruffleBoundary
    public static ClrException invalidReference(Object value) {
        return value == null || value == types.CTSNull.INSTANCE
            ? create("NullReferenceException", "Object reference not set to an instance of an object.")
            : create("InvalidCastException", "Specified cast is not valid.");
    }

    @TruffleBoundary
    public static ClrException create(String name, String message) {
        Type type = Clr.contextReference.get(null).getTypes().get("System." + name);
        ClrObject object = type.newValue();
        type.resolveField("_message").writeRaw(object, message);
        return new ClrException(object);
    }
}
