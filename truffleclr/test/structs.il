
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
// MVID: {bc67450e-e1e8-45a4-a82b-2dc95432b461}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 )
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x104404000


// =============== CLASS MEMBERS DECLARATION ===================

.class private sequential ansi sealed beforefieldinit HelloWorld.Pair
       extends [System.Runtime]System.ValueType
{
  .field public int32 X
  .field public int32 Y
  .field public static valuetype HelloWorld.Pair Shared
  .method public hidebysig specialname rtspecialname
          instance void  .ctor(int32 x,
                               int32 y) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  stfld      int32 HelloWorld.Pair::X
    IL_0008:  ldarg.0
    IL_0009:  ldarg.2
    IL_000a:  stfld      int32 HelloWorld.Pair::Y
    IL_000f:  ret
  } // end of method Pair::.ctor

  .method public hidebysig instance void
          Add(int32 amount) cil managed
  {
    // Code size       30 (0x1e)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      int32 HelloWorld.Pair::X
    IL_0008:  ldarg.1
    IL_0009:  add
    IL_000a:  stfld      int32 HelloWorld.Pair::X
    IL_000f:  ldarg.0
    IL_0010:  ldarg.0
    IL_0011:  ldfld      int32 HelloWorld.Pair::Y
    IL_0016:  ldarg.1
    IL_0017:  add
    IL_0018:  stfld      int32 HelloWorld.Pair::Y
    IL_001d:  ret
  } // end of method Pair::Add

  .method public hidebysig instance void
          Reset(int32 x,
                int32 y) cil managed
  {
    // Code size       15 (0xf)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  ldarg.2
    IL_0004:  newobj     instance void HelloWorld.Pair::.ctor(int32,
                                                              int32)
    IL_0009:  stobj      HelloWorld.Pair
    IL_000e:  ret
  } // end of method Pair::Reset

  .method public hidebysig virtual instance string
          ToString() cil managed
  {
    // Code size       11 (0xb)
    .maxstack  1
    .locals init (string V_0)
    IL_0000:  nop
    IL_0001:  ldstr      "boxed pair"
    IL_0006:  stloc.0
    IL_0007:  br.s       IL_0009

    IL_0009:  ldloc.0
    IL_000a:  ret
  } // end of method Pair::ToString

} // end of class HelloWorld.Pair

.class private sequential ansi sealed beforefieldinit HelloWorld.Nested
       extends [System.Runtime]System.ValueType
{
  .field public valuetype HelloWorld.Pair Value
  .field public int32 Tag
} // end of class HelloWorld.Nested

