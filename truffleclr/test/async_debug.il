
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
// MVID: {c39701a7-83c8-4958-9c8d-4f2ce5a60532}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x10109c000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .class auto ansi sealed nested private beforefieldinit '<Add>d__1'
         extends [System.Runtime]System.Object
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> '<>t__builder'
    .field public int32 a
    .field public int32 b
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter '<>u__1'
    .method public hidebysig specialname rtspecialname 
            instance void  .ctor() cil managed
    {
      // Code size       8 (0x8)
      .maxstack  8
      IL_0000:  ldarg.0
      IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
      IL_0006:  nop
      IL_0007:  ret
    } // end of method '<Add>d__1'::.ctor

    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       175 (0xaf)
      .maxstack  3
      .locals init (int32 V_0,
               int32 V_1,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter V_2,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable V_3,
               class HelloWorld.Program/'<Add>d__1' V_4,
               class [System.Runtime]System.Exception V_5)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Add>d__1'::'<>1__state'
      IL_0006:  stloc.0
      .try
      {
        IL_0007:  ldloc.0
        IL_0008:  brfalse.s  IL_000c

        IL_000a:  br.s       IL_000e

        IL_000c:  br.s       IL_004b

        IL_000e:  nop
        IL_000f:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable [System.Runtime]System.Threading.Tasks.Task::Yield()
        IL_0014:  stloc.3
        IL_0015:  ldloca.s   V_3
        IL_0017:  call       instance valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable::GetAwaiter()
        IL_001c:  stloc.2
        IL_001d:  ldloca.s   V_2
        IL_001f:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::get_IsCompleted()
        IL_0024:  brtrue.s   IL_0067

        IL_0026:  ldarg.0
        IL_0027:  ldc.i4.0
        IL_0028:  dup
        IL_0029:  stloc.0
        IL_002a:  stfld      int32 HelloWorld.Program/'<Add>d__1'::'<>1__state'
        IL_002f:  ldarg.0
        IL_0030:  ldloc.2
        IL_0031:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Add>d__1'::'<>u__1'
        IL_0036:  ldarg.0
        IL_0037:  stloc.s    V_4
        IL_0039:  ldarg.0
        IL_003a:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Add>d__1'::'<>t__builder'
        IL_003f:  ldloca.s   V_2
        IL_0041:  ldloca.s   V_4
        IL_0043:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter,class HelloWorld.Program/'<Add>d__1'>(!!0&,
                                                                                                                                                                                                                                                                                         !!1&)
        IL_0048:  nop
        IL_0049:  leave.s    IL_00ae

        IL_004b:  ldarg.0
        IL_004c:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Add>d__1'::'<>u__1'
        IL_0051:  stloc.2
        IL_0052:  ldarg.0
        IL_0053:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Add>d__1'::'<>u__1'
        IL_0058:  initobj    [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter
        IL_005e:  ldarg.0
        IL_005f:  ldc.i4.m1
        IL_0060:  dup
        IL_0061:  stloc.0
        IL_0062:  stfld      int32 HelloWorld.Program/'<Add>d__1'::'<>1__state'
        IL_0067:  ldloca.s   V_2
        IL_0069:  call       instance void [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::GetResult()
        IL_006e:  nop
        IL_006f:  ldarg.0
        IL_0070:  ldfld      int32 HelloWorld.Program/'<Add>d__1'::a
        IL_0075:  ldarg.0
        IL_0076:  ldfld      int32 HelloWorld.Program/'<Add>d__1'::b
        IL_007b:  add
        IL_007c:  stloc.1
        IL_007d:  leave.s    IL_0099

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_007f:  stloc.s    V_5
        IL_0081:  ldarg.0
        IL_0082:  ldc.i4.s   -2
        IL_0084:  stfld      int32 HelloWorld.Program/'<Add>d__1'::'<>1__state'
        IL_0089:  ldarg.0
        IL_008a:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Add>d__1'::'<>t__builder'
        IL_008f:  ldloc.s    V_5
        IL_0091:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetException(class [System.Runtime]System.Exception)
        IL_0096:  nop
        IL_0097:  leave.s    IL_00ae

      }  // end handler
      IL_0099:  ldarg.0
      IL_009a:  ldc.i4.s   -2
      IL_009c:  stfld      int32 HelloWorld.Program/'<Add>d__1'::'<>1__state'
      IL_00a1:  ldarg.0
      IL_00a2:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Add>d__1'::'<>t__builder'
      IL_00a7:  ldloc.1
      IL_00a8:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetResult(!0)
      IL_00ad:  nop
      IL_00ae:  ret
    } // end of method '<Add>d__1'::MoveNext

    .method private hidebysig newslot virtual final 
            instance void  SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine stateMachine) cil managed
    {
      .custom instance void [System.Runtime]System.Diagnostics.DebuggerHiddenAttribute::.ctor() = ( 01 00 00 00 ) 
      .param [1]
      .custom instance void [System.Runtime]System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 01 00 00 ) 
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::SetStateMachine
      // Code size       1 (0x1)
      .maxstack  8
      IL_0000:  ret
    } // end of method '<Add>d__1'::SetStateMachine

  } // end of class '<Add>d__1'

  .class auto ansi sealed nested private beforefieldinit '<Consumer>d__8'
         extends [System.Runtime]System.Object
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> '<>t__builder'
    .field public class [System.Runtime]System.Threading.Tasks.Task`1<int32> task
    .field public int32 delay
    .field private int32 '<value>5__1'
    .field private int32 '<>s__2'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> '<>u__1'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter '<>u__2'
    .method public hidebysig specialname rtspecialname 
            instance void  .ctor() cil managed
    {
      // Code size       8 (0x8)
      .maxstack  8
      IL_0000:  ldarg.0
      IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
      IL_0006:  nop
      IL_0007:  ret
    } // end of method '<Consumer>d__8'::.ctor

    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       316 (0x13c)
      .maxstack  3
      .locals init (int32 V_0,
               int32 V_1,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_2,
               class HelloWorld.Program/'<Consumer>d__8' V_3,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter V_4,
               class [System.Runtime]System.Exception V_5)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
      IL_0006:  stloc.0
      .try
      {
        IL_0007:  ldloc.0
        IL_0008:  brfalse.s  IL_0012

        IL_000a:  br.s       IL_000c

        IL_000c:  ldloc.0
        IL_000d:  ldc.i4.1
        IL_000e:  beq.s      IL_0014

        IL_0010:  br.s       IL_0019

        IL_0012:  br.s       IL_0056

        IL_0014:  br         IL_00cb

        IL_0019:  nop
        IL_001a:  ldarg.0
        IL_001b:  ldfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Consumer>d__8'::task
        IL_0020:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_0025:  stloc.2
        IL_0026:  ldloca.s   V_2
        IL_0028:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_002d:  brtrue.s   IL_0072

        IL_002f:  ldarg.0
        IL_0030:  ldc.i4.0
        IL_0031:  dup
        IL_0032:  stloc.0
        IL_0033:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
        IL_0038:  ldarg.0
        IL_0039:  ldloc.2
        IL_003a:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>u__1'
        IL_003f:  ldarg.0
        IL_0040:  stloc.3
        IL_0041:  ldarg.0
        IL_0042:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>t__builder'
        IL_0047:  ldloca.s   V_2
        IL_0049:  ldloca.s   V_3
        IL_004b:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,class HelloWorld.Program/'<Consumer>d__8'>(!!0&,
                                                                                                                                                                                                                                                                                       !!1&)
        IL_0050:  nop
        IL_0051:  leave      IL_013b

        IL_0056:  ldarg.0
        IL_0057:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>u__1'
        IL_005c:  stloc.2
        IL_005d:  ldarg.0
        IL_005e:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>u__1'
        IL_0063:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_0069:  ldarg.0
        IL_006a:  ldc.i4.m1
        IL_006b:  dup
        IL_006c:  stloc.0
        IL_006d:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
        IL_0072:  ldarg.0
        IL_0073:  ldloca.s   V_2
        IL_0075:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_007a:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>s__2'
        IL_007f:  ldarg.0
        IL_0080:  ldarg.0
        IL_0081:  ldfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>s__2'
        IL_0086:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<value>5__1'
        IL_008b:  ldarg.0
        IL_008c:  ldfld      int32 HelloWorld.Program/'<Consumer>d__8'::delay
        IL_0091:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::Delay(int32)
        IL_0096:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter [System.Runtime]System.Threading.Tasks.Task::GetAwaiter()
        IL_009b:  stloc.s    V_4
        IL_009d:  ldloca.s   V_4
        IL_009f:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::get_IsCompleted()
        IL_00a4:  brtrue.s   IL_00e8

        IL_00a6:  ldarg.0
        IL_00a7:  ldc.i4.1
        IL_00a8:  dup
        IL_00a9:  stloc.0
        IL_00aa:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
        IL_00af:  ldarg.0
        IL_00b0:  ldloc.s    V_4
        IL_00b2:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Consumer>d__8'::'<>u__2'
        IL_00b7:  ldarg.0
        IL_00b8:  stloc.3
        IL_00b9:  ldarg.0
        IL_00ba:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>t__builder'
        IL_00bf:  ldloca.s   V_4
        IL_00c1:  ldloca.s   V_3
        IL_00c3:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter,class HelloWorld.Program/'<Consumer>d__8'>(!!0&,
                                                                                                                                                                                                                                                                              !!1&)
        IL_00c8:  nop
        IL_00c9:  leave.s    IL_013b

        IL_00cb:  ldarg.0
        IL_00cc:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Consumer>d__8'::'<>u__2'
        IL_00d1:  stloc.s    V_4
        IL_00d3:  ldarg.0
        IL_00d4:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Consumer>d__8'::'<>u__2'
        IL_00d9:  initobj    [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter
        IL_00df:  ldarg.0
        IL_00e0:  ldc.i4.m1
        IL_00e1:  dup
        IL_00e2:  stloc.0
        IL_00e3:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
        IL_00e8:  ldloca.s   V_4
        IL_00ea:  call       instance void [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::GetResult()
        IL_00ef:  nop
        IL_00f0:  ldsfld     int32 HelloWorld.Program::resumed
        IL_00f5:  ldc.i4.1
        IL_00f6:  add
        IL_00f7:  stsfld     int32 HelloWorld.Program::resumed
        IL_00fc:  ldarg.0
        IL_00fd:  ldfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<value>5__1'
        IL_0102:  ldarg.0
        IL_0103:  ldfld      int32 HelloWorld.Program/'<Consumer>d__8'::delay
        IL_0108:  add
        IL_0109:  stloc.1
        IL_010a:  leave.s    IL_0126

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_010c:  stloc.s    V_5
        IL_010e:  ldarg.0
        IL_010f:  ldc.i4.s   -2
        IL_0111:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
        IL_0116:  ldarg.0
        IL_0117:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>t__builder'
        IL_011c:  ldloc.s    V_5
        IL_011e:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetException(class [System.Runtime]System.Exception)
        IL_0123:  nop
        IL_0124:  leave.s    IL_013b

      }  // end handler
      IL_0126:  ldarg.0
      IL_0127:  ldc.i4.s   -2
      IL_0129:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
      IL_012e:  ldarg.0
      IL_012f:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>t__builder'
      IL_0134:  ldloc.1
      IL_0135:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetResult(!0)
      IL_013a:  nop
      IL_013b:  ret
    } // end of method '<Consumer>d__8'::MoveNext

    .method private hidebysig newslot virtual final 
            instance void  SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine stateMachine) cil managed
    {
      .custom instance void [System.Runtime]System.Diagnostics.DebuggerHiddenAttribute::.ctor() = ( 01 00 00 00 ) 
      .param [1]
      .custom instance void [System.Runtime]System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 01 00 00 ) 
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::SetStateMachine
      // Code size       1 (0x1)
      .maxstack  8
      IL_0000:  ret
    } // end of method '<Consumer>d__8'::SetStateMachine

  } // end of class '<Consumer>d__8'

  .class auto ansi sealed nested private beforefieldinit '<Fault>d__6'
         extends [System.Runtime]System.Object
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> '<>t__builder'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter '<>u__1'
    .method public hidebysig specialname rtspecialname 
            instance void  .ctor() cil managed
    {
      // Code size       8 (0x8)
      .maxstack  8
      IL_0000:  ldarg.0
      IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
      IL_0006:  nop
      IL_0007:  ret
    } // end of method '<Fault>d__6'::.ctor

    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       144 (0x90)
      .maxstack  3
      .locals init (int32 V_0,
               int32 V_1,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter V_2,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable V_3,
               class HelloWorld.Program/'<Fault>d__6' V_4,
               class [System.Runtime]System.Exception V_5)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Fault>d__6'::'<>1__state'
      IL_0006:  stloc.0
      .try
      {
        IL_0007:  ldloc.0
        IL_0008:  brfalse.s  IL_000c

        IL_000a:  br.s       IL_000e

        IL_000c:  br.s       IL_004b

        IL_000e:  nop
        IL_000f:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable [System.Runtime]System.Threading.Tasks.Task::Yield()
        IL_0014:  stloc.3
        IL_0015:  ldloca.s   V_3
        IL_0017:  call       instance valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable::GetAwaiter()
        IL_001c:  stloc.2
        IL_001d:  ldloca.s   V_2
        IL_001f:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::get_IsCompleted()
        IL_0024:  brtrue.s   IL_0067

        IL_0026:  ldarg.0
        IL_0027:  ldc.i4.0
        IL_0028:  dup
        IL_0029:  stloc.0
        IL_002a:  stfld      int32 HelloWorld.Program/'<Fault>d__6'::'<>1__state'
        IL_002f:  ldarg.0
        IL_0030:  ldloc.2
        IL_0031:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Fault>d__6'::'<>u__1'
        IL_0036:  ldarg.0
        IL_0037:  stloc.s    V_4
        IL_0039:  ldarg.0
        IL_003a:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__6'::'<>t__builder'
        IL_003f:  ldloca.s   V_2
        IL_0041:  ldloca.s   V_4
        IL_0043:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter,class HelloWorld.Program/'<Fault>d__6'>(!!0&,
                                                                                                                                                                                                                                                                                           !!1&)
        IL_0048:  nop
        IL_0049:  leave.s    IL_008f

        IL_004b:  ldarg.0
        IL_004c:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Fault>d__6'::'<>u__1'
        IL_0051:  stloc.2
        IL_0052:  ldarg.0
        IL_0053:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Fault>d__6'::'<>u__1'
        IL_0058:  initobj    [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter
        IL_005e:  ldarg.0
        IL_005f:  ldc.i4.m1
        IL_0060:  dup
        IL_0061:  stloc.0
        IL_0062:  stfld      int32 HelloWorld.Program/'<Fault>d__6'::'<>1__state'
        IL_0067:  ldloca.s   V_2
        IL_0069:  call       instance void [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::GetResult()
        IL_006e:  nop
        IL_006f:  ldsfld     class [System.Runtime]System.Exception HelloWorld.Program::original
        IL_0074:  throw

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_0075:  stloc.s    V_5
        IL_0077:  ldarg.0
        IL_0078:  ldc.i4.s   -2
        IL_007a:  stfld      int32 HelloWorld.Program/'<Fault>d__6'::'<>1__state'
        IL_007f:  ldarg.0
        IL_0080:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__6'::'<>t__builder'
        IL_0085:  ldloc.s    V_5
        IL_0087:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetException(class [System.Runtime]System.Exception)
        IL_008c:  nop
        IL_008d:  leave.s    IL_008f

      }  // end handler
      IL_008f:  ret
    } // end of method '<Fault>d__6'::MoveNext

    .method private hidebysig newslot virtual final 
            instance void  SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine stateMachine) cil managed
    {
      .custom instance void [System.Runtime]System.Diagnostics.DebuggerHiddenAttribute::.ctor() = ( 01 00 00 00 ) 
      .param [1]
      .custom instance void [System.Runtime]System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 01 00 00 ) 
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::SetStateMachine
      // Code size       1 (0x1)
      .maxstack  8
      IL_0000:  ret
    } // end of method '<Fault>d__6'::SetStateMachine

  } // end of class '<Fault>d__6'

  .class auto ansi sealed nested private beforefieldinit '<Instance>d__3'
         extends [System.Runtime]System.Object
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> '<>t__builder'
    .field public int32 n
    .field public class HelloWorld.Program '<>4__this'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter '<>u__1'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter '<>u__2'
    .method public hidebysig specialname rtspecialname 
            instance void  .ctor() cil managed
    {
      // Code size       8 (0x8)
      .maxstack  8
      IL_0000:  ldarg.0
      IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
      IL_0006:  nop
      IL_0007:  ret
    } // end of method '<Instance>d__3'::.ctor

    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       313 (0x139)
      .maxstack  3
      .locals init (int32 V_0,
               int32 V_1,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter V_2,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable V_3,
               class HelloWorld.Program/'<Instance>d__3' V_4,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter V_5,
               class [System.Runtime]System.Exception V_6)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
      IL_0006:  stloc.0
      .try
      {
        IL_0007:  ldloc.0
        IL_0008:  brfalse.s  IL_0012

        IL_000a:  br.s       IL_000c

        IL_000c:  ldloc.0
        IL_000d:  ldc.i4.1
        IL_000e:  beq.s      IL_0014

        IL_0010:  br.s       IL_0019

        IL_0012:  br.s       IL_0059

        IL_0014:  br         IL_00d6

        IL_0019:  nop
        IL_001a:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable [System.Runtime]System.Threading.Tasks.Task::Yield()
        IL_001f:  stloc.3
        IL_0020:  ldloca.s   V_3
        IL_0022:  call       instance valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable::GetAwaiter()
        IL_0027:  stloc.2
        IL_0028:  ldloca.s   V_2
        IL_002a:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::get_IsCompleted()
        IL_002f:  brtrue.s   IL_0075

        IL_0031:  ldarg.0
        IL_0032:  ldc.i4.0
        IL_0033:  dup
        IL_0034:  stloc.0
        IL_0035:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
        IL_003a:  ldarg.0
        IL_003b:  ldloc.2
        IL_003c:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Instance>d__3'::'<>u__1'
        IL_0041:  ldarg.0
        IL_0042:  stloc.s    V_4
        IL_0044:  ldarg.0
        IL_0045:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Instance>d__3'::'<>t__builder'
        IL_004a:  ldloca.s   V_2
        IL_004c:  ldloca.s   V_4
        IL_004e:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter,class HelloWorld.Program/'<Instance>d__3'>(!!0&,
                                                                                                                                                                                                                                                                                              !!1&)
        IL_0053:  nop
        IL_0054:  leave      IL_0138

        IL_0059:  ldarg.0
        IL_005a:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Instance>d__3'::'<>u__1'
        IL_005f:  stloc.2
        IL_0060:  ldarg.0
        IL_0061:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Instance>d__3'::'<>u__1'
        IL_0066:  initobj    [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter
        IL_006c:  ldarg.0
        IL_006d:  ldc.i4.m1
        IL_006e:  dup
        IL_006f:  stloc.0
        IL_0070:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
        IL_0075:  ldloca.s   V_2
        IL_0077:  call       instance void [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::GetResult()
        IL_007c:  nop
        IL_007d:  ldarg.0
        IL_007e:  ldfld      class HelloWorld.Program HelloWorld.Program/'<Instance>d__3'::'<>4__this'
        IL_0083:  ldarg.0
        IL_0084:  ldfld      class HelloWorld.Program HelloWorld.Program/'<Instance>d__3'::'<>4__this'
        IL_0089:  ldfld      int32 HelloWorld.Program::offset
        IL_008e:  ldarg.0
        IL_008f:  ldfld      int32 HelloWorld.Program/'<Instance>d__3'::n
        IL_0094:  add
        IL_0095:  stfld      int32 HelloWorld.Program::offset
        IL_009a:  ldc.i4.2
        IL_009b:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::Delay(int32)
        IL_00a0:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter [System.Runtime]System.Threading.Tasks.Task::GetAwaiter()
        IL_00a5:  stloc.s    V_5
        IL_00a7:  ldloca.s   V_5
        IL_00a9:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::get_IsCompleted()
        IL_00ae:  brtrue.s   IL_00f3

        IL_00b0:  ldarg.0
        IL_00b1:  ldc.i4.1
        IL_00b2:  dup
        IL_00b3:  stloc.0
        IL_00b4:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
        IL_00b9:  ldarg.0
        IL_00ba:  ldloc.s    V_5
        IL_00bc:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Instance>d__3'::'<>u__2'
        IL_00c1:  ldarg.0
        IL_00c2:  stloc.s    V_4
        IL_00c4:  ldarg.0
        IL_00c5:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Instance>d__3'::'<>t__builder'
        IL_00ca:  ldloca.s   V_5
        IL_00cc:  ldloca.s   V_4
        IL_00ce:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter,class HelloWorld.Program/'<Instance>d__3'>(!!0&,
                                                                                                                                                                                                                                                                              !!1&)
        IL_00d3:  nop
        IL_00d4:  leave.s    IL_0138

        IL_00d6:  ldarg.0
        IL_00d7:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Instance>d__3'::'<>u__2'
        IL_00dc:  stloc.s    V_5
        IL_00de:  ldarg.0
        IL_00df:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Instance>d__3'::'<>u__2'
        IL_00e4:  initobj    [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter
        IL_00ea:  ldarg.0
        IL_00eb:  ldc.i4.m1
        IL_00ec:  dup
        IL_00ed:  stloc.0
        IL_00ee:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
        IL_00f3:  ldloca.s   V_5
        IL_00f5:  call       instance void [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::GetResult()
        IL_00fa:  nop
        IL_00fb:  ldarg.0
        IL_00fc:  ldfld      class HelloWorld.Program HelloWorld.Program/'<Instance>d__3'::'<>4__this'
        IL_0101:  ldfld      int32 HelloWorld.Program::offset
        IL_0106:  stloc.1
        IL_0107:  leave.s    IL_0123

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_0109:  stloc.s    V_6
        IL_010b:  ldarg.0
        IL_010c:  ldc.i4.s   -2
        IL_010e:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
        IL_0113:  ldarg.0
        IL_0114:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Instance>d__3'::'<>t__builder'
        IL_0119:  ldloc.s    V_6
        IL_011b:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetException(class [System.Runtime]System.Exception)
        IL_0120:  nop
        IL_0121:  leave.s    IL_0138

      }  // end handler
      IL_0123:  ldarg.0
      IL_0124:  ldc.i4.s   -2
      IL_0126:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
      IL_012b:  ldarg.0
      IL_012c:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Instance>d__3'::'<>t__builder'
      IL_0131:  ldloc.1
      IL_0132:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetResult(!0)
      IL_0137:  nop
      IL_0138:  ret
    } // end of method '<Instance>d__3'::MoveNext

    .method private hidebysig newslot virtual final 
            instance void  SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine stateMachine) cil managed
    {
      .custom instance void [System.Runtime]System.Diagnostics.DebuggerHiddenAttribute::.ctor() = ( 01 00 00 00 ) 
      .param [1]
      .custom instance void [System.Runtime]System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 01 00 00 ) 
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::SetStateMachine
      // Code size       1 (0x1)
      .maxstack  8
      IL_0000:  ret
    } // end of method '<Instance>d__3'::SetStateMachine

  } // end of class '<Instance>d__3'

  .class auto ansi sealed nested private beforefieldinit '<Main>d__9'
         extends [System.Runtime]System.Object
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder '<>t__builder'
    .field private int32 '<sum>5__1'
    .field private class [System.Runtime]System.Threading.Tasks.Task`1<int32> '<shared>5__2'
    .field private class [System.Runtime]System.Threading.Tasks.Task`1<int32> '<first>5__3'
    .field private class [System.Runtime]System.Threading.Tasks.Task`1<int32> '<second>5__4'
    .field private int32 '<>s__5'
    .field private int32 '<>s__6'
    .field private int32 '<>s__7'
    .field private class [System.Runtime]System.InvalidOperationException '<e>5__8'
    .field private int32 '<>s__9'
    .field private int32 '<>s__10'
    .field private int32 '<i>5__11'
    .field private int32 '<>s__12'
    .field private int32 '<>s__13'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> '<>u__1'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter '<>u__2'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter '<>u__3'
    .method public hidebysig specialname rtspecialname 
            instance void  .ctor() cil managed
    {
      // Code size       8 (0x8)
      .maxstack  8
      IL_0000:  ldarg.0
      IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
      IL_0006:  nop
      IL_0007:  ret
    } // end of method '<Main>d__9'::.ctor

    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       1853 (0x73d)
      .maxstack  3
      .locals init (int32 V_0,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_1,
               class HelloWorld.Program/'<Main>d__9' V_2,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter V_3,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_4,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_5,
               class [System.Runtime]System.InvalidOperationException V_6,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_7,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_8,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter V_9,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter V_10,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter V_11,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable V_12,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter V_13,
               int32 V_14,
               bool V_15,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_16,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_17,
               class [System.Runtime]System.Exception V_18)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
      IL_0006:  stloc.0
      .try
      {
        IL_0007:  ldloc.0
        IL_0008:  switch     ( 
                              IL_003f,
                              IL_0041,
                              IL_0046,
                              IL_004b,
                              IL_0050,
                              IL_0055,
                              IL_005a,
                              IL_005f,
                              IL_0064,
                              IL_0069,
                              IL_006e,
                              IL_0073)
        IL_003d:  br.s       IL_0078

        IL_003f:  br.s       IL_00b6

        IL_0041:  br         IL_0147

        IL_0046:  br         IL_01aa

        IL_004b:  br         IL_01e0

        IL_0050:  br         IL_02d5

        IL_0055:  br         IL_0349

        IL_005a:  br         IL_03bd

        IL_005f:  br         IL_042b

        IL_0064:  br         IL_04b0

        IL_0069:  br         IL_0527

        IL_006e:  br         IL_05ff

        IL_0073:  br         IL_0674

        IL_0078:  nop
        IL_0079:  ldc.i4.s   10
        IL_007b:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Sum(int32)
        IL_0080:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_0085:  stloc.1
        IL_0086:  ldloca.s   V_1
        IL_0088:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_008d:  brtrue.s   IL_00d2

        IL_008f:  ldarg.0
        IL_0090:  ldc.i4.0
        IL_0091:  dup
        IL_0092:  stloc.0
        IL_0093:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0098:  ldarg.0
        IL_0099:  ldloc.1
        IL_009a:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_009f:  ldarg.0
        IL_00a0:  stloc.2
        IL_00a1:  ldarg.0
        IL_00a2:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_00a7:  ldloca.s   V_1
        IL_00a9:  ldloca.s   V_2
        IL_00ab:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,class HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                !!1&)
        IL_00b0:  nop
        IL_00b1:  leave      IL_073c

        IL_00b6:  ldarg.0
        IL_00b7:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_00bc:  stloc.1
        IL_00bd:  ldarg.0
        IL_00be:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_00c3:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_00c9:  ldarg.0
        IL_00ca:  ldc.i4.m1
        IL_00cb:  dup
        IL_00cc:  stloc.0
        IL_00cd:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_00d2:  ldarg.0
        IL_00d3:  ldloca.s   V_1
        IL_00d5:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_00da:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>s__5'
        IL_00df:  ldarg.0
        IL_00e0:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<>s__5'
        IL_00e5:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_00ea:  nop
        IL_00eb:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::get_CompletedTask()
        IL_00f0:  callvirt   instance bool [System.Runtime]System.Threading.Tasks.Task::get_IsCompleted()
        IL_00f5:  call       void [System.Console]System.Console::WriteLine(bool)
        IL_00fa:  nop
        IL_00fb:  ldc.i4.3
        IL_00fc:  call       class [System.Runtime]System.Threading.Tasks.Task`1<!!0> [System.Runtime]System.Threading.Tasks.Task::FromResult<int32>(!!0)
        IL_0101:  callvirt   instance bool [System.Runtime]System.Threading.Tasks.Task::get_IsCompleted()
        IL_0106:  call       void [System.Console]System.Console::WriteLine(bool)
        IL_010b:  nop
        IL_010c:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::get_CompletedTask()
        IL_0111:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter [System.Runtime]System.Threading.Tasks.Task::GetAwaiter()
        IL_0116:  stloc.3
        IL_0117:  ldloca.s   V_3
        IL_0119:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::get_IsCompleted()
        IL_011e:  brtrue.s   IL_0163

        IL_0120:  ldarg.0
        IL_0121:  ldc.i4.1
        IL_0122:  dup
        IL_0123:  stloc.0
        IL_0124:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0129:  ldarg.0
        IL_012a:  ldloc.3
        IL_012b:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_0130:  ldarg.0
        IL_0131:  stloc.2
        IL_0132:  ldarg.0
        IL_0133:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_0138:  ldloca.s   V_3
        IL_013a:  ldloca.s   V_2
        IL_013c:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter,class HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                       !!1&)
        IL_0141:  nop
        IL_0142:  leave      IL_073c

        IL_0147:  ldarg.0
        IL_0148:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_014d:  stloc.3
        IL_014e:  ldarg.0
        IL_014f:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_0154:  initobj    [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter
        IL_015a:  ldarg.0
        IL_015b:  ldc.i4.m1
        IL_015c:  dup
        IL_015d:  stloc.0
        IL_015e:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0163:  ldloca.s   V_3
        IL_0165:  call       instance void [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::GetResult()
        IL_016a:  nop
        IL_016b:  ldc.i4.s   12
        IL_016d:  call       class [System.Runtime]System.Threading.Tasks.Task`1<!!0> [System.Runtime]System.Threading.Tasks.Task::FromResult<int32>(!!0)
        IL_0172:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_0177:  stloc.s    V_4
        IL_0179:  ldloca.s   V_4
        IL_017b:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_0180:  brtrue.s   IL_01c7

        IL_0182:  ldarg.0
        IL_0183:  ldc.i4.2
        IL_0184:  dup
        IL_0185:  stloc.0
        IL_0186:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_018b:  ldarg.0
        IL_018c:  ldloc.s    V_4
        IL_018e:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_0193:  ldarg.0
        IL_0194:  stloc.2
        IL_0195:  ldarg.0
        IL_0196:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_019b:  ldloca.s   V_4
        IL_019d:  ldloca.s   V_2
        IL_019f:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,class HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                !!1&)
        IL_01a4:  nop
        IL_01a5:  leave      IL_073c

        IL_01aa:  ldarg.0
        IL_01ab:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_01b0:  stloc.s    V_4
        IL_01b2:  ldarg.0
        IL_01b3:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_01b8:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_01be:  ldarg.0
        IL_01bf:  ldc.i4.m1
        IL_01c0:  dup
        IL_01c1:  stloc.0
        IL_01c2:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_01c7:  ldarg.0
        IL_01c8:  ldloca.s   V_4
        IL_01ca:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_01cf:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>s__6'
        IL_01d4:  ldarg.0
        IL_01d5:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<>s__6'
        IL_01da:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_01df:  nop
        IL_01e0:  nop
        .try
        {
          IL_01e1:  ldloc.0
          IL_01e2:  ldc.i4.3
          IL_01e3:  beq.s      IL_01e7

          IL_01e5:  br.s       IL_01e9

          IL_01e7:  br.s       IL_0227

          IL_01e9:  nop
          IL_01ea:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Fault()
          IL_01ef:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
          IL_01f4:  stloc.s    V_5
          IL_01f6:  ldloca.s   V_5
          IL_01f8:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
          IL_01fd:  brtrue.s   IL_0244

          IL_01ff:  ldarg.0
          IL_0200:  ldc.i4.3
          IL_0201:  dup
          IL_0202:  stloc.0
          IL_0203:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
          IL_0208:  ldarg.0
          IL_0209:  ldloc.s    V_5
          IL_020b:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
          IL_0210:  ldarg.0
          IL_0211:  stloc.2
          IL_0212:  ldarg.0
          IL_0213:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
          IL_0218:  ldloca.s   V_5
          IL_021a:  ldloca.s   V_2
          IL_021c:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,class HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                  !!1&)
          IL_0221:  nop
          IL_0222:  leave      IL_073c

          IL_0227:  ldarg.0
          IL_0228:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
          IL_022d:  stloc.s    V_5
          IL_022f:  ldarg.0
          IL_0230:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
          IL_0235:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
          IL_023b:  ldarg.0
          IL_023c:  ldc.i4.m1
          IL_023d:  dup
          IL_023e:  stloc.0
          IL_023f:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
          IL_0244:  ldarg.0
          IL_0245:  ldloca.s   V_5
          IL_0247:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
          IL_024c:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>s__7'
          IL_0251:  ldarg.0
          IL_0252:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<>s__7'
          IL_0257:  call       void [System.Console]System.Console::WriteLine(int32)
          IL_025c:  nop
          IL_025d:  nop
          IL_025e:  leave.s    IL_0292

        }  // end .try
        catch [System.Runtime]System.InvalidOperationException 
        {
          IL_0260:  stloc.s    V_6
          IL_0262:  ldarg.0
          IL_0263:  ldloc.s    V_6
          IL_0265:  stfld      class [System.Runtime]System.InvalidOperationException HelloWorld.Program/'<Main>d__9'::'<e>5__8'
          IL_026a:  nop
          IL_026b:  ldarg.0
          IL_026c:  ldfld      class [System.Runtime]System.InvalidOperationException HelloWorld.Program/'<Main>d__9'::'<e>5__8'
          IL_0271:  callvirt   instance string [System.Runtime]System.Exception::get_Message()
          IL_0276:  call       void [System.Console]System.Console::WriteLine(string)
          IL_027b:  nop
          IL_027c:  ldsfld     class [System.Runtime]System.Exception HelloWorld.Program::original
          IL_0281:  ldarg.0
          IL_0282:  ldfld      class [System.Runtime]System.InvalidOperationException HelloWorld.Program/'<Main>d__9'::'<e>5__8'
          IL_0287:  ceq
          IL_0289:  call       void [System.Console]System.Console::WriteLine(bool)
          IL_028e:  nop
          IL_028f:  nop
          IL_0290:  leave.s    IL_0292

        }  // end handler
        IL_0292:  newobj     instance void HelloWorld.Program::.ctor()
        IL_0297:  ldc.i4.5
        IL_0298:  call       instance class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Instance(int32)
        IL_029d:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_02a2:  stloc.s    V_7
        IL_02a4:  ldloca.s   V_7
        IL_02a6:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_02ab:  brtrue.s   IL_02f2

        IL_02ad:  ldarg.0
        IL_02ae:  ldc.i4.4
        IL_02af:  dup
        IL_02b0:  stloc.0
        IL_02b1:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_02b6:  ldarg.0
        IL_02b7:  ldloc.s    V_7
        IL_02b9:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_02be:  ldarg.0
        IL_02bf:  stloc.2
        IL_02c0:  ldarg.0
        IL_02c1:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_02c6:  ldloca.s   V_7
        IL_02c8:  ldloca.s   V_2
        IL_02ca:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,class HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                !!1&)
        IL_02cf:  nop
        IL_02d0:  leave      IL_073c

        IL_02d5:  ldarg.0
        IL_02d6:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_02db:  stloc.s    V_7
        IL_02dd:  ldarg.0
        IL_02de:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_02e3:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_02e9:  ldarg.0
        IL_02ea:  ldc.i4.m1
        IL_02eb:  dup
        IL_02ec:  stloc.0
        IL_02ed:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_02f2:  ldarg.0
        IL_02f3:  ldloca.s   V_7
        IL_02f5:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_02fa:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>s__9'
        IL_02ff:  ldarg.0
        IL_0300:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<>s__9'
        IL_0305:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_030a:  nop
        IL_030b:  ldc.i4.5
        IL_030c:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Nested(int32)
        IL_0311:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_0316:  stloc.s    V_8
        IL_0318:  ldloca.s   V_8
        IL_031a:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_031f:  brtrue.s   IL_0366

        IL_0321:  ldarg.0
        IL_0322:  ldc.i4.5
        IL_0323:  dup
        IL_0324:  stloc.0
        IL_0325:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_032a:  ldarg.0
        IL_032b:  ldloc.s    V_8
        IL_032d:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_0332:  ldarg.0
        IL_0333:  stloc.2
        IL_0334:  ldarg.0
        IL_0335:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_033a:  ldloca.s   V_8
        IL_033c:  ldloca.s   V_2
        IL_033e:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,class HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                !!1&)
        IL_0343:  nop
        IL_0344:  leave      IL_073c

        IL_0349:  ldarg.0
        IL_034a:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_034f:  stloc.s    V_8
        IL_0351:  ldarg.0
        IL_0352:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_0357:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_035d:  ldarg.0
        IL_035e:  ldc.i4.m1
        IL_035f:  dup
        IL_0360:  stloc.0
        IL_0361:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0366:  ldarg.0
        IL_0367:  ldloca.s   V_8
        IL_0369:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_036e:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>s__10'
        IL_0373:  ldarg.0
        IL_0374:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<>s__10'
        IL_0379:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_037e:  nop
        IL_037f:  ldc.i4.3
        IL_0380:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::Delay(int32)
        IL_0385:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter [System.Runtime]System.Threading.Tasks.Task::GetAwaiter()
        IL_038a:  stloc.s    V_9
        IL_038c:  ldloca.s   V_9
        IL_038e:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::get_IsCompleted()
        IL_0393:  brtrue.s   IL_03da

        IL_0395:  ldarg.0
        IL_0396:  ldc.i4.6
        IL_0397:  dup
        IL_0398:  stloc.0
        IL_0399:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_039e:  ldarg.0
        IL_039f:  ldloc.s    V_9
        IL_03a1:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_03a6:  ldarg.0
        IL_03a7:  stloc.2
        IL_03a8:  ldarg.0
        IL_03a9:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_03ae:  ldloca.s   V_9
        IL_03b0:  ldloca.s   V_2
        IL_03b2:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter,class HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                       !!1&)
        IL_03b7:  nop
        IL_03b8:  leave      IL_073c

        IL_03bd:  ldarg.0
        IL_03be:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_03c3:  stloc.s    V_9
        IL_03c5:  ldarg.0
        IL_03c6:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_03cb:  initobj    [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter
        IL_03d1:  ldarg.0
        IL_03d2:  ldc.i4.m1
        IL_03d3:  dup
        IL_03d4:  stloc.0
        IL_03d5:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_03da:  ldloca.s   V_9
        IL_03dc:  call       instance void [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::GetResult()
        IL_03e1:  nop
        IL_03e2:  ldstr      "delay one"
        IL_03e7:  call       void [System.Console]System.Console::WriteLine(string)
        IL_03ec:  nop
        IL_03ed:  ldc.i4.1
        IL_03ee:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::Delay(int32)
        IL_03f3:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter [System.Runtime]System.Threading.Tasks.Task::GetAwaiter()
        IL_03f8:  stloc.s    V_10
        IL_03fa:  ldloca.s   V_10
        IL_03fc:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::get_IsCompleted()
        IL_0401:  brtrue.s   IL_0448

        IL_0403:  ldarg.0
        IL_0404:  ldc.i4.7
        IL_0405:  dup
        IL_0406:  stloc.0
        IL_0407:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_040c:  ldarg.0
        IL_040d:  ldloc.s    V_10
        IL_040f:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_0414:  ldarg.0
        IL_0415:  stloc.2
        IL_0416:  ldarg.0
        IL_0417:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_041c:  ldloca.s   V_10
        IL_041e:  ldloca.s   V_2
        IL_0420:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter,class HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                       !!1&)
        IL_0425:  nop
        IL_0426:  leave      IL_073c

        IL_042b:  ldarg.0
        IL_042c:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_0431:  stloc.s    V_10
        IL_0433:  ldarg.0
        IL_0434:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_0439:  initobj    [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter
        IL_043f:  ldarg.0
        IL_0440:  ldc.i4.m1
        IL_0441:  dup
        IL_0442:  stloc.0
        IL_0443:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0448:  ldloca.s   V_10
        IL_044a:  call       instance void [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::GetResult()
        IL_044f:  nop
        IL_0450:  ldstr      "delay two"
        IL_0455:  call       void [System.Console]System.Console::WriteLine(string)
        IL_045a:  nop
        IL_045b:  ldarg.0
        IL_045c:  ldc.i4.0
        IL_045d:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<sum>5__1'
        IL_0462:  ldarg.0
        IL_0463:  ldc.i4.0
        IL_0464:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<i>5__11'
        IL_0469:  br         IL_0571

        IL_046e:  nop
        IL_046f:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable [System.Runtime]System.Threading.Tasks.Task::Yield()
        IL_0474:  stloc.s    V_12
        IL_0476:  ldloca.s   V_12
        IL_0478:  call       instance valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable::GetAwaiter()
        IL_047d:  stloc.s    V_11
        IL_047f:  ldloca.s   V_11
        IL_0481:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::get_IsCompleted()
        IL_0486:  brtrue.s   IL_04cd

        IL_0488:  ldarg.0
        IL_0489:  ldc.i4.8
        IL_048a:  dup
        IL_048b:  stloc.0
        IL_048c:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0491:  ldarg.0
        IL_0492:  ldloc.s    V_11
        IL_0494:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__3'
        IL_0499:  ldarg.0
        IL_049a:  stloc.2
        IL_049b:  ldarg.0
        IL_049c:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_04a1:  ldloca.s   V_11
        IL_04a3:  ldloca.s   V_2
        IL_04a5:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter,class HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                       !!1&)
        IL_04aa:  nop
        IL_04ab:  leave      IL_073c

        IL_04b0:  ldarg.0
        IL_04b1:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__3'
        IL_04b6:  stloc.s    V_11
        IL_04b8:  ldarg.0
        IL_04b9:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__3'
        IL_04be:  initobj    [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter
        IL_04c4:  ldarg.0
        IL_04c5:  ldc.i4.m1
        IL_04c6:  dup
        IL_04c7:  stloc.0
        IL_04c8:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_04cd:  ldloca.s   V_11
        IL_04cf:  call       instance void [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::GetResult()
        IL_04d4:  nop
        IL_04d5:  ldarg.0
        IL_04d6:  ldarg.0
        IL_04d7:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<sum>5__1'
        IL_04dc:  ldarg.0
        IL_04dd:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<i>5__11'
        IL_04e2:  add
        IL_04e3:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<sum>5__1'
        IL_04e8:  ldc.i4.1
        IL_04e9:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::Delay(int32)
        IL_04ee:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter [System.Runtime]System.Threading.Tasks.Task::GetAwaiter()
        IL_04f3:  stloc.s    V_13
        IL_04f5:  ldloca.s   V_13
        IL_04f7:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::get_IsCompleted()
        IL_04fc:  brtrue.s   IL_0544

        IL_04fe:  ldarg.0
        IL_04ff:  ldc.i4.s   9
        IL_0501:  dup
        IL_0502:  stloc.0
        IL_0503:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0508:  ldarg.0
        IL_0509:  ldloc.s    V_13
        IL_050b:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_0510:  ldarg.0
        IL_0511:  stloc.2
        IL_0512:  ldarg.0
        IL_0513:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_0518:  ldloca.s   V_13
        IL_051a:  ldloca.s   V_2
        IL_051c:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter,class HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                       !!1&)
        IL_0521:  nop
        IL_0522:  leave      IL_073c

        IL_0527:  ldarg.0
        IL_0528:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_052d:  stloc.s    V_13
        IL_052f:  ldarg.0
        IL_0530:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter HelloWorld.Program/'<Main>d__9'::'<>u__2'
        IL_0535:  initobj    [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter
        IL_053b:  ldarg.0
        IL_053c:  ldc.i4.m1
        IL_053d:  dup
        IL_053e:  stloc.0
        IL_053f:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0544:  ldloca.s   V_13
        IL_0546:  call       instance void [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter::GetResult()
        IL_054b:  nop
        IL_054c:  ldarg.0
        IL_054d:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<sum>5__1'
        IL_0552:  stloc.s    V_14
        IL_0554:  ldarg.0
        IL_0555:  ldloc.s    V_14
        IL_0557:  ldc.i4.1
        IL_0558:  add
        IL_0559:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<sum>5__1'
        IL_055e:  nop
        IL_055f:  ldarg.0
        IL_0560:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<i>5__11'
        IL_0565:  stloc.s    V_14
        IL_0567:  ldarg.0
        IL_0568:  ldloc.s    V_14
        IL_056a:  ldc.i4.1
        IL_056b:  add
        IL_056c:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<i>5__11'
        IL_0571:  ldarg.0
        IL_0572:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<i>5__11'
        IL_0577:  ldc.i4.8
        IL_0578:  clt
        IL_057a:  stloc.s    V_15
        IL_057c:  ldloc.s    V_15
        IL_057e:  brtrue     IL_046e

        IL_0583:  ldarg.0
        IL_0584:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<sum>5__1'
        IL_0589:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_058e:  nop
        IL_058f:  ldarg.0
        IL_0590:  ldc.i4.4
        IL_0591:  ldc.i4.5
        IL_0592:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Add(int32,
                                                                                                                int32)
        IL_0597:  stfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<shared>5__2'
        IL_059c:  ldarg.0
        IL_059d:  ldarg.0
        IL_059e:  ldfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<shared>5__2'
        IL_05a3:  ldc.i4.3
        IL_05a4:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Consumer(class [System.Runtime]System.Threading.Tasks.Task`1<int32>,
                                                                                                                     int32)
        IL_05a9:  stfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<first>5__3'
        IL_05ae:  ldarg.0
        IL_05af:  ldarg.0
        IL_05b0:  ldfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<shared>5__2'
        IL_05b5:  ldc.i4.1
        IL_05b6:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Consumer(class [System.Runtime]System.Threading.Tasks.Task`1<int32>,
                                                                                                                     int32)
        IL_05bb:  stfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<second>5__4'
        IL_05c0:  ldarg.0
        IL_05c1:  ldfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<first>5__3'
        IL_05c6:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_05cb:  stloc.s    V_16
        IL_05cd:  ldloca.s   V_16
        IL_05cf:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_05d4:  brtrue.s   IL_061c

        IL_05d6:  ldarg.0
        IL_05d7:  ldc.i4.s   10
        IL_05d9:  dup
        IL_05da:  stloc.0
        IL_05db:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_05e0:  ldarg.0
        IL_05e1:  ldloc.s    V_16
        IL_05e3:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_05e8:  ldarg.0
        IL_05e9:  stloc.2
        IL_05ea:  ldarg.0
        IL_05eb:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_05f0:  ldloca.s   V_16
        IL_05f2:  ldloca.s   V_2
        IL_05f4:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,class HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                !!1&)
        IL_05f9:  nop
        IL_05fa:  leave      IL_073c

        IL_05ff:  ldarg.0
        IL_0600:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_0605:  stloc.s    V_16
        IL_0607:  ldarg.0
        IL_0608:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_060d:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_0613:  ldarg.0
        IL_0614:  ldc.i4.m1
        IL_0615:  dup
        IL_0616:  stloc.0
        IL_0617:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_061c:  ldarg.0
        IL_061d:  ldloca.s   V_16
        IL_061f:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_0624:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>s__12'
        IL_0629:  ldarg.0
        IL_062a:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<>s__12'
        IL_062f:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_0634:  nop
        IL_0635:  ldarg.0
        IL_0636:  ldfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<second>5__4'
        IL_063b:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_0640:  stloc.s    V_17
        IL_0642:  ldloca.s   V_17
        IL_0644:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_0649:  brtrue.s   IL_0691

        IL_064b:  ldarg.0
        IL_064c:  ldc.i4.s   11
        IL_064e:  dup
        IL_064f:  stloc.0
        IL_0650:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0655:  ldarg.0
        IL_0656:  ldloc.s    V_17
        IL_0658:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_065d:  ldarg.0
        IL_065e:  stloc.2
        IL_065f:  ldarg.0
        IL_0660:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_0665:  ldloca.s   V_17
        IL_0667:  ldloca.s   V_2
        IL_0669:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,class HelloWorld.Program/'<Main>d__9'>(!!0&,
                                                                                                                                                                                                                                                                !!1&)
        IL_066e:  nop
        IL_066f:  leave      IL_073c

        IL_0674:  ldarg.0
        IL_0675:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_067a:  stloc.s    V_17
        IL_067c:  ldarg.0
        IL_067d:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Main>d__9'::'<>u__1'
        IL_0682:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_0688:  ldarg.0
        IL_0689:  ldc.i4.m1
        IL_068a:  dup
        IL_068b:  stloc.0
        IL_068c:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_0691:  ldarg.0
        IL_0692:  ldloca.s   V_17
        IL_0694:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_0699:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>s__13'
        IL_069e:  ldarg.0
        IL_069f:  ldfld      int32 HelloWorld.Program/'<Main>d__9'::'<>s__13'
        IL_06a4:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_06a9:  nop
        IL_06aa:  ldsfld     int32 HelloWorld.Program::resumed
        IL_06af:  call       void [System.Console]System.Console::WriteLine(int32)
        IL_06b4:  nop
        IL_06b5:  ldc.i4.0
        IL_06b6:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::Delay(int32)
        IL_06bb:  callvirt   instance bool [System.Runtime]System.Threading.Tasks.Task::get_IsCompleted()
        IL_06c0:  call       void [System.Console]System.Console::WriteLine(bool)
        IL_06c5:  nop
        .try
        {
          IL_06c6:  nop
          IL_06c7:  ldc.i4.s   -2
          IL_06c9:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::Delay(int32)
          IL_06ce:  pop
          IL_06cf:  nop
          IL_06d0:  leave.s    IL_06e2

        }  // end .try
        catch [System.Runtime]System.ArgumentOutOfRangeException 
        {
          IL_06d2:  pop
          IL_06d3:  nop
          IL_06d4:  ldstr      "negative delay"
          IL_06d9:  call       void [System.Console]System.Console::WriteLine(string)
          IL_06de:  nop
          IL_06df:  nop
          IL_06e0:  leave.s    IL_06e2

        }  // end handler
        IL_06e2:  leave.s    IL_0713

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_06e4:  stloc.s    V_18
        IL_06e6:  ldarg.0
        IL_06e7:  ldc.i4.s   -2
        IL_06e9:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
        IL_06ee:  ldarg.0
        IL_06ef:  ldnull
        IL_06f0:  stfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<shared>5__2'
        IL_06f5:  ldarg.0
        IL_06f6:  ldnull
        IL_06f7:  stfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<first>5__3'
        IL_06fc:  ldarg.0
        IL_06fd:  ldnull
        IL_06fe:  stfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<second>5__4'
        IL_0703:  ldarg.0
        IL_0704:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
        IL_0709:  ldloc.s    V_18
        IL_070b:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::SetException(class [System.Runtime]System.Exception)
        IL_0710:  nop
        IL_0711:  leave.s    IL_073c

      }  // end handler
      IL_0713:  ldarg.0
      IL_0714:  ldc.i4.s   -2
      IL_0716:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
      IL_071b:  ldarg.0
      IL_071c:  ldnull
      IL_071d:  stfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<shared>5__2'
      IL_0722:  ldarg.0
      IL_0723:  ldnull
      IL_0724:  stfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<first>5__3'
      IL_0729:  ldarg.0
      IL_072a:  ldnull
      IL_072b:  stfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Main>d__9'::'<second>5__4'
      IL_0730:  ldarg.0
      IL_0731:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
      IL_0736:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::SetResult()
      IL_073b:  nop
      IL_073c:  ret
    } // end of method '<Main>d__9'::MoveNext

    .method private hidebysig newslot virtual final 
            instance void  SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine stateMachine) cil managed
    {
      .custom instance void [System.Runtime]System.Diagnostics.DebuggerHiddenAttribute::.ctor() = ( 01 00 00 00 ) 
      .param [1]
      .custom instance void [System.Runtime]System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 01 00 00 ) 
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::SetStateMachine
      // Code size       1 (0x1)
      .maxstack  8
      IL_0000:  ret
    } // end of method '<Main>d__9'::SetStateMachine

  } // end of class '<Main>d__9'

  .class auto ansi sealed nested private beforefieldinit '<Nested>d__4'
         extends [System.Runtime]System.Object
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> '<>t__builder'
    .field public int32 n
    .field private int32 '<>s__1'
    .field private int32 '<>s__2'
    .field private int32 '<>s__3'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> '<>u__1'
    .method public hidebysig specialname rtspecialname 
            instance void  .ctor() cil managed
    {
      // Code size       8 (0x8)
      .maxstack  8
      IL_0000:  ldarg.0
      IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
      IL_0006:  nop
      IL_0007:  ret
    } // end of method '<Nested>d__4'::.ctor

    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       420 (0x1a4)
      .maxstack  3
      .locals init (int32 V_0,
               int32 V_1,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_2,
               class HelloWorld.Program/'<Nested>d__4' V_3,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_4,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_5,
               class [System.Runtime]System.Exception V_6)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
      IL_0006:  stloc.0
      .try
      {
        IL_0007:  ldloc.0
        IL_0008:  switch     ( 
                              IL_001b,
                              IL_001d,
                              IL_0022)
        IL_0019:  br.s       IL_0027

        IL_001b:  br.s       IL_0069

        IL_001d:  br         IL_00d1

        IL_0022:  br         IL_0141

        IL_0027:  nop
        IL_0028:  ldarg.0
        IL_0029:  ldfld      int32 HelloWorld.Program/'<Nested>d__4'::n
        IL_002e:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Sum(int32)
        IL_0033:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_0038:  stloc.2
        IL_0039:  ldloca.s   V_2
        IL_003b:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_0040:  brtrue.s   IL_0085

        IL_0042:  ldarg.0
        IL_0043:  ldc.i4.0
        IL_0044:  dup
        IL_0045:  stloc.0
        IL_0046:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
        IL_004b:  ldarg.0
        IL_004c:  ldloc.2
        IL_004d:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_0052:  ldarg.0
        IL_0053:  stloc.3
        IL_0054:  ldarg.0
        IL_0055:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
        IL_005a:  ldloca.s   V_2
        IL_005c:  ldloca.s   V_3
        IL_005e:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,class HelloWorld.Program/'<Nested>d__4'>(!!0&,
                                                                                                                                                                                                                                                                                     !!1&)
        IL_0063:  nop
        IL_0064:  leave      IL_01a3

        IL_0069:  ldarg.0
        IL_006a:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_006f:  stloc.2
        IL_0070:  ldarg.0
        IL_0071:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_0076:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_007c:  ldarg.0
        IL_007d:  ldc.i4.m1
        IL_007e:  dup
        IL_007f:  stloc.0
        IL_0080:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
        IL_0085:  ldarg.0
        IL_0086:  ldloca.s   V_2
        IL_0088:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_008d:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>s__2'
        IL_0092:  ldc.i4.2
        IL_0093:  ldc.i4.3
        IL_0094:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Add(int32,
                                                                                                                int32)
        IL_0099:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_009e:  stloc.s    V_4
        IL_00a0:  ldloca.s   V_4
        IL_00a2:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_00a7:  brtrue.s   IL_00ee

        IL_00a9:  ldarg.0
        IL_00aa:  ldc.i4.1
        IL_00ab:  dup
        IL_00ac:  stloc.0
        IL_00ad:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
        IL_00b2:  ldarg.0
        IL_00b3:  ldloc.s    V_4
        IL_00b5:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_00ba:  ldarg.0
        IL_00bb:  stloc.3
        IL_00bc:  ldarg.0
        IL_00bd:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
        IL_00c2:  ldloca.s   V_4
        IL_00c4:  ldloca.s   V_3
        IL_00c6:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,class HelloWorld.Program/'<Nested>d__4'>(!!0&,
                                                                                                                                                                                                                                                                                     !!1&)
        IL_00cb:  nop
        IL_00cc:  leave      IL_01a3

        IL_00d1:  ldarg.0
        IL_00d2:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_00d7:  stloc.s    V_4
        IL_00d9:  ldarg.0
        IL_00da:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_00df:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_00e5:  ldarg.0
        IL_00e6:  ldc.i4.m1
        IL_00e7:  dup
        IL_00e8:  stloc.0
        IL_00e9:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
        IL_00ee:  ldarg.0
        IL_00ef:  ldloca.s   V_4
        IL_00f1:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_00f6:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>s__3'
        IL_00fb:  ldarg.0
        IL_00fc:  ldfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>s__2'
        IL_0101:  ldarg.0
        IL_0102:  ldfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>s__3'
        IL_0107:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Add(int32,
                                                                                                                int32)
        IL_010c:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_0111:  stloc.s    V_5
        IL_0113:  ldloca.s   V_5
        IL_0115:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_011a:  brtrue.s   IL_015e

        IL_011c:  ldarg.0
        IL_011d:  ldc.i4.2
        IL_011e:  dup
        IL_011f:  stloc.0
        IL_0120:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
        IL_0125:  ldarg.0
        IL_0126:  ldloc.s    V_5
        IL_0128:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_012d:  ldarg.0
        IL_012e:  stloc.3
        IL_012f:  ldarg.0
        IL_0130:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
        IL_0135:  ldloca.s   V_5
        IL_0137:  ldloca.s   V_3
        IL_0139:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,class HelloWorld.Program/'<Nested>d__4'>(!!0&,
                                                                                                                                                                                                                                                                                     !!1&)
        IL_013e:  nop
        IL_013f:  leave.s    IL_01a3

        IL_0141:  ldarg.0
        IL_0142:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_0147:  stloc.s    V_5
        IL_0149:  ldarg.0
        IL_014a:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>u__1'
        IL_014f:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_0155:  ldarg.0
        IL_0156:  ldc.i4.m1
        IL_0157:  dup
        IL_0158:  stloc.0
        IL_0159:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
        IL_015e:  ldarg.0
        IL_015f:  ldloca.s   V_5
        IL_0161:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_0166:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>s__1'
        IL_016b:  ldarg.0
        IL_016c:  ldfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>s__1'
        IL_0171:  stloc.1
        IL_0172:  leave.s    IL_018e

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_0174:  stloc.s    V_6
        IL_0176:  ldarg.0
        IL_0177:  ldc.i4.s   -2
        IL_0179:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
        IL_017e:  ldarg.0
        IL_017f:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
        IL_0184:  ldloc.s    V_6
        IL_0186:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetException(class [System.Runtime]System.Exception)
        IL_018b:  nop
        IL_018c:  leave.s    IL_01a3

      }  // end handler
      IL_018e:  ldarg.0
      IL_018f:  ldc.i4.s   -2
      IL_0191:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
      IL_0196:  ldarg.0
      IL_0197:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
      IL_019c:  ldloc.1
      IL_019d:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetResult(!0)
      IL_01a2:  nop
      IL_01a3:  ret
    } // end of method '<Nested>d__4'::MoveNext

    .method private hidebysig newslot virtual final 
            instance void  SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine stateMachine) cil managed
    {
      .custom instance void [System.Runtime]System.Diagnostics.DebuggerHiddenAttribute::.ctor() = ( 01 00 00 00 ) 
      .param [1]
      .custom instance void [System.Runtime]System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 01 00 00 ) 
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::SetStateMachine
      // Code size       1 (0x1)
      .maxstack  8
      IL_0000:  ret
    } // end of method '<Nested>d__4'::SetStateMachine

  } // end of class '<Nested>d__4'

  .class auto ansi sealed nested private beforefieldinit '<Sum>d__2'
         extends [System.Runtime]System.Object
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> '<>t__builder'
    .field public int32 n
    .field private int32 '<sum>5__1'
    .field private int32 '<i>5__2'
    .field private int32 '<>s__3'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> '<>u__1'
    .method public hidebysig specialname rtspecialname 
            instance void  .ctor() cil managed
    {
      // Code size       8 (0x8)
      .maxstack  8
      IL_0000:  ldarg.0
      IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
      IL_0006:  nop
      IL_0007:  ret
    } // end of method '<Sum>d__2'::.ctor

    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       256 (0x100)
      .maxstack  3
      .locals init (int32 V_0,
               int32 V_1,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_2,
               class HelloWorld.Program/'<Sum>d__2' V_3,
               int32 V_4,
               bool V_5,
               class [System.Runtime]System.Exception V_6)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Sum>d__2'::'<>1__state'
      IL_0006:  stloc.0
      .try
      {
        IL_0007:  ldloc.0
        IL_0008:  brfalse.s  IL_000c

        IL_000a:  br.s       IL_000e

        IL_000c:  br.s       IL_0069

        IL_000e:  nop
        IL_000f:  ldarg.0
        IL_0010:  ldc.i4.0
        IL_0011:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<sum>5__1'
        IL_0016:  ldarg.0
        IL_0017:  ldc.i4.0
        IL_0018:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<i>5__2'
        IL_001d:  br         IL_00b0

        IL_0022:  ldarg.0
        IL_0023:  ldfld      int32 HelloWorld.Program/'<Sum>d__2'::'<sum>5__1'
        IL_0028:  ldarg.0
        IL_0029:  ldfld      int32 HelloWorld.Program/'<Sum>d__2'::'<i>5__2'
        IL_002e:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Add(int32,
                                                                                                                int32)
        IL_0033:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_0038:  stloc.2
        IL_0039:  ldloca.s   V_2
        IL_003b:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_0040:  brtrue.s   IL_0085

        IL_0042:  ldarg.0
        IL_0043:  ldc.i4.0
        IL_0044:  dup
        IL_0045:  stloc.0
        IL_0046:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<>1__state'
        IL_004b:  ldarg.0
        IL_004c:  ldloc.2
        IL_004d:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>u__1'
        IL_0052:  ldarg.0
        IL_0053:  stloc.3
        IL_0054:  ldarg.0
        IL_0055:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>t__builder'
        IL_005a:  ldloca.s   V_2
        IL_005c:  ldloca.s   V_3
        IL_005e:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,class HelloWorld.Program/'<Sum>d__2'>(!!0&,
                                                                                                                                                                                                                                                                                  !!1&)
        IL_0063:  nop
        IL_0064:  leave      IL_00ff

        IL_0069:  ldarg.0
        IL_006a:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>u__1'
        IL_006f:  stloc.2
        IL_0070:  ldarg.0
        IL_0071:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>u__1'
        IL_0076:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_007c:  ldarg.0
        IL_007d:  ldc.i4.m1
        IL_007e:  dup
        IL_007f:  stloc.0
        IL_0080:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<>1__state'
        IL_0085:  ldarg.0
        IL_0086:  ldloca.s   V_2
        IL_0088:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_008d:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<>s__3'
        IL_0092:  ldarg.0
        IL_0093:  ldarg.0
        IL_0094:  ldfld      int32 HelloWorld.Program/'<Sum>d__2'::'<>s__3'
        IL_0099:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<sum>5__1'
        IL_009e:  ldarg.0
        IL_009f:  ldfld      int32 HelloWorld.Program/'<Sum>d__2'::'<i>5__2'
        IL_00a4:  stloc.s    V_4
        IL_00a6:  ldarg.0
        IL_00a7:  ldloc.s    V_4
        IL_00a9:  ldc.i4.1
        IL_00aa:  add
        IL_00ab:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<i>5__2'
        IL_00b0:  ldarg.0
        IL_00b1:  ldfld      int32 HelloWorld.Program/'<Sum>d__2'::'<i>5__2'
        IL_00b6:  ldarg.0
        IL_00b7:  ldfld      int32 HelloWorld.Program/'<Sum>d__2'::n
        IL_00bc:  clt
        IL_00be:  stloc.s    V_5
        IL_00c0:  ldloc.s    V_5
        IL_00c2:  brtrue     IL_0022

        IL_00c7:  ldarg.0
        IL_00c8:  ldfld      int32 HelloWorld.Program/'<Sum>d__2'::'<sum>5__1'
        IL_00cd:  stloc.1
        IL_00ce:  leave.s    IL_00ea

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_00d0:  stloc.s    V_6
        IL_00d2:  ldarg.0
        IL_00d3:  ldc.i4.s   -2
        IL_00d5:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<>1__state'
        IL_00da:  ldarg.0
        IL_00db:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>t__builder'
        IL_00e0:  ldloc.s    V_6
        IL_00e2:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetException(class [System.Runtime]System.Exception)
        IL_00e7:  nop
        IL_00e8:  leave.s    IL_00ff

      }  // end handler
      IL_00ea:  ldarg.0
      IL_00eb:  ldc.i4.s   -2
      IL_00ed:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<>1__state'
      IL_00f2:  ldarg.0
      IL_00f3:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>t__builder'
      IL_00f8:  ldloc.1
      IL_00f9:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetResult(!0)
      IL_00fe:  nop
      IL_00ff:  ret
    } // end of method '<Sum>d__2'::MoveNext

    .method private hidebysig newslot virtual final 
            instance void  SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine stateMachine) cil managed
    {
      .custom instance void [System.Runtime]System.Diagnostics.DebuggerHiddenAttribute::.ctor() = ( 01 00 00 00 ) 
      .param [1]
      .custom instance void [System.Runtime]System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 01 00 00 ) 
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::SetStateMachine
      // Code size       1 (0x1)
      .maxstack  8
      IL_0000:  ret
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
    .custom instance void [System.Runtime]System.Diagnostics.DebuggerStepThroughAttribute::.ctor() = ( 01 00 00 00 ) 
    // Code size       63 (0x3f)
    .maxstack  2
    .locals init (class HelloWorld.Program/'<Add>d__1' V_0)
    IL_0000:  newobj     instance void HelloWorld.Program/'<Add>d__1'::.ctor()
    IL_0005:  stloc.0
    IL_0006:  ldloc.0
    IL_0007:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Create()
    IL_000c:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Add>d__1'::'<>t__builder'
    IL_0011:  ldloc.0
    IL_0012:  ldarg.0
    IL_0013:  stfld      int32 HelloWorld.Program/'<Add>d__1'::a
    IL_0018:  ldloc.0
    IL_0019:  ldarg.1
    IL_001a:  stfld      int32 HelloWorld.Program/'<Add>d__1'::b
    IL_001f:  ldloc.0
    IL_0020:  ldc.i4.m1
    IL_0021:  stfld      int32 HelloWorld.Program/'<Add>d__1'::'<>1__state'
    IL_0026:  ldloc.0
    IL_0027:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Add>d__1'::'<>t__builder'
    IL_002c:  ldloca.s   V_0
    IL_002e:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Start<class HelloWorld.Program/'<Add>d__1'>(!!0&)
    IL_0033:  ldloc.0
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
    .custom instance void [System.Runtime]System.Diagnostics.DebuggerStepThroughAttribute::.ctor() = ( 01 00 00 00 ) 
    // Code size       56 (0x38)
    .maxstack  2
    .locals init (class HelloWorld.Program/'<Sum>d__2' V_0)
    IL_0000:  newobj     instance void HelloWorld.Program/'<Sum>d__2'::.ctor()
    IL_0005:  stloc.0
    IL_0006:  ldloc.0
    IL_0007:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Create()
    IL_000c:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>t__builder'
    IL_0011:  ldloc.0
    IL_0012:  ldarg.0
    IL_0013:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::n
    IL_0018:  ldloc.0
    IL_0019:  ldc.i4.m1
    IL_001a:  stfld      int32 HelloWorld.Program/'<Sum>d__2'::'<>1__state'
    IL_001f:  ldloc.0
    IL_0020:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>t__builder'
    IL_0025:  ldloca.s   V_0
    IL_0027:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Start<class HelloWorld.Program/'<Sum>d__2'>(!!0&)
    IL_002c:  ldloc.0
    IL_002d:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Sum>d__2'::'<>t__builder'
    IL_0032:  call       instance class [System.Runtime]System.Threading.Tasks.Task`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::get_Task()
    IL_0037:  ret
  } // end of method Program::Sum

  .method private hidebysig instance class [System.Runtime]System.Threading.Tasks.Task`1<int32> 
          Instance(int32 n) cil managed
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.AsyncStateMachineAttribute::.ctor(class [System.Runtime]System.Type) = ( 01 00 21 48 65 6C 6C 6F 57 6F 72 6C 64 2E 50 72   // ..!HelloWorld.Pr
                                                                                                                                                   6F 67 72 61 6D 2B 3C 49 6E 73 74 61 6E 63 65 3E   // ogram+<Instance>
                                                                                                                                                   64 5F 5F 33 00 00 )                               // d__3..
    .custom instance void [System.Runtime]System.Diagnostics.DebuggerStepThroughAttribute::.ctor() = ( 01 00 00 00 ) 
    // Code size       63 (0x3f)
    .maxstack  2
    .locals init (class HelloWorld.Program/'<Instance>d__3' V_0)
    IL_0000:  newobj     instance void HelloWorld.Program/'<Instance>d__3'::.ctor()
    IL_0005:  stloc.0
    IL_0006:  ldloc.0
    IL_0007:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Create()
    IL_000c:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Instance>d__3'::'<>t__builder'
    IL_0011:  ldloc.0
    IL_0012:  ldarg.0
    IL_0013:  stfld      class HelloWorld.Program HelloWorld.Program/'<Instance>d__3'::'<>4__this'
    IL_0018:  ldloc.0
    IL_0019:  ldarg.1
    IL_001a:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::n
    IL_001f:  ldloc.0
    IL_0020:  ldc.i4.m1
    IL_0021:  stfld      int32 HelloWorld.Program/'<Instance>d__3'::'<>1__state'
    IL_0026:  ldloc.0
    IL_0027:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Instance>d__3'::'<>t__builder'
    IL_002c:  ldloca.s   V_0
    IL_002e:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Start<class HelloWorld.Program/'<Instance>d__3'>(!!0&)
    IL_0033:  ldloc.0
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
    .custom instance void [System.Runtime]System.Diagnostics.DebuggerStepThroughAttribute::.ctor() = ( 01 00 00 00 ) 
    // Code size       56 (0x38)
    .maxstack  2
    .locals init (class HelloWorld.Program/'<Nested>d__4' V_0)
    IL_0000:  newobj     instance void HelloWorld.Program/'<Nested>d__4'::.ctor()
    IL_0005:  stloc.0
    IL_0006:  ldloc.0
    IL_0007:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Create()
    IL_000c:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
    IL_0011:  ldloc.0
    IL_0012:  ldarg.0
    IL_0013:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::n
    IL_0018:  ldloc.0
    IL_0019:  ldc.i4.m1
    IL_001a:  stfld      int32 HelloWorld.Program/'<Nested>d__4'::'<>1__state'
    IL_001f:  ldloc.0
    IL_0020:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
    IL_0025:  ldloca.s   V_0
    IL_0027:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Start<class HelloWorld.Program/'<Nested>d__4'>(!!0&)
    IL_002c:  ldloc.0
    IL_002d:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Nested>d__4'::'<>t__builder'
    IL_0032:  call       instance class [System.Runtime]System.Threading.Tasks.Task`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::get_Task()
    IL_0037:  ret
  } // end of method Program::Nested

  .method private hidebysig static class [System.Runtime]System.Threading.Tasks.Task`1<int32> 
          Fault() cil managed
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.AsyncStateMachineAttribute::.ctor(class [System.Runtime]System.Type) = ( 01 00 1E 48 65 6C 6C 6F 57 6F 72 6C 64 2E 50 72   // ...HelloWorld.Pr
                                                                                                                                                   6F 67 72 61 6D 2B 3C 46 61 75 6C 74 3E 64 5F 5F   // ogram+<Fault>d__
                                                                                                                                                   36 00 00 )                                        // 6..
    .custom instance void [System.Runtime]System.Diagnostics.DebuggerStepThroughAttribute::.ctor() = ( 01 00 00 00 ) 
    // Code size       49 (0x31)
    .maxstack  2
    .locals init (class HelloWorld.Program/'<Fault>d__6' V_0)
    IL_0000:  newobj     instance void HelloWorld.Program/'<Fault>d__6'::.ctor()
    IL_0005:  stloc.0
    IL_0006:  ldloc.0
    IL_0007:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Create()
    IL_000c:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__6'::'<>t__builder'
    IL_0011:  ldloc.0
    IL_0012:  ldc.i4.m1
    IL_0013:  stfld      int32 HelloWorld.Program/'<Fault>d__6'::'<>1__state'
    IL_0018:  ldloc.0
    IL_0019:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__6'::'<>t__builder'
    IL_001e:  ldloca.s   V_0
    IL_0020:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Start<class HelloWorld.Program/'<Fault>d__6'>(!!0&)
    IL_0025:  ldloc.0
    IL_0026:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Fault>d__6'::'<>t__builder'
    IL_002b:  call       instance class [System.Runtime]System.Threading.Tasks.Task`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::get_Task()
    IL_0030:  ret
  } // end of method Program::Fault

  .method private hidebysig static class [System.Runtime]System.Threading.Tasks.Task`1<int32> 
          Consumer(class [System.Runtime]System.Threading.Tasks.Task`1<int32> task,
                   int32 delay) cil managed
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.AsyncStateMachineAttribute::.ctor(class [System.Runtime]System.Type) = ( 01 00 21 48 65 6C 6C 6F 57 6F 72 6C 64 2E 50 72   // ..!HelloWorld.Pr
                                                                                                                                                   6F 67 72 61 6D 2B 3C 43 6F 6E 73 75 6D 65 72 3E   // ogram+<Consumer>
                                                                                                                                                   64 5F 5F 38 00 00 )                               // d__8..
    .custom instance void [System.Runtime]System.Diagnostics.DebuggerStepThroughAttribute::.ctor() = ( 01 00 00 00 ) 
    // Code size       63 (0x3f)
    .maxstack  2
    .locals init (class HelloWorld.Program/'<Consumer>d__8' V_0)
    IL_0000:  newobj     instance void HelloWorld.Program/'<Consumer>d__8'::.ctor()
    IL_0005:  stloc.0
    IL_0006:  ldloc.0
    IL_0007:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Create()
    IL_000c:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>t__builder'
    IL_0011:  ldloc.0
    IL_0012:  ldarg.0
    IL_0013:  stfld      class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program/'<Consumer>d__8'::task
    IL_0018:  ldloc.0
    IL_0019:  ldarg.1
    IL_001a:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::delay
    IL_001f:  ldloc.0
    IL_0020:  ldc.i4.m1
    IL_0021:  stfld      int32 HelloWorld.Program/'<Consumer>d__8'::'<>1__state'
    IL_0026:  ldloc.0
    IL_0027:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Consumer>d__8'::'<>t__builder'
    IL_002c:  ldloca.s   V_0
    IL_002e:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Start<class HelloWorld.Program/'<Consumer>d__8'>(!!0&)
    IL_0033:  ldloc.0
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
    .custom instance void [System.Runtime]System.Diagnostics.DebuggerStepThroughAttribute::.ctor() = ( 01 00 00 00 ) 
    // Code size       49 (0x31)
    .maxstack  2
    .locals init (class HelloWorld.Program/'<Main>d__9' V_0)
    IL_0000:  newobj     instance void HelloWorld.Program/'<Main>d__9'::.ctor()
    IL_0005:  stloc.0
    IL_0006:  ldloc.0
    IL_0007:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::Create()
    IL_000c:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
    IL_0011:  ldloc.0
    IL_0012:  ldc.i4.m1
    IL_0013:  stfld      int32 HelloWorld.Program/'<Main>d__9'::'<>1__state'
    IL_0018:  ldloc.0
    IL_0019:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
    IL_001e:  ldloca.s   V_0
    IL_0020:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::Start<class HelloWorld.Program/'<Main>d__9'>(!!0&)
    IL_0025:  ldloc.0
    IL_0026:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Main>d__9'::'<>t__builder'
    IL_002b:  call       instance class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::get_Task()
    IL_0030:  ret
  } // end of method Program::Main

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       15 (0xf)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldc.i4.7
    IL_0002:  stfld      int32 HelloWorld.Program::offset
    IL_0007:  ldarg.0
    IL_0008:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_000d:  nop
    IL_000e:  ret
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
    .custom instance void [System.Runtime]System.Diagnostics.DebuggerStepThroughAttribute::.ctor() = ( 01 00 00 00 ) 
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
