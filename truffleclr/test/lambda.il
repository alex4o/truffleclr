.assembly extern System.Runtime
{
  .ver 4:2:1:0
  .publickeytoken = (B0 3F 5F 7F 11 D5 0A 3A ) // .?_....:
}
.assembly extern System.Console
{
  .ver 4:1:1:0
  .publickeytoken = (B0 3F 5F 7F 11 D5 0A 3A ) // .?_....:
}
.assembly 'HelloWorld'
{
  .custom instance void class [mscorlib]System.Runtime.CompilerServices.CompilationRelaxationsAttribute::'.ctor'(int32) =  (01 00 08 00 00 00 00 00 ) // ........

  .custom instance void class [mscorlib]System.Runtime.CompilerServices.RuntimeCompatibilityAttribute::'.ctor'() =  (
		01 00 01 00 54 02 16 57 72 61 70 4E 6F 6E 45 78   // ....T..WrapNonEx
		63 65 70 74 69 6F 6E 54 68 72 6F 77 73 01       ) // ceptionThrows.

  .custom instance void class [mscorlib]System.Diagnostics.DebuggableAttribute::'.ctor'(valuetype [mscorlib]System.Diagnostics.DebuggableAttribute/DebuggingModes) =  (01 00 07 01 00 00 00 00 ) // ........

  .custom instance void class [mscorlib]System.Runtime.Versioning.TargetFrameworkAttribute::'.ctor'(string) =  (
		01 00 18 2E 4E 45 54 43 6F 72 65 41 70 70 2C 56   // ....NETCoreApp,V
		65 72 73 69 6F 6E 3D 76 32 2E 32 01 00 54 0E 14   // ersion=v2.2..T..
		46 72 61 6D 65 77 6F 72 6B 44 69 73 70 6C 61 79   // FrameworkDisplay
		4E 61 6D 65 00                                  ) // Name.

  .custom instance void class [mscorlib]System.Reflection.AssemblyCompanyAttribute::'.ctor'(string) =  (01 00 0A 48 65 6C 6C 6F 57 6F 72 6C 64 00 00 ) // ...HelloWorld..

  .custom instance void class [mscorlib]System.Reflection.AssemblyConfigurationAttribute::'.ctor'(string) =  (01 00 05 44 65 62 75 67 00 00 ) // ...Debug..

  .custom instance void class [mscorlib]System.Reflection.AssemblyFileVersionAttribute::'.ctor'(string) =  (01 00 07 31 2E 30 2E 30 2E 30 00 00 ) // ...1.0.0.0..

  .custom instance void class [mscorlib]System.Reflection.AssemblyInformationalVersionAttribute::'.ctor'(string) =  (01 00 05 31 2E 30 2E 30 00 00 ) // ...1.0.0..

  .custom instance void class [mscorlib]System.Reflection.AssemblyProductAttribute::'.ctor'(string) =  (01 00 0A 48 65 6C 6C 6F 57 6F 72 6C 64 00 00 ) // ...HelloWorld..

  .custom instance void class [mscorlib]System.Reflection.AssemblyTitleAttribute::'.ctor'(string) =  (01 00 0A 48 65 6C 6C 6F 57 6F 72 6C 64 00 00 ) // ...HelloWorld..

  .hash algorithm 0x00008004
  .ver  1:0:0:0
}
.module HelloWorld.dll // GUID = {A549B1A0-6C45-4E13-BE39-2328E772D101}


