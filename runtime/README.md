# Minimal CoreLib

Rebuild on macOS with .NET 10 and the matching native ildasm (the checked-in
disassembler is Linux-only):

```sh
export DOTNET_ROOT=/tmp/dotnet
make -C runtime DOTNET=/tmp/dotnet/dotnet ILDASM=/Users/alex4o/.cache/truffleclr-tools/ildasm
```

Use stdout redirection, not ildasm’s `-out` option: stdout avoids a UTF-8 BOM.
The ildasm 10 `-utf8` output parses without the old `-lin -cav` flags.
The generated resource is checked in. After rebuilding, run
`./gradlew :launcher:test` from `truffleclr/`.
