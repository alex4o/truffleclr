.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly HelloWorld {}
.module HelloWorld.dll
.class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object
{
  .method public static void Main(string[] args) cil managed
  {
    .entrypoint
    .maxstack 1
    // The outer backedge enters the interior of an initially nested loop.
    IL_B0: ldc.i4.0
    IL_C0: brtrue IL_B5
    IL_B1: ldc.i4.0
    IL_C1: brtrue IL_B3
    IL_B2: br IL_B3
    IL_B3: br IL_B4
    IL_B4: ldc.i4.0
    IL_C4: brtrue IL_B2
    IL_B5: br IL_B6
    IL_B6: br IL_B7
    IL_B7: ldc.i4.0
    IL_C7: brtrue IL_B3
    IL_B8: ldc.i4.s 99
    IL_C8: call void [System.Console]System.Console::WriteLine(int32)
    IL_C9: ret
  }
}
