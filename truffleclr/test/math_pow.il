
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
// MVID: {b29d2fa7-d475-43eb-b67b-08e5ecc8a372}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x10429c000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static void  Check(float64 x,
                                               float64 y,
                                               float64 expected) cil managed
  {
    // Code size       70 (0x46)
    .maxstack  3
    .locals init (float64 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  call       float64 [System.Runtime]System.Math::Pow(float64,
                                                                  float64)
    IL_0008:  stloc.0
    IL_0009:  ldloc.0
    IL_000a:  ldarg.2
    IL_000b:  beq.s      IL_0015

    IL_000d:  ldloc.0
    IL_000e:  ldloc.0
    IL_000f:  beq.s      IL_003e

    IL_0011:  ldarg.2
    IL_0012:  ldarg.2
    IL_0013:  beq.s      IL_003e

    IL_0015:  ldarg.2
    IL_0016:  ldc.r8     0.0
    IL_001f:  bne.un.s   IL_003b

    IL_0021:  ldc.r8     1
    IL_002a:  ldloc.0
    IL_002b:  div
    IL_002c:  ldc.r8     1
    IL_0035:  ldarg.2
    IL_0036:  div
    IL_0037:  ceq
    IL_0039:  br.s       IL_003c

    IL_003b:  ldc.i4.1
    IL_003c:  br.s       IL_003f

    IL_003e:  ldc.i4.0
    IL_003f:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_0044:  nop
    IL_0045:  ret
  } // end of method Program::Check

  .method private hidebysig static void  Main() cil managed
  {
    .entrypoint
    // Code size       808 (0x328)
    .maxstack  3
    .locals init (float64 V_0,
             float64 V_1,
             float64 V_2)
    IL_0000:  nop
    IL_0001:  ldc.r8     0.0
    IL_000a:  stloc.0
    IL_000b:  ldc.r8     1
    IL_0014:  ldloc.0
    IL_0015:  div
    IL_0016:  stloc.1
    IL_0017:  ldloc.0
    IL_0018:  ldloc.0
    IL_0019:  div
    IL_001a:  stloc.2
    IL_001b:  ldloc.2
    IL_001c:  ldloc.0
    IL_001d:  ldc.r8     1
    IL_0026:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_002b:  nop
    IL_002c:  ldloc.2
    IL_002d:  ldloc.0
    IL_002e:  neg
    IL_002f:  ldc.r8     1
    IL_0038:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_003d:  nop
    IL_003e:  ldloc.2
    IL_003f:  ldc.r8     2
    IL_0048:  ldloc.2
    IL_0049:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_004e:  nop
    IL_004f:  ldc.r8     2
    IL_0058:  ldloc.2
    IL_0059:  ldloc.2
    IL_005a:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_005f:  nop
    IL_0060:  ldc.r8     1
    IL_0069:  ldloc.2
    IL_006a:  ldc.r8     1
    IL_0073:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_0078:  nop
    IL_0079:  ldc.r8     1
    IL_0082:  ldloc.1
    IL_0083:  ldc.r8     1
    IL_008c:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_0091:  nop
    IL_0092:  ldc.r8     1
    IL_009b:  ldloc.1
    IL_009c:  neg
    IL_009d:  ldc.r8     1
    IL_00a6:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_00ab:  nop
    IL_00ac:  ldc.r8     -1
    IL_00b5:  ldloc.1
    IL_00b6:  ldc.r8     1
    IL_00bf:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_00c4:  nop
    IL_00c5:  ldc.r8     -1
    IL_00ce:  ldloc.1
    IL_00cf:  neg
    IL_00d0:  ldc.r8     1
    IL_00d9:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_00de:  nop
    IL_00df:  ldloc.0
    IL_00e0:  ldc.r8     -3
    IL_00e9:  ldloc.1
    IL_00ea:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_00ef:  nop
    IL_00f0:  ldloc.0
    IL_00f1:  neg
    IL_00f2:  ldc.r8     -3
    IL_00fb:  ldloc.1
    IL_00fc:  neg
    IL_00fd:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_0102:  nop
    IL_0103:  ldloc.0
    IL_0104:  ldloc.1
    IL_0105:  neg
    IL_0106:  ldloc.1
    IL_0107:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_010c:  nop
    IL_010d:  ldloc.0
    IL_010e:  neg
    IL_010f:  ldloc.1
    IL_0110:  neg
    IL_0111:  ldloc.1
    IL_0112:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_0117:  nop
    IL_0118:  ldloc.0
    IL_0119:  ldloc.1
    IL_011a:  ldloc.0
    IL_011b:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_0120:  nop
    IL_0121:  ldloc.0
    IL_0122:  neg
    IL_0123:  ldloc.1
    IL_0124:  ldloc.0
    IL_0125:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_012a:  nop
    IL_012b:  ldloc.0
    IL_012c:  ldc.r8     3
    IL_0135:  ldloc.0
    IL_0136:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_013b:  nop
    IL_013c:  ldloc.0
    IL_013d:  neg
    IL_013e:  ldc.r8     3
    IL_0147:  ldloc.0
    IL_0148:  neg
    IL_0149:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_014e:  nop
    IL_014f:  ldc.r8     0.5
    IL_0158:  ldloc.1
    IL_0159:  ldloc.0
    IL_015a:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_015f:  nop
    IL_0160:  ldc.r8     -0.5
    IL_0169:  ldloc.1
    IL_016a:  ldloc.0
    IL_016b:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_0170:  nop
    IL_0171:  ldc.r8     2
    IL_017a:  ldloc.1
    IL_017b:  ldloc.1
    IL_017c:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_0181:  nop
    IL_0182:  ldc.r8     -2
    IL_018b:  ldloc.1
    IL_018c:  ldloc.1
    IL_018d:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_0192:  nop
    IL_0193:  ldc.r8     0.5
    IL_019c:  ldloc.1
    IL_019d:  neg
    IL_019e:  ldloc.1
    IL_019f:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_01a4:  nop
    IL_01a5:  ldc.r8     -0.5
    IL_01ae:  ldloc.1
    IL_01af:  neg
    IL_01b0:  ldloc.1
    IL_01b1:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_01b6:  nop
    IL_01b7:  ldc.r8     2
    IL_01c0:  ldloc.1
    IL_01c1:  neg
    IL_01c2:  ldloc.0
    IL_01c3:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_01c8:  nop
    IL_01c9:  ldc.r8     -2
    IL_01d2:  ldloc.1
    IL_01d3:  neg
    IL_01d4:  ldloc.0
    IL_01d5:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_01da:  nop
    IL_01db:  ldloc.1
    IL_01dc:  ldc.r8     -2
    IL_01e5:  ldloc.0
    IL_01e6:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_01eb:  nop
    IL_01ec:  ldloc.1
    IL_01ed:  ldc.r8     2
    IL_01f6:  ldloc.1
    IL_01f7:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_01fc:  nop
    IL_01fd:  ldloc.1
    IL_01fe:  neg
    IL_01ff:  ldc.r8     -3
    IL_0208:  ldloc.0
    IL_0209:  neg
    IL_020a:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_020f:  nop
    IL_0210:  ldloc.1
    IL_0211:  neg
    IL_0212:  ldc.r8     3
    IL_021b:  ldloc.1
    IL_021c:  neg
    IL_021d:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_0222:  nop
    IL_0223:  ldloc.1
    IL_0224:  neg
    IL_0225:  ldc.r8     -2
    IL_022e:  ldloc.0
    IL_022f:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_0234:  nop
    IL_0235:  ldloc.1
    IL_0236:  neg
    IL_0237:  ldc.r8     -0.5
    IL_0240:  ldloc.0
    IL_0241:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_0246:  nop
    IL_0247:  ldloc.1
    IL_0248:  neg
    IL_0249:  ldc.r8     2
    IL_0252:  ldloc.1
    IL_0253:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_0258:  nop
    IL_0259:  ldloc.1
    IL_025a:  neg
    IL_025b:  ldc.r8     0.5
    IL_0264:  ldloc.1
    IL_0265:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_026a:  nop
    IL_026b:  ldloc.0
    IL_026c:  neg
    IL_026d:  ldc.r8     -2
    IL_0276:  ldloc.1
    IL_0277:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_027c:  nop
    IL_027d:  ldloc.0
    IL_027e:  neg
    IL_027f:  ldc.r8     -0.5
    IL_0288:  ldloc.1
    IL_0289:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_028e:  nop
    IL_028f:  ldloc.0
    IL_0290:  neg
    IL_0291:  ldc.r8     2
    IL_029a:  ldloc.0
    IL_029b:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_02a0:  nop
    IL_02a1:  ldloc.0
    IL_02a2:  neg
    IL_02a3:  ldc.r8     0.5
    IL_02ac:  ldloc.0
    IL_02ad:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_02b2:  nop
    IL_02b3:  ldc.r8     -2
    IL_02bc:  ldc.r8     0.5
    IL_02c5:  ldloc.2
    IL_02c6:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_02cb:  nop
    IL_02cc:  ldc.r8     -2
    IL_02d5:  ldc.r8     3
    IL_02de:  ldc.r8     -8
    IL_02e7:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_02ec:  nop
    IL_02ed:  ldc.r8     2
    IL_02f6:  ldc.r8     10
    IL_02ff:  ldc.r8     1024
    IL_0308:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_030d:  nop
    IL_030e:  ldc.r8     -2
    IL_0317:  ldloc.0
    IL_0318:  ldc.r8     1
    IL_0321:  call       void HelloWorld.Program::Check(float64,
                                                        float64,
                                                        float64)
    IL_0326:  nop
    IL_0327:  ret
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
