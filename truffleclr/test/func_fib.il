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
.module HelloWorld.dll // GUID = {F2211E4A-28C4-4FFD-8E8D-A51BC14E70DE}


.namespace HelloWorld
{
  .class private auto ansi beforefieldinit Program
  	extends [System.Runtime]System.Object
  {

    // method line 1
    .method private static hidebysig 
           default void Main (string[] args)  cil managed 
    {
        // Method begins at RVA 0x2050
	.entrypoint
	// Code size 57 (0x39)
	.maxstack 2
	.locals init (
		int32	V_0,
		bool	V_1)
	IL_0000:  nop 
	IL_0001:  ldc.i4.0 
	IL_0002:  stloc.0 
	IL_0003:  br.s IL_002c

	IL_0005:  nop 
	IL_0006:  ldloc.0 
	IL_0007:  call void class [mscorlib]System.Console::Write(int32)
	IL_000c:  nop 
	IL_000d:  ldstr " "
	IL_0012:  call void class [mscorlib]System.Console::Write(string)
	IL_0017:  nop 
	IL_0018:  ldloc.0 
	IL_0019:  ldc.i4.s 0x1e
	IL_001b:  rem 
	IL_001c:  call int32 class HelloWorld.Program::fib(int32)
	IL_0021:  call void class [mscorlib]System.Console::WriteLine(int32)
	IL_0026:  nop 
	IL_0027:  nop 
	IL_0028:  ldloc.0 
	IL_0029:  ldc.i4.1 
	IL_002a:  add 
	IL_002b:  stloc.0 
	IL_002c:  ldloc.0 
	IL_002d:  ldc.i4 1100
	IL_0032:  clt 
	IL_0034:  stloc.1 
	IL_0035:  ldloc.1 
	IL_0036:  brtrue.s IL_0005

	IL_0038:  ret 
    } // end of method Program::Main

    // method line 2
    .method private static hidebysig 
           default int32 fib (int32 n)  cil managed 
    {
        // Method begins at RVA 0x2098
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

    // method line 3
    .method public hidebysig specialname rtspecialname 
           instance default void '.ctor' ()  cil managed 
    {
        // Method begins at RVA 0x20d5
	// Code size 8 (0x8)
	.maxstack 8
	IL_0000:  ldarg.0 
	IL_0001:  call instance void object::'.ctor'()
	IL_0006:  nop 
	IL_0007:  ret 
    } // end of method Program::.ctor

  } // end of class HelloWorld.Program
}

