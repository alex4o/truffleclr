
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
// MVID: {f8c29a80-5dcc-43cb-bc76-d875408f74d3}
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x00007FB762158000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method public hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       70 (0x46)
    .maxstack  2
    .locals init (int32 V_0,
             class HelloWorld.NBodySystem V_1,
             int32 V_2,
             bool V_3)
    IL_0000:  nop
    IL_0001:  ldc.i4     0x2710
    IL_0006:  stloc.0
    IL_0007:  newobj     instance void HelloWorld.NBodySystem::.ctor()
    IL_000c:  stloc.1
    IL_000d:  ldloc.1
    IL_000e:  callvirt   instance float64 HelloWorld.NBodySystem::Energy()
    IL_0013:  call       void [System.Console]System.Console::WriteLine(float64)
    IL_0018:  nop
    IL_0019:  ldc.i4.0
    IL_001a:  stloc.2
    IL_001b:  br.s       IL_0031

    IL_001d:  ldloc.1
    IL_001e:  ldc.r8     0.01
    IL_0027:  callvirt   instance void HelloWorld.NBodySystem::Advance(float64)
    IL_002c:  nop
    IL_002d:  ldloc.2
    IL_002e:  ldc.i4.1
    IL_002f:  add
    IL_0030:  stloc.2
    IL_0031:  ldloc.2
    IL_0032:  ldloc.0
    IL_0033:  clt
    IL_0035:  stloc.3
    IL_0036:  ldloc.3
    IL_0037:  brtrue.s   IL_001d

    IL_0039:  ldloc.1
    IL_003a:  callvirt   instance float64 HelloWorld.NBodySystem::Energy()
    IL_003f:  call       void [System.Console]System.Console::WriteLine(float64)
    IL_0044:  nop
    IL_0045:  ret
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

.class private auto ansi beforefieldinit HelloWorld.Body
       extends [System.Runtime]System.Object
{
  .field public float64 x
  .field public float64 y
  .field public float64 z
  .field public float64 vx
  .field public float64 vy
  .field public float64 vz
  .field public float64 mass
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Body::.ctor

} // end of class HelloWorld.Body

.class private auto ansi beforefieldinit HelloWorld.Pair
       extends [System.Runtime]System.Object
{
  .field public class HelloWorld.Body bi
  .field public class HelloWorld.Body bj
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Pair::.ctor

} // end of class HelloWorld.Pair

