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
.module HelloWorld.dll // GUID = {908BF00F-74D1-40E8-BCE7-DF5AB352C657}


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
	// Code size 27 (0x1b)
	.maxstack 2
	.locals init (
		int32	V_0,
		bool	V_1)
	IL_0000:  nop 
	IL_0001:  ldc.i4.0 
	IL_0002:  stloc.0 
	IL_0003:  br.s IL_0012

	IL_0005:  nop 
	IL_0006:  ldloc.0 
	IL_0007:  call void class [mscorlib]System.Console::WriteLine(int32)
	IL_000c:  nop 
	IL_000d:  ldloc.0 
	IL_000e:  ldc.i4.1 
	IL_000f:  add 
	IL_0010:  stloc.0 
	IL_0011:  nop 
	IL_0012:  ldloc.0 
	IL_0013:  ldc.i4.5 
	IL_0014:  clt 
	IL_0016:  stloc.1 
	IL_0017:  ldloc.1 
	IL_0018:  brtrue.s IL_0005

	IL_001a:  ret 
    } // end of method Program::Main

    // method line 2
    .method public hidebysig specialname rtspecialname 
           instance default void '.ctor' ()  cil managed 
    {
        // Method begins at RVA 0x2077
	// Code size 8 (0x8)
	.maxstack 8
	IL_0000:  ldarg.0 
	IL_0001:  call instance void object::'.ctor'()
	IL_0006:  nop 
	IL_0007:  ret 
    } // end of method Program::.ctor

  } // end of class HelloWorld.Program
}

