---
name: fetching-truffle-documentation
description: Fetches information from official GraalVM, Truffle, and Graal compiler documentation for API guidance, performance optimization, compiler flags, profiling, specializations, Bytecode DSL, Truffle DSL, partial evaluation, and compilation analysis. Use when you need authoritative documentation about Truffle framework, GraalVM compiler options, or optimization techniques. Use when asking about Truffle API, compiler flags, specialization patterns, or Graal options.
---

# Fetching Truffle Documentation

Searches official GraalVM, Truffle, and Graal compiler documentation to answer technical questions about APIs, performance optimization, and compiler behavior.

## Primary Documentation Sources

**GraalVM Official Docs**: https://docs.oracle.com/en/graalvm/

- Language implementation guides
- Tools and utilities
- Performance optimization guides

**GraalVM Tools Javadoc**: https://www.graalvm.org/tools/javadoc/

- API reference for `com.oracle.truffle.api.*` packages
- Node implementations, frame management, interop protocols

**Graal GitHub Repository**: https://github.com/oracle/graal

- Truffle framework documentation in `/truffle/docs/`
- Compiler documentation in `/compiler/docs/`
- SimpleLanguage reference implementation

## Key Documentation Paths

**Performance Optimization**:

- `/truffle/docs/Optimizing.md` - Optimization strategies
- `/truffle/docs/Profiling.md` - Profiling tools
- `/compiler/docs/` - Graal compiler tuning

**Truffle Framework**:

- `/truffle/docs/LanguageTutorial.md` - Language implementation guide
- `/truffle/docs/DSL.md` - Truffle DSL specializations
- `/truffle/docs/BytecodeDSL.md` - Bytecode DSL implementation

## Compiler Options Quick Reference

**Profiling and Tracing**:

- `--engine.TraceCompilation` - Log compilation events
- `--engine.TracePerformanceWarnings` - Detect optimization barriers
- `--engine.TraceInlining` - Show inlining decisions
- `--cpusampler`, `--cputracer`, `--memtracer` - Profiling tools

**Diagnostic Options**:

- `-Djdk.graal.Dump=Truffle` - Dump compiler graphs
- `-Djdk.graal.PrintGraph=File` - Output format for graphs

## When to Use This Skill

Search documentation when you need:

- Explanation of compiler flags or profiling tools
- API usage for Truffle DSL or Bytecode DSL
- Performance optimization strategies
- Understanding of compiler warnings or deoptimization causes
