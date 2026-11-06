
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
// MVID: {44879dfc-35aa-4065-8264-6633709fd43f}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 )
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x104430000


// =============== CLASS MEMBERS DECLARATION ===================

.class private sequential ansi sealed beforefieldinit HelloWorld.Pair
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
    IL_0003:  stfld      int32 HelloWorld.Pair::X
    IL_0008:  ldarg.0
    IL_0009:  ldarg.2
    IL_000a:  stfld      int32 HelloWorld.Pair::Y
    IL_000f:  ret
  } // end of method Pair::.ctor

} // end of class HelloWorld.Pair

.class private auto ansi beforefieldinit HelloWorld.Holder
       extends [System.Runtime]System.Object
{
  .field public int32 Number
  .field public valuetype HelloWorld.Pair Value
  .field public static int32 SharedNumber
  .field public static valuetype HelloWorld.Pair SharedValue
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
  .method private hidebysig static void  Add(int32& 'value',
                                             int32 amount) cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldind.i4
    IL_0004:  ldarg.1
    IL_0005:  add
    IL_0006:  stind.i4
    IL_0007:  ret
  } // end of method Program::Add

  .method private hidebysig static void  Set([out] int32& 'value') cil managed
  {
    // Code size       6 (0x6)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldc.i4.s   40
    IL_0004:  stind.i4
    IL_0005:  ret
  } // end of method Program::Set

  .method private hidebysig static void  Move(valuetype HelloWorld.Pair& 'value') cil managed
  {
    // Code size       24 (0x18)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldflda     int32 HelloWorld.Pair::X
    IL_0007:  dup
    IL_0008:  ldind.i4
    IL_0009:  ldc.i4.2
    IL_000a:  add
    IL_000b:  stind.i4
    IL_000c:  ldarg.0
    IL_000d:  ldflda     int32 HelloWorld.Pair::Y
    IL_0012:  dup
    IL_0013:  ldind.i4
    IL_0014:  ldc.i4.3
    IL_0015:  add
    IL_0016:  stind.i4
    IL_0017:  ret
  } // end of method Program::Move

  .method private hidebysig static void  SetPair([out] valuetype HelloWorld.Pair& 'value') cil managed
  {
    // Code size       17 (0x11)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldc.i4.s   10
    IL_0004:  ldc.i4.s   20
    IL_0006:  newobj     instance void HelloWorld.Pair::.ctor(int32,
                                                              int32)
    IL_000b:  stobj      HelloWorld.Pair
    IL_0010:  ret
  } // end of method Program::SetPair

  .method private hidebysig static void  Replace(valuetype HelloWorld.Pair& 'value') cil managed
  {
    // Code size       17 (0x11)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldc.i4.s   70
    IL_0004:  ldc.i4.s   80
    IL_0006:  newobj     instance void HelloWorld.Pair::.ctor(int32,
                                                              int32)
    IL_000b:  stobj      HelloWorld.Pair
    IL_0010:  ret
  } // end of method Program::Replace

  .method private hidebysig static int32&
          Identity(int32& 'value') cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32& V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method Program::Identity

  .method private hidebysig static valuetype HelloWorld.Pair&
          Element(valuetype HelloWorld.Pair[] values,
                  int32 index) cil managed
  {
    // Code size       13 (0xd)
    .maxstack  2
    .locals init (valuetype HelloWorld.Pair& V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  ldelema    HelloWorld.Pair
    IL_0008:  stloc.0
    IL_0009:  br.s       IL_000b

    IL_000b:  ldloc.0
    IL_000c:  ret
  } // end of method Program::Element

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
    // Code size       601 (0x259)
    .maxstack  3
    .locals init (int32 V_0,
             int32& V_1,
             valuetype HelloWorld.Pair V_2,
             valuetype HelloWorld.Pair& V_3,
             int32& V_4,
             int32[] V_5,
             int32& V_6,
             valuetype HelloWorld.Pair[] V_7,
             valuetype HelloWorld.Pair& V_8,
             class HelloWorld.Holder V_9,
             int32& V_10,
             int32& V_11,
             valuetype HelloWorld.Pair& V_12,
             int32 V_13)
    IL_0000:  nop
    IL_0001:  ldloca.s   V_0
    IL_0003:  call       void HelloWorld.Program::Set(int32&)
    IL_0008:  nop
    IL_0009:  ldloca.s   V_0
    IL_000b:  ldc.i4.2
    IL_000c:  call       void HelloWorld.Program::Add(int32&,
                                                      int32)
    IL_0011:  nop
    IL_0012:  ldloc.0
    IL_0013:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0018:  nop
    IL_0019:  ldloca.s   V_0
    IL_001b:  call       int32& HelloWorld.Program::Identity(int32&)
    IL_0020:  stloc.1
    IL_0021:  ldloc.1
    IL_0022:  ldloc.1
    IL_0023:  ldind.i4
    IL_0024:  ldc.i4.1
    IL_0025:  add
    IL_0026:  stind.i4
    IL_0027:  ldloc.0
    IL_0028:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_002d:  nop
    IL_002e:  ldloc.1
    IL_002f:  ldloc.1
    IL_0030:  ldind.i4
    IL_0031:  stloc.s    V_13
    IL_0033:  ldloc.s    V_13
    IL_0035:  ldc.i4.1
    IL_0036:  add
    IL_0037:  stind.i4
    IL_0038:  ldloc.s    V_13
    IL_003a:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_003f:  nop
    IL_0040:  ldloc.1
    IL_0041:  ldloc.1
    IL_0042:  ldind.i4
    IL_0043:  ldc.i4.1
    IL_0044:  add
    IL_0045:  stloc.s    V_13
    IL_0047:  ldloc.s    V_13
    IL_0049:  stind.i4
    IL_004a:  ldloc.s    V_13
    IL_004c:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0051:  nop
    IL_0052:  ldloc.1
    IL_0053:  ldloc.1
    IL_0054:  ldind.i4
    IL_0055:  ldc.i4.2
    IL_0056:  mul
    IL_0057:  stind.i4
    IL_0058:  ldloc.0
    IL_0059:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_005e:  nop
    IL_005f:  ldloca.s   V_2
    IL_0061:  call       void HelloWorld.Program::SetPair(valuetype HelloWorld.Pair&)
    IL_0066:  nop
    IL_0067:  ldloca.s   V_2
    IL_0069:  call       void HelloWorld.Program::Move(valuetype HelloWorld.Pair&)
    IL_006e:  nop
    IL_006f:  ldloc.2
    IL_0070:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_0075:  nop
    IL_0076:  ldloca.s   V_2
    IL_0078:  stloc.3
    IL_0079:  ldloc.3
    IL_007a:  ldflda     int32 HelloWorld.Pair::X
    IL_007f:  dup
    IL_0080:  ldind.i4
    IL_0081:  ldc.i4.1
    IL_0082:  add
    IL_0083:  stind.i4
    IL_0084:  ldloc.2
    IL_0085:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_008a:  nop
    IL_008b:  ldloc.3
    IL_008c:  ldflda     int32 HelloWorld.Pair::X
    IL_0091:  stloc.s    V_4
    IL_0093:  ldloc.3
    IL_0094:  call       void HelloWorld.Program::Replace(valuetype HelloWorld.Pair&)
    IL_0099:  nop
    IL_009a:  ldloc.2
    IL_009b:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_00a0:  nop
    IL_00a1:  ldloc.s    V_4
    IL_00a3:  ldloc.s    V_4
    IL_00a5:  ldind.i4
    IL_00a6:  ldc.i4.1
    IL_00a7:  add
    IL_00a8:  stind.i4
    IL_00a9:  ldloc.2
    IL_00aa:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_00af:  nop
    IL_00b0:  ldc.i4.2
    IL_00b1:  newarr     [System.Runtime]System.Int32
    IL_00b6:  stloc.s    V_5
    IL_00b8:  ldloc.s    V_5
    IL_00ba:  ldc.i4.0
    IL_00bb:  ldelema    [System.Runtime]System.Int32
    IL_00c0:  call       void HelloWorld.Program::Set(int32&)
    IL_00c5:  nop
    IL_00c6:  ldloc.s    V_5
    IL_00c8:  ldc.i4.0
    IL_00c9:  ldelema    [System.Runtime]System.Int32
    IL_00ce:  ldc.i4.5
    IL_00cf:  call       void HelloWorld.Program::Add(int32&,
                                                      int32)
    IL_00d4:  nop
    IL_00d5:  ldloc.s    V_5
    IL_00d7:  ldc.i4.0
    IL_00d8:  ldelema    [System.Runtime]System.Int32
    IL_00dd:  stloc.s    V_6
    IL_00df:  ldloc.s    V_6
    IL_00e1:  ldloc.s    V_6
    IL_00e3:  ldind.i4
    IL_00e4:  ldc.i4.6
    IL_00e5:  add
    IL_00e6:  stind.i4
    IL_00e7:  ldloc.s    V_5
    IL_00e9:  ldc.i4.0
    IL_00ea:  ldelem.i4
    IL_00eb:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00f0:  nop
    IL_00f1:  ldloc.s    V_5
    IL_00f3:  ldc.i4.1
    IL_00f4:  ldelem.i4
    IL_00f5:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00fa:  nop
    IL_00fb:  ldc.i4.2
    IL_00fc:  newarr     HelloWorld.Pair
    IL_0101:  stloc.s    V_7
    IL_0103:  ldloc.s    V_7
    IL_0105:  ldc.i4.0
    IL_0106:  ldelema    HelloWorld.Pair
    IL_010b:  call       void HelloWorld.Program::SetPair(valuetype HelloWorld.Pair&)
    IL_0110:  nop
    IL_0111:  ldloc.s    V_7
    IL_0113:  ldc.i4.0
    IL_0114:  ldelema    HelloWorld.Pair
    IL_0119:  call       void HelloWorld.Program::Move(valuetype HelloWorld.Pair&)
    IL_011e:  nop
    IL_011f:  ldloc.s    V_7
    IL_0121:  ldc.i4.0
    IL_0122:  call       valuetype HelloWorld.Pair& HelloWorld.Program::Element(valuetype HelloWorld.Pair[],
                                                                                int32)
    IL_0127:  stloc.s    V_8
    IL_0129:  ldloc.s    V_8
    IL_012b:  ldflda     int32 HelloWorld.Pair::Y
    IL_0130:  dup
    IL_0131:  ldind.i4
    IL_0132:  ldc.i4.1
    IL_0133:  add
    IL_0134:  stind.i4
    IL_0135:  ldloc.s    V_8
    IL_0137:  ldflda     int32 HelloWorld.Pair::X
    IL_013c:  ldc.i4.5
    IL_013d:  call       void HelloWorld.Program::Add(int32&,
                                                      int32)
    IL_0142:  nop
    IL_0143:  ldloc.s    V_7
    IL_0145:  ldc.i4.0
    IL_0146:  ldelem     HelloWorld.Pair
    IL_014b:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_0150:  nop
    IL_0151:  ldloc.s    V_7
    IL_0153:  ldc.i4.1
    IL_0154:  ldelem     HelloWorld.Pair
    IL_0159:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_015e:  nop
    IL_015f:  ldloc.s    V_7
    IL_0161:  ldc.i4.1
    IL_0162:  call       valuetype HelloWorld.Pair& HelloWorld.Program::Element(valuetype HelloWorld.Pair[],
                                                                                int32)
    IL_0167:  ldc.i4.s   30
    IL_0169:  ldc.i4.s   40
    IL_016b:  newobj     instance void HelloWorld.Pair::.ctor(int32,
                                                              int32)
    IL_0170:  stobj      HelloWorld.Pair
    IL_0175:  ldloc.s    V_7
    IL_0177:  ldc.i4.1
    IL_0178:  ldelem     HelloWorld.Pair
    IL_017d:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_0182:  nop
    IL_0183:  newobj     instance void HelloWorld.Holder::.ctor()
    IL_0188:  stloc.s    V_9
    IL_018a:  ldloc.s    V_9
    IL_018c:  ldflda     int32 HelloWorld.Holder::Number
    IL_0191:  call       void HelloWorld.Program::Set(int32&)
    IL_0196:  nop
    IL_0197:  ldloc.s    V_9
    IL_0199:  ldflda     int32 HelloWorld.Holder::Number
    IL_019e:  ldc.i4.1
    IL_019f:  call       void HelloWorld.Program::Add(int32&,
                                                      int32)
    IL_01a4:  nop
    IL_01a5:  ldloc.s    V_9
    IL_01a7:  ldfld      int32 HelloWorld.Holder::Number
    IL_01ac:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_01b1:  nop
    IL_01b2:  ldloc.s    V_9
    IL_01b4:  ldflda     valuetype HelloWorld.Pair HelloWorld.Holder::Value
    IL_01b9:  call       void HelloWorld.Program::SetPair(valuetype HelloWorld.Pair&)
    IL_01be:  nop
    IL_01bf:  ldloc.s    V_9
    IL_01c1:  ldflda     valuetype HelloWorld.Pair HelloWorld.Holder::Value
    IL_01c6:  ldflda     int32 HelloWorld.Pair::X
    IL_01cb:  stloc.s    V_10
    IL_01cd:  ldloc.s    V_9
    IL_01cf:  ldflda     valuetype HelloWorld.Pair HelloWorld.Holder::Value
    IL_01d4:  call       void HelloWorld.Program::Move(valuetype HelloWorld.Pair&)
    IL_01d9:  nop
    IL_01da:  ldloc.s    V_9
    IL_01dc:  ldc.i4.s   12
    IL_01de:  ldc.i4.s   23
    IL_01e0:  newobj     instance void HelloWorld.Pair::.ctor(int32,
                                                              int32)
    IL_01e5:  stfld      valuetype HelloWorld.Pair HelloWorld.Holder::Value
    IL_01ea:  ldloc.s    V_10
    IL_01ec:  ldloc.s    V_10
    IL_01ee:  ldind.i4
    IL_01ef:  ldc.i4.4
    IL_01f0:  add
    IL_01f1:  stind.i4
    IL_01f2:  ldloc.s    V_9
    IL_01f4:  ldfld      valuetype HelloWorld.Pair HelloWorld.Holder::Value
    IL_01f9:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_01fe:  nop
    IL_01ff:  ldsflda    int32 HelloWorld.Holder::SharedNumber
    IL_0204:  call       void HelloWorld.Program::Set(int32&)
    IL_0209:  nop
    IL_020a:  ldsflda    int32 HelloWorld.Holder::SharedNumber
    IL_020f:  stloc.s    V_11
    IL_0211:  ldloc.s    V_11
    IL_0213:  ldloc.s    V_11
    IL_0215:  ldind.i4
    IL_0216:  ldc.i4.7
    IL_0217:  sub
    IL_0218:  stind.i4
    IL_0219:  ldsfld     int32 HelloWorld.Holder::SharedNumber
    IL_021e:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0223:  nop
    IL_0224:  ldsflda    valuetype HelloWorld.Pair HelloWorld.Holder::SharedValue
    IL_0229:  call       void HelloWorld.Program::SetPair(valuetype HelloWorld.Pair&)
    IL_022e:  nop
    IL_022f:  ldsflda    valuetype HelloWorld.Pair HelloWorld.Holder::SharedValue
    IL_0234:  call       void HelloWorld.Program::Move(valuetype HelloWorld.Pair&)
    IL_0239:  nop
    IL_023a:  ldsflda    valuetype HelloWorld.Pair HelloWorld.Holder::SharedValue
    IL_023f:  stloc.s    V_12
    IL_0241:  ldloc.s    V_12
    IL_0243:  ldflda     int32 HelloWorld.Pair::Y
    IL_0248:  dup
    IL_0249:  ldind.i4
    IL_024a:  ldc.i4.2
    IL_024b:  mul
    IL_024c:  stind.i4
    IL_024d:  ldsfld     valuetype HelloWorld.Pair HelloWorld.Holder::SharedValue
    IL_0252:  call       void HelloWorld.Program::Print(valuetype HelloWorld.Pair)
    IL_0257:  nop
    IL_0258:  ret
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
