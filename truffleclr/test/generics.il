
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
// MVID: {1e6f40eb-a3c6-43cb-93e4-83ef7953e178}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x10342c000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Growable`1<T>
       extends [System.Runtime]System.Object
{
  .field private !T[] items
  .field public int32 Count
  .method public hidebysig instance void 
          Add(!T 'value') cil managed
  {
    // Code size       119 (0x77)
    .maxstack  4
    .locals init (bool V_0,
             !T[] V_1,
             int32 V_2,
             bool V_3)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      int32 class HelloWorld.Growable`1<!T>::Count
    IL_0007:  ldarg.0
    IL_0008:  ldfld      !0[] class HelloWorld.Growable`1<!T>::items
    IL_000d:  ldlen
    IL_000e:  conv.i4
    IL_000f:  ceq
    IL_0011:  stloc.0
    IL_0012:  ldloc.0
    IL_0013:  brfalse.s  IL_0056

    IL_0015:  nop
    IL_0016:  ldarg.0
    IL_0017:  ldfld      !0[] class HelloWorld.Growable`1<!T>::items
    IL_001c:  ldlen
    IL_001d:  conv.i4
    IL_001e:  ldc.i4.2
    IL_001f:  mul
    IL_0020:  newarr     !T
    IL_0025:  stloc.1
    IL_0026:  ldc.i4.0
    IL_0027:  stloc.2
    IL_0028:  br.s       IL_0041

    IL_002a:  ldloc.1
    IL_002b:  ldloc.2
    IL_002c:  ldarg.0
    IL_002d:  ldfld      !0[] class HelloWorld.Growable`1<!T>::items
    IL_0032:  ldloc.2
    IL_0033:  ldelem     !T
    IL_0038:  stelem     !T
    IL_003d:  ldloc.2
    IL_003e:  ldc.i4.1
    IL_003f:  add
    IL_0040:  stloc.2
    IL_0041:  ldloc.2
    IL_0042:  ldarg.0
    IL_0043:  ldfld      int32 class HelloWorld.Growable`1<!T>::Count
    IL_0048:  clt
    IL_004a:  stloc.3
    IL_004b:  ldloc.3
    IL_004c:  brtrue.s   IL_002a

    IL_004e:  ldarg.0
    IL_004f:  ldloc.1
    IL_0050:  stfld      !0[] class HelloWorld.Growable`1<!T>::items
    IL_0055:  nop
    IL_0056:  ldarg.0
    IL_0057:  ldfld      !0[] class HelloWorld.Growable`1<!T>::items
    IL_005c:  ldarg.0
    IL_005d:  ldfld      int32 class HelloWorld.Growable`1<!T>::Count
    IL_0062:  ldarg.1
    IL_0063:  stelem     !T
    IL_0068:  ldarg.0
    IL_0069:  ldarg.0
    IL_006a:  ldfld      int32 class HelloWorld.Growable`1<!T>::Count
    IL_006f:  ldc.i4.1
    IL_0070:  add
    IL_0071:  stfld      int32 class HelloWorld.Growable`1<!T>::Count
    IL_0076:  ret
  } // end of method Growable`1::Add

  .method public hidebysig instance !T  Get(int32 index) cil managed
  {
    // Code size       18 (0x12)
    .maxstack  2
    .locals init (!T V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      !0[] class HelloWorld.Growable`1<!T>::items
    IL_0007:  ldarg.1
    IL_0008:  ldelem     !T
    IL_000d:  stloc.0
    IL_000e:  br.s       IL_0010

    IL_0010:  ldloc.0
    IL_0011:  ret
  } // end of method Growable`1::Get

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       20 (0x14)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldc.i4.1
    IL_0002:  newarr     !T
    IL_0007:  stfld      !0[] class HelloWorld.Growable`1<!T>::items
    IL_000c:  ldarg.0
    IL_000d:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0012:  nop
    IL_0013:  ret
  } // end of method Growable`1::.ctor

} // end of class HelloWorld.Growable`1

.class private sequential ansi sealed beforefieldinit HelloWorld.Point
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
    IL_0003:  stfld      int32 HelloWorld.Point::X
    IL_0008:  ldarg.0
    IL_0009:  ldarg.2
    IL_000a:  stfld      int32 HelloWorld.Point::Y
    IL_000f:  ret
  } // end of method Point::.ctor

} // end of class HelloWorld.Point

.class private sequential ansi sealed beforefieldinit HelloWorld.Pair`2<T,U>
       extends [System.Runtime]System.ValueType
{
  .field public !T First
  .field public !U Second
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(!T first,
                               !U second) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  stfld      !0 valuetype HelloWorld.Pair`2<!T,!U>::First
    IL_0008:  ldarg.0
    IL_0009:  ldarg.2
    IL_000a:  stfld      !1 valuetype HelloWorld.Pair`2<!T,!U>::Second
    IL_000f:  ret
  } // end of method Pair`2::.ctor

} // end of class HelloWorld.Pair`2

