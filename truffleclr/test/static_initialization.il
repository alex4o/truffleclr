
//  .NET IL Disassembler.  Version 10.0.14



// Metadata version: v4.0.30319
.assembly extern System.Runtime
{
  .publickeytoken = (B0 3F 5F 7F 11 D5 0A 3A )                         // .?_....:
  .ver 10:0:0:0
}
.assembly extern System.Console
{
  .publickeytoken = (B0 3F 5F 7F 11 D5 0A 3A )                         // .?_....:
  .ver 10:0:0:0
}
.assembly p
{
  .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilationRelaxationsAttribute::.ctor(int32) = ( 01 00 08 00 00 00 00 00 )
  .custom instance void [System.Runtime]System.Runtime.CompilerServices.RuntimeCompatibilityAttribute::.ctor() = ( 01 00 01 00 54 02 16 57 72 61 70 4E 6F 6E 45 78   // ....T..WrapNonEx
                                                                                                                   63 65 70 74 69 6F 6E 54 68 72 6F 77 73 01 )       // ceptionThrows.

  // --- The following custom attribute is added automatically, do not uncomment -------
  //  .custom instance void [System.Runtime]System.Diagnostics.DebuggableAttribute::.ctor(valuetype [System.Runtime]System.Diagnostics.DebuggableAttribute/DebuggingModes) = ( 01 00 07 01 00 00 00 00 )

  .custom instance void [System.Runtime]System.Runtime.Versioning.TargetFrameworkAttribute::.ctor(string) = ( 01 00 19 2E 4E 45 54 43 6F 72 65 41 70 70 2C 56   // ....NETCoreApp,V
                                                                                                              65 72 73 69 6F 6E 3D 76 31 30 2E 30 01 00 54 0E   // ersion=v10.0..T.
                                                                                                              14 46 72 61 6D 65 77 6F 72 6B 44 69 73 70 6C 61   // .FrameworkDispla
                                                                                                              79 4E 61 6D 65 09 2E 4E 45 54 20 31 30 2E 30 )    // yName..NET 10.0
  .custom instance void [System.Runtime]System.Reflection.AssemblyCompanyAttribute::.ctor(string) = ( 01 00 01 70 00 00 )                               // ...p..
  .custom instance void [System.Runtime]System.Reflection.AssemblyConfigurationAttribute::.ctor(string) = ( 01 00 05 44 65 62 75 67 00 00 )                   // ...Debug..
  .custom instance void [System.Runtime]System.Reflection.AssemblyFileVersionAttribute::.ctor(string) = ( 01 00 07 31 2E 30 2E 30 2E 30 00 00 )             // ...1.0.0.0..
  .custom instance void [System.Runtime]System.Reflection.AssemblyInformationalVersionAttribute::.ctor(string) = ( 01 00 05 31 2E 30 2E 30 00 00 )                   // ...1.0.0..
  .custom instance void [System.Runtime]System.Reflection.AssemblyProductAttribute::.ctor(string) = ( 01 00 01 70 00 00 )                               // ...p..
  .custom instance void [System.Runtime]System.Reflection.AssemblyTitleAttribute::.ctor(string) = ( 01 00 01 70 00 00 )                               // ...p..
  .hash algorithm 0x00008004
  .ver 1:0:0:0
}
.module p.dll
// MVID: {dbd7fe28-8121-4f74-a9aa-f3e1c9d25e6b}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 )
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x100790000


// =============== CLASS MEMBERS DECLARATION ===================

.class public auto ansi HelloWorld.Counter
       extends [System.Runtime]System.Object
{
  .field public static int32 Created
  .field public int32 Id
  .method private hidebysig specialname rtspecialname static
          void  .cctor() cil managed
  {
    // Code size       17 (0x11)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldc.i4.s   100
    IL_0003:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0008:  nop
    IL_0009:  ldc.i4.s   10
    IL_000b:  stsfld     int32 HelloWorld.Counter::Created
    IL_0010:  ret
  } // end of method Counter::.cctor

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       32 (0x20)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldsfld     int32 HelloWorld.Counter::Created
    IL_000d:  ldc.i4.1
    IL_000e:  add
    IL_000f:  stsfld     int32 HelloWorld.Counter::Created
    IL_0014:  ldarg.0
    IL_0015:  ldsfld     int32 HelloWorld.Counter::Created
    IL_001a:  stfld      int32 HelloWorld.Counter::Id
    IL_001f:  ret
  } // end of method Counter::.ctor

} // end of class HelloWorld.Counter

