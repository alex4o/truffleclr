
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
// MVID: {5b35d410-76ba-4c98-a654-9956676d6ab4}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 )
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x102eac000


// =============== CLASS MEMBERS DECLARATION ===================

.class private sequential ansi sealed beforefieldinit HelloWorld.Point
       extends [System.Runtime]System.ValueType
{
  .field public int32 X
  .field public int32 Y
  .method public hidebysig specialname rtspecialname
          instance void  .ctor(int32 x) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  initobj    HelloWorld.Point
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      int32 HelloWorld.Point::X
    IL_000f:  ret
  } // end of method Point::.ctor

  .method public hidebysig instance void
          Reset() cil managed
  {
    // Code size       9 (0x9)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  initobj    HelloWorld.Point
    IL_0008:  ret
  } // end of method Point::Reset

} // end of class HelloWorld.Point

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static valuetype HelloWorld.Point
          Make(int32 x) cil managed
  {
    // Code size       12 (0xc)
    .maxstack  1
    .locals init (valuetype HelloWorld.Point V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  newobj     instance void HelloWorld.Point::.ctor(int32)
    IL_0007:  stloc.0
    IL_0008:  br.s       IL_000a

    IL_000a:  ldloc.0
    IL_000b:  ret
  } // end of method Program::Make

  .method private hidebysig static int32
          Arg(int32 x) cil managed
  {
    // Code size       15 (0xf)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarga.s   x
    IL_0003:  call       void HelloWorld.Program::Bump(int32&)
    IL_0008:  nop
    IL_0009:  ldarg.0
    IL_000a:  stloc.0
    IL_000b:  br.s       IL_000d

    IL_000d:  ldloc.0
    IL_000e:  ret
  } // end of method Program::Arg

  .method private hidebysig static void  Bump(int32& x) cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldind.i4
    IL_0004:  ldc.i4.1
    IL_0005:  add
    IL_0006:  stind.i4
    IL_0007:  ret
  } // end of method Program::Bump

  .method private hidebysig static void  U8(uint8& x) cil managed
  {
    // Code size       9 (0x9)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldc.i4     0xff
    IL_0007:  stind.i1
    IL_0008:  ret
  } // end of method Program::U8

  .method private hidebysig static void  I8(int8& x) cil managed
  {
    // Code size       6 (0x6)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldc.i4.s   -128
    IL_0004:  stind.i1
    IL_0005:  ret
  } // end of method Program::I8

  .method private hidebysig static void  U16(uint16& x) cil managed
  {
    // Code size       9 (0x9)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldc.i4     0xffff
    IL_0007:  stind.i2
    IL_0008:  ret
  } // end of method Program::U16

  .method private hidebysig static void  I16(int16& x) cil managed
  {
    // Code size       9 (0x9)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldc.i4     0xffff8000
    IL_0007:  stind.i2
    IL_0008:  ret
  } // end of method Program::I16

  .method private hidebysig static void  U32(uint32& x) cil managed
  {
    // Code size       5 (0x5)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldc.i4.m1
    IL_0003:  stind.i4
    IL_0004:  ret
  } // end of method Program::U32

  .method private hidebysig static void  U64(uint64& x) cil managed
  {
    // Code size       6 (0x6)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldc.i4.m1
    IL_0003:  conv.i8
    IL_0004:  stind.i8
    IL_0005:  ret
  } // end of method Program::U64

  .method private hidebysig static void  B(bool& x) cil managed
  {
    // Code size       5 (0x5)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldc.i4.1
    IL_0003:  stind.i1
    IL_0004:  ret
  } // end of method Program::B

  .method private hidebysig static void  C(char& x) cil managed
  {
    // Code size       6 (0x6)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldc.i4.s   90
    IL_0004:  stind.i2
    IL_0005:  ret
  } // end of method Program::C

  .method private hidebysig static void  R(object& x) cil managed
  {
    // Code size       9 (0x9)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldstr      "changed"
    IL_0007:  stind.ref
    IL_0008:  ret
  } // end of method Program::R

  .method private hidebysig static void  Clear(string& x) cil managed
  {
    // Code size       5 (0x5)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldnull
    IL_0003:  stind.ref
    IL_0004:  ret
  } // end of method Program::Clear

  .method private hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       577 (0x241)
    .maxstack  4
    .locals init (valuetype HelloWorld.Point V_0,
             uint8[] V_1,
             int8[] V_2,
             uint16[] V_3,
             int16[] V_4,
             uint32[] V_5,
             uint64[] V_6,
             bool[] V_7,
             char[] V_8,
             object[] V_9,
             string[] V_10,
             object V_11,
             object V_12,
             object V_13)
    IL_0000:  nop
    IL_0001:  ldc.i4.s   9
    IL_0003:  call       valuetype HelloWorld.Point HelloWorld.Program::Make(int32)
    IL_0008:  stloc.0
    IL_0009:  ldloc.0
    IL_000a:  ldfld      int32 HelloWorld.Point::X
    IL_000f:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0014:  nop
    IL_0015:  ldloc.0
    IL_0016:  ldfld      int32 HelloWorld.Point::Y
    IL_001b:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0020:  nop
    IL_0021:  ldloca.s   V_0
    IL_0023:  call       instance void HelloWorld.Point::Reset()
    IL_0028:  nop
    IL_0029:  ldloc.0
    IL_002a:  ldfld      int32 HelloWorld.Point::X
    IL_002f:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0034:  nop
    IL_0035:  ldc.i4.6
    IL_0036:  call       int32 HelloWorld.Program::Arg(int32)
    IL_003b:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0040:  nop
    IL_0041:  ldc.i4.1
    IL_0042:  newarr     [System.Runtime]System.Byte
    IL_0047:  stloc.1
    IL_0048:  ldloc.1
    IL_0049:  ldc.i4.0
    IL_004a:  ldelema    [System.Runtime]System.Byte
    IL_004f:  call       void HelloWorld.Program::U8(uint8&)
    IL_0054:  nop
    IL_0055:  ldloc.1
    IL_0056:  ldc.i4.0
    IL_0057:  ldelem.u1
    IL_0058:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_005d:  nop
    IL_005e:  ldc.i4.1
    IL_005f:  newarr     [System.Runtime]System.SByte
    IL_0064:  stloc.2
    IL_0065:  ldloc.2
    IL_0066:  ldc.i4.0
    IL_0067:  ldelema    [System.Runtime]System.SByte
    IL_006c:  call       void HelloWorld.Program::I8(int8&)
    IL_0071:  nop
    IL_0072:  ldloc.2
    IL_0073:  ldc.i4.0
    IL_0074:  ldelem.i1
    IL_0075:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_007a:  nop
    IL_007b:  ldc.i4.1
    IL_007c:  newarr     [System.Runtime]System.UInt16
    IL_0081:  stloc.3
    IL_0082:  ldloc.3
    IL_0083:  ldc.i4.0
    IL_0084:  ldelema    [System.Runtime]System.UInt16
    IL_0089:  call       void HelloWorld.Program::U16(uint16&)
    IL_008e:  nop
    IL_008f:  ldloc.3
    IL_0090:  ldc.i4.0
    IL_0091:  ldelem.u2
    IL_0092:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0097:  nop
    IL_0098:  ldc.i4.1
    IL_0099:  newarr     [System.Runtime]System.Int16
    IL_009e:  stloc.s    V_4
    IL_00a0:  ldloc.s    V_4
    IL_00a2:  ldc.i4.0
    IL_00a3:  ldelema    [System.Runtime]System.Int16
    IL_00a8:  call       void HelloWorld.Program::I16(int16&)
    IL_00ad:  nop
    IL_00ae:  ldloc.s    V_4
    IL_00b0:  ldc.i4.0
    IL_00b1:  ldelem.i2
    IL_00b2:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00b7:  nop
    IL_00b8:  ldc.i4.1
    IL_00b9:  newarr     [System.Runtime]System.UInt32
    IL_00be:  stloc.s    V_5
    IL_00c0:  ldloc.s    V_5
    IL_00c2:  ldc.i4.0
    IL_00c3:  ldelema    [System.Runtime]System.UInt32
    IL_00c8:  call       void HelloWorld.Program::U32(uint32&)
    IL_00cd:  nop
    IL_00ce:  ldloc.s    V_5
    IL_00d0:  ldc.i4.0
    IL_00d1:  ldelem.u4
    IL_00d2:  call       void [System.Console]System.Console::WriteLine(uint32)
    IL_00d7:  nop
    IL_00d8:  ldc.i4.1
    IL_00d9:  newarr     [System.Runtime]System.UInt64
    IL_00de:  stloc.s    V_6
    IL_00e0:  ldloc.s    V_6
    IL_00e2:  ldc.i4.0
    IL_00e3:  ldelema    [System.Runtime]System.UInt64
    IL_00e8:  call       void HelloWorld.Program::U64(uint64&)
    IL_00ed:  nop
    IL_00ee:  ldloc.s    V_6
    IL_00f0:  ldc.i4.0
    IL_00f1:  ldelem.i8
    IL_00f2:  call       void [System.Console]System.Console::WriteLine(uint64)
    IL_00f7:  nop
    IL_00f8:  ldc.i4.1
    IL_00f9:  newarr     [System.Runtime]System.Boolean
    IL_00fe:  stloc.s    V_7
    IL_0100:  ldloc.s    V_7
    IL_0102:  ldc.i4.0
    IL_0103:  ldelema    [System.Runtime]System.Boolean
    IL_0108:  call       void HelloWorld.Program::B(bool&)
    IL_010d:  nop
    IL_010e:  ldloc.s    V_7
    IL_0110:  ldc.i4.0
    IL_0111:  ldelem.u1
    IL_0112:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_0117:  nop
    IL_0118:  ldc.i4.1
    IL_0119:  newarr     [System.Runtime]System.Char
    IL_011e:  stloc.s    V_8
    IL_0120:  ldloc.s    V_8
    IL_0122:  ldc.i4.0
    IL_0123:  ldelema    [System.Runtime]System.Char
    IL_0128:  call       void HelloWorld.Program::C(char&)
    IL_012d:  nop
    IL_012e:  ldloc.s    V_8
    IL_0130:  ldc.i4.0
    IL_0131:  ldelem.u2
    IL_0132:  call       void [System.Console]System.Console::WriteLine(char)
    IL_0137:  nop
    IL_0138:  ldc.i4.1
    IL_0139:  newarr     [System.Runtime]System.Object
    IL_013e:  stloc.s    V_9
    IL_0140:  ldloc.s    V_9
    IL_0142:  ldc.i4.0
    IL_0143:  ldelema    [System.Runtime]System.Object
    IL_0148:  call       void HelloWorld.Program::R(object&)
    IL_014d:  nop
    IL_014e:  ldloc.s    V_9
    IL_0150:  ldc.i4.0
    IL_0151:  ldelem.ref
    IL_0152:  call       void [System.Console]System.Console::WriteLine(object)
    IL_0157:  nop
    IL_0158:  ldc.i4.1
    IL_0159:  newarr     [System.Runtime]System.String
    IL_015e:  dup
    IL_015f:  ldc.i4.0
    IL_0160:  ldstr      "old"
    IL_0165:  stelem.ref
    IL_0166:  stloc.s    V_10
    IL_0168:  ldloc.s    V_10
    IL_016a:  ldc.i4.0
    IL_016b:  ldelema    [System.Runtime]System.String
    IL_0170:  call       void HelloWorld.Program::Clear(string&)
    IL_0175:  nop
    IL_0176:  ldloc.s    V_10
    IL_0178:  ldc.i4.0
    IL_0179:  ldelem.ref
    IL_017a:  ldnull
    IL_017b:  ceq
    IL_017d:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_0182:  nop
    IL_0183:  ldc.i4.1
    IL_0184:  newarr     HelloWorld.Program
    IL_0189:  stloc.s    V_11
    IL_018b:  ldloc.s    V_11
    IL_018d:  isinst     class HelloWorld.Program[]
    IL_0192:  ldnull
    IL_0193:  cgt.un
    IL_0195:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_019a:  nop
    IL_019b:  ldloc.s    V_11
    IL_019d:  castclass  class HelloWorld.Program[]
    IL_01a2:  ldlen
    IL_01a3:  conv.i4
    IL_01a4:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_01a9:  nop
    IL_01aa:  ldc.i4.2
    IL_01ab:  newarr     [System.Runtime]System.Int32
    IL_01b0:  stloc.s    V_12
    IL_01b2:  ldloc.s    V_12
    IL_01b4:  ldnull
    IL_01b5:  cgt.un
    IL_01b7:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_01bc:  nop
    IL_01bd:  ldloc.s    V_12
    IL_01bf:  isinst     int32[]
    IL_01c4:  ldnull
    IL_01c5:  cgt.un
    IL_01c7:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_01cc:  nop
    IL_01cd:  ldloc.s    V_12
    IL_01cf:  castclass  int32[]
    IL_01d4:  ldlen
    IL_01d5:  conv.i4
    IL_01d6:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_01db:  nop
    IL_01dc:  ldc.i4.0
    IL_01dd:  newarr     HelloWorld.Point
    IL_01e2:  stloc.s    V_13
    IL_01e4:  ldloc.s    V_13
    IL_01e6:  ldnull
    IL_01e7:  cgt.un
    IL_01e9:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_01ee:  nop
    IL_01ef:  ldloc.s    V_13
    IL_01f1:  isinst     valuetype HelloWorld.Point[]
    IL_01f6:  ldnull
    IL_01f7:  cgt.un
    IL_01f9:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_01fe:  nop
    IL_01ff:  ldloc.s    V_13
    IL_0201:  castclass  valuetype HelloWorld.Point[]
    IL_0206:  ldlen
    IL_0207:  conv.i4
    IL_0208:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_020d:  nop
    IL_020e:  ldc.i4.1
    IL_020f:  box        [System.Runtime]System.Boolean
    IL_0214:  call       void [System.Console]System.Console::WriteLine(object)
    IL_0219:  nop
    IL_021a:  ldc.i4.s   90
    IL_021c:  box        [System.Runtime]System.Char
    IL_0221:  call       void [System.Console]System.Console::WriteLine(object)
    IL_0226:  nop
    IL_0227:  ldc.i4.m1
    IL_0228:  box        [System.Runtime]System.UInt32
    IL_022d:  call       void [System.Console]System.Console::WriteLine(object)
    IL_0232:  nop
    IL_0233:  ldc.i4.m1
    IL_0234:  conv.i8
    IL_0235:  box        [System.Runtime]System.UInt64
    IL_023a:  call       void [System.Console]System.Console::WriteLine(object)
    IL_023f:  nop
    IL_0240:  ret
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
