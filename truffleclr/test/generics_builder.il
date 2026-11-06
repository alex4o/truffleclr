
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
// MVID: {cceee88f-0240-4403-9bc9-1a9670323c2c}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x10121c000


// =============== CLASS MEMBERS DECLARATION ===================

.class interface private abstract auto ansi beforefieldinit HelloWorld.IStateMachine
{
  .method public hidebysig newslot abstract virtual 
          instance void  MoveNext() cil managed
  {
  } // end of method IStateMachine::MoveNext

} // end of class HelloWorld.IStateMachine

.class interface private abstract auto ansi beforefieldinit HelloWorld.IAwaiter
{
  .method public hidebysig newslot abstract virtual 
          instance void  Complete() cil managed
  {
  } // end of method IAwaiter::Complete

} // end of class HelloWorld.IAwaiter

.class private sequential ansi sealed beforefieldinit HelloWorld.Machine
       extends [System.Runtime]System.ValueType
       implements HelloWorld.IStateMachine
{
  .field public int32 State
  .method public hidebysig newslot virtual final 
          instance void  MoveNext() cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      int32 HelloWorld.Machine::State
    IL_0008:  ldc.i4.1
    IL_0009:  add
    IL_000a:  stfld      int32 HelloWorld.Machine::State
    IL_000f:  ret
  } // end of method Machine::MoveNext

} // end of class HelloWorld.Machine

.class private sequential ansi sealed beforefieldinit HelloWorld.Awaiter
       extends [System.Runtime]System.ValueType
       implements HelloWorld.IAwaiter
{
  .field public int32 Calls
  .method public hidebysig newslot virtual final 
          instance void  Complete() cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.0
    IL_0003:  ldfld      int32 HelloWorld.Awaiter::Calls
    IL_0008:  ldc.i4.1
    IL_0009:  add
    IL_000a:  stfld      int32 HelloWorld.Awaiter::Calls
    IL_000f:  ret
  } // end of method Awaiter::Complete

} // end of class HelloWorld.Awaiter

.class private sequential ansi sealed beforefieldinit HelloWorld.Result
       extends [System.Runtime]System.ValueType
{
  .field public int32 Value
} // end of class HelloWorld.Result

