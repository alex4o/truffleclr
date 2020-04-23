
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
// MVID: {23560a37-9311-43a5-bee5-4c45a26bc97f}
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x00007EFCCF15F000


// =============== CLASS MEMBERS DECLARATION ===================

.class public auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .field private static literal int32 minDepth = int32(0x00000004)
  .method private hidebysig static void  Print(int32 depth,
                                               int32 check) cil managed
  {
    // Code size       38 (0x26)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldstr      "tree of depth "
    IL_0006:  call       void [System.Console]System.Console::Write(string)
    IL_000b:  nop
    IL_000c:  ldarg.0
    IL_000d:  call       void [System.Console]System.Console::Write(int32)
    IL_0012:  nop
    IL_0013:  ldstr      "\t check: "
    IL_0018:  call       void [System.Console]System.Console::Write(string)
    IL_001d:  nop
    IL_001e:  ldarg.1
    IL_001f:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0024:  nop
    IL_0025:  ret
  } // end of method binarytrees::Print

  .method public hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       222 (0xde)
    .maxstack  3
    .locals init (int32 V_0,
             int32 V_1,
             int32 V_2,
             int32 V_3,
             class HelloWorld.TreeNode V_4,
             int32 V_5,
             int32 V_6,
             int32 V_7,
             bool V_8,
             bool V_9)
    IL_0000:  nop
    IL_0001:  ldc.i4.s   18
    IL_0003:  stloc.0
    IL_0004:  ldc.i4.6
    IL_0005:  ldloc.0
    IL_0006:  bgt.s      IL_000b

    IL_0008:  ldloc.0
    IL_0009:  br.s       IL_000c

    IL_000b:  ldc.i4.6
    IL_000c:  stloc.1
    IL_000d:  ldloc.1
    IL_000e:  ldc.i4.1
    IL_000f:  add
    IL_0010:  stloc.2
    IL_0011:  ldc.i4.0
    IL_0012:  ldloc.2
    IL_0013:  call       class HelloWorld.TreeNode HelloWorld.TreeNode::BottomUpTree(int32,
                                                                                     int32)
    IL_0018:  callvirt   instance int32 HelloWorld.TreeNode::itemCheck()
    IL_001d:  stloc.3
    IL_001e:  ldstr      "stretch "
    IL_0023:  call       void [System.Console]System.Console::Write(string)
    IL_0028:  nop
    IL_0029:  ldloc.1
    IL_002a:  ldloc.3
    IL_002b:  call       void HelloWorld.Program::Print(int32,
                                                            int32)
    IL_0030:  nop
    IL_0031:  ldc.i4.0
    IL_0032:  ldloc.1
    IL_0033:  call       class HelloWorld.TreeNode HelloWorld.TreeNode::BottomUpTree(int32,
                                                                                     int32)
    IL_0038:  stloc.s    V_4
    IL_003a:  ldc.i4.4
    IL_003b:  stloc.s    V_5
    IL_003d:  br.s       IL_00b3

    IL_003f:  nop
    IL_0040:  ldc.i4.1
    IL_0041:  ldloc.1
    IL_0042:  ldloc.s    V_5
    IL_0044:  sub
    IL_0045:  ldc.i4.4
    IL_0046:  add
    IL_0047:  ldc.i4.s   31
    IL_0049:  and
    IL_004a:  shl
    IL_004b:  stloc.s    V_6
    IL_004d:  ldc.i4.0
    IL_004e:  stloc.3
    IL_004f:  ldc.i4.1
    IL_0050:  stloc.s    V_7
    IL_0052:  br.s       IL_007f

    IL_0054:  nop
    IL_0055:  ldloc.3
    IL_0056:  ldloc.s    V_7
    IL_0058:  ldloc.s    V_5
    IL_005a:  call       class HelloWorld.TreeNode HelloWorld.TreeNode::BottomUpTree(int32,
                                                                                     int32)
    IL_005f:  callvirt   instance int32 HelloWorld.TreeNode::itemCheck()
    IL_0064:  add
    IL_0065:  stloc.3
    IL_0066:  ldloc.3
    IL_0067:  ldloc.s    V_7
    IL_0069:  neg
    IL_006a:  ldloc.s    V_5
    IL_006c:  call       class HelloWorld.TreeNode HelloWorld.TreeNode::BottomUpTree(int32,
                                                                                     int32)
    IL_0071:  callvirt   instance int32 HelloWorld.TreeNode::itemCheck()
    IL_0076:  add
    IL_0077:  stloc.3
    IL_0078:  nop
    IL_0079:  ldloc.s    V_7
    IL_007b:  ldc.i4.1
    IL_007c:  add
    IL_007d:  stloc.s    V_7
    IL_007f:  ldloc.s    V_7
    IL_0081:  ldloc.s    V_6
    IL_0083:  cgt
    IL_0085:  ldc.i4.0
    IL_0086:  ceq
    IL_0088:  stloc.s    V_8
    IL_008a:  ldloc.s    V_8
    IL_008c:  brtrue.s   IL_0054

    IL_008e:  ldloc.s    V_6
    IL_0090:  ldc.i4.2
    IL_0091:  mul
    IL_0092:  call       void [System.Console]System.Console::Write(int32)
    IL_0097:  nop
    IL_0098:  ldstr      "\t "
    IL_009d:  call       void [System.Console]System.Console::Write(string)
    IL_00a2:  nop
    IL_00a3:  ldloc.s    V_5
    IL_00a5:  ldloc.3
    IL_00a6:  call       void HelloWorld.Program::Print(int32,
                                                            int32)
    IL_00ab:  nop
    IL_00ac:  nop
    IL_00ad:  ldloc.s    V_5
    IL_00af:  ldc.i4.2
    IL_00b0:  add
    IL_00b1:  stloc.s    V_5
    IL_00b3:  ldloc.s    V_5
    IL_00b5:  ldloc.1
    IL_00b6:  cgt
    IL_00b8:  ldc.i4.0
    IL_00b9:  ceq
    IL_00bb:  stloc.s    V_9
    IL_00bd:  ldloc.s    V_9
    IL_00bf:  brtrue     IL_003f

    IL_00c4:  ldstr      "long lived "
    IL_00c9:  call       void [System.Console]System.Console::Write(string)
    IL_00ce:  nop
    IL_00cf:  ldloc.1
    IL_00d0:  ldloc.s    V_4
    IL_00d2:  callvirt   instance int32 HelloWorld.TreeNode::itemCheck()
    IL_00d7:  call       void HelloWorld.Program::Print(int32,
                                                            int32)
    IL_00dc:  nop
    IL_00dd:  ret
  } // end of method binarytrees::Main

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method binarytrees::.ctor

} // end of class HelloWorld.Program

