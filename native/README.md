# Native DLL reader

`cargo build --manifest-path native/Cargo.toml --release --locked` builds the
`dllreader` shared library. Gradle builds and packages the host library under
`/native/`; the JVM FFM bridge extracts it once per JVM. Cargo must be on PATH.
See [SCHEMA.md](SCHEMA.md) for the ABI and structured JSON contract.

`native/vendor/dotnetdll` vendors dotnetdll 0.4.0 via `[patch.crates-io]`,
including the spike's `src/resolution/lazy.rs` fix: exception-region end offsets
may equal the complete code size, not the last instruction offset plus one.
The latter is wrong when the final instruction occupies multiple bytes. Keep
this patch when updating the dependency. Vendored sources retain their license.

Metadata serialization never requests method bodies. Each assembly handle owns
its input bytes and lazy Resolution; body requests decode and cache individual
methods. JVM contexts close all their handles, including on parse failure.
UTF-16 strings and floating-point bit patterns survive the JSON boundary.

Verification uses the launcher end-to-end suite with both DLL and IL inputs.
