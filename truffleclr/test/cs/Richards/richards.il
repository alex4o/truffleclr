
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
.assembly Richards
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
  .custom instance void [System.Runtime]System.Reflection.AssemblyCompanyAttribute::.ctor(string) = ( 01 00 08 52 69 63 68 61 72 64 73 00 00 )          // ...Richards..
  .custom instance void [System.Runtime]System.Reflection.AssemblyConfigurationAttribute::.ctor(string) = ( 01 00 05 44 65 62 75 67 00 00 )                   // ...Debug..
  .custom instance void [System.Runtime]System.Reflection.AssemblyFileVersionAttribute::.ctor(string) = ( 01 00 07 31 2E 30 2E 30 2E 30 00 00 )             // ...1.0.0.0..
  .custom instance void [System.Runtime]System.Reflection.AssemblyInformationalVersionAttribute::.ctor(string) = ( 01 00 05 31 2E 30 2E 30 00 00 )                   // ...1.0.0..
  .custom instance void [System.Runtime]System.Reflection.AssemblyProductAttribute::.ctor(string) = ( 01 00 08 52 69 63 68 61 72 64 73 00 00 )          // ...Richards..
  .custom instance void [System.Runtime]System.Reflection.AssemblyTitleAttribute::.ctor(string) = ( 01 00 08 52 69 63 68 61 72 64 73 00 00 )          // ...Richards..
  .hash algorithm 0x00008004
  .ver 1:0:0:0
}
.module Richards.dll
// MVID: {3da0592f-467b-4e77-9b3d-9b3574df342c}
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x00007FB930FB2000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       15 (0xf)
    .maxstack  1
    .locals init (class Richards.Richards V_0)
    IL_0000:  nop
    IL_0001:  newobj     instance void Richards.Richards::.ctor()
    IL_0006:  stloc.0
    IL_0007:  ldloc.0
    IL_0008:  callvirt   instance void Richards.Richards::run()
    IL_000d:  nop
    IL_000e:  ret
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

.class private auto ansi beforefieldinit Richards.DeviceTask
       extends Richards.Task
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(class Richards.Scheduler scheduler) cil managed
  {
    // Code size       23 (0x17)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void Richards.Task::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      class Richards.Scheduler Richards.Task::scheduler
    IL_000f:  ldarg.0
    IL_0010:  ldnull
    IL_0011:  stfld      object Richards.Task::v1
    IL_0016:  ret
  } // end of method DeviceTask::.ctor

  .method public hidebysig virtual instance class Richards.TaskControlBlock 
          run(class Richards.Packet packet) cil managed
  {
    // Code size       95 (0x5f)
    .maxstack  2
    .locals init (bool V_0,
             object V_1,
             bool V_2,
             class Richards.TaskControlBlock V_3)
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  ldnull
    IL_0003:  ceq
    IL_0005:  stloc.0
    IL_0006:  ldloc.0
    IL_0007:  brfalse.s  IL_0047

    IL_0009:  nop
    IL_000a:  ldarg.0
    IL_000b:  ldfld      object Richards.Task::v1
    IL_0010:  ldnull
    IL_0011:  ceq
    IL_0013:  stloc.2
    IL_0014:  ldloc.2
    IL_0015:  brfalse.s  IL_0025

    IL_0017:  ldarg.0
    IL_0018:  ldfld      class Richards.Scheduler Richards.Task::scheduler
    IL_001d:  callvirt   instance class Richards.TaskControlBlock Richards.Scheduler::suspendCurrent()
    IL_0022:  stloc.3
    IL_0023:  br.s       IL_005d

    IL_0025:  ldarg.0
    IL_0026:  ldfld      object Richards.Task::v1
    IL_002b:  stloc.1
    IL_002c:  ldarg.0
    IL_002d:  ldnull
    IL_002e:  stfld      object Richards.Task::v1
    IL_0033:  ldarg.0
    IL_0034:  ldfld      class Richards.Scheduler Richards.Task::scheduler
    IL_0039:  ldloc.1
    IL_003a:  castclass  Richards.Packet
    IL_003f:  callvirt   instance class Richards.TaskControlBlock Richards.Scheduler::queue(class Richards.Packet)
    IL_0044:  stloc.3
    IL_0045:  br.s       IL_005d

    IL_0047:  nop
    IL_0048:  ldarg.0
    IL_0049:  ldarg.1
    IL_004a:  stfld      object Richards.Task::v1
    IL_004f:  ldarg.0
    IL_0050:  ldfld      class Richards.Scheduler Richards.Task::scheduler
    IL_0055:  callvirt   instance class Richards.TaskControlBlock Richards.Scheduler::holdCurrent()
    IL_005a:  stloc.3
    IL_005b:  br.s       IL_005d

    IL_005d:  ldloc.3
    IL_005e:  ret
  } // end of method DeviceTask::run

} // end of class Richards.DeviceTask

