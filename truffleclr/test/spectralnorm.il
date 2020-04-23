
//  Microsoft (R) .NET Framework IL Disassembler.  Version 4.5.30319.0



// Metadata version: v4.0.30319
.assembly extern System.Runtime
{
  .publickeytoken = (B0 3F 5F 7F 11 D5 0A 3A )                         // .?_....:
  .ver 4:2:2:0
}
.assembly extern System.Runtime.Extensions
{
  .publickeytoken = (B0 3F 5F 7F 11 D5 0A 3A )                         // .?_....:
  .ver 4:2:2:0
}
.assembly extern System.Console
{
  .publickeytoken = (B0 3F 5F 7F 11 D5 0A 3A )                         // .?_....:
  .ver 4:1:2:0
}
.assembly HelloWorld
{
  .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilationRelaxationsAttribute::.ctor(int32) = ( 01 00 08 00 00 00 00 00 ) 
  .custom instance void [System.Runtime]System.Runtime.CompilerServices.RuntimeCompatibilityAttribute::.ctor() = ( 01 00 01 00 54 02 16 57 72 61 70 4E 6F 6E 45 78   // ....T..WrapNonEx
                                                                                                                   63 65 70 74 69 6F 6E 54 68 72 6F 77 73 01 )       // ceptionThrows.

  // --- The following custom attribute is added automatically, do not uncomment -------
  //  .custom instance void [System.Runtime]System.Diagnostics.DebuggableAttribute::.ctor(valuetype [System.Runtime]System.Diagnostics.DebuggableAttribute/DebuggingModes) = ( 01 00 07 01 00 00 00 00 ) 

  .custom instance void [System.Runtime]System.Runtime.Versioning.TargetFrameworkAttribute::.ctor(string) = ( 01 00 18 2E 4E 45 54 43 6F 72 65 41 70 70 2C 56   // ....NETCoreApp,V
                                                                                                              65 72 73 69 6F 6E 3D 76 33 2E 31 01 00 54 0E 14   // ersion=v3.1..T..
                                                                                                              46 72 61 6D 65 77 6F 72 6B 44 69 73 70 6C 61 79   // FrameworkDisplay
                                                                                                              4E 61 6D 65 00 )                                  // Name.
  .custom instance void [System.Runtime]System.Reflection.AssemblyCompanyAttribute::.ctor(string) = ( 01 00 0A 48 65 6C 6C 6F 57 6F 72 6C 64 00 00 )    // ...HelloWorld..
  .custom instance void [System.Runtime]System.Reflection.AssemblyConfigurationAttribute::.ctor(string) = ( 01 00 05 44 65 62 75 67 00 00 )                   // ...Debug..
  .custom instance void [System.Runtime]System.Reflection.AssemblyFileVersionAttribute::.ctor(string) = ( 01 00 07 31 2E 30 2E 30 2E 30 00 00 )             // ...1.0.0.0..
  .custom instance void [System.Runtime]System.Reflection.AssemblyInformationalVersionAttribute::.ctor(string) = ( 01 00 05 31 2E 30 2E 30 00 00 )                   // ...1.0.0..
  .custom instance void [System.Runtime]System.Reflection.AssemblyProductAttribute::.ctor(string) = ( 01 00 0A 48 65 6C 6C 6F 57 6F 72 6C 64 00 00 )    // ...HelloWorld..
  .custom instance void [System.Runtime]System.Reflection.AssemblyTitleAttribute::.ctor(string) = ( 01 00 0A 48 65 6C 6C 6F 57 6F 72 6C 64 00 00 )    // ...HelloWorld..
  .hash algorithm 0x00008004
  .ver 1:0:0:0
}
.module HelloWorld.dll
// MVID: {9b6c1e2f-88a8-467c-bd2f-f4085086978e}
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x00007FED4724D000


// =============== CLASS MEMBERS DECLARATION ===================

