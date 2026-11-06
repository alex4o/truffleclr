
//  .NET IL Disassembler.  Version 10.0.14



// Metadata version: v4.0.30319
.assembly extern System.Runtime
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
// MVID: {021e4400-2f00-47fc-9188-4b7c7612c95b}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x1029ac000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .class auto ansi sealed nested private beforefieldinit '<Unsupported>d__0'
         extends [System.Runtime]System.ValueType
         implements [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = ( 01 00 00 00 ) 
    .field public int32 '<>1__state'
    .field public valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder '<>t__builder'
    .field private valuetype [System.Runtime]System.Runtime.CompilerServices.ConfiguredTaskAwaitable/ConfiguredTaskAwaiter '<>u__1'
    .method private hidebysig newslot virtual final 
            instance void  MoveNext() cil managed
    {
      .override [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine::MoveNext
      // Code size       151 (0x97)
      .maxstack  3
      .locals init (int32 V_0,
               valuetype [System.Runtime]System.Runtime.CompilerServices.ConfiguredTaskAwaitable/ConfiguredTaskAwaiter V_1,
               valuetype [System.Runtime]System.Runtime.CompilerServices.ConfiguredTaskAwaitable V_2,
               class [System.Runtime]System.Exception V_3)
      IL_0000:  ldarg.0
      IL_0001:  ldfld      int32 HelloWorld.Program/'<Unsupported>d__0'::'<>1__state'
      IL_0006:  stloc.0
      .try
      {
        IL_0007:  ldloc.0
        IL_0008:  brfalse.s  IL_0047

        IL_000a:  call       class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Threading.Tasks.Task::get_CompletedTask()
        IL_000f:  ldc.i4.0
        IL_0010:  callvirt   instance valuetype [System.Runtime]System.Runtime.CompilerServices.ConfiguredTaskAwaitable [System.Runtime]System.Threading.Tasks.Task::ConfigureAwait(bool)
        IL_0015:  stloc.2
        IL_0016:  ldloca.s   V_2
        IL_0018:  call       instance valuetype [System.Runtime]System.Runtime.CompilerServices.ConfiguredTaskAwaitable/ConfiguredTaskAwaiter [System.Runtime]System.Runtime.CompilerServices.ConfiguredTaskAwaitable::GetAwaiter()
        IL_001d:  stloc.1
        IL_001e:  ldloca.s   V_1
        IL_0020:  call       instance bool [System.Runtime]System.Runtime.CompilerServices.ConfiguredTaskAwaitable/ConfiguredTaskAwaiter::get_IsCompleted()
        IL_0025:  brtrue.s   IL_0063

        IL_0027:  ldarg.0
        IL_0028:  ldc.i4.0
        IL_0029:  dup
        IL_002a:  stloc.0
        IL_002b:  stfld      int32 HelloWorld.Program/'<Unsupported>d__0'::'<>1__state'
        IL_0030:  ldarg.0
        IL_0031:  ldloc.1
        IL_0032:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.ConfiguredTaskAwaitable/ConfiguredTaskAwaiter HelloWorld.Program/'<Unsupported>d__0'::'<>u__1'
        IL_0037:  ldarg.0
        IL_0038:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Unsupported>d__0'::'<>t__builder'
        IL_003d:  ldloca.s   V_1
        IL_003f:  ldarg.0
        IL_0040:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::AwaitUnsafeOnCompleted<valuetype [System.Runtime]System.Runtime.CompilerServices.ConfiguredTaskAwaitable/ConfiguredTaskAwaiter,valuetype HelloWorld.Program/'<Unsupported>d__0'>(!!0&,
                                                                                                                                                                                                                                                                                                    !!1&)
        IL_0045:  leave.s    IL_0096

        IL_0047:  ldarg.0
        IL_0048:  ldfld      valuetype [System.Runtime]System.Runtime.CompilerServices.ConfiguredTaskAwaitable/ConfiguredTaskAwaiter HelloWorld.Program/'<Unsupported>d__0'::'<>u__1'
        IL_004d:  stloc.1
        IL_004e:  ldarg.0
        IL_004f:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.ConfiguredTaskAwaitable/ConfiguredTaskAwaiter HelloWorld.Program/'<Unsupported>d__0'::'<>u__1'
        IL_0054:  initobj    [System.Runtime]System.Runtime.CompilerServices.ConfiguredTaskAwaitable/ConfiguredTaskAwaiter
        IL_005a:  ldarg.0
        IL_005b:  ldc.i4.m1
        IL_005c:  dup
        IL_005d:  stloc.0
        IL_005e:  stfld      int32 HelloWorld.Program/'<Unsupported>d__0'::'<>1__state'
        IL_0063:  ldloca.s   V_1
        IL_0065:  call       instance void [System.Runtime]System.Runtime.CompilerServices.ConfiguredTaskAwaitable/ConfiguredTaskAwaiter::GetResult()
        IL_006a:  leave.s    IL_0083

      }  // end .try
      catch [System.Runtime]System.Exception 
      {
        IL_006c:  stloc.3
        IL_006d:  ldarg.0
        IL_006e:  ldc.i4.s   -2
        IL_0070:  stfld      int32 HelloWorld.Program/'<Unsupported>d__0'::'<>1__state'
        IL_0075:  ldarg.0
        IL_0076:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Unsupported>d__0'::'<>t__builder'
        IL_007b:  ldloc.3
        IL_007c:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::SetException(class [System.Runtime]System.Exception)
        IL_0081:  leave.s    IL_0096

      }  // end handler
      IL_0083:  ldarg.0
      IL_0084:  ldc.i4.s   -2
      IL_0086:  stfld      int32 HelloWorld.Program/'<Unsupported>d__0'::'<>1__state'
      IL_008b:  ldarg.0
      IL_008c:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Unsupported>d__0'::'<>t__builder'
      IL_0091:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::SetResult()
      IL_0096:  ret
    } // end of method '<Unsupported>d__0'::MoveNext

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
      IL_0001:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Unsupported>d__0'::'<>t__builder'
      IL_0006:  ldarg.1
      IL_0007:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::SetStateMachine(class [System.Runtime]System.Runtime.CompilerServices.IAsyncStateMachine)
      IL_000c:  ret
    } // end of method '<Unsupported>d__0'::SetStateMachine

  } // end of class '<Unsupported>d__0'

  .method private hidebysig static class [System.Runtime]System.Threading.Tasks.Task 
          Unsupported() cil managed
  {
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.AsyncStateMachineAttribute::.ctor(class [System.Runtime]System.Type) = ( 01 00 24 48 65 6C 6C 6F 57 6F 72 6C 64 2E 50 72   // ..$HelloWorld.Pr
                                                                                                                                                   6F 67 72 61 6D 2B 3C 55 6E 73 75 70 70 6F 72 74   // ogram+<Unsupport
                                                                                                                                                   65 64 3E 64 5F 5F 30 00 00 )                      // ed>d__0..
    // Code size       47 (0x2f)
    .maxstack  2
    .locals init (valuetype HelloWorld.Program/'<Unsupported>d__0' V_0)
    IL_0000:  ldloca.s   V_0
    IL_0002:  call       valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::Create()
    IL_0007:  stfld      valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Unsupported>d__0'::'<>t__builder'
    IL_000c:  ldloca.s   V_0
    IL_000e:  ldc.i4.m1
    IL_000f:  stfld      int32 HelloWorld.Program/'<Unsupported>d__0'::'<>1__state'
    IL_0014:  ldloca.s   V_0
    IL_0016:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Unsupported>d__0'::'<>t__builder'
    IL_001b:  ldloca.s   V_0
    IL_001d:  call       instance void [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::Start<valuetype HelloWorld.Program/'<Unsupported>d__0'>(!!0&)
    IL_0022:  ldloca.s   V_0
    IL_0024:  ldflda     valuetype [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder HelloWorld.Program/'<Unsupported>d__0'::'<>t__builder'
    IL_0029:  call       instance class [System.Runtime]System.Threading.Tasks.Task [System.Runtime]System.Runtime.CompilerServices.AsyncTaskMethodBuilder::get_Task()
    IL_002e:  ret
  } // end of method Program::Unsupported

  .method private hidebysig static void  Main() cil managed
  {
    .entrypoint
    // Code size       1 (0x1)
    .maxstack  8
    IL_0000:  ret
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
