
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
// MVID: {8314a77d-6716-46eb-81e3-a6ca8c9de670}
.custom instance void [System.Runtime]System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 )
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x1051d8000


// =============== CLASS MEMBERS DECLARATION ===================

.class interface private abstract auto ansi beforefieldinit HelloWorld.I`1<T>
{
  .method public hidebysig newslot abstract virtual
          instance int32  M(!T 'value') cil managed
  {
  } // end of method I`1::M

} // end of class HelloWorld.I`1

.class private auto ansi beforefieldinit HelloWorld.B`1<T>
       extends [System.Runtime]System.Object
{
  .method public hidebysig newslot virtual
          instance int32  M(!T 'value') cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.1
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method B`1::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method B`1::.ctor

} // end of class HelloWorld.B`1

.class private auto ansi beforefieldinit HelloWorld.D
       extends class HelloWorld.B`1<int32>
       implements class HelloWorld.I`1<int32>
{
  .method public hidebysig virtual instance int32
          M(int32 'value') cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.2
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method D::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void class HelloWorld.B`1<int32>::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method D::.ctor

} // end of class HelloWorld.D

.class private auto ansi beforefieldinit HelloWorld.Combined
       extends class HelloWorld.B`1<int32>
       implements class HelloWorld.I`1<int32>
{
  .method public hidebysig virtual instance int32
          M(int32 'value') cil managed
  {
    // Interface MethodImpl preserves the ordinary reuse-slot class override.
    .override method instance int32 class HelloWorld.I`1<int32>::M(!0)
    // Code size       8 (0x8)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.s   11
    IL_0003:  stloc.0
    IL_0004:  br.s       IL_0006

    IL_0006:  ldloc.0
    IL_0007:  ret
  } // end of method Combined::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void class HelloWorld.B`1<int32>::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Combined::.ctor

} // end of class HelloWorld.Combined

.class private auto ansi beforefieldinit HelloWorld.Reimplemented
       extends HelloWorld.D
       implements class HelloWorld.I`1<int32>
{
  .method public hidebysig newslot virtual
          instance int32  M(int32 'value') cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.3
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method Reimplemented::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void HelloWorld.D::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Reimplemented::.ctor

} // end of class HelloWorld.Reimplemented

.class private auto ansi beforefieldinit HelloWorld.InheritedOverride
       extends HelloWorld.D
{
  .method public hidebysig virtual instance int32
          M(int32 'value') cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.4
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method InheritedOverride::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void HelloWorld.D::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method InheritedOverride::.ctor

} // end of class HelloWorld.InheritedOverride

.class private auto ansi beforefieldinit HelloWorld.PrivateShadow
       extends class HelloWorld.B`1<int32>
       implements class HelloWorld.I`1<int32>
{
  // Private virtual methods still cannot implicitly implement an interface.
  .method private hidebysig newslot virtual final instance int32
          M(int32 'value') cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.5
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method PrivateShadow::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void class HelloWorld.B`1<int32>::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method PrivateShadow::.ctor

} // end of class HelloWorld.PrivateShadow

.class private auto ansi beforefieldinit HelloWorld.Explicit
       extends class HelloWorld.B`1<int32>
       implements class HelloWorld.I`1<int32>
{
  .method private hidebysig newslot virtual final
          instance int32  'HelloWorld.I<System.Int32>.M'(int32 'value') cil managed
  {
    .override  method instance int32 class HelloWorld.I`1<int32>::M(!0)
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.6
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method Explicit::'HelloWorld.I<System.Int32>.M'

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void class HelloWorld.B`1<int32>::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Explicit::.ctor

} // end of class HelloWorld.Explicit

.class private auto ansi beforefieldinit HelloWorld.ReimplementedOverride
       extends HelloWorld.Reimplemented
{
  .method public hidebysig virtual instance int32
          M(int32 'value') cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.7
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method ReimplementedOverride::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void HelloWorld.Reimplemented::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method ReimplementedOverride::.ctor

} // end of class HelloWorld.ReimplementedOverride

.class private auto ansi beforefieldinit HelloWorld.Hidden
       extends HelloWorld.D
{
  .method public hidebysig newslot virtual
          instance int32  M(int32 'value') cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.8
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method Hidden::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void HelloWorld.D::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Hidden::.ctor

} // end of class HelloWorld.Hidden

.class private auto ansi beforefieldinit HelloWorld.HiddenOverride
       extends HelloWorld.Hidden
{
  .method public hidebysig virtual instance int32
          M(int32 'value') cil managed
  {
    // Code size       8 (0x8)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.s   9
    IL_0003:  stloc.0
    IL_0004:  br.s       IL_0006

    IL_0006:  ldloc.0
    IL_0007:  ret
  } // end of method HiddenOverride::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void HelloWorld.Hidden::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method HiddenOverride::.ctor

} // end of class HelloWorld.HiddenOverride

.class private auto ansi beforefieldinit HelloWorld.B`2<TA,TB>
       extends [System.Runtime]System.Object
{
  .method public hidebysig newslot virtual
          instance int32  M(!TA 'value') cil managed
  {
    // Code size       8 (0x8)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.s   10
    IL_0003:  stloc.0
    IL_0004:  br.s       IL_0006

    IL_0006:  ldloc.0
    IL_0007:  ret
  } // end of method B`2::M

  .method public hidebysig newslot virtual
          instance int32  M(!TB 'value') cil managed
  {
    // Code size       8 (0x8)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.s   20
    IL_0003:  stloc.0
    IL_0004:  br.s       IL_0006

    IL_0006:  ldloc.0
    IL_0007:  ret
  } // end of method B`2::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method B`2::.ctor

} // end of class HelloWorld.B`2

