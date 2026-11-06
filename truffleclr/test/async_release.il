
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
// MVID: {1950aeb3-acf2-4a25-a473-caa591dbb254}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x1049cc000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .class auto ansi sealed nested private beforefieldinit '<Add>d__1'
         extends [System.Runtime]System.ValueType
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> '<>t__builder'
    .field public int32 a
    .field public int32 b
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter '<>u__1'
    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       162 (0xa2)
      .maxstack  3
      .locals init (int32 V_0,
               int32 V_1,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter V_2,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable V_3,
               class [System.Runtime]System.Exception V_4)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Add>d__1'::'<>1__state'
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
        IL_0025:  stfld      int32 HelloWorld.Program/'<Add>d__1'::'<>1__state'
        IL_002a:  ldarg.0
        IL_002b:  ldloc.2
        IL_002c:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Add>d__1'::'<>u__1'
        IL_0031:  ldarg.0
        IL_0032:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Add>d__1'::'<>t__builder'
        IL_0037:  ldloca.s   V_2
        IL_0039:  ldarg.0
        IL_003a:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter,valuetype HelloWorld.Program/'<Add>d__1'>(!!0&,
                                                                                                                                                                                                                                                                                             !!1&)
        IL_003f:  leave.s    IL_00a1

        IL_0041:  ldarg.0
        IL_0042:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Add>d__1'::'<>u__1'
        IL_0047:  stloc.2
        IL_0048:  ldarg.0
        IL_0049:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Add>d__1'::'<>u__1'
        IL_004e:  initobj    [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter
        IL_0054:  ldarg.0
        IL_0055:  ldc.i4.m1
        IL_0056:  dup
        IL_0057:  stloc.0
        IL_0058:  stfld      int32 HelloWorld.Program/'<Add>d__1'::'<>1__state'
        IL_005d:  ldloca.s   V_2
        IL_005f:  call       instance void [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::GetResult()
        IL_0064:  ldarg.0
        IL_0065:  ldfld      int32 HelloWorld.Program/'<Add>d__1'::a
        IL_006a:  ldarg.0
        IL_006b:  ldfld      int32 HelloWorld.Program/'<Add>d__1'::b
        IL_0070:  add
        IL_0071:  stloc.1
        IL_0072:  leave.s    IL_008d

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_0074:  stloc.s    V_4
        IL_0076:  ldarg.0
        IL_0077:  ldc.i4.s   -2
        IL_0079:  stfld      int32 HelloWorld.Program/'<Add>d__1'::'<>1__state'
        IL_007e:  ldarg.0
        IL_007f:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Add>d__1'::'<>t__builder'
        IL_0084:  ldloc.s    V_4
        IL_0086:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetException(class [System.Runtime]System.Exception)
        IL_008b:  leave.s    IL_00a1

      }  // end handler
      IL_008d:  ldarg.0
      IL_008e:  ldc.i4.s   -2
      IL_0090:  stfld      int32 HelloWorld.Program/'<Add>d__1'::'<>1__state'
      IL_0095:  ldarg.0
      IL_0096:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Add>d__1'::'<>t__builder'
      IL_009b:  ldloc.1
      IL_009c:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetResult(!0)
      IL_00a1:  ret
    } // end of method '<Add>d__1'::MoveNext

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
      IL_0001:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Add>d__1'::'<>t__builder'
      IL_0006:  ldarg.1
      IL_0007:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine)
      IL_000c:  ret
    } // end of method '<Add>d__1'::SetStateMachine

  } // end of class '<Add>d__1'

  .class auto ansi sealed nested private beforefieldinit '<Consumer>d__8'
         extends [System.Runtime]System.ValueType
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> '<>t__builder'
    .field public class [System.Runtime]System.Threading.Tasks.Task`1<int32> task
    .field public int32 delay
    .field private int32 '<value>5__2'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> '<>u__1'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter '<>u__2'
    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       286 (0x11e)
      .maxstack  3
      .locals init (int32 V_0,
               int32 V_1,
               int32 V_2,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_3,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter V_4,
               class [System.Runtime]System.Exception V_5)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
      IL_0006:  stloc.0
      .try
      {
        IL_0007:  ldloc.0
        IL_0008:  brfalse.s  IL_0049

        IL_000a:  ldloc.0
        IL_000b:  ldc.i4.1
        IL_000c:  beq        IL_00b0

        IL_0011:  ldarg.0
        IL_0012:  ldfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Consumer>d__8'::task
        IL_0017:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_001c:  stloc.3
        IL_001d:  ldloca.s   V_3
        IL_001f:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_0024:  brtrue.s   IL_0065

        IL_0026:  ldarg.0
        IL_0027:  ldc.i4.0
        IL_0028:  dup
        IL_0029:  stloc.0
        IL_002a:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
        IL_002f:  ldarg.0
        IL_0030:  ldloc.3
        IL_0031:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>u__1'
        IL_0036:  ldarg.0
        IL_0037:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>t__builder'
        IL_003c:  ldloca.s   V_3
        IL_003e:  ldarg.0
        IL_003f:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,valuetype HelloWorld.Program/'<Consumer>d__8'>(!!0&,
                                                                                                                                                                                                                                                                                           !!1&)
        IL_0044:  leave      IL_011d

        IL_0049:  ldarg.0
        IL_004a:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>u__1'
        IL_004f:  stloc.3
        IL_0050:  ldarg.0
        IL_0051:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>u__1'
        IL_0056:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_005c:  ldarg.0
        IL_005d:  ldc.i4.m1
        IL_005e:  dup
        IL_005f:  stloc.0
        IL_0060:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
        IL_0065:  ldloca.s   V_3
        IL_0067:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_006c:  stloc.2
        IL_006d:  ldarg.0
        IL_006e:  ldloc.2
        IL_006f:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<value>5__2'
        IL_0074:  ldarg.0
        IL_0075:  ldfld      int32 HelloWorld.Program/'<Consumer>d__8'::delay
        IL_007a:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::Delay(int32)
        IL_007f:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter [System.Runtime]System.Threading.Tasks.Task::GetAwaiter()
        IL_0084:  stloc.s    V_4
        IL_0086:  ldloca.s   V_4
        IL_0088:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::get_IsCompleted()
        IL_008d:  brtrue.s   IL_00cd

        IL_008f:  ldarg.0
        IL_0090:  ldc.i4.1
        IL_0091:  dup
        IL_0092:  stloc.0
        IL_0093:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
        IL_0098:  ldarg.0
        IL_0099:  ldloc.s    V_4
        IL_009b:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Consumer>d__8'::'<>u__2'
        IL_00a0:  ldarg.0
        IL_00a1:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>t__builder'
        IL_00a6:  ldloca.s   V_4
        IL_00a8:  ldarg.0
        IL_00a9:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter,valuetype HelloWorld.Program/'<Consumer>d__8'>(!!0&,
                                                                                                                                                                                                                                                                                  !!1&)
        IL_00ae:  leave.s    IL_011d

        IL_00b0:  ldarg.0
        IL_00b1:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Consumer>d__8'::'<>u__2'
        IL_00b6:  stloc.s    V_4
        IL_00b8:  ldarg.0
        IL_00b9:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Consumer>d__8'::'<>u__2'
        IL_00be:  initobj    [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter
        IL_00c4:  ldarg.0
        IL_00c5:  ldc.i4.m1
        IL_00c6:  dup
        IL_00c7:  stloc.0
        IL_00c8:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
        IL_00cd:  ldloca.s   V_4
        IL_00cf:  call       instance void [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::GetResult()
        IL_00d4:  ldsfld     int32 HelloWorld.Program::resumed
        IL_00d9:  ldc.i4.1
        IL_00da:  add
        IL_00db:  stsfld     int32 HelloWorld.Program::resumed
        IL_00e0:  ldarg.0
        IL_00e1:  ldfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<value>5__2'
        IL_00e6:  ldarg.0
        IL_00e7:  ldfld      int32 HelloWorld.Program/'<Consumer>d__8'::delay
        IL_00ec:  add
        IL_00ed:  stloc.1
        IL_00ee:  leave.s    IL_0109

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_00f0:  stloc.s    V_5
        IL_00f2:  ldarg.0
        IL_00f3:  ldc.i4.s   -2
        IL_00f5:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
        IL_00fa:  ldarg.0
        IL_00fb:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>t__builder'
        IL_0100:  ldloc.s    V_5
        IL_0102:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetException(class [System.Runtime]System.Exception)
        IL_0107:  leave.s    IL_011d

      }  // end handler
      IL_0109:  ldarg.0
      IL_010a:  ldc.i4.s   -2
      IL_010c:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
      IL_0111:  ldarg.0
      IL_0112:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>t__builder'
      IL_0117:  ldloc.1
      IL_0118:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetResult(!0)
      IL_011d:  ret
    } // end of method '<Consumer>d__8'::MoveNext

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
      IL_0001:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>t__builder'
      IL_0006:  ldarg.1
      IL_0007:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine)
      IL_000c:  ret
    } // end of method '<Consumer>d__8'::SetStateMachine

  } // end of class '<Consumer>d__8'

  .class auto ansi sealed nested private beforefieldinit '<Fault>d__6'
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
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Fault>d__6'::'<>1__state'
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
        IL_0025:  stfld      int32 HelloWorld.Program/'<Fault>d__6'::'<>1__state'
        IL_002a:  ldarg.0
        IL_002b:  ldloc.2
        IL_002c:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Fault>d__6'::'<>u__1'
        IL_0031:  ldarg.0
        IL_0032:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__6'::'<>t__builder'
        IL_0037:  ldloca.s   V_2
        IL_0039:  ldarg.0
        IL_003a:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter,valuetype HelloWorld.Program/'<Fault>d__6'>(!!0&,
                                                                                                                                                                                                                                                                                               !!1&)
        IL_003f:  leave.s    IL_0083

        IL_0041:  ldarg.0
        IL_0042:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Fault>d__6'::'<>u__1'
        IL_0047:  stloc.2
        IL_0048:  ldarg.0
        IL_0049:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Fault>d__6'::'<>u__1'
        IL_004e:  initobj    [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter
        IL_0054:  ldarg.0
        IL_0055:  ldc.i4.m1
        IL_0056:  dup
        IL_0057:  stloc.0
        IL_0058:  stfld      int32 HelloWorld.Program/'<Fault>d__6'::'<>1__state'
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
        IL_006f:  stfld      int32 HelloWorld.Program/'<Fault>d__6'::'<>1__state'
        IL_0074:  ldarg.0
        IL_0075:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__6'::'<>t__builder'
        IL_007a:  ldloc.s    V_4
        IL_007c:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetException(class [System.Runtime]System.Exception)
        IL_0081:  leave.s    IL_0083

      }  // end handler
      IL_0083:  ret
    } // end of method '<Fault>d__6'::MoveNext

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
      IL_0001:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__6'::'<>t__builder'
      IL_0006:  ldarg.1
      IL_0007:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine)
      IL_000c:  ret
    } // end of method '<Fault>d__6'::SetStateMachine

  } // end of class '<Fault>d__6'

  .class auto ansi sealed nested private beforefieldinit '<Instance>d__3'
         extends [System.Runtime]System.ValueType
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> '<>t__builder'
    .field public class HelloWorld.Program '<>4__this'
    .field public int32 n
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter '<>u__1'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter '<>u__2'
    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       283 (0x11b)
      .maxstack  3
      .locals init (int32 V_0,
               class HelloWorld.Program V_1,
               int32 V_2,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter V_3,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable V_4,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter V_5,
               class [System.Runtime]System.Exception V_6)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
      IL_0006:  stloc.0
      IL_0007:  ldarg.0
      IL_0008:  ldfld      class HelloWorld.Program HelloWorld.Program/'<Instance>d__3'::'<>4__this'
      IL_000d:  stloc.1
      .try
      {
        IL_000e:  ldloc.0
        IL_000f:  brfalse.s  IL_0053

        IL_0011:  ldloc.0
        IL_0012:  ldc.i4.1
        IL_0013:  beq        IL_00c0

        IL_0018:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable [System.Runtime]System.Threading.Tasks.Task::Yield()
        IL_001d:  stloc.s    V_4
        IL_001f:  ldloca.s   V_4
        IL_0021:  call       instance valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable::GetAwaiter()
        IL_0026:  stloc.3
        IL_0027:  ldloca.s   V_3
        IL_0029:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::get_IsCompleted()
        IL_002e:  brtrue.s   IL_006f

        IL_0030:  ldarg.0
        IL_0031:  ldc.i4.0
        IL_0032:  dup
        IL_0033:  stloc.0
        IL_0034:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
        IL_0039:  ldarg.0
        IL_003a:  ldloc.3
        IL_003b:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Instance>d__3'::'<>u__1'
        IL_0040:  ldarg.0
        IL_0041:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Instance>d__3'::'<>t__builder'
        IL_0046:  ldloca.s   V_3
        IL_0048:  ldarg.0
        IL_0049:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter,valuetype HelloWorld.Program/'<Instance>d__3'>(!!0&,
                                                                                                                                                                                                                                                                                                  !!1&)
        IL_004e:  leave      IL_011a

        IL_0053:  ldarg.0
        IL_0054:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Instance>d__3'::'<>u__1'
        IL_0059:  stloc.3
        IL_005a:  ldarg.0
        IL_005b:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Instance>d__3'::'<>u__1'
        IL_0060:  initobj    [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter
        IL_0066:  ldarg.0
        IL_0067:  ldc.i4.m1
        IL_0068:  dup
        IL_0069:  stloc.0
        IL_006a:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
        IL_006f:  ldloca.s   V_3
        IL_0071:  call       instance void [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::GetResult()
        IL_0076:  ldloc.1
        IL_0077:  ldloc.1
        IL_0078:  ldfld      int32 HelloWorld.Program::offset
        IL_007d:  ldarg.0
        IL_007e:  ldfld      int32 HelloWorld.Program/'<Instance>d__3'::n
        IL_0083:  add
        IL_0084:  stfld      int32 HelloWorld.Program::offset
        IL_0089:  ldc.i4.2
        IL_008a:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::Delay(int32)
        IL_008f:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter [System.Runtime]System.Threading.Tasks.Task::GetAwaiter()
        IL_0094:  stloc.s    V_5
        IL_0096:  ldloca.s   V_5
        IL_0098:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::get_IsCompleted()
        IL_009d:  brtrue.s   IL_00dd

        IL_009f:  ldarg.0
        IL_00a0:  ldc.i4.1
        IL_00a1:  dup
        IL_00a2:  stloc.0
        IL_00a3:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
        IL_00a8:  ldarg.0
        IL_00a9:  ldloc.s    V_5
        IL_00ab:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Instance>d__3'::'<>u__2'
        IL_00b0:  ldarg.0
        IL_00b1:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Instance>d__3'::'<>t__builder'
        IL_00b6:  ldloca.s   V_5
        IL_00b8:  ldarg.0
        IL_00b9:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter,valuetype HelloWorld.Program/'<Instance>d__3'>(!!0&,
                                                                                                                                                                                                                                                                                  !!1&)
        IL_00be:  leave.s    IL_011a

        IL_00c0:  ldarg.0
        IL_00c1:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Instance>d__3'::'<>u__2'
        IL_00c6:  stloc.s    V_5
        IL_00c8:  ldarg.0
        IL_00c9:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Instance>d__3'::'<>u__2'
        IL_00ce:  initobj    [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter
        IL_00d4:  ldarg.0
        IL_00d5:  ldc.i4.m1
        IL_00d6:  dup
        IL_00d7:  stloc.0
        IL_00d8:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
        IL_00dd:  ldloca.s   V_5
        IL_00df:  call       instance void [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::GetResult()
        IL_00e4:  ldloc.1
        IL_00e5:  ldfld      int32 HelloWorld.Program::offset
        IL_00ea:  stloc.2
        IL_00eb:  leave.s    IL_0106

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_00ed:  stloc.s    V_6
        IL_00ef:  ldarg.0
        IL_00f0:  ldc.i4.s   -2
        IL_00f2:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
        IL_00f7:  ldarg.0
        IL_00f8:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Instance>d__3'::'<>t__builder'
        IL_00fd:  ldloc.s    V_6
        IL_00ff:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetException(class [System.Runtime]System.Exception)
        IL_0104:  leave.s    IL_011a

      }  // end handler
      IL_0106:  ldarg.0
      IL_0107:  ldc.i4.s   -2
      IL_0109:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
      IL_010e:  ldarg.0
      IL_010f:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Instance>d__3'::'<>t__builder'
      IL_0114:  ldloc.2
      IL_0115:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetResult(!0)
      IL_011a:  ret
    } // end of method '<Instance>d__3'::MoveNext

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
      IL_0001:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Instance>d__3'::'<>t__builder'
      IL_0006:  ldarg.1
      IL_0007:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine)
      IL_000c:  ret
    } // end of method '<Instance>d__3'::SetStateMachine

  } // end of class '<Instance>d__3'

  .class auto ansi sealed nested private beforefieldinit '<Main>d__9'
         extends [System.Runtime]System.ValueType
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder '<>t__builder'
    .field private int32 '<sum>5__2'
    .field private class [System.Runtime]System.Threading.Tasks.Task`1<int32> '<second>5__3'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> '<>u__1'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter '<>u__2'
    .field private int32 '<i>5__4'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter '<>u__3'
    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       1519 (0x5ef)
      .maxstack  4
      .locals init (int32 V_0,
               class [System.Runtime]System.Threading.Tasks.Task`1<int32> V_1,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_2,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter V_3,
               class [System.Runtime]System.InvalidOperationException V_4,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter V_5,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable V_6,
               int32 V_7,
               class [System.Runtime]System.Exception V_8)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
      IL_0006:  stloc.0
      .try
      {
        IL_0007:  ldloc.0
        IL_0008:  switch     ( 
                              IL_0076,
                              IL_00f4,
                              IL_0150,
                              IL_0178,
                              IL_0239,
                              IL_0299,
                              IL_02f9,
                              IL_035e,
                              IL_03db,
                              IL_044b,
                              IL_04f8,
                              IL_0559)
        IL_003d:  ldc.i4.s   10
        IL_003f:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Sum(int32)
        IL_0044:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_0049:  stloc.2
        IL_004a:  ldloca.s   V_2
        IL_004c:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_0051:  brtrue.s   IL_0092

        IL_0053:  ldarg.0
        IL_0054:  ldc.i4.0
        IL_0055:  dup
        IL_0056:  stloc.0
        IL_0057:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_005c:  ldarg.0
        IL_005d:  ldloc.2
        IL_005e:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_0063:  ldarg.0
        IL_0064:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_0069:  ldloca.s   V_2
        IL_006b:  ldarg.0
        IL_006c:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,valuetype HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                    !!1&)
        IL_0071:  leave      IL_05ee

        IL_0076:  ldarg.0
        IL_0077:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_007c:  stloc.2
        IL_007d:  ldarg.0
        IL_007e:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_0083:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_0089:  ldarg.0
        IL_008a:  ldc.i4.m1
        IL_008b:  dup
        IL_008c:  stloc.0
        IL_008d:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0092:  ldloca.s   V_2
        IL_0094:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_0099:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_009e:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::get_CompletedTask()
        IL_00a3:  callvirt   instance bool [System.Runtime]System.Threading.Tasks.Task::get_IsCompleted()
        IL_00a8:  call       void [System.Console]System.Console::WriteLine(bool)
        IL_00ad:  ldc.i4.3
        IL_00ae:  call       class [System.Runtime]System.Threading.Tasks.Task`1<!!0> [System.Runtime]System.Threading.Tasks.Task::FromResult<int32>(!!0)
        IL_00b3:  callvirt   instance bool [System.Runtime]System.Threading.Tasks.Task::get_IsCompleted()
        IL_00b8:  call       void [System.Console]System.Console::WriteLine(bool)
        IL_00bd:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::get_CompletedTask()
        IL_00c2:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter [System.Runtime]System.Threading.Tasks.Task::GetAwaiter()
        IL_00c7:  stloc.3
        IL_00c8:  ldloca.s   V_3
        IL_00ca:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::get_IsCompleted()
        IL_00cf:  brtrue.s   IL_0110

        IL_00d1:  ldarg.0
        IL_00d2:  ldc.i4.1
        IL_00d3:  dup
        IL_00d4:  stloc.0
        IL_00d5:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_00da:  ldarg.0
        IL_00db:  ldloc.3
        IL_00dc:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_00e1:  ldarg.0
        IL_00e2:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_00e7:  ldloca.s   V_3
        IL_00e9:  ldarg.0
        IL_00ea:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter,valuetype HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                           !!1&)
        IL_00ef:  leave      IL_05ee

        IL_00f4:  ldarg.0
        IL_00f5:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_00fa:  stloc.3
        IL_00fb:  ldarg.0
        IL_00fc:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_0101:  initobj    [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter
        IL_0107:  ldarg.0
        IL_0108:  ldc.i4.m1
        IL_0109:  dup
        IL_010a:  stloc.0
        IL_010b:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0110:  ldloca.s   V_3
        IL_0112:  call       instance void [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::GetResult()
        IL_0117:  ldc.i4.s   12
        IL_0119:  call       class [System.Runtime]System.Threading.Tasks.Task`1<!!0> [System.Runtime]System.Threading.Tasks.Task::FromResult<int32>(!!0)
        IL_011e:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_0123:  stloc.2
        IL_0124:  ldloca.s   V_2
        IL_0126:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_012b:  brtrue.s   IL_016c

        IL_012d:  ldarg.0
        IL_012e:  ldc.i4.2
        IL_012f:  dup
        IL_0130:  stloc.0
        IL_0131:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0136:  ldarg.0
        IL_0137:  ldloc.2
        IL_0138:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_013d:  ldarg.0
        IL_013e:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_0143:  ldloca.s   V_2
        IL_0145:  ldarg.0
        IL_0146:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,valuetype HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                    !!1&)
        IL_014b:  leave      IL_05ee

        IL_0150:  ldarg.0
        IL_0151:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_0156:  stloc.2
        IL_0157:  ldarg.0
        IL_0158:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_015d:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_0163:  ldarg.0
        IL_0164:  ldc.i4.m1
        IL_0165:  dup
        IL_0166:  stloc.0
        IL_0167:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_016c:  ldloca.s   V_2
        IL_016e:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_0173:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_0178:  nop
        .try
        {
          IL_0179:  ldloc.0
          IL_017a:  ldc.i4.3
          IL_017b:  beq.s      IL_01b4

          IL_017d:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Fault()
          IL_0182:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
          IL_0187:  stloc.2
          IL_0188:  ldloca.s   V_2
          IL_018a:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
          IL_018f:  brtrue.s   IL_01d0

          IL_0191:  ldarg.0
          IL_0192:  ldc.i4.3
          IL_0193:  dup
          IL_0194:  stloc.0
          IL_0195:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
          IL_019a:  ldarg.0
          IL_019b:  ldloc.2
          IL_019c:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
          IL_01a1:  ldarg.0
          IL_01a2:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
          IL_01a7:  ldloca.s   V_2
          IL_01a9:  ldarg.0
          IL_01aa:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,valuetype HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                      !!1&)
          IL_01af:  leave      IL_05ee

          IL_01b4:  ldarg.0
          IL_01b5:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
          IL_01ba:  stloc.2
          IL_01bb:  ldarg.0
          IL_01bc:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
          IL_01c1:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
          IL_01c7:  ldarg.0
          IL_01c8:  ldc.i4.m1
          IL_01c9:  dup
          IL_01ca:  stloc.0
          IL_01cb:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
          IL_01d0:  ldloca.s   V_2
          IL_01d2:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
          IL_01d7:  call       void [System.Console]System.Console::WriteLine(int32)
          IL_01dc:  leave.s    IL_01fc

        }  // end .try
        catch [System.Runtime]System.InvalidOperationException 
        {
          IL_01de:  stloc.s    V_4
          IL_01e0:  ldloc.s    V_4
          IL_01e2:  callvirt   instance string [System.Runtime]System.Exception::get_Message()
          IL_01e7:  call       void [System.Console]System.Console::WriteLine(string)
          IL_01ec:  ldsfld     class [System.Runtime]System.Exception HelloWorld.Program::original
          IL_01f1:  ldloc.s    V_4
          IL_01f3:  ceq
          IL_01f5:  call       void [System.Console]System.Console::WriteLine(bool)
          IL_01fa:  leave.s    IL_01fc

        }  // end handler
        IL_01fc:  newobj     instance void HelloWorld.Program::.ctor()
        IL_0201:  ldc.i4.5
        IL_0202:  call       instance class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Instance(int32)
        IL_0207:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_020c:  stloc.2
        IL_020d:  ldloca.s   V_2
        IL_020f:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_0214:  brtrue.s   IL_0255

        IL_0216:  ldarg.0
        IL_0217:  ldc.i4.4
        IL_0218:  dup
        IL_0219:  stloc.0
        IL_021a:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_021f:  ldarg.0
        IL_0220:  ldloc.2
        IL_0221:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_0226:  ldarg.0
        IL_0227:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_022c:  ldloca.s   V_2
        IL_022e:  ldarg.0
        IL_022f:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,valuetype HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                    !!1&)
        IL_0234:  leave      IL_05ee

        IL_0239:  ldarg.0
        IL_023a:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_023f:  stloc.2
        IL_0240:  ldarg.0
        IL_0241:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_0246:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_024c:  ldarg.0
        IL_024d:  ldc.i4.m1
        IL_024e:  dup
        IL_024f:  stloc.0
        IL_0250:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0255:  ldloca.s   V_2
        IL_0257:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_025c:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_0261:  ldc.i4.5
        IL_0262:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Nested(int32)
        IL_0267:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_026c:  stloc.2
        IL_026d:  ldloca.s   V_2
        IL_026f:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_0274:  brtrue.s   IL_02b5

        IL_0276:  ldarg.0
        IL_0277:  ldc.i4.5
        IL_0278:  dup
        IL_0279:  stloc.0
        IL_027a:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_027f:  ldarg.0
        IL_0280:  ldloc.2
        IL_0281:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_0286:  ldarg.0
        IL_0287:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_028c:  ldloca.s   V_2
        IL_028e:  ldarg.0
        IL_028f:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,valuetype HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                    !!1&)
        IL_0294:  leave      IL_05ee

        IL_0299:  ldarg.0
        IL_029a:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_029f:  stloc.2
        IL_02a0:  ldarg.0
        IL_02a1:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_02a6:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_02ac:  ldarg.0
        IL_02ad:  ldc.i4.m1
        IL_02ae:  dup
        IL_02af:  stloc.0
        IL_02b0:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_02b5:  ldloca.s   V_2
        IL_02b7:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_02bc:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_02c1:  ldc.i4.3
        IL_02c2:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::Delay(int32)
        IL_02c7:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter [System.Runtime]System.Threading.Tasks.Task::GetAwaiter()
        IL_02cc:  stloc.3
        IL_02cd:  ldloca.s   V_3
        IL_02cf:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::get_IsCompleted()
        IL_02d4:  brtrue.s   IL_0315

        IL_02d6:  ldarg.0
        IL_02d7:  ldc.i4.6
        IL_02d8:  dup
        IL_02d9:  stloc.0
        IL_02da:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_02df:  ldarg.0
        IL_02e0:  ldloc.3
        IL_02e1:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_02e6:  ldarg.0
        IL_02e7:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_02ec:  ldloca.s   V_3
        IL_02ee:  ldarg.0
        IL_02ef:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter,valuetype HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                           !!1&)
        IL_02f4:  leave      IL_05ee

        IL_02f9:  ldarg.0
        IL_02fa:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_02ff:  stloc.3
        IL_0300:  ldarg.0
        IL_0301:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_0306:  initobj    [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter
        IL_030c:  ldarg.0
        IL_030d:  ldc.i4.m1
        IL_030e:  dup
        IL_030f:  stloc.0
        IL_0310:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0315:  ldloca.s   V_3
        IL_0317:  call       instance void [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::GetResult()
        IL_031c:  ldstr      "delay one"
        IL_0321:  call       void [System.Console]System.Console::WriteLine(string)
        IL_0326:  ldc.i4.1
        IL_0327:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::Delay(int32)
        IL_032c:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter [System.Runtime]System.Threading.Tasks.Task::GetAwaiter()
        IL_0331:  stloc.3
        IL_0332:  ldloca.s   V_3
        IL_0334:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::get_IsCompleted()
        IL_0339:  brtrue.s   IL_037a

        IL_033b:  ldarg.0
        IL_033c:  ldc.i4.7
        IL_033d:  dup
        IL_033e:  stloc.0
        IL_033f:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0344:  ldarg.0
        IL_0345:  ldloc.3
        IL_0346:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_034b:  ldarg.0
        IL_034c:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_0351:  ldloca.s   V_3
        IL_0353:  ldarg.0
        IL_0354:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter,valuetype HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                           !!1&)
        IL_0359:  leave      IL_05ee

        IL_035e:  ldarg.0
        IL_035f:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_0364:  stloc.3
        IL_0365:  ldarg.0
        IL_0366:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_036b:  initobj    [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter
        IL_0371:  ldarg.0
        IL_0372:  ldc.i4.m1
        IL_0373:  dup
        IL_0374:  stloc.0
        IL_0375:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_037a:  ldloca.s   V_3
        IL_037c:  call       instance void [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::GetResult()
        IL_0381:  ldstr      "delay two"
        IL_0386:  call       void [System.Console]System.Console::WriteLine(string)
        IL_038b:  ldarg.0
        IL_038c:  ldc.i4.0
        IL_038d:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<sum>5__2'
        IL_0392:  ldarg.0
        IL_0393:  ldc.i4.0
        IL_0394:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<i>5__4'
        IL_0399:  br         IL_0492

        IL_039e:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable [System.Runtime]System.Threading.Tasks.Task::Yield()
        IL_03a3:  stloc.s    V_6
        IL_03a5:  ldloca.s   V_6
        IL_03a7:  call       instance valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable::GetAwaiter()
        IL_03ac:  stloc.s    V_5
        IL_03ae:  ldloca.s   V_5
        IL_03b0:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::get_IsCompleted()
        IL_03b5:  brtrue.s   IL_03f8

        IL_03b7:  ldarg.0
        IL_03b8:  ldc.i4.8
        IL_03b9:  dup
        IL_03ba:  stloc.0
        IL_03bb:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_03c0:  ldarg.0
        IL_03c1:  ldloc.s    V_5
        IL_03c3:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__3'
        IL_03c8:  ldarg.0
        IL_03c9:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_03ce:  ldloca.s   V_5
        IL_03d0:  ldarg.0
        IL_03d1:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter,valuetype HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                           !!1&)
        IL_03d6:  leave      IL_05ee

        IL_03db:  ldarg.0
        IL_03dc:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__3'
        IL_03e1:  stloc.s    V_5
        IL_03e3:  ldarg.0
        IL_03e4:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__3'
        IL_03e9:  initobj    [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter
        IL_03ef:  ldarg.0
        IL_03f0:  ldc.i4.m1
        IL_03f1:  dup
        IL_03f2:  stloc.0
        IL_03f3:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_03f8:  ldloca.s   V_5
        IL_03fa:  call       instance void [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::GetResult()
        IL_03ff:  ldarg.0
        IL_0400:  ldarg.0
        IL_0401:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<sum>5__2'
        IL_0406:  ldarg.0
        IL_0407:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<i>5__4'
        IL_040c:  add
        IL_040d:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<sum>5__2'
        IL_0412:  ldc.i4.1
        IL_0413:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::Delay(int32)
        IL_0418:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter [System.Runtime]System.Threading.Tasks.Task::GetAwaiter()
        IL_041d:  stloc.3
        IL_041e:  ldloca.s   V_3
        IL_0420:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::get_IsCompleted()
        IL_0425:  brtrue.s   IL_0467

        IL_0427:  ldarg.0
        IL_0428:  ldc.i4.s   9
        IL_042a:  dup
        IL_042b:  stloc.0
        IL_042c:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0431:  ldarg.0
        IL_0432:  ldloc.3
        IL_0433:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_0438:  ldarg.0
        IL_0439:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_043e:  ldloca.s   V_3
        IL_0440:  ldarg.0
        IL_0441:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter,valuetype HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                           !!1&)
        IL_0446:  leave      IL_05ee

        IL_044b:  ldarg.0
        IL_044c:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_0451:  stloc.3
        IL_0452:  ldarg.0
        IL_0453:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_0458:  initobj    [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter
        IL_045e:  ldarg.0
        IL_045f:  ldc.i4.m1
        IL_0460:  dup
        IL_0461:  stloc.0
        IL_0462:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0467:  ldloca.s   V_3
        IL_0469:  call       instance void [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::GetResult()
        IL_046e:  ldarg.0
        IL_046f:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<sum>5__2'
        IL_0474:  stloc.s    V_7
        IL_0476:  ldarg.0
        IL_0477:  ldloc.s    V_7
        IL_0479:  ldc.i4.1
        IL_047a:  add
        IL_047b:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<sum>5__2'
        IL_0480:  ldarg.0
        IL_0481:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<i>5__4'
        IL_0486:  stloc.s    V_7
        IL_0488:  ldarg.0
        IL_0489:  ldloc.s    V_7
        IL_048b:  ldc.i4.1
        IL_048c:  add
        IL_048d:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<i>5__4'
        IL_0492:  ldarg.0
        IL_0493:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<i>5__4'
        IL_0498:  ldc.i4.8
        IL_0499:  blt        IL_039e

        IL_049e:  ldarg.0
        IL_049f:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<sum>5__2'
        IL_04a4:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_04a9:  ldc.i4.4
        IL_04aa:  ldc.i4.5
        IL_04ab:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Add(int32,
                                                                                                                int32)
        IL_04b0:  stloc.1
        IL_04b1:  ldloc.1
        IL_04b2:  ldc.i4.3
        IL_04b3:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Consumer(class [System.Runtime]System.Threading.Tasks.Task`1<int32>,
                                                                                                                     int32)
        IL_04b8:  ldarg.0
        IL_04b9:  ldloc.1
        IL_04ba:  ldc.i4.1
        IL_04bb:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Consumer(class [System.Runtime]System.Threading.Tasks.Task`1<int32>,
                                                                                                                     int32)
        IL_04c0:  stfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<second>5__3'
        IL_04c5:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_04ca:  stloc.2
        IL_04cb:  ldloca.s   V_2
        IL_04cd:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_04d2:  brtrue.s   IL_0514

        IL_04d4:  ldarg.0
        IL_04d5:  ldc.i4.s   10
        IL_04d7:  dup
        IL_04d8:  stloc.0
        IL_04d9:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_04de:  ldarg.0
        IL_04df:  ldloc.2
        IL_04e0:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_04e5:  ldarg.0
        IL_04e6:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_04eb:  ldloca.s   V_2
        IL_04ed:  ldarg.0
        IL_04ee:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,valuetype HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                    !!1&)
        IL_04f3:  leave      IL_05ee

        IL_04f8:  ldarg.0
        IL_04f9:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_04fe:  stloc.2
        IL_04ff:  ldarg.0
        IL_0500:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_0505:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_050b:  ldarg.0
        IL_050c:  ldc.i4.m1
        IL_050d:  dup
        IL_050e:  stloc.0
        IL_050f:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0514:  ldloca.s   V_2
        IL_0516:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_051b:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_0520:  ldarg.0
        IL_0521:  ldfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<second>5__3'
        IL_0526:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_052b:  stloc.2
        IL_052c:  ldloca.s   V_2
        IL_052e:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_0533:  brtrue.s   IL_0575

        IL_0535:  ldarg.0
        IL_0536:  ldc.i4.s   11
        IL_0538:  dup
        IL_0539:  stloc.0
        IL_053a:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_053f:  ldarg.0
        IL_0540:  ldloc.2
        IL_0541:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_0546:  ldarg.0
        IL_0547:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_054c:  ldloca.s   V_2
        IL_054e:  ldarg.0
        IL_054f:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,valuetype HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                    !!1&)
        IL_0554:  leave      IL_05ee

        IL_0559:  ldarg.0
        IL_055a:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_055f:  stloc.2
        IL_0560:  ldarg.0
        IL_0561:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_0566:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_056c:  ldarg.0
        IL_056d:  ldc.i4.m1
        IL_056e:  dup
        IL_056f:  stloc.0
        IL_0570:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0575:  ldloca.s   V_2
        IL_0577:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_057c:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_0581:  ldsfld     int32 HelloWorld.Program::resumed
        IL_0586:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_058b:  ldc.i4.0
        IL_058c:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::Delay(int32)
        IL_0591:  callvirt   instance bool [System.Runtime]System.Threading.Tasks.Task::get_IsCompleted()
        IL_0596:  call       void [System.Console]System.Console::WriteLine(bool)
        .try
        {
          IL_059b:  ldc.i4.s   -2
          IL_059d:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::Delay(int32)
          IL_05a2:  pop
          IL_05a3:  leave.s    IL_05b2

        }  // end .try
        catch [System.Runtime]System.ArgumentOutOfRangeException 
        {
          IL_05a5:  pop
          IL_05a6:  ldstr      "negative delay"
          IL_05ab:  call       void [System.Console]System.Console::WriteLine(string)
          IL_05b0:  leave.s    IL_05b2

        }  // end handler
        IL_05b2:  leave.s    IL_05d4

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_05b4:  stloc.s    V_8
        IL_05b6:  ldarg.0
        IL_05b7:  ldc.i4.s   -2
        IL_05b9:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_05be:  ldarg.0
        IL_05bf:  ldnull
        IL_05c0:  stfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<second>5__3'
        IL_05c5:  ldarg.0
        IL_05c6:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_05cb:  ldloc.s    V_8
        IL_05cd:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::SetException(class [System.Runtime]System.Exception)
        IL_05d2:  leave.s    IL_05ee

      }  // end handler
      IL_05d4:  ldarg.0
      IL_05d5:  ldc.i4.s   -2
      IL_05d7:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
      IL_05dc:  ldarg.0
      IL_05dd:  ldnull
      IL_05de:  stfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<second>5__3'
      IL_05e3:  ldarg.0
      IL_05e4:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
      IL_05e9:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::SetResult()
      IL_05ee:  ret
    } // end of method '<Main>d__9'::MoveNext

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
      IL_0001:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
      IL_0006:  ldarg.1
      IL_0007:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine)
      IL_000c:  ret
    } // end of method '<Main>d__9'::SetStateMachine

  } // end of class '<Main>d__9'

  .class auto ansi sealed nested private beforefieldinit '<Nested>d__4'
         extends [System.Runtime]System.ValueType
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> '<>t__builder'
    .field public int32 n
    .field private int32 '<>7__wrap1'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> '<>u__1'
    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       363 (0x16b)
      .maxstack  3
      .locals init (int32 V_0,
               int32 V_1,
               int32 V_2,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_3,
               class [System.Runtime]System.Exception V_4)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
      IL_0006:  stloc.0
      .try
      {
        IL_0007:  ldloc.0
        IL_0008:  switch     ( 
                              IL_0056,
                              IL_00b8,
                              IL_0117)
        IL_0019:  ldarg.0
        IL_001a:  ldfld      int32 HelloWorld.Program/'<Nested>d__4'::n
        IL_001f:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Sum(int32)
        IL_0024:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_0029:  stloc.3
        IL_002a:  ldloca.s   V_3
        IL_002c:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_0031:  brtrue.s   IL_0072

        IL_0033:  ldarg.0
        IL_0034:  ldc.i4.0
        IL_0035:  dup
        IL_0036:  stloc.0
        IL_0037:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
        IL_003c:  ldarg.0
        IL_003d:  ldloc.3
        IL_003e:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_0043:  ldarg.0
        IL_0044:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
        IL_0049:  ldloca.s   V_3
        IL_004b:  ldarg.0
        IL_004c:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,valuetype HelloWorld.Program/'<Nested>d__4'>(!!0&,
                                                                                                                                                                                                                                                                                         !!1&)
        IL_0051:  leave      IL_016a

        IL_0056:  ldarg.0
        IL_0057:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_005c:  stloc.3
        IL_005d:  ldarg.0
        IL_005e:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_0063:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_0069:  ldarg.0
        IL_006a:  ldc.i4.m1
        IL_006b:  dup
        IL_006c:  stloc.0
        IL_006d:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
        IL_0072:  ldarg.0
        IL_0073:  ldloca.s   V_3
        IL_0075:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_007a:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>7__wrap1'
        IL_007f:  ldc.i4.2
        IL_0080:  ldc.i4.3
        IL_0081:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Add(int32,
                                                                                                                int32)
        IL_0086:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_008b:  stloc.3
        IL_008c:  ldloca.s   V_3
        IL_008e:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_0093:  brtrue.s   IL_00d4

        IL_0095:  ldarg.0
        IL_0096:  ldc.i4.1
        IL_0097:  dup
        IL_0098:  stloc.0
        IL_0099:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
        IL_009e:  ldarg.0
        IL_009f:  ldloc.3
        IL_00a0:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_00a5:  ldarg.0
        IL_00a6:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
        IL_00ab:  ldloca.s   V_3
        IL_00ad:  ldarg.0
        IL_00ae:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,valuetype HelloWorld.Program/'<Nested>d__4'>(!!0&,
                                                                                                                                                                                                                                                                                         !!1&)
        IL_00b3:  leave      IL_016a

        IL_00b8:  ldarg.0
        IL_00b9:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_00be:  stloc.3
        IL_00bf:  ldarg.0
        IL_00c0:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_00c5:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_00cb:  ldarg.0
        IL_00cc:  ldc.i4.m1
        IL_00cd:  dup
        IL_00ce:  stloc.0
        IL_00cf:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
        IL_00d4:  ldloca.s   V_3
        IL_00d6:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_00db:  stloc.2
        IL_00dc:  ldarg.0
        IL_00dd:  ldfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>7__wrap1'
        IL_00e2:  ldloc.2
        IL_00e3:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Add(int32,
                                                                                                                int32)
        IL_00e8:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_00ed:  stloc.3
        IL_00ee:  ldloca.s   V_3
        IL_00f0:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_00f5:  brtrue.s   IL_0133

        IL_00f7:  ldarg.0
        IL_00f8:  ldc.i4.2
        IL_00f9:  dup
        IL_00fa:  stloc.0
        IL_00fb:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
        IL_0100:  ldarg.0
        IL_0101:  ldloc.3
        IL_0102:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_0107:  ldarg.0
        IL_0108:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
        IL_010d:  ldloca.s   V_3
        IL_010f:  ldarg.0
        IL_0110:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,valuetype HelloWorld.Program/'<Nested>d__4'>(!!0&,
                                                                                                                                                                                                                                                                                         !!1&)
        IL_0115:  leave.s    IL_016a

        IL_0117:  ldarg.0
        IL_0118:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_011d:  stloc.3
        IL_011e:  ldarg.0
        IL_011f:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_0124:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_012a:  ldarg.0
        IL_012b:  ldc.i4.m1
        IL_012c:  dup
        IL_012d:  stloc.0
        IL_012e:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
        IL_0133:  ldloca.s   V_3
        IL_0135:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_013a:  stloc.1
        IL_013b:  leave.s    IL_0156

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_013d:  stloc.s    V_4
        IL_013f:  ldarg.0
        IL_0140:  ldc.i4.s   -2
        IL_0142:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
        IL_0147:  ldarg.0
        IL_0148:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
        IL_014d:  ldloc.s    V_4
        IL_014f:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetException(class [System.Runtime]System.Exception)
        IL_0154:  leave.s    IL_016a

      }  // end handler
      IL_0156:  ldarg.0
      IL_0157:  ldc.i4.s   -2
      IL_0159:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
      IL_015e:  ldarg.0
      IL_015f:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
      IL_0164:  ldloc.1
      IL_0165:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetResult(!0)
      IL_016a:  ret
    } // end of method '<Nested>d__4'::MoveNext

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
      IL_0001:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
      IL_0006:  ldarg.1
      IL_0007:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine)
      IL_000c:  ret
    } // end of method '<Nested>d__4'::SetStateMachine

  } // end of class '<Nested>d__4'

  .class auto ansi sealed nested private beforefieldinit '<Sum>d__2'
         extends [System.Runtime]System.ValueType
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> '<>t__builder'
    .field public int32 n
    .field private int32 '<i>5__2'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> '<>u__1'
    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       198 (0xc6)
      .maxstack  3
      .locals init (int32 V_0,
               int32 V_1,
               int32 V_2,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_3,
               int32 V_4,
               class [System.Runtime]System.Exception V_5)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Sum>d__2'::'<>1__state'
      IL_0006:  stloc.0
      .try
      {
        IL_0007:  ldloc.0
        IL_0008:  brfalse.s  IL_0050

        IL_000a:  ldc.i4.0
        IL_000b:  stloc.2
        IL_000c:  ldarg.0
        IL_000d:  ldc.i4.0
        IL_000e:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<i>5__2'
        IL_0013:  br.s       IL_0086

        IL_0015:  ldloc.2
        IL_0016:  ldarg.0
        IL_0017:  ldfld      int32 HelloWorld.Program/'<Sum>d__2'::'<i>5__2'
        IL_001c:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Add(int32,
                                                                                                                int32)
        IL_0021:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_0026:  stloc.3
        IL_0027:  ldloca.s   V_3
        IL_0029:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_002e:  brtrue.s   IL_006c

        IL_0030:  ldarg.0
        IL_0031:  ldc.i4.0
        IL_0032:  dup
        IL_0033:  stloc.0
        IL_0034:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<>1__state'
        IL_0039:  ldarg.0
        IL_003a:  ldloc.3
        IL_003b:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>u__1'
        IL_0040:  ldarg.0
        IL_0041:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>t__builder'
        IL_0046:  ldloca.s   V_3
        IL_0048:  ldarg.0
        IL_0049:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,valuetype HelloWorld.Program/'<Sum>d__2'>(!!0&,
                                                                                                                                                                                                                                                                                      !!1&)
        IL_004e:  leave.s    IL_00c5

        IL_0050:  ldarg.0
        IL_0051:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>u__1'
        IL_0056:  stloc.3
        IL_0057:  ldarg.0
        IL_0058:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>u__1'
        IL_005d:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_0063:  ldarg.0
        IL_0064:  ldc.i4.m1
        IL_0065:  dup
        IL_0066:  stloc.0
        IL_0067:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<>1__state'
        IL_006c:  ldloca.s   V_3
        IL_006e:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_0073:  stloc.2
        IL_0074:  ldarg.0
        IL_0075:  ldfld      int32 HelloWorld.Program/'<Sum>d__2'::'<i>5__2'
        IL_007a:  stloc.s    V_4
        IL_007c:  ldarg.0
        IL_007d:  ldloc.s    V_4
        IL_007f:  ldc.i4.1
        IL_0080:  add
        IL_0081:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<i>5__2'
        IL_0086:  ldarg.0
        IL_0087:  ldfld      int32 HelloWorld.Program/'<Sum>d__2'::'<i>5__2'
        IL_008c:  ldarg.0
        IL_008d:  ldfld      int32 HelloWorld.Program/'<Sum>d__2'::n
        IL_0092:  blt.s      IL_0015

        IL_0094:  ldloc.2
        IL_0095:  stloc.1
        IL_0096:  leave.s    IL_00b1

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_0098:  stloc.s    V_5
        IL_009a:  ldarg.0
        IL_009b:  ldc.i4.s   -2
        IL_009d:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<>1__state'
        IL_00a2:  ldarg.0
        IL_00a3:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>t__builder'
        IL_00a8:  ldloc.s    V_5
        IL_00aa:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetException(class [System.Runtime]System.Exception)
        IL_00af:  leave.s    IL_00c5

      }  // end handler
      IL_00b1:  ldarg.0
      IL_00b2:  ldc.i4.s   -2
      IL_00b4:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<>1__state'
      IL_00b9:  ldarg.0
      IL_00ba:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>t__builder'
      IL_00bf:  ldloc.1
      IL_00c0:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetResult(!0)
      IL_00c5:  ret
    } // end of method '<Sum>d__2'::MoveNext

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
      IL_0001:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>t__builder'
      IL_0006:  ldarg.1
      IL_0007:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine)
      IL_000c:  ret
    } // end of method '<Sum>d__2'::SetStateMachine

  } // end of class '<Sum>d__2'

  .field private int32 offset
  .field private static class [System.Runtime]System.Exception original
  .field private static int32 resumed
  .method private hidebysig static class [System.Runtime]System.Threading.Tasks.Task`1<int32> 
          Add(int32 a,
              int32 b) cil managed
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.AsyncStateMachineAttribute::.ctor(class [System.Runtime]System.Type) = ( 01 00 1C 48 65 6C 6C 6F 57 6F 72 6C 64 2E 50 72   // ...HelloWorld.Pr
                                                                                                                                                   6F 67 72 61 6D 2B 3C 41 64 64 3E 64 5F 5F 31 00   // ogram+<Add>d__1.
                                                                                                                                                   00 ) 
    // Code size       63 (0x3f)
    .maxstack  2
    .locals init (valuetype HelloWorld.Program/'<Add>d__1' V_0)
    IL_0000:  ldloca.s   V_0
    IL_0002:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Create()
    IL_0007:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Add>d__1'::'<>t__builder'
    IL_000c:  ldloca.s   V_0
    IL_000e:  ldarg.0
    IL_000f:  stfld      int32 HelloWorld.Program/'<Add>d__1'::a
    IL_0014:  ldloca.s   V_0
    IL_0016:  ldarg.1
    IL_0017:  stfld      int32 HelloWorld.Program/'<Add>d__1'::b
    IL_001c:  ldloca.s   V_0
    IL_001e:  ldc.i4.m1
    IL_001f:  stfld      int32 HelloWorld.Program/'<Add>d__1'::'<>1__state'
    IL_0024:  ldloca.s   V_0
    IL_0026:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Add>d__1'::'<>t__builder'
    IL_002b:  ldloca.s   V_0
    IL_002d:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Start<valuetype HelloWorld.Program/'<Add>d__1'>(!!0&)
    IL_0032:  ldloca.s   V_0
    IL_0034:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Add>d__1'::'<>t__builder'
    IL_0039:  call       instance class [System.Runtime]System.Threading.Tasks.Task`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::get_Task()
    IL_003e:  ret
  } // end of method Program::Add

  .method private hidebysig static class [System.Runtime]System.Threading.Tasks.Task`1<int32> 
          Sum(int32 n) cil managed
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.AsyncStateMachineAttribute::.ctor(class [System.Runtime]System.Type) = ( 01 00 1C 48 65 6C 6C 6F 57 6F 72 6C 64 2E 50 72   // ...HelloWorld.Pr
                                                                                                                                                   6F 67 72 61 6D 2B 3C 53 75 6D 3E 64 5F 5F 32 00   // ogram+<Sum>d__2.
                                                                                                                                                   00 ) 
    // Code size       55 (0x37)
    .maxstack  2
    .locals init (valuetype HelloWorld.Program/'<Sum>d__2' V_0)
    IL_0000:  ldloca.s   V_0
    IL_0002:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Create()
    IL_0007:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>t__builder'
    IL_000c:  ldloca.s   V_0
    IL_000e:  ldarg.0
    IL_000f:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::n
    IL_0014:  ldloca.s   V_0
    IL_0016:  ldc.i4.m1
    IL_0017:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<>1__state'
    IL_001c:  ldloca.s   V_0
    IL_001e:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>t__builder'
    IL_0023:  ldloca.s   V_0
    IL_0025:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Start<valuetype HelloWorld.Program/'<Sum>d__2'>(!!0&)
    IL_002a:  ldloca.s   V_0
    IL_002c:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>t__builder'
    IL_0031:  call       instance class [System.Runtime]System.Threading.Tasks.Task`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::get_Task()
    IL_0036:  ret
  } // end of method Program::Sum

  .method private hidebysig instance class [System.Runtime]System.Threading.Tasks.Task`1<int32> 
          Instance(int32 n) cil managed
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.AsyncStateMachineAttribute::.ctor(class [System.Runtime]System.Type) = ( 01 00 21 48 65 6C 6C 6F 57 6F 72 6C 64 2E 50 72   // ..!HelloWorld.Pr
                                                                                                                                                   6F 67 72 61 6D 2B 3C 49 6E 73 74 61 6E 63 65 3E   // ogram+<Instance>
                                                                                                                                                   64 5F 5F 33 00 00 )                               // d__3..
    // Code size       63 (0x3f)
    .maxstack  2
    .locals init (valuetype HelloWorld.Program/'<Instance>d__3' V_0)
    IL_0000:  ldloca.s   V_0
    IL_0002:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Create()
    IL_0007:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Instance>d__3'::'<>t__builder'
    IL_000c:  ldloca.s   V_0
    IL_000e:  ldarg.0
    IL_000f:  stfld      class HelloWorld.Program HelloWorld.Program/'<Instance>d__3'::'<>4__this'
    IL_0014:  ldloca.s   V_0
    IL_0016:  ldarg.1
    IL_0017:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::n
    IL_001c:  ldloca.s   V_0
    IL_001e:  ldc.i4.m1
    IL_001f:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
    IL_0024:  ldloca.s   V_0
    IL_0026:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Instance>d__3'::'<>t__builder'
    IL_002b:  ldloca.s   V_0
    IL_002d:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Start<valuetype HelloWorld.Program/'<Instance>d__3'>(!!0&)
    IL_0032:  ldloca.s   V_0
    IL_0034:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Instance>d__3'::'<>t__builder'
    IL_0039:  call       instance class [System.Runtime]System.Threading.Tasks.Task`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::get_Task()
    IL_003e:  ret
  } // end of method Program::Instance

  .method private hidebysig static class [System.Runtime]System.Threading.Tasks.Task`1<int32> 
          Nested(int32 n) cil managed
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.AsyncStateMachineAttribute::.ctor(class [System.Runtime]System.Type) = ( 01 00 1F 48 65 6C 6C 6F 57 6F 72 6C 64 2E 50 72   // ...HelloWorld.Pr
                                                                                                                                                   6F 67 72 61 6D 2B 3C 4E 65 73 74 65 64 3E 64 5F   // ogram+<Nested>d_
                                                                                                                                                   5F 34 00 00 )                                     // _4..
    // Code size       55 (0x37)
    .maxstack  2
    .locals init (valuetype HelloWorld.Program/'<Nested>d__4' V_0)
    IL_0000:  ldloca.s   V_0
    IL_0002:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Create()
    IL_0007:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
    IL_000c:  ldloca.s   V_0
    IL_000e:  ldarg.0
    IL_000f:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::n
    IL_0014:  ldloca.s   V_0
    IL_0016:  ldc.i4.m1
    IL_0017:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
    IL_001c:  ldloca.s   V_0
    IL_001e:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
    IL_0023:  ldloca.s   V_0
    IL_0025:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Start<valuetype HelloWorld.Program/'<Nested>d__4'>(!!0&)
    IL_002a:  ldloca.s   V_0
    IL_002c:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
    IL_0031:  call       instance class [System.Runtime]System.Threading.Tasks.Task`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::get_Task()
    IL_0036:  ret
  } // end of method Program::Nested

  .method private hidebysig static class [System.Runtime]System.Threading.Tasks.Task`1<int32> 
          Fault() cil managed
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.AsyncStateMachineAttribute::.ctor(class [System.Runtime]System.Type) = ( 01 00 1E 48 65 6C 6C 6F 57 6F 72 6C 64 2E 50 72   // ...HelloWorld.Pr
                                                                                                                                                   6F 67 72 61 6D 2B 3C 46 61 75 6C 74 3E 64 5F 5F   // ogram+<Fault>d__
                                                                                                                                                   36 00 00 )                                        // 6..
    // Code size       47 (0x2f)
    .maxstack  2
    .locals init (valuetype HelloWorld.Program/'<Fault>d__6' V_0)
    IL_0000:  ldloca.s   V_0
    IL_0002:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Create()
    IL_0007:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__6'::'<>t__builder'
    IL_000c:  ldloca.s   V_0
    IL_000e:  ldc.i4.m1
    IL_000f:  stfld      int32 HelloWorld.Program/'<Fault>d__6'::'<>1__state'
    IL_0014:  ldloca.s   V_0
    IL_0016:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__6'::'<>t__builder'
    IL_001b:  ldloca.s   V_0
    IL_001d:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Start<valuetype HelloWorld.Program/'<Fault>d__6'>(!!0&)
    IL_0022:  ldloca.s   V_0
    IL_0024:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__6'::'<>t__builder'
    IL_0029:  call       instance class [System.Runtime]System.Threading.Tasks.Task`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::get_Task()
    IL_002e:  ret
  } // end of method Program::Fault

  .method private hidebysig static class [System.Runtime]System.Threading.Tasks.Task`1<int32> 
          Consumer(class [System.Runtime]System.Threading.Tasks.Task`1<int32> task,
                   int32 delay) cil managed
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.AsyncStateMachineAttribute::.ctor(class [System.Runtime]System.Type) = ( 01 00 21 48 65 6C 6C 6F 57 6F 72 6C 64 2E 50 72   // ..!HelloWorld.Pr
                                                                                                                                                   6F 67 72 61 6D 2B 3C 43 6F 6E 73 75 6D 65 72 3E   // ogram+<Consumer>
                                                                                                                                                   64 5F 5F 38 00 00 )                               // d__8..
    // Code size       63 (0x3f)
    .maxstack  2
    .locals init (valuetype HelloWorld.Program/'<Consumer>d__8' V_0)
    IL_0000:  ldloca.s   V_0
    IL_0002:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Create()
    IL_0007:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>t__builder'
    IL_000c:  ldloca.s   V_0
    IL_000e:  ldarg.0
    IL_000f:  stfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Consumer>d__8'::task
    IL_0014:  ldloca.s   V_0
    IL_0016:  ldarg.1
    IL_0017:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::delay
    IL_001c:  ldloca.s   V_0
    IL_001e:  ldc.i4.m1
    IL_001f:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
    IL_0024:  ldloca.s   V_0
    IL_0026:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>t__builder'
    IL_002b:  ldloca.s   V_0
    IL_002d:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Start<valuetype HelloWorld.Program/'<Consumer>d__8'>(!!0&)
    IL_0032:  ldloca.s   V_0
    IL_0034:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>t__builder'
    IL_0039:  call       instance class [System.Runtime]System.Threading.Tasks.Task`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::get_Task()
    IL_003e:  ret
  } // end of method Program::Consumer

  .method private hidebysig static class [System.Runtime]System.Threading.Tasks.Task 
          Main() cil managed
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.AsyncStateMachineAttribute::.ctor(class [System.Runtime]System.Type) = ( 01 00 1D 48 65 6C 6C 6F 57 6F 72 6C 64 2E 50 72   // ...HelloWorld.Pr
                                                                                                                                                   6F 67 72 61 6D 2B 3C 4D 61 69 6E 3E 64 5F 5F 39   // ogram+<Main>d__9
                                                                                                                                                   00 00 ) 
    // Code size       47 (0x2f)
    .maxstack  2
    .locals init (valuetype HelloWorld.Program/'<Main>d__9' V_0)
    IL_0000:  ldloca.s   V_0
    IL_0002:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::Create()
    IL_0007:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
    IL_000c:  ldloca.s   V_0
    IL_000e:  ldc.i4.m1
    IL_000f:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
    IL_0014:  ldloca.s   V_0
    IL_0016:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
    IL_001b:  ldloca.s   V_0
    IL_001d:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::Start<valuetype HelloWorld.Program/'<Main>d__9'>(!!0&)
    IL_0022:  ldloca.s   V_0
    IL_0024:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
    IL_0029:  call       instance class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::get_Task()
    IL_002e:  ret
  } // end of method Program::Main

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldc.i4.7
    IL_0002:  stfld      int32 HelloWorld.Program::offset
    IL_0007:  ldarg.0
    IL_0008:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_000d:  ret
  } // end of method Program::.ctor

  .method private hidebysig specialname rtspecialname static 
          void  .cctor() cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldstr      "async failure"
    IL_0005:  newobj     instance void [System.Runtime]System.InvalidOperationException::.ctor(string)
    IL_000a:  stsfld     class [System.Runtime]System.Exception HelloWorld.Program::original
    IL_000f:  ret
  } // end of method Program::.cctor

  .method private hidebysig specialname static 
          void  '<Main>'() cil managed
  {
    .entrypoint
    // Code size       19 (0x13)
    .maxstack  1
    .locals init (valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter V_0)
    IL_0000:  call       class [System.Runtime]System.Threading.Tasks.Task HelloWorld.Program::Main()
    IL_0005:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter [System.Runtime]System.Threading.Tasks.Task::GetAwaiter()
    IL_000a:  stloc.0
    IL_000b:  ldloca.s   V_0
    IL_000d:  call       instance void [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::GetResult()
    IL_0012:  ret
  } // end of method Program::'<Main>'

} // end of class HelloWorld.Program


// =============================================================

// *********** DISASSEMBLY COMPLETE ***********************
