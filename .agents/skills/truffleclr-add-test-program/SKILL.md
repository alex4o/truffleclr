---
name: truffleclr-add-test-program
description: Add or regenerate a TruffleCLR end-to-end test: write C#, compile, disassemble to .il, record the expected .out with dotnet/mono, and run FullOutputTest. Use when adding test programs or benchmarks, reproducing an interpreter bug, or updating test/expected files.
---

# Add a TruffleCLR test program

Pipeline: `test/cs/Program_<name>.cs` → assembly → `test/<name>.il` → `test/expected/<name>.out` → `FullOutputTest`. Paths relative to `truffleclr/`.

## 1. Write C#

- `namespace HelloWorld { class Program { static void Main(string[] args) { ... } } }` — the test harness hardcodes `HelloWorld.Program`.
- Use only supported BCL calls: see `language/src/main/kotlin/nodes/internal/InternalTable.kt` (Console.Write/WriteLine/Read, Convert.ToBoolean/ToChar, File.ReadAllBytes, Math.Sqrt, String.Concat(string[]), Int32.ToString). Anything else needs skill `truffleclr-internal-call`.
- No exceptions, `switch` opcode, generics, delegates/closures, `try`: their opcodes are `TODO("not implemented")` in `main/GraphToNodes.kt`. Check `grep -n '"<opcode>"' language/src/main/kotlin/main/GraphToNodes.kt`.
- Print deterministic output (no time, no hash codes) so goldens are stable.

## 2. Compile and disassemble

Either toolchain:

```bash
# Mono
mcs -out:test/<name>.exe test/cs/Program_<name>.cs
monodis test/<name>.exe > test/<name>.il          # or: ildasm test/<name>.exe > test/<name>.il
# .NET (project per program)
dotnet build && ildasm ./bin/*/*/*.dll > test/<name>.il
```

`runtime/ildasm` is a Linux x86-64 binary; on macOS use `dotnet tool install -g dotnet-ildasm` (output format may differ) or a Linux container. Compare the header and method-body syntax with an existing `test/*.il`; if the parser rejects new syntax, extend `Cil.g4` (skill `truffleclr-build-run`).

## 3. Record the expected output

Preferred (.NET 10+ file-based apps, any OS):

```bash
mkdir /tmp/<name> && cp test/cs/Program_<name>.cs /tmp/<name>/Program.cs
(cd /tmp/<name> && dotnet run Program.cs) > test/expected/<name>.out
```

Check for compiler warnings on stdout and remove them. Alternative: `test/Makefile` reassembles each `.il` with `ilasm` and runs it under `mono` into `out/`; copy the result to `test/expected/`. Doubles must match `ConsoleWriteLine` formatting (max 15 fraction digits, locale `DecimalFormat`), unlike .NET's shortest round-trip format; booleans print `True`/`False`.

## 4. Verify

```bash
./gradlew :launcher:test
```

Also run the program via the launcher and compare line counts (`wc -l`) with the expected file: the assertion ignores length mismatches. Commit `.cs`, `.il` and `test/expected/<name>.out`; not `.exe`.