.namespace HelloWorld
{
  .class public auto ansi sealed testF
  	extends [System.Runtime]System.MulticastDelegate
  {

    // method line 1
    .method public hidebysig specialname rtspecialname 
           instance default void '.ctor' (object 'object', native int 'method')  runtime managed 
    {
        // Method begins at RVA 0x0
          // Disassembly of native methods is not supported
    } // end of method testF::.ctor

    // method line 2
    .method public virtual hidebysig newslot 
           instance default void Invoke ()  runtime managed 
    {
        // Method begins at RVA 0x0
          // Disassembly of native methods is not supported
    } // end of method testF::Invoke

    // method line 3
    .method public virtual hidebysig newslot 
           instance default class [mscorlib]System.IAsyncResult BeginInvoke (class [mscorlib]System.AsyncCallback callback, object 'object')  runtime managed 
    {
        // Method begins at RVA 0x0
          // Disassembly of native methods is not supported
    } // end of method testF::BeginInvoke

    // method line 4
    .method public virtual hidebysig newslot 
           instance default void EndInvoke (class [mscorlib]System.IAsyncResult result)  runtime managed 
    {
        // Method begins at RVA 0x0
          // Disassembly of native methods is not supported
    } // end of method testF::EndInvoke

  } // end of class HelloWorld.testF
}