.class private auto ansi beforefieldinit Richards.HandlerTask
       extends Richards.Task
{
  .field private class Richards.Packet v2
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(class Richards.Scheduler scheduler) cil managed
  {
    // Code size       30 (0x1e)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void Richards.Task::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      class Richards.Scheduler Richards.Task::scheduler
    IL_000f:  ldarg.0
    IL_0010:  ldnull
    IL_0011:  stfld      object Richards.Task::v1
    IL_0016:  ldarg.0
    IL_0017:  ldnull
    IL_0018:  stfld      class Richards.Packet Richards.HandlerTask::v2
    IL_001d:  ret
  } // end of method HandlerTask::.ctor

  .method public hidebysig virtual instance class Richards.TaskControlBlock 
          run(class Richards.Packet packet) cil managed
  {
    // Code size       268 (0x10c)
    .maxstack  3
    .locals init (class Richards.Packet V_0,
             bool V_1,
             bool V_2,
             bool V_3,
             int32 V_4,
             class Richards.Packet V_5,
             bool V_6,
             bool V_7,
             class Richards.TaskControlBlock V_8)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      object Richards.Task::v1
    IL_0007:  castclass  Richards.Packet
    IL_000c:  stloc.0
    IL_000d:  ldarg.1
    IL_000e:  ldnull
    IL_000f:  cgt.un
    IL_0011:  stloc.1
    IL_0012:  ldloc.1
    IL_0013:  brfalse.s  IL_0049

    IL_0015:  nop
    IL_0016:  ldarg.1
    IL_0017:  ldfld      valuetype Richards.Kind Richards.Packet::kind
    IL_001c:  ldc.i4.1
    IL_001d:  ceq
    IL_001f:  stloc.2
    IL_0020:  ldloc.2
    IL_0021:  brfalse.s  IL_0034

    IL_0023:  nop
    IL_0024:  ldarg.0
    IL_0025:  ldarg.1
    IL_0026:  ldloc.0
    IL_0027:  callvirt   instance class Richards.Packet Richards.Packet::addTo(class Richards.Packet)
    IL_002c:  stfld      object Richards.Task::v1
    IL_0031:  nop
    IL_0032:  br.s       IL_0048

    IL_0034:  nop
    IL_0035:  ldarg.0
    IL_0036:  ldarg.1
    IL_0037:  ldarg.0
    IL_0038:  ldfld      class Richards.Packet Richards.HandlerTask::v2
    IL_003d:  callvirt   instance class Richards.Packet Richards.Packet::addTo(class Richards.Packet)
    IL_0042:  stfld      class Richards.Packet Richards.HandlerTask::v2
    IL_0047:  nop
    IL_0048:  nop
    IL_0049:  ldarg.0
    IL_004a:  ldfld      object Richards.Task::v1
    IL_004f:  castclass  Richards.Packet
    IL_0054:  stloc.0
    IL_0055:  ldarg.0
    IL_0056:  ldfld      object Richards.Task::v1
    IL_005b:  ldnull
    IL_005c:  cgt.un
    IL_005e:  stloc.3
    IL_005f:  ldloc.3
    IL_0060:  brfalse    IL_00fa

    IL_0065:  nop
    IL_0066:  ldloc.0
    IL_0067:  ldfld      int32 Richards.Packet::a1
    IL_006c:  stloc.s    V_4
    IL_006e:  ldloc.s    V_4
    IL_0070:  ldc.i4.4
    IL_0071:  clt
    IL_0073:  stloc.s    V_6
    IL_0075:  ldloc.s    V_6
    IL_0077:  brfalse.s  IL_00d8

    IL_0079:  nop
    IL_007a:  ldarg.0
    IL_007b:  ldfld      class Richards.Packet Richards.HandlerTask::v2
    IL_0080:  ldnull
    IL_0081:  cgt.un
    IL_0083:  stloc.s    V_7
    IL_0085:  ldloc.s    V_7
    IL_0087:  brfalse.s  IL_00d5

    IL_0089:  nop
    IL_008a:  ldarg.0
    IL_008b:  ldfld      class Richards.Packet Richards.HandlerTask::v2
    IL_0090:  stloc.s    V_5
    IL_0092:  ldarg.0
    IL_0093:  ldarg.0
    IL_0094:  ldfld      class Richards.Packet Richards.HandlerTask::v2
    IL_0099:  ldfld      class Richards.Packet Richards.Packet::link
    IL_009e:  stfld      class Richards.Packet Richards.HandlerTask::v2
    IL_00a3:  ldloc.s    V_5
    IL_00a5:  ldloc.0
    IL_00a6:  ldfld      int32[] Richards.Packet::a2
    IL_00ab:  ldloc.s    V_4
    IL_00ad:  ldelem.i4
    IL_00ae:  stfld      int32 Richards.Packet::a1
    IL_00b3:  ldloc.0
    IL_00b4:  ldloc.s    V_4
    IL_00b6:  ldc.i4.1
    IL_00b7:  add
    IL_00b8:  stfld      int32 Richards.Packet::a1
    IL_00bd:  ldarg.0
    IL_00be:  ldloc.0
    IL_00bf:  stfld      object Richards.Task::v1
    IL_00c4:  ldarg.0
    IL_00c5:  ldfld      class Richards.Scheduler Richards.Task::scheduler
    IL_00ca:  ldloc.s    V_5
    IL_00cc:  callvirt   instance class Richards.TaskControlBlock Richards.Scheduler::queue(class Richards.Packet)
    IL_00d1:  stloc.s    V_8
    IL_00d3:  br.s       IL_0109

    IL_00d5:  nop
    IL_00d6:  br.s       IL_00f9

    IL_00d8:  nop
    IL_00d9:  ldloc.0
    IL_00da:  stloc.s    V_5
    IL_00dc:  ldarg.0
    IL_00dd:  ldloc.0
    IL_00de:  ldfld      class Richards.Packet Richards.Packet::link
    IL_00e3:  stfld      object Richards.Task::v1
    IL_00e8:  ldarg.0
    IL_00e9:  ldfld      class Richards.Scheduler Richards.Task::scheduler
    IL_00ee:  ldloc.s    V_5
    IL_00f0:  callvirt   instance class Richards.TaskControlBlock Richards.Scheduler::queue(class Richards.Packet)
    IL_00f5:  stloc.s    V_8
    IL_00f7:  br.s       IL_0109

    IL_00f9:  nop
    IL_00fa:  ldarg.0
    IL_00fb:  ldfld      class Richards.Scheduler Richards.Task::scheduler
    IL_0100:  callvirt   instance class Richards.TaskControlBlock Richards.Scheduler::suspendCurrent()
    IL_0105:  stloc.s    V_8
    IL_0107:  br.s       IL_0109

    IL_0109:  ldloc.s    V_8
    IL_010b:  ret
  } // end of method HandlerTask::run

} // end of class Richards.HandlerTask

.class private auto ansi beforefieldinit Richards.IdleTask
       extends Richards.Task
{
  .field family int32 count
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(class Richards.Scheduler scheduler,
                               int32 v1,
                               int32 count) cil managed
  {
    // Code size       35 (0x23)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void Richards.Task::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      class Richards.Scheduler Richards.Task::scheduler
    IL_000f:  ldarg.0
    IL_0010:  ldarg.2
    IL_0011:  box        [System.Runtime]System.Int32
    IL_0016:  stfld      object Richards.Task::v1
    IL_001b:  ldarg.0
    IL_001c:  ldarg.3
    IL_001d:  stfld      int32 Richards.IdleTask::count
    IL_0022:  ret
  } // end of method IdleTask::.ctor

  .method public hidebysig virtual instance class Richards.TaskControlBlock 
          run(class Richards.Packet packet) cil managed
  {
    // Code size       132 (0x84)
    .maxstack  3
    .locals init (int32 V_0,
             bool V_1,
             class Richards.TaskControlBlock V_2,
             bool V_3)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      int32 Richards.IdleTask::count
    IL_0008:  ldc.i4.1
    IL_0009:  sub
    IL_000a:  stfld      int32 Richards.IdleTask::count
    IL_000f:  ldarg.0
    IL_0010:  ldfld      object Richards.Task::v1
    IL_0015:  unbox.any  [System.Runtime]System.Int32
    IL_001a:  stloc.0
    IL_001b:  ldarg.0
    IL_001c:  ldfld      int32 Richards.IdleTask::count
    IL_0021:  ldc.i4.0
    IL_0022:  ceq
    IL_0024:  stloc.1
    IL_0025:  ldloc.1
    IL_0026:  brfalse.s  IL_0036

    IL_0028:  ldarg.0
    IL_0029:  ldfld      class Richards.Scheduler Richards.Task::scheduler
    IL_002e:  callvirt   instance class Richards.TaskControlBlock Richards.Scheduler::holdCurrent()
    IL_0033:  stloc.2
    IL_0034:  br.s       IL_0082

    IL_0036:  ldloc.0
    IL_0037:  ldc.i4.1
    IL_0038:  and
    IL_0039:  ldc.i4.0
    IL_003a:  ceq
    IL_003c:  stloc.3
    IL_003d:  ldloc.3
    IL_003e:  brfalse.s  IL_005e

    IL_0040:  nop
    IL_0041:  ldarg.0
    IL_0042:  ldloc.0
    IL_0043:  ldc.i4.1
    IL_0044:  shr
    IL_0045:  box        [System.Runtime]System.Int32
    IL_004a:  stfld      object Richards.Task::v1
    IL_004f:  ldarg.0
    IL_0050:  ldfld      class Richards.Scheduler Richards.Task::scheduler
    IL_0055:  ldc.i4.4
    IL_0056:  callvirt   instance class Richards.TaskControlBlock Richards.Scheduler::release(int32)
    IL_005b:  stloc.2
    IL_005c:  br.s       IL_0082

    IL_005e:  nop
    IL_005f:  ldarg.0
    IL_0060:  ldloc.0
    IL_0061:  ldc.i4.1
    IL_0062:  shr
    IL_0063:  ldc.i4     0xd008
    IL_0068:  xor
    IL_0069:  box        [System.Runtime]System.Int32
    IL_006e:  stfld      object Richards.Task::v1
    IL_0073:  ldarg.0
    IL_0074:  ldfld      class Richards.Scheduler Richards.Task::scheduler
    IL_0079:  ldc.i4.5
    IL_007a:  callvirt   instance class Richards.TaskControlBlock Richards.Scheduler::release(int32)
    IL_007f:  stloc.2
    IL_0080:  br.s       IL_0082

    IL_0082:  ldloc.2
    IL_0083:  ret
  } // end of method IdleTask::run

} // end of class Richards.IdleTask

