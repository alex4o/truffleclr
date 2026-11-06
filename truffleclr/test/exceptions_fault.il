
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
// MVID: {4e7ef8ac-3b4f-4b9b-87e6-d7bb82ce178a}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x104ecc000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static void  Fault(bool fail) cil managed
  {
    // Code size       37 (0x25)
    .maxstack  1
    .locals init (bool V_0)
    IL_0000:  nop
    .try
    {
      IL_0001:  nop
      IL_0002:  ldarg.0
      IL_0003:  stloc.0
      IL_0004:  ldloc.0
      IL_0005:  brfalse.s  IL_0012

      IL_0007:  ldstr      "fault"
      IL_000c:  newobj     instance void [System.Runtime]System.Exception::.ctor(string)
      IL_0011:  throw

      IL_0012:  nop
      IL_0013:  leave.s    IL_0024

    }  // end .try
    fault // Equivalent to the source catch/rethrow; C# cannot emit fault directly.
    {
      IL_0015:  nop
      IL_0016:  nop
      IL_0017:  ldstr      "fault cleanup"
      IL_001c:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0021:  nop
      IL_0022:  endfault
    }  // end handler
    IL_0024:  ret
  } // end of method Program::Fault

  .method private hidebysig static void  Main() cil managed
  {
    .entrypoint
    // Code size       48 (0x30)
    .maxstack  1
    .locals init (class [System.Runtime]System.Exception V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.0
    IL_0002:  call       void HelloWorld.Program::Fault(bool)
    IL_0007:  nop
    IL_0008:  ldstr      "normal"
    IL_000d:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0012:  nop
    .try
    {
      IL_0013:  nop
      IL_0014:  ldc.i4.1
      IL_0015:  call       void HelloWorld.Program::Fault(bool)
      IL_001a:  nop
      IL_001b:  nop
      IL_001c:  leave.s    IL_002f

    }  // end .try
    catch [System.Runtime]System.Exception 
    {
      IL_001e:  stloc.0
      IL_001f:  nop
      IL_0020:  ldloc.0
      IL_0021:  callvirt   instance string [System.Runtime]System.Exception::get_Message()
      IL_0026:  call       void [System.Console]System.Console::WriteLine(string)
      IL_002b:  nop
      IL_002c:  nop
      IL_002d:  leave.s    IL_002f

    }  // end handler
    IL_002f:  ret
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
