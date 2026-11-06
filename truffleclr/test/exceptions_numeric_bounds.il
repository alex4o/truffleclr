// Numeric EH bounds are byte offsets, independent of label spelling.
// Tables deliberately precede their instructions to exercise forward resolution.
.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly exceptions_numeric_bounds {}
.class public HelloWorld.Program extends [System.Runtime]System.Object {
 .method public static void Main() cil managed {
  .entrypoint
  .maxstack 2
  .locals init (int32 V_0)
  .try 0 to 0x42 catch [System.Runtime]System.Exception handler 66 to 0x4f
  Start: nop
  Small: ldc.i4.s 127
  DropSmall: pop
  Wide: ldc.i8 123
  DropWide: pop
  Single: ldc.r4 1.0
  DropSingle: pop
  Double: ldc.r8 1.0
  DropDouble: pop
  Integer: ldc.i4 123
  StoreLong: stloc 0
  LoadShort: ldloc.s 0
  DropLocal: pop
  Address: ldloca.s 0
  Initialize: initobj [System.Runtime]System.Int32
  Left: ldc.i4.1
  Right: ldc.i4.1
  Compare: ceq
  DropComparison: pop
  Message: ldstr "boom"
  Construct: newobj instance void [System.Runtime]System.Exception::.ctor(string)
  Raise: throw
  Catch: pop
  Marker: ldstr "numeric bounds"
  Print: call void [System.Console]System.Console::WriteLine(string)
  Exit: leave.s Done
  Done: call void HelloWorld.Program::Filtered()
  Cleanup: call void HelloWorld.Program::EndBoundary()
  Return: ret
 }
 .method public static void Filtered() cil managed {
  .maxstack 1
  .try 0 to 2 filter 2 handler 6 to 19
  Start: ldnull
  Raise: throw
  Filter: pop
  Accept: ldc.i4.1
  EndFilter: endfilter
  Catch: pop
  Marker: ldstr "numeric filter"
  Print: call void [System.Console]System.Console::WriteLine(string)
  Exit: leave.s Done
  Done: ret
 }
 .method public static void EndBoundary() cil managed {
  .maxstack 1
  .try 0 to 3 finally handler 4 to 15
  Start: nop
  Exit: leave.s Done
  Done: ret
  Finally: ldstr "method end bound"
  Print: call void [System.Console]System.Console::WriteLine(string)
  EndFinally: endfinally
 }
}
