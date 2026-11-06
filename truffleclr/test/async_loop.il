
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
// MVID: {dd97d91d-9177-44ac-84b7-3f2fc88b5e89}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x1003b0000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .class auto ansi sealed nested private beforefieldinit '<Loop>d__0'
         extends [System.Runtime]System.ValueType
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> '<>t__builder'
    .field private int32 '<sum>5__2'
    .field private int32 '<i>5__3'
    .field private int32 '<>7__wrap3'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> '<>u__1'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter '<>u__2'
    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       398 (0x18e)
      .maxstack  3
      .locals init (int32 V_0,
               int32 V_1,
               int32 V_2,
               valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_3,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter V_4,
               valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable V_5,
               class [System.Runtime]System.Exception V_6)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Loop>d__0'::'<>1__state'
      IL_0006:  stloc.0
      .try
      {
        IL_0007:  ldloc.0
        IL_0008:  brfalse.s  IL_0068

        IL_000a:  ldloc.0
        IL_000b:  ldc.i4.1
        IL_000c:  beq        IL_0103

        IL_0011:  ldarg.0
        IL_0012:  ldc.i4.0
        IL_0013:  stfld      int32 HelloWorld.Program/'<Loop>d__0'::'<sum>5__2'
        IL_0018:  ldarg.0
        IL_0019:  ldc.i4.0
        IL_001a:  stfld      int32 HelloWorld.Program/'<Loop>d__0'::'<i>5__3'
        IL_001f:  br         IL_00aa

        IL_0024:  ldarg.0
        IL_0025:  ldarg.0
        IL_0026:  ldfld      int32 HelloWorld.Program/'<Loop>d__0'::'<sum>5__2'
        IL_002b:  stfld      int32 HelloWorld.Program/'<Loop>d__0'::'<>7__wrap3'
        IL_0030:  ldc.i4.1
        IL_0031:  call       class [System.Runtime]System.Threading.Tasks.Task`1<!!0> [System.Runtime]System.Threading.Tasks.Task::FromResult<int32>(!!0)
        IL_0036:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
        IL_003b:  stloc.3
        IL_003c:  ldloca.s   V_3
        IL_003e:  call       instance bool valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::get_IsCompleted()
        IL_0043:  brtrue.s   IL_0084

        IL_0045:  ldarg.0
        IL_0046:  ldc.i4.0
        IL_0047:  dup
        IL_0048:  stloc.0
        IL_0049:  stfld      int32 HelloWorld.Program/'<Loop>d__0'::'<>1__state'
        IL_004e:  ldarg.0
        IL_004f:  ldloc.3
        IL_0050:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Loop>d__0'::'<>u__1'
        IL_0055:  ldarg.0
        IL_0056:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Loop>d__0'::'<>t__builder'
        IL_005b:  ldloca.s   V_3
        IL_005d:  ldarg.0
        IL_005e:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>,valuetype HelloWorld.Program/'<Loop>d__0'>(!!0&,
                                                                                                                                                                                                                                                                                       !!1&)
        IL_0063:  leave      IL_018d

        IL_0068:  ldarg.0
        IL_0069:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Loop>d__0'::'<>u__1'
        IL_006e:  stloc.3
        IL_006f:  ldarg.0
        IL_0070:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> HelloWorld.Program/'<Loop>d__0'::'<>u__1'
        IL_0075:  initobj    valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>
        IL_007b:  ldarg.0
        IL_007c:  ldc.i4.m1
        IL_007d:  dup
        IL_007e:  stloc.0
        IL_007f:  stfld      int32 HelloWorld.Program/'<Loop>d__0'::'<>1__state'
        IL_0084:  ldloca.s   V_3
        IL_0086:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
        IL_008b:  stloc.2
        IL_008c:  ldarg.0
        IL_008d:  ldarg.0
        IL_008e:  ldfld      int32 HelloWorld.Program/'<Loop>d__0'::'<>7__wrap3'
        IL_0093:  ldloc.2
        IL_0094:  add
        IL_0095:  stfld      int32 HelloWorld.Program/'<Loop>d__0'::'<sum>5__2'
        IL_009a:  ldarg.0
        IL_009b:  ldfld      int32 HelloWorld.Program/'<Loop>d__0'::'<i>5__3'
        IL_00a0:  stloc.2
        IL_00a1:  ldarg.0
        IL_00a2:  ldloc.2
        IL_00a3:  ldc.i4.1
        IL_00a4:  add
        IL_00a5:  stfld      int32 HelloWorld.Program/'<Loop>d__0'::'<i>5__3'
        IL_00aa:  ldarg.0
        IL_00ab:  ldfld      int32 HelloWorld.Program/'<Loop>d__0'::'<i>5__3'
        IL_00b0:  ldc.i4     0x186a0
        IL_00b5:  blt        IL_0024

        IL_00ba:  ldarg.0
        IL_00bb:  ldc.i4.0
        IL_00bc:  stfld      int32 HelloWorld.Program/'<Loop>d__0'::'<i>5__3'
        IL_00c1:  br         IL_0147

        IL_00c6:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable [System.Runtime]System.Threading.Tasks.Task::Yield()
        IL_00cb:  stloc.s    V_5
        IL_00cd:  ldloca.s   V_5
        IL_00cf:  call       instance valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable::GetAwaiter()
        IL_00d4:  stloc.s    V_4
        IL_00d6:  ldloca.s   V_4
        IL_00d8:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::get_IsCompleted()
        IL_00dd:  brtrue.s   IL_0120

        IL_00df:  ldarg.0
        IL_00e0:  ldc.i4.1
        IL_00e1:  dup
        IL_00e2:  stloc.0
        IL_00e3:  stfld      int32 HelloWorld.Program/'<Loop>d__0'::'<>1__state'
        IL_00e8:  ldarg.0
        IL_00e9:  ldloc.s    V_4
        IL_00eb:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Loop>d__0'::'<>u__2'
        IL_00f0:  ldarg.0
        IL_00f1:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Loop>d__0'::'<>t__builder'
        IL_00f6:  ldloca.s   V_4
        IL_00f8:  ldarg.0
        IL_00f9:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter,valuetype HelloWorld.Program/'<Loop>d__0'>(!!0&,
                                                                                                                                                                                                                                                                                              !!1&)
        IL_00fe:  leave      IL_018d

        IL_0103:  ldarg.0
        IL_0104:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Loop>d__0'::'<>u__2'
        IL_0109:  stloc.s    V_4
        IL_010b:  ldarg.0
        IL_010c:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter HelloWorld.Program/'<Loop>d__0'::'<>u__2'
        IL_0111:  initobj    [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter
        IL_0117:  ldarg.0
        IL_0118:  ldc.i4.m1
        IL_0119:  dup
        IL_011a:  stloc.0
        IL_011b:  stfld      int32 HelloWorld.Program/'<Loop>d__0'::'<>1__state'
        IL_0120:  ldloca.s   V_4
        IL_0122:  call       instance void [System.Runtime]System.Runtime.CompilerServices.YieldAwaitable/YieldAwaiter::GetResult()
        IL_0127:  ldarg.0
        IL_0128:  ldfld      int32 HelloWorld.Program/'<Loop>d__0'::'<sum>5__2'
        IL_012d:  stloc.2
        IL_012e:  ldarg.0
        IL_012f:  ldloc.2
        IL_0130:  ldc.i4.1
        IL_0131:  add
        IL_0132:  stfld      int32 HelloWorld.Program/'<Loop>d__0'::'<sum>5__2'
        IL_0137:  ldarg.0
        IL_0138:  ldfld      int32 HelloWorld.Program/'<Loop>d__0'::'<i>5__3'
        IL_013d:  stloc.2
        IL_013e:  ldarg.0
        IL_013f:  ldloc.2
        IL_0140:  ldc.i4.1
        IL_0141:  add
        IL_0142:  stfld      int32 HelloWorld.Program/'<Loop>d__0'::'<i>5__3'
        IL_0147:  ldarg.0
        IL_0148:  ldfld      int32 HelloWorld.Program/'<Loop>d__0'::'<i>5__3'
        IL_014d:  ldc.i4     0x2710
        IL_0152:  blt        IL_00c6

        IL_0157:  ldarg.0
        IL_0158:  ldfld      int32 HelloWorld.Program/'<Loop>d__0'::'<sum>5__2'
        IL_015d:  stloc.1
        IL_015e:  leave.s    IL_0179

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_0160:  stloc.s    V_6
        IL_0162:  ldarg.0
        IL_0163:  ldc.i4.s   -2
        IL_0165:  stfld      int32 HelloWorld.Program/'<Loop>d__0'::'<>1__state'
        IL_016a:  ldarg.0
        IL_016b:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Loop>d__0'::'<>t__builder'
        IL_0170:  ldloc.s    V_6
        IL_0172:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetException(class [System.Runtime]System.Exception)
        IL_0177:  leave.s    IL_018d

      }  // end handler
      IL_0179:  ldarg.0
      IL_017a:  ldc.i4.s   -2
      IL_017c:  stfld      int32 HelloWorld.Program/'<Loop>d__0'::'<>1__state'
      IL_0181:  ldarg.0
      IL_0182:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Loop>d__0'::'<>t__builder'
      IL_0187:  ldloc.1
      IL_0188:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetResult(!0)
      IL_018d:  ret
    } // end of method '<Loop>d__0'::MoveNext

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
      IL_0001:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Loop>d__0'::'<>t__builder'
      IL_0006:  ldarg.1
      IL_0007:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine)
      IL_000c:  ret
    } // end of method '<Loop>d__0'::SetStateMachine

  } // end of class '<Loop>d__0'

  .method private hidebysig static class [System.Runtime]System.Threading.Tasks.Task`1<int32> 
          Loop() cil managed
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.AsyncStateMachineAttribute::.ctor(class [System.Runtime]System.Type) = ( 01 00 1D 48 65 6C 6C 6F 57 6F 72 6C 64 2E 50 72   // ...HelloWorld.Pr
                                                                                                                                                   6F 67 72 61 6D 2B 3C 4C 6F 6F 70 3E 64 5F 5F 30   // ogram+<Loop>d__0
                                                                                                                                                   00 00 ) 
    // Code size       47 (0x2f)
    .maxstack  2
    .locals init (valuetype HelloWorld.Program/'<Loop>d__0' V_0)
    IL_0000:  ldloca.s   V_0
    IL_0002:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Create()
    IL_0007:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Loop>d__0'::'<>t__builder'
    IL_000c:  ldloca.s   V_0
    IL_000e:  ldc.i4.m1
    IL_000f:  stfld      int32 HelloWorld.Program/'<Loop>d__0'::'<>1__state'
    IL_0014:  ldloca.s   V_0
    IL_0016:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Loop>d__0'::'<>t__builder'
    IL_001b:  ldloca.s   V_0
    IL_001d:  call       instance void valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::Start<valuetype HelloWorld.Program/'<Loop>d__0'>(!!0&)
    IL_0022:  ldloca.s   V_0
    IL_0024:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32> HelloWorld.Program/'<Loop>d__0'::'<>t__builder'
    IL_0029:  call       instance class [System.Runtime]System.Threading.Tasks.Task`1<!0> valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1<int32>::get_Task()
    IL_002e:  ret
  } // end of method Program::Loop

  .method private hidebysig static void  Main() cil managed
  {
    .entrypoint
    // Code size       24 (0x18)
    .maxstack  1
    .locals init (valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32> V_0)
    IL_0000:  call       class [System.Runtime]System.Threading.Tasks.Task`1<int32> HelloWorld.Program::Loop()
    IL_0005:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<!0> class [System.Runtime]System.Threading.Tasks.Task`1<int32>::GetAwaiter()
    IL_000a:  stloc.0
    IL_000b:  ldloca.s   V_0
    IL_000d:  call       instance !0 valuetype [System.Runtime]System.Runtime.CompilerServices.TaskAwaiter`1<int32>::GetResult()
    IL_0012:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0017:  ret
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

} // end of class HelloWorld.Program


// =============================================================

// *********** DISASSEMBLY COMPLETE ***********************
