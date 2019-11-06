.assembly extern System.Runtime
{
  .ver 4:2:1:0
  .publickeytoken = (B0 3F 5F 7F 11 D5 0A 3A ) // .?_....:
}
.assembly extern System.Runtime.Extensions
{
  .ver 4:2:1:0
  .publickeytoken = (B0 3F 5F 7F 11 D5 0A 3A ) // .?_....:
}
.assembly 'test_dnc'
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

  .custom instance void class [mscorlib]System.Reflection.AssemblyCompanyAttribute::'.ctor'(string) =  (01 00 08 74 65 73 74 5F 64 6E 63 00 00 ) // ...test_dnc..

  .custom instance void class [mscorlib]System.Reflection.AssemblyConfigurationAttribute::'.ctor'(string) =  (01 00 05 44 65 62 75 67 00 00 ) // ...Debug..

  .custom instance void class [mscorlib]System.Reflection.AssemblyFileVersionAttribute::'.ctor'(string) =  (01 00 07 31 2E 30 2E 30 2E 30 00 00 ) // ...1.0.0.0..

  .custom instance void class [mscorlib]System.Reflection.AssemblyInformationalVersionAttribute::'.ctor'(string) =  (01 00 05 31 2E 30 2E 30 00 00 ) // ...1.0.0..

  .custom instance void class [mscorlib]System.Reflection.AssemblyProductAttribute::'.ctor'(string) =  (01 00 08 74 65 73 74 5F 64 6E 63 00 00 ) // ...test_dnc..

  .custom instance void class [mscorlib]System.Reflection.AssemblyTitleAttribute::'.ctor'(string) =  (01 00 08 74 65 73 74 5F 64 6E 63 00 00 ) // ...test_dnc..

  .permissionset reqmin = {[System.Runtime.Extensions]System.Security.Permissions.SecurityPermissionAttribute = {property bool 'SkipVerification' = bool(true)}}
  .hash algorithm 0x00008004
  .ver  1:0:0:0
}
.module test_dnc.dll // GUID = {C2D1D182-A085-4B55-91FB-EA04E43E9D66}

.custom instance void class [mscorlib]System.Security.UnverifiableCodeAttribute::'.ctor'() =  (01 00 00 00 ) // ....


  .class private auto ansi beforefieldinit A
  	extends [System.Runtime]System.Object
  {

    // method line 1
    .method public hidebysig
           instance default int32 sleep ()  cil managed
    {
        // Method begins at RVA 0x2050
	// Code size 7 (0x7)
	.maxstack 1
	.locals init (
		int32	V_0)
	IL_0000:  nop
	IL_0001:  ldc.i4.8
	IL_0002:  stloc.0
	IL_0003:  br.s IL_0005

	IL_0005:  ldloc.0
	IL_0006:  ret
    } // end of method A::sleep

    // method line 2
    .method public hidebysig specialname rtspecialname
           instance default void '.ctor' ()  cil managed
    {
        // Method begins at RVA 0x2063
	// Code size 8 (0x8)
	.maxstack 8
	IL_0000:  ldarg.0
	IL_0001:  call instance void object::'.ctor'()
	IL_0006:  nop
	IL_0007:  ret
    } // end of method A::.ctor

  } // end of class A

.namespace test_dnc
{
  .class private sequential ansi sealed beforefieldinit hello
  	extends [System.Runtime]System.ValueType
  {
    .field  public  int32 a
    .field  public  int32 b

  } // end of class test_dnc.hello
}

.namespace test_dnc
{
  .class private auto ansi beforefieldinit Program
  	extends [System.Runtime]System.Object
  {

    // method line 3
    .method private static hidebysig
           default void Main (string[] args)  cil managed
    {
        // Method begins at RVA 0x206c
	.entrypoint
	// Code size 15 (0xf)
	.maxstack 2
	.locals init (
		int32	V_0,
		int32	V_1)
	IL_0000:  nop
	IL_0001:  ldc.i4.1
	IL_0002:  stloc.0
	IL_0003:  ldc.i4.3
	IL_0004:  stloc.1
	IL_0005:  ldloc.0
	IL_0006:  ldloc.1
	IL_0007:  add
	IL_0008:  call void class java.lang.System::println(int32)
	IL_000d:  nop
	IL_000e:  ret
    } // end of method Program::Main

    // method line 4
    .method public hidebysig specialname rtspecialname
           instance default void '.ctor' ()  cil managed
    {
        // Method begins at RVA 0x2087
	// Code size 8 (0x8)
	.maxstack 8
	IL_0000:  ldarg.0
	IL_0001:  call instance void object::'.ctor'()
	IL_0006:  nop
	IL_0007:  ret
    } // end of method Program::.ctor

  } // end of class test_dnc.Program
}