.class interface private abstract auto ansi beforefieldinit HelloWorld.IValue`1<T>
{
  .method public hidebysig newslot abstract virtual 
          instance !T  Get() cil managed
  {
  } // end of method IValue`1::Get

} // end of class HelloWorld.IValue`1

.class interface private abstract auto ansi beforefieldinit HelloWorld.IAccumulator`1<T>
       implements class HelloWorld.IValue`1<!T>
{
  .method public hidebysig newslot abstract virtual 
          instance void  Add(!T 'value') cil managed
  {
  } // end of method IAccumulator`1::Add

} // end of class HelloWorld.IAccumulator`1

.class private auto ansi beforefieldinit HelloWorld.ClassAccumulator
       extends [System.Runtime]System.Object
       implements class HelloWorld.IAccumulator`1<int32>,
                  class HelloWorld.IValue`1<int32>
{
  .field private int32 'value'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(int32 initial) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      int32 HelloWorld.ClassAccumulator::'value'
    IL_000f:  ret
  } // end of method ClassAccumulator::.ctor

  .method public hidebysig newslot virtual final 
          instance int32  Get() cil managed
  {
    // Code size       12 (0xc)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      int32 HelloWorld.ClassAccumulator::'value'
    IL_0007:  stloc.0
    IL_0008:  br.s       IL_000a

    IL_000a:  ldloc.0
    IL_000b:  ret
  } // end of method ClassAccumulator::Get

  .method public hidebysig newslot virtual final 
          instance void  Add(int32 amount) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      int32 HelloWorld.ClassAccumulator::'value'
    IL_0008:  ldarg.1
    IL_0009:  add
    IL_000a:  stfld      int32 HelloWorld.ClassAccumulator::'value'
    IL_000f:  ret
  } // end of method ClassAccumulator::Add

} // end of class HelloWorld.ClassAccumulator

.class private sequential ansi sealed beforefieldinit HelloWorld.StructAccumulator
       extends [System.Runtime]System.ValueType
       implements class HelloWorld.IAccumulator`1<int32>,
                  class HelloWorld.IValue`1<int32>
{
  .field public int32 Value
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(int32 initial) cil managed
  {
    // Code size       9 (0x9)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  stfld      int32 HelloWorld.StructAccumulator::Value
    IL_0008:  ret
  } // end of method StructAccumulator::.ctor

  .method public hidebysig newslot virtual final 
          instance int32  Get() cil managed
  {
    // Code size       12 (0xc)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      int32 HelloWorld.StructAccumulator::Value
    IL_0007:  stloc.0
    IL_0008:  br.s       IL_000a

    IL_000a:  ldloc.0
    IL_000b:  ret
  } // end of method StructAccumulator::Get

  .method public hidebysig newslot virtual final 
          instance void  Add(int32 amount) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      int32 HelloWorld.StructAccumulator::Value
    IL_0008:  ldarg.1
    IL_0009:  add
    IL_000a:  stfld      int32 HelloWorld.StructAccumulator::Value
    IL_000f:  ret
  } // end of method StructAccumulator::Add

} // end of class HelloWorld.StructAccumulator

.class private auto ansi beforefieldinit HelloWorld.ExplicitValue
       extends [System.Runtime]System.Object
       implements class HelloWorld.IValue`1<string>
{
  .method private hidebysig newslot virtual final 
          instance string  'HelloWorld.IValue<System.String>.Get'() cil managed
  {
    .override  method instance !0 class HelloWorld.IValue`1<string>::Get()
    // Code size       11 (0xb)
    .maxstack  1
    .locals init (string V_0)
    IL_0000:  nop
    IL_0001:  ldstr      "explicit-class"
    IL_0006:  stloc.0
    IL_0007:  br.s       IL_0009

    IL_0009:  ldloc.0
    IL_000a:  ret
  } // end of method ExplicitValue::'HelloWorld.IValue<System.String>.Get'

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method ExplicitValue::.ctor

} // end of class HelloWorld.ExplicitValue

.class private sequential ansi sealed beforefieldinit HelloWorld.ExplicitStructValue
       extends [System.Runtime]System.ValueType
       implements class HelloWorld.IValue`1<int32>
{
  .pack 0
  .size 1
  .method private hidebysig newslot virtual final 
          instance int32  'HelloWorld.IValue<System.Int32>.Get'() cil managed
  {
    .override  method instance !0 class HelloWorld.IValue`1<int32>::Get()
    // Code size       8 (0x8)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.s   47
    IL_0003:  stloc.0
    IL_0004:  br.s       IL_0006

    IL_0006:  ldloc.0
    IL_0007:  ret
  } // end of method ExplicitStructValue::'HelloWorld.IValue<System.Int32>.Get'

} // end of class HelloWorld.ExplicitStructValue

