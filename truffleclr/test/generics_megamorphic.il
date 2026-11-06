
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
// MVID: {ce3cc23d-978b-41d1-97c8-f78840caa338}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 )
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x10279c000


// =============== CLASS MEMBERS DECLARATION ===================

.class interface private abstract auto ansi beforefieldinit HelloWorld.I`1<T>
{
  .method public hidebysig newslot abstract virtual
          instance int32  M(!T 'value') cil managed
  {
  } // end of method I`1::M

} // end of class HelloWorld.I`1

.class private auto ansi beforefieldinit HelloWorld.One`1<T>
       extends [System.Runtime]System.Object
       implements class HelloWorld.I`1<!T>
{
  .method public hidebysig newslot virtual final
          instance int32  M(!T 'value') cil managed
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
  } // end of method One`1::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method One`1::.ctor

} // end of class HelloWorld.One`1

.class private auto ansi beforefieldinit HelloWorld.Two`1<T>
       extends [System.Runtime]System.Object
       implements class HelloWorld.I`1<!T>
{
  .method public hidebysig newslot virtual final
          instance int32  M(!T 'value') cil managed
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
  } // end of method Two`1::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Two`1::.ctor

} // end of class HelloWorld.Two`1

.class private auto ansi beforefieldinit HelloWorld.Three`1<T>
       extends [System.Runtime]System.Object
       implements class HelloWorld.I`1<!T>
{
  .method public hidebysig newslot virtual final
          instance int32  M(!T 'value') cil managed
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
  } // end of method Three`1::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Three`1::.ctor

} // end of class HelloWorld.Three`1

.class private auto ansi beforefieldinit HelloWorld.Four`1<T>
       extends [System.Runtime]System.Object
       implements class HelloWorld.I`1<!T>
{
  .method public hidebysig newslot virtual final
          instance int32  M(!T 'value') cil managed
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
  } // end of method Four`1::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Four`1::.ctor

} // end of class HelloWorld.Four`1

.class private auto ansi beforefieldinit HelloWorld.Five`1<T>
       extends [System.Runtime]System.Object
       implements class HelloWorld.I`1<!T>
{
  .method public hidebysig newslot virtual final
          instance int32  M(!T 'value') cil managed
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
  } // end of method Five`1::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Five`1::.ctor

} // end of class HelloWorld.Five`1

.class private auto ansi beforefieldinit HelloWorld.Six`1<T>
       extends [System.Runtime]System.Object
       implements class HelloWorld.I`1<!T>
{
  .method public hidebysig newslot virtual final
          instance int32  M(!T 'value') cil managed
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
  } // end of method Six`1::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Six`1::.ctor

} // end of class HelloWorld.Six`1

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static int32
          Call<T>(class HelloWorld.I`1<!!T> receiver,
                  !!T 'value') cil managed
  {
    // Code size       13 (0xd)
    .maxstack  2
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  callvirt   instance int32 class HelloWorld.I`1<!!T>::M(!0)
    IL_0008:  stloc.0
    IL_0009:  br.s       IL_000b

    IL_000b:  ldloc.0
    IL_000c:  ret
  } // end of method Program::Call

  .method private hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       102 (0x66)
    .maxstack  4
    .locals init (class HelloWorld.I`1<int32>[] V_0,
             int32 V_1,
             int32 V_2,
             bool V_3)
    IL_0000:  nop
    IL_0001:  ldc.i4.6
    IL_0002:  newarr     class HelloWorld.I`1<int32>
    IL_0007:  dup
    IL_0008:  ldc.i4.0
    IL_0009:  newobj     instance void class HelloWorld.One`1<int32>::.ctor()
    IL_000e:  stelem.ref
    IL_000f:  dup
    IL_0010:  ldc.i4.1
    IL_0011:  newobj     instance void class HelloWorld.Two`1<int32>::.ctor()
    IL_0016:  stelem.ref
    IL_0017:  dup
    IL_0018:  ldc.i4.2
    IL_0019:  newobj     instance void class HelloWorld.Three`1<int32>::.ctor()
    IL_001e:  stelem.ref
    IL_001f:  dup
    IL_0020:  ldc.i4.3
    IL_0021:  newobj     instance void class HelloWorld.Four`1<int32>::.ctor()
    IL_0026:  stelem.ref
    IL_0027:  dup
    IL_0028:  ldc.i4.4
    IL_0029:  newobj     instance void class HelloWorld.Five`1<int32>::.ctor()
    IL_002e:  stelem.ref
    IL_002f:  dup
    IL_0030:  ldc.i4.5
    IL_0031:  newobj     instance void class HelloWorld.Six`1<int32>::.ctor()
    IL_0036:  stelem.ref
    IL_0037:  stloc.0
    IL_0038:  ldc.i4.0
    IL_0039:  stloc.1
    IL_003a:  ldc.i4.0
    IL_003b:  stloc.2
    IL_003c:  br.s       IL_0052

    IL_003e:  ldloc.1
    IL_003f:  ldloc.0
    IL_0040:  ldloc.2
    IL_0041:  ldloc.0
    IL_0042:  ldlen
    IL_0043:  conv.i4
    IL_0044:  rem
    IL_0045:  ldelem.ref
    IL_0046:  ldloc.2
    IL_0047:  call       int32 HelloWorld.Program::Call<int32>(class HelloWorld.I`1<!!0>,
                                                               !!0)
    IL_004c:  add
    IL_004d:  stloc.1
    IL_004e:  ldloc.2
    IL_004f:  ldc.i4.1
    IL_0050:  add
    IL_0051:  stloc.2
    IL_0052:  ldloc.2
    IL_0053:  ldc.i4     0x249f00
    IL_0058:  clt
    IL_005a:  stloc.3
    IL_005b:  ldloc.3
    IL_005c:  brtrue.s   IL_003e

    IL_005e:  ldloc.1
    IL_005f:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0064:  nop
    IL_0065:  ret
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
