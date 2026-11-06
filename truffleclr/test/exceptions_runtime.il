
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
// MVID: {4dfdc909-539d-4a58-9ab3-7a03912fedff}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x104ac4000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.A
       extends [System.Runtime]System.Object
{
  .field public int32 X
  .method public hidebysig newslot virtual 
          instance int32  Read() cil managed
  {
    // Code size       12 (0xc)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      int32 HelloWorld.A::X
    IL_0007:  stloc.0
    IL_0008:  br.s       IL_000a

    IL_000a:  ldloc.0
    IL_000b:  ret
  } // end of method A::Read

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method A::.ctor

} // end of class HelloWorld.A

.class private auto ansi beforefieldinit HelloWorld.B
       extends [System.Runtime]System.Object
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method B::.ctor

} // end of class HelloWorld.B

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static int32 
          Zero() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.0
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method Program::Zero

  .method private hidebysig static void  Main() cil managed
  {
    .entrypoint
    // Code size       737 (0x2e1)
    .maxstack  3
    .locals init (class HelloWorld.A V_0,
             int32[] V_1,
             object V_2,
             object[] V_3,
             int32 V_4,
             object V_5,
             int32 V_6,
             int64 V_7,
             int32 V_8,
             object[] V_9,
             int32 V_10,
             bool V_11)
    IL_0000:  nop
    .try
    {
      IL_0001:  nop
      IL_0002:  ldc.i4.5
      IL_0003:  call       int32 HelloWorld.Program::Zero()
      IL_0008:  div
      IL_0009:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_000e:  nop
      IL_000f:  nop
      IL_0010:  leave.s    IL_0022

    }  // end .try
    catch [System.Runtime]System.DivideByZeroException 
    {
      IL_0012:  pop
      IL_0013:  nop
      IL_0014:  ldstr      "divide"
      IL_0019:  call       void [System.Console]System.Console::WriteLine(string)
      IL_001e:  nop
      IL_001f:  nop
      IL_0020:  leave.s    IL_0022

    }  // end handler
    IL_0022:  nop
    .try
    {
      IL_0023:  nop
      IL_0024:  ldc.i4.5
      IL_0025:  call       int32 HelloWorld.Program::Zero()
      IL_002a:  rem
      IL_002b:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_0030:  nop
      IL_0031:  nop
      IL_0032:  leave.s    IL_0044

    }  // end .try
    catch [System.Runtime]System.ArithmeticException 
    {
      IL_0034:  pop
      IL_0035:  nop
      IL_0036:  ldstr      "remainder"
      IL_003b:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0040:  nop
      IL_0041:  nop
      IL_0042:  leave.s    IL_0044

    }  // end handler
    IL_0044:  ldnull
    IL_0045:  stloc.0
    .try
    {
      IL_0046:  nop
      IL_0047:  ldloc.0
      IL_0048:  ldfld      int32 HelloWorld.A::X
      IL_004d:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_0052:  nop
      IL_0053:  nop
      IL_0054:  leave.s    IL_0066

    }  // end .try
    catch [System.Runtime]System.NullReferenceException 
    {
      IL_0056:  pop
      IL_0057:  nop
      IL_0058:  ldstr      "field null"
      IL_005d:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0062:  nop
      IL_0063:  nop
      IL_0064:  leave.s    IL_0066

    }  // end handler
    IL_0066:  nop
    .try
    {
      IL_0067:  nop
      IL_0068:  ldloc.0
      IL_0069:  callvirt   instance int32 HelloWorld.A::Read()
      IL_006e:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_0073:  nop
      IL_0074:  nop
      IL_0075:  leave.s    IL_0087

    }  // end .try
    catch [System.Runtime]System.NullReferenceException 
    {
      IL_0077:  pop
      IL_0078:  nop
      IL_0079:  ldstr      "call null"
      IL_007e:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0083:  nop
      IL_0084:  nop
      IL_0085:  leave.s    IL_0087

    }  // end handler
    IL_0087:  ldnull
    IL_0088:  stloc.1
    .try
    {
      IL_0089:  nop
      IL_008a:  ldloc.1
      IL_008b:  ldlen
      IL_008c:  conv.i4
      IL_008d:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_0092:  nop
      IL_0093:  nop
      IL_0094:  leave.s    IL_00a6

    }  // end .try
    catch [System.Runtime]System.NullReferenceException 
    {
      IL_0096:  pop
      IL_0097:  nop
      IL_0098:  ldstr      "array null"
      IL_009d:  call       void [System.Console]System.Console::WriteLine(string)
      IL_00a2:  nop
      IL_00a3:  nop
      IL_00a4:  leave.s    IL_00a6

    }  // end handler
    IL_00a6:  ldc.i4.1
    IL_00a7:  newarr     [System.Runtime]System.Int32
    IL_00ac:  stloc.1
    .try
    {
      IL_00ad:  nop
      IL_00ae:  ldloc.1
      IL_00af:  ldc.i4.1
      IL_00b0:  ldelem.i4
      IL_00b1:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_00b6:  nop
      IL_00b7:  nop
      IL_00b8:  leave.s    IL_00ca

    }  // end .try
    catch [System.Runtime]System.IndexOutOfRangeException 
    {
      IL_00ba:  pop
      IL_00bb:  nop
      IL_00bc:  ldstr      "bounds"
      IL_00c1:  call       void [System.Console]System.Console::WriteLine(string)
      IL_00c6:  nop
      IL_00c7:  nop
      IL_00c8:  leave.s    IL_00ca

    }  // end handler
    IL_00ca:  newobj     instance void HelloWorld.B::.ctor()
    IL_00cf:  stloc.2
    .try
    {
      IL_00d0:  nop
      IL_00d1:  ldloc.2
      IL_00d2:  castclass  HelloWorld.A
      IL_00d7:  stloc.0
      IL_00d8:  nop
      IL_00d9:  leave.s    IL_00eb

    }  // end .try
    catch [System.Runtime]System.InvalidCastException 
    {
      IL_00db:  pop
      IL_00dc:  nop
      IL_00dd:  ldstr      "cast"
      IL_00e2:  call       void [System.Console]System.Console::WriteLine(string)
      IL_00e7:  nop
      IL_00e8:  nop
      IL_00e9:  leave.s    IL_00eb

    }  // end handler
    IL_00eb:  ldc.i4.1
    IL_00ec:  newarr     HelloWorld.A
    IL_00f1:  stloc.s    V_9
    IL_00f3:  ldloc.s    V_9
    IL_00f5:  stloc.3
    .try
    {
      IL_00f6:  nop
      IL_00f7:  ldloc.3
      IL_00f8:  ldc.i4.0
      IL_00f9:  ldloc.2
      IL_00fa:  stelem.ref
      IL_00fb:  nop
      IL_00fc:  leave.s    IL_010e

    }  // end .try
    catch [System.Runtime]System.ArrayTypeMismatchException 
    {
      IL_00fe:  pop
      IL_00ff:  nop
      IL_0100:  ldstr      "array type"
      IL_0105:  call       void [System.Console]System.Console::WriteLine(string)
      IL_010a:  nop
      IL_010b:  nop
      IL_010c:  leave.s    IL_010e

    }  // end handler
    IL_010e:  nop
    .try
    {
      IL_010f:  nop
      IL_0110:  ldnull
      IL_0111:  throw

    }  // end .try
    catch [System.Runtime]System.NullReferenceException 
    {
      IL_0112:  pop
      IL_0113:  nop
      IL_0114:  ldstr      "throw null"
      IL_0119:  call       void [System.Console]System.Console::WriteLine(string)
      IL_011e:  nop
      IL_011f:  nop
      IL_0120:  leave.s    IL_0122

    }  // end handler
    IL_0122:  ldc.i4.m1
    IL_0123:  stloc.s    V_4
    .try
    {
      IL_0125:  nop
      IL_0126:  ldloc.s    V_4
      IL_0128:  newarr     [System.Runtime]System.Int32
      IL_012d:  stloc.1
      IL_012e:  nop
      IL_012f:  leave.s    IL_0141

    }  // end .try
    catch [System.Runtime]System.OverflowException 
    {
      IL_0131:  pop
      IL_0132:  nop
      IL_0133:  ldstr      "negative length"
      IL_0138:  call       void [System.Console]System.Console::WriteLine(string)
      IL_013d:  nop
      IL_013e:  nop
      IL_013f:  leave.s    IL_0141

    }  // end handler
    IL_0141:  ldnull
    IL_0142:  stloc.s    V_5
    .try
    {
      IL_0144:  nop
      IL_0145:  ldloc.s    V_5
      IL_0147:  unbox.any  [System.Runtime]System.Int32
      IL_014c:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_0151:  nop
      IL_0152:  nop
      IL_0153:  leave.s    IL_0165

    }  // end .try
    catch [System.Runtime]System.NullReferenceException 
    {
      IL_0155:  pop
      IL_0156:  nop
      IL_0157:  ldstr      "unbox null"
      IL_015c:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0161:  nop
      IL_0162:  nop
      IL_0163:  leave.s    IL_0165

    }  // end handler
    IL_0165:  ldstr      "string"
    IL_016a:  stloc.s    V_5
    .try
    {
      IL_016c:  nop
      IL_016d:  ldloc.s    V_5
      IL_016f:  unbox.any  [System.Runtime]System.Int32
      IL_0174:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_0179:  nop
      IL_017a:  nop
      IL_017b:  leave.s    IL_018d

    }  // end .try
    catch [System.Runtime]System.InvalidCastException 
    {
      IL_017d:  pop
      IL_017e:  nop
      IL_017f:  ldstr      "unbox type"
      IL_0184:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0189:  nop
      IL_018a:  nop
      IL_018b:  leave.s    IL_018d

    }  // end handler
    IL_018d:  ldc.i4     0x80000000
    IL_0192:  stloc.s    V_6
    .try
    {
      IL_0194:  nop
      IL_0195:  ldloc.s    V_6
      IL_0197:  ldloc.s    V_4
      IL_0199:  div
      IL_019a:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_019f:  nop
      IL_01a0:  nop
      IL_01a1:  leave.s    IL_01b3

    }  // end .try
    catch [System.Runtime]System.OverflowException 
    {
      IL_01a3:  pop
      IL_01a4:  nop
      IL_01a5:  ldstr      "divide overflow"
      IL_01aa:  call       void [System.Console]System.Console::WriteLine(string)
      IL_01af:  nop
      IL_01b0:  nop
      IL_01b1:  leave.s    IL_01b3

    }  // end handler
    IL_01b3:  nop
    .try
    {
      IL_01b4:  nop
      IL_01b5:  ldloc.s    V_6
      IL_01b7:  ldloc.s    V_4
      IL_01b9:  rem
      IL_01ba:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_01bf:  nop
      IL_01c0:  nop
      IL_01c1:  leave.s    IL_01d3

    }  // end .try
    catch [System.Runtime]System.OverflowException 
    {
      IL_01c3:  pop
      IL_01c4:  nop
      IL_01c5:  ldstr      "remainder overflow"
      IL_01ca:  call       void [System.Console]System.Console::WriteLine(string)
      IL_01cf:  nop
      IL_01d0:  nop
      IL_01d1:  leave.s    IL_01d3

    }  // end handler
    IL_01d3:  ldc.i8     0x8000000000000000
    IL_01dc:  stloc.s    V_7
    .try
    {
      IL_01de:  nop
      IL_01df:  ldloc.s    V_7
      IL_01e1:  ldloc.s    V_4
      IL_01e3:  conv.i8
      IL_01e4:  div
      IL_01e5:  call       void [System.Console]System.Console::WriteLine(int64)
      IL_01ea:  nop
      IL_01eb:  nop
      IL_01ec:  leave.s    IL_01fe

    }  // end .try
    catch [System.Runtime]System.OverflowException 
    {
      IL_01ee:  pop
      IL_01ef:  nop
      IL_01f0:  ldstr      "long divide overflow"
      IL_01f5:  call       void [System.Console]System.Console::WriteLine(string)
      IL_01fa:  nop
      IL_01fb:  nop
      IL_01fc:  leave.s    IL_01fe

    }  // end handler
    IL_01fe:  nop
    .try
    {
      IL_01ff:  nop
      IL_0200:  ldloc.s    V_7
      IL_0202:  ldloc.s    V_4
      IL_0204:  conv.i8
      IL_0205:  rem
      IL_0206:  call       void [System.Console]System.Console::WriteLine(int64)
      IL_020b:  nop
      IL_020c:  nop
      IL_020d:  leave.s    IL_021f

    }  // end .try
    catch [System.Runtime]System.OverflowException 
    {
      IL_020f:  pop
      IL_0210:  nop
      IL_0211:  ldstr      "long remainder overflow"
      IL_0216:  call       void [System.Console]System.Console::WriteLine(string)
      IL_021b:  nop
      IL_021c:  nop
      IL_021d:  leave.s    IL_021f

    }  // end handler
    IL_021f:  ldc.i4.0
    IL_0220:  stloc.s    V_8
    IL_0222:  ldc.i4.0
    IL_0223:  stloc.s    V_10
    IL_0225:  br         IL_02c6

    IL_022a:  nop
    .try
    {
      IL_022b:  nop
      IL_022c:  ldc.i4.1
      IL_022d:  call       int32 HelloWorld.Program::Zero()
      IL_0232:  div
      IL_0233:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_0238:  nop
      IL_0239:  nop
      IL_023a:  leave.s    IL_0247

    }  // end .try
    catch [System.Runtime]System.DivideByZeroException 
    {
      IL_023c:  pop
      IL_023d:  nop
      IL_023e:  ldloc.s    V_8
      IL_0240:  ldc.i4.1
      IL_0241:  add
      IL_0242:  stloc.s    V_8
      IL_0244:  nop
      IL_0245:  leave.s    IL_0247

    }  // end handler
    IL_0247:  nop
    .try
    {
      IL_0248:  nop
      IL_0249:  ldloc.0
      IL_024a:  callvirt   instance int32 HelloWorld.A::Read()
      IL_024f:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_0254:  nop
      IL_0255:  nop
      IL_0256:  leave.s    IL_0263

    }  // end .try
    catch [System.Runtime]System.NullReferenceException 
    {
      IL_0258:  pop
      IL_0259:  nop
      IL_025a:  ldloc.s    V_8
      IL_025c:  ldc.i4.1
      IL_025d:  add
      IL_025e:  stloc.s    V_8
      IL_0260:  nop
      IL_0261:  leave.s    IL_0263

    }  // end handler
    IL_0263:  nop
    .try
    {
      IL_0264:  nop
      IL_0265:  ldloc.1
      IL_0266:  ldc.i4.1
      IL_0267:  ldelem.i4
      IL_0268:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_026d:  nop
      IL_026e:  nop
      IL_026f:  leave.s    IL_027c

    }  // end .try
    catch [System.Runtime]System.IndexOutOfRangeException 
    {
      IL_0271:  pop
      IL_0272:  nop
      IL_0273:  ldloc.s    V_8
      IL_0275:  ldc.i4.1
      IL_0276:  add
      IL_0277:  stloc.s    V_8
      IL_0279:  nop
      IL_027a:  leave.s    IL_027c

    }  // end handler
    IL_027c:  nop
    .try
    {
      IL_027d:  nop
      IL_027e:  ldloc.2
      IL_027f:  castclass  HelloWorld.A
      IL_0284:  stloc.0
      IL_0285:  nop
      IL_0286:  leave.s    IL_0293

    }  // end .try
    catch [System.Runtime]System.InvalidCastException 
    {
      IL_0288:  pop
      IL_0289:  nop
      IL_028a:  ldloc.s    V_8
      IL_028c:  ldc.i4.1
      IL_028d:  add
      IL_028e:  stloc.s    V_8
      IL_0290:  nop
      IL_0291:  leave.s    IL_0293

    }  // end handler
    IL_0293:  nop
    .try
    {
      IL_0294:  nop
      IL_0295:  ldloc.3
      IL_0296:  ldc.i4.0
      IL_0297:  ldloc.2
      IL_0298:  stelem.ref
      IL_0299:  nop
      IL_029a:  leave.s    IL_02a7

    }  // end .try
    catch [System.Runtime]System.ArrayTypeMismatchException 
    {
      IL_029c:  pop
      IL_029d:  nop
      IL_029e:  ldloc.s    V_8
      IL_02a0:  ldc.i4.1
      IL_02a1:  add
      IL_02a2:  stloc.s    V_8
      IL_02a4:  nop
      IL_02a5:  leave.s    IL_02a7

    }  // end handler
    IL_02a7:  nop
    .try
    {
      IL_02a8:  nop
      IL_02a9:  ldloc.s    V_4
      IL_02ab:  newarr     [System.Runtime]System.Int32
      IL_02b0:  stloc.1
      IL_02b1:  nop
      IL_02b2:  leave.s    IL_02bf

    }  // end .try
    catch [System.Runtime]System.OverflowException 
    {
      IL_02b4:  pop
      IL_02b5:  nop
      IL_02b6:  ldloc.s    V_8
      IL_02b8:  ldc.i4.1
      IL_02b9:  add
      IL_02ba:  stloc.s    V_8
      IL_02bc:  nop
      IL_02bd:  leave.s    IL_02bf

    }  // end handler
    IL_02bf:  nop
    IL_02c0:  ldloc.s    V_10
    IL_02c2:  ldc.i4.1
    IL_02c3:  add
    IL_02c4:  stloc.s    V_10
    IL_02c6:  ldloc.s    V_10
    IL_02c8:  ldc.i4     0x186a0
    IL_02cd:  clt
    IL_02cf:  stloc.s    V_11
    IL_02d1:  ldloc.s    V_11
    IL_02d3:  brtrue     IL_022a

    IL_02d8:  ldloc.s    V_8
    IL_02da:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_02df:  nop
    IL_02e0:  ret
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
