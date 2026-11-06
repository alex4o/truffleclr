// Non-canonical EH table layouts; all ordinary edges must survive block ordering.
.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly exceptions_table_layout {}
.class public HelloWorld.Program extends [System.Runtime]System.Object {
 .method public static void Main() cil managed {
  .entrypoint
  .maxstack 1
  M0: call void HelloWorld.Program::Preceding()
  M1: call void HelloWorld.Program::Crossing()
  M2: ldc.i4.0
  M3: call void HelloWorld.Program::Backward(bool)
  M4: ldc.i4.1
  M5: call void HelloWorld.Program::Backward(bool)
  M6: call void HelloWorld.Program::Dormant()
  M7: ret
 }
 .method public static void Dormant() cil managed {
  .maxstack 1
  Entry: br Done
  Try: ldnull
  T1: throw
  Handler: pop
  H1: leave Done
  Done: ldstr "dormant"
  D1: call void [System.Console]System.Console::WriteLine(string)
  D2: ret
  .try Try to Handler catch [System.Runtime]System.Exception handler Handler to Done
 }
 .method public static void Preceding() cil managed {
  .maxstack 1
  Entry: br Before
  Handler: pop
  H1: ldstr "preceding"
  H2: call void [System.Console]System.Console::WriteLine(string)
  H3: leave Done
  Before: nop
  Try: ldstr "test"
  T1: newobj instance void [System.Runtime]System.Exception::.ctor(string)
  T2: throw
  Done: ret
  .try Try to Done catch [System.Runtime]System.Exception handler Handler to Before
 }
 .method public static void Crossing() cil managed {
  .maxstack 2
  .locals init (int32 V_0)
  Entry: ldc.i4.0
  E1: stloc.0
  Try: leave Gap
  Gap: ldloc.0
  G1: ldc.i4.1
  G2: add
  G3: stloc.0
  G4: br Tail
  Handler: pop
  H1: leave Done
  Tail: ldloc.0
  T1: ldc.i4.3
  T2: blt Gap
  Done: ldloc.0
  D1: call void [System.Console]System.Console::WriteLine(int32)
  D2: ret
  .try Try to Gap catch [System.Runtime]System.Exception handler Handler to Tail
 }
 .method public static void Backward(bool bypass) cil managed {
  .maxstack 1
  Entry: ldarg.0
  E1: brtrue Gap
  Try: ldstr "test"
  T1: newobj instance void [System.Runtime]System.Exception::.ctor(string)
  T2: throw
  Gap: ldstr "gap entry"
  G1: call void [System.Console]System.Console::WriteLine(string)
  G2: br Done
  Handler: pop
  H1: leave Gap
  Done: ret
  .try Try to Gap catch [System.Runtime]System.Exception handler Handler to Done
 }
}
