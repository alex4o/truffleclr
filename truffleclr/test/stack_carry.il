.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly HelloWorld {}
.module HelloWorld.dll

.namespace HelloWorld
{
  .class private auto ansi beforefieldinit Program extends [System.Runtime]System.Object
  {
    // Both successors retain two values; the join retains the result.
    .method private static hidebysig default int32 Conditional(int32 flag) cil managed
    {
      .maxstack 3
      IL_0000: ldc.i4.s 10
      IL_0001: ldc.i4.s 20
      IL_0002: ldarg.0
      IL_0003: brtrue IL_0006
      IL_0004: sub
      IL_0005: br IL_0007
      IL_0006: add
      IL_0007: ret
    }

    // A comparison consumes only its two operands, not the carried values.
    .method private static hidebysig default int32 Compare(int32 flag) cil managed
    {
      .maxstack 4
      IL_0000: ldc.i4.6
      IL_0001: ldc.i4.7
      IL_0002: ldarg.0
      IL_0003: ldc.i4.0
      IL_0004: bgt IL_0007
      IL_0005: sub
      IL_0006: br IL_0008
      IL_0007: mul
      IL_0008: ret
    }

    .method private static hidebysig default void Main(string[] args) cil managed
    {
      .entrypoint
      .maxstack 3
      .locals init (int32 V_0)
      IL_0000: ldc.i4.0
      IL_0001: call int32 HelloWorld.Program::Conditional(int32)
      IL_0002: call void class [mscorlib]System.Console::WriteLine(int32)
      IL_0003: ldc.i4.1
      IL_0004: call int32 HelloWorld.Program::Conditional(int32)
      IL_0005: call void class [mscorlib]System.Console::WriteLine(int32)
      IL_0006: ldc.i4.0
      IL_0007: call int32 HelloWorld.Program::Compare(int32)
      IL_0008: call void class [mscorlib]System.Console::WriteLine(int32)
      IL_0009: ldc.i4.1
      IL_000a: call int32 HelloWorld.Program::Compare(int32)
      IL_000b: call void class [mscorlib]System.Console::WriteLine(int32)

      // An unconditional edge carries multiple values in bottom-to-top order.
      IL_000c: ldc.i4.7
      IL_000d: ldc.i4.8
      IL_000e: br IL_0011
      IL_0011: sub
      IL_0012: call void class [mscorlib]System.Console::WriteLine(int32)

      // The accumulator is live across entry, backedge, and loop exit.
      IL_0013: ldc.i4.3
      IL_0014: stloc.0
      IL_0015: ldc.i4.0
      IL_0016: br IL_0017
      IL_0017: ldc.i4.1
      IL_0018: add
      IL_0019: ldloc.0
      IL_001a: ldc.i4.1
      IL_001b: sub
      IL_001c: stloc.0
      IL_001d: ldloc.0
      IL_001e: brtrue IL_0017
      IL_001f: call void class [mscorlib]System.Console::WriteLine(int32)
      IL_0020: ret
    }
  }
}