.class private auto ansi beforefieldinit HelloWorld.D`2<X,Y>
       extends class HelloWorld.B`2<!Y,!X>
{
  .method public hidebysig virtual instance int32
          M(!Y 'value') cil managed
  {
    // Code size       8 (0x8)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.s   30
    IL_0003:  stloc.0
    IL_0004:  br.s       IL_0006

    IL_0006:  ldloc.0
    IL_0007:  ret
  } // end of method D`2::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void class HelloWorld.B`2<!Y,!X>::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method D`2::.ctor

} // end of class HelloWorld.D`2

.class private auto ansi beforefieldinit HelloWorld.ExplicitSwapped`2<X,Y>
       extends class HelloWorld.B`2<!Y,!X>
{
  .method public hidebysig virtual instance int32
          M(!Y 'value') cil managed
  {
    // Explicit MethodImpl must not also overwrite the other closed-colliding slot.
    .override method instance int32 class HelloWorld.B`2<!Y,!X>::M(!0)
    // Code size       8 (0x8)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.s   40
    IL_0003:  stloc.0
    IL_0004:  br.s       IL_0006

    IL_0006:  ldloc.0
    IL_0007:  ret
  } // end of method ExplicitSwapped`2::M

  .method public hidebysig specialname rtspecialname
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void class HelloWorld.B`2<!Y,!X>::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method ExplicitSwapped`2::.ctor

} // end of class HelloWorld.ExplicitSwapped`2

.class interface private abstract auto ansi beforefieldinit HelloWorld.IValue`1<T>
{
  .method public hidebysig newslot abstract virtual
          instance !T  Get() cil managed
  {
  } // end of method IValue`1::Get

} // end of class HelloWorld.IValue`1

.class private auto ansi beforefieldinit HelloWorld.Named`1<U>
       extends [System.Runtime]System.Object
       implements class HelloWorld.IValue`1<!U>
{
  .field private !U 'value'
  .method public hidebysig specialname rtspecialname
          instance void  .ctor(!U 'value') cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      !0 class HelloWorld.Named`1<!U>::'value'
    IL_000f:  ret
  } // end of method Named`1::.ctor

  .method private hidebysig newslot virtual final
          instance !U  'HelloWorld.IValue<U>.Get'() cil managed
  {
    .override  method instance !T class HelloWorld.IValue`1<!U>::Get()
    // Code size       12 (0xc)
    .maxstack  1
    .locals init (!U V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      !0 class HelloWorld.Named`1<!U>::'value'
    IL_0007:  stloc.0
    IL_0008:  br.s       IL_000a

    IL_000a:  ldloc.0
    IL_000b:  ret
  } // end of method Named`1::'HelloWorld.IValue<U>.Get'

} // end of class HelloWorld.Named`1

.class private auto ansi beforefieldinit HelloWorld.Same`1<T>
       extends [System.Runtime]System.Object
       implements class HelloWorld.IValue`1<!T>
{
  .field private !T 'value'
  .method public hidebysig specialname rtspecialname
          instance void  .ctor(!T 'value') cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      !0 class HelloWorld.Same`1<!T>::'value'
    IL_000f:  ret
  } // end of method Same`1::.ctor

  .method private hidebysig newslot virtual final
          instance !T  'HelloWorld.IValue<T>.Get'() cil managed
  {
    .override  method instance !T class HelloWorld.IValue`1<!T>::Get()
    // Code size       12 (0xc)
    .maxstack  1
    .locals init (!T V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      !0 class HelloWorld.Same`1<!T>::'value'
    IL_0007:  stloc.0
    IL_0008:  br.s       IL_000a

    IL_000a:  ldloc.0
    IL_000b:  ret
  } // end of method Same`1::'HelloWorld.IValue<T>.Get'

} // end of class HelloWorld.Same`1