.class public auto ansi HelloWorld.First
       extends [System.Runtime]System.Object
{
  .field public static int32 Value
  .field public static int32 SeenSecond
  .method private hidebysig specialname rtspecialname static
          void  .cctor() cil managed
  {
    // Code size       41 (0x29)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldc.i4     0xc8
    IL_0006:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_000b:  nop
    IL_000c:  ldc.i4.7
    IL_000d:  stsfld     int32 HelloWorld.First::Value
    IL_0012:  ldsfld     int32 HelloWorld.Second::Value
    IL_0017:  stsfld     int32 HelloWorld.First::SeenSecond
    IL_001c:  ldsfld     int32 HelloWorld.First::Value
    IL_0021:  ldc.i4.1
    IL_0022:  add
    IL_0023:  stsfld     int32 HelloWorld.First::Value
    IL_0028:  ret
  } // end of method First::.cctor

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method First::.ctor

} // end of class HelloWorld.First

.class public auto ansi HelloWorld.Second
       extends [System.Runtime]System.Object
{
  .field public static int32 Value
  .field public static int32 SeenFirst
  .field public static int32 SeenPending
  .method private hidebysig specialname rtspecialname static
          void  .cctor() cil managed
  {
    // Code size       46 (0x2e)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldc.i4     0x12c
    IL_0006:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_000b:  nop
    IL_000c:  ldsfld     int32 HelloWorld.First::Value
    IL_0011:  stsfld     int32 HelloWorld.Second::SeenFirst
    IL_0016:  ldsfld     int32 HelloWorld.First::SeenSecond
    IL_001b:  stsfld     int32 HelloWorld.Second::SeenPending
    IL_0020:  ldsfld     int32 HelloWorld.Second::SeenFirst
    IL_0025:  ldc.i4.s   20
    IL_0027:  add
    IL_0028:  stsfld     int32 HelloWorld.Second::Value
    IL_002d:  ret
  } // end of method Second::.cctor

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Second::.ctor

} // end of class HelloWorld.Second

.class public auto ansi HelloWorld.BeforeAllocation
       extends [System.Runtime]System.Object
{
  .field public static int32 Seed
  .method private hidebysig specialname rtspecialname static
          void  .cctor() cil managed
  {
    // Code size       20 (0x14)
    .maxstack  8
    IL_0000:  ldc.i4.s   42
    IL_0002:  stsfld     int32 HelloWorld.BeforeAllocation::Seed
    IL_0007:  nop
    IL_0008:  ldc.i4     0x190
    IL_000d:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0012:  nop
    IL_0013:  ret
  } // end of method BeforeAllocation::.cctor

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       31 (0x1f)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldc.i4     0x191
    IL_000d:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0012:  nop
    IL_0013:  ldsfld     int32 HelloWorld.BeforeAllocation::Seed
    IL_0018:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_001d:  nop
    IL_001e:  ret
  } // end of method BeforeAllocation::.ctor

} // end of class HelloWorld.BeforeAllocation

.class public auto ansi beforefieldinit HelloWorld.DerivedCounter
       extends HelloWorld.Counter
{
  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void HelloWorld.Counter::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method DerivedCounter::.ctor

} // end of class HelloWorld.DerivedCounter

.class public auto ansi HelloWorld.MethodOnly
       extends [System.Runtime]System.Object
{
  .method private hidebysig specialname rtspecialname static
          void  .cctor() cil managed
  {
    // Code size       13 (0xd)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldc.i4     0x1f4
    IL_0006:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_000b:  nop
    IL_000c:  ret
  } // end of method MethodOnly::.cctor

  .method public hidebysig static void  Run() cil managed
  {
    // Code size       13 (0xd)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldc.i4     0x1f5
    IL_0006:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_000b:  nop
    IL_000c:  ret
  } // end of method MethodOnly::Run

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method MethodOnly::.ctor

} // end of class HelloWorld.MethodOnly

.class public auto ansi HelloWorld.InitializedBase
       extends [System.Runtime]System.Object
{
  .method private hidebysig specialname rtspecialname static
          void  .cctor() cil managed
  {
    // Code size       13 (0xd)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldc.i4     0x258
    IL_0006:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_000b:  nop
    IL_000c:  ret
  } // end of method InitializedBase::.cctor

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       20 (0x14)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldc.i4     0x259
    IL_000d:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0012:  nop
    IL_0013:  ret
  } // end of method InitializedBase::.ctor

} // end of class HelloWorld.InitializedBase

.class public auto ansi beforefieldinit HelloWorld.InitializedDerived
       extends HelloWorld.InitializedBase
{
  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void HelloWorld.InitializedBase::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method InitializedDerived::.ctor

} // end of class HelloWorld.InitializedDerived

.class public auto ansi beforefieldinit HelloWorld.FailureProbe
       extends [System.Runtime]System.Object
{
  .field public static int32 Attempts
  .field public static int32 Zero
  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method FailureProbe::.ctor

} // end of class HelloWorld.FailureProbe

