
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
// MVID: {37ed338a-c52f-4e17-b7d6-c3a4ccd13ecd}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x1029c4000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static int32 
          NestedReturn() cil managed
  {
    // Code size       38 (0x26)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    .try
    {
      IL_0001:  nop
      .try
      {
        IL_0002:  nop
        IL_0003:  ldc.i4.s   9
        IL_0005:  stloc.0
        IL_0006:  leave.s    IL_0024

      }  // end .try
      finally
      {
        IL_0008:  nop
        IL_0009:  ldstr      "nested inner"
        IL_000e:  call       void [System.Console]System.Console::WriteLine(string)
        IL_0013:  nop
        IL_0014:  nop
        IL_0015:  endfinally
      }  // end handler
    }  // end .try
    finally
    {
      IL_0016:  nop
      IL_0017:  ldstr      "nested outer"
      IL_001c:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0021:  nop
      IL_0022:  nop
      IL_0023:  endfinally
    }  // end handler
    IL_0024:  ldloc.0
    IL_0025:  ret
  } // end of method Program::NestedReturn

  .method private hidebysig static void  Replace() cil managed
  {
    // Code size       25 (0x19)
    .maxstack  1
    IL_0000:  nop
    .try
    {
      IL_0001:  nop
      IL_0002:  ldstr      "old"
      IL_0007:  newobj     instance void [System.Runtime]System.Exception::.ctor(string)
      IL_000c:  throw

    }  // end .try
    finally
    {
      IL_000d:  nop
      IL_000e:  ldstr      "new"
      IL_0013:  newobj     instance void [System.Runtime]System.InvalidOperationException::.ctor(string)
      IL_0018:  throw
    }  // end handler
  } // end of method Program::Replace

  .method private hidebysig static void  Rethrow() cil managed
  {
    // Code size       46 (0x2e)
    .maxstack  1
    .locals init (class [System.Runtime]System.Exception V_0)
    IL_0000:  nop
    .try
    {
      IL_0001:  nop
      IL_0002:  ldstr      "original"
      IL_0007:  newobj     instance void [System.Runtime]System.Exception::.ctor(string)
      IL_000c:  throw

    }  // end .try
    catch [System.Runtime]System.Exception 
    {
      IL_000d:  pop
      IL_000e:  nop
      .try
      {
        IL_000f:  nop
        IL_0010:  ldstr      "nested"
        IL_0015:  newobj     instance void [System.Runtime]System.Exception::.ctor(string)
        IL_001a:  throw

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_001b:  stloc.0
        IL_001c:  nop
        IL_001d:  ldloc.0
        IL_001e:  callvirt   instance string [System.Runtime]System.Exception::get_Message()
        IL_0023:  call       void [System.Console]System.Console::WriteLine(string)
        IL_0028:  nop
        IL_0029:  nop
        IL_002a:  leave.s    IL_002c

      }  // end handler
      IL_002c:  rethrow
    }  // end handler
  } // end of method Program::Rethrow

  .method private hidebysig static void  Main() cil managed
  {
    .entrypoint
    // Code size       288 (0x120)
    .maxstack  2
    .locals init (int32 V_0,
             class [System.Runtime]System.Exception V_1,
             class [System.Runtime]System.Exception V_2,
             int32 V_3,
             bool V_4,
             bool V_5,
             bool V_6,
             bool V_7,
             class [System.Runtime]System.Exception V_8,
             class [System.Runtime]System.Exception V_9)
    IL_0000:  nop
    IL_0001:  call       int32 HelloWorld.Program::NestedReturn()
    IL_0006:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_000b:  nop
    .try
    {
      IL_000c:  nop
      IL_000d:  call       void HelloWorld.Program::Replace()
      IL_0012:  nop
      IL_0013:  nop
      IL_0014:  leave.s    IL_0027

    }  // end .try
    catch [System.Runtime]System.Exception 
    {
      IL_0016:  stloc.1
      IL_0017:  nop
      IL_0018:  ldloc.1
      IL_0019:  callvirt   instance string [System.Runtime]System.Exception::get_Message()
      IL_001e:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0023:  nop
      IL_0024:  nop
      IL_0025:  leave.s    IL_0027

    }  // end handler
    IL_0027:  nop
    .try
    {
      IL_0028:  nop
      IL_0029:  call       void HelloWorld.Program::Rethrow()
      IL_002e:  nop
      IL_002f:  nop
      IL_0030:  leave.s    IL_0043

    }  // end .try
    catch [System.Runtime]System.Exception 
    {
      IL_0032:  stloc.2
      IL_0033:  nop
      IL_0034:  ldloc.2
      IL_0035:  callvirt   instance string [System.Runtime]System.Exception::get_Message()
      IL_003a:  call       void [System.Console]System.Console::WriteLine(string)
      IL_003f:  nop
      IL_0040:  nop
      IL_0041:  leave.s    IL_0043

    }  // end handler
    IL_0043:  ldc.i4.0
    IL_0044:  stloc.0
    .try
    {
      IL_0045:  nop
      IL_0046:  ldc.i4.0
      IL_0047:  stloc.3
      IL_0048:  br.s       IL_0098

      IL_004a:  nop
      .try
      {
        .try
        {
          IL_004b:  nop
          IL_004c:  ldloc.3
          IL_004d:  ldc.i4.1
          IL_004e:  ceq
          IL_0050:  stloc.s    V_4
          IL_0052:  ldloc.s    V_4
          IL_0054:  brfalse.s  IL_0061

          IL_0056:  ldstr      "arg"
          IL_005b:  newobj     instance void [System.Runtime]System.ArgumentException::.ctor(string)
          IL_0060:  throw

          IL_0061:  ldloc.3
          IL_0062:  ldc.i4.2
          IL_0063:  ceq
          IL_0065:  stloc.s    V_5
          IL_0067:  ldloc.s    V_5
          IL_0069:  brfalse.s  IL_006d

          IL_006b:  leave.s    IL_0094

          IL_006d:  ldloc.3
          IL_006e:  ldc.i4.4
          IL_006f:  ceq
          IL_0071:  stloc.s    V_6
          IL_0073:  ldloc.s    V_6
          IL_0075:  brfalse.s  IL_0079

          IL_0077:  leave.s    IL_00a2

          IL_0079:  ldloc.0
          IL_007a:  ldloc.3
          IL_007b:  add
          IL_007c:  stloc.0
          IL_007d:  nop
          IL_007e:  leave.s    IL_008a

        }  // end .try
        catch [System.Runtime]System.SystemException 
        {
          IL_0080:  pop
          IL_0081:  nop
          IL_0082:  ldloc.0
          IL_0083:  ldc.i4.s   10
          IL_0085:  add
          IL_0086:  stloc.0
          IL_0087:  nop
          IL_0088:  leave.s    IL_008a

        }  // end handler
        IL_008a:  leave.s    IL_0093

      }  // end .try
      finally
      {
        IL_008c:  nop
        IL_008d:  ldloc.0
        IL_008e:  ldc.i4.1
        IL_008f:  add
        IL_0090:  stloc.0
        IL_0091:  nop
        IL_0092:  endfinally
      }  // end handler
      IL_0093:  nop
      IL_0094:  ldloc.3
      IL_0095:  ldc.i4.1
      IL_0096:  add
      IL_0097:  stloc.3
      IL_0098:  ldloc.3
      IL_0099:  ldc.i4.5
      IL_009a:  clt
      IL_009c:  stloc.s    V_7
      IL_009e:  ldloc.s    V_7
      IL_00a0:  brtrue.s   IL_004a

      IL_00a2:  nop
      IL_00a3:  leave.s    IL_00af

    }  // end .try
    finally
    {
      IL_00a5:  nop
      IL_00a6:  ldloc.0
      IL_00a7:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_00ac:  nop
      IL_00ad:  nop
      IL_00ae:  endfinally
    }  // end handler
    IL_00af:  nop
    .try
    {
      IL_00b0:  nop
      IL_00b1:  ldstr      "x"
      IL_00b6:  newobj     instance void [System.Runtime]System.ArgumentNullException::.ctor(string)
      IL_00bb:  throw

    }  // end .try
    catch [System.Runtime]System.ArgumentException 
    {
      IL_00bc:  pop
      IL_00bd:  nop
      IL_00be:  ldstr      "base first"
      IL_00c3:  call       void [System.Console]System.Console::WriteLine(string)
      IL_00c8:  nop
      IL_00c9:  nop
      IL_00ca:  leave.s    IL_00dc

    }  // end handler
    catch [System.Runtime]System.Exception 
    {
      IL_00cc:  pop
      IL_00cd:  nop
      IL_00ce:  ldstr      "wrong base"
      IL_00d3:  call       void [System.Console]System.Console::WriteLine(string)
      IL_00d8:  nop
      IL_00d9:  nop
      IL_00da:  leave.s    IL_00dc

    }  // end handler
    IL_00dc:  nop
    .try
    {
      IL_00dd:  nop
      .try
      {
        IL_00de:  nop
        IL_00df:  ldstr      "e"
        IL_00e4:  newobj     instance void [System.Runtime]System.Exception::.ctor(string)
        IL_00e9:  throw

      }  // end .try
      finally
      {
        IL_00ea:  nop
        .try
        {
          IL_00eb:  nop
          IL_00ec:  ldstr      "f"
          IL_00f1:  newobj     instance void [System.Runtime]System.Exception::.ctor(string)
          IL_00f6:  throw

        }  // end .try
        catch [System.Runtime]System.Exception 
        {
          IL_00f7:  stloc.s    V_8
          IL_00f9:  nop
          IL_00fa:  ldloc.s    V_8
          IL_00fc:  callvirt   instance string [System.Runtime]System.Exception::get_Message()
          IL_0101:  call       void [System.Console]System.Console::WriteLine(string)
          IL_0106:  nop
          IL_0107:  nop
          IL_0108:  leave.s    IL_010a

        }  // end handler
        IL_010a:  nop
        IL_010b:  endfinally
      }  // end handler
    }  // end .try
    catch [System.Runtime]System.Exception 
    {
      IL_010c:  stloc.s    V_9
      IL_010e:  nop
      IL_010f:  ldloc.s    V_9
      IL_0111:  callvirt   instance string [System.Runtime]System.Exception::get_Message()
      IL_0116:  call       void [System.Console]System.Console::WriteLine(string)
      IL_011b:  nop
      IL_011c:  nop
      IL_011d:  leave.s    IL_011f

    }  // end handler
    IL_011f:  ret
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