.namespace HelloWorld
{
  .class private auto ansi beforefieldinit Program
  	extends [System.Runtime]System.Object
  {

    // method line 5
    .method private static hidebysig 
           default void Main (string[] args)  cil managed 
    {
        // Method begins at RVA 0x2050
	.entrypoint
	// Code size 115 (0x73)
	.maxstack 3
	.locals init (
		class HelloWorld.Program/'<>c__DisplayClass0_0'	V_0,
		class HelloWorld.testF	V_1,
		int32	V_2,
		bool	V_3)
	IL_0000:  nop 
	IL_0001:  newobj instance void class HelloWorld.Program/'<>c__DisplayClass0_0'::'.ctor'()
	IL_0006:  stloc.0 
	IL_0007:  ldloc.0 
	IL_0008:  ldc.i4.0 
	IL_0009:  stfld int32 HelloWorld.Program/'<>c__DisplayClass0_0'::i
	IL_000e:  br.s IL_0061

	IL_0010:  nop 
	IL_0011:  ldloc.0 
	IL_0012:  ldftn instance void class HelloWorld.Program/'<>c__DisplayClass0_0'::'<Main>b__0'()
	IL_0018:  newobj instance void class HelloWorld.testF::'.ctor'(object, native int)
	IL_001d:  stloc.1 
	IL_001e:  ldloc.0 
	IL_001f:  ldfld int32 HelloWorld.Program/'<>c__DisplayClass0_0'::i
	IL_0024:  call void class [mscorlib]System.Console::Write(int32)
	IL_0029:  nop 
	IL_002a:  ldstr " "
	IL_002f:  call void class [mscorlib]System.Console::Write(string)
	IL_0034:  nop 
	IL_0035:  ldloc.0 
	IL_0036:  ldfld int32 HelloWorld.Program/'<>c__DisplayClass0_0'::i
	IL_003b:  ldc.i4.s 0x1e
	IL_003d:  rem 
	IL_003e:  call int32 class HelloWorld.Program::fib(int32)
	IL_0043:  call void class [mscorlib]System.Console::WriteLine(int32)
	IL_0048:  nop 
	IL_0049:  ldloc.1 
	IL_004a:  callvirt instance void class HelloWorld.testF::Invoke()
	IL_004f:  nop 
	IL_0050:  nop 
	IL_0051:  ldloc.0 
	IL_0052:  ldfld int32 HelloWorld.Program/'<>c__DisplayClass0_0'::i
	IL_0057:  stloc.2 
	IL_0058:  ldloc.0 
	IL_0059:  ldloc.2 
	IL_005a:  ldc.i4.1 
	IL_005b:  add 
	IL_005c:  stfld int32 HelloWorld.Program/'<>c__DisplayClass0_0'::i
	IL_0061:  ldloc.0 
	IL_0062:  ldfld int32 HelloWorld.Program/'<>c__DisplayClass0_0'::i
	IL_0067:  ldc.i4 1100
	IL_006c:  clt 
	IL_006e:  stloc.3 
	IL_006f:  ldloc.3 
	IL_0070:  brtrue.s IL_0010

	IL_0072:  ret 
    } // end of method Program::Main

    // method line 6
    .method private static hidebysig 
           default int32 fib (int32 n)  cil managed 
    {
        // Method begins at RVA 0x20d0
	// Code size 49 (0x31)
	.maxstack 3
	.locals init (
		bool	V_0,
		int32	V_1,
		bool	V_2)
	IL_0000:  nop 
	IL_0001:  ldarg.0 
	IL_0002:  ldc.i4.0 
	IL_0003:  ceq 
	IL_0005:  stloc.0 
	IL_0006:  ldloc.0 
	IL_0007:  brfalse.s IL_000e

	IL_0009:  nop 
	IL_000a:  ldc.i4.0 
	IL_000b:  stloc.1 
	IL_000c:  br.s IL_002f

	IL_000e:  ldarg.0 
	IL_000f:  ldc.i4.1 
	IL_0010:  ceq 
	IL_0012:  stloc.2 
	IL_0013:  ldloc.2 
	IL_0014:  brfalse.s IL_001b

	IL_0016:  nop 
	IL_0017:  ldc.i4.1 
	IL_0018:  stloc.1 
	IL_0019:  br.s IL_002f

	IL_001b:  ldarg.0 
	IL_001c:  ldc.i4.1 
	IL_001d:  sub 
	IL_001e:  call int32 class HelloWorld.Program::fib(int32)
	IL_0023:  ldarg.0 
	IL_0024:  ldc.i4.2 
	IL_0025:  sub 
	IL_0026:  call int32 class HelloWorld.Program::fib(int32)
	IL_002b:  add 
	IL_002c:  stloc.1 
	IL_002d:  br.s IL_002f

	IL_002f:  ldloc.1 
	IL_0030:  ret 
    } // end of method Program::fib

    // method line 7
    .method public hidebysig specialname rtspecialname 
           instance default void '.ctor' ()  cil managed 
    {
        // Method begins at RVA 0x210d
	// Code size 8 (0x8)
	.maxstack 8
	IL_0000:  ldarg.0 
	IL_0001:  call instance void object::'.ctor'()
	IL_0006:  nop 
	IL_0007:  ret 
    } // end of method Program::.ctor

  .class nested private auto ansi sealed beforefieldinit '<>c__DisplayClass0_0'
  	extends [System.Runtime]System.Object
  {
    .custom instance void class [mscorlib]System.Runtime.CompilerServices.CompilerGeneratedAttribute::'.ctor'() =  (01 00 00 00 ) // ....

    .field  public  int32 i

    // method line 8
    .method public hidebysig specialname rtspecialname 
           instance default void '.ctor' ()  cil managed 
    {
        // Method begins at RVA 0x2116
	// Code size 8 (0x8)
	.maxstack 8
	IL_0000:  ldarg.0 
	IL_0001:  call instance void object::'.ctor'()
	IL_0006:  nop 
	IL_0007:  ret 
    } // end of method <>c__DisplayClass0_0::.ctor

    // method line 9
    .method assembly hidebysig 
           instance default void '<Main>b__0' ()  cil managed 
    {
        // Method begins at RVA 0x2120
	// Code size 29 (0x1d)
	.maxstack 3
	.locals init (
		int32	V_0)
	IL_0000:  nop 
	IL_0001:  ldarg.0 
	IL_0002:  ldfld int32 HelloWorld.Program/'<>c__DisplayClass0_0'::i
	IL_0007:  stloc.0 
	IL_0008:  ldarg.0 
	IL_0009:  ldloc.0 
	IL_000a:  ldc.i4.1 
	IL_000b:  add 
	IL_000c:  stfld int32 HelloWorld.Program/'<>c__DisplayClass0_0'::i
	IL_0011:  ldstr "Test"
	IL_0016:  call void class [mscorlib]System.Console::WriteLine(string)
	IL_001b:  nop 
	IL_001c:  ret 
    } // end of method <>c__DisplayClass0_0::<Main>b__0

  } // end of class <>c__DisplayClass0_0

  } // end of class HelloWorld.Program
}