.class public auto ansi beforefieldinit HelloWorld.TreeNode
       extends [System.Runtime]System.Object
{
  .field private class HelloWorld.TreeNode left
  .field private class HelloWorld.TreeNode right
  .field private int32 item
  .method private hidebysig specialname rtspecialname 
          instance void  .ctor(int32 item) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      int32 HelloWorld.TreeNode::item
    IL_000f:  ret
  } // end of method TreeNode::.ctor

  .method public hidebysig static class HelloWorld.TreeNode 
          BottomUpTree(int32 item,
                       int32 depth) cil managed
  {
    // Code size       55 (0x37)
    .maxstack  4
    .locals init (bool V_0,
             class HelloWorld.TreeNode V_1)
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  ldc.i4.0
    IL_0003:  cgt
    IL_0005:  stloc.0
    IL_0006:  ldloc.0
    IL_0007:  brfalse.s  IL_002b

    IL_0009:  nop
    IL_000a:  ldc.i4.2
    IL_000b:  ldarg.0
    IL_000c:  mul
    IL_000d:  ldc.i4.1
    IL_000e:  sub
    IL_000f:  ldarg.1
    IL_0010:  ldc.i4.1
    IL_0011:  sub
    IL_0012:  call       class HelloWorld.TreeNode HelloWorld.TreeNode::BottomUpTree(int32,
                                                                                     int32)
    IL_0017:  ldc.i4.2
    IL_0018:  ldarg.0
    IL_0019:  mul
    IL_001a:  ldarg.1
    IL_001b:  ldc.i4.1
    IL_001c:  sub
    IL_001d:  call       class HelloWorld.TreeNode HelloWorld.TreeNode::BottomUpTree(int32,
                                                                                     int32)
    IL_0022:  ldarg.0
    IL_0023:  newobj     instance void HelloWorld.TreeNode::.ctor(class HelloWorld.TreeNode,
                                                                  class HelloWorld.TreeNode,
                                                                  int32)
    IL_0028:  stloc.1
    IL_0029:  br.s       IL_0035

    IL_002b:  nop
    IL_002c:  ldarg.0
    IL_002d:  newobj     instance void HelloWorld.TreeNode::.ctor(int32)
    IL_0032:  stloc.1
    IL_0033:  br.s       IL_0035

    IL_0035:  ldloc.1
    IL_0036:  ret
  } // end of method TreeNode::BottomUpTree

  .method private hidebysig specialname rtspecialname 
          instance void  .ctor(class HelloWorld.TreeNode left,
                               class HelloWorld.TreeNode right,
                               int32 item) cil managed
  {
    // Code size       30 (0x1e)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      class HelloWorld.TreeNode HelloWorld.TreeNode::left
    IL_000f:  ldarg.0
    IL_0010:  ldarg.2
    IL_0011:  stfld      class HelloWorld.TreeNode HelloWorld.TreeNode::right
    IL_0016:  ldarg.0
    IL_0017:  ldarg.3
    IL_0018:  stfld      int32 HelloWorld.TreeNode::item
    IL_001d:  ret
  } // end of method TreeNode::.ctor

  .method public hidebysig instance int32 
          itemCheck() cil managed
  {
    // Code size       58 (0x3a)
    .maxstack  2
    .locals init (bool V_0,
             int32 V_1)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      class HelloWorld.TreeNode HelloWorld.TreeNode::left
    IL_0007:  ldnull
    IL_0008:  ceq
    IL_000a:  stloc.0
    IL_000b:  ldloc.0
    IL_000c:  brfalse.s  IL_0017

    IL_000e:  ldarg.0
    IL_000f:  ldfld      int32 HelloWorld.TreeNode::item
    IL_0014:  stloc.1
    IL_0015:  br.s       IL_0038

    IL_0017:  ldarg.0
    IL_0018:  ldfld      int32 HelloWorld.TreeNode::item
    IL_001d:  ldarg.0
    IL_001e:  ldfld      class HelloWorld.TreeNode HelloWorld.TreeNode::left
    IL_0023:  callvirt   instance int32 HelloWorld.TreeNode::itemCheck()
    IL_0028:  add
    IL_0029:  ldarg.0
    IL_002a:  ldfld      class HelloWorld.TreeNode HelloWorld.TreeNode::right
    IL_002f:  callvirt   instance int32 HelloWorld.TreeNode::itemCheck()
    IL_0034:  sub
    IL_0035:  stloc.1
    IL_0036:  br.s       IL_0038

    IL_0038:  ldloc.1
    IL_0039:  ret
  } // end of method TreeNode::itemCheck

} // end of class HelloWorld.TreeNode


// =============================================================

// *********** DISASSEMBLY COMPLETE ***********************