.class private auto ansi beforefieldinit HelloWorld.Holder
       extends [System.Runtime]System.Object
{
  .field public valuetype HelloWorld.Nested Item
  .field public static valuetype HelloWorld.Pair Shared
  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Holder::.ctor

} // end of class HelloWorld.Holder

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static valuetype HelloWorld.Pair
          Make(int32 x,
               int32 y) cil managed
  {
    // Code size       13 (0xd)
    .maxstack  2
    .locals init (valuetype HelloWorld.Pair V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  newobj     instance void HelloWorld.Pair::.ctor(int32,
                                                              int32)
    IL_0008:  stloc.0
    IL_0009:  br.s       IL_000b

    IL_000b:  ldloc.0
    IL_000c:  ret
  } // end of method Program::Make

  .method private hidebysig static valuetype HelloWorld.Pair
          ChangeCopy(valuetype HelloWorld.Pair 'value') cil managed
  {
    // Code size       17 (0x11)
    .maxstack  2
    .locals init (valuetype HelloWorld.Pair V_0)
    IL_0000:  nop
    IL_0001:  ldarga.s   'value'
    IL_0003:  ldc.i4.s   10
    IL_0005:  call       instance void HelloWorld.Pair::Add(int32)
    IL_000a:  nop
    IL_000b:  ldarg.0
    IL_000c:  stloc.0
    IL_000d:  br.s       IL_000f

    IL_000f:  ldloc.0
    IL_0010:  ret
  } // end of method Program::ChangeCopy

  .method private hidebysig static void  Print(valuetype HelloWorld.Pair 'value') cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      int32 HelloWorld.Pair::X
    IL_0007:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_000c:  nop
    IL_000d:  ldarg.0
    IL_000e:  ldfld      int32 HelloWorld.Pair::Y
    IL_0013:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0018:  nop
    IL_0019:  ret
  } // end of method Program::Print

  .method private hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       651 (0x28b)
    .maxstack  4
    .locals init (valuetype HelloWorld.Pair V_0,
             valuetype HelloWorld.Pair V_1,
             valuetype HelloWorld.Pair V_2,
             valuetype HelloWorld.Nested V_3,
             valuetype HelloWorld.Nested V_4,
             class HelloWorld.Holder V_5,
             valuetype HelloWorld.Pair[] V_6,
             object V_7,
             object V_8,
             valuetype HelloWorld.Pair V_9)
    IL_0000:  nop
    IL_0001:  ldloca.s   V_0
    IL_0003:  initobj    HelloWorld.Pair
    IL_0009:  ldloc.0
    IL_000a:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_000f:  nop
    IL_0010:  ldloca.s   V_1
    IL_0012:  ldc.i4.2
    IL_0013:  ldc.i4.3
    IL_0014:  call       instance void HelloWorld.Pair::.ctor(int32,
                                                              int32)
    IL_0019:  ldloc.1
    IL_001a:  stloc.2
    IL_001b:  ldloca.s   V_2
    IL_001d:  ldc.i4.4
    IL_001e:  call       instance void HelloWorld.Pair::Add(int32)
    IL_0023:  nop
    IL_0024:  ldloc.1
    IL_0025:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_002a:  nop
    IL_002b:  ldloc.2
    IL_002c:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_0031:  nop
    IL_0032:  ldloc.1
    IL_0033:  call       valuetype HelloWorld.Pair HelloWorld.Program::ChangeCopy(valuetype HelloWorld.Pair)
    IL_0038:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_003d:  nop
    IL_003e:  ldloc.1
    IL_003f:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_0044:  nop
    IL_0045:  ldloca.s   V_2
    IL_0047:  ldc.i4.7
    IL_0048:  ldc.i4.8
    IL_0049:  call       instance void HelloWorld.Pair::Reset(int32,
                                                              int32)
    IL_004e:  nop
    IL_004f:  ldloc.2
    IL_0050:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_0055:  nop
    IL_0056:  ldloca.s   V_3
    IL_0058:  initobj    HelloWorld.Nested
    IL_005e:  ldloca.s   V_3
    IL_0060:  ldc.i4.s   11
    IL_0062:  ldc.i4.s   12
    IL_0064:  call       valuetype HelloWorld.Pair HelloWorld.Program::Make(int32,
                                                                            int32)
    IL_0069:  stfld      valuetype HelloWorld.Pair HelloWorld.Nested::Value
    IL_006e:  ldloca.s   V_3
    IL_0070:  ldc.i4.s   13
    IL_0072:  stfld      int32 HelloWorld.Nested::Tag
    IL_0077:  ldloc.3
    IL_0078:  stloc.s    V_4
    IL_007a:  ldloca.s   V_4
    IL_007c:  ldflda     valuetype HelloWorld.Pair HelloWorld.Nested::Value
    IL_0081:  ldc.i4.s   99
    IL_0083:  stfld      int32 HelloWorld.Pair::X
    IL_0088:  ldloc.3
    IL_0089:  ldfld      valuetype HelloWorld.Pair HelloWorld.Nested::Value
    IL_008e:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_0093:  nop
    IL_0094:  ldloc.s    V_4
    IL_0096:  ldfld      valuetype HelloWorld.Pair HelloWorld.Nested::Value
    IL_009b:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_00a0:  nop
    IL_00a1:  ldloc.s    V_4
    IL_00a3:  ldfld      int32 HelloWorld.Nested::Tag
    IL_00a8:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00ad:  nop
    IL_00ae:  newobj     instance void HelloWorld.Holder::.ctor()
    IL_00b3:  stloc.s    V_5
    IL_00b5:  ldloc.s    V_5
    IL_00b7:  ldflda     valuetype HelloWorld.Nested HelloWorld.Holder::Item
    IL_00bc:  ldfld      valuetype HelloWorld.Pair HelloWorld.Nested::Value
    IL_00c1:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_00c6:  nop
    IL_00c7:  ldloc.s    V_5
    IL_00c9:  ldloc.3
    IL_00ca:  stfld      valuetype HelloWorld.Nested HelloWorld.Holder::Item
    IL_00cf:  ldloc.s    V_5
    IL_00d1:  ldflda     valuetype HelloWorld.Nested HelloWorld.Holder::Item
    IL_00d6:  ldflda     valuetype HelloWorld.Pair HelloWorld.Nested::Value
    IL_00db:  ldc.i4.2
    IL_00dc:  call       instance void HelloWorld.Pair::Add(int32)
    IL_00e1:  nop
    IL_00e2:  ldloc.s    V_5
    IL_00e4:  ldflda     valuetype HelloWorld.Nested HelloWorld.Holder::Item
    IL_00e9:  ldfld      valuetype HelloWorld.Pair HelloWorld.Nested::Value
    IL_00ee:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_00f3:  nop
    IL_00f4:  ldloc.3
    IL_00f5:  ldfld      valuetype HelloWorld.Pair HelloWorld.Nested::Value
    IL_00fa:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_00ff:  nop
    IL_0100:  ldsfld     valuetype HelloWorld.Pair HelloWorld.Holder::Shared
    IL_0105:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_010a:  nop
    IL_010b:  ldsfld     valuetype HelloWorld.Pair HelloWorld.Pair::Shared
    IL_0110:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_0115:  nop
    IL_0116:  ldc.i4.s   20
    IL_0118:  ldc.i4.s   21
    IL_011a:  call       valuetype HelloWorld.Pair HelloWorld.Program::Make(int32,
                                                                            int32)
    IL_011f:  stsfld     valuetype HelloWorld.Pair HelloWorld.Holder::Shared
    IL_0124:  ldsflda    valuetype HelloWorld.Pair HelloWorld.Holder::Shared
    IL_0129:  ldc.i4.3
    IL_012a:  call       instance void HelloWorld.Pair::Add(int32)
    IL_012f:  nop
    IL_0130:  ldsfld     valuetype HelloWorld.Pair HelloWorld.Holder::Shared
    IL_0135:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_013a:  nop
    IL_013b:  ldc.i4.s   30
    IL_013d:  ldc.i4.s   31
    IL_013f:  call       valuetype HelloWorld.Pair HelloWorld.Program::Make(int32,
                                                                            int32)
    IL_0144:  stsfld     valuetype HelloWorld.Pair HelloWorld.Pair::Shared
    IL_0149:  ldsflda    valuetype HelloWorld.Pair HelloWorld.Pair::Shared
    IL_014e:  ldflda     int32 HelloWorld.Pair::Y
    IL_0153:  dup
    IL_0154:  ldind.i4
    IL_0155:  ldc.i4.1
    IL_0156:  add
    IL_0157:  stind.i4
    IL_0158:  ldsfld     valuetype HelloWorld.Pair HelloWorld.Pair::Shared
    IL_015d:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_0162:  nop
    IL_0163:  ldc.i4.2
    IL_0164:  newarr     HelloWorld.Pair
    IL_0169:  stloc.s    V_6
    IL_016b:  ldloc.s    V_6
    IL_016d:  ldc.i4.0
    IL_016e:  ldelem     HelloWorld.Pair
    IL_0173:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_0178:  nop
    IL_0179:  ldloc.s    V_6
    IL_017b:  ldc.i4.0
    IL_017c:  ldloc.1
    IL_017d:  stelem     HelloWorld.Pair
    IL_0182:  ldloc.s    V_6
    IL_0184:  ldc.i4.1
    IL_0185:  ldloc.s    V_6
    IL_0187:  ldc.i4.0
    IL_0188:  ldelem     HelloWorld.Pair
    IL_018d:  stelem     HelloWorld.Pair
    IL_0192:  ldloc.s    V_6
    IL_0194:  ldc.i4.1
    IL_0195:  ldelema    HelloWorld.Pair
    IL_019a:  ldc.i4.5
    IL_019b:  call       instance void HelloWorld.Pair::Add(int32)
    IL_01a0:  nop
    IL_01a1:  ldloc.s    V_6
    IL_01a3:  ldc.i4.0
    IL_01a4:  ldelema    HelloWorld.Pair
    IL_01a9:  ldflda     int32 HelloWorld.Pair::X
    IL_01ae:  dup
    IL_01af:  ldind.i4
    IL_01b0:  ldc.i4.1
    IL_01b1:  add
    IL_01b2:  stind.i4
    IL_01b3:  ldloc.s    V_6
    IL_01b5:  ldc.i4.0
    IL_01b6:  ldelem     HelloWorld.Pair
    IL_01bb:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_01c0:  nop
    IL_01c1:  ldloc.s    V_6
    IL_01c3:  ldc.i4.1
    IL_01c4:  ldelem     HelloWorld.Pair
    IL_01c9:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_01ce:  nop
    IL_01cf:  ldloc.1
    IL_01d0:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_01d5:  nop
    IL_01d6:  ldloc.1
    IL_01d7:  box        HelloWorld.Pair
    IL_01dc:  stloc.s    V_7
    IL_01de:  ldloca.s   V_1
    IL_01e0:  ldc.i4.s   100
    IL_01e2:  call       instance void HelloWorld.Pair::Add(int32)
    IL_01e7:  nop
    IL_01e8:  ldloc.s    V_7
    IL_01ea:  callvirt   instance string [System.Runtime]System.Object::ToString()
    IL_01ef:  call       void [System.Console]System.Console::WriteLine(string)
    IL_01f4:  nop
    IL_01f5:  ldloc.s    V_7
    IL_01f7:  call       void [System.Console]System.Console::WriteLine(object)
    IL_01fc:  nop
    IL_01fd:  ldloc.s    V_7
    IL_01ff:  isinst     HelloWorld.Pair
    IL_0204:  ldnull
    IL_0205:  cgt.un
    IL_0207:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_020c:  nop
    IL_020d:  ldloc.s    V_7
    IL_020f:  isinst     HelloWorld.Holder
    IL_0214:  ldnull
    IL_0215:  cgt.un
    IL_0217:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_021c:  nop
    IL_021d:  ldc.i4.s   42
    IL_021f:  box        [System.Runtime]System.Int32
    IL_0224:  stloc.s    V_8
    IL_0226:  ldloc.s    V_8
    IL_0228:  isinst     [System.Runtime]System.Int32
    IL_022d:  ldnull
    IL_022e:  cgt.un
    IL_0230:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_0235:  nop
    IL_0236:  ldloc.s    V_8
    IL_0238:  isinst     HelloWorld.Pair
    IL_023d:  ldnull
    IL_023e:  cgt.un
    IL_0240:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_0245:  nop
    IL_0246:  ldloc.s    V_8
    IL_0248:  unbox.any  [System.Runtime]System.Int32
    IL_024d:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0252:  nop
    IL_0253:  ldloc.s    V_8
    IL_0255:  call       void [System.Console]System.Console::WriteLine(object)
    IL_025a:  nop
    IL_025b:  ldloc.s    V_7
    IL_025d:  unbox.any  HelloWorld.Pair
    IL_0262:  stloc.s    V_9
    IL_0264:  ldloca.s   V_9
    IL_0266:  ldc.i4.s   20
    IL_0268:  call       instance void HelloWorld.Pair::Add(int32)
    IL_026d:  nop
    IL_026e:  ldloc.s    V_9
    IL_0270:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_0275:  nop
    IL_0276:  ldloc.s    V_7
    IL_0278:  unbox.any  HelloWorld.Pair
    IL_027d:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_0282:  nop
    IL_0283:  ldloc.1
    IL_0284:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_0289:  nop
    IL_028a:  ret
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
