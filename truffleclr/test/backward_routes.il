.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly HelloWorld {}
.module HelloWorld.dll
.class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object
{
  .method public static void Main(string[] args) cil managed
  {
    .entrypoint
    .maxstack 3
    .locals init (int32 V_0)
    // A backedge to instruction zero must not reinitialize method locals.
    IL_0: ldloc.0
    IL_1: ldc.i4.1
    IL_2: add
    IL_3: stloc.0
    IL_4: ldloc.0
    IL_5: ldc.i4.3
    IL_6: blt IL_0
    IL_7: ldloc.0
    IL_8: call void [System.Console]System.Console::WriteLine(int32)
    // Two more backward targets carry a live accumulator across their edges.
    IL_9: ldc.i4.0
    IL_10: br IL_11
    IL_11: ldc.i4.1
    IL_12: add
    IL_13: ldloc.0
    IL_14: ldc.i4.1
    IL_15: sub
    IL_16: stloc.0
    IL_17: ldloc.0
    IL_18: brtrue IL_11
    IL_19: ldc.i4.s 10
    IL_20: add
    IL_21: dup
    IL_22: ldc.i4.s 23
    IL_23: blt IL_19
    IL_24: call void [System.Console]System.Console::WriteLine(int32)
    IL_25: ret
  }
}
