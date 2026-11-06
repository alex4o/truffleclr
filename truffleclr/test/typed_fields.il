
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
// MVID: {c0b19516-b6cd-4429-9806-abc574e24366}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 )
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x105124000


// =============== CLASS MEMBERS DECLARATION ===================

.class public auto ansi beforefieldinit HelloWorld.Fields
       extends [System.Runtime]System.Object
{
  .field public int8 SignedByte
  .field public uint8 UnsignedByte
  .field public int16 SignedShort
  .field public uint16 UnsignedShort
  .field public int32 SignedInt
  .field public uint32 UnsignedInt
  .field public int64 SignedLong
  .field public uint64 UnsignedLong
  .field public char Character
  .field public bool Flag
  .field public float32 Single
  .field public float64 Double
  .field public string Text
  .field public object Reference
  .field public class HelloWorld.Fields Next
  .field public static int8 StaticSignedByte
  .field public static uint8 StaticUnsignedByte
  .field public static int16 StaticSignedShort
  .field public static uint16 StaticUnsignedShort
  .field public static int32 StaticSignedInt
  .field public static uint32 StaticUnsignedInt
  .field public static int64 StaticSignedLong
  .field public static uint64 StaticUnsignedLong
  .field public static char StaticCharacter
  .field public static bool StaticFlag
  .field public static float32 StaticSingle
  .field public static float64 StaticDouble
  .field public static string StaticText
  .field public static object StaticReference
  .field public static class HelloWorld.Fields StaticNext
  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Fields::.ctor

} // end of class HelloWorld.Fields

