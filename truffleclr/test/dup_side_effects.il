.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly HelloWorld {}
.module HelloWorld.dll

.namespace HelloWorld
{
  .class private auto ansi beforefieldinit Program extends [System.Runtime]System.Object
  {
    // The printed argument makes both evaluation order and repetition visible.
    .method private static hidebysig default int32 Tick(int32 input) cil managed
    {
      .maxstack 1
      IL_0000: ldarg.0
      IL_0001: call void class [mscorlib]System.Console::WriteLine(int32)
      IL_0002: ldarg.0
      IL_0003: ret
    }

    .method private static hidebysig default void Main(string[] args) cil managed
    {
      .entrypoint
      .maxstack 3
      .locals init (int32 V_0)

      // dup must evaluate a call once, not once per use.
      IL_0000: ldc.i4.1
      IL_0001: call int32 HelloWorld.Program::Tick(int32)
      IL_0002: dup
      IL_0003: add
      IL_0004: call void class [mscorlib]System.Console::WriteLine(int32)

      // A pending local load observes the value before the intervening store.
      IL_0005: ldc.i4.s 10
      IL_0006: stloc.0
      IL_0007: ldloc.0
      IL_0008: ldc.i4.s 20
      IL_0009: stloc.0
      IL_000a: call void class [mscorlib]System.Console::WriteLine(int32)
      IL_000b: ldloc.0
      IL_000c: call void class [mscorlib]System.Console::WriteLine(int32)

      // Storing the top expression cannot run it before an older pending call.
      IL_000d: ldc.i4.3
      IL_000e: call int32 HelloWorld.Program::Tick(int32)
      IL_000f: ldc.i4.4
      IL_0010: call int32 HelloWorld.Program::Tick(int32)
      IL_0011: stloc.0
      IL_0012: call void class [mscorlib]System.Console::WriteLine(int32)
      IL_0013: ldloc.0
      IL_0014: call void class [mscorlib]System.Console::WriteLine(int32)

      // Materializing dup must also preserve the older call's evaluation order.
      IL_0015: ldc.i4.5
      IL_0016: call int32 HelloWorld.Program::Tick(int32)
      IL_0017: ldc.i4.6
      IL_0018: call int32 HelloWorld.Program::Tick(int32)
      IL_0019: dup
      IL_001a: stloc.0
      IL_001b: add
      IL_001c: call void class [mscorlib]System.Console::WriteLine(int32)
      IL_001d: ldloc.0
      IL_001e: call void class [mscorlib]System.Console::WriteLine(int32)

      // A carried call remains single-evaluation when duplicated after a store.
      IL_001f: ldc.i4.7
      IL_0020: call int32 HelloWorld.Program::Tick(int32)
      IL_0021: ldc.i4.8
      IL_0022: call int32 HelloWorld.Program::Tick(int32)
      IL_0023: stloc.0
      IL_0024: dup
      IL_0025: add
      IL_0026: call void class [mscorlib]System.Console::WriteLine(int32)
      IL_0027: ldloc.0
      IL_0028: call void class [mscorlib]System.Console::WriteLine(int32)
      IL_0029: ret
    }
  }
}
