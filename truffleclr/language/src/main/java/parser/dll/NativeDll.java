package parser.dll;

import java.io.IOException;
import java.io.InputStream;
import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.nio.file.Files;
import java.nio.file.Path;

/** Owns one lazy native Resolution. All calls, including close, share one lock. */
public final class NativeDll implements AutoCloseable {
    private static final Linker LINKER = Linker.nativeLinker();
    private static final Arena LIBRARY_ARENA = Arena.ofShared();
    private static final SymbolLookup LIBRARY = loadLibrary();
    private static final boolean WIDE_SIZE = ValueLayout.ADDRESS.byteSize() == Long.BYTES;
    private static final MethodHandle OPEN = bind("dll_open", FunctionDescriptor.of(
        ValueLayout.ADDRESS, ValueLayout.ADDRESS, WIDE_SIZE ? ValueLayout.JAVA_LONG : ValueLayout.JAVA_INT));
    private static final MethodHandle ERROR = bind("dll_last_error", FunctionDescriptor.of(ValueLayout.ADDRESS));
    private static final MethodHandle METADATA = bind("dll_metadata", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    private static final MethodHandle BODY = bind("dll_body", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
    private static final MethodHandle FREE = bind("dll_free", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    private static final MethodHandle CLOSE = bind("dll_close", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    private MemorySegment handle = MemorySegment.NULL;

    public NativeDll(byte[] bytes) {
        try (Arena input = Arena.ofConfined()) {
            MemorySegment data = input.allocateFrom(ValueLayout.JAVA_BYTE, bytes);
            handle = WIDE_SIZE ? (MemorySegment) OPEN.invokeExact(data, (long) bytes.length)
                : (MemorySegment) OPEN.invokeExact(data, bytes.length);
            if (handle.address() == 0) {
                throw new IllegalArgumentException("Cannot open DLL: " + ownedJson((MemorySegment) ERROR.invokeExact()));
            }
        } catch (Throwable failure) {
            // Covers a failure while releasing the input arena after a successful open.
            try { close(); } catch (Throwable cleanup) { failure.addSuppressed(cleanup); }
            throw propagate(failure);
        }
    }

    public synchronized String metadata() {
        requireOpen();
        try { return ownedJson((MemorySegment) METADATA.invokeExact(handle)); }
        catch (Throwable failure) { throw propagate(failure); }
    }

    public synchronized String body(long methodId) {
        requireOpen();
        if (methodId < 0) throw new IllegalArgumentException("Negative method id: " + methodId);
        try { return ownedJson((MemorySegment) BODY.invokeExact(handle, methodId)); }
        catch (Throwable failure) { throw propagate(failure); }
    }

    private void requireOpen() {
        if (handle.address() == 0) throw new IllegalStateException("DLL handle is closed");
    }

    @Override public synchronized void close() {
        if (handle.address() == 0) return;
        MemorySegment closing = handle;
        handle = MemorySegment.NULL;
        try { CLOSE.invokeExact(closing); }
        catch (Throwable failure) { throw propagate(failure); }
    }

    private static String ownedJson(MemorySegment pointer) throws Throwable {
        if (pointer.address() == 0) throw new IllegalStateException("Native DLL reader returned null JSON");
        try { return pointer.reinterpret(Long.MAX_VALUE).getString(0); }
        finally { FREE.invokeExact(pointer); }
    }

    private static MethodHandle bind(String name, FunctionDescriptor descriptor) {
        return LINKER.downcallHandle(LIBRARY.find(name).orElseThrow(
            () -> new UnsatisfiedLinkError("Missing native DLL reader symbol: " + name)), descriptor);
    }

    private static SymbolLookup loadLibrary() {
        String name = System.mapLibraryName("dllreader");
        String resource = "/native/" + name;
        try (InputStream input = NativeDll.class.getResourceAsStream(resource)) {
            if (input == null) throw new IOException("Missing classpath resource: " + resource);
            Path directory = Files.createTempDirectory("truffleclr-dllreader-");
            directory.toFile().deleteOnExit();
            Path library = directory.resolve(name);
            library.toFile().deleteOnExit();
            Files.copy(input, library);
            return SymbolLookup.libraryLookup(library, LIBRARY_ARENA);
        } catch (IOException | RuntimeException | Error failure) {
            LIBRARY_ARENA.close();
            throw new ExceptionInInitializerError(failure);
        }
    }

    private static RuntimeException propagate(Throwable failure) {
        if (failure instanceof Error error) throw error;
        return failure instanceof RuntimeException runtime ? runtime : new IllegalStateException("Native DLL reader call failed", failure);
    }
}