.class interface private abstract auto ansi beforefieldinit HelloWorld.IStateMachine
{
  .method public hidebysig newslot abstract virtual 
          instance void  MoveNext() cil managed
  {
  } // end of method IStateMachine::MoveNext

} // end of class HelloWorld.IStateMachine

.class private sequential ansi sealed beforefieldinit HelloWorld.StructMachine
       extends [System.Runtime]System.ValueType
       implements HelloWorld.IStateMachine
{
  .field public int32 State
  .method public hidebysig newslot virtual final 
          instance void  MoveNext() cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      int32 HelloWorld.StructMachine::State
    IL_0008:  ldc.i4.3
    IL_0009:  add
    IL_000a:  stfld      int32 HelloWorld.StructMachine::State
    IL_000f:  ret
  } // end of method StructMachine::MoveNext

} // end of class HelloWorld.StructMachine

.class private auto ansi beforefieldinit HelloWorld.ClassMachine
       extends [System.Runtime]System.Object
       implements HelloWorld.IStateMachine
{
  .field public int32 State
  .method public hidebysig newslot virtual final 
          instance void  MoveNext() cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      int32 HelloWorld.ClassMachine::State
    IL_0008:  ldc.i4.5
    IL_0009:  add
    IL_000a:  stfld      int32 HelloWorld.ClassMachine::State
    IL_000f:  ret
  } // end of method ClassMachine::MoveNext

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method ClassMachine::.ctor

} // end of class HelloWorld.ClassMachine

.class private sequential ansi sealed beforefieldinit HelloWorld.Builder
       extends [System.Runtime]System.ValueType
{
  .pack 0
  .size 1
  .method public hidebysig instance void 
          Start<(HelloWorld.IStateMachine) TSM>(!!TSM& machine) cil managed
  {
    // Code size       15 (0xf)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  constrained. !!TSM
    IL_0008:  callvirt   instance void HelloWorld.IStateMachine::MoveNext()
    IL_000d:  nop
    IL_000e:  ret
  } // end of method Builder::Start

} // end of class HelloWorld.Builder

.class private auto ansi HelloWorld.Slots`1<T>
       extends [System.Runtime]System.Object
{
  .field public static int32 Number
  .field public static !T Value
  .method private hidebysig specialname rtspecialname static 
          void  .cctor() cil managed
  {
    // Code size       30 (0x1e)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldstr      "slots-init"
    IL_0006:  call       void [System.Console]System.Console::WriteLine(string)
    IL_000b:  nop
    IL_000c:  ldc.i4.7
    IL_000d:  stsfld     int32 class HelloWorld.Slots`1<!T>::Number
    IL_0012:  ldsflda    !0 class HelloWorld.Slots`1<!T>::Value
    IL_0017:  initobj    !T
    IL_001d:  ret
  } // end of method Slots`1::.cctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Slots`1::.ctor

} // end of class HelloWorld.Slots`1

.class private auto ansi beforefieldinit HelloWorld.Outer`1<T>
       extends [System.Runtime]System.Object
{
  .class auto ansi nested public beforefieldinit Inner`1<T,U>
         extends [System.Runtime]System.Object
  {
    .field public !T First
    .field public !U Second
    .method public hidebysig specialname rtspecialname 
            instance void  .ctor(!T first,
                                 !U second) cil managed
    {
      // Code size       23 (0x17)
      .maxstack  8
      IL_0000:  ldarg.0
      IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
      IL_0006:  nop
      IL_0007:  nop
      IL_0008:  ldarg.0
      IL_0009:  ldarg.1
      IL_000a:  stfld      !0 class HelloWorld.Outer`1/Inner`1<!T,!U>::First
      IL_000f:  ldarg.0
      IL_0010:  ldarg.2
      IL_0011:  stfld      !1 class HelloWorld.Outer`1/Inner`1<!T,!U>::Second
      IL_0016:  ret
    } // end of method Inner`1::.ctor

  } // end of class Inner`1

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Outer`1::.ctor

} // end of class HelloWorld.Outer`1

