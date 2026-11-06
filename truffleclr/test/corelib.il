
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
// MVID: {79628079-6b7c-439f-8930-dd36db9609d9}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x1025fc000


// =============== CLASS MEMBERS DECLARATION ===================

.class private sequential ansi sealed beforefieldinit HelloWorld.Pair
       extends [System.Runtime]System.ValueType
{
  .field public int32 X
  .field public string Text
} // end of class HelloWorld.Pair

.class private sequential ansi sealed beforefieldinit HelloWorld.Nested
       extends [System.Runtime]System.ValueType
{
  .field public valuetype HelloWorld.Pair P
  .field public float64 D
} // end of class HelloWorld.Nested

.class private sequential ansi sealed beforefieldinit HelloWorld.Modulo
       extends [System.Runtime]System.ValueType
{
  .field public int32 Value
  .method public hidebysig virtual instance bool 
          Equals(object other) cil managed
  {
    // Code size       42 (0x2a)
    .maxstack  3
    .locals init (bool V_0)
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  isinst     HelloWorld.Modulo
    IL_0007:  brfalse.s  IL_0024

    IL_0009:  ldarg.0
    IL_000a:  ldfld      int32 HelloWorld.Modulo::Value
    IL_000f:  ldc.i4.s   10
    IL_0011:  rem
    IL_0012:  ldarg.1
    IL_0013:  unbox      HelloWorld.Modulo
    IL_0018:  ldfld      int32 HelloWorld.Modulo::Value
    IL_001d:  ldc.i4.s   10
    IL_001f:  rem
    IL_0020:  ceq
    IL_0022:  br.s       IL_0025

    IL_0024:  ldc.i4.0
    IL_0025:  stloc.0
    IL_0026:  br.s       IL_0028

    IL_0028:  ldloc.0
    IL_0029:  ret
  } // end of method Modulo::Equals

  .method public hidebysig virtual instance int32 
          GetHashCode() cil managed
  {
    // Code size       15 (0xf)
    .maxstack  2
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      int32 HelloWorld.Modulo::Value
    IL_0007:  ldc.i4.s   10
    IL_0009:  rem
    IL_000a:  stloc.0
    IL_000b:  br.s       IL_000d

    IL_000d:  ldloc.0
    IL_000e:  ret
  } // end of method Modulo::GetHashCode

} // end of class HelloWorld.Modulo

.class private sequential ansi sealed beforefieldinit HelloWorld.Wrapper
       extends [System.Runtime]System.ValueType
{
  .field public valuetype HelloWorld.Modulo Value
} // end of class HelloWorld.Wrapper

.class private auto ansi beforefieldinit HelloWorld.NullText
       extends [System.Runtime]System.Object
{
  .method public hidebysig virtual instance string 
          ToString() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (string V_0)
    IL_0000:  nop
    IL_0001:  ldnull
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method NullText::ToString

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method NullText::.ctor

} // end of class HelloWorld.NullText