.class private sequential ansi sealed beforefieldinit HelloWorld.Builder`1<TResult>
       extends [System.Runtime]System.ValueType
{
  .field private !TResult result
  .method public hidebysig instance void 
          Start<(HelloWorld.IStateMachine) TStateMachine>(!!TStateMachine& stateMachine) cil managed
  {
    // Code size       15 (0xf)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  constrained. !!TStateMachine
    IL_0008:  callvirt   instance void HelloWorld.IStateMachine::MoveNext()
    IL_000d:  nop
    IL_000e:  ret
  } // end of method Builder`1::Start

  .method public hidebysig instance void 
          AwaitUnsafeOnCompleted<(HelloWorld.IAwaiter) TAwaiter,(HelloWorld.IStateMachine) TStateMachine>(!!TAwaiter& awaiter,
                                                                                                          !!TStateMachine& stateMachine) cil managed
  {
    // Code size       23 (0x17)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  constrained. !!TAwaiter
    IL_0008:  callvirt   instance void HelloWorld.IAwaiter::Complete()
    IL_000d:  nop
    IL_000e:  ldarg.0
    IL_000f:  ldarg.2
    IL_0010:  call       instance void valuetype HelloWorld.Builder`1<!TResult>::Start<!!1>(!!0&)
    IL_0015:  nop
    IL_0016:  ret
  } // end of method Builder`1::AwaitUnsafeOnCompleted

  .method public hidebysig instance void 
          SetResult(!TResult 'value') cil managed
  {
    // Code size       9 (0x9)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  stfld      !0 valuetype HelloWorld.Builder`1<!TResult>::result
    IL_0008:  ret
  } // end of method Builder`1::SetResult

  .method public hidebysig instance !TResult 
          GetResult() cil managed
  {
    // Code size       12 (0xc)
    .maxstack  1
    .locals init (!TResult V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      !0 valuetype HelloWorld.Builder`1<!TResult>::result
    IL_0007:  stloc.0
    IL_0008:  br.s       IL_000a

    IL_000a:  ldloc.0
    IL_000b:  ret
  } // end of method Builder`1::GetResult

} // end of class HelloWorld.Builder`1

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static !!T  Default<T>() cil managed
  {
    // Code size       15 (0xf)
    .maxstack  1
    .locals init (!!T V_0,
             !!T V_1)
    IL_0000:  nop
    IL_0001:  ldloca.s   V_0
    IL_0003:  initobj    !!T
    IL_0009:  ldloc.0
    IL_000a:  stloc.1
    IL_000b:  br.s       IL_000d

    IL_000d:  ldloc.1
    IL_000e:  ret
  } // end of method Program::Default

  .method private hidebysig static void  Main() cil managed
  {
    .entrypoint
    // Code size       240 (0xf0)
    .maxstack  3
    .locals init (valuetype HelloWorld.Builder`1<int32> V_0,
             valuetype HelloWorld.Machine V_1,
             valuetype HelloWorld.Awaiter V_2,
             valuetype HelloWorld.Builder`1<string> V_3,
             valuetype HelloWorld.Builder`1<valuetype HelloWorld.Result> V_4,
             valuetype HelloWorld.Result V_5)
    IL_0000:  nop
    IL_0001:  ldloca.s   V_0
    IL_0003:  initobj    valuetype HelloWorld.Builder`1<int32>
    IL_0009:  ldloca.s   V_1
    IL_000b:  initobj    HelloWorld.Machine
    IL_0011:  ldloca.s   V_2
    IL_0013:  initobj    HelloWorld.Awaiter
    IL_0019:  ldloca.s   V_0
    IL_001b:  ldloca.s   V_1
    IL_001d:  call       instance void valuetype HelloWorld.Builder`1<int32>::Start<valuetype HelloWorld.Machine>(!!0&)
    IL_0022:  nop
    IL_0023:  ldloca.s   V_0
    IL_0025:  ldloca.s   V_2
    IL_0027:  ldloca.s   V_1
    IL_0029:  call       instance void valuetype HelloWorld.Builder`1<int32>::AwaitUnsafeOnCompleted<valuetype HelloWorld.Awaiter,valuetype HelloWorld.Machine>(!!0&,
                                                                                                                                                                !!1&)
    IL_002e:  nop
    IL_002f:  ldloca.s   V_0
    IL_0031:  ldc.i4.s   42
    IL_0033:  call       instance void valuetype HelloWorld.Builder`1<int32>::SetResult(!0)
    IL_0038:  nop
    IL_0039:  ldloc.1
    IL_003a:  ldfld      int32 HelloWorld.Machine::State
    IL_003f:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0044:  nop
    IL_0045:  ldloc.2
    IL_0046:  ldfld      int32 HelloWorld.Awaiter::Calls
    IL_004b:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0050:  nop
    IL_0051:  ldloca.s   V_0
    IL_0053:  call       instance !0 valuetype HelloWorld.Builder`1<int32>::GetResult()
    IL_0058:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_005d:  nop
    IL_005e:  ldloca.s   V_3
    IL_0060:  initobj    valuetype HelloWorld.Builder`1<string>
    IL_0066:  ldloca.s   V_3
    IL_0068:  ldstr      "ready"
    IL_006d:  call       instance void valuetype HelloWorld.Builder`1<string>::SetResult(!0)
    IL_0072:  nop
    IL_0073:  ldloca.s   V_3
    IL_0075:  ldloca.s   V_2
    IL_0077:  ldloca.s   V_1
    IL_0079:  call       instance void valuetype HelloWorld.Builder`1<string>::AwaitUnsafeOnCompleted<valuetype HelloWorld.Awaiter,valuetype HelloWorld.Machine>(!!0&,
                                                                                                                                                                 !!1&)
    IL_007e:  nop
    IL_007f:  ldloca.s   V_3
    IL_0081:  call       instance !0 valuetype HelloWorld.Builder`1<string>::GetResult()
    IL_0086:  call       void [System.Console]System.Console::WriteLine(string)
    IL_008b:  nop
    IL_008c:  ldloc.1
    IL_008d:  ldfld      int32 HelloWorld.Machine::State
    IL_0092:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0097:  nop
    IL_0098:  ldloc.2
    IL_0099:  ldfld      int32 HelloWorld.Awaiter::Calls
    IL_009e:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00a3:  nop
    IL_00a4:  ldloca.s   V_4
    IL_00a6:  initobj    valuetype HelloWorld.Builder`1<valuetype HelloWorld.Result>
    IL_00ac:  ldloca.s   V_5
    IL_00ae:  initobj    HelloWorld.Result
    IL_00b4:  ldloca.s   V_5
    IL_00b6:  ldc.i4.7
    IL_00b7:  stfld      int32 HelloWorld.Result::Value
    IL_00bc:  ldloca.s   V_4
    IL_00be:  ldloc.s    V_5
    IL_00c0:  call       instance void valuetype HelloWorld.Builder`1<valuetype HelloWorld.Result>::SetResult(!0)
    IL_00c5:  nop
    IL_00c6:  ldloca.s   V_5
    IL_00c8:  ldc.i4.s   99
    IL_00ca:  stfld      int32 HelloWorld.Result::Value
    IL_00cf:  ldloca.s   V_4
    IL_00d1:  call       instance !0 valuetype HelloWorld.Builder`1<valuetype HelloWorld.Result>::GetResult()
    IL_00d6:  ldfld      int32 HelloWorld.Result::Value
    IL_00db:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00e0:  nop
    IL_00e1:  call       !!0 HelloWorld.Program::Default<int32[]>()
    IL_00e6:  ldnull
    IL_00e7:  ceq
    IL_00e9:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_00ee:  nop
    IL_00ef:  ret
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
