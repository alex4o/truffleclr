
//  Microsoft (R) .NET Framework IL Disassembler.  Version 4.5.30319.0



// Metadata version: v4.0.30319
.assembly extern System.Runtime
{
  .publickeytoken = (B0 3F 5F 7F 11 D5 0A 3A )                         // .?_....:
  .ver 4:2:2:0
}
.assembly extern System.Console
{
  .publickeytoken = (B0 3F 5F 7F 11 D5 0A 3A )                         // .?_....:
  .ver 4:1:2:0
}
.assembly extern System.Runtime.Extensions
{
  .publickeytoken = (B0 3F 5F 7F 11 D5 0A 3A )                         // .?_....:
  .ver 4:2:2:0
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
// MVID: {71bc2c24-5204-4dd7-905a-86d96597847f}
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x00007FBCAFA42000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .field public static literal int32 N = int32(0x00000008)
  .method private hidebysig static void  Main() cil managed
  {
    .entrypoint
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  call       bool HelloWorld.Program::Solve()
    IL_0006:  pop
    IL_0007:  ret
  } // end of method Program::Main

  .method private hidebysig static void  PrintSolution(int32[] board) cil managed
  {
    // Code size       79 (0x4f)
    .maxstack  3
    .locals init (int32 V_0,
             int32 V_1,
             bool V_2,
             bool V_3)
    IL_0000:  nop
    IL_0001:  ldc.i4.0
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0046

    IL_0005:  nop
    IL_0006:  ldc.i4.0
    IL_0007:  stloc.1
    IL_0008:  br.s       IL_0033

    IL_000a:  nop
    IL_000b:  ldstr      " "
    IL_0010:  call       void [System.Console]System.Console::Write(string)
    IL_0015:  nop
    IL_0016:  ldarg.0
    IL_0017:  ldloc.0
    IL_0018:  ldc.i4.8
    IL_0019:  mul
    IL_001a:  ldloc.1
    IL_001b:  add
    IL_001c:  ldelem.i4
    IL_001d:  call       void [System.Console]System.Console::Write(int32)
    IL_0022:  nop
    IL_0023:  ldstr      " "
    IL_0028:  call       void [System.Console]System.Console::Write(string)
    IL_002d:  nop
    IL_002e:  nop
    IL_002f:  ldloc.1
    IL_0030:  ldc.i4.1
    IL_0031:  add
    IL_0032:  stloc.1
    IL_0033:  ldloc.1
    IL_0034:  ldc.i4.8
    IL_0035:  clt
    IL_0037:  stloc.2
    IL_0038:  ldloc.2
    IL_0039:  brtrue.s   IL_000a

    IL_003b:  call       void [System.Console]System.Console::WriteLine()
    IL_0040:  nop
    IL_0041:  nop
    IL_0042:  ldloc.0
    IL_0043:  ldc.i4.1
    IL_0044:  add
    IL_0045:  stloc.0
    IL_0046:  ldloc.0
    IL_0047:  ldc.i4.8
    IL_0048:  clt
    IL_004a:  stloc.3
    IL_004b:  ldloc.3
    IL_004c:  brtrue.s   IL_0005

    IL_004e:  ret
  } // end of method Program::PrintSolution

  .method private hidebysig static bool  IsSafe(int32[] board,
                                                int32 row,
                                                int32 col) cil managed
  {
    // Code size       154 (0x9a)
    .maxstack  3
    .locals init (int32 V_0,
             int32 V_1,
             bool V_2,
             bool V_3,
             bool V_4,
             bool V_5,
             bool V_6,
             bool V_7,
             bool V_8)
    IL_0000:  nop
    IL_0001:  ldc.i4.0
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_001d

    IL_0005:  ldarg.0
    IL_0006:  ldarg.1
    IL_0007:  ldc.i4.8
    IL_0008:  mul
    IL_0009:  ldloc.0
    IL_000a:  add
    IL_000b:  ldelem.i4
    IL_000c:  call       bool [System.Runtime.Extensions]System.Convert::ToBoolean(int32)
    IL_0011:  stloc.2
    IL_0012:  ldloc.2
    IL_0013:  brfalse.s  IL_0019

    IL_0015:  ldc.i4.0
    IL_0016:  stloc.3
    IL_0017:  br.s       IL_0098

    IL_0019:  ldloc.0
    IL_001a:  ldc.i4.1
    IL_001b:  add
    IL_001c:  stloc.0
    IL_001d:  ldloc.0
    IL_001e:  ldarg.2
    IL_001f:  clt
    IL_0021:  stloc.s    V_4
    IL_0023:  ldloc.s    V_4
    IL_0025:  brtrue.s   IL_0005

    IL_0027:  ldarg.1
    IL_0028:  stloc.0
    IL_0029:  ldarg.2
    IL_002a:  stloc.1
    IL_002b:  br.s       IL_004b

    IL_002d:  ldarg.0
    IL_002e:  ldloc.0
    IL_002f:  ldc.i4.8
    IL_0030:  mul
    IL_0031:  ldloc.1
    IL_0032:  add
    IL_0033:  ldelem.i4
    IL_0034:  call       bool [System.Runtime.Extensions]System.Convert::ToBoolean(int32)
    IL_0039:  stloc.s    V_5
    IL_003b:  ldloc.s    V_5
    IL_003d:  brfalse.s  IL_0043

    IL_003f:  ldc.i4.0
    IL_0040:  stloc.3
    IL_0041:  br.s       IL_0098

    IL_0043:  ldloc.0
    IL_0044:  ldc.i4.1
    IL_0045:  sub
    IL_0046:  stloc.0
    IL_0047:  ldloc.1
    IL_0048:  ldc.i4.1
    IL_0049:  sub
    IL_004a:  stloc.1
    IL_004b:  ldloc.0
    IL_004c:  ldc.i4.0
    IL_004d:  blt.s      IL_0058

    IL_004f:  ldloc.1
    IL_0050:  ldc.i4.0
    IL_0051:  clt
    IL_0053:  ldc.i4.0
    IL_0054:  ceq
    IL_0056:  br.s       IL_0059

    IL_0058:  ldc.i4.0
    IL_0059:  stloc.s    V_6
    IL_005b:  ldloc.s    V_6
    IL_005d:  brtrue.s   IL_002d

    IL_005f:  ldarg.1
    IL_0060:  stloc.0
    IL_0061:  ldarg.2
    IL_0062:  stloc.1
    IL_0063:  br.s       IL_0083

    IL_0065:  ldarg.0
    IL_0066:  ldloc.0
    IL_0067:  ldc.i4.8
    IL_0068:  mul
    IL_0069:  ldloc.1
    IL_006a:  add
    IL_006b:  ldelem.i4
    IL_006c:  call       bool [System.Runtime.Extensions]System.Convert::ToBoolean(int32)
    IL_0071:  stloc.s    V_7
    IL_0073:  ldloc.s    V_7
    IL_0075:  brfalse.s  IL_007b

    IL_0077:  ldc.i4.0
    IL_0078:  stloc.3
    IL_0079:  br.s       IL_0098

    IL_007b:  ldloc.0
    IL_007c:  ldc.i4.1
    IL_007d:  add
    IL_007e:  stloc.0
    IL_007f:  ldloc.1
    IL_0080:  ldc.i4.1
    IL_0081:  sub
    IL_0082:  stloc.1
    IL_0083:  ldloc.1
    IL_0084:  ldc.i4.0
    IL_0085:  blt.s      IL_008d

    IL_0087:  ldloc.0
    IL_0088:  ldc.i4.8
    IL_0089:  clt
    IL_008b:  br.s       IL_008e

    IL_008d:  ldc.i4.0
    IL_008e:  stloc.s    V_8
    IL_0090:  ldloc.s    V_8
    IL_0092:  brtrue.s   IL_0065

    IL_0094:  ldc.i4.1
    IL_0095:  stloc.3
    IL_0096:  br.s       IL_0098

    IL_0098:  ldloc.3
    IL_0099:  ret
  } // end of method Program::IsSafe

  .method private hidebysig static bool  SolveNQ(int32[] board,
                                                 int32 col) cil managed
  {
    // Code size       91 (0x5b)
    .maxstack  3
    .locals init (bool V_0,
             bool V_1,
             int32 V_2,
             bool V_3,
             bool V_4,
             bool V_5)
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  ldc.i4.8
    IL_0003:  clt
    IL_0005:  ldc.i4.0
    IL_0006:  ceq
    IL_0008:  stloc.0
    IL_0009:  ldloc.0
    IL_000a:  brfalse.s  IL_0010

    IL_000c:  ldc.i4.1
    IL_000d:  stloc.1
    IL_000e:  br.s       IL_0059

    IL_0010:  ldc.i4.0
    IL_0011:  stloc.2
    IL_0012:  br.s       IL_004b

    IL_0014:  nop
    IL_0015:  ldarg.0
    IL_0016:  ldloc.2
    IL_0017:  ldarg.1
    IL_0018:  call       bool HelloWorld.Program::IsSafe(int32[],
                                                         int32,
                                                         int32)
    IL_001d:  stloc.3
    IL_001e:  ldloc.3
    IL_001f:  brfalse.s  IL_0046

    IL_0021:  nop
    IL_0022:  ldarg.0
    IL_0023:  ldloc.2
    IL_0024:  ldc.i4.8
    IL_0025:  mul
    IL_0026:  ldarg.1
    IL_0027:  add
    IL_0028:  ldc.i4.1
    IL_0029:  stelem.i4
    IL_002a:  ldarg.0
    IL_002b:  ldarg.1
    IL_002c:  ldc.i4.1
    IL_002d:  add
    IL_002e:  call       bool HelloWorld.Program::SolveNQ(int32[],
                                                          int32)
    IL_0033:  stloc.s    V_4
    IL_0035:  ldloc.s    V_4
    IL_0037:  brfalse.s  IL_003d

    IL_0039:  ldc.i4.1
    IL_003a:  stloc.1
    IL_003b:  br.s       IL_0059

    IL_003d:  ldarg.0
    IL_003e:  ldloc.2
    IL_003f:  ldc.i4.8
    IL_0040:  mul
    IL_0041:  ldarg.1
    IL_0042:  add
    IL_0043:  ldc.i4.0
    IL_0044:  stelem.i4
    IL_0045:  nop
    IL_0046:  nop
    IL_0047:  ldloc.2
    IL_0048:  ldc.i4.1
    IL_0049:  add
    IL_004a:  stloc.2
    IL_004b:  ldloc.2
    IL_004c:  ldc.i4.8
    IL_004d:  clt
    IL_004f:  stloc.s    V_5
    IL_0051:  ldloc.s    V_5
    IL_0053:  brtrue.s   IL_0014

    IL_0055:  ldc.i4.0
    IL_0056:  stloc.1
    IL_0057:  br.s       IL_0059

    IL_0059:  ldloc.1
    IL_005a:  ret
  } // end of method Program::SolveNQ

  .method public hidebysig static bool  Solve() cil managed
  {
    // Code size       40 (0x28)
    .maxstack  2
    .locals init (int32[] V_0,
             bool V_1,
             bool V_2)
    IL_0000:  nop
    IL_0001:  ldc.i4.s   64
    IL_0003:  newarr     [System.Runtime]System.Int32
    IL_0008:  stloc.0
    IL_0009:  ldloc.0
    IL_000a:  ldc.i4.0
    IL_000b:  call       bool HelloWorld.Program::SolveNQ(int32[],
                                                          int32)
    IL_0010:  ldc.i4.0
    IL_0011:  ceq
    IL_0013:  stloc.1
    IL_0014:  ldloc.1
    IL_0015:  brfalse.s  IL_001b

    IL_0017:  ldc.i4.0
    IL_0018:  stloc.2
    IL_0019:  br.s       IL_0026

    IL_001b:  ldloc.0
    IL_001c:  call       void HelloWorld.Program::PrintSolution(int32[])
    IL_0021:  nop
    IL_0022:  ldc.i4.1
    IL_0023:  stloc.2
    IL_0024:  br.s       IL_0026

    IL_0026:  ldloc.2
    IL_0027:  ret
  } // end of method Program::Solve

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