.class public auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method public hidebysig static class HelloWorld.Fields
          CreateFields() cil managed
  {
    // Code size       11 (0xb)
    .maxstack  1
    .locals init (class HelloWorld.Fields V_0)
    IL_0000:  nop
    IL_0001:  newobj     instance void HelloWorld.Fields::.ctor()
    IL_0006:  stloc.0
    IL_0007:  br.s       IL_0009

    IL_0009:  ldloc.0
    IL_000a:  ret
  } // end of method Program::CreateFields

  .method private hidebysig static void  Check(bool condition) cil managed
  {
    // Code size       15 (0xf)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  brtrue.s   IL_0007

    IL_0004:  ldc.i4.0
    IL_0005:  br.s       IL_0008

    IL_0007:  ldc.i4.1
    IL_0008:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_000d:  nop
    IL_000e:  ret
  } // end of method Program::Check

  .method public hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       1593 (0x639)
    .maxstack  2
    .locals init (class HelloWorld.Fields V_0,
             class HelloWorld.Fields V_1,
             object V_2)
    IL_0000:  nop
    IL_0001:  call       class HelloWorld.Fields HelloWorld.Program::CreateFields()
    IL_0006:  stloc.0
    IL_0007:  newobj     instance void HelloWorld.Fields::.ctor()
    IL_000c:  stloc.1
    IL_000d:  ldloc.1
    IL_000e:  stloc.2
    IL_000f:  ldloc.0
    IL_0010:  ldfld      int8 HelloWorld.Fields::SignedByte
    IL_0015:  brtrue.s   IL_0022

    IL_0017:  ldloc.0
    IL_0018:  ldfld      uint8 HelloWorld.Fields::UnsignedByte
    IL_001d:  ldc.i4.0
    IL_001e:  ceq
    IL_0020:  br.s       IL_0023

    IL_0022:  ldc.i4.0
    IL_0023:  call       void HelloWorld.Program::Check(bool)
    IL_0028:  nop
    IL_0029:  ldloc.0
    IL_002a:  ldfld      int16 HelloWorld.Fields::SignedShort
    IL_002f:  brtrue.s   IL_003c

    IL_0031:  ldloc.0
    IL_0032:  ldfld      uint16 HelloWorld.Fields::UnsignedShort
    IL_0037:  ldc.i4.0
    IL_0038:  ceq
    IL_003a:  br.s       IL_003d

    IL_003c:  ldc.i4.0
    IL_003d:  call       void HelloWorld.Program::Check(bool)
    IL_0042:  nop
    IL_0043:  ldloc.0
    IL_0044:  ldfld      int32 HelloWorld.Fields::SignedInt
    IL_0049:  brtrue.s   IL_0056

    IL_004b:  ldloc.0
    IL_004c:  ldfld      uint32 HelloWorld.Fields::UnsignedInt
    IL_0051:  ldc.i4.0
    IL_0052:  ceq
    IL_0054:  br.s       IL_0057

    IL_0056:  ldc.i4.0
    IL_0057:  call       void HelloWorld.Program::Check(bool)
    IL_005c:  nop
    IL_005d:  ldloc.0
    IL_005e:  ldfld      int64 HelloWorld.Fields::SignedLong
    IL_0063:  ldloc.1
    IL_0064:  ldfld      int64 HelloWorld.Fields::SignedLong
    IL_0069:  ceq
    IL_006b:  call       void HelloWorld.Program::Check(bool)
    IL_0070:  nop
    IL_0071:  ldloc.0
    IL_0072:  ldfld      uint64 HelloWorld.Fields::UnsignedLong
    IL_0077:  ldloc.1
    IL_0078:  ldfld      uint64 HelloWorld.Fields::UnsignedLong
    IL_007d:  ceq
    IL_007f:  call       void HelloWorld.Program::Check(bool)
    IL_0084:  nop
    IL_0085:  ldloc.0
    IL_0086:  ldfld      char HelloWorld.Fields::Character
    IL_008b:  brtrue.s   IL_0098

    IL_008d:  ldloc.0
    IL_008e:  ldfld      bool HelloWorld.Fields::Flag
    IL_0093:  ldc.i4.0
    IL_0094:  ceq
    IL_0096:  br.s       IL_0099

    IL_0098:  ldc.i4.0
    IL_0099:  call       void HelloWorld.Program::Check(bool)
    IL_009e:  nop
    IL_009f:  ldloc.0
    IL_00a0:  ldfld      float32 HelloWorld.Fields::Single
    IL_00a5:  ldc.r4     0.0
    IL_00aa:  bne.un.s   IL_00bf

    IL_00ac:  ldloc.0
    IL_00ad:  ldfld      float64 HelloWorld.Fields::Double
    IL_00b2:  ldc.r8     0.0
    IL_00bb:  ceq
    IL_00bd:  br.s       IL_00c0

    IL_00bf:  ldc.i4.0
    IL_00c0:  call       void HelloWorld.Program::Check(bool)
    IL_00c5:  nop
    IL_00c6:  ldloc.0
    IL_00c7:  ldfld      string HelloWorld.Fields::Text
    IL_00cc:  brtrue.s   IL_00e1

    IL_00ce:  ldloc.0
    IL_00cf:  ldfld      object HelloWorld.Fields::Reference
    IL_00d4:  brtrue.s   IL_00e1

    IL_00d6:  ldloc.0
    IL_00d7:  ldfld      class HelloWorld.Fields HelloWorld.Fields::Next
    IL_00dc:  ldnull
    IL_00dd:  ceq
    IL_00df:  br.s       IL_00e2

    IL_00e1:  ldc.i4.0
    IL_00e2:  call       void HelloWorld.Program::Check(bool)
    IL_00e7:  nop
    IL_00e8:  ldsfld     int8 HelloWorld.Fields::StaticSignedByte
    IL_00ed:  brtrue.s   IL_00f9

    IL_00ef:  ldsfld     uint8 HelloWorld.Fields::StaticUnsignedByte
    IL_00f4:  ldc.i4.0
    IL_00f5:  ceq
    IL_00f7:  br.s       IL_00fa

    IL_00f9:  ldc.i4.0
    IL_00fa:  call       void HelloWorld.Program::Check(bool)
    IL_00ff:  nop
    IL_0100:  ldsfld     int16 HelloWorld.Fields::StaticSignedShort
    IL_0105:  brtrue.s   IL_0111

    IL_0107:  ldsfld     uint16 HelloWorld.Fields::StaticUnsignedShort
    IL_010c:  ldc.i4.0
    IL_010d:  ceq
    IL_010f:  br.s       IL_0112

    IL_0111:  ldc.i4.0
    IL_0112:  call       void HelloWorld.Program::Check(bool)
    IL_0117:  nop
    IL_0118:  ldsfld     int32 HelloWorld.Fields::StaticSignedInt
    IL_011d:  brtrue.s   IL_0129

    IL_011f:  ldsfld     uint32 HelloWorld.Fields::StaticUnsignedInt
    IL_0124:  ldc.i4.0
    IL_0125:  ceq
    IL_0127:  br.s       IL_012a

    IL_0129:  ldc.i4.0
    IL_012a:  call       void HelloWorld.Program::Check(bool)
    IL_012f:  nop
    IL_0130:  ldsfld     int64 HelloWorld.Fields::StaticSignedLong
    IL_0135:  ldloc.1
    IL_0136:  ldfld      int64 HelloWorld.Fields::SignedLong
    IL_013b:  ceq
    IL_013d:  call       void HelloWorld.Program::Check(bool)
    IL_0142:  nop
    IL_0143:  ldsfld     uint64 HelloWorld.Fields::StaticUnsignedLong
    IL_0148:  ldloc.1
    IL_0149:  ldfld      uint64 HelloWorld.Fields::UnsignedLong
    IL_014e:  ceq
    IL_0150:  call       void HelloWorld.Program::Check(bool)
    IL_0155:  nop
    IL_0156:  ldsfld     char HelloWorld.Fields::StaticCharacter
    IL_015b:  brtrue.s   IL_0167

    IL_015d:  ldsfld     bool HelloWorld.Fields::StaticFlag
    IL_0162:  ldc.i4.0
    IL_0163:  ceq
    IL_0165:  br.s       IL_0168

    IL_0167:  ldc.i4.0
    IL_0168:  call       void HelloWorld.Program::Check(bool)
    IL_016d:  nop
    IL_016e:  ldsfld     float32 HelloWorld.Fields::StaticSingle
    IL_0173:  ldc.r4     0.0
    IL_0178:  bne.un.s   IL_018c

    IL_017a:  ldsfld     float64 HelloWorld.Fields::StaticDouble
    IL_017f:  ldc.r8     0.0
    IL_0188:  ceq
    IL_018a:  br.s       IL_018d

    IL_018c:  ldc.i4.0
    IL_018d:  call       void HelloWorld.Program::Check(bool)
    IL_0192:  nop
    IL_0193:  ldsfld     string HelloWorld.Fields::StaticText
    IL_0198:  brtrue.s   IL_01ab

    IL_019a:  ldsfld     object HelloWorld.Fields::StaticReference
    IL_019f:  brtrue.s   IL_01ab

    IL_01a1:  ldsfld     class HelloWorld.Fields HelloWorld.Fields::StaticNext
    IL_01a6:  ldnull
    IL_01a7:  ceq
    IL_01a9:  br.s       IL_01ac

    IL_01ab:  ldc.i4.0
    IL_01ac:  call       void HelloWorld.Program::Check(bool)
    IL_01b1:  nop
    IL_01b2:  ldloc.0
    IL_01b3:  ldc.i4.s   -101
    IL_01b5:  stfld      int8 HelloWorld.Fields::SignedByte
    IL_01ba:  ldloc.0
    IL_01bb:  ldc.i4     0xfb
    IL_01c0:  stfld      uint8 HelloWorld.Fields::UnsignedByte
    IL_01c5:  ldloc.0
    IL_01c6:  ldc.i4     0xffff8acf
    IL_01cb:  stfld      int16 HelloWorld.Fields::SignedShort
    IL_01d0:  ldloc.0
    IL_01d1:  ldc.i4     0xea61
    IL_01d6:  stfld      uint16 HelloWorld.Fields::UnsignedShort
    IL_01db:  ldloc.0
    IL_01dc:  ldc.i4     0x88ca6bff
    IL_01e1:  stfld      int32 HelloWorld.Fields::SignedInt
    IL_01e6:  ldloc.0
    IL_01e7:  ldc.i4     0xee6b2801
    IL_01ec:  stfld      uint32 HelloWorld.Fields::UnsignedInt
    IL_01f1:  ldloc.0
    IL_01f2:  ldc.i8     0xfffffffed5fa0dff
    IL_01fb:  stfld      int64 HelloWorld.Fields::SignedLong
    IL_0200:  ldloc.0
    IL_0201:  ldc.i8     0xa688906bd8b00001
    IL_020a:  stfld      uint64 HelloWorld.Fields::UnsignedLong
    IL_020f:  ldloc.0
    IL_0210:  ldc.i4.s   90
    IL_0212:  stfld      char HelloWorld.Fields::Character
    IL_0217:  ldloc.0
    IL_0218:  ldc.i4.1
    IL_0219:  stfld      bool HelloWorld.Fields::Flag
    IL_021e:  ldloc.0
    IL_021f:  ldc.r4     1.5
    IL_0224:  stfld      float32 HelloWorld.Fields::Single
    IL_0229:  ldloc.0
    IL_022a:  ldc.r8     2.5
    IL_0233:  stfld      float64 HelloWorld.Fields::Double
    IL_0238:  ldloc.0
    IL_0239:  ldstr      "instance"
    IL_023e:  stfld      string HelloWorld.Fields::Text
    IL_0243:  ldloc.0
    IL_0244:  ldloc.2
    IL_0245:  stfld      object HelloWorld.Fields::Reference
    IL_024a:  ldloc.0
    IL_024b:  ldloc.1
    IL_024c:  stfld      class HelloWorld.Fields HelloWorld.Fields::Next
    IL_0251:  ldloc.0
    IL_0252:  ldfld      int8 HelloWorld.Fields::SignedByte
    IL_0257:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_025c:  nop
    IL_025d:  ldloc.0
    IL_025e:  ldfld      uint8 HelloWorld.Fields::UnsignedByte
    IL_0263:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0268:  nop
    IL_0269:  ldloc.0
    IL_026a:  ldfld      int16 HelloWorld.Fields::SignedShort
    IL_026f:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0274:  nop
    IL_0275:  ldloc.0
    IL_0276:  ldfld      uint16 HelloWorld.Fields::UnsignedShort
    IL_027b:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0280:  nop
    IL_0281:  ldloc.0
    IL_0282:  ldfld      int32 HelloWorld.Fields::SignedInt
    IL_0287:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_028c:  nop
    IL_028d:  ldloc.0
    IL_028e:  ldfld      uint32 HelloWorld.Fields::UnsignedInt
    IL_0293:  call       void [System.Console]System.Console::WriteLine(uint32)
    IL_0298:  nop
    IL_0299:  ldloc.0
    IL_029a:  ldfld      int64 HelloWorld.Fields::SignedLong
    IL_029f:  call       void [System.Console]System.Console::WriteLine(int64)
    IL_02a4:  nop
    IL_02a5:  ldloc.0
    IL_02a6:  ldfld      uint64 HelloWorld.Fields::UnsignedLong
    IL_02ab:  call       void [System.Console]System.Console::WriteLine(uint64)
    IL_02b0:  nop
    IL_02b1:  ldloc.0
    IL_02b2:  ldfld      char HelloWorld.Fields::Character
    IL_02b7:  call       void [System.Console]System.Console::WriteLine(char)
    IL_02bc:  nop
    IL_02bd:  ldloc.0
    IL_02be:  ldfld      bool HelloWorld.Fields::Flag
    IL_02c3:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_02c8:  nop
    IL_02c9:  ldloc.0
    IL_02ca:  ldfld      float32 HelloWorld.Fields::Single
    IL_02cf:  call       void [System.Console]System.Console::WriteLine(float32)
    IL_02d4:  nop
    IL_02d5:  ldloc.0
    IL_02d6:  ldfld      char HelloWorld.Fields::Character
    IL_02db:  call       void [System.Console]System.Console::Write(char)
    IL_02e0:  nop
    IL_02e1:  call       void [System.Console]System.Console::WriteLine()
    IL_02e6:  nop
    IL_02e7:  ldloc.0
    IL_02e8:  ldfld      int8 HelloWorld.Fields::SignedByte
    IL_02ed:  ldc.i4.s   -101
    IL_02ef:  ceq
    IL_02f1:  call       void HelloWorld.Program::Check(bool)
    IL_02f6:  nop
    IL_02f7:  ldloc.0
    IL_02f8:  ldfld      uint8 HelloWorld.Fields::UnsignedByte
    IL_02fd:  ldc.i4     0xfb
    IL_0302:  ceq
    IL_0304:  call       void HelloWorld.Program::Check(bool)
    IL_0309:  nop
    IL_030a:  ldloc.0
    IL_030b:  ldfld      int16 HelloWorld.Fields::SignedShort
    IL_0310:  ldc.i4     0xffff8acf
    IL_0315:  ceq
    IL_0317:  call       void HelloWorld.Program::Check(bool)
    IL_031c:  nop
    IL_031d:  ldloc.0
    IL_031e:  ldfld      uint16 HelloWorld.Fields::UnsignedShort
    IL_0323:  ldc.i4     0xea61
    IL_0328:  ceq
    IL_032a:  call       void HelloWorld.Program::Check(bool)
    IL_032f:  nop
    IL_0330:  ldloc.0
    IL_0331:  ldfld      int32 HelloWorld.Fields::SignedInt
    IL_0336:  ldc.i4     0x88ca6bff
    IL_033b:  ceq
    IL_033d:  call       void HelloWorld.Program::Check(bool)
    IL_0342:  nop
    IL_0343:  ldloc.0
    IL_0344:  ldfld      uint32 HelloWorld.Fields::UnsignedInt
    IL_0349:  ldc.i4     0xee6b2801
    IL_034e:  ceq
    IL_0350:  call       void HelloWorld.Program::Check(bool)
    IL_0355:  nop
    IL_0356:  ldloc.0
    IL_0357:  ldfld      int64 HelloWorld.Fields::SignedLong
    IL_035c:  ldc.i8     0xfffffffed5fa0dff
    IL_0365:  ceq
    IL_0367:  call       void HelloWorld.Program::Check(bool)
    IL_036c:  nop
    IL_036d:  ldloc.0
    IL_036e:  ldfld      uint64 HelloWorld.Fields::UnsignedLong
    IL_0373:  ldc.i8     0xa688906bd8b00001
    IL_037c:  ceq
    IL_037e:  call       void HelloWorld.Program::Check(bool)
    IL_0383:  nop
    IL_0384:  ldloc.0
    IL_0385:  ldfld      char HelloWorld.Fields::Character
    IL_038a:  ldc.i4.s   90
    IL_038c:  ceq
    IL_038e:  call       void HelloWorld.Program::Check(bool)
    IL_0393:  nop
    IL_0394:  ldloc.0
    IL_0395:  ldfld      bool HelloWorld.Fields::Flag
    IL_039a:  call       void HelloWorld.Program::Check(bool)
    IL_039f:  nop
    IL_03a0:  ldloc.0
    IL_03a1:  ldfld      float32 HelloWorld.Fields::Single
    IL_03a6:  ldc.r4     1.5
    IL_03ab:  ceq
    IL_03ad:  call       void HelloWorld.Program::Check(bool)
    IL_03b2:  nop
    IL_03b3:  ldloc.0
    IL_03b4:  ldfld      float64 HelloWorld.Fields::Double
    IL_03b9:  call       void [System.Console]System.Console::WriteLine(float64)
    IL_03be:  nop
    IL_03bf:  ldloc.0
    IL_03c0:  ldfld      string HelloWorld.Fields::Text
    IL_03c5:  call       void [System.Console]System.Console::WriteLine(string)
    IL_03ca:  nop
    IL_03cb:  ldloc.0
    IL_03cc:  ldfld      object HelloWorld.Fields::Reference
    IL_03d1:  ldloc.2
    IL_03d2:  ceq
    IL_03d4:  call       void HelloWorld.Program::Check(bool)
    IL_03d9:  nop
    IL_03da:  ldloc.0
    IL_03db:  ldfld      class HelloWorld.Fields HelloWorld.Fields::Next
    IL_03e0:  ldloc.1
    IL_03e1:  ceq
    IL_03e3:  call       void HelloWorld.Program::Check(bool)
    IL_03e8:  nop
    IL_03e9:  ldloc.0
    IL_03ea:  ldfld      class HelloWorld.Fields HelloWorld.Fields::Next
    IL_03ef:  ldc.i4.s   123
    IL_03f1:  stfld      int32 HelloWorld.Fields::SignedInt
    IL_03f6:  ldloc.1
    IL_03f7:  ldfld      int32 HelloWorld.Fields::SignedInt
    IL_03fc:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0401:  nop
    IL_0402:  ldloc.0
    IL_0403:  ldfld      int32 HelloWorld.Fields::SignedInt
    IL_0408:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_040d:  nop
    IL_040e:  ldloc.0
    IL_040f:  ldfld      int8 HelloWorld.Fields::SignedByte
    IL_0414:  stsfld     int8 HelloWorld.Fields::StaticSignedByte
    IL_0419:  ldloc.0
    IL_041a:  ldfld      uint8 HelloWorld.Fields::UnsignedByte
    IL_041f:  stsfld     uint8 HelloWorld.Fields::StaticUnsignedByte
    IL_0424:  ldloc.0
    IL_0425:  ldfld      int16 HelloWorld.Fields::SignedShort
    IL_042a:  stsfld     int16 HelloWorld.Fields::StaticSignedShort
    IL_042f:  ldloc.0
    IL_0430:  ldfld      uint16 HelloWorld.Fields::UnsignedShort
    IL_0435:  stsfld     uint16 HelloWorld.Fields::StaticUnsignedShort
    IL_043a:  ldloc.0
    IL_043b:  ldfld      int32 HelloWorld.Fields::SignedInt
    IL_0440:  stsfld     int32 HelloWorld.Fields::StaticSignedInt
    IL_0445:  ldloc.0
    IL_0446:  ldfld      uint32 HelloWorld.Fields::UnsignedInt
    IL_044b:  stsfld     uint32 HelloWorld.Fields::StaticUnsignedInt
    IL_0450:  ldloc.0
    IL_0451:  ldfld      int64 HelloWorld.Fields::SignedLong
    IL_0456:  stsfld     int64 HelloWorld.Fields::StaticSignedLong
    IL_045b:  ldloc.0
    IL_045c:  ldfld      uint64 HelloWorld.Fields::UnsignedLong
    IL_0461:  stsfld     uint64 HelloWorld.Fields::StaticUnsignedLong
    IL_0466:  ldloc.0
    IL_0467:  ldfld      char HelloWorld.Fields::Character
    IL_046c:  stsfld     char HelloWorld.Fields::StaticCharacter
    IL_0471:  ldloc.0
    IL_0472:  ldfld      bool HelloWorld.Fields::Flag
    IL_0477:  stsfld     bool HelloWorld.Fields::StaticFlag
    IL_047c:  ldloc.0
    IL_047d:  ldfld      float32 HelloWorld.Fields::Single
    IL_0482:  stsfld     float32 HelloWorld.Fields::StaticSingle
    IL_0487:  ldloc.0
    IL_0488:  ldfld      float64 HelloWorld.Fields::Double
    IL_048d:  stsfld     float64 HelloWorld.Fields::StaticDouble
    IL_0492:  ldstr      "static"
    IL_0497:  stsfld     string HelloWorld.Fields::StaticText
    IL_049c:  ldloc.0
    IL_049d:  ldfld      object HelloWorld.Fields::Reference
    IL_04a2:  stsfld     object HelloWorld.Fields::StaticReference
    IL_04a7:  ldloc.0
    IL_04a8:  ldfld      class HelloWorld.Fields HelloWorld.Fields::Next
    IL_04ad:  stsfld     class HelloWorld.Fields HelloWorld.Fields::StaticNext
    IL_04b2:  ldsfld     int8 HelloWorld.Fields::StaticSignedByte
    IL_04b7:  ldc.i4.s   -101
    IL_04b9:  ceq
    IL_04bb:  call       void HelloWorld.Program::Check(bool)
    IL_04c0:  nop
    IL_04c1:  ldsfld     uint8 HelloWorld.Fields::StaticUnsignedByte
    IL_04c6:  ldc.i4     0xfb
    IL_04cb:  ceq
    IL_04cd:  call       void HelloWorld.Program::Check(bool)
    IL_04d2:  nop
    IL_04d3:  ldsfld     int16 HelloWorld.Fields::StaticSignedShort
    IL_04d8:  ldc.i4     0xffff8acf
    IL_04dd:  ceq
    IL_04df:  call       void HelloWorld.Program::Check(bool)
    IL_04e4:  nop
    IL_04e5:  ldsfld     uint16 HelloWorld.Fields::StaticUnsignedShort
    IL_04ea:  ldc.i4     0xea61
    IL_04ef:  ceq
    IL_04f1:  call       void HelloWorld.Program::Check(bool)
    IL_04f6:  nop
    IL_04f7:  ldsfld     int32 HelloWorld.Fields::StaticSignedInt
    IL_04fc:  ldc.i4     0x88ca6bff
    IL_0501:  ceq
    IL_0503:  call       void HelloWorld.Program::Check(bool)
    IL_0508:  nop
    IL_0509:  ldsfld     uint32 HelloWorld.Fields::StaticUnsignedInt
    IL_050e:  ldc.i4     0xee6b2801
    IL_0513:  ceq
    IL_0515:  call       void HelloWorld.Program::Check(bool)
    IL_051a:  nop
    IL_051b:  ldsfld     int64 HelloWorld.Fields::StaticSignedLong
    IL_0520:  ldc.i8     0xfffffffed5fa0dff
    IL_0529:  ceq
    IL_052b:  call       void HelloWorld.Program::Check(bool)
    IL_0530:  nop
    IL_0531:  ldsfld     uint64 HelloWorld.Fields::StaticUnsignedLong
    IL_0536:  ldc.i8     0xa688906bd8b00001
    IL_053f:  ceq
    IL_0541:  call       void HelloWorld.Program::Check(bool)
    IL_0546:  nop
    IL_0547:  ldsfld     char HelloWorld.Fields::StaticCharacter
    IL_054c:  ldc.i4.s   90
    IL_054e:  ceq
    IL_0550:  call       void HelloWorld.Program::Check(bool)
    IL_0555:  nop
    IL_0556:  ldsfld     bool HelloWorld.Fields::StaticFlag
    IL_055b:  call       void HelloWorld.Program::Check(bool)
    IL_0560:  nop
    IL_0561:  ldsfld     float32 HelloWorld.Fields::StaticSingle
    IL_0566:  ldc.r4     1.5
    IL_056b:  ceq
    IL_056d:  call       void HelloWorld.Program::Check(bool)
    IL_0572:  nop
    IL_0573:  ldsfld     float64 HelloWorld.Fields::StaticDouble
    IL_0578:  call       void [System.Console]System.Console::WriteLine(float64)
    IL_057d:  nop
    IL_057e:  ldsfld     string HelloWorld.Fields::StaticText
    IL_0583:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0588:  nop
    IL_0589:  ldsfld     object HelloWorld.Fields::StaticReference
    IL_058e:  ldloc.2
    IL_058f:  ceq
    IL_0591:  call       void HelloWorld.Program::Check(bool)
    IL_0596:  nop
    IL_0597:  ldsfld     class HelloWorld.Fields HelloWorld.Fields::StaticNext
    IL_059c:  ldloc.1
    IL_059d:  ceq
    IL_059f:  call       void HelloWorld.Program::Check(bool)
    IL_05a4:  nop
    IL_05a5:  ldloc.0
    IL_05a6:  ldnull
    IL_05a7:  stfld      object HelloWorld.Fields::Reference
    IL_05ac:  ldloc.0
    IL_05ad:  ldnull
    IL_05ae:  stfld      class HelloWorld.Fields HelloWorld.Fields::Next
    IL_05b3:  ldloc.0
    IL_05b4:  ldc.i4.0
    IL_05b5:  stfld      bool HelloWorld.Fields::Flag
    IL_05ba:  ldloc.0
    IL_05bb:  ldfld      object HelloWorld.Fields::Reference
    IL_05c0:  brtrue.s   IL_05d5

    IL_05c2:  ldloc.0
    IL_05c3:  ldfld      class HelloWorld.Fields HelloWorld.Fields::Next
    IL_05c8:  brtrue.s   IL_05d5

    IL_05ca:  ldloc.0
    IL_05cb:  ldfld      bool HelloWorld.Fields::Flag
    IL_05d0:  ldc.i4.0
    IL_05d1:  ceq
    IL_05d3:  br.s       IL_05d6

    IL_05d5:  ldc.i4.0
    IL_05d6:  call       void HelloWorld.Program::Check(bool)
    IL_05db:  nop
    IL_05dc:  ldsfld     object HelloWorld.Fields::StaticReference
    IL_05e1:  ldloc.2
    IL_05e2:  bne.un.s   IL_05f3

    IL_05e4:  ldsfld     class HelloWorld.Fields HelloWorld.Fields::StaticNext
    IL_05e9:  ldloc.1
    IL_05ea:  bne.un.s   IL_05f3

    IL_05ec:  ldsfld     bool HelloWorld.Fields::StaticFlag
    IL_05f1:  br.s       IL_05f4

    IL_05f3:  ldc.i4.0
    IL_05f4:  call       void HelloWorld.Program::Check(bool)
    IL_05f9:  nop
    IL_05fa:  ldnull
    IL_05fb:  stsfld     object HelloWorld.Fields::StaticReference
    IL_0600:  ldnull
    IL_0601:  stsfld     class HelloWorld.Fields HelloWorld.Fields::StaticNext
    IL_0606:  ldnull
    IL_0607:  stsfld     string HelloWorld.Fields::StaticText
    IL_060c:  ldc.i4.0
    IL_060d:  stsfld     bool HelloWorld.Fields::StaticFlag
    IL_0612:  ldsfld     object HelloWorld.Fields::StaticReference
    IL_0617:  brtrue.s   IL_0631

    IL_0619:  ldsfld     class HelloWorld.Fields HelloWorld.Fields::StaticNext
    IL_061e:  brtrue.s   IL_0631

    IL_0620:  ldsfld     string HelloWorld.Fields::StaticText
    IL_0625:  brtrue.s   IL_0631

    IL_0627:  ldsfld     bool HelloWorld.Fields::StaticFlag
    IL_062c:  ldc.i4.0
    IL_062d:  ceq
    IL_062f:  br.s       IL_0632

    IL_0631:  ldc.i4.0
    IL_0632:  call       void HelloWorld.Program::Check(bool)
    IL_0637:  nop
    IL_0638:  ret
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
