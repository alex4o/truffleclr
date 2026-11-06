
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
// MVID: {ec4a1384-be79-4e93-a13a-24247f6f0a06}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x105154000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Growable`1<T>
       extends [System.Runtime]System.Object
{
  .field private !T[] items
  .field private int32 count
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
    IL_0002:  ldfld      int32 class HelloWorld.Growable`1<!T>::count
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
    IL_0043:  ldfld      int32 class HelloWorld.Growable`1<!T>::count
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
    IL_005d:  ldfld      int32 class HelloWorld.Growable`1<!T>::count
    IL_0062:  ldarg.1
    IL_0063:  stelem     !T
    IL_0068:  ldarg.0
    IL_0069:  ldarg.0
    IL_006a:  ldfld      int32 class HelloWorld.Growable`1<!T>::count
    IL_006f:  ldc.i4.1
    IL_0070:  add
    IL_0071:  stfld      int32 class HelloWorld.Growable`1<!T>::count
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

  .method public hidebysig instance void 
          Set(int32 index,
              !T 'value') cil managed
  {
    // Code size       15 (0xf)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      !0[] class HelloWorld.Growable`1<!T>::items
    IL_0007:  ldarg.1
    IL_0008:  ldarg.2
    IL_0009:  stelem     !T
    IL_000e:  ret
  } // end of method Growable`1::Set

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

  .method private hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       137 (0x89)
    .maxstack  4
    .locals init (class HelloWorld.Growable`1<int32> V_0,
             int32 V_1,
             int32 V_2,
             bool V_3,
             int32 V_4,
             int32 V_5,
             int32 V_6,
             bool V_7)
    IL_0000:  nop
    IL_0001:  newobj     instance void class HelloWorld.Growable`1<int32>::.ctor()
    IL_0006:  stloc.0
    IL_0007:  ldc.i4.0
    IL_0008:  stloc.2
    IL_0009:  br.s       IL_0017

    IL_000b:  ldloc.0
    IL_000c:  ldloc.2
    IL_000d:  callvirt   instance void class HelloWorld.Growable`1<int32>::Add(!0)
    IL_0012:  nop
    IL_0013:  ldloc.2
    IL_0014:  ldc.i4.1
    IL_0015:  add
    IL_0016:  stloc.2
    IL_0017:  ldloc.2
    IL_0018:  ldc.i4.s   16
    IL_001a:  clt
    IL_001c:  stloc.3
    IL_001d:  ldloc.3
    IL_001e:  brtrue.s   IL_000b

    IL_0020:  ldc.i4.0
    IL_0021:  stloc.1
    IL_0022:  ldc.i4.0
    IL_0023:  stloc.s    V_4
    IL_0025:  br.s       IL_0057

    IL_0027:  nop
    IL_0028:  ldloc.s    V_4
    IL_002a:  ldc.i4.s   15
    IL_002c:  and
    IL_002d:  stloc.s    V_5
    IL_002f:  ldloc.0
    IL_0030:  ldloc.s    V_5
    IL_0032:  callvirt   instance !0 class HelloWorld.Growable`1<int32>::Get(int32)
    IL_0037:  call       !!0 HelloWorld.Program::Identity<int32>(!!0)
    IL_003c:  stloc.s    V_6
    IL_003e:  ldloc.1
    IL_003f:  ldloc.s    V_6
    IL_0041:  add
    IL_0042:  stloc.1
    IL_0043:  ldloc.0
    IL_0044:  ldloc.s    V_5
    IL_0046:  ldloc.s    V_6
    IL_0048:  ldc.i4.1
    IL_0049:  add
    IL_004a:  callvirt   instance void class HelloWorld.Growable`1<int32>::Set(int32,
                                                                               !0)
    IL_004f:  nop
    IL_0050:  nop
    IL_0051:  ldloc.s    V_4
    IL_0053:  ldc.i4.1
    IL_0054:  add
    IL_0055:  stloc.s    V_4
    IL_0057:  ldloc.s    V_4
    IL_0059:  ldc.i4     0x30d40
    IL_005e:  clt
    IL_0060:  stloc.s    V_7
    IL_0062:  ldloc.s    V_7
    IL_0064:  brtrue.s   IL_0027

    IL_0066:  ldloc.1
    IL_0067:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_006c:  nop
    IL_006d:  ldloc.0
    IL_006e:  ldc.i4.0
    IL_006f:  callvirt   instance !0 class HelloWorld.Growable`1<int32>::Get(int32)
    IL_0074:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0079:  nop
    IL_007a:  ldloc.0
    IL_007b:  ldc.i4.s   15
    IL_007d:  callvirt   instance !0 class HelloWorld.Growable`1<int32>::Get(int32)
    IL_0082:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0087:  nop
    IL_0088:  ret
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
