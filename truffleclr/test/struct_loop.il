
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
// MVID: {2b690f6c-f806-4d14-b82c-452527a2726f}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 )
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x104bd8000


// =============== CLASS MEMBERS DECLARATION ===================

.class private sequential ansi sealed beforefieldinit HelloWorld.Vector
       extends [System.Runtime]System.ValueType
{
  .field public int32 X
  .field public int32 Y
  .method public hidebysig specialname rtspecialname
          instance void  .ctor(int32 x,
                               int32 y) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  stfld      int32 HelloWorld.Vector::X
    IL_0008:  ldarg.0
    IL_0009:  ldarg.2
    IL_000a:  stfld      int32 HelloWorld.Vector::Y
    IL_000f:  ret
  } // end of method Vector::.ctor

  .method public hidebysig instance void
          Step() cil managed
  {
    // Code size       30 (0x1e)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      int32 HelloWorld.Vector::X
    IL_0008:  ldc.i4.1
    IL_0009:  add
    IL_000a:  stfld      int32 HelloWorld.Vector::X
    IL_000f:  ldarg.0
    IL_0010:  ldarg.0
    IL_0011:  ldfld      int32 HelloWorld.Vector::Y
    IL_0016:  ldc.i4.2
    IL_0017:  add
    IL_0018:  stfld      int32 HelloWorld.Vector::Y
    IL_001d:  ret
  } // end of method Vector::Step

} // end of class HelloWorld.Vector

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       253 (0xfd)
    .maxstack  5
    .locals init (valuetype HelloWorld.Vector[] V_0,
             int32 V_1,
             int32 V_2,
             bool V_3,
             int32 V_4,
             int32 V_5,
             valuetype HelloWorld.Vector& V_6,
             bool V_7,
             bool V_8,
             int32 V_9,
             bool V_10)
    IL_0000:  nop
    IL_0001:  ldc.i4.s   64
    IL_0003:  newarr     HelloWorld.Vector
    IL_0008:  stloc.0
    IL_0009:  ldc.i4.0
    IL_000a:  stloc.2
    IL_000b:  br.s       IL_0021

    IL_000d:  ldloc.0
    IL_000e:  ldloc.2
    IL_000f:  ldloc.2
    IL_0010:  ldloc.2
    IL_0011:  ldc.i4.2
    IL_0012:  mul
    IL_0013:  newobj     instance void HelloWorld.Vector::.ctor(int32,
                                                                int32)
    IL_0018:  stelem     HelloWorld.Vector
    IL_001d:  ldloc.2
    IL_001e:  ldc.i4.1
    IL_001f:  add
    IL_0020:  stloc.2
    IL_0021:  ldloc.2
    IL_0022:  ldloc.0
    IL_0023:  ldlen
    IL_0024:  conv.i4
    IL_0025:  clt
    IL_0027:  stloc.3
    IL_0028:  ldloc.3
    IL_0029:  brtrue.s   IL_000d

    IL_002b:  ldc.i4.0
    IL_002c:  stloc.s    V_4
    IL_002e:  br.s       IL_0064

    IL_0030:  nop
    IL_0031:  ldc.i4.0
    IL_0032:  stloc.s    V_5
    IL_0034:  br.s       IL_0050

    IL_0036:  nop
    IL_0037:  ldloc.0
    IL_0038:  ldloc.s    V_5
    IL_003a:  ldelema    HelloWorld.Vector
    IL_003f:  stloc.s    V_6
    IL_0041:  ldloc.s    V_6
    IL_0043:  call       instance void HelloWorld.Vector::Step()
    IL_0048:  nop
    IL_0049:  nop
    IL_004a:  ldloc.s    V_5
    IL_004c:  ldc.i4.1
    IL_004d:  add
    IL_004e:  stloc.s    V_5
    IL_0050:  ldloc.s    V_5
    IL_0052:  ldloc.0
    IL_0053:  ldlen
    IL_0054:  conv.i4
    IL_0055:  clt
    IL_0057:  stloc.s    V_7
    IL_0059:  ldloc.s    V_7
    IL_005b:  brtrue.s   IL_0036

    IL_005d:  nop
    IL_005e:  ldloc.s    V_4
    IL_0060:  ldc.i4.1
    IL_0061:  add
    IL_0062:  stloc.s    V_4
    IL_0064:  ldloc.s    V_4
    IL_0066:  ldc.i4     0x4e20
    IL_006b:  clt
    IL_006d:  stloc.s    V_8
    IL_006f:  ldloc.s    V_8
    IL_0071:  brtrue.s   IL_0030

    IL_0073:  ldc.i4.0
    IL_0074:  stloc.1
    IL_0075:  ldc.i4.0
    IL_0076:  stloc.s    V_9
    IL_0078:  br.s       IL_009e

    IL_007a:  ldloc.1
    IL_007b:  ldloc.0
    IL_007c:  ldloc.s    V_9
    IL_007e:  ldelema    HelloWorld.Vector
    IL_0083:  ldfld      int32 HelloWorld.Vector::X
    IL_0088:  ldloc.0
    IL_0089:  ldloc.s    V_9
    IL_008b:  ldelema    HelloWorld.Vector
    IL_0090:  ldfld      int32 HelloWorld.Vector::Y
    IL_0095:  add
    IL_0096:  add
    IL_0097:  stloc.1
    IL_0098:  ldloc.s    V_9
    IL_009a:  ldc.i4.1
    IL_009b:  add
    IL_009c:  stloc.s    V_9
    IL_009e:  ldloc.s    V_9
    IL_00a0:  ldloc.0
    IL_00a1:  ldlen
    IL_00a2:  conv.i4
    IL_00a3:  clt
    IL_00a5:  stloc.s    V_10
    IL_00a7:  ldloc.s    V_10
    IL_00a9:  brtrue.s   IL_007a

    IL_00ab:  ldloc.1
    IL_00ac:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00b1:  nop
    IL_00b2:  ldloc.0
    IL_00b3:  ldc.i4.0
    IL_00b4:  ldelema    HelloWorld.Vector
    IL_00b9:  ldfld      int32 HelloWorld.Vector::X
    IL_00be:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00c3:  nop
    IL_00c4:  ldloc.0
    IL_00c5:  ldc.i4.0
    IL_00c6:  ldelema    HelloWorld.Vector
    IL_00cb:  ldfld      int32 HelloWorld.Vector::Y
    IL_00d0:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00d5:  nop
    IL_00d6:  ldloc.0
    IL_00d7:  ldc.i4.s   63
    IL_00d9:  ldelema    HelloWorld.Vector
    IL_00de:  ldfld      int32 HelloWorld.Vector::X
    IL_00e3:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00e8:  nop
    IL_00e9:  ldloc.0
    IL_00ea:  ldc.i4.s   63
    IL_00ec:  ldelema    HelloWorld.Vector
    IL_00f1:  ldfld      int32 HelloWorld.Vector::Y
    IL_00f6:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00fb:  nop
    IL_00fc:  ret
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
