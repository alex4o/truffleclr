
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
  //  .custom instance void [System.Runtime]System.Diagnostics.DebuggableAttribute::.ctor(valuetype [System.Runtime]System.Diagnostics.DebuggableAttribute/DebuggingModes) = ( 01 00 02 00 00 00 00 00 ) 

  .custom instance void [System.Runtime]System.Runtime.Versioning.TargetFrameworkAttribute::.ctor(string) = ( 01 00 19 2E 4E 45 54 43 6F 72 65 41 70 70 2C 56   // ....NETCoreApp,V
                                                                                                              65 72 73 69 6F 6E 3D 76 31 30 2E 30 01 00 54 0E   // ersion=v10.0..T.
                                                                                                              14 46 72 61 6D 65 77 6F 72 6B 44 69 73 70 6C 61   // .FrameworkDispla
                                                                                                              79 4E 61 6D 65 09 2E 4E 45 54 20 31 30 2E 30 )    // yName..NET 10.0
  .custom instance void [System.Runtime]System.Reflection.AssemblyCompanyAttribute::.ctor(string) = ( 01 00 01 70 00 00 )                               // ...p..
  .custom instance void [System.Runtime]System.Reflection.AssemblyConfigurationAttribute::.ctor(string) = ( 01 00 07 52 65 6C 65 61 73 65 00 00 )             // ...Release..
  .custom instance void [System.Runtime]System.Reflection.AssemblyFileVersionAttribute::.ctor(string) = ( 01 00 07 31 2E 30 2E 30 2E 30 00 00 )             // ...1.0.0.0..
  .custom instance void [System.Runtime]System.Reflection.AssemblyInformationalVersionAttribute::.ctor(string) = ( 01 00 05 31 2E 30 2E 30 00 00 )                   // ...1.0.0..
  .custom instance void [System.Runtime]System.Reflection.AssemblyProductAttribute::.ctor(string) = ( 01 00 01 70 00 00 )                               // ...p..
  .custom instance void [System.Runtime]System.Reflection.AssemblyTitleAttribute::.ctor(string) = ( 01 00 01 70 00 00 )                               // ...p..
  .hash algorithm 0x00008004
  .ver 1:0:0:0
}
.module p.dll
// MVID: {c1cefc97-91df-4fdf-99df-e29e0e56727f}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x104ee8000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .class auto ansi sealed nested private beforefieldinit '<Fault>d__1'
         extends [System.Runtime]System.ValueType
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> '<>t__builder'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter '<>u__1'
    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       132 (0x84)
      .maxstack  3
      .locals init (int32 V_0,
               int32 V_1,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter V_2,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable V_3,
               class [System.Runtime]System.Exception V_4)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Fault>d__1'::'<>1__state'
      IL_0006:  stloc.0
      .try
      {
        IL_0007:  ldloc.0
        IL_0008:  brfalse.s  IL_0041

        IL_000a:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable [System.Runtime]System.Threading.Tasks.Task::Yield()
        IL_000f:  stloc.3
        IL_0010:  ldloca.s   V_3
        IL_0012:  call       instance valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable::GetAwaiter()
        IL_0017:  stloc.2
        IL_0018:  ldloca.s   V_2
        IL_001a:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::get_IsCompleted()
        IL_001f:  brtrue.s   IL_005d

        IL_0021:  ldarg.0
        IL_0022:  ldc.i4.0
        IL_0023:  dup
        IL_0024:  stloc.0
        IL_0025:  stfld      int32 HelloWorld.Program/'<Fault>d__1'::'<>1__state'
        IL_002a:  ldarg.0
        IL_002b:  ldloc.2
        IL_002c:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Fault>d__1'::'<>u__1'
        IL_0031:  ldarg.0
        IL_0032:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__1'::'<>t__builder'
        IL_0037:  ldloca.s   V_2
        IL_0039:  ldarg.0
        IL_003a:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter,valuetype HelloWorld.Program/'<Fault>d__1'>(!!0&,
                                                                                                                                                                                                                                                                                               !!1&)
        IL_003f:  leave.s    IL_0083

        IL_0041:  ldarg.0
        IL_0042:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Fault>d__1'::'<>u__1'
        IL_0047:  stloc.2
        IL_0048:  ldarg.0
        IL_0049:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Fault>d__1'::'<>u__1'
        IL_004e:  initobj    [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter
        IL_0054:  ldarg.0
        IL_0055:  ldc.i4.m1
        IL_0056:  dup
        IL_0057:  stloc.0
        IL_0058:  stfld      int32 HelloWorld.Program/'<Fault>d__1'::'<>1__state'
        IL_005d:  ldloca.s   V_2
        IL_005f:  call       instance void [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::GetResult()
        IL_0064:  ldsfld     class [System.Runtime]System.Exception HelloWorld.Program::original
        IL_0069:  throw

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_006a:  stloc.s    V_4
        IL_006c:  ldarg.0
        IL_006d:  ldc.i4.s   -2
        IL_006f:  stfld      int32 HelloWorld.Program/'<Fault>d__1'::'<>1__state'
        IL_0074:  ldarg.0
        IL_0075:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__1'::'<>t__builder'
        IL_007a:  ldloc.s    V_4
        IL_007c:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetException(class [System.Runtime]System.Exception)
        IL_0081:  leave.s    IL_0083

      }  // end handler
      IL_0083:  ret
    } // end of method '<Fault>d__1'::MoveNext

    .method private hidebysig newslot virtual final 
            instance void  SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine stateMachine) cil managed
    {
      .custom instance void [System.Runtime]System.Diagnostics.DebuggerHiddenAttribute::.ctor() = ( 01 00 00 00 ) 
      .param [1]
      .custom instance void [System.Runtime]System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 01 00 00 ) 
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::SetStateMachine
      // Code size       13 (0xd)
      .maxstack  8
      IL_0000:  ldarg.0
      IL_0001:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__1'::'<>t__builder'
      IL_0006:  ldarg.1
      IL_0007:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine)
      IL_000c:  ret
    } // end of method '<Fault>d__1'::SetStateMachine

  } // end of class '<Fault>d__1'

  .class auto ansi sealed nested private beforefieldinit '<Observe>d__2'
         extends [System.Runtime]System.ValueType
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder '<>t__builder'
    .field public class [System.Runtime]System.Threading.Tasks.Task`1<int32> task
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> '<>u__1'
    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       163 (0xa3)
      .maxstack  3
      .locals init (int32 V_0,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_1,
               class [System.Runtime]System.Exception V_2)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Observe>d__2'::'<>1__state'
      IL_0006:  stloc.0
      .try
      {
        IL_0007:  ldloc.0
        IL_0008:  pop
        IL_0009:  nop
        .try
        {
          IL_000a:  ldloc.0
          IL_000b:  brfalse.s  IL_0042

          IL_000d:  ldarg.0
          IL_000e:  ldfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Observe>d__2'::task
          IL_0013:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
          IL_0018:  stloc.1
          IL_0019:  ldloca.s   V_1
          IL_001b:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
          IL_0020:  brtrue.s   IL_005e

          IL_0022:  ldarg.0
          IL_0023:  ldc.i4.0
          IL_0024:  dup
          IL_0025:  stloc.0
          IL_0026:  stfld      int32 HelloWorld.Program/'<Observe>d__2'::'<>1__state'
          IL_002b:  ldarg.0
          IL_002c:  ldloc.1
          IL_002d:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Observe>d__2'::'<>u__1'
          IL_0032:  ldarg.0
          IL_0033:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Observe>d__2'::'<>t__builder'
          IL_0038:  ldloca.s   V_1
          IL_003a:  ldarg.0
          IL_003b:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,valuetype HelloWorld.Program/'<Observe>d__2'>(!!0&,
                                                                                                                                                                                                                                                                         !!1&)
          IL_0040:  leave.s    IL_00a2

          IL_0042:  ldarg.0
          IL_0043:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Observe>d__2'::'<>u__1'
          IL_0048:  stloc.1
          IL_0049:  ldarg.0
          IL_004a:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Observe>d__2'::'<>u__1'
          IL_004f:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
          IL_0055:  ldarg.0
          IL_0056:  ldc.i4.m1
          IL_0057:  dup
          IL_0058:  stloc.0
          IL_0059:  stfld      int32 HelloWorld.Program/'<Observe>d__2'::'<>1__state'
          IL_005e:  ldloca.s   V_1
          IL_0060:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
          IL_0065:  pop
          IL_0066:  leave.s    IL_0076

        }  // end .try
        catch [System.Runtime]System.InvalidOperationException 
        {
          IL_0068:  ldsfld     class [System.Runtime]System.Exception HelloWorld.Program::original
          IL_006d:  ceq
          IL_006f:  call       void [System.Console]System.Console::WriteLine(bool)
          IL_0074:  leave.s    IL_0076

        }  // end handler
        IL_0076:  leave.s    IL_008f

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_0078:  stloc.2
        IL_0079:  ldarg.0
        IL_007a:  ldc.i4.s   -2
        IL_007c:  stfld      int32 HelloWorld.Program/'<Observe>d__2'::'<>1__state'
        IL_0081:  ldarg.0
        IL_0082:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Observe>d__2'::'<>t__builder'
        IL_0087:  ldloc.2
        IL_0088:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::SetException(class [System.Runtime]System.Exception)
        IL_008d:  leave.s    IL_00a2

      }  // end handler
      IL_008f:  ldarg.0
      IL_0090:  ldc.i4.s   -2
      IL_0092:  stfld      int32 HelloWorld.Program/'<Observe>d__2'::'<>1__state'
      IL_0097:  ldarg.0
      IL_0098:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Observe>d__2'::'<>t__builder'
      IL_009d:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::SetResult()
      IL_00a2:  ret
    } // end of method '<Observe>d__2'::MoveNext

    .method private hidebysig newslot virtual final 
            instance void  SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine stateMachine) cil managed
    {
      .custom instance void [System.Runtime]System.Diagnostics.DebuggerHiddenAttribute::.ctor() = ( 01 00 00 00 ) 
      .param [1]
      .custom instance void [System.Runtime]System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 01 00 00 ) 
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::SetStateMachine
      // Code size       13 (0xd)
      .maxstack  8
      IL_0000:  ldarg.0
      IL_0001:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Observe>d__2'::'<>t__builder'
      IL_0006:  ldarg.1
      IL_0007:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine)
      IL_000c:  ret
    } // end of method '<Observe>d__2'::SetStateMachine

  } // end of class '<Observe>d__2'

  .field private static class [System.Runtime]System.Exception original
  .method private hidebysig static class [System.Runtime]System.Threading.Tasks.Task`1<int32> 
          Fault() cil managed
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.AsyncStateMachineAttribute::.ctor(class [System.Runtime]System.Type) = ( 01 00 1E 48 65 6C 6C 6F 57 6F 72 6C 64 2E 50 72   // ...HelloWorld.Pr
                                                                                                                                                   6F 67 72 61 6D 2B 3C 46 61 75 6C 74 3E 64 5F 5F   // ogram+<Fault>d__
                                                                                                                                                   31 00 00 )                                        // 1..
    // Code size       47 (0x2f)
    .maxstack  2
    .locals init (valuetype HelloWorld.Program/'<Fault>d__1' V_0)
    IL_0000:  ldloca.s   V_0
    IL_0002:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Create()
    IL_0007:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__1'::'<>t__builder'
    IL_000c:  ldloca.s   V_0
    IL_000e:  ldc.i4.m1
    IL_000f:  stfld      int32 HelloWorld.Program/'<Fault>d__1'::'<>1__state'
    IL_0014:  ldloca.s   V_0
    IL_0016:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__1'::'<>t__builder'
    IL_001b:  ldloca.s   V_0
    IL_001d:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Start<valuetype HelloWorld.Program/'<Fault>d__1'>(!!0&)
    IL_0022:  ldloca.s   V_0
    IL_0024:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__1'::'<>t__builder'
    IL_0029:  call       instance class [System.Runtime]System.Threading.Tasks.Task`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::get_Task()
    IL_002e:  ret
  } // end of method Program::Fault

  .method private hidebysig static class [System.Runtime]System.Threading.Tasks.Task 
          Observe(class [System.Runtime]System.Threading.Tasks.Task`1<int32> task) cil managed
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.AsyncStateMachineAttribute::.ctor(class [System.Runtime]System.Type) = ( 01 00 20 48 65 6C 6C 6F 57 6F 72 6C 64 2E 50 72   // .. HelloWorld.Pr
                                                                                                                                                   6F 67 72 61 6D 2B 3C 4F 62 73 65 72 76 65 3E 64   // ogram+<Observe>d
                                                                                                                                                   5F 5F 32 00 00 )                                  // __2..
    // Code size       55 (0x37)
    .maxstack  2
    .locals init (valuetype HelloWorld.Program/'<Observe>d__2' V_0)
    IL_0000:  ldloca.s   V_0
    IL_0002:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::Create()
    IL_0007:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Observe>d__2'::'<>t__builder'
    IL_000c:  ldloca.s   V_0
    IL_000e:  ldarg.0
    IL_000f:  stfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Observe>d__2'::task
    IL_0014:  ldloca.s   V_0
    IL_0016:  ldc.i4.m1
    IL_0017:  stfld      int32 HelloWorld.Program/'<Observe>d__2'::'<>1__state'
    IL_001c:  ldloca.s   V_0
    IL_001e:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Observe>d__2'::'<>t__builder'
    IL_0023:  ldloca.s   V_0
    IL_0025:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::Start<valuetype HelloWorld.Program/'<Observe>d__2'>(!!0&)
    IL_002a:  ldloca.s   V_0
    IL_002c:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Observe>d__2'::'<>t__builder'
    IL_0031:  call       instance class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::get_Task()
    IL_0036:  ret
  } // end of method Program::Observe

  .method private hidebysig static void  Show(class [System.Runtime]System.AggregateException e) cil managed
  {
    // Code size       70 (0x46)
    .maxstack  2
    IL_0000:  ldarg.0
    IL_0001:  callvirt   instance string [System.Runtime]System.Exception::get_Message()
    IL_0006:  call       void [System.Console]System.Console::WriteLine(string)
    IL_000b:  ldarg.0
    IL_000c:  callvirt   instance class [System.Runtime]System.Exception [System.Runtime]System.Exception::get_InnerException()
    IL_0011:  ldsfld     class [System.Runtime]System.Exception HelloWorld.Program::original
    IL_0016:  ceq
    IL_0018:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_001d:  ldarg.0
    IL_001e:  callvirt   instance class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception> [System.Runtime]System.AggregateException::get_InnerExceptions()
    IL_0023:  callvirt   instance int32 class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception>::get_Count()
    IL_0028:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_002d:  ldarg.0
    IL_002e:  callvirt   instance class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception> [System.Runtime]System.AggregateException::get_InnerExceptions()
    IL_0033:  ldc.i4.0
    IL_0034:  callvirt   instance !0 class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception>::get_Item(int32)
    IL_0039:  ldsfld     class [System.Runtime]System.Exception HelloWorld.Program::original
    IL_003e:  ceq
    IL_0040:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_0045:  ret
  } // end of method Program::Show

  .method private hidebysig static void  Main() cil managed
  {
    .entrypoint
    // Code size       426 (0x1aa)
    .maxstack  4
    .locals init (class [System.Runtime]System.Threading.Tasks.Task`1<int32> V_0,
             class [System.Runtime]System.AggregateException V_1,
             class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception> V_2,
             valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_3,
             valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter V_4)
    IL_0000:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Fault()
    IL_0005:  stloc.0
    .try
    {
      IL_0006:  ldloc.0
      IL_0007:  callvirt   instance !0 class [System.Runtime]System.Threading.Tasks.Task`1<int32>::get_Result()
      IL_000c:  call       void [System.Console]System.Console::WriteLine(int32)
      IL_0011:  leave.s    IL_001a

    }  // end .try
    catch [System.Runtime]System.AggregateException 
    {
      IL_0013:  call       void HelloWorld.Program::Show(class [System.Runtime]System.AggregateException)
      IL_0018:  leave.s    IL_001a

    }  // end handler
    IL_001a:  nop
    .try
    {
      IL_001b:  ldloc.0
      IL_001c:  callvirt   instance void [System.Runtime]System.Threading.Tasks.Task::Wait()
      IL_0021:  leave.s    IL_002a

    }  // end .try
    catch [System.Runtime]System.AggregateException 
    {
      IL_0023:  call       void HelloWorld.Program::Show(class [System.Runtime]System.AggregateException)
      IL_0028:  leave.s    IL_002a

    }  // end handler
    IL_002a:  nop
    .try
    {
      IL_002b:  ldloc.0
      IL_002c:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
      IL_0031:  stloc.3
      IL_0032:  ldloca.s   V_3
      IL_0034:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
      IL_0039:  pop
      IL_003a:  leave.s    IL_004a

    }  // end .try
    catch [System.Runtime]System.InvalidOperationException 
    {
      IL_003c:  ldsfld     class [System.Runtime]System.Exception HelloWorld.Program::original
      IL_0041:  ceq
      IL_0043:  call       void [System.Console]System.Console::WriteLine(bool)
      IL_0048:  leave.s    IL_004a

    }  // end handler
    IL_004a:  nop
    .try
    {
      IL_004b:  ldloc.0
      IL_004c:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter [System.Runtime]System.Threading.Tasks.Task::GetAwaiter()
      IL_0051:  stloc.s    V_4
      IL_0053:  ldloca.s   V_4
      IL_0055:  call       instance void [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::GetResult()
      IL_005a:  leave.s    IL_006a

    }  // end .try
    catch [System.Runtime]System.InvalidOperationException 
    {
      IL_005c:  ldsfld     class [System.Runtime]System.Exception HelloWorld.Program::original
      IL_0061:  ceq
      IL_0063:  call       void [System.Console]System.Console::WriteLine(bool)
      IL_0068:  leave.s    IL_006a

    }  // end handler
    IL_006a:  ldloc.0
    IL_006b:  call       class [System.Runtime]System.Threading.Tasks.Task HelloWorld.Program::Observe(class [System.Runtime]System.Threading.Tasks.Task`1<int32>)
    IL_0070:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter [System.Runtime]System.Threading.Tasks.Task::GetAwaiter()
    IL_0075:  stloc.s    V_4
    IL_0077:  ldloca.s   V_4
    IL_0079:  call       instance void [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::GetResult()
    IL_007e:  ldc.i4.s   42
    IL_0080:  call       class [System.Runtime]System.Threading.Tasks.Task`1<!!0> [System.Runtime]System.Threading.Tasks.Task::FromResult<int32>(!!0)
    IL_0085:  callvirt   instance !0 class [System.Runtime]System.Threading.Tasks.Task`1<int32>::get_Result()
    IL_008a:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_008f:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::get_CompletedTask()
    IL_0094:  callvirt   instance void [System.Runtime]System.Threading.Tasks.Task::Wait()
    IL_0099:  newobj     instance void [System.Runtime]System.AggregateException::.ctor()
    IL_009e:  call       instance class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception> [System.Runtime]System.AggregateException::get_InnerExceptions()
    IL_00a3:  callvirt   instance int32 class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception>::get_Count()
    IL_00a8:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00ad:  newobj     instance void [System.Runtime]System.AggregateException::.ctor()
    IL_00b2:  callvirt   instance string [System.Runtime]System.Exception::get_Message()
    IL_00b7:  call       void [System.Console]System.Console::WriteLine(string)
    IL_00bc:  ldc.i4.2
    IL_00bd:  newarr     [System.Runtime]System.Exception
    IL_00c2:  dup
    IL_00c3:  ldc.i4.0
    IL_00c4:  ldsfld     class [System.Runtime]System.Exception HelloWorld.Program::original
    IL_00c9:  stelem.ref
    IL_00ca:  dup
    IL_00cb:  ldc.i4.1
    IL_00cc:  ldstr      "second"
    IL_00d1:  newobj     instance void [System.Runtime]System.Exception::.ctor(string)
    IL_00d6:  stelem.ref
    IL_00d7:  dup
    IL_00d8:  newobj     instance void [System.Runtime]System.AggregateException::.ctor(class [System.Runtime]System.Exception[])
    IL_00dd:  stloc.1
    IL_00de:  ldc.i4.0
    IL_00df:  ldstr      "replacement"
    IL_00e4:  newobj     instance void [System.Runtime]System.Exception::.ctor(string)
    IL_00e9:  stelem.ref
    IL_00ea:  ldloc.1
    IL_00eb:  callvirt   instance string [System.Runtime]System.Exception::get_Message()
    IL_00f0:  call       void [System.Console]System.Console::WriteLine(string)
    IL_00f5:  ldloc.1
    IL_00f6:  callvirt   instance class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception> [System.Runtime]System.AggregateException::get_InnerExceptions()
    IL_00fb:  callvirt   instance int32 class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception>::get_Count()
    IL_0100:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0105:  ldloc.1
    IL_0106:  callvirt   instance class [System.Runtime]System.Exception [System.Runtime]System.Exception::get_InnerException()
    IL_010b:  ldsfld     class [System.Runtime]System.Exception HelloWorld.Program::original
    IL_0110:  ceq
    IL_0112:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_0117:  ldloc.1
    IL_0118:  callvirt   instance class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception> [System.Runtime]System.AggregateException::get_InnerExceptions()
    IL_011d:  ldc.i4.0
    IL_011e:  callvirt   instance !0 class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception>::get_Item(int32)
    IL_0123:  ldsfld     class [System.Runtime]System.Exception HelloWorld.Program::original
    IL_0128:  ceq
    IL_012a:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_012f:  ldc.i4.1
    IL_0130:  newarr     [System.Runtime]System.Exception
    IL_0135:  dup
    IL_0136:  ldc.i4.0
    IL_0137:  ldsfld     class [System.Runtime]System.Exception HelloWorld.Program::original
    IL_013c:  stelem.ref
    IL_013d:  newobj     instance void [System.Runtime]System.AggregateException::.ctor(class [System.Runtime]System.Exception[])
    IL_0142:  call       instance class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception> [System.Runtime]System.AggregateException::get_InnerExceptions()
    IL_0147:  stloc.2
    .try
    {
      IL_0148:  ldloc.2
      IL_0149:  ldc.i4.m1
      IL_014a:  callvirt   instance !0 class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception>::get_Item(int32)
      IL_014f:  call       void [System.Console]System.Console::WriteLine(object)
      IL_0154:  leave.s    IL_0163

    }  // end .try
    catch [System.Runtime]System.ArgumentOutOfRangeException 
    {
      IL_0156:  pop
      IL_0157:  ldstr      "negative index"
      IL_015c:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0161:  leave.s    IL_0163

    }  // end handler
    IL_0163:  nop
    .try
    {
      IL_0164:  ldloc.2
      IL_0165:  ldloc.2
      IL_0166:  callvirt   instance int32 class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception>::get_Count()
      IL_016b:  callvirt   instance !0 class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception>::get_Item(int32)
      IL_0170:  call       void [System.Console]System.Console::WriteLine(object)
      IL_0175:  leave.s    IL_0184

    }  // end .try
    catch [System.Runtime]System.ArgumentOutOfRangeException 
    {
      IL_0177:  pop
      IL_0178:  ldstr      "past end"
      IL_017d:  call       void [System.Console]System.Console::WriteLine(string)
      IL_0182:  leave.s    IL_0184

    }  // end handler
    IL_0184:  nop
    .try
    {
      IL_0185:  newobj     instance void [System.Runtime]System.AggregateException::.ctor()
      IL_018a:  call       instance class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception> [System.Runtime]System.AggregateException::get_InnerExceptions()
      IL_018f:  ldc.i4.0
      IL_0190:  callvirt   instance !0 class [System.Runtime]System.Collections.ObjectModel.ReadOnlyCollection`1<class [System.Runtime]System.Exception>::get_Item(int32)
      IL_0195:  call       void [System.Console]System.Console::WriteLine(object)
      IL_019a:  leave.s    IL_01a9

    }  // end .try
    catch [System.Runtime]System.ArgumentOutOfRangeException 
    {
      IL_019c:  pop
      IL_019d:  ldstr      "empty list"
      IL_01a2:  call       void [System.Console]System.Console::WriteLine(string)
      IL_01a7:  leave.s    IL_01a9

    }  // end handler
    IL_01a9:  ret
  } // end of method Program::Main

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  ret
  } // end of method Program::.ctor

  .method private hidebysig specialname rtspecialname static 
          void  .cctor() cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldstr      "inner message"
    IL_0005:  newobj     instance void [System.Runtime]System.InvalidOperationException::.ctor(string)
    IL_000a:  stsfld     class [System.Runtime]System.Exception HelloWorld.Program::original
    IL_000f:  ret
  } // end of method Program::.cctor

} // end of class HelloWorld.Program


// =============================================================

// *********** DISASSEMBLY COMPLETE ***********************
