
//  Microsoft (R) .NET Framework IL Disassembler.  Version 4.5.30319.0



// Metadata version: v4.0.30319
.assembly extern mscorlib
{
  .publickeytoken = (B7 7A 5C 56 19 34 E0 89 )                         // .z\V.4..
  .ver 4:0:0:0
}
.assembly Program_n_body
{
  .custom instance void [mscorlib]System.Runtime.CompilerServices.RuntimeCompatibilityAttribute::.ctor() = ( 01 00 01 00 54 02 16 57 72 61 70 4E 6F 6E 45 78   // ....T..WrapNonEx
                                                                                                             63 65 70 74 69 6F 6E 54 68 72 6F 77 73 01 )       // ceptionThrows.
  .hash algorithm 0x00008004
  .ver 0:0:0:0
}
.module Program_n_body.exe
// MVID: {0d4ad00c-8f45-4a40-985d-2ec116d8876d}
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x00007FA979577000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [mscorlib]System.Object
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [mscorlib]System.Object::.ctor()
    IL_0006:  ret
  } // end of method Program::.ctor

  .method public hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       68 (0x44)
    .maxstack  2
    .locals init (int32 V_0,
             class HelloWorld.NBodySystem V_1,
             int32 V_2)
    IL_0000:  ldc.i4     0x186a0
    IL_0005:  stloc.0
    IL_0006:  newobj     instance void HelloWorld.NBodySystem::.ctor()
    IL_000b:  stloc.1
    IL_000c:  ldloc.1
    IL_000d:  callvirt   instance float64 HelloWorld.NBodySystem::Energy()
    IL_0012:  call       void [mscorlib]System.Console::WriteLine(float64)
    IL_0017:  ldc.i4.0
    IL_0018:  stloc.2
    IL_0019:  br         IL_0031

    IL_001e:  ldloc.1
    IL_001f:  ldc.r8     0.01
    IL_0028:  callvirt   instance void HelloWorld.NBodySystem::Advance(float64)
    IL_002d:  ldloc.2
    IL_002e:  ldc.i4.1
    IL_002f:  add
    IL_0030:  stloc.2
    IL_0031:  ldloc.2
    IL_0032:  ldloc.0
    IL_0033:  blt        IL_001e

    IL_0038:  ldloc.1
    IL_0039:  callvirt   instance float64 HelloWorld.NBodySystem::Energy()
    IL_003e:  call       void [mscorlib]System.Console::WriteLine(float64)
    IL_0043:  ret
  } // end of method Program::Main

} // end of class HelloWorld.Program

.class private auto ansi beforefieldinit HelloWorld.Body
       extends [mscorlib]System.Object
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
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [mscorlib]System.Object::.ctor()
    IL_0006:  ret
  } // end of method Body::.ctor

} // end of class HelloWorld.Body

.class private auto ansi beforefieldinit HelloWorld.Pair
       extends [mscorlib]System.Object
{
  .field public class HelloWorld.Body bi
  .field public class HelloWorld.Body bj
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [mscorlib]System.Object::.ctor()
    IL_0006:  ret
  } // end of method Pair::.ctor

} // end of class HelloWorld.Pair

