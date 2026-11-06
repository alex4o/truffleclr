
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
// MVID: {7ac6d503-c00a-46f3-84a9-c7edc4ceccfe}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x1044dc000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Boom
       extends [System.Runtime]System.Exception
{
  .field public int32 Code
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string text,
                               int32 code) cil managed
  {
    // Code size       17 (0x11)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void [System.Runtime]System.Exception::.ctor(string)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ldarg.0
    IL_000a:  ldarg.2
    IL_000b:  stfld      int32 HelloWorld.Boom::Code
    IL_0010:  ret
  } // end of method Boom::.ctor

} // end of class HelloWorld.Boom

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static void  Deep() cil managed
  {
    // Code size       13 (0xd)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldstr      "boom"
    IL_0006:  ldc.i4.7
    IL_0007:  newobj     instance void HelloWorld.Boom::.ctor(string,
                                                              int32)
    IL_000c:  throw
  } // end of method Program::Deep

  .method private hidebysig static void  Middle() cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  1
    IL_0000:  nop
    .try
    {
      IL_0001:  nop
      IL_0002:  call       void HelloWorld.Program::Deep()
      IL_0007:  nop
      IL_0008:  nop
      IL_0009:  leave.s    IL_0019

    }  // end .try
    finally
    {
      IL_000b:  nop
      IL_000c:  ldstr      "middle finally"
      IL_0011:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0016:  nop
      IL_0017:  nop
      IL_0018:  endfinally
    }  // end handler
    IL_0019:  ret
  } // end of method Program::Middle

  .method private hidebysig static int32 
          Return() cil managed
  {
    // Code size       23 (0x17)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    .try
    {
      IL_0001:  nop
      IL_0002:  ldc.i4.s   42
      IL_0004:  stloc.0
      IL_0005:  leave.s    IL_0015

    }  // end .try
    finally
    {
      IL_0007:  nop
      IL_0008:  ldstr      "return finally"
      IL_000d:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0012:  nop
      IL_0013:  nop
      IL_0014:  endfinally
    }  // end handler
    IL_0015:  ldloc.0
    IL_0016:  ret
  } // end of method Program::Return

  .method private hidebysig static void  Main() cil managed
  {
    .entrypoint
    // Code size       182 (0xb6)
    .maxstack  2
    .locals init (class HelloWorld.Boom V_0,
             class [System.Runtime]System.Exception V_1,
             int32 V_2,
             bool V_3,
             bool V_4,
             bool V_5)
    IL_0000:  nop
    .try
    {
      IL_0001:  nop
      .try
      {
        .try
        {
          IL_0002:  nop
          IL_0003:  call       void HelloWorld.Program::Middle()
          IL_0008:  nop
          IL_0009:  nop
          IL_000a:  leave.s    IL_0038

        }  // end .try
        catch [System.Runtime]System.InvalidOperationException 
        {
          IL_000c:  pop
          IL_000d:  nop
          IL_000e:  ldstr      "wrong"
          IL_0013:  call       void [System.Console]System.Console::WriteLine(string)
          IL_0018:  nop
          IL_0019:  nop
          IL_001a:  leave.s    IL_0038

        }  // end handler
        catch HelloWorld.Boom 
        {
          IL_001c:  stloc.0
          IL_001d:  nop
          IL_001e:  ldloc.0
          IL_001f:  callvirt   instance string [System.Runtime]System.Exception::get_Message()
          IL_0024:  call       void [System.Console]System.Console::WriteLine(string)
          IL_0029:  nop
          IL_002a:  ldloc.0
          IL_002b:  ldfld      int32 HelloWorld.Boom::Code
          IL_0030:  call       void [System.Console]System.Console::WriteLine(int32)
          IL_0035:  nop
          IL_0036:  rethrow
        }  // end handler
        IL_0038:  leave.s    IL_0048

      }  // end .try
      finally
      {
        IL_003a:  nop
        IL_003b:  ldstr      "inner finally"
        IL_0040:  call       void [System.Console]System.Console::WriteLine(string)
        IL_0045:  nop
        IL_0046:  nop
        IL_0047:  endfinally
      }  // end handler
      IL_0048:  nop
      IL_0049:  leave.s    IL_005c

    }  // end .try
    catch [System.Runtime]System.Exception 
    {
      IL_004b:  stloc.1
      IL_004c:  nop
      IL_004d:  ldloc.1
      IL_004e:  callvirt   instance string [System.Runtime]System.Exception::get_Message()
      IL_0053:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0058:  nop
      IL_0059:  nop
      IL_005a:  leave.s    IL_005c

    }  // end handler
    IL_005c:  call       int32 HelloWorld.Program::Return()
    IL_0061:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0066:  nop
    IL_0067:  ldc.i4.0
    IL_0068:  stloc.2
    IL_0069:  br.s       IL_00a0

    IL_006b:  nop
    .try
    {
      IL_006c:  nop
      IL_006d:  ldloc.2
      IL_006e:  ldc.i4.0
      IL_006f:  ceq
      IL_0071:  stloc.3
      IL_0072:  ldloc.3
      IL_0073:  brfalse.s  IL_0077

      IL_0075:  leave.s    IL_009c

      IL_0077:  ldloc.2
      IL_0078:  ldc.i4.2
      IL_0079:  ceq
      IL_007b:  stloc.s    V_4
      IL_007d:  ldloc.s    V_4
      IL_007f:  brfalse.s  IL_0083

      IL_0081:  leave.s    IL_00aa

      IL_0083:  ldloc.2
      IL_0084:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_0089:  nop
      IL_008a:  nop
      IL_008b:  leave.s    IL_009b

    }  // end .try
    finally
    {
      IL_008d:  nop
      IL_008e:  ldstr      "loop finally"
      IL_0093:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0098:  nop
      IL_0099:  nop
      IL_009a:  endfinally
    }  // end handler
    IL_009b:  nop
    IL_009c:  ldloc.2
    IL_009d:  ldc.i4.1
    IL_009e:  add
    IL_009f:  stloc.2
    IL_00a0:  ldloc.2
    IL_00a1:  ldc.i4.4
    IL_00a2:  clt
    IL_00a4:  stloc.s    V_5
    IL_00a6:  ldloc.s    V_5
    IL_00a8:  brtrue.s   IL_006b

    IL_00aa:  ldstr      "done"
    IL_00af:  call       void [System.Console]System.Console::WriteLine(string)
    IL_00b4:  nop
    IL_00b5:  ret
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
