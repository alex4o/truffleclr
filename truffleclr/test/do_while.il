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
.module HelloWorld.dll // GUID = {0BBDD751-128F-4923-8B40-A0C4A3AC01DE}


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
	// Code size 46 (0x2e)
	.maxstack 2
	.locals init (
		int32	V_0,
		bool	V_1,
		bool	V_2)
	IL_0000:  nop 
	IL_0001:  ldc.i4.0 
	IL_0002:  stloc.0 
	IL_0003:  nop 
	IL_0004:  ldloc.0 
	IL_0005:  ldc.i4.3 
	IL_0006:  clt 
	IL_0008:  stloc.1 
	IL_0009:  ldloc.1 
	IL_000a:  brfalse.s IL_0017

	IL_000c:  nop 
	IL_000d:  ldloc.0 
	IL_000e:  call void class [mscorlib]System.Console::WriteLine(int32)
	IL_0013:  nop 
	IL_0014:  nop 
	IL_0015:  br.s IL_0020

	IL_0017:  nop 
	IL_0018:  ldloc.0 
	IL_0019:  call void class [mscorlib]System.Console::Write(int32)
	IL_001e:  nop 
	IL_001f:  nop 
	IL_0020:  ldloc.0 
	IL_0021:  ldc.i4.1 
	IL_0022:  add 
	IL_0023:  stloc.0 
	IL_0024:  nop 
	IL_0025:  ldloc.0 
	IL_0026:  ldc.i4.5 
	IL_0027:  clt 
	IL_0029:  stloc.2 
	IL_002a:  ldloc.2 
	IL_002b:  brtrue.s IL_0003

	IL_002d:  ret 
    } // end of method Program::Main

    // method line 2
    .method public hidebysig specialname rtspecialname 
           instance default void '.ctor' ()  cil managed 
    {
        // Method begins at RVA 0x208a
	// Code size 8 (0x8)
	.maxstack 8
	IL_0000:  ldarg.0 
	IL_0001:  call instance void object::'.ctor'()
	IL_0006:  nop 
	IL_0007:  ret 
    } // end of method Program::.ctor

  } // end of class HelloWorld.Program
}

