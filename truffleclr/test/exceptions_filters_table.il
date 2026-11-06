
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
.assembly 'eh-table'
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
  .custom instance void [System.Runtime]System.Reflection.AssemblyCompanyAttribute::.ctor(string) = ( 01 00 08 65 68 2D 74 61 62 6C 65 00 00 )          // ...eh-table..
  .custom instance void [System.Runtime]System.Reflection.AssemblyConfigurationAttribute::.ctor(string) = ( 01 00 05 44 65 62 75 67 00 00 )                   // ...Debug..
  .custom instance void [System.Runtime]System.Reflection.AssemblyFileVersionAttribute::.ctor(string) = ( 01 00 07 31 2E 30 2E 30 2E 30 00 00 )             // ...1.0.0.0..
  .custom instance void [System.Runtime]System.Reflection.AssemblyInformationalVersionAttribute::.ctor(string) = ( 01 00 05 31 2E 30 2E 30 00 00 )                   // ...1.0.0..
  .custom instance void [System.Runtime]System.Reflection.AssemblyProductAttribute::.ctor(string) = ( 01 00 08 65 68 2D 74 61 62 6C 65 00 00 )          // ...eh-table..
  .custom instance void [System.Runtime]System.Reflection.AssemblyTitleAttribute::.ctor(string) = ( 01 00 08 65 68 2D 74 61 62 6C 65 00 00 )          // ...eh-table..
  .hash algorithm 0x00008004
  .ver 1:0:0:0
}
.module 'eh-table.dll'
// MVID: {e797dd62-4533-4573-bf72-2b342b7ae52f}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x1027c0000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static bool  Filter(int32 'value') cil managed
  {
    // Code size       36 (0x24)
    .maxstack  2
    .locals init (bool V_0,
             bool V_1)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldc.i4.2
    IL_000a:  ceq
    IL_000c:  stloc.0
    IL_000d:  ldloc.0
    IL_000e:  brfalse.s  IL_001b

    IL_0010:  ldstr      "filter throws"
    IL_0015:  newobj     instance void [System.Runtime]System.Exception::.ctor(string)
    IL_001a:  throw

    IL_001b:  ldarg.0
    IL_001c:  ldc.i4.3
    IL_001d:  ceq
    IL_001f:  stloc.1
    IL_0020:  br.s       IL_0022

    IL_0022:  ldloc.1
    IL_0023:  ret
  } // end of method Program::Filter

  .method private hidebysig static void  Main() cil managed
  {
    .entrypoint
    // Code size       259 (0x103)
    .maxstack  2
    .locals init (int32 V_0,
             bool V_1,
             bool V_2,
             class [System.Runtime]System.InvalidOperationException V_3,
             bool V_4,
             class [System.Runtime]System.Exception V_5,
             class [System.Runtime]System.Exception V_6,
             int32 V_7,
             bool V_8)
    IL_0000:  nop
    IL_0001:  nop
    IL_0002:  ldstr      "filtered"
    IL_0007:  newobj     instance void [System.Runtime]System.InvalidOperationException::.ctor(string)
    IL_000c:  throw

    IL_000d:  pop
    IL_000e:  nop
    IL_000f:  ldstr      "wrong type"
    IL_0014:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0019:  nop
    IL_001a:  nop
    IL_001b:  leave      IL_00a1

    IL_0020:  isinst     [System.Runtime]System.Exception
    IL_0025:  dup
    IL_0026:  brtrue.s   IL_002c

    IL_0028:  pop
    IL_0029:  ldc.i4.0
    IL_002a:  br.s       IL_0038

    IL_002c:  pop
    IL_002d:  ldc.i4.1
    IL_002e:  call       bool HelloWorld.Program::Filter(int32)
    IL_0033:  stloc.1
    IL_0034:  ldloc.1
    IL_0035:  ldc.i4.0
    IL_0036:  cgt.un
    IL_0038:  endfilter
    IL_003a:  pop
    IL_003b:  nop
    IL_003c:  ldstr      "wrong false"
    IL_0041:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0046:  nop
    IL_0047:  nop
    IL_0048:  leave.s    IL_00a1

    IL_004a:  isinst     [System.Runtime]System.Exception
    IL_004f:  dup
    IL_0050:  brtrue.s   IL_0056

    IL_0052:  pop
    IL_0053:  ldc.i4.0
    IL_0054:  br.s       IL_0062

    IL_0056:  pop
    IL_0057:  ldc.i4.2
    IL_0058:  call       bool HelloWorld.Program::Filter(int32)
    IL_005d:  stloc.2
    IL_005e:  ldloc.2
    IL_005f:  ldc.i4.0
    IL_0060:  cgt.un
    IL_0062:  endfilter
    IL_0064:  pop
    IL_0065:  nop
    IL_0066:  ldstr      "wrong throw"
    IL_006b:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0070:  nop
    IL_0071:  nop
    IL_0072:  leave.s    IL_00a1

    IL_0074:  isinst     [System.Runtime]System.InvalidOperationException
    IL_0079:  dup
    IL_007a:  brtrue.s   IL_0080

    IL_007c:  pop
    IL_007d:  ldc.i4.0
    IL_007e:  br.s       IL_008e

    IL_0080:  stloc.3
    IL_0081:  ldc.i4.3
    IL_0082:  call       bool HelloWorld.Program::Filter(int32)
    IL_0087:  stloc.s    V_4
    IL_0089:  ldloc.s    V_4
    IL_008b:  ldc.i4.0
    IL_008c:  cgt.un
    IL_008e:  endfilter
    IL_0090:  pop
    IL_0091:  nop
    IL_0092:  ldloc.3
    IL_0093:  callvirt   instance string [System.Runtime]System.Exception::get_Message()
    IL_0098:  call       void [System.Console]System.Console::WriteLine(string)
    IL_009d:  nop
    IL_009e:  nop
    IL_009f:  leave.s    IL_00a1

    IL_00a1:  nop
    IL_00a2:  nop
    IL_00a3:  nop
    IL_00a4:  ldstr      "again"
    IL_00a9:  newobj     instance void [System.Runtime]System.Exception::.ctor(string)
    IL_00ae:  throw

    IL_00af:  stloc.s    V_5
    IL_00b1:  nop
    IL_00b2:  ldloc.s    V_5
    IL_00b4:  throw

    IL_00b5:  stloc.s    V_6
    IL_00b7:  nop
    IL_00b8:  ldloc.s    V_6
    IL_00ba:  callvirt   instance string [System.Runtime]System.Exception::get_Message()
    IL_00bf:  call       void [System.Console]System.Console::WriteLine(string)
    IL_00c4:  nop
    IL_00c5:  nop
    IL_00c6:  leave.s    IL_00c8

    IL_00c8:  ldc.i4.0
    IL_00c9:  stloc.0
    IL_00ca:  ldc.i4.0
    IL_00cb:  stloc.s    V_7
    IL_00cd:  br.s       IL_00ec

    IL_00cf:  nop
    IL_00d0:  nop
    IL_00d1:  ldstr      "hot"
    IL_00d6:  newobj     instance void [System.Runtime]System.Exception::.ctor(string)
    IL_00db:  throw

    IL_00dc:  pop
    IL_00dd:  nop
    IL_00de:  ldloc.0
    IL_00df:  ldc.i4.1
    IL_00e0:  add
    IL_00e1:  stloc.0
    IL_00e2:  nop
    IL_00e3:  leave.s    IL_00e5

    IL_00e5:  nop
    IL_00e6:  ldloc.s    V_7
    IL_00e8:  ldc.i4.1
    IL_00e9:  add
    IL_00ea:  stloc.s    V_7
    IL_00ec:  ldloc.s    V_7
    IL_00ee:  ldc.i4     0x186a0
    IL_00f3:  clt
    IL_00f5:  stloc.s    V_8
    IL_00f7:  ldloc.s    V_8
    IL_00f9:  brtrue.s   IL_00cf

    IL_00fb:  ldloc.0
    IL_00fc:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0101:  nop
    IL_0102:  ret
    IL_0103:  
    // Exception count 7
    .try IL_0001 to IL_000d catch [System.Runtime]System.ArgumentException handler IL_000d to IL_0020
    .try IL_0001 to IL_000d filter IL_0020 handler IL_003a to IL_004a
    .try IL_0001 to IL_000d filter IL_004a handler IL_0064 to IL_0074
    .try IL_0001 to IL_000d filter IL_0074 handler IL_0090 to IL_00a1
    .try IL_00a3 to IL_00af catch [System.Runtime]System.Exception handler IL_00af to IL_00b5
    .try IL_00a2 to IL_00b5 catch [System.Runtime]System.Exception handler IL_00b5 to IL_00c8
    .try IL_00d0 to IL_00dc catch [System.Runtime]System.Exception handler IL_00dc to IL_00e5
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
