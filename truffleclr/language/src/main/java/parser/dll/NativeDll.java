package parser.dll;

import java.io.IOException;
import java.io.InputStream;
import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.LinkOption;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Arrays;
import java.util.zip.CRC32;

/** Owns one lazy native Resolution. All calls, including close, share one lock. */
public final class NativeDll implements AutoCloseable {
    private static final boolean TRACE = Boolean.getBoolean("clr.traceLoading");
    private static final long INIT_START = System.nanoTime();
    private static final Linker LINKER = createLinker();
    private static final Arena LIBRARY_ARENA = Arena.ofShared();
    private static final SymbolLookup LIBRARY = loadLibrary();
    private static final boolean WIDE_SIZE = ValueLayout.ADDRESS.byteSize() == Long.BYTES;
    private static final MethodHandle OPEN = bind("dll_open", FunctionDescriptor.of(
        ValueLayout.ADDRESS, ValueLayout.ADDRESS, WIDE_SIZE ? ValueLayout.JAVA_LONG : ValueLayout.JAVA_INT));
    private static final class ErrorCall {
        static final MethodHandle HANDLE = bind("dll_last_error", FunctionDescriptor.of(ValueLayout.ADDRESS));
    }
    private static final class MetadataCall {
        static final MethodHandle HANDLE = bind("dll_metadata", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    }
    private static final MethodHandle INDEX = bind("dll_index", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    private static final MethodHandle TYPE = bind("dll_type", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
    private static final MethodHandle BODY = bind("dll_body", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
    private static final MethodHandle FREE = bind("dll_free", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    private static final MethodHandle CLOSE = bind("dll_close", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    static { trace("NativeDll class initialization", INIT_START); }
    private MemorySegment handle = MemorySegment.NULL;

    public NativeDll(byte[] bytes) {
        try (Arena input = Arena.ofConfined()) {
            MemorySegment data = input.allocateFrom(ValueLayout.JAVA_BYTE, bytes);
            long start = System.nanoTime();
            handle = WIDE_SIZE ? (MemorySegment) OPEN.invokeExact(data, (long) bytes.length)
                : (MemorySegment) OPEN.invokeExact(data, bytes.length);
            trace("dll_open native", start);
            if (handle.address() == 0) {
                throw new IllegalArgumentException("Cannot open DLL: " + ownedJson((MemorySegment) ErrorCall.HANDLE.invokeExact()));
            }
        } catch (Throwable failure) {
            // Covers a failure while releasing the input arena after a successful open.
            try { close(); } catch (Throwable cleanup) { failure.addSuppressed(cleanup); }
            throw propagate(failure);
        }
    }

    public synchronized String metadata() {
        requireOpen();
        try {
            long start = System.nanoTime();
            MemorySegment json = (MemorySegment) MetadataCall.HANDLE.invokeExact(handle);
            trace("dll_metadata native JSON", start);
            return ownedJson(json);
        }
        catch (Throwable failure) { throw propagate(failure); }
    }

    public synchronized String index() {
        requireOpen();
        try {
            long start = System.nanoTime();
            MemorySegment json = (MemorySegment) INDEX.invokeExact(handle);
            trace("dll_index native JSON", start);
            return ownedJson(json);
        } catch (Throwable failure) { throw propagate(failure); }
    }

    public synchronized String type(long typeId) {
        requireOpen();
        if (typeId < 0) throw new IllegalArgumentException("Negative type id: " + typeId);
        try {
            long start = System.nanoTime();
            MemorySegment json = (MemorySegment) TYPE.invokeExact(handle, typeId);
            trace("dll_type native JSON", start);
            return ownedJson(json);
        } catch (Throwable failure) { throw propagate(failure); }
    }

    public synchronized String body(long methodId) {
        requireOpen();
        if (methodId < 0) throw new IllegalArgumentException("Negative method id: " + methodId);
        try {
            long start = System.nanoTime();
            MemorySegment json = (MemorySegment) BODY.invokeExact(handle, methodId);
            trace("dll_body native JSON", start);
            return ownedJson(json);
        }
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
        long start = System.nanoTime();
        try { return pointer.reinterpret(Long.MAX_VALUE).getString(0); }
        finally {
            trace("ownedJson getString", start);
            start = System.nanoTime();
            FREE.invokeExact(pointer);
            trace("ownedJson free", start);
        }
    }

    private static MethodHandle bind(String name, FunctionDescriptor descriptor) {
        long start = System.nanoTime();
        try {
            return LINKER.downcallHandle(LIBRARY.find(name).orElseThrow(
                () -> new UnsatisfiedLinkError("Missing native DLL reader symbol: " + name)), descriptor);
        } finally { trace("downcall bind " + name, start); }
    }

    private static SymbolLookup loadLibrary() {
        long start = System.nanoTime();
        String name = System.mapLibraryName("dllreader");
        String resource = "/native/" + name;
        try (InputStream input = NativeDll.class.getResourceAsStream(resource)) {
            if (input == null) throw new IOException("Missing classpath resource: " + resource);
            byte[] bytes = input.readAllBytes();
            trace("native resource read", start);
            Path library;
            try { library = cachedLibrary(name, bytes); }
            catch (IOException unavailableCache) {
                if (TRACE) System.err.println("[clr.loading] native cache unavailable: " + unavailableCache.getMessage());
                library = temporaryLibrary(name, bytes);
            }
            trace("native library extract", start);
            start = System.nanoTime();
            SymbolLookup lookup = SymbolLookup.libraryLookup(library, LIBRARY_ARENA);
            trace("native library load", start);
            return lookup;
        } catch (IOException | RuntimeException | Error failure) {
            LIBRARY_ARENA.close();
            throw new ExceptionInInitializerError(failure);
        }
    }

    /** Reusing the verified inode avoids macOS re-verifying a new dylib on every launch. */
    private static Path cachedLibrary(String name, byte[] bytes) throws IOException {
        long start = System.nanoTime();
        CRC32 checksum = new CRC32();
        checksum.update(bytes);
        // This is only a bucket key: every cache hit is verified byte-for-byte.
        String bucket = Long.toHexString(checksum.getValue()) + "-" + bytes.length;
        trace("native cache checksum", start);
        Path home = Path.of(System.getProperty("user.home")).toAbsolutePath().normalize();
        Path directory = home.resolve(".truffleclr/native").resolve(bucket);
        if (!directory.getFileSystem().supportedFileAttributeViews().contains("posix")) {
            throw new IOException("Native cache requires POSIX permission checks");
        }
        Files.createDirectories(directory, PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rwx------")));
        // Do not reuse a cache another OS user can replace between validation and dlopen.
        var owner = Files.getOwner(home);
        for (Path current = directory; current != null; current = current.getParent()) {
            if (!Files.isDirectory(current, LinkOption.NOFOLLOW_LINKS) || !Files.getOwner(current).equals(owner)) {
                throw new IOException("Unsafe native cache directory: " + current);
            }
            if (current.getFileSystem().supportedFileAttributeViews().contains("posix")) {
                var permissions = Files.getPosixFilePermissions(current);
                if (permissions.contains(PosixFilePermission.GROUP_WRITE) || permissions.contains(PosixFilePermission.OTHERS_WRITE)) {
                    throw new IOException("Writable native cache directory: " + current);
                }
            }
            if (current.equals(home)) break;
        }
        Path library = directory.resolve(name);
        if (Files.isRegularFile(library, LinkOption.NOFOLLOW_LINKS)) {
            if (!Files.getOwner(library).equals(owner)) throw new IOException("Unsafe native cache file owner: " + library);
            if (library.getFileSystem().supportedFileAttributeViews().contains("posix")) {
                var permissions = Files.getPosixFilePermissions(library);
                if (permissions.contains(PosixFilePermission.GROUP_WRITE) || permissions.contains(PosixFilePermission.OTHERS_WRITE)) {
                    throw new IOException("Writable native cache file: " + library);
                }
            }
            if (!Arrays.equals(bytes, Files.readAllBytes(library))) {
                // A checksum collision must neither load the wrong code nor break a valid assembly.
                return temporaryLibrary(name, bytes);
            }
            return library;
        }
        if (Files.exists(library, LinkOption.NOFOLLOW_LINKS)) throw new IOException("Invalid native library cache: " + library);
        Path temporary = Files.createTempFile(directory, "extract-", ".tmp");
        try {
            Files.write(temporary, bytes);
            Files.move(temporary, library, StandardCopyOption.ATOMIC_MOVE);
        } finally { Files.deleteIfExists(temporary); }
        return library;
    }

    private static Path temporaryLibrary(String name, byte[] bytes) throws IOException {
        Path temporary = Files.createTempFile("truffleclr-dllreader-", name);
        temporary.toFile().deleteOnExit();
        Files.write(temporary, bytes);
        return temporary;
    }

    private static Linker createLinker() {
        long start = System.nanoTime();
        try { return Linker.nativeLinker(); }
        finally { trace("Linker.nativeLinker", start); }
    }

    private static void trace(String phase, long start) {
        if (!TRACE) return;
        long end = System.nanoTime();
        System.err.println("[clr.loading] " + phase + " start_ns=" + start + " end_ns=" + end
            + " duration_ms=" + (end - start) / 1_000_000.0);
    }

    private static RuntimeException propagate(Throwable failure) {
        if (failure instanceof Error error) throw error;
        return failure instanceof RuntimeException runtime ? runtime : new IllegalStateException("Native DLL reader call failed", failure);
    }
}
