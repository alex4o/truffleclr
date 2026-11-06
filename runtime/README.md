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

`RuntimeHelpers.InitializeArray` supports primitive-vector initializers emitted
by C#: field `ldtoken` carries managed RVA data in a `RuntimeFieldHandle`, and
the helper copies its bounded payload in little-endian order. This is not general
reflection or RVA static-storage support; direct access to RVA fields is rejected.
Text IL `.data` declarations remain unsupported, so the array-output fixture uses
the compiled DLL.

After rebuilding, run `./gradlew :launcher:test` from `truffleclr/`.