.class public auto ansi sealed Richards.Kind
       extends [System.Runtime]System.Enum
{
  .field public specialname rtspecialname int32 value__
  .field public static literal valuetype Richards.Kind DEVICE = int32(0x00000000)
  .field public static literal valuetype Richards.Kind WORK = int32(0x00000001)
} // end of class Richards.Kind

.class private auto ansi beforefieldinit Richards.Packet
       extends [System.Runtime]System.Object
{
  .field public class Richards.Packet link
  .field public int32 id
  .field public valuetype Richards.Kind kind
  .field public int32 a1
  .field public int32[] a2
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(class Richards.Packet link,
                               int32 id,
                               valuetype Richards.Kind kind) cil managed
  {
    // Code size       49 (0x31)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      class Richards.Packet Richards.Packet::link
    IL_000f:  ldarg.0
    IL_0010:  ldarg.2
    IL_0011:  stfld      int32 Richards.Packet::id
    IL_0016:  ldarg.0
    IL_0017:  ldarg.3
    IL_0018:  stfld      valuetype Richards.Kind Richards.Packet::kind
    IL_001d:  ldarg.0
    IL_001e:  ldc.i4.0
    IL_001f:  stfld      int32 Richards.Packet::a1
    IL_0024:  ldarg.0
    IL_0025:  ldc.i4.4
    IL_0026:  newarr     [System.Runtime]System.Int32
    IL_002b:  stfld      int32[] Richards.Packet::a2
    IL_0030:  ret
  } // end of method Packet::.ctor

  .method public hidebysig instance class Richards.Packet 
          addTo(class Richards.Packet queue) cil managed
  {
    // Code size       60 (0x3c)
    .maxstack  2
    .locals init (class Richards.Packet V_0,
             class Richards.Packet V_1,
             bool V_2,
             class Richards.Packet V_3,
             bool V_4)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldnull
    IL_0003:  stfld      class Richards.Packet Richards.Packet::link
    IL_0008:  ldarg.1
    IL_0009:  ldnull
    IL_000a:  ceq
    IL_000c:  stloc.2
    IL_000d:  ldloc.2
    IL_000e:  brfalse.s  IL_0014

    IL_0010:  ldarg.0
    IL_0011:  stloc.3
    IL_0012:  br.s       IL_003a

    IL_0014:  ldarg.1
    IL_0015:  stloc.0
    IL_0016:  ldarg.1
    IL_0017:  stloc.1
    IL_0018:  br.s       IL_001e

    IL_001a:  nop
    IL_001b:  ldloc.0
    IL_001c:  stloc.1
    IL_001d:  nop
    IL_001e:  ldloc.1
    IL_001f:  ldfld      class Richards.Packet Richards.Packet::link
    IL_0024:  dup
    IL_0025:  stloc.0
    IL_0026:  ldnull
    IL_0027:  cgt.un
    IL_0029:  stloc.s    V_4
    IL_002b:  ldloc.s    V_4
    IL_002d:  brtrue.s   IL_001a

    IL_002f:  ldloc.1
    IL_0030:  ldarg.0
    IL_0031:  stfld      class Richards.Packet Richards.Packet::link
    IL_0036:  ldarg.1
    IL_0037:  stloc.3
    IL_0038:  br.s       IL_003a

    IL_003a:  ldloc.3
    IL_003b:  ret
  } // end of method Packet::addTo

} // end of class Richards.Packet

