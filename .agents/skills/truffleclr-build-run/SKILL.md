---
name: truffleclr-build-run
description: Build, run and test TruffleCLR (CIL interpreter on GraalVM Truffle, Kotlin). Use when compiling the Gradle project, running an .il program through the launcher, running the e2e FullOutputTest, changing the ANTLR Cil grammar, or debugging toolchain/version errors.
---

# TruffleCLR: build, run, test

Repo layout (root = git root):
- `truffleclr/` Gradle build. `language/` = Truffle language (`main/Clr.kt`), `launcher/` = clikt CLI + e2e test.
- `truffleclr/test/*.il` programs (benchmarks + feature tests); `test/cs/Program_*.cs` their C# sources; `test/expected/*.out` expected stdout.
- `runtime/libraries/System.Private.CoreLib/` minimal C# CoreLib → `language/src/main/resources/System.Private.CoreLib.il` (loaded from the classpath).
- `parser/`, `opparse/` historical generators. Not part of the build.
- `bench/` historical (2020) benchmark CSVs + `plot.py`.

## Toolchain

Versions live in `truffleclr/gradle/libs.versions.toml`: Gradle 9.8.2 wrapper (Kotlin DSL), Kotlin 2.4 + kapt (Truffle DSL processor generates `*NodeGen`), Truffle/Polyglot 25.5, ANTLR 4.13, JVM toolchain 25.

- Use a GraalVM JDK 25 for JIT: `export JAVA_HOME=$(/usr/libexec/java_home -v 25)` (installed: GraalVM CE 25.5 in `~/Library/Java/JavaVirtualMachines`). A stock JDK 25 builds and runs, but Truffle falls back to the interpreter and prints a fallback-runtime warning.
- Upgrade Gradle with skill `gradle-wrapper-upgrade`; audit the build with `gradle-best-practices`.

## Build and run

```bash
cd truffleclr
./gradlew :launcher:installDist
launcher/build/install/launcher/bin/launcher --class HelloWorld.Program test/loop.il
```

Works from any cwd. All test programs use `HelloWorld.Program`; the launcher calls the member whose key contains `Main(` and prints `Completed in: Nms`. JVM flags: `JAVA_OPTS="-Dpolyglot.engine.TraceCompilation=true" launcher/...` (see the Truffle performance skills, e.g. `tracing-compilation-events`).

## Test (e2e only)

```bash
./gradlew :launcher:test
```

`launcher/src/test/kotlin/FullOutputTest.kt` runs `test/<name>.il` for every `test/expected/<name>.out` and compares stdout line by line. Expected outputs were recorded from the 2020 build and checked against .NET where sources match. `spectralnorm` has no expected file: it hits an unimplemented opcode. No unit tests; add coverage by adding a program (skill `truffleclr-add-test-program`).

Caveat: `assertLinesEquals` zips lists, so extra or missing trailing lines pass. Compare line counts when output length matters.

## Grammar

`language/src/main/antlr/Cil.g4` is compiled by the Gradle `antlr` plugin into `language/build/generated-src/antlr/main` (package `Cil`, `-visitor`) on every build; nothing generated is checked in. Visitors consuming the tree: `language/src/main/kotlin/parser/cil/{DeclVisitor,ClassVisitor,MethodVisitor,Util}.kt`.
