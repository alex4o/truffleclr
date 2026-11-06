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
    .locals init (bool V_0)
    IL_0: ldc.i4.1
    IL_1: stloc.0
    IL_2: ldloc.0
    IL_3: call void [System.Console]System.Console::WriteLine(bool)
    IL_4: ldc.i4.0
    IL_5: stloc.0
    IL_6: ldloc.0
    IL_7: call void [System.Console]System.Console::WriteLine(bool)
    IL_8: ret
  }
}
