// Table-form continuation gaps and mixed numeric/label handler bounds.
.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly exceptions_table_gaps {}
.class public HelloWorld.Program extends [System.Runtime]System.Object {
 .method public static void Main() cil managed {
  .entrypoint
  .maxstack 1
  IL_0000: leave IL_0005
  IL_0005: ldstr "gap"
  IL_000a: call void [System.Console]System.Console::WriteLine(string)
  IL_000f: br IL_001a
  IL_0014: pop
  IL_0015: leave IL_001a
  IL_001a: nop
  IL_001b: ldstr "mixed"
  IL_0020: newobj instance void [System.Runtime]System.Exception::.ctor(string)
  IL_0025: throw
  IL_0026: pop
  IL_0027: ldstr "caught"
  IL_002c: call void [System.Console]System.Console::WriteLine(string)
  IL_0031: leave IL_0036
  IL_0036: ret
  .try IL_0000 to IL_0005 catch [System.Runtime]System.Exception handler IL_0014 to 0x001a
  .try IL_001b to IL_0026 catch [System.Runtime]System.Exception handler 0x0026 to IL_0036
 }
}