.class private auto ansi beforefieldinit HelloWorld.NBodySystem
       extends [System.Runtime]System.Object
{
  .field private class HelloWorld.Body[] bodies
  .field private class HelloWorld.Pair[] pairs
  .field private static literal float64 Pi = float64(3.1415926535897931)
  .field private static literal float64 Solarmass = float64(39.478417604357432)
  .field private static literal float64 DaysPeryear = float64(365.24000000000001)
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       828 (0x33c)
    .maxstack  7
    .locals init (int32 V_0,
             float64 V_1,
             float64 V_2,
             float64 V_3,
             class HelloWorld.Body V_4,
             int32 V_5,
             int32 V_6,
             bool V_7,
             bool V_8,
             class HelloWorld.Body[] V_9,
             int32 V_10,
             class HelloWorld.Body V_11)
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldc.i4.5
    IL_000a:  newarr     HelloWorld.Body
    IL_000f:  dup
    IL_0010:  ldc.i4.0
    IL_0011:  newobj     instance void HelloWorld.Body::.ctor()
    IL_0016:  dup
    IL_0017:  ldc.r8     39.478417604357432
    IL_0020:  stfld      float64 HelloWorld.Body::mass
    IL_0025:  stelem.ref
    IL_0026:  dup
    IL_0027:  ldc.i4.1
    IL_0028:  newobj     instance void HelloWorld.Body::.ctor()
    IL_002d:  dup
    IL_002e:  ldc.r8     4.8414314424647209
    IL_0037:  stfld      float64 HelloWorld.Body::x
    IL_003c:  dup
    IL_003d:  ldc.r8     -1.1603200440274284
    IL_0046:  stfld      float64 HelloWorld.Body::y
    IL_004b:  dup
    IL_004c:  ldc.r8     -0.10362204447112311
    IL_0055:  stfld      float64 HelloWorld.Body::z
    IL_005a:  dup
    IL_005b:  ldc.r8     0.60632639299583202
    IL_0064:  stfld      float64 HelloWorld.Body::vx
    IL_0069:  dup
    IL_006a:  ldc.r8     2.8119868449162602
    IL_0073:  stfld      float64 HelloWorld.Body::vy
    IL_0078:  dup
    IL_0079:  ldc.r8     -0.025218361659887629
    IL_0082:  stfld      float64 HelloWorld.Body::vz
    IL_0087:  dup
    IL_0088:  ldc.r8     0.037693674870389493
    IL_0091:  stfld      float64 HelloWorld.Body::mass
    IL_0096:  stelem.ref
    IL_0097:  dup
    IL_0098:  ldc.i4.2
    IL_0099:  newobj     instance void HelloWorld.Body::.ctor()
    IL_009e:  dup
    IL_009f:  ldc.r8     8.3433667182445799
    IL_00a8:  stfld      float64 HelloWorld.Body::x
    IL_00ad:  dup
    IL_00ae:  ldc.r8     4.1247985641243048
    IL_00b7:  stfld      float64 HelloWorld.Body::y
    IL_00bc:  dup
    IL_00bd:  ldc.r8     -0.40352341711432138
    IL_00c6:  stfld      float64 HelloWorld.Body::z
    IL_00cb:  dup
    IL_00cc:  ldc.r8     -1.0107743461787924
    IL_00d5:  stfld      float64 HelloWorld.Body::vx
    IL_00da:  dup
    IL_00db:  ldc.r8     1.8256623712304119
    IL_00e4:  stfld      float64 HelloWorld.Body::vy
    IL_00e9:  dup
    IL_00ea:  ldc.r8     0.0084157613765841535
    IL_00f3:  stfld      float64 HelloWorld.Body::vz
    IL_00f8:  dup
    IL_00f9:  ldc.r8     0.011286326131968767
    IL_0102:  stfld      float64 HelloWorld.Body::mass
    IL_0107:  stelem.ref
    IL_0108:  dup
    IL_0109:  ldc.i4.3
    IL_010a:  newobj     instance void HelloWorld.Body::.ctor()
    IL_010f:  dup
    IL_0110:  ldc.r8     12.894369562139131
    IL_0119:  stfld      float64 HelloWorld.Body::x
    IL_011e:  dup
    IL_011f:  ldc.r8     -15.111151401698631
    IL_0128:  stfld      float64 HelloWorld.Body::y
    IL_012d:  dup
    IL_012e:  ldc.r8     -0.22330757889265573
    IL_0137:  stfld      float64 HelloWorld.Body::z
    IL_013c:  dup
    IL_013d:  ldc.r8     1.0827910064415354
    IL_0146:  stfld      float64 HelloWorld.Body::vx
    IL_014b:  dup
    IL_014c:  ldc.r8     0.86871301816960822
    IL_0155:  stfld      float64 HelloWorld.Body::vy
    IL_015a:  dup
    IL_015b:  ldc.r8     -0.010832637401363636
    IL_0164:  stfld      float64 HelloWorld.Body::vz
    IL_0169:  dup
    IL_016a:  ldc.r8     0.0017237240570597112
    IL_0173:  stfld      float64 HelloWorld.Body::mass
    IL_0178:  stelem.ref
    IL_0179:  dup
    IL_017a:  ldc.i4.4
    IL_017b:  newobj     instance void HelloWorld.Body::.ctor()
    IL_0180:  dup
    IL_0181:  ldc.r8     15.379697114850917
    IL_018a:  stfld      float64 HelloWorld.Body::x
    IL_018f:  dup
    IL_0190:  ldc.r8     -25.919314609987964
    IL_0199:  stfld      float64 HelloWorld.Body::y
    IL_019e:  dup
    IL_019f:  ldc.r8     0.17925877295037118
    IL_01a8:  stfld      float64 HelloWorld.Body::z
    IL_01ad:  dup
    IL_01ae:  ldc.r8     0.97909073224389798
    IL_01b7:  stfld      float64 HelloWorld.Body::vx
    IL_01bc:  dup
    IL_01bd:  ldc.r8     0.59469899864767617
    IL_01c6:  stfld      float64 HelloWorld.Body::vy
    IL_01cb:  dup
    IL_01cc:  ldc.r8     -0.034755955504078104
    IL_01d5:  stfld      float64 HelloWorld.Body::vz
    IL_01da:  dup
    IL_01db:  ldc.r8     0.0020336868699246304
    IL_01e4:  stfld      float64 HelloWorld.Body::mass
    IL_01e9:  stelem.ref
    IL_01ea:  stfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_01ef:  ldarg.0
    IL_01f0:  ldarg.0
    IL_01f1:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_01f6:  ldlen
    IL_01f7:  conv.i4
    IL_01f8:  ldarg.0
    IL_01f9:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_01fe:  ldlen
    IL_01ff:  conv.i4
    IL_0200:  ldc.i4.1
    IL_0201:  sub
    IL_0202:  mul
    IL_0203:  ldc.i4.2
    IL_0204:  div
    IL_0205:  newarr     HelloWorld.Pair
    IL_020a:  stfld      class HelloWorld.Pair[] HelloWorld.NBodySystem::pairs
    IL_020f:  ldc.i4.0
    IL_0210:  stloc.0
    IL_0211:  ldc.i4.0
    IL_0212:  stloc.s    V_5
    IL_0214:  br.s       IL_026b

    IL_0216:  ldloc.s    V_5
    IL_0218:  ldc.i4.1
    IL_0219:  add
    IL_021a:  stloc.s    V_6
    IL_021c:  br.s       IL_0253

    IL_021e:  ldarg.0
    IL_021f:  ldfld      class HelloWorld.Pair[] HelloWorld.NBodySystem::pairs
    IL_0224:  ldloc.0
    IL_0225:  dup
    IL_0226:  ldc.i4.1
    IL_0227:  add
    IL_0228:  stloc.0
    IL_0229:  newobj     instance void HelloWorld.Pair::.ctor()
    IL_022e:  dup
    IL_022f:  ldarg.0
    IL_0230:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_0235:  ldloc.s    V_5
    IL_0237:  ldelem.ref
    IL_0238:  stfld      class HelloWorld.Body HelloWorld.Pair::bi
    IL_023d:  dup
    IL_023e:  ldarg.0
    IL_023f:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_0244:  ldloc.s    V_6
    IL_0246:  ldelem.ref
    IL_0247:  stfld      class HelloWorld.Body HelloWorld.Pair::bj
    IL_024c:  stelem.ref
    IL_024d:  ldloc.s    V_6
    IL_024f:  ldc.i4.1
    IL_0250:  add
    IL_0251:  stloc.s    V_6
    IL_0253:  ldloc.s    V_6
    IL_0255:  ldarg.0
    IL_0256:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_025b:  ldlen
    IL_025c:  conv.i4
    IL_025d:  clt
    IL_025f:  stloc.s    V_7
    IL_0261:  ldloc.s    V_7
    IL_0263:  brtrue.s   IL_021e

    IL_0265:  ldloc.s    V_5
    IL_0267:  ldc.i4.1
    IL_0268:  add
    IL_0269:  stloc.s    V_5
    IL_026b:  ldloc.s    V_5
    IL_026d:  ldarg.0
    IL_026e:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_0273:  ldlen
    IL_0274:  conv.i4
    IL_0275:  ldc.i4.1
    IL_0276:  sub
    IL_0277:  clt
    IL_0279:  stloc.s    V_8
    IL_027b:  ldloc.s    V_8
    IL_027d:  brtrue.s   IL_0216

    IL_027f:  ldc.r8     0.0
    IL_0288:  stloc.1
    IL_0289:  ldc.r8     0.0
    IL_0292:  stloc.2
    IL_0293:  ldc.r8     0.0
    IL_029c:  stloc.3
    IL_029d:  nop
    IL_029e:  ldarg.0
    IL_029f:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_02a4:  stloc.s    V_9
    IL_02a6:  ldc.i4.0
    IL_02a7:  stloc.s    V_10
    IL_02a9:  br.s       IL_02f0

    IL_02ab:  ldloc.s    V_9
    IL_02ad:  ldloc.s    V_10
    IL_02af:  ldelem.ref
    IL_02b0:  stloc.s    V_11
    IL_02b2:  nop
    IL_02b3:  ldloc.1
    IL_02b4:  ldloc.s    V_11
    IL_02b6:  ldfld      float64 HelloWorld.Body::vx
    IL_02bb:  ldloc.s    V_11
    IL_02bd:  ldfld      float64 HelloWorld.Body::mass
    IL_02c2:  mul
    IL_02c3:  add
    IL_02c4:  stloc.1
    IL_02c5:  ldloc.2
    IL_02c6:  ldloc.s    V_11
    IL_02c8:  ldfld      float64 HelloWorld.Body::vy
    IL_02cd:  ldloc.s    V_11
    IL_02cf:  ldfld      float64 HelloWorld.Body::mass
    IL_02d4:  mul
    IL_02d5:  add
    IL_02d6:  stloc.2
    IL_02d7:  ldloc.3
    IL_02d8:  ldloc.s    V_11
    IL_02da:  ldfld      float64 HelloWorld.Body::vz
    IL_02df:  ldloc.s    V_11
    IL_02e1:  ldfld      float64 HelloWorld.Body::mass
    IL_02e6:  mul
    IL_02e7:  add
    IL_02e8:  stloc.3
    IL_02e9:  nop
    IL_02ea:  ldloc.s    V_10
    IL_02ec:  ldc.i4.1
    IL_02ed:  add
    IL_02ee:  stloc.s    V_10
    IL_02f0:  ldloc.s    V_10
    IL_02f2:  ldloc.s    V_9
    IL_02f4:  ldlen
    IL_02f5:  conv.i4
    IL_02f6:  blt.s      IL_02ab

    IL_02f8:  ldarg.0
    IL_02f9:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_02fe:  ldc.i4.0
    IL_02ff:  ldelem.ref
    IL_0300:  stloc.s    V_4
    IL_0302:  ldloc.s    V_4
    IL_0304:  ldloc.1
    IL_0305:  neg
    IL_0306:  ldc.r8     39.478417604357432
    IL_030f:  div
    IL_0310:  stfld      float64 HelloWorld.Body::vx
    IL_0315:  ldloc.s    V_4
    IL_0317:  ldloc.2
    IL_0318:  neg
    IL_0319:  ldc.r8     39.478417604357432
    IL_0322:  div
    IL_0323:  stfld      float64 HelloWorld.Body::vy
    IL_0328:  ldloc.s    V_4
    IL_032a:  ldloc.3
    IL_032b:  neg
    IL_032c:  ldc.r8     39.478417604357432
    IL_0335:  div
    IL_0336:  stfld      float64 HelloWorld.Body::vz
    IL_033b:  ret
  } // end of method NBodySystem::.ctor

  .method public hidebysig instance void 
          Advance(float64 dt) cil managed
  {
    // Code size       394 (0x18a)
    .maxstack  4
    .locals init (class HelloWorld.Pair[] V_0,
             int32 V_1,
             class HelloWorld.Pair V_2,
             class HelloWorld.Body V_3,
             class HelloWorld.Body V_4,
             float64 V_5,
             float64 V_6,
             float64 V_7,
             float64 V_8,
             float64 V_9,
             class HelloWorld.Body[] V_10,
             int32 V_11,
             class HelloWorld.Body V_12)
    IL_0000:  nop
    IL_0001:  nop
    IL_0002:  ldarg.0
    IL_0003:  ldfld      class HelloWorld.Pair[] HelloWorld.NBodySystem::pairs
    IL_0008:  stloc.0
    IL_0009:  ldc.i4.0
    IL_000a:  stloc.1
    IL_000b:  br         IL_0116

    IL_0010:  ldloc.0
    IL_0011:  ldloc.1
    IL_0012:  ldelem.ref
    IL_0013:  stloc.2
    IL_0014:  nop
    IL_0015:  ldloc.2
    IL_0016:  ldfld      class HelloWorld.Body HelloWorld.Pair::bi
    IL_001b:  stloc.3
    IL_001c:  ldloc.2
    IL_001d:  ldfld      class HelloWorld.Body HelloWorld.Pair::bj
    IL_0022:  stloc.s    V_4
    IL_0024:  ldloc.3
    IL_0025:  ldfld      float64 HelloWorld.Body::x
    IL_002a:  ldloc.s    V_4
    IL_002c:  ldfld      float64 HelloWorld.Body::x
    IL_0031:  sub
    IL_0032:  stloc.s    V_5
    IL_0034:  ldloc.3
    IL_0035:  ldfld      float64 HelloWorld.Body::y
    IL_003a:  ldloc.s    V_4
    IL_003c:  ldfld      float64 HelloWorld.Body::y
    IL_0041:  sub
    IL_0042:  stloc.s    V_6
    IL_0044:  ldloc.3
    IL_0045:  ldfld      float64 HelloWorld.Body::z
    IL_004a:  ldloc.s    V_4
    IL_004c:  ldfld      float64 HelloWorld.Body::z
    IL_0051:  sub
    IL_0052:  stloc.s    V_7
    IL_0054:  ldloc.s    V_5
    IL_0056:  ldloc.s    V_5
    IL_0058:  mul
    IL_0059:  ldloc.s    V_6
    IL_005b:  ldloc.s    V_6
    IL_005d:  mul
    IL_005e:  add
    IL_005f:  ldloc.s    V_7
    IL_0061:  ldloc.s    V_7
    IL_0063:  mul
    IL_0064:  add
    IL_0065:  stloc.s    V_8
    IL_0067:  ldarg.1
    IL_0068:  ldloc.s    V_8
    IL_006a:  ldloc.s    V_8
    IL_006c:  call       float64 [System.Runtime.Extensions]System.Math::Sqrt(float64)
    IL_0071:  mul
    IL_0072:  div
    IL_0073:  stloc.s    V_9
    IL_0075:  ldloc.3
    IL_0076:  dup
    IL_0077:  ldfld      float64 HelloWorld.Body::vx
    IL_007c:  ldloc.s    V_5
    IL_007e:  ldloc.s    V_4
    IL_0080:  ldfld      float64 HelloWorld.Body::mass
    IL_0085:  mul
    IL_0086:  ldloc.s    V_9
    IL_0088:  mul
    IL_0089:  sub
    IL_008a:  stfld      float64 HelloWorld.Body::vx
    IL_008f:  ldloc.s    V_4
    IL_0091:  dup
    IL_0092:  ldfld      float64 HelloWorld.Body::vx
    IL_0097:  ldloc.s    V_5
    IL_0099:  ldloc.3
    IL_009a:  ldfld      float64 HelloWorld.Body::mass
    IL_009f:  mul
    IL_00a0:  ldloc.s    V_9
    IL_00a2:  mul
    IL_00a3:  add
    IL_00a4:  stfld      float64 HelloWorld.Body::vx
    IL_00a9:  ldloc.3
    IL_00aa:  dup
    IL_00ab:  ldfld      float64 HelloWorld.Body::vy
    IL_00b0:  ldloc.s    V_6
    IL_00b2:  ldloc.s    V_4
    IL_00b4:  ldfld      float64 HelloWorld.Body::mass
    IL_00b9:  mul
    IL_00ba:  ldloc.s    V_9
    IL_00bc:  mul
    IL_00bd:  sub
    IL_00be:  stfld      float64 HelloWorld.Body::vy
    IL_00c3:  ldloc.s    V_4
    IL_00c5:  dup
    IL_00c6:  ldfld      float64 HelloWorld.Body::vy
    IL_00cb:  ldloc.s    V_6
    IL_00cd:  ldloc.3
    IL_00ce:  ldfld      float64 HelloWorld.Body::mass
    IL_00d3:  mul
    IL_00d4:  ldloc.s    V_9
    IL_00d6:  mul
    IL_00d7:  add
    IL_00d8:  stfld      float64 HelloWorld.Body::vy
    IL_00dd:  ldloc.3
    IL_00de:  dup
    IL_00df:  ldfld      float64 HelloWorld.Body::vz
    IL_00e4:  ldloc.s    V_7
    IL_00e6:  ldloc.s    V_4
    IL_00e8:  ldfld      float64 HelloWorld.Body::mass
    IL_00ed:  mul
    IL_00ee:  ldloc.s    V_9
    IL_00f0:  mul
    IL_00f1:  sub
    IL_00f2:  stfld      float64 HelloWorld.Body::vz
    IL_00f7:  ldloc.s    V_4
    IL_00f9:  dup
    IL_00fa:  ldfld      float64 HelloWorld.Body::vz
    IL_00ff:  ldloc.s    V_7
    IL_0101:  ldloc.3
    IL_0102:  ldfld      float64 HelloWorld.Body::mass
    IL_0107:  mul
    IL_0108:  ldloc.s    V_9
    IL_010a:  mul
    IL_010b:  add
    IL_010c:  stfld      float64 HelloWorld.Body::vz
    IL_0111:  nop
    IL_0112:  ldloc.1
    IL_0113:  ldc.i4.1
    IL_0114:  add
    IL_0115:  stloc.1
    IL_0116:  ldloc.1
    IL_0117:  ldloc.0
    IL_0118:  ldlen
    IL_0119:  conv.i4
    IL_011a:  blt        IL_0010

    IL_011f:  nop
    IL_0120:  ldarg.0
    IL_0121:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_0126:  stloc.s    V_10
    IL_0128:  ldc.i4.0
    IL_0129:  stloc.s    V_11
    IL_012b:  br.s       IL_0181

    IL_012d:  ldloc.s    V_10
    IL_012f:  ldloc.s    V_11
    IL_0131:  ldelem.ref
    IL_0132:  stloc.s    V_12
    IL_0134:  nop
    IL_0135:  ldloc.s    V_12
    IL_0137:  dup
    IL_0138:  ldfld      float64 HelloWorld.Body::x
    IL_013d:  ldarg.1
    IL_013e:  ldloc.s    V_12
    IL_0140:  ldfld      float64 HelloWorld.Body::vx
    IL_0145:  mul
    IL_0146:  add
    IL_0147:  stfld      float64 HelloWorld.Body::x
    IL_014c:  ldloc.s    V_12
    IL_014e:  dup
    IL_014f:  ldfld      float64 HelloWorld.Body::y
    IL_0154:  ldarg.1
    IL_0155:  ldloc.s    V_12
    IL_0157:  ldfld      float64 HelloWorld.Body::vy
    IL_015c:  mul
    IL_015d:  add
    IL_015e:  stfld      float64 HelloWorld.Body::y
    IL_0163:  ldloc.s    V_12
    IL_0165:  dup
    IL_0166:  ldfld      float64 HelloWorld.Body::z
    IL_016b:  ldarg.1
    IL_016c:  ldloc.s    V_12
    IL_016e:  ldfld      float64 HelloWorld.Body::vz
    IL_0173:  mul
    IL_0174:  add
    IL_0175:  stfld      float64 HelloWorld.Body::z
    IL_017a:  nop
    IL_017b:  ldloc.s    V_11
    IL_017d:  ldc.i4.1
    IL_017e:  add
    IL_017f:  stloc.s    V_11
    IL_0181:  ldloc.s    V_11
    IL_0183:  ldloc.s    V_10
    IL_0185:  ldlen
    IL_0186:  conv.i4
    IL_0187:  blt.s      IL_012d

    IL_0189:  ret
  } // end of method NBodySystem::Advance

  .method public hidebysig instance float64 
          Energy() cil managed
  {
    // Code size       249 (0xf9)
    .maxstack  5
    .locals init (float64 V_0,
             int32 V_1,
             class HelloWorld.Body V_2,
             int32 V_3,
             class HelloWorld.Body V_4,
             float64 V_5,
             float64 V_6,
             float64 V_7,
             bool V_8,
             bool V_9,
             float64 V_10)
    IL_0000:  nop
    IL_0001:  ldc.r8     0.0
    IL_000a:  stloc.0
    IL_000b:  ldc.i4.0
    IL_000c:  stloc.1
    IL_000d:  br         IL_00dd

    IL_0012:  nop
    IL_0013:  ldarg.0
    IL_0014:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_0019:  ldloc.1
    IL_001a:  ldelem.ref
    IL_001b:  stloc.2
    IL_001c:  ldloc.0
    IL_001d:  ldc.r8     0.5
    IL_0026:  ldloc.2
    IL_0027:  ldfld      float64 HelloWorld.Body::mass
    IL_002c:  mul
    IL_002d:  ldloc.2
    IL_002e:  ldfld      float64 HelloWorld.Body::vx
    IL_0033:  ldloc.2
    IL_0034:  ldfld      float64 HelloWorld.Body::vx
    IL_0039:  mul
    IL_003a:  ldloc.2
    IL_003b:  ldfld      float64 HelloWorld.Body::vy
    IL_0040:  ldloc.2
    IL_0041:  ldfld      float64 HelloWorld.Body::vy
    IL_0046:  mul
    IL_0047:  add
    IL_0048:  ldloc.2
    IL_0049:  ldfld      float64 HelloWorld.Body::vz
    IL_004e:  ldloc.2
    IL_004f:  ldfld      float64 HelloWorld.Body::vz
    IL_0054:  mul
    IL_0055:  add
    IL_0056:  mul
    IL_0057:  add
    IL_0058:  stloc.0
    IL_0059:  ldloc.1
    IL_005a:  ldc.i4.1
    IL_005b:  add
    IL_005c:  stloc.3
    IL_005d:  br.s       IL_00c7

    IL_005f:  nop
    IL_0060:  ldarg.0
    IL_0061:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_0066:  ldloc.3
    IL_0067:  ldelem.ref
    IL_0068:  stloc.s    V_4
    IL_006a:  ldloc.2
    IL_006b:  ldfld      float64 HelloWorld.Body::x
    IL_0070:  ldloc.s    V_4
    IL_0072:  ldfld      float64 HelloWorld.Body::x
    IL_0077:  sub
    IL_0078:  stloc.s    V_5
    IL_007a:  ldloc.2
    IL_007b:  ldfld      float64 HelloWorld.Body::y
    IL_0080:  ldloc.s    V_4
    IL_0082:  ldfld      float64 HelloWorld.Body::y
    IL_0087:  sub
    IL_0088:  stloc.s    V_6
    IL_008a:  ldloc.2
    IL_008b:  ldfld      float64 HelloWorld.Body::z
    IL_0090:  ldloc.s    V_4
    IL_0092:  ldfld      float64 HelloWorld.Body::z
    IL_0097:  sub
    IL_0098:  stloc.s    V_7
    IL_009a:  ldloc.0
    IL_009b:  ldloc.2
    IL_009c:  ldfld      float64 HelloWorld.Body::mass
    IL_00a1:  ldloc.s    V_4
    IL_00a3:  ldfld      float64 HelloWorld.Body::mass
    IL_00a8:  mul
    IL_00a9:  ldloc.s    V_5
    IL_00ab:  ldloc.s    V_5
    IL_00ad:  mul
    IL_00ae:  ldloc.s    V_6
    IL_00b0:  ldloc.s    V_6
    IL_00b2:  mul
    IL_00b3:  add
    IL_00b4:  ldloc.s    V_7
    IL_00b6:  ldloc.s    V_7
    IL_00b8:  mul
    IL_00b9:  add
    IL_00ba:  call       float64 [System.Runtime.Extensions]System.Math::Sqrt(float64)
    IL_00bf:  div
    IL_00c0:  sub
    IL_00c1:  stloc.0
    IL_00c2:  nop
    IL_00c3:  ldloc.3
    IL_00c4:  ldc.i4.1
    IL_00c5:  add
    IL_00c6:  stloc.3
    IL_00c7:  ldloc.3
    IL_00c8:  ldarg.0
    IL_00c9:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_00ce:  ldlen
    IL_00cf:  conv.i4
    IL_00d0:  clt
    IL_00d2:  stloc.s    V_8
    IL_00d4:  ldloc.s    V_8
    IL_00d6:  brtrue.s   IL_005f

    IL_00d8:  nop
    IL_00d9:  ldloc.1
    IL_00da:  ldc.i4.1
    IL_00db:  add
    IL_00dc:  stloc.1
    IL_00dd:  ldloc.1
    IL_00de:  ldarg.0
    IL_00df:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_00e4:  ldlen
    IL_00e5:  conv.i4
    IL_00e6:  clt
    IL_00e8:  stloc.s    V_9
    IL_00ea:  ldloc.s    V_9
    IL_00ec:  brtrue     IL_0012

    IL_00f1:  ldloc.0
    IL_00f2:  stloc.s    V_10
    IL_00f4:  br.s       IL_00f6

    IL_00f6:  ldloc.s    V_10
    IL_00f8:  ret
  } // end of method NBodySystem::Energy

} // end of class HelloWorld.NBodySystem


// =============================================================

// *********** DISASSEMBLY COMPLETE ***********************