.class private auto ansi beforefieldinit HelloWorld.GenericBase`1<T>
       extends [System.Runtime]System.Object
{
  .field private !T 'value'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(!T initial) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      !0 class HelloWorld.GenericBase`1<!T>::'value'
    IL_000f:  ret
  } // end of method GenericBase`1::.ctor

  .method public hidebysig instance !T  Get() cil managed
  {
    // Code size       12 (0xc)
    .maxstack  1
    .locals init (!T V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      !0 class HelloWorld.GenericBase`1<!T>::'value'
    IL_0007:  stloc.0
    IL_0008:  br.s       IL_000a

    IL_000a:  ldloc.0
    IL_000b:  ret
  } // end of method GenericBase`1::Get

  .method public hidebysig instance void 
          Set(!T next) cil managed
  {
    // Code size       9 (0x9)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  stfld      !0 class HelloWorld.GenericBase`1<!T>::'value'
    IL_0008:  ret
  } // end of method GenericBase`1::Set

} // end of class HelloWorld.GenericBase`1

.class private auto ansi beforefieldinit HelloWorld.StringChild
       extends class HelloWorld.GenericBase`1<string>
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string 'value') cil managed
  {
    // Code size       10 (0xa)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void class HelloWorld.GenericBase`1<string>::.ctor(!0)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ret
  } // end of method StringChild::.ctor

} // end of class HelloWorld.StringChild

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static !!T  Identity<T>(!!T 'value') cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (!!T V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method Program::Identity

  .method private hidebysig static !!T  Relay<T>(!!T 'value') cil managed
  {
    // Code size       17 (0x11)
    .maxstack  1
    .locals init (!!T V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  call       !!0 HelloWorld.Program::Identity<!!0>(!!0)
    IL_0007:  call       !!0 HelloWorld.Program::Identity<!!0>(!!0)
    IL_000c:  stloc.0
    IL_000d:  br.s       IL_000f

    IL_000f:  ldloc.0
    IL_0010:  ret
  } // end of method Program::Relay

  .method private hidebysig static !!T  Default<T>() cil managed
  {
    // Code size       15 (0xf)
    .maxstack  1
    .locals init (!!T V_0,
             !!T V_1)
    IL_0000:  nop
    IL_0001:  ldloca.s   V_0
    IL_0003:  initobj    !!T
    IL_0009:  ldloc.0
    IL_000a:  stloc.1
    IL_000b:  br.s       IL_000d

    IL_000d:  ldloc.1
    IL_000e:  ret
  } // end of method Program::Default

  .method private hidebysig static void  Swap<T>(!!T& left,
                                                 !!T& right) cil managed
  {
    // Code size       28 (0x1c)
    .maxstack  2
    .locals init (!!T V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldobj      !!T
    IL_0007:  stloc.0
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  ldobj      !!T
    IL_000f:  stobj      !!T
    IL_0014:  ldarg.1
    IL_0015:  ldloc.0
    IL_0016:  stobj      !!T
    IL_001b:  ret
  } // end of method Program::Swap

  .method private hidebysig static !!T  Read<T>(class HelloWorld.IValue`1<!!T> 'value') cil managed
  {
    // Code size       12 (0xc)
    .maxstack  1
    .locals init (!!T V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  callvirt   instance !0 class HelloWorld.IValue`1<!!T>::Get()
    IL_0007:  stloc.0
    IL_0008:  br.s       IL_000a

    IL_000a:  ldloc.0
    IL_000b:  ret
  } // end of method Program::Read

  .method private hidebysig static void  Accumulate<(class HelloWorld.IAccumulator`1<int32>) TAccumulator>(!!TAccumulator& accumulator,
                                                                                                           int32 'value') cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  constrained. !!TAccumulator
    IL_0009:  callvirt   instance void class HelloWorld.IAccumulator`1<int32>::Add(!0)
    IL_000e:  nop
    IL_000f:  ret
  } // end of method Program::Accumulate

  .method private hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       1068 (0x42c)
    .maxstack  4
    .locals init (class HelloWorld.Growable`1<int32> V_0,
             class HelloWorld.Growable`1<string> V_1,
             class HelloWorld.Growable`1<valuetype HelloWorld.Point> V_2,
             valuetype HelloWorld.Point V_3,
             valuetype HelloWorld.Pair`2<int32,string> V_4,
             int32 V_5,
             int32 V_6,
             string V_7,
             string V_8,
             valuetype HelloWorld.Point V_9,
             valuetype HelloWorld.Point V_10,
             class HelloWorld.ClassAccumulator V_11,
             class HelloWorld.IAccumulator`1<int32> V_12,
             valuetype HelloWorld.StructAccumulator V_13,
             class HelloWorld.IAccumulator`1<int32> V_14,
             valuetype HelloWorld.Builder V_15,
             valuetype HelloWorld.StructMachine V_16,
             class HelloWorld.ClassMachine V_17,
             class HelloWorld.Outer`1/Inner`1<int32,string> V_18,
             class HelloWorld.Outer`1/Inner`1<string,int32> V_19,
             valuetype HelloWorld.Point V_20,
             class HelloWorld.StringChild V_21,
             class HelloWorld.GenericBase`1<string> V_22,
             int32 V_23,
             bool V_24,
             valuetype HelloWorld.ExplicitStructValue V_25)
    IL_0000:  nop
    IL_0001:  ldstr      "containers"
    IL_0006:  call       void [System.Console]System.Console::WriteLine(string)
    IL_000b:  nop
    IL_000c:  newobj     instance void class HelloWorld.Growable`1<int32>::.ctor()
    IL_0011:  stloc.0
    IL_0012:  newobj     instance void class HelloWorld.Growable`1<string>::.ctor()
    IL_0017:  stloc.1
    IL_0018:  newobj     instance void class HelloWorld.Growable`1<valuetype HelloWorld.Point>::.ctor()
    IL_001d:  stloc.2
    IL_001e:  ldc.i4.0
    IL_001f:  stloc.s    V_23
    IL_0021:  br.s       IL_0049

    IL_0023:  nop
    IL_0024:  ldloc.0
    IL_0025:  ldloc.s    V_23
    IL_0027:  ldc.i4.3
    IL_0028:  mul
    IL_0029:  callvirt   instance void class HelloWorld.Growable`1<int32>::Add(!0)
    IL_002e:  nop
    IL_002f:  ldloc.2
    IL_0030:  ldloc.s    V_23
    IL_0032:  ldloc.s    V_23
    IL_0034:  ldc.i4.s   10
    IL_0036:  add
    IL_0037:  newobj     instance void HelloWorld.Point::.ctor(int32,
                                                               int32)
    IL_003c:  callvirt   instance void class HelloWorld.Growable`1<valuetype HelloWorld.Point>::Add(!0)
    IL_0041:  nop
    IL_0042:  nop
    IL_0043:  ldloc.s    V_23
    IL_0045:  ldc.i4.1
    IL_0046:  add
    IL_0047:  stloc.s    V_23
    IL_0049:  ldloc.s    V_23
    IL_004b:  ldc.i4.5
    IL_004c:  clt
    IL_004e:  stloc.s    V_24
    IL_0050:  ldloc.s    V_24
    IL_0052:  brtrue.s   IL_0023

    IL_0054:  ldloc.1
    IL_0055:  ldstr      "alpha"
    IL_005a:  callvirt   instance void class HelloWorld.Growable`1<string>::Add(!0)
    IL_005f:  nop
    IL_0060:  ldloc.1
    IL_0061:  ldstr      "beta"
    IL_0066:  callvirt   instance void class HelloWorld.Growable`1<string>::Add(!0)
    IL_006b:  nop
    IL_006c:  ldloc.1
    IL_006d:  ldstr      "gamma"
    IL_0072:  callvirt   instance void class HelloWorld.Growable`1<string>::Add(!0)
    IL_0077:  nop
    IL_0078:  ldloc.0
    IL_0079:  ldfld      int32 class HelloWorld.Growable`1<int32>::Count
    IL_007e:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0083:  nop
    IL_0084:  ldloc.0
    IL_0085:  ldc.i4.0
    IL_0086:  callvirt   instance !0 class HelloWorld.Growable`1<int32>::Get(int32)
    IL_008b:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0090:  nop
    IL_0091:  ldloc.0
    IL_0092:  ldc.i4.4
    IL_0093:  callvirt   instance !0 class HelloWorld.Growable`1<int32>::Get(int32)
    IL_0098:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_009d:  nop
    IL_009e:  ldloc.1
    IL_009f:  ldc.i4.0
    IL_00a0:  callvirt   instance !0 class HelloWorld.Growable`1<string>::Get(int32)
    IL_00a5:  call       void [System.Console]System.Console::WriteLine(string)
    IL_00aa:  nop
    IL_00ab:  ldloc.1
    IL_00ac:  ldc.i4.2
    IL_00ad:  callvirt   instance !0 class HelloWorld.Growable`1<string>::Get(int32)
    IL_00b2:  call       void [System.Console]System.Console::WriteLine(string)
    IL_00b7:  nop
    IL_00b8:  ldloc.2
    IL_00b9:  ldc.i4.4
    IL_00ba:  callvirt   instance !0 class HelloWorld.Growable`1<valuetype HelloWorld.Point>::Get(int32)
    IL_00bf:  stloc.3
    IL_00c0:  ldloca.s   V_3
    IL_00c2:  ldc.i4.s   99
    IL_00c4:  stfld      int32 HelloWorld.Point::X
    IL_00c9:  ldloc.2
    IL_00ca:  ldc.i4.4
    IL_00cb:  callvirt   instance !0 class HelloWorld.Growable`1<valuetype HelloWorld.Point>::Get(int32)
    IL_00d0:  ldfld      int32 HelloWorld.Point::X
    IL_00d5:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00da:  nop
    IL_00db:  ldloc.2
    IL_00dc:  ldc.i4.4
    IL_00dd:  callvirt   instance !0 class HelloWorld.Growable`1<valuetype HelloWorld.Point>::Get(int32)
    IL_00e2:  ldfld      int32 HelloWorld.Point::Y
    IL_00e7:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00ec:  nop
    IL_00ed:  ldloc.3
    IL_00ee:  ldfld      int32 HelloWorld.Point::X
    IL_00f3:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00f8:  nop
    IL_00f9:  ldstr      "generic-methods"
    IL_00fe:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0103:  nop
    IL_0104:  ldc.i4.s   23
    IL_0106:  ldstr      "pair"
    IL_010b:  newobj     instance void valuetype HelloWorld.Pair`2<int32,string>::.ctor(!0,
                                                                                        !1)
    IL_0110:  call       !!0 HelloWorld.Program::Relay<valuetype HelloWorld.Pair`2<int32,string>>(!!0)
    IL_0115:  stloc.s    V_4
    IL_0117:  ldloc.s    V_4
    IL_0119:  ldfld      !0 valuetype HelloWorld.Pair`2<int32,string>::First
    IL_011e:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0123:  nop
    IL_0124:  ldloc.s    V_4
    IL_0126:  ldfld      !1 valuetype HelloWorld.Pair`2<int32,string>::Second
    IL_012b:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0130:  nop
    IL_0131:  ldc.i4.s   11
    IL_0133:  stloc.s    V_5
    IL_0135:  ldc.i4.s   29
    IL_0137:  stloc.s    V_6
    IL_0139:  ldloca.s   V_5
    IL_013b:  ldloca.s   V_6
    IL_013d:  call       void HelloWorld.Program::Swap<int32>(!!0&,
                                                              !!0&)
    IL_0142:  nop
    IL_0143:  ldloc.s    V_5
    IL_0145:  call       !!0 HelloWorld.Program::Relay<int32>(!!0)
    IL_014a:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_014f:  nop
    IL_0150:  ldloc.s    V_6
    IL_0152:  call       !!0 HelloWorld.Program::Identity<int32>(!!0)
    IL_0157:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_015c:  nop
    IL_015d:  ldstr      "left"
    IL_0162:  stloc.s    V_7
    IL_0164:  ldstr      "right"
    IL_0169:  stloc.s    V_8
    IL_016b:  ldloca.s   V_7
    IL_016d:  ldloca.s   V_8
    IL_016f:  call       void HelloWorld.Program::Swap<string>(!!0&,
                                                               !!0&)
    IL_0174:  nop
    IL_0175:  ldloc.s    V_7
    IL_0177:  call       !!0 HelloWorld.Program::Relay<string>(!!0)
    IL_017c:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0181:  nop
    IL_0182:  ldloc.s    V_8
    IL_0184:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0189:  nop
    IL_018a:  ldloca.s   V_9
    IL_018c:  ldc.i4.1
    IL_018d:  ldc.i4.2
    IL_018e:  call       instance void HelloWorld.Point::.ctor(int32,
                                                               int32)
    IL_0193:  ldloca.s   V_10
    IL_0195:  ldc.i4.8
    IL_0196:  ldc.i4.s   9
    IL_0198:  call       instance void HelloWorld.Point::.ctor(int32,
                                                               int32)
    IL_019d:  ldloca.s   V_9
    IL_019f:  ldloca.s   V_10
    IL_01a1:  call       void HelloWorld.Program::Swap<valuetype HelloWorld.Point>(!!0&,
                                                                                   !!0&)
    IL_01a6:  nop
    IL_01a7:  ldloc.s    V_9
    IL_01a9:  call       !!0 HelloWorld.Program::Relay<valuetype HelloWorld.Point>(!!0)
    IL_01ae:  ldfld      int32 HelloWorld.Point::X
    IL_01b3:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_01b8:  nop
    IL_01b9:  ldloc.s    V_10
    IL_01bb:  ldfld      int32 HelloWorld.Point::Y
    IL_01c0:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_01c5:  nop
    IL_01c6:  ldstr      "interfaces"
    IL_01cb:  call       void [System.Console]System.Console::WriteLine(string)
    IL_01d0:  nop
    IL_01d1:  ldc.i4.s   10
    IL_01d3:  newobj     instance void HelloWorld.ClassAccumulator::.ctor(int32)
    IL_01d8:  stloc.s    V_11
    IL_01da:  ldloc.s    V_11
    IL_01dc:  stloc.s    V_12
    IL_01de:  ldloc.s    V_12
    IL_01e0:  ldc.i4.2
    IL_01e1:  callvirt   instance void class HelloWorld.IAccumulator`1<int32>::Add(!0)
    IL_01e6:  nop
    IL_01e7:  ldloc.s    V_12
    IL_01e9:  call       !!0 HelloWorld.Program::Read<int32>(class HelloWorld.IValue`1<!!0>)
    IL_01ee:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_01f3:  nop
    IL_01f4:  ldloca.s   V_11
    IL_01f6:  ldc.i4.3
    IL_01f7:  call       void HelloWorld.Program::Accumulate<class HelloWorld.ClassAccumulator>(!!0&,
                                                                                                int32)
    IL_01fc:  nop
    IL_01fd:  ldloc.s    V_11
    IL_01ff:  callvirt   instance int32 HelloWorld.ClassAccumulator::Get()
    IL_0204:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0209:  nop
    IL_020a:  ldloca.s   V_13
    IL_020c:  ldc.i4.s   20
    IL_020e:  call       instance void HelloWorld.StructAccumulator::.ctor(int32)
    IL_0213:  ldloca.s   V_13
    IL_0215:  ldc.i4.4
    IL_0216:  call       void HelloWorld.Program::Accumulate<valuetype HelloWorld.StructAccumulator>(!!0&,
                                                                                                     int32)
    IL_021b:  nop
    IL_021c:  ldloc.s    V_13
    IL_021e:  ldfld      int32 HelloWorld.StructAccumulator::Value
    IL_0223:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0228:  nop
    IL_0229:  ldloc.s    V_13
    IL_022b:  box        HelloWorld.StructAccumulator
    IL_0230:  stloc.s    V_14
    IL_0232:  ldloc.s    V_14
    IL_0234:  ldc.i4.6
    IL_0235:  callvirt   instance void class HelloWorld.IAccumulator`1<int32>::Add(!0)
    IL_023a:  nop
    IL_023b:  ldloc.s    V_14
    IL_023d:  call       !!0 HelloWorld.Program::Read<int32>(class HelloWorld.IValue`1<!!0>)
    IL_0242:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0247:  nop
    IL_0248:  ldloc.s    V_13
    IL_024a:  ldfld      int32 HelloWorld.StructAccumulator::Value
    IL_024f:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0254:  nop
    IL_0255:  newobj     instance void HelloWorld.ExplicitValue::.ctor()
    IL_025a:  call       !!0 HelloWorld.Program::Read<string>(class HelloWorld.IValue`1<!!0>)
    IL_025f:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0264:  nop
    IL_0265:  ldloca.s   V_25
    IL_0267:  initobj    HelloWorld.ExplicitStructValue
    IL_026d:  ldloc.s    V_25
    IL_026f:  box        HelloWorld.ExplicitStructValue
    IL_0274:  call       !!0 HelloWorld.Program::Read<int32>(class HelloWorld.IValue`1<!!0>)
    IL_0279:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_027e:  nop
    IL_027f:  ldstr      "state-machines"
    IL_0284:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0289:  nop
    IL_028a:  ldloca.s   V_15
    IL_028c:  initobj    HelloWorld.Builder
    IL_0292:  ldloca.s   V_16
    IL_0294:  initobj    HelloWorld.StructMachine
    IL_029a:  ldloca.s   V_16
    IL_029c:  ldc.i4.1
    IL_029d:  stfld      int32 HelloWorld.StructMachine::State
    IL_02a2:  ldloca.s   V_15
    IL_02a4:  ldloca.s   V_16
    IL_02a6:  call       instance void HelloWorld.Builder::Start<valuetype HelloWorld.StructMachine>(!!0&)
    IL_02ab:  nop
    IL_02ac:  ldloca.s   V_15
    IL_02ae:  ldloca.s   V_16
    IL_02b0:  call       instance void HelloWorld.Builder::Start<valuetype HelloWorld.StructMachine>(!!0&)
    IL_02b5:  nop
    IL_02b6:  ldloc.s    V_16
    IL_02b8:  ldfld      int32 HelloWorld.StructMachine::State
    IL_02bd:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_02c2:  nop
    IL_02c3:  newobj     instance void HelloWorld.ClassMachine::.ctor()
    IL_02c8:  stloc.s    V_17
    IL_02ca:  ldloc.s    V_17
    IL_02cc:  ldc.i4.2
    IL_02cd:  stfld      int32 HelloWorld.ClassMachine::State
    IL_02d2:  ldloca.s   V_15
    IL_02d4:  ldloca.s   V_17
    IL_02d6:  call       instance void HelloWorld.Builder::Start<class HelloWorld.ClassMachine>(!!0&)
    IL_02db:  nop
    IL_02dc:  ldloca.s   V_15
    IL_02de:  ldloca.s   V_17
    IL_02e0:  call       instance void HelloWorld.Builder::Start<class HelloWorld.ClassMachine>(!!0&)
    IL_02e5:  nop
    IL_02e6:  ldloc.s    V_17
    IL_02e8:  ldfld      int32 HelloWorld.ClassMachine::State
    IL_02ed:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_02f2:  nop
    IL_02f3:  ldstr      "statics"
    IL_02f8:  call       void [System.Console]System.Console::WriteLine(string)
    IL_02fd:  nop
    IL_02fe:  ldsfld     int32 class HelloWorld.Slots`1<int32>::Number
    IL_0303:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0308:  nop
    IL_0309:  ldc.i4.s   19
    IL_030b:  stsfld     int32 class HelloWorld.Slots`1<int32>::Number
    IL_0310:  ldc.i4.s   42
    IL_0312:  stsfld     !0 class HelloWorld.Slots`1<int32>::Value
    IL_0317:  ldsfld     int32 class HelloWorld.Slots`1<string>::Number
    IL_031c:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0321:  nop
    IL_0322:  ldc.i4.s   31
    IL_0324:  stsfld     int32 class HelloWorld.Slots`1<string>::Number
    IL_0329:  ldstr      "slot"
    IL_032e:  stsfld     !0 class HelloWorld.Slots`1<string>::Value
    IL_0333:  ldsfld     int32 class HelloWorld.Slots`1<int32>::Number
    IL_0338:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_033d:  nop
    IL_033e:  ldsfld     !0 class HelloWorld.Slots`1<int32>::Value
    IL_0343:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0348:  nop
    IL_0349:  ldsfld     int32 class HelloWorld.Slots`1<string>::Number
    IL_034e:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0353:  nop
    IL_0354:  ldsfld     !0 class HelloWorld.Slots`1<string>::Value
    IL_0359:  call       void [System.Console]System.Console::WriteLine(string)
    IL_035e:  nop
    IL_035f:  ldstr      "nested-default-base"
    IL_0364:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0369:  nop
    IL_036a:  ldc.i4.s   61
    IL_036c:  ldstr      "nested"
    IL_0371:  newobj     instance void class HelloWorld.Outer`1/Inner`1<int32,string>::.ctor(!0,
                                                                                             !1)
    IL_0376:  stloc.s    V_18
    IL_0378:  ldstr      "outer"
    IL_037d:  ldc.i4.s   73
    IL_037f:  newobj     instance void class HelloWorld.Outer`1/Inner`1<string,int32>::.ctor(!0,
                                                                                             !1)
    IL_0384:  stloc.s    V_19
    IL_0386:  ldloc.s    V_18
    IL_0388:  ldfld      !0 class HelloWorld.Outer`1/Inner`1<int32,string>::First
    IL_038d:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0392:  nop
    IL_0393:  ldloc.s    V_18
    IL_0395:  ldfld      !1 class HelloWorld.Outer`1/Inner`1<int32,string>::Second
    IL_039a:  call       void [System.Console]System.Console::WriteLine(string)
    IL_039f:  nop
    IL_03a0:  ldloc.s    V_19
    IL_03a2:  ldfld      !0 class HelloWorld.Outer`1/Inner`1<string,int32>::First
    IL_03a7:  call       void [System.Console]System.Console::WriteLine(string)
    IL_03ac:  nop
    IL_03ad:  ldloc.s    V_19
    IL_03af:  ldfld      !1 class HelloWorld.Outer`1/Inner`1<string,int32>::Second
    IL_03b4:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_03b9:  nop
    IL_03ba:  call       !!0 HelloWorld.Program::Default<int32>()
    IL_03bf:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_03c4:  nop
    IL_03c5:  call       !!0 HelloWorld.Program::Default<string>()
    IL_03ca:  ldnull
    IL_03cb:  ceq
    IL_03cd:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_03d2:  nop
    IL_03d3:  call       !!0 HelloWorld.Program::Default<valuetype HelloWorld.Point>()
    IL_03d8:  stloc.s    V_20
    IL_03da:  ldloc.s    V_20
    IL_03dc:  ldfld      int32 HelloWorld.Point::X
    IL_03e1:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_03e6:  nop
    IL_03e7:  ldloc.s    V_20
    IL_03e9:  ldfld      int32 HelloWorld.Point::Y
    IL_03ee:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_03f3:  nop
    IL_03f4:  ldstr      "base"
    IL_03f9:  newobj     instance void HelloWorld.StringChild::.ctor(string)
    IL_03fe:  stloc.s    V_21
    IL_0400:  ldloc.s    V_21
    IL_0402:  stloc.s    V_22
    IL_0404:  ldloc.s    V_22
    IL_0406:  callvirt   instance !0 class HelloWorld.GenericBase`1<string>::Get()
    IL_040b:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0410:  nop
    IL_0411:  ldloc.s    V_21
    IL_0413:  ldstr      "changed"
    IL_0418:  callvirt   instance void class HelloWorld.GenericBase`1<string>::Set(!0)
    IL_041d:  nop
    IL_041e:  ldloc.s    V_22
    IL_0420:  callvirt   instance !0 class HelloWorld.GenericBase`1<string>::Get()
    IL_0425:  call       void [System.Console]System.Console::WriteLine(string)
    IL_042a:  nop
    IL_042b:  ret
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
