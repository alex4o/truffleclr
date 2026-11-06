
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
// MVID: {c9ae54d7-5789-4f52-9af0-99a6e8ccfd21}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x1030a0000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Item
       extends [System.Runtime]System.Object
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Item::.ctor

} // end of class HelloWorld.Item

.class private auto ansi beforefieldinit HelloWorld.Box`1<T>
       extends [System.Runtime]System.Object
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Box`1::.ctor

} // end of class HelloWorld.Box`1

.class private sequential ansi sealed beforefieldinit HelloWorld.Value
       extends [System.Runtime]System.ValueType
{
  .field public int32 Number
} // end of class HelloWorld.Value

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static void  Print(object 'value') cil managed
  {
    // Code size       21 (0x15)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  callvirt   instance string [System.Runtime]System.Object::ToString()
    IL_0007:  call       void [System.Console]System.Console::WriteLine(string)
    IL_000c:  nop
    IL_000d:  ldarg.0
    IL_000e:  call       void [System.Console]System.Console::WriteLine(object)
    IL_0013:  nop
    IL_0014:  ret
  } // end of method Program::Print

  .method private hidebysig static void  Main() cil managed
  {
    .entrypoint
    // Code size       230 (0xe6)
    .maxstack  1
    IL_0000:  nop
    IL_0001:  ldc.i4.1
    IL_0002:  newarr     [System.Runtime]System.Int32
    IL_0007:  call       void HelloWorld.Program::Print(object)
    IL_000c:  nop
    IL_000d:  ldc.i4.1
    IL_000e:  newarr     [System.Runtime]System.UInt32
    IL_0013:  call       void HelloWorld.Program::Print(object)
    IL_0018:  nop
    IL_0019:  ldc.i4.1
    IL_001a:  newarr     [System.Runtime]System.Int64
    IL_001f:  call       void HelloWorld.Program::Print(object)
    IL_0024:  nop
    IL_0025:  ldc.i4.1
    IL_0026:  newarr     [System.Runtime]System.UInt64
    IL_002b:  call       void HelloWorld.Program::Print(object)
    IL_0030:  nop
    IL_0031:  ldc.i4.1
    IL_0032:  newarr     [System.Runtime]System.Byte
    IL_0037:  call       void HelloWorld.Program::Print(object)
    IL_003c:  nop
    IL_003d:  ldc.i4.1
    IL_003e:  newarr     [System.Runtime]System.SByte
    IL_0043:  call       void HelloWorld.Program::Print(object)
    IL_0048:  nop
    IL_0049:  ldc.i4.1
    IL_004a:  newarr     [System.Runtime]System.Int16
    IL_004f:  call       void HelloWorld.Program::Print(object)
    IL_0054:  nop
    IL_0055:  ldc.i4.1
    IL_0056:  newarr     [System.Runtime]System.UInt16
    IL_005b:  call       void HelloWorld.Program::Print(object)
    IL_0060:  nop
    IL_0061:  ldc.i4.1
    IL_0062:  newarr     [System.Runtime]System.Char
    IL_0067:  call       void HelloWorld.Program::Print(object)
    IL_006c:  nop
    IL_006d:  ldc.i4.1
    IL_006e:  newarr     [System.Runtime]System.Boolean
    IL_0073:  call       void HelloWorld.Program::Print(object)
    IL_0078:  nop
    IL_0079:  ldc.i4.1
    IL_007a:  newarr     [System.Runtime]System.Single
    IL_007f:  call       void HelloWorld.Program::Print(object)
    IL_0084:  nop
    IL_0085:  ldc.i4.1
    IL_0086:  newarr     [System.Runtime]System.Double
    IL_008b:  call       void HelloWorld.Program::Print(object)
    IL_0090:  nop
    IL_0091:  ldc.i4.1
    IL_0092:  newarr     class HelloWorld.Box`1<int32>
    IL_0097:  call       void HelloWorld.Program::Print(object)
    IL_009c:  nop
    IL_009d:  ldc.i4.1
    IL_009e:  newarr     class HelloWorld.Box`1<class HelloWorld.Box`1<int32>>
    IL_00a3:  call       void HelloWorld.Program::Print(object)
    IL_00a8:  nop
    IL_00a9:  ldc.i4.1
    IL_00aa:  newarr     class HelloWorld.Box`1<int32[]>
    IL_00af:  call       void HelloWorld.Program::Print(object)
    IL_00b4:  nop
    IL_00b5:  ldc.i4.1
    IL_00b6:  newarr     [System.Runtime]System.String
    IL_00bb:  call       void HelloWorld.Program::Print(object)
    IL_00c0:  nop
    IL_00c1:  ldc.i4.1
    IL_00c2:  newarr     [System.Runtime]System.Object
    IL_00c7:  call       void HelloWorld.Program::Print(object)
    IL_00cc:  nop
    IL_00cd:  ldc.i4.1
    IL_00ce:  newarr     HelloWorld.Item
    IL_00d3:  call       void HelloWorld.Program::Print(object)
    IL_00d8:  nop
    IL_00d9:  ldc.i4.1
    IL_00da:  newarr     HelloWorld.Value
    IL_00df:  call       void HelloWorld.Program::Print(object)
    IL_00e4:  nop
    IL_00e5:  ret
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
