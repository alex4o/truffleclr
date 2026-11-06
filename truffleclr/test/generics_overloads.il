
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
// MVID: {3c289e69-efb7-4b55-a032-4ec8adfc8949}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x1050ac000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Base`1<T>
       extends [System.Runtime]System.Object
{
  .method public hidebysig newslot virtual 
          instance int32  Pick(!T item) cil managed
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
  } // end of method Base`1::Pick

  .method public hidebysig newslot virtual 
          instance int32  Pick(int32 item) cil managed
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
  } // end of method Base`1::Pick

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Base`1::.ctor

} // end of class HelloWorld.Base`1

.class private auto ansi beforefieldinit HelloWorld.Derived`1<T>
       extends class HelloWorld.Base`1<!T>
{
  .method public hidebysig virtual instance int32 
          Pick(!T item) cil managed
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
  } // end of method Derived`1::Pick

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void class HelloWorld.Base`1<!T>::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Derived`1::.ctor

} // end of class HelloWorld.Derived`1

.class interface private abstract auto ansi beforefieldinit HelloWorld.IPick`1<T>
{
  .method public hidebysig newslot abstract virtual 
          instance int32  Pick(!T item) cil managed
  {
  } // end of method IPick`1::Pick

} // end of class HelloWorld.IPick`1

.class private auto ansi beforefieldinit HelloWorld.Implementation`1<T>
       extends [System.Runtime]System.Object
       implements class HelloWorld.IPick`1<!T>
{
  .method public hidebysig newslot virtual 
          instance int32  Pick(int32 item) cil managed
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
  } // end of method Implementation`1::Pick

  .method public hidebysig newslot virtual 
          instance int32  Pick(!T item) cil managed
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
  } // end of method Implementation`1::Pick

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Implementation`1::.ctor

} // end of class HelloWorld.Implementation`1

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static int32 
          First<T>(class HelloWorld.Base`1<!!T> receiver,
                   !!T item) cil managed
  {
    // Code size       13 (0xd)
    .maxstack  2
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  callvirt   instance int32 class HelloWorld.Base`1<!!T>::Pick(!0)
    IL_0008:  stloc.0
    IL_0009:  br.s       IL_000b

    IL_000b:  ldloc.0
    IL_000c:  ret
  } // end of method Program::First

  .method private hidebysig static int32 
          Second<T>(class HelloWorld.Base`1<!!T> receiver,
                    int32 item) cil managed
  {
    // Code size       13 (0xd)
    .maxstack  2
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  callvirt   instance int32 class HelloWorld.Base`1<!!T>::Pick(int32)
    IL_0008:  stloc.0
    IL_0009:  br.s       IL_000b

    IL_000b:  ldloc.0
    IL_000c:  ret
  } // end of method Program::Second

  .method private hidebysig static !!T  Identity<T>(!!T item) cil managed
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

  .method private hidebysig static !!U  Identity<U>(!!U item,
                                                    int32 ignored) cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (!!U V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method Program::Identity

  .method private hidebysig static void  Main() cil managed
  {
    .entrypoint
    // Code size       79 (0x4f)
    .maxstack  2
    .locals init (class HelloWorld.Base`1<int32> V_0,
             class HelloWorld.IPick`1<int32> V_1)
    IL_0000:  nop
    IL_0001:  newobj     instance void class HelloWorld.Derived`1<int32>::.ctor()
    IL_0006:  stloc.0
    IL_0007:  ldloc.0
    IL_0008:  ldc.i4.7
    IL_0009:  call       int32 HelloWorld.Program::First<int32>(class HelloWorld.Base`1<!!0>,
                                                                !!0)
    IL_000e:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0013:  nop
    IL_0014:  ldloc.0
    IL_0015:  ldc.i4.7
    IL_0016:  call       int32 HelloWorld.Program::Second<int32>(class HelloWorld.Base`1<!!0>,
                                                                 int32)
    IL_001b:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0020:  nop
    IL_0021:  newobj     instance void class HelloWorld.Implementation`1<int32>::.ctor()
    IL_0026:  stloc.1
    IL_0027:  ldloc.1
    IL_0028:  ldc.i4.7
    IL_0029:  callvirt   instance int32 class HelloWorld.IPick`1<int32>::Pick(!0)
    IL_002e:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0033:  nop
    IL_0034:  ldc.i4.8
    // Equivalent named method-parameter references, including a different overload name.
    IL_0035:  call       !!T HelloWorld.Program::Identity<int32>(!!T)
    IL_003a:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_003f:  nop
    IL_0040:  ldc.i4.s   9
    IL_0042:  ldc.i4.0
    IL_0043:  call       !!U HelloWorld.Program::Identity<int32>(!!U,
                                                                 int32)
    IL_0048:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_004d:  nop
    IL_004e:  ret
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
