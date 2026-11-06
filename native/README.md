# Native DLL reader

`cargo build --manifest-path native/Cargo.toml --release --locked` builds the
`dllreader` shared library. Gradle builds and packages the host library under
`/native/`. On POSIX filesystems the FFM bridge reuses a private library cache
under `~/.truffleclr/native/`, validating ownership, write permissions and exact
resource bytes before loading. Otherwise it uses a temporary extraction. Cargo
must be on PATH. A new cache entry still pays first-load OS verification; later
JVMs reuse the inode rather than paying macOS dylib verification on every launch.
See [SCHEMA.md](SCHEMA.md) for the ABI and structured JSON contract.

`native/vendor/dotnetdll` vendors dotnetdll 0.4.0 via `[patch.crates-io]`,
including the spike's `src/resolution/lazy.rs` fix: exception-region end offsets
may equal the complete code size, not the last instruction offset plus one.
The latter is wrong when the final instruction occupies multiple bytes. Keep
this patch when updating the dependency. Vendored sources retain their license.

The JVM initially maps type headers via `dll_index`; `dll_type` maps member
metadata only when a type is reached or requested through host bindings. Runtime
shapes are likewise prepared on demand. Unused unsupported native declarations
therefore do not prevent loading an assembly; they still fail when requested.
`dll_metadata` remains available for full native metadata export without bodies.
RVA field data is bounded to the declared value size, not the remainder of its
PE section.

Metadata serialization never requests method bodies. Each assembly handle owns
its input bytes and lazy Resolution; body requests decode and cache individual
methods. JVM contexts close all their handles, including on parse failure.
UTF-16 strings and floating-point bit patterns survive the JSON boundary.

Verification uses the launcher end-to-end suite with both DLL and IL inputs.
