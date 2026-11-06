
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
// MVID: {35c892c7-11c4-4951-b361-f7976c78ae73}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 )
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x100814000


// =============== CLASS MEMBERS DECLARATION ===================

.class public auto ansi beforefieldinit HelloWorld.Root
       extends [System.Runtime]System.Object
{
  .field public int32 Value
  .method public hidebysig specialname rtspecialname
          instance void  .ctor(int32 'value') cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      int32 HelloWorld.Root::Value
    IL_000f:  ret
  } // end of method Root::.ctor

  .method public hidebysig newslot virtual
          instance int32  Read() cil managed
  {
    // Code size       12 (0xc)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      int32 HelloWorld.Root::Value
    IL_0007:  stloc.0
    IL_0008:  br.s       IL_000a

    IL_000a:  ldloc.0
    IL_000b:  ret
  } // end of method Root::Read

} // end of class HelloWorld.Root

.class public auto ansi beforefieldinit HelloWorld.Middle
       extends HelloWorld.Root
{
  .field public int32 Value
  .method public hidebysig specialname rtspecialname
          instance void  .ctor(int32 root,
                               int32 middle) cil managed
  {
    // Code size       17 (0x11)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void HelloWorld.Root::.ctor(int32)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ldarg.0
    IL_000a:  ldarg.2
    IL_000b:  stfld      int32 HelloWorld.Middle::Value
    IL_0010:  ret
  } // end of method Middle::.ctor

  .method public hidebysig virtual instance int32
          Read() cil managed
  {
    // Code size       19 (0x13)
    .maxstack  2
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  call       instance int32 HelloWorld.Root::Read()
    IL_0007:  ldarg.0
    IL_0008:  ldfld      int32 HelloWorld.Middle::Value
    IL_000d:  add
    IL_000e:  stloc.0
    IL_000f:  br.s       IL_0011

    IL_0011:  ldloc.0
    IL_0012:  ret
  } // end of method Middle::Read

} // end of class HelloWorld.Middle

.class public auto ansi beforefieldinit HelloWorld.Leaf
       extends HelloWorld.Middle
{
  .field public int32 Value
  .method public hidebysig specialname rtspecialname
          instance void  .ctor(int32 root,
                               int32 middle,
                               int32 leaf) cil managed
  {
    // Code size       18 (0x12)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  ldarg.2
    IL_0003:  call       instance void HelloWorld.Middle::.ctor(int32,
                                                                int32)
    IL_0008:  nop
    IL_0009:  nop
    IL_000a:  ldarg.0
    IL_000b:  ldarg.3
    IL_000c:  stfld      int32 HelloWorld.Leaf::Value
    IL_0011:  ret
  } // end of method Leaf::.ctor

  .method public hidebysig virtual instance int32
          Read() cil managed
  {
    // Code size       19 (0x13)
    .maxstack  2
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  call       instance int32 HelloWorld.Middle::Read()
    IL_0007:  ldarg.0
    IL_0008:  ldfld      int32 HelloWorld.Leaf::Value
    IL_000d:  add
    IL_000e:  stloc.0
    IL_000f:  br.s       IL_0011

    IL_0011:  ldloc.0
    IL_0012:  ret
  } // end of method Leaf::Read

} // end of class HelloWorld.Leaf

