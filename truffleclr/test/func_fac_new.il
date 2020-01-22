
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
// MVID: {51ab3e48-7704-415f-8929-c0192588f1ea}
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x00007FF1B2333000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       57 (0x39)
    .maxstack  2
    .locals init (int32 V_0,
             bool V_1)
    IL_0000:  nop
    IL_0001:  ldc.i4.0
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_002c

    IL_0005:  nop
    IL_0006:  ldloc.0
    IL_0007:  call       void [System.Console]System.Console::Write(int32)
    IL_000c:  nop
    IL_000d:  ldstr      " "
    IL_0012:  call       void [System.Console]System.Console::Write(string)
    IL_0017:  nop
    IL_0018:  ldloc.0
    IL_0019:  ldc.i4.s   13
    IL_001b:  rem
    IL_001c:  call       int32 HelloWorld.Program::fac(int32)
    IL_0021:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0026:  nop
    IL_0027:  nop
    IL_0028:  ldloc.0
    IL_0029:  ldc.i4.1
    IL_002a:  add
    IL_002b:  stloc.0
    IL_002c:  ldloc.0
    IL_002d:  ldc.i4     0x44c
    IL_0032:  clt
    IL_0034:  stloc.1
    IL_0035:  ldloc.1
    IL_0036:  brtrue.s   IL_0005

    IL_0038:  ret
  } // end of method Program::Main

  .method private hidebysig static int32 
          fac(int32 n) cil managed
  {
    // Code size       42 (0x2a)
    .maxstack  3
    .locals init (bool V_0,
             int32 V_1,
             bool V_2)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldc.i4.0
    IL_0003:  ceq
    IL_0005:  stloc.0
    IL_0006:  ldloc.0
    IL_0007:  brfalse.s  IL_000e

    IL_0009:  nop
    IL_000a:  ldc.i4.1
    IL_000b:  stloc.1
    IL_000c:  br.s       IL_0028

    IL_000e:  ldarg.0
    IL_000f:  ldc.i4.1
    IL_0010:  ceq
    IL_0012:  stloc.2
    IL_0013:  ldloc.2
    IL_0014:  brfalse.s  IL_001b

    IL_0016:  nop
    IL_0017:  ldc.i4.1
    IL_0018:  stloc.1
    IL_0019:  br.s       IL_0028

    IL_001b:  ldarg.0
    IL_001c:  ldarg.0
    IL_001d:  ldc.i4.1
    IL_001e:  sub
    IL_001f:  call       int32 HelloWorld.Program::fac(int32)
    IL_0024:  mul
    IL_0025:  stloc.1
    IL_0026:  br.s       IL_0028

    IL_0028:  ldloc.1
    IL_0029:  ret
  } // end of method Program::fac

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
