TruffleCLR
==========

The main goal of this project is to implement the Common Language Infrastructure (CLI) using Truffle [GraalVM]. Programs can be loaded directly from compiled .NET `.dll` assemblies or from disassembled `.il` files. The main component of this project resides inside the `truffleclr` folder.

## What runs

C# classes, virtual methods, statics and type initializers; structs, managed refs,
boxing/unboxing; CLR exceptions; specialized generics, interfaces and constrained
calls; and `async Task` / `async Task<T>` with Debug and Release state machines.
The minimal CoreLib includes basic Console, String.Concat, object/value equality,
Math operations, and DLL-backed primitive array initializers. It is not a
replacement for the full .NET BCL.

Async execution is single-threaded and deterministic: a FIFO continuation queue
and virtual-time `Task.Delay` timers are pumped by awaiter `GetResult` / `Result`.
`Task.Yield`, `CompletedTask`, and `FromResult` are supported. There are no host
threads or wall-clock waits. Infinite delays and delegate continuations fail
explicitly. Delegates/lambdas (`Task.Run`, `ContinueWith`), threads,
`ConfigureAwait`, `ValueTask`, cancellation tokens and `async void` are unsupported.
Generic virtual methods and variance remain unsupported. Double/float Console
formatting retains the existing formatter, not .NET shortest-round-trip output.

Generate output fixtures against .NET with
`test/mktest.sh <name> <source.cs> [Debug|Release]` from `truffleclr/`.

## Requirements

JDK 25; use GraalVM CE 25 for JIT compilation (on a stock JDK Truffle falls back to the interpreter). Install Rust with Cargo for the native assembly loader, and a .NET SDK to compile C# fixtures or rebuild CoreLib. The Gradle wrapper downloads Gradle and JVM dependencies. Versions are pinned in `truffleclr/gradle/libs.versions.toml`.

## Building

Inside the `truffleclr` folder: `./gradlew :launcher:installDist`. The ANTLR parser is generated from `language/src/main/antlr/Cil.g4` during the build.

## Running

From `truffleclr/`, run a binary assembly:

```sh
launcher/build/install/launcher/bin/launcher --class HelloWorld.Program test/dll/loop.dll
```

The same command accepts `test/loop.il` for the text format. DLL input uses the
`clr` language with MIME type `application/x-dotnet-assembly`.
Help: `launcher/build/install/launcher/bin/launcher --help`.

DLL type members, runtime shapes and method bodies are loaded on demand. The
native library is cached under `~/.truffleclr/native/` on POSIX filesystems;
first extraction still incurs OS verification, while subsequent JVMs reuse the
verified library. Set `JAVA_OPTS=-Dclr.traceLoading=true` for timestamped native
open/load, JSON transfer/decode, mapping, specialization and initialization
phases. Cache-hit measurements are fresh JVM launches, not warm engine reuse.

For performance comparisons, disassemble the same DLL rather than comparing
unrelated compiler output. Report eval, first execution and warmed execution
separately: ANTLR class loading can trigger a metadata GC and change G1 heap
growth, so a first-execution difference alone does not prove different guest
code. Use the same heap policy for controlled comparisons.

## Testing

`./gradlew :launcher:test` runs each available `test/dll/<name>.dll` and
`test/<name>.il` with a matching `test/expected/<name>.out`. Both variants compare
against the same expected output; test names identify the input path (including
Debug/Release fixture suffixes).

## Compiling programs and obtaining CIL (.il) files
Compile a C# program with `dotnet build`; its assembly is under
`bin/<configuration>/<target-framework>/`. Pass the program's `.dll` directly to
the launcher; disassembly is optional. The loader uses the project's minimal
CoreLib, not the full .NET BCL.

For text fixtures, the instructions below describe how to obtain `.il` files.

### Mono
After a C# program has been compiled an `.exe` file is produced. This file can then directly be given to `ildasm`.

### NetCore
When using .NET the resulting binary is a `.dll` file under `bin/*/*/`.
Run it directly with TruffleCLR, or disassemble it using `ildasm` for text input.

