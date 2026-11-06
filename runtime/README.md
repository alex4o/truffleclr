# Minimal CoreLib

Rebuild with the .NET 10 SDK; no disassembler is required:

```sh
export DOTNET_ROOT=/tmp/dotnet
make -C runtime DOTNET=/tmp/dotnet/dotnet
```

The build copies the compiled assembly to
`truffleclr/language/src/main/resources/System.Private.CoreLib.dll`. This binary
resource is loaded directly; there is no IL-disassembly step. Rust and Cargo are
required to build the native assembly loader used by TruffleCLR.

After rebuilding, run `./gradlew :launcher:test` from `truffleclr/`.