.class private auto ansi beforefieldinit HelloWorld.Named
       extends [System.Runtime]System.Object
{
  .method public hidebysig virtual instance string 
          ToString() cil managed
  {
    // Code size       11 (0xb)
    .maxstack  1
    .locals init (string V_0)
    IL_0000:  nop
    IL_0001:  ldstr      "named"
    IL_0006:  stloc.0
    IL_0007:  br.s       IL_0009

    IL_0009:  ldloc.0
    IL_000a:  ret
  } // end of method Named::ToString

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Named::.ctor

} // end of class HelloWorld.Named

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static void  Main() cil managed
  {
    .entrypoint
    // Code size       1848 (0x738)
    .maxstack  4
    .locals init (class [System.Runtime]System.Array V_0,
             class [System.Runtime]System.Array V_1,
             valuetype HelloWorld.Wrapper V_2,
             valuetype HelloWorld.Wrapper V_3,
             object V_4,
             object V_5,
             valuetype HelloWorld.Pair V_6,
             valuetype HelloWorld.Pair V_7,
             valuetype HelloWorld.Nested V_8,
             valuetype HelloWorld.Nested V_9,
             int32 V_10,
             uint8 V_11,
             valuetype HelloWorld.Wrapper V_12,
             valuetype HelloWorld.Modulo V_13,
             valuetype HelloWorld.Pair V_14,
             valuetype HelloWorld.Nested V_15)
    IL_0000:  nop
    IL_0001:  ldc.i4.3
    IL_0002:  newarr     [System.Runtime]System.Int32
    IL_0007:  stloc.0
    IL_0008:  ldloc.0
    IL_0009:  callvirt   instance int32 [System.Runtime]System.Array::get_Length()
    IL_000e:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0013:  nop
    IL_0014:  ldc.i4.4
    IL_0015:  newarr     HelloWorld.Named
    IL_001a:  stloc.1
    IL_001b:  ldloc.1
    IL_001c:  callvirt   instance int32 [System.Runtime]System.Array::get_Length()
    IL_0021:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0026:  nop
    IL_0027:  ldloca.s   V_12
    IL_0029:  initobj    HelloWorld.Wrapper
    IL_002f:  ldloca.s   V_12
    IL_0031:  ldloca.s   V_13
    IL_0033:  initobj    HelloWorld.Modulo
    IL_0039:  ldloca.s   V_13
    IL_003b:  ldc.i4.1
    IL_003c:  stfld      int32 HelloWorld.Modulo::Value
    IL_0041:  ldloc.s    V_13
    IL_0043:  stfld      valuetype HelloWorld.Modulo HelloWorld.Wrapper::Value
    IL_0048:  ldloc.s    V_12
    IL_004a:  stloc.2
    IL_004b:  ldloca.s   V_12
    IL_004d:  initobj    HelloWorld.Wrapper
    IL_0053:  ldloca.s   V_12
    IL_0055:  ldloca.s   V_13
    IL_0057:  initobj    HelloWorld.Modulo
    IL_005d:  ldloca.s   V_13
    IL_005f:  ldc.i4.s   11
    IL_0061:  stfld      int32 HelloWorld.Modulo::Value
    IL_0066:  ldloc.s    V_13
    IL_0068:  stfld      valuetype HelloWorld.Modulo HelloWorld.Wrapper::Value
    IL_006d:  ldloc.s    V_12
    IL_006f:  stloc.3
    IL_0070:  ldloca.s   V_2
    IL_0072:  ldloc.3
    IL_0073:  box        HelloWorld.Wrapper
    IL_0078:  constrained. HelloWorld.Wrapper
    IL_007e:  callvirt   instance bool [System.Runtime]System.Object::Equals(object)
    IL_0083:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_0088:  nop
    IL_0089:  ldloca.s   V_2
    IL_008b:  constrained. HelloWorld.Wrapper
    IL_0091:  callvirt   instance int32 [System.Runtime]System.Object::GetHashCode()
    IL_0096:  ldloca.s   V_3
    IL_0098:  constrained. HelloWorld.Wrapper
    IL_009e:  callvirt   instance int32 [System.Runtime]System.Object::GetHashCode()
    IL_00a3:  ceq
    IL_00a5:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_00aa:  nop
    IL_00ab:  newobj     instance void [System.Runtime]System.Object::.ctor()
    IL_00b0:  stloc.s    V_4
    IL_00b2:  newobj     instance void [System.Runtime]System.Object::.ctor()
    IL_00b7:  stloc.s    V_5
    IL_00b9:  ldloc.s    V_4
    IL_00bb:  ldloc.s    V_4
    IL_00bd:  callvirt   instance bool [System.Runtime]System.Object::Equals(object)
    IL_00c2:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_00c7:  nop
    IL_00c8:  ldloc.s    V_4
    IL_00ca:  ldloc.s    V_5
    IL_00cc:  callvirt   instance bool [System.Runtime]System.Object::Equals(object)
    IL_00d1:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_00d6:  nop
    IL_00d7:  ldnull
    IL_00d8:  ldnull
    IL_00d9:  call       bool [System.Runtime]System.Object::Equals(object,
                                                                    object)
    IL_00de:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_00e3:  nop
    IL_00e4:  ldloc.s    V_4
    IL_00e6:  ldnull
    IL_00e7:  call       bool [System.Runtime]System.Object::Equals(object,
                                                                    object)
    IL_00ec:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_00f1:  nop
    IL_00f2:  ldnull
    IL_00f3:  ldloc.s    V_4
    IL_00f5:  call       bool [System.Runtime]System.Object::Equals(object,
                                                                    object)
    IL_00fa:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_00ff:  nop
    IL_0100:  ldloc.s    V_4
    IL_0102:  ldloc.s    V_4
    IL_0104:  call       bool [System.Runtime]System.Object::Equals(object,
                                                                    object)
    IL_0109:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_010e:  nop
    IL_010f:  ldloc.s    V_4
    IL_0111:  ldloc.s    V_5
    IL_0113:  ceq
    IL_0115:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_011a:  nop
    IL_011b:  ldloc.s    V_4
    IL_011d:  ldloc.s    V_4
    IL_011f:  ceq
    IL_0121:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_0126:  nop
    IL_0127:  ldloc.s    V_4
    IL_0129:  callvirt   instance int32 [System.Runtime]System.Object::GetHashCode()
    IL_012e:  ldloc.s    V_4
    IL_0130:  callvirt   instance int32 [System.Runtime]System.Object::GetHashCode()
    IL_0135:  ceq
    IL_0137:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_013c:  nop
    IL_013d:  ldloc.s    V_4
    IL_013f:  callvirt   instance string [System.Runtime]System.Object::ToString()
    IL_0144:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0149:  nop
    IL_014a:  newobj     instance void HelloWorld.Program::.ctor()
    IL_014f:  callvirt   instance string [System.Runtime]System.Object::ToString()
    IL_0154:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0159:  nop
    IL_015a:  ldloca.s   V_14
    IL_015c:  initobj    HelloWorld.Pair
    IL_0162:  ldloca.s   V_14
    IL_0164:  ldc.i4.3
    IL_0165:  stfld      int32 HelloWorld.Pair::X
    IL_016a:  ldloca.s   V_14
    IL_016c:  ldstr      "abc"
    IL_0171:  stfld      string HelloWorld.Pair::Text
    IL_0176:  ldloc.s    V_14
    IL_0178:  stloc.s    V_6
    IL_017a:  ldloca.s   V_14
    IL_017c:  initobj    HelloWorld.Pair
    IL_0182:  ldloca.s   V_14
    IL_0184:  ldc.i4.3
    IL_0185:  stfld      int32 HelloWorld.Pair::X
    IL_018a:  ldloca.s   V_14
    IL_018c:  ldstr      "abc"
    IL_0191:  stfld      string HelloWorld.Pair::Text
    IL_0196:  ldloc.s    V_14
    IL_0198:  stloc.s    V_7
    IL_019a:  ldloca.s   V_6
    IL_019c:  ldloc.s    V_7
    IL_019e:  box        HelloWorld.Pair
    IL_01a3:  constrained. HelloWorld.Pair
    IL_01a9:  callvirt   instance bool [System.Runtime]System.Object::Equals(object)
    IL_01ae:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_01b3:  nop
    IL_01b4:  ldloca.s   V_6
    IL_01b6:  constrained. HelloWorld.Pair
    IL_01bc:  callvirt   instance int32 [System.Runtime]System.Object::GetHashCode()
    IL_01c1:  ldloca.s   V_7
    IL_01c3:  constrained. HelloWorld.Pair
    IL_01c9:  callvirt   instance int32 [System.Runtime]System.Object::GetHashCode()
    IL_01ce:  ceq
    IL_01d0:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_01d5:  nop
    IL_01d6:  ldloca.s   V_7
    IL_01d8:  ldflda     int32 HelloWorld.Pair::X
    IL_01dd:  dup
    IL_01de:  ldind.i4
    IL_01df:  ldc.i4.1
    IL_01e0:  add
    IL_01e1:  stind.i4
    IL_01e2:  ldloca.s   V_6
    IL_01e4:  ldloc.s    V_7
    IL_01e6:  box        HelloWorld.Pair
    IL_01eb:  constrained. HelloWorld.Pair
    IL_01f1:  callvirt   instance bool [System.Runtime]System.Object::Equals(object)
    IL_01f6:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_01fb:  nop
    IL_01fc:  ldloca.s   V_6
    IL_01fe:  ldnull
    IL_01ff:  constrained. HelloWorld.Pair
    IL_0205:  callvirt   instance bool [System.Runtime]System.Object::Equals(object)
    IL_020a:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_020f:  nop
    IL_0210:  ldloca.s   V_15
    IL_0212:  initobj    HelloWorld.Nested
    IL_0218:  ldloca.s   V_15
    IL_021a:  ldloc.s    V_6
    IL_021c:  stfld      valuetype HelloWorld.Pair HelloWorld.Nested::P
    IL_0221:  ldloca.s   V_15
    IL_0223:  ldc.r8     -0.0
    IL_022c:  stfld      float64 HelloWorld.Nested::D
    IL_0231:  ldloc.s    V_15
    IL_0233:  stloc.s    V_8
    IL_0235:  ldloca.s   V_15
    IL_0237:  initobj    HelloWorld.Nested
    IL_023d:  ldloca.s   V_15
    IL_023f:  ldloc.s    V_6
    IL_0241:  stfld      valuetype HelloWorld.Pair HelloWorld.Nested::P
    IL_0246:  ldloca.s   V_15
    IL_0248:  ldc.r8     0.0
    IL_0251:  stfld      float64 HelloWorld.Nested::D
    IL_0256:  ldloc.s    V_15
    IL_0258:  stloc.s    V_9
    IL_025a:  ldloca.s   V_8
    IL_025c:  ldloc.s    V_9
    IL_025e:  box        HelloWorld.Nested
    IL_0263:  constrained. HelloWorld.Nested
    IL_0269:  callvirt   instance bool [System.Runtime]System.Object::Equals(object)
    IL_026e:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_0273:  nop
    IL_0274:  ldloca.s   V_8
    IL_0276:  constrained. HelloWorld.Nested
    IL_027c:  callvirt   instance int32 [System.Runtime]System.Object::GetHashCode()
    IL_0281:  ldloca.s   V_9
    IL_0283:  constrained. HelloWorld.Nested
    IL_0289:  callvirt   instance int32 [System.Runtime]System.Object::GetHashCode()
    IL_028e:  ceq
    IL_0290:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_0295:  nop
    IL_0296:  ldloca.s   V_6
    IL_0298:  constrained. HelloWorld.Pair
    IL_029e:  callvirt   instance string [System.Runtime]System.Object::ToString()
    IL_02a3:  call       void [System.Console]System.Console::WriteLine(string)
    IL_02a8:  nop
    IL_02a9:  newobj     instance void HelloWorld.NullText::.ctor()
    IL_02ae:  call       string [System.Runtime]System.String::Concat(object)
    IL_02b3:  ldnull
    IL_02b4:  ceq
    IL_02b6:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_02bb:  nop
    IL_02bc:  ldc.i4.4
    IL_02bd:  newarr     [System.Runtime]System.String
    IL_02c2:  dup
    IL_02c3:  ldc.i4.0
    IL_02c4:  ldstr      "a"
    IL_02c9:  stelem.ref
    IL_02ca:  dup
    IL_02cb:  ldc.i4.2
    IL_02cc:  ldstr      "b"
    IL_02d1:  stelem.ref
    IL_02d2:  dup
    IL_02d3:  ldc.i4.3
    IL_02d4:  ldstr      "c"
    IL_02d9:  stelem.ref
    IL_02da:  call       string [System.Runtime]System.String::Concat(string[])
    IL_02df:  call       void [System.Console]System.Console::WriteLine(string)
    IL_02e4:  nop
    IL_02e5:  ldstr      "a"
    IL_02ea:  ldstr      "b"
    IL_02ef:  call       string [System.Runtime]System.String::Concat(string,
                                                                      string)
    IL_02f4:  call       void [System.Console]System.Console::WriteLine(string)
    IL_02f9:  nop
    IL_02fa:  ldstr      "a"
    IL_02ff:  ldstr      "b"
    IL_0304:  ldstr      "c"
    IL_0309:  call       string [System.Runtime]System.String::Concat(string,
                                                                      string,
                                                                      string)
    IL_030e:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0313:  nop
    IL_0314:  ldstr      "a"
    IL_0319:  ldstr      "b"
    IL_031e:  ldstr      "c"
    IL_0323:  ldstr      "d"
    IL_0328:  call       string [System.Runtime]System.String::Concat(string,
                                                                      string,
                                                                      string,
                                                                      string)
    IL_032d:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0332:  nop
    IL_0333:  newobj     instance void HelloWorld.Named::.ctor()
    IL_0338:  ldnull
    IL_0339:  ldc.i4.s   12
    IL_033b:  box        [System.Runtime]System.Int32
    IL_0340:  call       string [System.Runtime]System.String::Concat(object,
                                                                      object,
                                                                      object)
    IL_0345:  call       void [System.Console]System.Console::WriteLine(string)
    IL_034a:  nop
    IL_034b:  ldc.i4.3
    IL_034c:  newarr     [System.Runtime]System.Object
    IL_0351:  dup
    IL_0352:  ldc.i4.0
    IL_0353:  newobj     instance void HelloWorld.Named::.ctor()
    IL_0358:  stelem.ref
    IL_0359:  dup
    IL_035a:  ldc.i4.2
    IL_035b:  ldc.i4.s   13
    IL_035d:  box        [System.Runtime]System.Int32
    IL_0362:  stelem.ref
    IL_0363:  call       string [System.Runtime]System.String::Concat(object[])
    IL_0368:  call       void [System.Console]System.Console::WriteLine(string)
    IL_036d:  nop
    .try
    {
      IL_036e:  nop
      IL_036f:  ldnull
      IL_0370:  call       string [System.Runtime]System.String::Concat(string[])
      IL_0375:  pop
      IL_0376:  nop
      IL_0377:  leave.s    IL_0389

    }  // end .try
    catch [System.Runtime]System.ArgumentNullException 
    {
      IL_0379:  pop
      IL_037a:  nop
      IL_037b:  ldstr      "null concat"
      IL_0380:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0385:  nop
      IL_0386:  nop
      IL_0387:  leave.s    IL_0389

    }  // end handler
    IL_0389:  ldc.i4.5
    IL_038a:  stloc.s    V_10
    IL_038c:  ldc.i4.7
    IL_038d:  stloc.s    V_11
    IL_038f:  ldloca.s   V_10
    IL_0391:  ldc.i4.4
    IL_0392:  box        [System.Runtime]System.Int32
    IL_0397:  call       instance int32 [System.Runtime]System.Int32::CompareTo(object)
    IL_039c:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_03a1:  nop
    IL_03a2:  ldloca.s   V_10
    IL_03a4:  ldnull
    IL_03a5:  call       instance int32 [System.Runtime]System.Int32::CompareTo(object)
    IL_03aa:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_03af:  nop
    IL_03b0:  ldloca.s   V_11
    IL_03b2:  ldc.i4.7
    IL_03b3:  box        [System.Runtime]System.Byte
    IL_03b8:  call       instance int32 [System.Runtime]System.Byte::CompareTo(object)
    IL_03bd:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_03c2:  nop
    IL_03c3:  ldloca.s   V_11
    IL_03c5:  ldnull
    IL_03c6:  call       instance int32 [System.Runtime]System.Byte::CompareTo(object)
    IL_03cb:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_03d0:  nop
    .try
    {
      IL_03d1:  nop
      IL_03d2:  ldloca.s   V_10
      IL_03d4:  ldstr      "wrong"
      IL_03d9:  call       instance int32 [System.Runtime]System.Int32::CompareTo(object)
      IL_03de:  pop
      IL_03df:  nop
      IL_03e0:  leave.s    IL_03f2

    }  // end .try
    catch [System.Runtime]System.ArgumentException 
    {
      IL_03e2:  pop
      IL_03e3:  nop
      IL_03e4:  ldstr      "int wrong type"
      IL_03e9:  call       void [System.Console]System.Console::WriteLine(string)
      IL_03ee:  nop
      IL_03ef:  nop
      IL_03f0:  leave.s    IL_03f2

    }  // end handler
    IL_03f2:  nop
    .try
    {
      IL_03f3:  nop
      IL_03f4:  ldloca.s   V_11
      IL_03f6:  ldstr      "wrong"
      IL_03fb:  call       instance int32 [System.Runtime]System.Byte::CompareTo(object)
      IL_0400:  pop
      IL_0401:  nop
      IL_0402:  leave.s    IL_0414

    }  // end .try
    catch [System.Runtime]System.ArgumentException 
    {
      IL_0404:  pop
      IL_0405:  nop
      IL_0406:  ldstr      "byte wrong type"
      IL_040b:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0410:  nop
      IL_0411:  nop
      IL_0412:  leave.s    IL_0414

    }  // end handler
    IL_0414:  ldc.i4.0
    IL_0415:  call       char [System.Runtime]System.Convert::ToChar(int32)
    IL_041a:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_041f:  nop
    IL_0420:  ldc.i4     0xffff
    IL_0425:  call       char [System.Runtime]System.Convert::ToChar(int32)
    IL_042a:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_042f:  nop
    .try
    {
      IL_0430:  nop
      IL_0431:  ldc.i4.m1
      IL_0432:  call       char [System.Runtime]System.Convert::ToChar(int32)
      IL_0437:  pop
      IL_0438:  nop
      IL_0439:  leave.s    IL_044b

    }  // end .try
    catch [System.Runtime]System.OverflowException 
    {
      IL_043b:  pop
      IL_043c:  nop
      IL_043d:  ldstr      "char low"
      IL_0442:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0447:  nop
      IL_0448:  nop
      IL_0449:  leave.s    IL_044b

    }  // end handler
    IL_044b:  nop
    .try
    {
      IL_044c:  nop
      IL_044d:  ldc.i4     0x10000
      IL_0452:  call       char [System.Runtime]System.Convert::ToChar(int32)
      IL_0457:  pop
      IL_0458:  nop
      IL_0459:  leave.s    IL_046b

    }  // end .try
    catch [System.Runtime]System.OverflowException 
    {
      IL_045b:  pop
      IL_045c:  nop
      IL_045d:  ldstr      "char high"
      IL_0462:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0467:  nop
      IL_0468:  nop
      IL_0469:  leave.s    IL_046b

    }  // end handler
    IL_046b:  ldc.i8     0xfffffee08e04fb35
    IL_0474:  call       void [System.Console]System.Console::Write(int64)
    IL_0479:  nop
    IL_047a:  ldc.i4.s   124
    IL_047c:  call       void [System.Console]System.Console::Write(char)
    IL_0481:  nop
    IL_0482:  ldc.i4.1
    IL_0483:  call       void [System.Console]System.Console::Write(bool)
    IL_0488:  nop
    IL_0489:  ldc.i4.s   124
    IL_048b:  call       void [System.Console]System.Console::Write(char)
    IL_0490:  nop
    IL_0491:  ldc.r4     1.5
    IL_0496:  call       void [System.Console]System.Console::Write(float32)
    IL_049b:  nop
    IL_049c:  ldc.i4.s   124
    IL_049e:  call       void [System.Console]System.Console::Write(char)
    IL_04a3:  nop
    IL_04a4:  ldc.i4.m1
    IL_04a5:  call       void [System.Console]System.Console::Write(uint32)
    IL_04aa:  nop
    IL_04ab:  ldc.i4.s   124
    IL_04ad:  call       void [System.Console]System.Console::Write(char)
    IL_04b2:  nop
    IL_04b3:  ldc.i4.m1
    IL_04b4:  conv.i8
    IL_04b5:  call       void [System.Console]System.Console::Write(uint64)
    IL_04ba:  nop
    IL_04bb:  ldc.i4.s   124
    IL_04bd:  call       void [System.Console]System.Console::Write(char)
    IL_04c2:  nop
    IL_04c3:  newobj     instance void HelloWorld.Named::.ctor()
    IL_04c8:  call       void [System.Console]System.Console::Write(object)
    IL_04cd:  nop
    IL_04ce:  call       void [System.Console]System.Console::WriteLine()
    IL_04d3:  nop
    IL_04d4:  ldc.i8     0xfffffee08e04fb35
    IL_04dd:  call       void [System.Console]System.Console::WriteLine(int64)
    IL_04e2:  nop
    IL_04e3:  ldc.i4.s   90
    IL_04e5:  call       void [System.Console]System.Console::WriteLine(char)
    IL_04ea:  nop
    IL_04eb:  ldc.i4.0
    IL_04ec:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_04f1:  nop
    IL_04f2:  ldc.r4     1.5
    IL_04f7:  call       void [System.Console]System.Console::WriteLine(float32)
    IL_04fc:  nop
    IL_04fd:  ldc.i4.m1
    IL_04fe:  call       void [System.Console]System.Console::WriteLine(uint32)
    IL_0503:  nop
    IL_0504:  ldc.i4.m1
    IL_0505:  conv.i8
    IL_0506:  call       void [System.Console]System.Console::WriteLine(uint64)
    IL_050b:  nop
    IL_050c:  newobj     instance void HelloWorld.Named::.ctor()
    IL_0511:  call       void [System.Console]System.Console::WriteLine(object)
    IL_0516:  nop
    IL_0517:  ldnull
    IL_0518:  call       void [System.Console]System.Console::Write(object)
    IL_051d:  nop
    IL_051e:  ldnull
    IL_051f:  call       void [System.Console]System.Console::WriteLine(object)
    IL_0524:  nop
    IL_0525:  ldc.i4.s   -5
    IL_0527:  call       int32 [System.Runtime]System.Math::Abs(int32)
    IL_052c:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0531:  nop
    IL_0532:  ldc.i8     0xfffffee08e04fb35
    IL_053b:  call       int64 [System.Runtime]System.Math::Abs(int64)
    IL_0540:  call       void [System.Console]System.Console::WriteLine(int64)
    IL_0545:  nop
    IL_0546:  ldc.r8     -2
    IL_054f:  call       float64 [System.Runtime]System.Math::Abs(float64)
    IL_0554:  conv.i4
    IL_0555:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_055a:  nop
    .try
    {
      IL_055b:  nop
      IL_055c:  ldc.i4     0x80000000
      IL_0561:  call       int32 [System.Runtime]System.Math::Abs(int32)
      IL_0566:  pop
      IL_0567:  nop
      IL_0568:  leave.s    IL_057a

    }  // end .try
    catch [System.Runtime]System.OverflowException 
    {
      IL_056a:  pop
      IL_056b:  nop
      IL_056c:  ldstr      "abs int overflow"
      IL_0571:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0576:  nop
      IL_0577:  nop
      IL_0578:  leave.s    IL_057a

    }  // end handler
    IL_057a:  nop
    .try
    {
      IL_057b:  nop
      IL_057c:  ldc.i8     0x8000000000000000
      IL_0585:  call       int64 [System.Runtime]System.Math::Abs(int64)
      IL_058a:  pop
      IL_058b:  nop
      IL_058c:  leave.s    IL_059e

    }  // end .try
    catch [System.Runtime]System.OverflowException 
    {
      IL_058e:  pop
      IL_058f:  nop
      IL_0590:  ldstr      "abs long overflow"
      IL_0595:  call       void [System.Console]System.Console::WriteLine(string)
      IL_059a:  nop
      IL_059b:  nop
      IL_059c:  leave.s    IL_059e

    }  // end handler
    IL_059e:  ldc.i4.2
    IL_059f:  ldc.i4.7
    IL_05a0:  call       int32 [System.Runtime]System.Math::Min(int32,
                                                                int32)
    IL_05a5:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_05aa:  nop
    IL_05ab:  ldc.i4.2
    IL_05ac:  ldc.i4.7
    IL_05ad:  call       int32 [System.Runtime]System.Math::Max(int32,
                                                                int32)
    IL_05b2:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_05b7:  nop
    IL_05b8:  ldc.i4.s   -8
    IL_05ba:  conv.i8
    IL_05bb:  ldc.i4.7
    IL_05bc:  conv.i8
    IL_05bd:  call       int64 [System.Runtime]System.Math::Min(int64,
                                                                int64)
    IL_05c2:  call       void [System.Console]System.Console::WriteLine(int64)
    IL_05c7:  nop
    IL_05c8:  ldc.i4.s   -8
    IL_05ca:  conv.i8
    IL_05cb:  ldc.i4.7
    IL_05cc:  conv.i8
    IL_05cd:  call       int64 [System.Runtime]System.Math::Max(int64,
                                                                int64)
    IL_05d2:  call       void [System.Console]System.Console::WriteLine(int64)
    IL_05d7:  nop
    IL_05d8:  ldc.r8     2
    IL_05e1:  ldc.r8     7
    IL_05ea:  call       float64 [System.Runtime]System.Math::Min(float64,
                                                                  float64)
    IL_05ef:  conv.i4
    IL_05f0:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_05f5:  nop
    IL_05f6:  ldc.r8     2
    IL_05ff:  ldc.r8     7
    IL_0608:  call       float64 [System.Runtime]System.Math::Max(float64,
                                                                  float64)
    IL_060d:  conv.i4
    IL_060e:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0613:  nop
    IL_0614:  ldc.r8     2.7000000000000002
    IL_061d:  call       float64 [System.Runtime]System.Math::Floor(float64)
    IL_0622:  conv.i4
    IL_0623:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0628:  nop
    IL_0629:  ldc.r8     2.1000000000000001
    IL_0632:  call       float64 [System.Runtime]System.Math::Ceiling(float64)
    IL_0637:  conv.i4
    IL_0638:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_063d:  nop
    IL_063e:  ldc.r8     2.5
    IL_0647:  call       float64 [System.Runtime]System.Math::Round(float64)
    IL_064c:  conv.i4
    IL_064d:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0652:  nop
    IL_0653:  ldc.r8     3.5
    IL_065c:  call       float64 [System.Runtime]System.Math::Round(float64)
    IL_0661:  conv.i4
    IL_0662:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0667:  nop
    IL_0668:  ldc.r8     2
    IL_0671:  ldc.r8     5
    IL_067a:  call       float64 [System.Runtime]System.Math::Pow(float64,
                                                                  float64)
    IL_067f:  conv.i4
    IL_0680:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0685:  nop
    IL_0686:  ldc.r8     81
    IL_068f:  call       float64 [System.Runtime]System.Math::Sqrt(float64)
    IL_0694:  conv.i4
    IL_0695:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_069a:  nop
    IL_069b:  ldc.r8     0.0
    IL_06a4:  call       float64 [System.Runtime]System.Math::Sin(float64)
    IL_06a9:  conv.i4
    IL_06aa:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_06af:  nop
    IL_06b0:  ldc.r8     0.0
    IL_06b9:  call       float64 [System.Runtime]System.Math::Cos(float64)
    IL_06be:  conv.i4
    IL_06bf:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_06c4:  nop
    IL_06c5:  ldc.r8     0.0
    IL_06ce:  call       float64 [System.Runtime]System.Math::Tan(float64)
    IL_06d3:  conv.i4
    IL_06d4:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_06d9:  nop
    IL_06da:  ldc.r8     0.0
    IL_06e3:  call       float64 [System.Runtime]System.Math::Atan(float64)
    IL_06e8:  conv.i4
    IL_06e9:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_06ee:  nop
    IL_06ef:  ldc.r8     0.0
    IL_06f8:  ldc.r8     1
    IL_0701:  call       float64 [System.Runtime]System.Math::Atan2(float64,
                                                                    float64)
    IL_0706:  conv.i4
    IL_0707:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_070c:  nop
    IL_070d:  ldc.r8     0.0
    IL_0716:  call       float64 [System.Runtime]System.Math::Exp(float64)
    IL_071b:  conv.i4
    IL_071c:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0721:  nop
    IL_0722:  ldc.r8     1
    IL_072b:  call       float64 [System.Runtime]System.Math::Log(float64)
    IL_0730:  conv.i4
    IL_0731:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0736:  nop
    IL_0737:  ret
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