.class public auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static void  Print(class HelloWorld.Root 'instance') cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  callvirt   instance int32 HelloWorld.Root::Read()
    IL_0007:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_000c:  nop
    IL_000d:  ret
  } // end of method Program::Print

  .method public hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       225 (0xe1)
    .maxstack  3
    .locals init (class HelloWorld.Root V_0,
             class HelloWorld.Middle V_1,
             class HelloWorld.Leaf V_2,
             class HelloWorld.Root V_3,
             class HelloWorld.Middle V_4,
             class HelloWorld.Leaf V_5,
             int32 V_6,
             bool V_7)
    IL_0000:  nop
    IL_0001:  ldc.i4.1
    IL_0002:  newobj     instance void HelloWorld.Root::.ctor(int32)
    IL_0007:  stloc.0
    IL_0008:  ldc.i4.2
    IL_0009:  ldc.i4.s   20
    IL_000b:  newobj     instance void HelloWorld.Middle::.ctor(int32,
                                                                int32)
    IL_0010:  stloc.1
    IL_0011:  ldc.i4.3
    IL_0012:  ldc.i4.s   30
    IL_0014:  ldc.i4     0x12c
    IL_0019:  newobj     instance void HelloWorld.Leaf::.ctor(int32,
                                                              int32,
                                                              int32)
    IL_001e:  stloc.2
    IL_001f:  ldloc.2
    IL_0020:  stloc.3
    IL_0021:  ldloc.2
    IL_0022:  stloc.s    V_4
    IL_0024:  ldloc.3
    IL_0025:  ldfld      int32 HelloWorld.Root::Value
    IL_002a:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_002f:  nop
    IL_0030:  ldloc.s    V_4
    IL_0032:  ldfld      int32 HelloWorld.Middle::Value
    IL_0037:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_003c:  nop
    IL_003d:  ldloc.2
    IL_003e:  ldfld      int32 HelloWorld.Leaf::Value
    IL_0043:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0048:  nop
    IL_0049:  ldloc.3
    IL_004a:  ldc.i4.4
    IL_004b:  stfld      int32 HelloWorld.Root::Value
    IL_0050:  ldloc.s    V_4
    IL_0052:  ldc.i4.s   40
    IL_0054:  stfld      int32 HelloWorld.Middle::Value
    IL_0059:  ldloc.2
    IL_005a:  ldc.i4     0x190
    IL_005f:  stfld      int32 HelloWorld.Leaf::Value
    IL_0064:  ldloc.3
    IL_0065:  ldfld      int32 HelloWorld.Root::Value
    IL_006a:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_006f:  nop
    IL_0070:  ldloc.s    V_4
    IL_0072:  ldfld      int32 HelloWorld.Middle::Value
    IL_0077:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_007c:  nop
    IL_007d:  ldloc.2
    IL_007e:  ldfld      int32 HelloWorld.Leaf::Value
    IL_0083:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0088:  nop
    IL_0089:  ldloc.1
    IL_008a:  ldfld      int32 HelloWorld.Middle::Value
    IL_008f:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0094:  nop
    IL_0095:  ldc.i4.0
    IL_0096:  stloc.s    V_6
    IL_0098:  br.s       IL_00b7

    IL_009a:  nop
    IL_009b:  ldloc.0
    IL_009c:  call       void HelloWorld.Program::Print(class HelloWorld.Root)
    IL_00a1:  nop
    IL_00a2:  ldloc.1
    IL_00a3:  call       void HelloWorld.Program::Print(class HelloWorld.Root)
    IL_00a8:  nop
    IL_00a9:  ldloc.2
    IL_00aa:  call       void HelloWorld.Program::Print(class HelloWorld.Root)
    IL_00af:  nop
    IL_00b0:  nop
    IL_00b1:  ldloc.s    V_6
    IL_00b3:  ldc.i4.1
    IL_00b4:  add
    IL_00b5:  stloc.s    V_6
    IL_00b7:  ldloc.s    V_6
    IL_00b9:  ldc.i4.3
    IL_00ba:  clt
    IL_00bc:  stloc.s    V_7
    IL_00be:  ldloc.s    V_7
    IL_00c0:  brtrue.s   IL_009a

    IL_00c2:  ldc.i4.5
    IL_00c3:  ldc.i4.s   50
    IL_00c5:  ldc.i4     0x1f4
    IL_00ca:  newobj     instance void HelloWorld.Leaf::.ctor(int32,
                                                              int32,
                                                              int32)
    IL_00cf:  stloc.s    V_5
    IL_00d1:  ldloc.s    V_5
    IL_00d3:  call       void HelloWorld.Program::Print(class HelloWorld.Root)
    IL_00d8:  nop
    IL_00d9:  ldloc.2
    IL_00da:  call       void HelloWorld.Program::Print(class HelloWorld.Root)
    IL_00df:  nop
    IL_00e0:  ret
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