.class private auto ansi beforefieldinit HelloWorld.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static int32
          Call<T>(class HelloWorld.I`1<!!T> receiver,
                  !!T 'value') cil managed
  {
    // Code size       13 (0xd)
    .maxstack  2
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  callvirt   instance int32 class HelloWorld.I`1<!!T>::M(!0)
    IL_0008:  stloc.0
    IL_0009:  br.s       IL_000b

    IL_000b:  ldloc.0
    IL_000c:  ret
  } // end of method Program::Call

  .method private hidebysig static int32
          First<A,C>(class HelloWorld.B`2<!!A,!!C> receiver,
                     !!A 'value') cil managed
  {
    // Code size       13 (0xd)
    .maxstack  2
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  callvirt   instance int32 class HelloWorld.B`2<!!A,!!C>::M(!0)
    IL_0008:  stloc.0
    IL_0009:  br.s       IL_000b

    IL_000b:  ldloc.0
    IL_000c:  ret
  } // end of method Program::First

  .method private hidebysig static int32
          Second<A,C>(class HelloWorld.B`2<!!A,!!C> receiver,
                      !!C 'value') cil managed
  {
    // Code size       13 (0xd)
    .maxstack  2
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldarg.1
    IL_0003:  callvirt   instance int32 class HelloWorld.B`2<!!A,!!C>::M(!1)
    IL_0008:  stloc.0
    IL_0009:  br.s       IL_000b

    IL_000b:  ldloc.0
    IL_000c:  ret
  } // end of method Program::Second

  .method private hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       392 (0x188)
    .maxstack  2
    .locals init (class HelloWorld.D V_0,
             class HelloWorld.Reimplemented V_1,
             class HelloWorld.Explicit V_2,
             class HelloWorld.ReimplementedOverride V_3,
             class HelloWorld.HiddenOverride V_4,
             class HelloWorld.B`2<int32,int32> V_5,
             class HelloWorld.D`2<int32,int32> V_6,
             class HelloWorld.ExplicitSwapped`2<int32,int32> V_7,
             class HelloWorld.Combined V_8)
    IL_0000:  nop
    IL_0001:  newobj     instance void class HelloWorld.B`1<int32>::.ctor()
    IL_0006:  ldc.i4.0
    IL_0007:  callvirt   instance int32 class HelloWorld.B`1<int32>::M(!0)
    IL_000c:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0011:  nop
    IL_0012:  newobj     instance void HelloWorld.D::.ctor()
    IL_0017:  stloc.0
    IL_0018:  ldloc.0
    IL_0019:  ldc.i4.0
    IL_001a:  call       int32 HelloWorld.Program::Call<int32>(class HelloWorld.I`1<!!0>,
                                                               !!0)
    IL_001f:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0024:  nop
    IL_0025:  ldloc.0
    IL_0026:  ldc.i4.0
    IL_0027:  callvirt   instance int32 class HelloWorld.B`1<int32>::M(!0)
    IL_002c:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0031:  nop
    IL_0032:  newobj     instance void HelloWorld.Reimplemented::.ctor()
    IL_0037:  stloc.1
    IL_0038:  ldloc.1
    IL_0039:  ldc.i4.0
    IL_003a:  call       int32 HelloWorld.Program::Call<int32>(class HelloWorld.I`1<!!0>,
                                                               !!0)
    IL_003f:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0044:  nop
    IL_0045:  ldloc.1
    IL_0046:  ldc.i4.0
    IL_0047:  callvirt   instance int32 class HelloWorld.B`1<int32>::M(!0)
    IL_004c:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0051:  nop
    IL_0052:  newobj     instance void HelloWorld.InheritedOverride::.ctor()
    IL_0057:  ldc.i4.0
    IL_0058:  call       int32 HelloWorld.Program::Call<int32>(class HelloWorld.I`1<!!0>,
                                                               !!0)
    IL_005d:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0062:  nop
    IL_0063:  newobj     instance void HelloWorld.PrivateShadow::.ctor()
    IL_0068:  ldc.i4.0
    IL_0069:  call       int32 HelloWorld.Program::Call<int32>(class HelloWorld.I`1<!!0>,
                                                               !!0)
    IL_006e:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0073:  nop
    IL_0074:  newobj     instance void HelloWorld.Explicit::.ctor()
    IL_0079:  stloc.2
    IL_007a:  ldloc.2
    IL_007b:  ldc.i4.0
    IL_007c:  call       int32 HelloWorld.Program::Call<int32>(class HelloWorld.I`1<!!0>,
                                                               !!0)
    IL_0081:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0086:  nop
    IL_0087:  ldloc.2
    IL_0088:  ldc.i4.0
    IL_0089:  callvirt   instance int32 class HelloWorld.B`1<int32>::M(!0)
    IL_008e:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0093:  nop
    IL_0094:  newobj     instance void HelloWorld.ReimplementedOverride::.ctor()
    IL_0099:  stloc.3
    IL_009a:  ldloc.3
    IL_009b:  ldc.i4.0
    IL_009c:  call       int32 HelloWorld.Program::Call<int32>(class HelloWorld.I`1<!!0>,
                                                               !!0)
    IL_00a1:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00a6:  nop
    IL_00a7:  ldloc.3
    IL_00a8:  ldc.i4.0
    IL_00a9:  callvirt   instance int32 class HelloWorld.B`1<int32>::M(!0)
    IL_00ae:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00b3:  nop
    IL_00b4:  newobj     instance void HelloWorld.HiddenOverride::.ctor()
    IL_00b9:  stloc.s    V_4
    IL_00bb:  ldloc.s    V_4
    IL_00bd:  ldc.i4.0
    IL_00be:  call       int32 HelloWorld.Program::Call<int32>(class HelloWorld.I`1<!!0>,
                                                               !!0)
    IL_00c3:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00c8:  nop
    IL_00c9:  ldloc.s    V_4
    IL_00cb:  ldc.i4.0
    IL_00cc:  callvirt   instance int32 HelloWorld.Hidden::M(int32)
    IL_00d1:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00d6:  nop
    IL_00d7:  newobj     instance void class HelloWorld.B`2<int32,int32>::.ctor()
    IL_00dc:  stloc.s    V_5
    IL_00de:  ldloc.s    V_5
    IL_00e0:  ldc.i4.0
    IL_00e1:  call       int32 HelloWorld.Program::First<int32,int32>(class HelloWorld.B`2<!!0,!!1>,
                                                                      !!0)
    IL_00e6:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00eb:  nop
    IL_00ec:  ldloc.s    V_5
    IL_00ee:  ldc.i4.0
    IL_00ef:  call       int32 HelloWorld.Program::Second<int32,int32>(class HelloWorld.B`2<!!0,!!1>,
                                                                       !!1)
    IL_00f4:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_00f9:  nop
    IL_00fa:  newobj     instance void class HelloWorld.D`2<int32,int32>::.ctor()
    IL_00ff:  stloc.s    V_6
    IL_0101:  ldloc.s    V_6
    IL_0103:  ldc.i4.0
    IL_0104:  call       int32 HelloWorld.Program::First<int32,int32>(class HelloWorld.B`2<!!0,!!1>,
                                                                      !!0)
    IL_0109:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_010e:  nop
    IL_010f:  ldloc.s    V_6
    IL_0111:  ldc.i4.0
    IL_0112:  call       int32 HelloWorld.Program::Second<int32,int32>(class HelloWorld.B`2<!!0,!!1>,
                                                                       !!1)
    IL_0117:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_011c:  nop
    IL_011d:  newobj     instance void class HelloWorld.ExplicitSwapped`2<int32,int32>::.ctor()
    IL_0122:  stloc.s    V_7
    IL_0124:  ldloc.s    V_7
    IL_0126:  ldc.i4.0
    IL_0127:  call       int32 HelloWorld.Program::First<int32,int32>(class HelloWorld.B`2<!!0,!!1>,
                                                                      !!0)
    IL_012c:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0131:  nop
    IL_0132:  ldloc.s    V_7
    IL_0134:  ldc.i4.0
    IL_0135:  call       int32 HelloWorld.Program::Second<int32,int32>(class HelloWorld.B`2<!!0,!!1>,
                                                                       !!1)
    IL_013a:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_013f:  nop
    IL_0140:  ldc.i4.s   41
    IL_0142:  newobj     instance void class HelloWorld.Named`1<int32>::.ctor(!0)
    IL_0147:  callvirt   instance !0 class HelloWorld.IValue`1<int32>::Get()
    IL_014c:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0151:  nop
    IL_0152:  ldc.i4.s   42
    IL_0154:  newobj     instance void class HelloWorld.Same`1<int32>::.ctor(!0)
    IL_0159:  callvirt   instance !0 class HelloWorld.IValue`1<int32>::Get()
    IL_015e:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0163:  nop
    IL_0164:  newobj     instance void HelloWorld.Combined::.ctor()
    IL_0169:  stloc.s    V_8
    IL_016b:  ldloc.s    V_8
    IL_016d:  ldc.i4.0
    IL_016e:  callvirt   instance int32 class HelloWorld.B`1<int32>::M(!0)
    IL_0173:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0178:  nop
    IL_0179:  ldloc.s    V_8
    IL_017b:  ldc.i4.0
    IL_017c:  call       int32 HelloWorld.Program::Call<int32>(class HelloWorld.I`1<!!0>,
                                                               !!0)
    IL_0181:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0186:  nop
    IL_0187:  ret
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