.class private auto ansi beforefieldinit Richards.Richards
       extends [System.Runtime]System.Object
{
  .field public static literal int32 ID_IDLE = int32(0x00000000)
  .field public static literal int32 ID_WORKER = int32(0x00000001)
  .field public static literal int32 DATA_SIZE = int32(0x00000004)
  .field public static literal int32 ID_HANDLER_A = int32(0x00000002)
  .field public static literal int32 ID_HANDLER_B = int32(0x00000003)
  .field public static literal int32 ID_DEVICE_A = int32(0x00000004)
  .field public static literal int32 ID_DEVICE_B = int32(0x00000005)
  .field public static literal int32 COUNT = int32(0x000003E8)
  .field public static literal int32 EXPECTED_QUEUE_COUNT = int32(0x00000912)
  .field public static literal int32 EXPECTED_HOLD_COUNT = int32(0x000003A0)
  .method public hidebysig instance void 
          run() cil managed
  {
    // Code size       282 (0x11a)
    .maxstack  5
    .locals init (class Richards.Scheduler V_0,
             class Richards.Packet V_1,
             bool V_2)
    IL_0000:  nop
    IL_0001:  newobj     instance void Richards.Scheduler::.ctor()
    IL_0006:  stloc.0
    IL_0007:  ldloc.0
    IL_0008:  ldc.i4.0
    IL_0009:  ldc.i4.0
    IL_000a:  ldnull
    IL_000b:  ldc.i4     0x3e8
    IL_0010:  callvirt   instance void Richards.Scheduler::addIdleTask(int32,
                                                                       int32,
                                                                       class Richards.Packet,
                                                                       int32)
    IL_0015:  nop
    IL_0016:  ldnull
    IL_0017:  ldc.i4.1
    IL_0018:  ldc.i4.1
    IL_0019:  newobj     instance void Richards.Packet::.ctor(class Richards.Packet,
                                                              int32,
                                                              valuetype Richards.Kind)
    IL_001e:  stloc.1
    IL_001f:  ldloc.1
    IL_0020:  ldc.i4.1
    IL_0021:  ldc.i4.1
    IL_0022:  newobj     instance void Richards.Packet::.ctor(class Richards.Packet,
                                                              int32,
                                                              valuetype Richards.Kind)
    IL_0027:  stloc.1
    IL_0028:  ldloc.0
    IL_0029:  ldc.i4.1
    IL_002a:  ldc.i4     0x3e8
    IL_002f:  ldloc.1
    IL_0030:  callvirt   instance void Richards.Scheduler::addWorkerTask(int32,
                                                                         int32,
                                                                         class Richards.Packet)
    IL_0035:  nop
    IL_0036:  ldnull
    IL_0037:  ldc.i4.4
    IL_0038:  ldc.i4.0
    IL_0039:  newobj     instance void Richards.Packet::.ctor(class Richards.Packet,
                                                              int32,
                                                              valuetype Richards.Kind)
    IL_003e:  stloc.1
    IL_003f:  ldloc.1
    IL_0040:  ldc.i4.4
    IL_0041:  ldc.i4.0
    IL_0042:  newobj     instance void Richards.Packet::.ctor(class Richards.Packet,
                                                              int32,
                                                              valuetype Richards.Kind)
    IL_0047:  stloc.1
    IL_0048:  ldloc.1
    IL_0049:  ldc.i4.4
    IL_004a:  ldc.i4.0
    IL_004b:  newobj     instance void Richards.Packet::.ctor(class Richards.Packet,
                                                              int32,
                                                              valuetype Richards.Kind)
    IL_0050:  stloc.1
    IL_0051:  ldloc.0
    IL_0052:  ldc.i4.2
    IL_0053:  ldc.i4     0x7d0
    IL_0058:  ldloc.1
    IL_0059:  callvirt   instance void Richards.Scheduler::addHandlerTask(int32,
                                                                          int32,
                                                                          class Richards.Packet)
    IL_005e:  nop
    IL_005f:  ldnull
    IL_0060:  ldc.i4.5
    IL_0061:  ldc.i4.0
    IL_0062:  newobj     instance void Richards.Packet::.ctor(class Richards.Packet,
                                                              int32,
                                                              valuetype Richards.Kind)
    IL_0067:  stloc.1
    IL_0068:  ldloc.1
    IL_0069:  ldc.i4.5
    IL_006a:  ldc.i4.0
    IL_006b:  newobj     instance void Richards.Packet::.ctor(class Richards.Packet,
                                                              int32,
                                                              valuetype Richards.Kind)
    IL_0070:  stloc.1
    IL_0071:  ldloc.1
    IL_0072:  ldc.i4.5
    IL_0073:  ldc.i4.0
    IL_0074:  newobj     instance void Richards.Packet::.ctor(class Richards.Packet,
                                                              int32,
                                                              valuetype Richards.Kind)
    IL_0079:  stloc.1
    IL_007a:  ldloc.0
    IL_007b:  ldc.i4.3
    IL_007c:  ldc.i4     0xbb8
    IL_0081:  ldloc.1
    IL_0082:  callvirt   instance void Richards.Scheduler::addHandlerTask(int32,
                                                                          int32,
                                                                          class Richards.Packet)
    IL_0087:  nop
    IL_0088:  ldloc.0
    IL_0089:  ldc.i4.4
    IL_008a:  ldc.i4     0xfa0
    IL_008f:  ldnull
    IL_0090:  callvirt   instance void Richards.Scheduler::addDeviceTask(int32,
                                                                         int32,
                                                                         class Richards.Packet)
    IL_0095:  nop
    IL_0096:  ldloc.0
    IL_0097:  ldc.i4.5
    IL_0098:  ldc.i4     0x1388
    IL_009d:  ldnull
    IL_009e:  callvirt   instance void Richards.Scheduler::addDeviceTask(int32,
                                                                         int32,
                                                                         class Richards.Packet)
    IL_00a3:  nop
    IL_00a4:  ldloc.0
    IL_00a5:  callvirt   instance void Richards.Scheduler::schedule()
    IL_00aa:  nop
    IL_00ab:  ldloc.0
    IL_00ac:  ldfld      int32 Richards.Scheduler::queueCount
    IL_00b1:  ldc.i4     0x912
    IL_00b6:  bne.un.s   IL_00ca

    IL_00b8:  ldloc.0
    IL_00b9:  ldfld      int32 Richards.Scheduler::holdCount
    IL_00be:  ldc.i4     0x3a0
    IL_00c3:  ceq
    IL_00c5:  ldc.i4.0
    IL_00c6:  ceq
    IL_00c8:  br.s       IL_00cb

    IL_00ca:  ldc.i4.1
    IL_00cb:  stloc.2
    IL_00cc:  ldloc.2
    IL_00cd:  brfalse.s  IL_010c

    IL_00cf:  nop
    IL_00d0:  ldstr      "Error during execution: queueCount = "
    IL_00d5:  call       void [System.Console]System.Console::Write(string)
    IL_00da:  nop
    IL_00db:  ldloc.0
    IL_00dc:  ldfld      int32 Richards.Scheduler::queueCount
    IL_00e1:  call       void [System.Console]System.Console::Write(int32)
    IL_00e6:  nop
    IL_00e7:  ldstr      ", holdCount = "
    IL_00ec:  call       void [System.Console]System.Console::Write(string)
    IL_00f1:  nop
    IL_00f2:  ldloc.0
    IL_00f3:  ldfld      int32 Richards.Scheduler::holdCount
    IL_00f8:  call       void [System.Console]System.Console::Write(int32)
    IL_00fd:  nop
    IL_00fe:  ldstr      "."
    IL_0103:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0108:  nop
    IL_0109:  nop
    IL_010a:  br.s       IL_0119

    IL_010c:  nop
    IL_010d:  ldstr      "Finished successfully"
    IL_0112:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0117:  nop
    IL_0118:  nop
    IL_0119:  ret
  } // end of method Richards::run

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Richards::.ctor

} // end of class Richards.Richards

