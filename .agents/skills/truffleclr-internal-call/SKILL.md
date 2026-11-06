---
name: truffleclr-internal-call
description: Add a BCL/system method to TruffleCLR's minimal CoreLib as an InternalCall backed by a Kotlin Truffle node. Use when a program calls a System.* method that is missing (e.g. Math.Abs, Console.Write overloads, String methods), or when changing InternalTable.kt or runtime/libraries/System.Private.CoreLib.
---

# Add an internal (native) BCL method

TruffleCLR does not use the real .NET CoreLib. It parses a tiny hand-written one at startup, and `internalcall` methods in it dispatch to Kotlin nodes.

## Flow

`runtime/libraries/System.Private.CoreLib/*.cs` → `dotnet build` → `runtime/Makefile` (`ildasm -lin -cav -utf`) → `truffleclr/language/src/main/resources/System.Private.CoreLib.il` → `Clr.parse` loads it before the user program → methods marked `internalcall` compile via `CompileMethod.compileInternal` to `InternalMethod(InternalTable entry)`.

## Steps

1. Declare the stub in C# (existing file or new one in `runtime/libraries/System.Private.CoreLib/`, e.g. `MyMath.cs`):
   ```csharp
   [MethodImpl(MethodImplOptions.InternalCall)]
   public static extern double Abs(double v);
   ```
   Types that already exist: see the directory listing (Object, String, Int32, Double, Char, Byte, Boolean, Array, Enum, ValueType, Console, Convert, IO.File, Math).
2. Regenerate the CoreLib IL:
   ```bash
   cd runtime/libraries/System.Private.CoreLib && dotnet build
   cd ../.. && make      # needs Linux x86-64 for ./ildasm
   ```
   Without Linux/ildasm: hand-edit `System.Private.CoreLib.il` by copying a neighbouring stub, e.g. `Math::Sqrt` (`.method public hidebysig static float64 Sqrt(float64 o) cil managed internalcall {}`). Keep the C# and IL in sync.
3. Implement the node in `truffleclr/language/src/main/kotlin/nodes/internal/`, following `Sqrt.kt` / `ConsoleWriteLine.kt`:
   ```kotlin
   @NodeInfo(description = "Math.Abs")
   class Abs : ExpressionNode() {
       override fun execute(env: VirtualFrame): Any? = kotlin.math.abs(env.arguments[0] as Double)
   }
   ```
   Arguments come from `env.arguments` (instance methods: index 0 is `this`). Return `CTSNull` for `void`. Write output through `Clr.contextReference.get(this).output` (the context's cached `PrintStream` over `env.out()`), never `System.out`: tests capture the context stream. Wrap Java library calls in `@CompilerDirectives.TruffleBoundary`.
4. Register in `nodes/internal/InternalTable.kt` under the exact `IlMethod.toString()` key: `"<ReturnType> <Namespace.Type>::<Name>(<ArgType>,<ArgType>)"` with full CLR names, no spaces after commas, e.g. `"System.Double System.Math::Abs(System.Double)"`. A mismatched key fails with `NullPointerException` at `initialize.internalMethods[method.toString()]!!`; `CompileMethod` prints `Internal: <key>` for each compiled internal, use that to copy the exact string.
5. Add a test program calling it (skill `truffleclr-add-test-program`) and run the tests (skill `truffleclr-build-run`).
