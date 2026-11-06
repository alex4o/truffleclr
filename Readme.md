TruffleCLR
==========

The main goal of this project is to implement the Common Language Infrastructure (CLI) using Truffle [GraalVM]. The project requires the the use of a disassembled file in the `.il` format. To obtain that file the `ildasm` program should be used. The main component of this project resides inside of the `truffleclr` folder. 

## What runs

C# classes, virtual methods, statics and type initializers; structs, managed refs,
boxing/unboxing; CLR exceptions; specialized generics, interfaces and constrained
calls; and `async Task` / `async Task<T>` with Debug and Release state machines.
The minimal CoreLib includes basic Console, String.Concat, object/value equality,
and Math operations. It is not a replacement for the full .NET BCL.

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

JDK 25; use GraalVM CE 25 for JIT compilation (on a stock JDK Truffle falls back to the interpreter). The Gradle wrapper downloads everything else. Versions are pinned in `truffleclr/gradle/libs.versions.toml`.

## Building

Inside the `truffleclr` folder: `./gradlew :launcher:installDist`. The ANTLR parser is generated from `language/src/main/antlr/Cil.g4` during the build.

## Running

`launcher/build/install/launcher/bin/launcher --class HelloWorld.Program test/loop.il`. Help: `launcher/build/install/launcher/bin/launcher --help`.

## Testing

`./gradlew :launcher:test` runs every `test/<name>.il` that has a `test/expected/<name>.out` and compares the output.

## Obtaining CIL (.il) files
To execute a program an `.il` file is needed. The instructions below describe how such file can be obtained when using the 2 C# compilers on supporting linux.

### Mono
After a C# program has been compiled an `.exe` file is produced. This file can then directly be given to `ildasm`.

### NetCore
When using NetCore the resulting binary is a `.dll` file. It can be found using `./bin/*/*/*.dll`. This file can then be disassembled using `ildasm`.