.class private auto ansi beforefieldinit Richards.Scheduler
       extends [System.Runtime]System.Object
{
  .field private static literal int32 NUMBER_OF_IDS = int32(0x00000006)
  .field public int32 queueCount
  .field public int32 holdCount
  .field public int32 currentId
  .field private class Richards.TaskControlBlock[] blocks
  .field private class Richards.TaskControlBlock list
  .field private class Richards.TaskControlBlock currentTCB
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       56 (0x38)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldc.i4.0
    IL_000a:  stfld      int32 Richards.Scheduler::queueCount
    IL_000f:  ldarg.0
    IL_0010:  ldc.i4.0
    IL_0011:  stfld      int32 Richards.Scheduler::holdCount
    IL_0016:  ldarg.0
    IL_0017:  ldc.i4.6
    IL_0018:  newarr     Richards.TaskControlBlock
    IL_001d:  stfld      class Richards.TaskControlBlock[] Richards.Scheduler::blocks
    IL_0022:  ldarg.0
    IL_0023:  ldnull
    IL_0024:  stfld      class Richards.TaskControlBlock Richards.Scheduler::list
    IL_0029:  ldarg.0
    IL_002a:  ldnull
    IL_002b:  stfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_0030:  ldarg.0
    IL_0031:  ldc.i4.0
    IL_0032:  stfld      int32 Richards.Scheduler::currentId
    IL_0037:  ret
  } // end of method Scheduler::.ctor

  .method public hidebysig instance void 
          addIdleTask(int32 id,
                      int32 priority,
                      class Richards.Packet queue,
                      int32 count) cil managed
  {
    // Code size       21 (0x15)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  ldarg.2
    IL_0004:  ldarg.3
    IL_0005:  ldarg.0
    IL_0006:  ldc.i4.1
    IL_0007:  ldarg.s    count
    IL_0009:  newobj     instance void Richards.IdleTask::.ctor(class Richards.Scheduler,
                                                                int32,
                                                                int32)
    IL_000e:  call       instance void Richards.Scheduler::addRunningTask(int32,
                                                                          int32,
                                                                          class Richards.Packet,
                                                                          class Richards.Task)
    IL_0013:  nop
    IL_0014:  ret
  } // end of method Scheduler::addIdleTask

  .method public hidebysig instance void 
          addWorkerTask(int32 id,
                        int32 priority,
                        class Richards.Packet queue) cil managed
  {
    // Code size       20 (0x14)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  ldarg.2
    IL_0004:  ldarg.3
    IL_0005:  ldarg.0
    IL_0006:  ldc.i4.2
    IL_0007:  ldc.i4.0
    IL_0008:  newobj     instance void Richards.WorkerTask::.ctor(class Richards.Scheduler,
                                                                  int32,
                                                                  int32)
    IL_000d:  call       instance void Richards.Scheduler::addTask(int32,
                                                                   int32,
                                                                   class Richards.Packet,
                                                                   class Richards.Task)
    IL_0012:  nop
    IL_0013:  ret
  } // end of method Scheduler::addWorkerTask

  .method public hidebysig instance void 
          addHandlerTask(int32 id,
                         int32 priority,
                         class Richards.Packet queue) cil managed
  {
    // Code size       18 (0x12)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  ldarg.2
    IL_0004:  ldarg.3
    IL_0005:  ldarg.0
    IL_0006:  newobj     instance void Richards.HandlerTask::.ctor(class Richards.Scheduler)
    IL_000b:  call       instance void Richards.Scheduler::addTask(int32,
                                                                   int32,
                                                                   class Richards.Packet,
                                                                   class Richards.Task)
    IL_0010:  nop
    IL_0011:  ret
  } // end of method Scheduler::addHandlerTask

  .method public hidebysig instance void 
          addDeviceTask(int32 id,
                        int32 priority,
                        class Richards.Packet queue) cil managed
  {
    // Code size       18 (0x12)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  ldarg.2
    IL_0004:  ldarg.3
    IL_0005:  ldarg.0
    IL_0006:  newobj     instance void Richards.DeviceTask::.ctor(class Richards.Scheduler)
    IL_000b:  call       instance void Richards.Scheduler::addTask(int32,
                                                                   int32,
                                                                   class Richards.Packet,
                                                                   class Richards.Task)
    IL_0010:  nop
    IL_0011:  ret
  } // end of method Scheduler::addDeviceTask

  .method public hidebysig instance void 
          addRunningTask(int32 id,
                         int32 priority,
                         class Richards.Packet queue,
                         class Richards.Task task) cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  ldarg.2
    IL_0004:  ldarg.3
    IL_0005:  ldarg.s    task
    IL_0007:  call       instance void Richards.Scheduler::addTask(int32,
                                                                   int32,
                                                                   class Richards.Packet,
                                                                   class Richards.Task)
    IL_000c:  nop
    IL_000d:  ldarg.0
    IL_000e:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_0013:  callvirt   instance void Richards.TaskControlBlock::setRunning()
    IL_0018:  nop
    IL_0019:  ret
  } // end of method Scheduler::addRunningTask

  .method public hidebysig instance void 
          addTask(int32 id,
                  int32 priority,
                  class Richards.Packet queue,
                  class Richards.Task task) cil managed
  {
    // Code size       50 (0x32)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::list
    IL_0008:  ldarg.1
    IL_0009:  ldarg.2
    IL_000a:  ldarg.3
    IL_000b:  ldarg.s    task
    IL_000d:  newobj     instance void Richards.TaskControlBlock::.ctor(class Richards.TaskControlBlock,
                                                                        int32,
                                                                        int32,
                                                                        class Richards.Packet,
                                                                        class Richards.Task)
    IL_0012:  stfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_0017:  ldarg.0
    IL_0018:  ldarg.0
    IL_0019:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_001e:  stfld      class Richards.TaskControlBlock Richards.Scheduler::list
    IL_0023:  ldarg.0
    IL_0024:  ldfld      class Richards.TaskControlBlock[] Richards.Scheduler::blocks
    IL_0029:  ldarg.1
    IL_002a:  ldarg.0
    IL_002b:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_0030:  stelem.ref
    IL_0031:  ret
  } // end of method Scheduler::addTask

  .method public hidebysig instance void 
          schedule() cil managed
  {
    // Code size       103 (0x67)
    .maxstack  2
    .locals init (bool V_0,
             bool V_1)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::list
    IL_0008:  stfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_000d:  br.s       IL_0059

    IL_000f:  nop
    IL_0010:  ldarg.0
    IL_0011:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_0016:  callvirt   instance bool Richards.TaskControlBlock::isHeldOrSuspended()
    IL_001b:  stloc.0
    IL_001c:  ldloc.0
    IL_001d:  brfalse.s  IL_0034

    IL_001f:  nop
    IL_0020:  ldarg.0
    IL_0021:  ldarg.0
    IL_0022:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_0027:  ldfld      class Richards.TaskControlBlock Richards.TaskControlBlock::link
    IL_002c:  stfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_0031:  nop
    IL_0032:  br.s       IL_0058

    IL_0034:  nop
    IL_0035:  ldarg.0
    IL_0036:  ldarg.0
    IL_0037:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_003c:  ldfld      int32 Richards.TaskControlBlock::id
    IL_0041:  stfld      int32 Richards.Scheduler::currentId
    IL_0046:  ldarg.0
    IL_0047:  ldarg.0
    IL_0048:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_004d:  callvirt   instance class Richards.TaskControlBlock Richards.TaskControlBlock::run()
    IL_0052:  stfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_0057:  nop
    IL_0058:  nop
    IL_0059:  ldarg.0
    IL_005a:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_005f:  ldnull
    IL_0060:  cgt.un
    IL_0062:  stloc.1
    IL_0063:  ldloc.1
    IL_0064:  brtrue.s   IL_000f

    IL_0066:  ret
  } // end of method Scheduler::schedule

  .method public hidebysig instance class Richards.TaskControlBlock 
          release(int32 id) cil managed
  {
    // Code size       69 (0x45)
    .maxstack  2
    .locals init (class Richards.TaskControlBlock V_0,
             bool V_1,
             class Richards.TaskControlBlock V_2,
             bool V_3)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      class Richards.TaskControlBlock[] Richards.Scheduler::blocks
    IL_0007:  ldarg.1
    IL_0008:  ldelem.ref
    IL_0009:  stloc.0
    IL_000a:  ldloc.0
    IL_000b:  ldnull
    IL_000c:  ceq
    IL_000e:  stloc.1
    IL_000f:  ldloc.1
    IL_0010:  brfalse.s  IL_0016

    IL_0012:  ldloc.0
    IL_0013:  stloc.2
    IL_0014:  br.s       IL_0043

    IL_0016:  ldloc.0
    IL_0017:  callvirt   instance void Richards.TaskControlBlock::markAsNotHeld()
    IL_001c:  nop
    IL_001d:  ldloc.0
    IL_001e:  ldfld      int32 Richards.TaskControlBlock::priority
    IL_0023:  ldarg.0
    IL_0024:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_0029:  ldfld      int32 Richards.TaskControlBlock::priority
    IL_002e:  cgt
    IL_0030:  stloc.3
    IL_0031:  ldloc.3
    IL_0032:  brfalse.s  IL_0039

    IL_0034:  nop
    IL_0035:  ldloc.0
    IL_0036:  stloc.2
    IL_0037:  br.s       IL_0043

    IL_0039:  nop
    IL_003a:  ldarg.0
    IL_003b:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_0040:  stloc.2
    IL_0041:  br.s       IL_0043

    IL_0043:  ldloc.2
    IL_0044:  ret
  } // end of method Scheduler::release

  .method public hidebysig instance class Richards.TaskControlBlock 
          holdCurrent() cil managed
  {
    // Code size       43 (0x2b)
    .maxstack  3
    .locals init (class Richards.TaskControlBlock V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      int32 Richards.Scheduler::holdCount
    IL_0008:  ldc.i4.1
    IL_0009:  add
    IL_000a:  stfld      int32 Richards.Scheduler::holdCount
    IL_000f:  ldarg.0
    IL_0010:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_0015:  callvirt   instance void Richards.TaskControlBlock::markAsHeld()
    IL_001a:  nop
    IL_001b:  ldarg.0
    IL_001c:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_0021:  ldfld      class Richards.TaskControlBlock Richards.TaskControlBlock::link
    IL_0026:  stloc.0
    IL_0027:  br.s       IL_0029

    IL_0029:  ldloc.0
    IL_002a:  ret
  } // end of method Scheduler::holdCurrent

  .method public hidebysig instance class Richards.TaskControlBlock 
          suspendCurrent() cil managed
  {
    // Code size       24 (0x18)
    .maxstack  1
    .locals init (class Richards.TaskControlBlock V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_0007:  callvirt   instance void Richards.TaskControlBlock::markAsSuspended()
    IL_000c:  nop
    IL_000d:  ldarg.0
    IL_000e:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_0013:  stloc.0
    IL_0014:  br.s       IL_0016

    IL_0016:  ldloc.0
    IL_0017:  ret
  } // end of method Scheduler::suspendCurrent

  .method public hidebysig instance class Richards.TaskControlBlock 
          queue(class Richards.Packet packet) cil managed
  {
    // Code size       78 (0x4e)
    .maxstack  3
    .locals init (class Richards.TaskControlBlock V_0,
             bool V_1,
             class Richards.TaskControlBlock V_2)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      class Richards.TaskControlBlock[] Richards.Scheduler::blocks
    IL_0007:  ldarg.1
    IL_0008:  ldfld      int32 Richards.Packet::id
    IL_000d:  ldelem.ref
    IL_000e:  stloc.0
    IL_000f:  ldloc.0
    IL_0010:  ldnull
    IL_0011:  ceq
    IL_0013:  stloc.1
    IL_0014:  ldloc.1
    IL_0015:  brfalse.s  IL_001b

    IL_0017:  ldloc.0
    IL_0018:  stloc.2
    IL_0019:  br.s       IL_004c

    IL_001b:  ldarg.0
    IL_001c:  ldarg.0
    IL_001d:  ldfld      int32 Richards.Scheduler::queueCount
    IL_0022:  ldc.i4.1
    IL_0023:  add
    IL_0024:  stfld      int32 Richards.Scheduler::queueCount
    IL_0029:  ldarg.1
    IL_002a:  ldnull
    IL_002b:  stfld      class Richards.Packet Richards.Packet::link
    IL_0030:  ldarg.1
    IL_0031:  ldarg.0
    IL_0032:  ldfld      int32 Richards.Scheduler::currentId
    IL_0037:  stfld      int32 Richards.Packet::id
    IL_003c:  ldloc.0
    IL_003d:  ldarg.0
    IL_003e:  ldfld      class Richards.TaskControlBlock Richards.Scheduler::currentTCB
    IL_0043:  ldarg.1
    IL_0044:  callvirt   instance class Richards.TaskControlBlock Richards.TaskControlBlock::checkPriorityAdd(class Richards.TaskControlBlock,
                                                                                                              class Richards.Packet)
    IL_0049:  stloc.2
    IL_004a:  br.s       IL_004c

    IL_004c:  ldloc.2
    IL_004d:  ret
  } // end of method Scheduler::queue

} // end of class Richards.Scheduler

.class private abstract auto ansi beforefieldinit Richards.Task
       extends [System.Runtime]System.Object
{
  .field family class Richards.Scheduler scheduler
  .field family object v1
  .method public hidebysig newslot abstract virtual 
          instance class Richards.TaskControlBlock 
          run(class Richards.Packet packet) cil managed
  {
  } // end of method Task::run

  .method family hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Task::.ctor

} // end of class Richards.Task

.class public auto ansi sealed Richards.States
       extends [System.Runtime]System.Enum
{
  .field public specialname rtspecialname int32 value__
  .field public static literal valuetype Richards.States RUNNING = int32(0x00000000)
  .field public static literal valuetype Richards.States RUNNABLE = int32(0x00000001)
  .field public static literal valuetype Richards.States SUSPENDED = int32(0x00000002)
  .field public static literal valuetype Richards.States HELD = int32(0x00000004)
  .field public static literal valuetype Richards.States SUSPENDED_RUNNABLE = int32(0x00000003)
  .field public static literal valuetype Richards.States NOT_HELD = int32(0xFFFFFFFB)
} // end of class Richards.States

.class private auto ansi beforefieldinit Richards.TaskControlBlock
       extends [System.Runtime]System.Object
{
  .field public int32 id
  .field public class Richards.TaskControlBlock link
  .field public int32 priority
  .field private class Richards.Packet queue
  .field private valuetype Richards.States state
  .field private class Richards.Task task
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(class Richards.TaskControlBlock link,
                               int32 id,
                               int32 priority,
                               class Richards.Packet queue,
                               class Richards.Task task) cil managed
  {
    // Code size       75 (0x4b)
    .maxstack  2
    .locals init (bool V_0)
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      class Richards.TaskControlBlock Richards.TaskControlBlock::link
    IL_000f:  ldarg.0
    IL_0010:  ldarg.2
    IL_0011:  stfld      int32 Richards.TaskControlBlock::id
    IL_0016:  ldarg.0
    IL_0017:  ldarg.3
    IL_0018:  stfld      int32 Richards.TaskControlBlock::priority
    IL_001d:  ldarg.0
    IL_001e:  ldarg.s    queue
    IL_0020:  stfld      class Richards.Packet Richards.TaskControlBlock::queue
    IL_0025:  ldarg.0
    IL_0026:  ldarg.s    task
    IL_0028:  stfld      class Richards.Task Richards.TaskControlBlock::task
    IL_002d:  ldarg.s    queue
    IL_002f:  ldnull
    IL_0030:  ceq
    IL_0032:  stloc.0
    IL_0033:  ldloc.0
    IL_0034:  brfalse.s  IL_0041

    IL_0036:  nop
    IL_0037:  ldarg.0
    IL_0038:  ldc.i4.2
    IL_0039:  stfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_003e:  nop
    IL_003f:  br.s       IL_004a

    IL_0041:  nop
    IL_0042:  ldarg.0
    IL_0043:  ldc.i4.3
    IL_0044:  stfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_0049:  nop
    IL_004a:  ret
  } // end of method TaskControlBlock::.ctor

  .method public hidebysig instance void 
          setRunning() cil managed
  {
    // Code size       9 (0x9)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldc.i4.0
    IL_0003:  stfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_0008:  ret
  } // end of method TaskControlBlock::setRunning

  .method public hidebysig instance void 
          markAsNotHeld() cil managed
  {
    // Code size       17 (0x11)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_0008:  ldc.i4.s   -5
    IL_000a:  and
    IL_000b:  stfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_0010:  ret
  } // end of method TaskControlBlock::markAsNotHeld

  .method public hidebysig instance void 
          markAsHeld() cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_0008:  ldc.i4.4
    IL_0009:  or
    IL_000a:  stfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_000f:  ret
  } // end of method TaskControlBlock::markAsHeld

  .method public hidebysig instance bool 
          isHeldOrSuspended() cil managed
  {
    // Code size       28 (0x1c)
    .maxstack  2
    .locals init (bool V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_0007:  ldc.i4.4
    IL_0008:  and
    IL_0009:  brtrue.s   IL_0016

    IL_000b:  ldarg.0
    IL_000c:  ldfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_0011:  ldc.i4.2
    IL_0012:  ceq
    IL_0014:  br.s       IL_0017

    IL_0016:  ldc.i4.1
    IL_0017:  stloc.0
    IL_0018:  br.s       IL_001a

    IL_001a:  ldloc.0
    IL_001b:  ret
  } // end of method TaskControlBlock::isHeldOrSuspended

  .method public hidebysig instance void 
          markAsSuspended() cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_0008:  ldc.i4.2
    IL_0009:  or
    IL_000a:  stfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_000f:  ret
  } // end of method TaskControlBlock::markAsSuspended

  .method public hidebysig instance void 
          markAsRunnable() cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_0008:  ldc.i4.1
    IL_0009:  or
    IL_000a:  stfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_000f:  ret
  } // end of method TaskControlBlock::markAsRunnable

  .method public hidebysig instance class Richards.TaskControlBlock 
          run() cil managed
  {
    // Code size       91 (0x5b)
    .maxstack  2
    .locals init (class Richards.Packet V_0,
             bool V_1,
             bool V_2,
             class Richards.TaskControlBlock V_3)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_0007:  ldc.i4.3
    IL_0008:  ceq
    IL_000a:  stloc.1
    IL_000b:  ldloc.1
    IL_000c:  brfalse.s  IL_0046

    IL_000e:  nop
    IL_000f:  ldarg.0
    IL_0010:  ldfld      class Richards.Packet Richards.TaskControlBlock::queue
    IL_0015:  stloc.0
    IL_0016:  ldarg.0
    IL_0017:  ldloc.0
    IL_0018:  ldfld      class Richards.Packet Richards.Packet::link
    IL_001d:  stfld      class Richards.Packet Richards.TaskControlBlock::queue
    IL_0022:  ldarg.0
    IL_0023:  ldfld      class Richards.Packet Richards.TaskControlBlock::queue
    IL_0028:  ldnull
    IL_0029:  ceq
    IL_002b:  stloc.2
    IL_002c:  ldloc.2
    IL_002d:  brfalse.s  IL_003a

    IL_002f:  nop
    IL_0030:  ldarg.0
    IL_0031:  ldc.i4.0
    IL_0032:  stfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_0037:  nop
    IL_0038:  br.s       IL_0043

    IL_003a:  nop
    IL_003b:  ldarg.0
    IL_003c:  ldc.i4.1
    IL_003d:  stfld      valuetype Richards.States Richards.TaskControlBlock::state
    IL_0042:  nop
    IL_0043:  nop
    IL_0044:  br.s       IL_004a

    IL_0046:  nop
    IL_0047:  ldnull
    IL_0048:  stloc.0
    IL_0049:  nop
    IL_004a:  ldarg.0
    IL_004b:  ldfld      class Richards.Task Richards.TaskControlBlock::task
    IL_0050:  ldloc.0
    IL_0051:  callvirt   instance class Richards.TaskControlBlock Richards.Task::run(class Richards.Packet)
    IL_0056:  stloc.3
    IL_0057:  br.s       IL_0059

    IL_0059:  ldloc.3
    IL_005a:  ret
  } // end of method TaskControlBlock::run

  .method public hidebysig instance class Richards.TaskControlBlock 
          checkPriorityAdd(class Richards.TaskControlBlock task,
                           class Richards.Packet packet) cil managed
  {
    // Code size       80 (0x50)
    .maxstack  3
    .locals init (bool V_0,
             bool V_1,
             class Richards.TaskControlBlock V_2)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      class Richards.Packet Richards.TaskControlBlock::queue
    IL_0007:  ldnull
    IL_0008:  ceq
    IL_000a:  stloc.0
    IL_000b:  ldloc.0
    IL_000c:  brfalse.s  IL_0036

    IL_000e:  nop
    IL_000f:  ldarg.0
    IL_0010:  ldarg.2
    IL_0011:  stfld      class Richards.Packet Richards.TaskControlBlock::queue
    IL_0016:  ldarg.0
    IL_0017:  call       instance void Richards.TaskControlBlock::markAsRunnable()
    IL_001c:  nop
    IL_001d:  ldarg.0
    IL_001e:  ldfld      int32 Richards.TaskControlBlock::priority
    IL_0023:  ldarg.1
    IL_0024:  ldfld      int32 Richards.TaskControlBlock::priority
    IL_0029:  cgt
    IL_002b:  stloc.1
    IL_002c:  ldloc.1
    IL_002d:  brfalse.s  IL_0033

    IL_002f:  ldarg.0
    IL_0030:  stloc.2
    IL_0031:  br.s       IL_004e

    IL_0033:  nop
    IL_0034:  br.s       IL_004a

    IL_0036:  nop
    IL_0037:  ldarg.0
    IL_0038:  ldarg.2
    IL_0039:  ldarg.0
    IL_003a:  ldfld      class Richards.Packet Richards.TaskControlBlock::queue
    IL_003f:  callvirt   instance class Richards.Packet Richards.Packet::addTo(class Richards.Packet)
    IL_0044:  stfld      class Richards.Packet Richards.TaskControlBlock::queue
    IL_0049:  nop
    IL_004a:  ldarg.1
    IL_004b:  stloc.2
    IL_004c:  br.s       IL_004e

    IL_004e:  ldloc.2
    IL_004f:  ret
  } // end of method TaskControlBlock::checkPriorityAdd

} // end of class Richards.TaskControlBlock

