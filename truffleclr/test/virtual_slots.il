
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
// MVID: {5f98e389-c44d-4364-8729-7404dbd9b77c}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 )
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x1008f8000


// =============== CLASS MEMBERS DECLARATION ===================

.class public auto ansi beforefieldinit HelloWorld.Base
       extends [System.Runtime]System.Object
{
  .method public hidebysig newslot virtual
          instance int32  Read() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.1
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method Base::Read

  .method public hidebysig instance int32
          Plain() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.6
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method Base::Plain

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Base::.ctor

} // end of class HelloWorld.Base

.class public auto ansi beforefieldinit HelloWorld.Hidden
       extends HelloWorld.Base
{
  .method public hidebysig newslot virtual
          instance int32  Read() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.2
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method Hidden::Read

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void HelloWorld.Base::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Hidden::.ctor

} // end of class HelloWorld.Hidden

.class public auto ansi beforefieldinit HelloWorld.OverrideBase
       extends HelloWorld.Base
{
  .method public hidebysig virtual instance int32
          Read() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.3
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method OverrideBase::Read

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void HelloWorld.Base::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method OverrideBase::.ctor

} // end of class HelloWorld.OverrideBase

.class public auto ansi beforefieldinit HelloWorld.OverrideHidden
       extends HelloWorld.Hidden
{
  .method public hidebysig virtual instance int32
          Read() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.4
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method OverrideHidden::Read

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void HelloWorld.Hidden::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method OverrideHidden::.ctor

} // end of class HelloWorld.OverrideHidden

.class public auto ansi beforefieldinit HelloWorld.NonVirtual
       extends HelloWorld.Base
{
  .method public hidebysig instance int32
          Read() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.5
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method NonVirtual::Read

  .method public hidebysig instance int32
          Plain() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.7
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method NonVirtual::Plain

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void HelloWorld.Base::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method NonVirtual::.ctor

} // end of class HelloWorld.NonVirtual

.class public auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static void  ViaBase(class HelloWorld.Base obj) cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  callvirt   instance int32 HelloWorld.Base::Read()
    IL_0007:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_000c:  nop
    IL_000d:  ret
  } // end of method Program::ViaBase

  .method private hidebysig static void  ViaHidden(class HelloWorld.Hidden obj) cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  callvirt   instance int32 HelloWorld.Hidden::Read()
    IL_0007:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_000c:  nop
    IL_000d:  ret
  } // end of method Program::ViaHidden

  .method public hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       116 (0x74)
    .maxstack  1
    .locals init (class HelloWorld.Hidden V_0,
             class HelloWorld.OverrideHidden V_1,
             class HelloWorld.NonVirtual V_2,
             class HelloWorld.Base V_3)
    IL_0000:  nop
    IL_0001:  newobj     instance void HelloWorld.Hidden::.ctor()
    IL_0006:  stloc.0
    IL_0007:  ldloc.0
    IL_0008:  call       void HelloWorld.Program::ViaBase(class HelloWorld.Base)
    IL_000d:  nop
    IL_000e:  ldloc.0
    IL_000f:  call       void HelloWorld.Program::ViaHidden(class HelloWorld.Hidden)
    IL_0014:  nop
    IL_0015:  newobj     instance void HelloWorld.OverrideBase::.ctor()
    IL_001a:  call       void HelloWorld.Program::ViaBase(class HelloWorld.Base)
    IL_001f:  nop
    IL_0020:  newobj     instance void HelloWorld.OverrideHidden::.ctor()
    IL_0025:  stloc.1
    IL_0026:  ldloc.1
    IL_0027:  call       void HelloWorld.Program::ViaBase(class HelloWorld.Base)
    IL_002c:  nop
    IL_002d:  ldloc.1
    IL_002e:  call       void HelloWorld.Program::ViaHidden(class HelloWorld.Hidden)
    IL_0033:  nop
    IL_0034:  ldloc.1
    IL_0035:  callvirt   instance int32 HelloWorld.Hidden::Read()
    IL_003a:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_003f:  nop
    IL_0040:  newobj     instance void HelloWorld.NonVirtual::.ctor()
    IL_0045:  stloc.2
    IL_0046:  ldloc.2
    IL_0047:  call       void HelloWorld.Program::ViaBase(class HelloWorld.Base)
    IL_004c:  nop
    IL_004d:  ldloc.2
    IL_004e:  callvirt   instance int32 HelloWorld.NonVirtual::Read()
    IL_0053:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0058:  nop
    IL_0059:  ldloc.2
    IL_005a:  stloc.3
    IL_005b:  ldloc.3
    IL_005c:  callvirt   instance int32 HelloWorld.Base::Plain()
    IL_0061:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0066:  nop
    IL_0067:  ldloc.2
    IL_0068:  callvirt   instance int32 HelloWorld.NonVirtual::Plain()
    IL_006d:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0072:  nop
    IL_0073:  ret
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