.class private auto ansi beforefieldinit HelloWorld.NBodySystem
       extends [mscorlib]System.Object
{
  .field private class HelloWorld.Body[] bodies
  .field private class HelloWorld.Pair[] pairs
  .field private static literal float64 Pi = float64(3.1415926535897931)
  .field private static literal float64 Solarmass = float64(39.478417604357432)
  .field private static literal float64 DaysPeryear = float64(365.24000000000001)
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       846 (0x34e)
    .maxstack  6
    .locals init (class HelloWorld.Body V_0,
             int32 V_1,
             int32 V_2,
             int32 V_3,
             class HelloWorld.Pair V_4,
             float64 V_5,
             float64 V_6,
             float64 V_7,
             class HelloWorld.Body V_8,
             class HelloWorld.Body[] V_9,
             int32 V_10,
             class HelloWorld.Body V_11)
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [mscorlib]System.Object::.ctor()
    IL_0006:  ldarg.0
    IL_0007:  ldc.i4.5
    IL_0008:  newarr     HelloWorld.Body
    IL_000d:  dup
    IL_000e:  ldc.i4.0
    IL_000f:  newobj     instance void HelloWorld.Body::.ctor()
    IL_0014:  stloc.0
    IL_0015:  ldloc.0
    IL_0016:  ldc.r8     39.478417604357432
    IL_001f:  stfld      float64 HelloWorld.Body::mass
    IL_0024:  ldloc.0
    IL_0025:  stelem.ref
    IL_0026:  dup
    IL_0027:  ldc.i4.1
    IL_0028:  newobj     instance void HelloWorld.Body::.ctor()
    IL_002d:  stloc.0
    IL_002e:  ldloc.0
    IL_002f:  ldc.r8     4.8414314424647209
    IL_0038:  stfld      float64 HelloWorld.Body::x
    IL_003d:  ldloc.0
    IL_003e:  ldc.r8     -1.1603200440274284
    IL_0047:  stfld      float64 HelloWorld.Body::y
    IL_004c:  ldloc.0
    IL_004d:  ldc.r8     -0.10362204447112311
    IL_0056:  stfld      float64 HelloWorld.Body::z
    IL_005b:  ldloc.0
    IL_005c:  ldc.r8     0.60632639299583202
    IL_0065:  stfld      float64 HelloWorld.Body::vx
    IL_006a:  ldloc.0
    IL_006b:  ldc.r8     2.8119868449162602
    IL_0074:  stfld      float64 HelloWorld.Body::vy
    IL_0079:  ldloc.0
    IL_007a:  ldc.r8     -0.025218361659887629
    IL_0083:  stfld      float64 HelloWorld.Body::vz
    IL_0088:  ldloc.0
    IL_0089:  ldc.r8     0.037693674870389493
    IL_0092:  stfld      float64 HelloWorld.Body::mass
    IL_0097:  ldloc.0
    IL_0098:  stelem.ref
    IL_0099:  dup
    IL_009a:  ldc.i4.2
    IL_009b:  newobj     instance void HelloWorld.Body::.ctor()
    IL_00a0:  stloc.0
    IL_00a1:  ldloc.0
    IL_00a2:  ldc.r8     8.3433667182445799
    IL_00ab:  stfld      float64 HelloWorld.Body::x
    IL_00b0:  ldloc.0
    IL_00b1:  ldc.r8     4.1247985641243048
    IL_00ba:  stfld      float64 HelloWorld.Body::y
    IL_00bf:  ldloc.0
    IL_00c0:  ldc.r8     -0.40352341711432138
    IL_00c9:  stfld      float64 HelloWorld.Body::z
    IL_00ce:  ldloc.0
    IL_00cf:  ldc.r8     -1.0107743461787924
    IL_00d8:  stfld      float64 HelloWorld.Body::vx
    IL_00dd:  ldloc.0
    IL_00de:  ldc.r8     1.8256623712304119
    IL_00e7:  stfld      float64 HelloWorld.Body::vy
    IL_00ec:  ldloc.0
    IL_00ed:  ldc.r8     0.0084157613765841535
    IL_00f6:  stfld      float64 HelloWorld.Body::vz
    IL_00fb:  ldloc.0
    IL_00fc:  ldc.r8     0.011286326131968767
    IL_0105:  stfld      float64 HelloWorld.Body::mass
    IL_010a:  ldloc.0
    IL_010b:  stelem.ref
    IL_010c:  dup
    IL_010d:  ldc.i4.3
    IL_010e:  newobj     instance void HelloWorld.Body::.ctor()
    IL_0113:  stloc.0
    IL_0114:  ldloc.0
    IL_0115:  ldc.r8     12.894369562139131
    IL_011e:  stfld      float64 HelloWorld.Body::x
    IL_0123:  ldloc.0
    IL_0124:  ldc.r8     -15.111151401698631
    IL_012d:  stfld      float64 HelloWorld.Body::y
    IL_0132:  ldloc.0
    IL_0133:  ldc.r8     -0.22330757889265573
    IL_013c:  stfld      float64 HelloWorld.Body::z
    IL_0141:  ldloc.0
    IL_0142:  ldc.r8     1.0827910064415354
    IL_014b:  stfld      float64 HelloWorld.Body::vx
    IL_0150:  ldloc.0
    IL_0151:  ldc.r8     0.86871301816960822
    IL_015a:  stfld      float64 HelloWorld.Body::vy
    IL_015f:  ldloc.0
    IL_0160:  ldc.r8     -0.010832637401363636
    IL_0169:  stfld      float64 HelloWorld.Body::vz
    IL_016e:  ldloc.0
    IL_016f:  ldc.r8     0.0017237240570597112
    IL_0178:  stfld      float64 HelloWorld.Body::mass
    IL_017d:  ldloc.0
    IL_017e:  stelem.ref
    IL_017f:  dup
    IL_0180:  ldc.i4.4
    IL_0181:  newobj     instance void HelloWorld.Body::.ctor()
    IL_0186:  stloc.0
    IL_0187:  ldloc.0
    IL_0188:  ldc.r8     15.379697114850917
    IL_0191:  stfld      float64 HelloWorld.Body::x
    IL_0196:  ldloc.0
    IL_0197:  ldc.r8     -25.919314609987964
    IL_01a0:  stfld      float64 HelloWorld.Body::y
    IL_01a5:  ldloc.0
    IL_01a6:  ldc.r8     0.17925877295037118
    IL_01af:  stfld      float64 HelloWorld.Body::z
    IL_01b4:  ldloc.0
    IL_01b5:  ldc.r8     0.97909073224389798
    IL_01be:  stfld      float64 HelloWorld.Body::vx
    IL_01c3:  ldloc.0
    IL_01c4:  ldc.r8     0.59469899864767617
    IL_01cd:  stfld      float64 HelloWorld.Body::vy
    IL_01d2:  ldloc.0
    IL_01d3:  ldc.r8     -0.034755955504078104
    IL_01dc:  stfld      float64 HelloWorld.Body::vz
    IL_01e1:  ldloc.0
    IL_01e2:  ldc.r8     0.0020336868699246304
    IL_01eb:  stfld      float64 HelloWorld.Body::mass
    IL_01f0:  ldloc.0
    IL_01f1:  stelem.ref
    IL_01f2:  stfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_01f7:  ldarg.0
    IL_01f8:  ldarg.0
    IL_01f9:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_01fe:  ldlen
    IL_01ff:  conv.i4
    IL_0200:  ldarg.0
    IL_0201:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_0206:  ldlen
    IL_0207:  conv.i4
    IL_0208:  ldc.i4.1
    IL_0209:  sub
    IL_020a:  mul
    IL_020b:  ldc.i4.2
    IL_020c:  div
    IL_020d:  newarr     HelloWorld.Pair
    IL_0212:  stfld      class HelloWorld.Pair[] HelloWorld.NBodySystem::pairs
    IL_0217:  ldc.i4.0
    IL_0218:  stloc.1
    IL_0219:  ldc.i4.0
    IL_021a:  stloc.2
    IL_021b:  br         IL_0272

    IL_0220:  ldloc.2
    IL_0221:  ldc.i4.1
    IL_0222:  add
    IL_0223:  stloc.3
    IL_0224:  br         IL_0260

    IL_0229:  ldarg.0
    IL_022a:  ldfld      class HelloWorld.Pair[] HelloWorld.NBodySystem::pairs
    IL_022f:  ldloc.1
    IL_0230:  dup
    IL_0231:  ldc.i4.1
    IL_0232:  add
    IL_0233:  stloc.1
    IL_0234:  newobj     instance void HelloWorld.Pair::.ctor()
    IL_0239:  stloc.s    V_4
    IL_023b:  ldloc.s    V_4
    IL_023d:  ldarg.0
    IL_023e:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_0243:  ldloc.2
    IL_0244:  ldelem.ref
    IL_0245:  stfld      class HelloWorld.Body HelloWorld.Pair::bi
    IL_024a:  ldloc.s    V_4
    IL_024c:  ldarg.0
    IL_024d:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_0252:  ldloc.3
    IL_0253:  ldelem.ref
    IL_0254:  stfld      class HelloWorld.Body HelloWorld.Pair::bj
    IL_0259:  ldloc.s    V_4
    IL_025b:  stelem.ref
    IL_025c:  ldloc.3
    IL_025d:  ldc.i4.1
    IL_025e:  add
    IL_025f:  stloc.3
    IL_0260:  ldloc.3
    IL_0261:  ldarg.0
    IL_0262:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_0267:  ldlen
    IL_0268:  conv.i4
    IL_0269:  blt        IL_0229

    IL_026e:  ldloc.2
    IL_026f:  ldc.i4.1
    IL_0270:  add
    IL_0271:  stloc.2
    IL_0272:  ldloc.2
    IL_0273:  ldarg.0
    IL_0274:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_0279:  ldlen
    IL_027a:  conv.i4
    IL_027b:  ldc.i4.1
    IL_027c:  sub
    IL_027d:  blt        IL_0220

    IL_0282:  ldc.r8     0.0
    IL_028b:  stloc.s    V_5
    IL_028d:  ldc.r8     0.0
    IL_0296:  stloc.s    V_6
    IL_0298:  ldc.r8     0.0
    IL_02a1:  stloc.s    V_7
    IL_02a3:  ldarg.0
    IL_02a4:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_02a9:  stloc.s    V_9
    IL_02ab:  ldc.i4.0
    IL_02ac:  stloc.s    V_10
    IL_02ae:  br         IL_02fc

    IL_02b3:  ldloc.s    V_9
    IL_02b5:  ldloc.s    V_10
    IL_02b7:  ldelem.ref
    IL_02b8:  stloc.s    V_8
    IL_02ba:  ldloc.s    V_5
    IL_02bc:  ldloc.s    V_8
    IL_02be:  ldfld      float64 HelloWorld.Body::vx
    IL_02c3:  ldloc.s    V_8
    IL_02c5:  ldfld      float64 HelloWorld.Body::mass
    IL_02ca:  mul
    IL_02cb:  add
    IL_02cc:  stloc.s    V_5
    IL_02ce:  ldloc.s    V_6
    IL_02d0:  ldloc.s    V_8
    IL_02d2:  ldfld      float64 HelloWorld.Body::vy
    IL_02d7:  ldloc.s    V_8
    IL_02d9:  ldfld      float64 HelloWorld.Body::mass
    IL_02de:  mul
    IL_02df:  add
    IL_02e0:  stloc.s    V_6
    IL_02e2:  ldloc.s    V_7
    IL_02e4:  ldloc.s    V_8
    IL_02e6:  ldfld      float64 HelloWorld.Body::vz
    IL_02eb:  ldloc.s    V_8
    IL_02ed:  ldfld      float64 HelloWorld.Body::mass
    IL_02f2:  mul
    IL_02f3:  add
    IL_02f4:  stloc.s    V_7
    IL_02f6:  ldloc.s    V_10
    IL_02f8:  ldc.i4.1
    IL_02f9:  add
    IL_02fa:  stloc.s    V_10
    IL_02fc:  ldloc.s    V_10
    IL_02fe:  ldloc.s    V_9
    IL_0300:  ldlen
    IL_0301:  conv.i4
    IL_0302:  blt        IL_02b3

    IL_0307:  ldarg.0
    IL_0308:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_030d:  ldc.i4.0
    IL_030e:  ldelem.ref
    IL_030f:  stloc.s    V_11
    IL_0311:  ldloc.s    V_11
    IL_0313:  ldloc.s    V_5
    IL_0315:  neg
    IL_0316:  ldc.r8     39.478417604357432
    IL_031f:  div
    IL_0320:  stfld      float64 HelloWorld.Body::vx
    IL_0325:  ldloc.s    V_11
    IL_0327:  ldloc.s    V_6
    IL_0329:  neg
    IL_032a:  ldc.r8     39.478417604357432
    IL_0333:  div
    IL_0334:  stfld      float64 HelloWorld.Body::vy
    IL_0339:  ldloc.s    V_11
    IL_033b:  ldloc.s    V_7
    IL_033d:  neg
    IL_033e:  ldc.r8     39.478417604357432
    IL_0347:  div
    IL_0348:  stfld      float64 HelloWorld.Body::vz
    IL_034d:  ret
  } // end of method NBodySystem::.ctor

  .method public hidebysig instance void 
          Advance(float64 dt) cil managed
  {
    // Code size       393 (0x189)
    .maxstack  4
    .locals init (class HelloWorld.Pair V_0,
             class HelloWorld.Pair[] V_1,
             int32 V_2,
             class HelloWorld.Body V_3,
             class HelloWorld.Body V_4,
             float64 V_5,
             float64 V_6,
             float64 V_7,
             float64 V_8,
             float64 V_9,
             class HelloWorld.Body V_10,
             class HelloWorld.Body[] V_11,
             int32 V_12)
    IL_0000:  ldarg.0
    IL_0001:  ldfld      class HelloWorld.Pair[] HelloWorld.NBodySystem::pairs
    IL_0006:  stloc.1
    IL_0007:  ldc.i4.0
    IL_0008:  stloc.2
    IL_0009:  br         IL_0112

    IL_000e:  ldloc.1
    IL_000f:  ldloc.2
    IL_0010:  ldelem.ref
    IL_0011:  stloc.0
    IL_0012:  ldloc.0
    IL_0013:  ldfld      class HelloWorld.Body HelloWorld.Pair::bi
    IL_0018:  stloc.3
    IL_0019:  ldloc.0
    IL_001a:  ldfld      class HelloWorld.Body HelloWorld.Pair::bj
    IL_001f:  stloc.s    V_4
    IL_0021:  ldloc.3
    IL_0022:  ldfld      float64 HelloWorld.Body::x
    IL_0027:  ldloc.s    V_4
    IL_0029:  ldfld      float64 HelloWorld.Body::x
    IL_002e:  sub
    IL_002f:  stloc.s    V_5
    IL_0031:  ldloc.3
    IL_0032:  ldfld      float64 HelloWorld.Body::y
    IL_0037:  ldloc.s    V_4
    IL_0039:  ldfld      float64 HelloWorld.Body::y
    IL_003e:  sub
    IL_003f:  stloc.s    V_6
    IL_0041:  ldloc.3
    IL_0042:  ldfld      float64 HelloWorld.Body::z
    IL_0047:  ldloc.s    V_4
    IL_0049:  ldfld      float64 HelloWorld.Body::z
    IL_004e:  sub
    IL_004f:  stloc.s    V_7
    IL_0051:  ldloc.s    V_5
    IL_0053:  ldloc.s    V_5
    IL_0055:  mul
    IL_0056:  ldloc.s    V_6
    IL_0058:  ldloc.s    V_6
    IL_005a:  mul
    IL_005b:  add
    IL_005c:  ldloc.s    V_7
    IL_005e:  ldloc.s    V_7
    IL_0060:  mul
    IL_0061:  add
    IL_0062:  stloc.s    V_8
    IL_0064:  ldarg.1
    IL_0065:  ldloc.s    V_8
    IL_0067:  ldloc.s    V_8
    IL_0069:  call       float64 [mscorlib]System.Math::Sqrt(float64)
    IL_006e:  mul
    IL_006f:  div
    IL_0070:  stloc.s    V_9
    IL_0072:  ldloc.3
    IL_0073:  dup
    IL_0074:  ldfld      float64 HelloWorld.Body::vx
    IL_0079:  ldloc.s    V_5
    IL_007b:  ldloc.s    V_4
    IL_007d:  ldfld      float64 HelloWorld.Body::mass
    IL_0082:  mul
    IL_0083:  ldloc.s    V_9
    IL_0085:  mul
    IL_0086:  sub
    IL_0087:  stfld      float64 HelloWorld.Body::vx
    IL_008c:  ldloc.s    V_4
    IL_008e:  dup
    IL_008f:  ldfld      float64 HelloWorld.Body::vx
    IL_0094:  ldloc.s    V_5
    IL_0096:  ldloc.3
    IL_0097:  ldfld      float64 HelloWorld.Body::mass
    IL_009c:  mul
    IL_009d:  ldloc.s    V_9
    IL_009f:  mul
    IL_00a0:  add
    IL_00a1:  stfld      float64 HelloWorld.Body::vx
    IL_00a6:  ldloc.3
    IL_00a7:  dup
    IL_00a8:  ldfld      float64 HelloWorld.Body::vy
    IL_00ad:  ldloc.s    V_6
    IL_00af:  ldloc.s    V_4
    IL_00b1:  ldfld      float64 HelloWorld.Body::mass
    IL_00b6:  mul
    IL_00b7:  ldloc.s    V_9
    IL_00b9:  mul
    IL_00ba:  sub
    IL_00bb:  stfld      float64 HelloWorld.Body::vy
    IL_00c0:  ldloc.s    V_4
    IL_00c2:  dup
    IL_00c3:  ldfld      float64 HelloWorld.Body::vy
    IL_00c8:  ldloc.s    V_6
    IL_00ca:  ldloc.3
    IL_00cb:  ldfld      float64 HelloWorld.Body::mass
    IL_00d0:  mul
    IL_00d1:  ldloc.s    V_9
    IL_00d3:  mul
    IL_00d4:  add
    IL_00d5:  stfld      float64 HelloWorld.Body::vy
    IL_00da:  ldloc.3
    IL_00db:  dup
    IL_00dc:  ldfld      float64 HelloWorld.Body::vz
    IL_00e1:  ldloc.s    V_7
    IL_00e3:  ldloc.s    V_4
    IL_00e5:  ldfld      float64 HelloWorld.Body::mass
    IL_00ea:  mul
    IL_00eb:  ldloc.s    V_9
    IL_00ed:  mul
    IL_00ee:  sub
    IL_00ef:  stfld      float64 HelloWorld.Body::vz
    IL_00f4:  ldloc.s    V_4
    IL_00f6:  dup
    IL_00f7:  ldfld      float64 HelloWorld.Body::vz
    IL_00fc:  ldloc.s    V_7
    IL_00fe:  ldloc.3
    IL_00ff:  ldfld      float64 HelloWorld.Body::mass
    IL_0104:  mul
    IL_0105:  ldloc.s    V_9
    IL_0107:  mul
    IL_0108:  add
    IL_0109:  stfld      float64 HelloWorld.Body::vz
    IL_010e:  ldloc.2
    IL_010f:  ldc.i4.1
    IL_0110:  add
    IL_0111:  stloc.2
    IL_0112:  ldloc.2
    IL_0113:  ldloc.1
    IL_0114:  ldlen
    IL_0115:  conv.i4
    IL_0116:  blt        IL_000e

    IL_011b:  ldarg.0
    IL_011c:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_0121:  stloc.s    V_11
    IL_0123:  ldc.i4.0
    IL_0124:  stloc.s    V_12
    IL_0126:  br         IL_017d

    IL_012b:  ldloc.s    V_11
    IL_012d:  ldloc.s    V_12
    IL_012f:  ldelem.ref
    IL_0130:  stloc.s    V_10
    IL_0132:  ldloc.s    V_10
    IL_0134:  dup
    IL_0135:  ldfld      float64 HelloWorld.Body::x
    IL_013a:  ldarg.1
    IL_013b:  ldloc.s    V_10
    IL_013d:  ldfld      float64 HelloWorld.Body::vx
    IL_0142:  mul
    IL_0143:  add
    IL_0144:  stfld      float64 HelloWorld.Body::x
    IL_0149:  ldloc.s    V_10
    IL_014b:  dup
    IL_014c:  ldfld      float64 HelloWorld.Body::y
    IL_0151:  ldarg.1
    IL_0152:  ldloc.s    V_10
    IL_0154:  ldfld      float64 HelloWorld.Body::vy
    IL_0159:  mul
    IL_015a:  add
    IL_015b:  stfld      float64 HelloWorld.Body::y
    IL_0160:  ldloc.s    V_10
    IL_0162:  dup
    IL_0163:  ldfld      float64 HelloWorld.Body::z
    IL_0168:  ldarg.1
    IL_0169:  ldloc.s    V_10
    IL_016b:  ldfld      float64 HelloWorld.Body::vz
    IL_0170:  mul
    IL_0171:  add
    IL_0172:  stfld      float64 HelloWorld.Body::z
    IL_0177:  ldloc.s    V_12
    IL_0179:  ldc.i4.1
    IL_017a:  add
    IL_017b:  stloc.s    V_12
    IL_017d:  ldloc.s    V_12
    IL_017f:  ldloc.s    V_11
    IL_0181:  ldlen
    IL_0182:  conv.i4
    IL_0183:  blt        IL_012b

    IL_0188:  ret
  } // end of method NBodySystem::Advance

  .method public hidebysig instance float64 
          Energy() cil managed
  {
    // Code size       232 (0xe8)
    .maxstack  5
    .locals init (float64 V_0,
             int32 V_1,
             class HelloWorld.Body V_2,
             int32 V_3,
             class HelloWorld.Body V_4,
             float64 V_5,
             float64 V_6,
             float64 V_7)
    IL_0000:  ldc.r8     0.0
    IL_0009:  stloc.0
    IL_000a:  ldc.i4.0
    IL_000b:  stloc.1
    IL_000c:  br         IL_00d8

    IL_0011:  ldarg.0
    IL_0012:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_0017:  ldloc.1
    IL_0018:  ldelem.ref
    IL_0019:  stloc.2
    IL_001a:  ldloc.0
    IL_001b:  ldc.r8     0.5
    IL_0024:  ldloc.2
    IL_0025:  ldfld      float64 HelloWorld.Body::mass
    IL_002a:  mul
    IL_002b:  ldloc.2
    IL_002c:  ldfld      float64 HelloWorld.Body::vx
    IL_0031:  ldloc.2
    IL_0032:  ldfld      float64 HelloWorld.Body::vx
    IL_0037:  mul
    IL_0038:  ldloc.2
    IL_0039:  ldfld      float64 HelloWorld.Body::vy
    IL_003e:  ldloc.2
    IL_003f:  ldfld      float64 HelloWorld.Body::vy
    IL_0044:  mul
    IL_0045:  add
    IL_0046:  ldloc.2
    IL_0047:  ldfld      float64 HelloWorld.Body::vz
    IL_004c:  ldloc.2
    IL_004d:  ldfld      float64 HelloWorld.Body::vz
    IL_0052:  mul
    IL_0053:  add
    IL_0054:  mul
    IL_0055:  add
    IL_0056:  stloc.0
    IL_0057:  ldloc.1
    IL_0058:  ldc.i4.1
    IL_0059:  add
    IL_005a:  stloc.3
    IL_005b:  br         IL_00c6

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
    IL_00ba:  call       float64 [mscorlib]System.Math::Sqrt(float64)
    IL_00bf:  div
    IL_00c0:  sub
    IL_00c1:  stloc.0
    IL_00c2:  ldloc.3
    IL_00c3:  ldc.i4.1
    IL_00c4:  add
    IL_00c5:  stloc.3
    IL_00c6:  ldloc.3
    IL_00c7:  ldarg.0
    IL_00c8:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_00cd:  ldlen
    IL_00ce:  conv.i4
    IL_00cf:  blt        IL_0060

    IL_00d4:  ldloc.1
    IL_00d5:  ldc.i4.1
    IL_00d6:  add
    IL_00d7:  stloc.1
    IL_00d8:  ldloc.1
    IL_00d9:  ldarg.0
    IL_00da:  ldfld      class HelloWorld.Body[] HelloWorld.NBodySystem::bodies
    IL_00df:  ldlen
    IL_00e0:  conv.i4
    IL_00e1:  blt        IL_0011

    IL_00e6:  ldloc.0
    IL_00e7:  ret
  } // end of method NBodySystem::Energy

} // end of class HelloWorld.NBodySystem


// =============================================================

// *********** DISASSEMBLY COMPLETE ***********************