.class public auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .field private static literal int32 SPECTRAL_N = int32(0x000003E8)
  .field private static literal float64 EXPECT_CKSUM = float64(1.2742241481294836)
  .method private hidebysig static float64 
          Approximate(int32 n) cil managed
  {
    // Code size       211 (0xd3)
    .maxstack  4
    .locals init (float64[] V_0,
             float64[] V_1,
             float64 V_2,
             float64 V_3,
             int32 V_4,
             bool V_5,
             int32 V_6,
             bool V_7,
             int32 V_8,
             bool V_9,
             int32 V_10,
             bool V_11,
             float64 V_12)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  newarr     [System.Runtime]System.Double
    IL_0007:  stloc.0
    IL_0008:  ldc.i4.0
    IL_0009:  stloc.s    V_4
    IL_000b:  br.s       IL_0020

    IL_000d:  ldloc.0
    IL_000e:  ldloc.s    V_4
    IL_0010:  ldc.r8     1
    IL_0019:  stelem.r8
    IL_001a:  ldloc.s    V_4
    IL_001c:  ldc.i4.1
    IL_001d:  add
    IL_001e:  stloc.s    V_4
    IL_0020:  ldloc.s    V_4
    IL_0022:  ldarg.0
    IL_0023:  clt
    IL_0025:  stloc.s    V_5
    IL_0027:  ldloc.s    V_5
    IL_0029:  brtrue.s   IL_000d

    IL_002b:  ldarg.0
    IL_002c:  newarr     [System.Runtime]System.Double
    IL_0031:  stloc.1
    IL_0032:  ldc.i4.0
    IL_0033:  stloc.s    V_6
    IL_0035:  br.s       IL_004a

    IL_0037:  ldloc.1
    IL_0038:  ldloc.s    V_6
    IL_003a:  ldc.r8     0.0
    IL_0043:  stelem.r8
    IL_0044:  ldloc.s    V_6
    IL_0046:  ldc.i4.1
    IL_0047:  add
    IL_0048:  stloc.s    V_6
    IL_004a:  ldloc.s    V_6
    IL_004c:  ldarg.0
    IL_004d:  clt
    IL_004f:  stloc.s    V_7
    IL_0051:  ldloc.s    V_7
    IL_0053:  brtrue.s   IL_0037

    IL_0055:  ldc.i4.0
    IL_0056:  stloc.s    V_8
    IL_0058:  br.s       IL_0074

    IL_005a:  nop
    IL_005b:  ldarg.0
    IL_005c:  ldloc.0
    IL_005d:  ldloc.1
    IL_005e:  call       void HelloWorld.Program::MultiplyAtAv(int32,
                                                               float64[],
                                                               float64[])
    IL_0063:  nop
    IL_0064:  ldarg.0
    IL_0065:  ldloc.1
    IL_0066:  ldloc.0
    IL_0067:  call       void HelloWorld.Program::MultiplyAtAv(int32,
                                                               float64[],
                                                               float64[])
    IL_006c:  nop
    IL_006d:  nop
    IL_006e:  ldloc.s    V_8
    IL_0070:  ldc.i4.1
    IL_0071:  add
    IL_0072:  stloc.s    V_8
    IL_0074:  ldloc.s    V_8
    IL_0076:  ldc.i4.s   10
    IL_0078:  clt
    IL_007a:  stloc.s    V_9
    IL_007c:  ldloc.s    V_9
    IL_007e:  brtrue.s   IL_005a

    IL_0080:  ldc.r8     0.0
    IL_0089:  stloc.2
    IL_008a:  ldc.r8     0.0
    IL_0093:  stloc.3
    IL_0094:  ldc.i4.0
    IL_0095:  stloc.s    V_10
    IL_0097:  br.s       IL_00b9

    IL_0099:  nop
    IL_009a:  ldloc.2
    IL_009b:  ldloc.0
    IL_009c:  ldloc.s    V_10
    IL_009e:  ldelem.r8
    IL_009f:  ldloc.1
    IL_00a0:  ldloc.s    V_10
    IL_00a2:  ldelem.r8
    IL_00a3:  mul
    IL_00a4:  add
    IL_00a5:  stloc.2
    IL_00a6:  ldloc.3
    IL_00a7:  ldloc.1
    IL_00a8:  ldloc.s    V_10
    IL_00aa:  ldelem.r8
    IL_00ab:  ldloc.1
    IL_00ac:  ldloc.s    V_10
    IL_00ae:  ldelem.r8
    IL_00af:  mul
    IL_00b0:  add
    IL_00b1:  stloc.3
    IL_00b2:  nop
    IL_00b3:  ldloc.s    V_10
    IL_00b5:  ldc.i4.1
    IL_00b6:  add
    IL_00b7:  stloc.s    V_10
    IL_00b9:  ldloc.s    V_10
    IL_00bb:  ldarg.0
    IL_00bc:  clt
    IL_00be:  stloc.s    V_11
    IL_00c0:  ldloc.s    V_11
    IL_00c2:  brtrue.s   IL_0099

    IL_00c4:  ldloc.2
    IL_00c5:  ldloc.3
    IL_00c6:  div
    IL_00c7:  call       float64 [System.Runtime.Extensions]System.Math::Sqrt(float64)
    IL_00cc:  stloc.s    V_12
    IL_00ce:  br.s       IL_00d0

    IL_00d0:  ldloc.s    V_12
    IL_00d2:  ret
  } // end of method Program::Approximate

  .method private hidebysig static float64 
          A(int32 i,
            int32 j) cil managed
  {
    // Code size       32 (0x20)
    .maxstack  4
    .locals init (float64 V_0)
    IL_0000:  nop
    IL_0001:  ldc.r8     1
    IL_000a:  ldarg.0
    IL_000b:  ldarg.1
    IL_000c:  add
    IL_000d:  ldarg.0
    IL_000e:  ldarg.1
    IL_000f:  add
    IL_0010:  ldc.i4.1
    IL_0011:  add
    IL_0012:  mul
    IL_0013:  ldc.i4.2
    IL_0014:  div
    IL_0015:  ldarg.0
    IL_0016:  add
    IL_0017:  ldc.i4.1
    IL_0018:  add
    IL_0019:  conv.r8
    IL_001a:  div
    IL_001b:  stloc.0
    IL_001c:  br.s       IL_001e

    IL_001e:  ldloc.0
    IL_001f:  ret
  } // end of method Program::A

  .method private hidebysig static void  MultiplyAv(int32 n,
                                                    float64[] v,
                                                    float64[] Av) cil managed
  {
    // Code size       70 (0x46)
    .maxstack  5
    .locals init (int32 V_0,
             int32 V_1,
             bool V_2,
             bool V_3)
    IL_0000:  nop
    IL_0001:  ldc.i4.0
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_003d

    IL_0005:  nop
    IL_0006:  ldarg.2
    IL_0007:  ldloc.0
    IL_0008:  ldc.r8     0.0
    IL_0011:  stelem.r8
    IL_0012:  ldc.i4.0
    IL_0013:  stloc.1
    IL_0014:  br.s       IL_0030

    IL_0016:  ldarg.2
    IL_0017:  ldloc.0
    IL_0018:  ldelema    [System.Runtime]System.Double
    IL_001d:  dup
    IL_001e:  ldind.r8
    IL_001f:  ldloc.0
    IL_0020:  ldloc.1
    IL_0021:  call       float64 HelloWorld.Program::A(int32,
                                                       int32)
    IL_0026:  ldarg.1
    IL_0027:  ldloc.1
    IL_0028:  ldelem.r8
    IL_0029:  mul
    IL_002a:  add
    IL_002b:  stind.r8
    IL_002c:  ldloc.1
    IL_002d:  ldc.i4.1
    IL_002e:  add
    IL_002f:  stloc.1
    IL_0030:  ldloc.1
    IL_0031:  ldarg.0
    IL_0032:  clt
    IL_0034:  stloc.2
    IL_0035:  ldloc.2
    IL_0036:  brtrue.s   IL_0016

    IL_0038:  nop
    IL_0039:  ldloc.0
    IL_003a:  ldc.i4.1
    IL_003b:  add
    IL_003c:  stloc.0
    IL_003d:  ldloc.0
    IL_003e:  ldarg.0
    IL_003f:  clt
    IL_0041:  stloc.3
    IL_0042:  ldloc.3
    IL_0043:  brtrue.s   IL_0005

    IL_0045:  ret
  } // end of method Program::MultiplyAv

  .method private hidebysig static void  MultiplyAtv(int32 n,
                                                     float64[] v,
                                                     float64[] Atv) cil managed
  {
    // Code size       70 (0x46)
    .maxstack  5
    .locals init (int32 V_0,
             int32 V_1,
             bool V_2,
             bool V_3)
    IL_0000:  nop
    IL_0001:  ldc.i4.0
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_003d

    IL_0005:  nop
    IL_0006:  ldarg.2
    IL_0007:  ldloc.0
    IL_0008:  ldc.r8     0.0
    IL_0011:  stelem.r8
    IL_0012:  ldc.i4.0
    IL_0013:  stloc.1
    IL_0014:  br.s       IL_0030

    IL_0016:  ldarg.2
    IL_0017:  ldloc.0
    IL_0018:  ldelema    [System.Runtime]System.Double
    IL_001d:  dup
    IL_001e:  ldind.r8
    IL_001f:  ldloc.1
    IL_0020:  ldloc.0
    IL_0021:  call       float64 HelloWorld.Program::A(int32,
                                                       int32)
    IL_0026:  ldarg.1
    IL_0027:  ldloc.1
    IL_0028:  ldelem.r8
    IL_0029:  mul
    IL_002a:  add
    IL_002b:  stind.r8
    IL_002c:  ldloc.1
    IL_002d:  ldc.i4.1
    IL_002e:  add
    IL_002f:  stloc.1
    IL_0030:  ldloc.1
    IL_0031:  ldarg.0
    IL_0032:  clt
    IL_0034:  stloc.2
    IL_0035:  ldloc.2
    IL_0036:  brtrue.s   IL_0016

    IL_0038:  nop
    IL_0039:  ldloc.0
    IL_003a:  ldc.i4.1
    IL_003b:  add
    IL_003c:  stloc.0
    IL_003d:  ldloc.0
    IL_003e:  ldarg.0
    IL_003f:  clt
    IL_0041:  stloc.3
    IL_0042:  ldloc.3
    IL_0043:  brtrue.s   IL_0005

    IL_0045:  ret
  } // end of method Program::MultiplyAtv

  .method private hidebysig static void  MultiplyAtAv(int32 n,
                                                      float64[] v,
                                                      float64[] AtAv) cil managed
  {
    // Code size       27 (0x1b)
    .maxstack  3
    .locals init (float64[] V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  newarr     [System.Runtime]System.Double
    IL_0007:  stloc.0
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  ldloc.0
    IL_000b:  call       void HelloWorld.Program::MultiplyAv(int32,
                                                             float64[],
                                                             float64[])
    IL_0010:  nop
    IL_0011:  ldarg.0
    IL_0012:  ldloc.0
    IL_0013:  ldarg.2
    IL_0014:  call       void HelloWorld.Program::MultiplyAtv(int32,
                                                              float64[],
                                                              float64[])
    IL_0019:  nop
    IL_001a:  ret
  } // end of method Program::MultiplyAtAv

  .method public hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       93 (0x5d)
    .maxstack  2
    .locals init (float64 V_0,
             bool V_1)
    IL_0000:  nop
    IL_0001:  ldc.i4     0x3e8
    IL_0006:  call       float64 HelloWorld.Program::Approximate(int32)
    IL_000b:  stloc.0
    IL_000c:  ldloc.0
    IL_000d:  ldc.r8     1.2742241481294836
    IL_0016:  ceq
    IL_0018:  ldc.i4.0
    IL_0019:  ceq
    IL_001b:  stloc.1
    IL_001c:  ldloc.1
    IL_001d:  brfalse.s  IL_004f

    IL_001f:  nop
    IL_0020:  ldstr      "bad checksum: "
    IL_0025:  call       void [System.Console]System.Console::Write(string)
    IL_002a:  nop
    IL_002b:  ldloc.0
    IL_002c:  call       void [System.Console]System.Console::Write(float64)
    IL_0031:  nop
    IL_0032:  ldstr      " vs "
    IL_0037:  call       void [System.Console]System.Console::Write(string)
    IL_003c:  nop
    IL_003d:  ldc.r8     1.2742241481294836
    IL_0046:  call       void [System.Console]System.Console::WriteLine(float64)
    IL_004b:  nop
    IL_004c:  nop
    IL_004d:  br.s       IL_005c

    IL_004f:  nop
    IL_0050:  ldstr      "Correct"
    IL_0055:  call       void [System.Console]System.Console::WriteLine(string)
    IL_005a:  nop
    IL_005b:  nop
    IL_005c:  ret
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
