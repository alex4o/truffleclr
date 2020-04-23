
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
// MVID: {628de7b1-93d8-40c1-bf35-ca0c9ffe24a8}
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x00007F88D2538000


// =============== CLASS MEMBERS DECLARATION ===================

.class public auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method public hidebysig static int32  max(int32 a,
                                             int32 b) cil managed
  {
    // Code size       21 (0x15)
    .maxstack  2
    .locals init (bool V_0,
             int32 V_1)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  cgt
    IL_0005:  stloc.0
    IL_0006:  ldloc.0
    IL_0007:  brfalse.s  IL_000e

    IL_0009:  nop
    IL_000a:  ldarg.0
    IL_000b:  stloc.1
    IL_000c:  br.s       IL_0013

    IL_000e:  nop
    IL_000f:  ldarg.1
    IL_0010:  stloc.1
    IL_0011:  br.s       IL_0013

    IL_0013:  ldloc.1
    IL_0014:  ret
  } // end of method Program::max

  .method public hidebysig static int32  fannkuch(int32 n) cil managed
  {
    // Code size       374 (0x176)
    .maxstack  5
    .locals init (int32[] V_0,
             int32[] V_1,
             int32[] V_2,
             int32 V_3,
             int32 V_4,
             int32 V_5,
             int32 V_6,
             int32 V_7,
             bool V_8,
             int32 V_9,
             int32 V_10,
             bool V_11,
             int32 V_12,
             bool V_13,
             int32 V_14,
             int32 V_15,
             int32 V_16,
             bool V_17,
             bool V_18,
             int32 V_19,
             int32 V_20,
             bool V_21,
             int32 V_22,
             int32 V_23,
             bool V_24,
             bool V_25,
             bool V_26,
             bool V_27)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  newarr     [System.Runtime]System.Int32
    IL_0007:  stloc.0
    IL_0008:  ldarg.0
    IL_0009:  newarr     [System.Runtime]System.Int32
    IL_000e:  stloc.1
    IL_000f:  ldarg.0
    IL_0010:  newarr     [System.Runtime]System.Int32
    IL_0015:  stloc.2
    IL_0016:  ldc.i4.0
    IL_0017:  stloc.3
    IL_0018:  ldc.i4.0
    IL_0019:  stloc.s    V_4
    IL_001b:  ldc.i4.0
    IL_001c:  stloc.s    V_5
    IL_001e:  ldc.i4.0
    IL_001f:  stloc.s    V_7
    IL_0021:  br.s       IL_002f

    IL_0023:  ldloc.1
    IL_0024:  ldloc.s    V_7
    IL_0026:  ldloc.s    V_7
    IL_0028:  stelem.i4
    IL_0029:  ldloc.s    V_7
    IL_002b:  ldc.i4.1
    IL_002c:  add
    IL_002d:  stloc.s    V_7
    IL_002f:  ldloc.s    V_7
    IL_0031:  ldarg.0
    IL_0032:  clt
    IL_0034:  stloc.s    V_8
    IL_0036:  ldloc.s    V_8
    IL_0038:  brtrue.s   IL_0023

    IL_003a:  ldarg.0
    IL_003b:  stloc.s    V_6
    IL_003d:  br         IL_016b

    IL_0042:  nop
    IL_0043:  br.s       IL_0055

    IL_0045:  nop
    IL_0046:  ldloc.2
    IL_0047:  ldloc.s    V_6
    IL_0049:  ldc.i4.1
    IL_004a:  sub
    IL_004b:  ldloc.s    V_6
    IL_004d:  stelem.i4
    IL_004e:  ldloc.s    V_6
    IL_0050:  ldc.i4.1
    IL_0051:  sub
    IL_0052:  stloc.s    V_6
    IL_0054:  nop
    IL_0055:  ldloc.s    V_6
    IL_0057:  ldc.i4.1
    IL_0058:  ceq
    IL_005a:  ldc.i4.0
    IL_005b:  ceq
    IL_005d:  stloc.s    V_11
    IL_005f:  ldloc.s    V_11
    IL_0061:  brtrue.s   IL_0045

    IL_0063:  ldc.i4.0
    IL_0064:  stloc.s    V_12
    IL_0066:  br.s       IL_0076

    IL_0068:  ldloc.0
    IL_0069:  ldloc.s    V_12
    IL_006b:  ldloc.1
    IL_006c:  ldloc.s    V_12
    IL_006e:  ldelem.i4
    IL_006f:  stelem.i4
    IL_0070:  ldloc.s    V_12
    IL_0072:  ldc.i4.1
    IL_0073:  add
    IL_0074:  stloc.s    V_12
    IL_0076:  ldloc.s    V_12
    IL_0078:  ldarg.0
    IL_0079:  clt
    IL_007b:  stloc.s    V_13
    IL_007d:  ldloc.s    V_13
    IL_007f:  brtrue.s   IL_0068

    IL_0081:  ldc.i4.0
    IL_0082:  stloc.s    V_9
    IL_0084:  br.s       IL_00c9

    IL_0086:  nop
    IL_0087:  ldloc.s    V_10
    IL_0089:  ldc.i4.1
    IL_008a:  add
    IL_008b:  ldc.i4.1
    IL_008c:  shr
    IL_008d:  stloc.s    V_14
    IL_008f:  ldc.i4.0
    IL_0090:  stloc.s    V_15
    IL_0092:  br.s       IL_00b6

    IL_0094:  nop
    IL_0095:  ldloc.0
    IL_0096:  ldloc.s    V_15
    IL_0098:  ldelem.i4
    IL_0099:  stloc.s    V_16
    IL_009b:  ldloc.0
    IL_009c:  ldloc.s    V_15
    IL_009e:  ldloc.0
    IL_009f:  ldloc.s    V_10
    IL_00a1:  ldloc.s    V_15
    IL_00a3:  sub
    IL_00a4:  ldelem.i4
    IL_00a5:  stelem.i4
    IL_00a6:  ldloc.0
    IL_00a7:  ldloc.s    V_10
    IL_00a9:  ldloc.s    V_15
    IL_00ab:  sub
    IL_00ac:  ldloc.s    V_16
    IL_00ae:  stelem.i4
    IL_00af:  nop
    IL_00b0:  ldloc.s    V_15
    IL_00b2:  ldc.i4.1
    IL_00b3:  add
    IL_00b4:  stloc.s    V_15
    IL_00b6:  ldloc.s    V_15
    IL_00b8:  ldloc.s    V_14
    IL_00ba:  clt
    IL_00bc:  stloc.s    V_17
    IL_00be:  ldloc.s    V_17
    IL_00c0:  brtrue.s   IL_0094

    IL_00c2:  ldloc.s    V_9
    IL_00c4:  ldc.i4.1
    IL_00c5:  add
    IL_00c6:  stloc.s    V_9
    IL_00c8:  nop
    IL_00c9:  ldloc.0
    IL_00ca:  ldc.i4.0
    IL_00cb:  ldelem.i4
    IL_00cc:  dup
    IL_00cd:  stloc.s    V_10
    IL_00cf:  ldc.i4.0
    IL_00d0:  cgt.un
    IL_00d2:  stloc.s    V_18
    IL_00d4:  ldloc.s    V_18
    IL_00d6:  brtrue.s   IL_0086

    IL_00d8:  ldloc.3
    IL_00d9:  ldloc.s    V_9
    IL_00db:  call       int32 HelloWorld.Program::max(int32,
                                                       int32)
    IL_00e0:  stloc.3
    IL_00e1:  ldloc.s    V_5
    IL_00e3:  ldloc.s    V_4
    IL_00e5:  ldc.i4.2
    IL_00e6:  rem
    IL_00e7:  brfalse.s  IL_00ee

    IL_00e9:  ldloc.s    V_9
    IL_00eb:  neg
    IL_00ec:  br.s       IL_00f0

    IL_00ee:  ldloc.s    V_9
    IL_00f0:  add
    IL_00f1:  stloc.s    V_5
    IL_00f3:  br.s       IL_015f

    IL_00f5:  nop
    IL_00f6:  ldloc.s    V_6
    IL_00f8:  ldarg.0
    IL_00f9:  ceq
    IL_00fb:  stloc.s    V_21
    IL_00fd:  ldloc.s    V_21
    IL_00ff:  brfalse.s  IL_010f

    IL_0101:  nop
    IL_0102:  ldloc.s    V_5
    IL_0104:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0109:  nop
    IL_010a:  ldloc.3
    IL_010b:  stloc.s    V_22
    IL_010d:  br.s       IL_0173

    IL_010f:  ldloc.1
    IL_0110:  ldc.i4.0
    IL_0111:  ldelem.i4
    IL_0112:  stloc.s    V_19
    IL_0114:  ldc.i4.0
    IL_0115:  stloc.s    V_20
    IL_0117:  br.s       IL_012d

    IL_0119:  nop
    IL_011a:  ldloc.s    V_20
    IL_011c:  ldc.i4.1
    IL_011d:  add
    IL_011e:  stloc.s    V_23
    IL_0120:  ldloc.1
    IL_0121:  ldloc.s    V_20
    IL_0123:  ldloc.1
    IL_0124:  ldloc.s    V_23
    IL_0126:  ldelem.i4
    IL_0127:  stelem.i4
    IL_0128:  ldloc.s    V_23
    IL_012a:  stloc.s    V_20
    IL_012c:  nop
    IL_012d:  ldloc.s    V_20
    IL_012f:  ldloc.s    V_6
    IL_0131:  clt
    IL_0133:  stloc.s    V_24
    IL_0135:  ldloc.s    V_24
    IL_0137:  brtrue.s   IL_0119

    IL_0139:  ldloc.1
    IL_013a:  ldloc.s    V_6
    IL_013c:  ldloc.s    V_19
    IL_013e:  stelem.i4
    IL_013f:  ldloc.2
    IL_0140:  ldloc.s    V_6
    IL_0142:  ldloc.2
    IL_0143:  ldloc.s    V_6
    IL_0145:  ldelem.i4
    IL_0146:  ldc.i4.1
    IL_0147:  sub
    IL_0148:  stelem.i4
    IL_0149:  ldloc.2
    IL_014a:  ldloc.s    V_6
    IL_014c:  ldelem.i4
    IL_014d:  ldc.i4.0
    IL_014e:  cgt
    IL_0150:  stloc.s    V_25
    IL_0152:  ldloc.s    V_25
    IL_0154:  brfalse.s  IL_0158

    IL_0156:  br.s       IL_0164

    IL_0158:  ldloc.s    V_6
    IL_015a:  ldc.i4.1
    IL_015b:  add
    IL_015c:  stloc.s    V_6
    IL_015e:  nop
    IL_015f:  ldc.i4.1
    IL_0160:  stloc.s    V_26
    IL_0162:  br.s       IL_00f5

    IL_0164:  ldloc.s    V_4
    IL_0166:  ldc.i4.1
    IL_0167:  add
    IL_0168:  stloc.s    V_4
    IL_016a:  nop
    IL_016b:  ldc.i4.1
    IL_016c:  stloc.s    V_27
    IL_016e:  br         IL_0042

    IL_0173:  ldloc.s    V_22
    IL_0175:  ret
  } // end of method Program::fannkuch

  .method public hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       45 (0x2d)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.s   10
    IL_0002:  stloc.0
    IL_0003:  ldstr      "Pfannkuchen("
    IL_0008:  call       void [System.Console]System.Console::Write(string)
    IL_000d:  nop
    IL_000e:  ldloc.0
    IL_000f:  call       void [System.Console]System.Console::Write(int32)
    IL_0014:  nop
    IL_0015:  ldstr      ") = "
    IL_001a:  call       void [System.Console]System.Console::Write(string)
    IL_001f:  nop
    IL_0020:  ldloc.0
    IL_0021:  call       int32 HelloWorld.Program::fannkuch(int32)
    IL_0026:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_002b:  nop
    IL_002c:  ret
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