.class public auto ansi HelloWorld.FailedInitialization
       extends [System.Runtime]System.Object
{
  .field public static int32 Result
  .method private hidebysig specialname rtspecialname static
          void  .cctor() cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldsfld     int32 HelloWorld.FailureProbe::Attempts
    IL_0006:  ldc.i4.1
    IL_0007:  add
    IL_0008:  stsfld     int32 HelloWorld.FailureProbe::Attempts
    IL_000d:  ldc.i4.1
    IL_000e:  ldsfld     int32 HelloWorld.FailureProbe::Zero
    IL_0013:  div
    IL_0014:  stsfld     int32 HelloWorld.FailedInitialization::Result
    IL_0019:  ret
  } // end of method FailedInitialization::.cctor

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method FailedInitialization::.ctor

} // end of class HelloWorld.FailedInitialization

.class public auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method public hidebysig static int32  TryFailure() cil managed
  {
    // Code size       11 (0xb)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldsfld     int32 HelloWorld.FailedInitialization::Result
    IL_0006:  stloc.0
    IL_0007:  br.s       IL_0009

    IL_0009:  ldloc.0
    IL_000a:  ret
  } // end of method Program::TryFailure

  .method public hidebysig static int32  FailureAttempts() cil managed
  {
    // Code size       11 (0xb)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldsfld     int32 HelloWorld.FailureProbe::Attempts
    IL_0006:  stloc.0
    IL_0007:  br.s       IL_0009

    IL_0009:  ldloc.0
    IL_000a:  ret
  } // end of method Program::FailureAttempts

  .method public hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       250 (0xfa)
    .maxstack  1
    .locals init (class HelloWorld.Counter V_0,
             class HelloWorld.Counter V_1,
             class HelloWorld.Counter V_2)
    IL_0000:  nop
    IL_0001:  ldsfld     int32 HelloWorld.Counter::Created
    IL_0006:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_000b:  nop
    IL_000c:  newobj     instance void HelloWorld.Counter::.ctor()
    IL_0011:  stloc.0
    IL_0012:  newobj     instance void HelloWorld.Counter::.ctor()
    IL_0017:  stloc.1
    IL_0018:  ldloc.0
    IL_0019:  ldfld      int32 HelloWorld.Counter::Id
    IL_001e:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0023:  nop
    IL_0024:  ldloc.1
    IL_0025:  ldfld      int32 HelloWorld.Counter::Id
    IL_002a:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_002f:  nop
    IL_0030:  ldsfld     int32 HelloWorld.Counter::Created
    IL_0035:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_003a:  nop
    IL_003b:  ldc.i4.s   50
    IL_003d:  stsfld     int32 HelloWorld.Counter::Created
    IL_0042:  newobj     instance void HelloWorld.Counter::.ctor()
    IL_0047:  stloc.2
    IL_0048:  ldloc.2
    IL_0049:  ldfld      int32 HelloWorld.Counter::Id
    IL_004e:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0053:  nop
    IL_0054:  ldloc.0
    IL_0055:  ldfld      int32 HelloWorld.Counter::Id
    IL_005a:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_005f:  nop
    IL_0060:  ldsfld     int32 HelloWorld.Counter::Created
    IL_0065:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_006a:  nop
    IL_006b:  ldsfld     int32 HelloWorld.First::Value
    IL_0070:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0075:  nop
    IL_0076:  ldsfld     int32 HelloWorld.First::SeenSecond
    IL_007b:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0080:  nop
    IL_0081:  ldsfld     int32 HelloWorld.Second::SeenFirst
    IL_0086:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_008b:  nop
    IL_008c:  ldsfld     int32 HelloWorld.Second::SeenPending
    IL_0091:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0096:  nop
    IL_0097:  ldsfld     int32 HelloWorld.Second::Value
    IL_009c:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00a1:  nop
    IL_00a2:  ldsfld     int32 HelloWorld.First::Value
    IL_00a7:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00ac:  nop
    IL_00ad:  ldsfld     int32 HelloWorld.Second::Value
    IL_00b2:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00b7:  nop
    IL_00b8:  newobj     instance void HelloWorld.BeforeAllocation::.ctor()
    IL_00bd:  pop
    IL_00be:  newobj     instance void HelloWorld.BeforeAllocation::.ctor()
    IL_00c3:  pop
    IL_00c4:  ldsfld     int32 HelloWorld.Counter::Created
    IL_00c9:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00ce:  nop
    IL_00cf:  ldc.i4.s   60
    IL_00d1:  stsfld     int32 HelloWorld.Counter::Created
    IL_00d6:  ldsfld     int32 HelloWorld.Counter::Created
    IL_00db:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00e0:  nop
    IL_00e1:  call       void HelloWorld.MethodOnly::Run()
    IL_00e6:  nop
    IL_00e7:  call       void HelloWorld.MethodOnly::Run()
    IL_00ec:  nop
    IL_00ed:  newobj     instance void HelloWorld.InitializedDerived::.ctor()
    IL_00f2:  pop
    IL_00f3:  newobj     instance void HelloWorld.InitializedDerived::.ctor()
    IL_00f8:  pop
    IL_00f9:  ret
  } // end of method Program::Main

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Program::.ctor

} // end of class HelloWorld.Program


// =============================================================

// *********** DISASSEMBLY COMPLETE ***********************