.class private auto ansi beforefieldinit Richards.WorkerTask
       extends Richards.Task
{
  .field private int32 v2
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(class Richards.Scheduler scheduler,
                               int32 v1,
                               int32 v2) cil managed
  {
    // Code size       35 (0x23)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void Richards.Task::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      class Richards.Scheduler Richards.Task::scheduler
    IL_000f:  ldarg.0
    IL_0010:  ldarg.2
    IL_0011:  box        [System.Runtime]System.Int32
    IL_0016:  stfld      object Richards.Task::v1
    IL_001b:  ldarg.0
    IL_001c:  ldarg.3
    IL_001d:  stfld      int32 Richards.WorkerTask::v2
    IL_0022:  ret
  } // end of method WorkerTask::.ctor

  .method public hidebysig virtual instance class Richards.TaskControlBlock 
          run(class Richards.Packet packet) cil managed
  {
    // Code size       188 (0xbc)
    .maxstack  3
    .locals init (bool V_0,
             class Richards.TaskControlBlock V_1,
             bool V_2,
             int32 V_3,
             bool V_4,
             bool V_5)
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  ldnull
    IL_0003:  ceq
    IL_0005:  stloc.0
    IL_0006:  ldloc.0
    IL_0007:  brfalse.s  IL_001b

    IL_0009:  nop
    IL_000a:  ldarg.0
    IL_000b:  ldfld      class Richards.Scheduler Richards.Task::scheduler
    IL_0010:  callvirt   instance class Richards.TaskControlBlock Richards.Scheduler::suspendCurrent()
    IL_0015:  stloc.1
    IL_0016:  br         IL_00ba

    IL_001b:  nop
    IL_001c:  ldarg.0
    IL_001d:  ldfld      object Richards.Task::v1
    IL_0022:  unbox.any  [System.Runtime]System.Int32
    IL_0027:  ldc.i4.2
    IL_0028:  ceq
    IL_002a:  stloc.2
    IL_002b:  ldloc.2
    IL_002c:  brfalse.s  IL_003e

    IL_002e:  nop
    IL_002f:  ldarg.0
    IL_0030:  ldc.i4.3
    IL_0031:  box        [System.Runtime]System.Int32
    IL_0036:  stfld      object Richards.Task::v1
    IL_003b:  nop
    IL_003c:  br.s       IL_004c

    IL_003e:  nop
    IL_003f:  ldarg.0
    IL_0040:  ldc.i4.2
    IL_0041:  box        [System.Runtime]System.Int32
    IL_0046:  stfld      object Richards.Task::v1
    IL_004b:  nop
    IL_004c:  ldarg.1
    IL_004d:  ldarg.0
    IL_004e:  ldfld      object Richards.Task::v1
    IL_0053:  unbox.any  [System.Runtime]System.Int32
    IL_0058:  stfld      int32 Richards.Packet::id
    IL_005d:  ldarg.1
    IL_005e:  ldc.i4.0
    IL_005f:  stfld      int32 Richards.Packet::a1
    IL_0064:  ldc.i4.0
    IL_0065:  stloc.3
    IL_0066:  br.s       IL_00a1

    IL_0068:  nop
    IL_0069:  ldarg.0
    IL_006a:  ldarg.0
    IL_006b:  ldfld      int32 Richards.WorkerTask::v2
    IL_0070:  ldc.i4.1
    IL_0071:  add
    IL_0072:  stfld      int32 Richards.WorkerTask::v2
    IL_0077:  ldarg.0
    IL_0078:  ldfld      int32 Richards.WorkerTask::v2
    IL_007d:  ldc.i4.s   26
    IL_007f:  cgt
    IL_0081:  stloc.s    V_4
    IL_0083:  ldloc.s    V_4
    IL_0085:  brfalse.s  IL_008e

    IL_0087:  ldarg.0
    IL_0088:  ldc.i4.1
    IL_0089:  stfld      int32 Richards.WorkerTask::v2
    IL_008e:  ldarg.1
    IL_008f:  ldfld      int32[] Richards.Packet::a2
    IL_0094:  ldloc.3
    IL_0095:  ldarg.0
    IL_0096:  ldfld      int32 Richards.WorkerTask::v2
    IL_009b:  stelem.i4
    IL_009c:  nop
    IL_009d:  ldloc.3
    IL_009e:  ldc.i4.1
    IL_009f:  add
    IL_00a0:  stloc.3
    IL_00a1:  ldloc.3
    IL_00a2:  ldc.i4.4
    IL_00a3:  clt
    IL_00a5:  stloc.s    V_5
    IL_00a7:  ldloc.s    V_5
    IL_00a9:  brtrue.s   IL_0068

    IL_00ab:  ldarg.0
    IL_00ac:  ldfld      class Richards.Scheduler Richards.Task::scheduler
    IL_00b1:  ldarg.1
    IL_00b2:  callvirt   instance class Richards.TaskControlBlock Richards.Scheduler::queue(class Richards.Packet)
    IL_00b7:  stloc.1
    IL_00b8:  br.s       IL_00ba

    IL_00ba:  ldloc.1
    IL_00bb:  ret
  } // end of method WorkerTask::run

} // end of class Richards.WorkerTask


// =============================================================

// *********** DISASSEMBLY COMPLETE ***********************
