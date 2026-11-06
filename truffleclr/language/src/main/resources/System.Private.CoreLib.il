
//  .NET IL Disassembler.  Version 10.0.14




.mscorlib 

// Metadata version: 
.assembly System.Private.CoreLib
{
  .custom instance void System.Runtime.Versioning.TargetFrameworkAttribute::.ctor(string) = ( 01 00 19 2E 4E 45 54 53 74 61 6E 64 61 72 64 2C   // ....NETStandard,
                                                                                              56 65 72 73 69 6F 6E 3D 76 32 2E 30 01 00 54 0E   // Version=v2.0..T.
                                                                                              14 46 72 61 6D 65 77 6F 72 6B 44 69 73 70 6C 61   // .FrameworkDispla
                                                                                              79 4E 61 6D 65 11 2E 4E 45 54 20 53 74 61 6E 64   // yName..NET Stand
                                                                                              61 72 64 20 32 2E 30 )                            // ard 2.0
  .custom instance void System.Reflection.AssemblyCompanyAttribute::.ctor(string) = ( 01 00 16 53 79 73 74 65 6D 2E 50 72 69 76 61 74   // ...System.Privat
                                                                                      65 2E 43 6F 72 65 4C 69 62 00 00 )                // e.CoreLib..
  .custom instance void System.Reflection.AssemblyConfigurationAttribute::.ctor(string) = ( 01 00 05 44 65 62 75 67 00 00 )                   // ...Debug..
  .custom instance void System.Reflection.AssemblyFileVersionAttribute::.ctor(string) = ( 01 00 07 31 2E 30 2E 30 2E 30 00 00 )             // ...1.0.0.0..
  .custom instance void System.Reflection.AssemblyInformationalVersionAttribute::.ctor(string) = ( 01 00 2E 31 2E 30 2E 30 2B 66 36 35 33 62 37 39   // ...1.0.0+f653b79
                                                                                                   33 33 37 31 37 38 37 34 62 38 63 39 65 61 63 34   // 33717874b8c9eac4
                                                                                                   66 35 31 37 64 31 36 66 35 31 66 31 38 37 63 31   // f517d16f51f187c1
                                                                                                   66 00 00 )                                        // f..
  .custom instance void System.Reflection.AssemblyProductAttribute::.ctor(string) = ( 01 00 16 53 79 73 74 65 6D 2E 50 72 69 76 61 74   // ...System.Privat
                                                                                      65 2E 43 6F 72 65 4C 69 62 00 00 )                // e.CoreLib..
  .custom instance void System.Reflection.AssemblyTitleAttribute::.ctor(string) = ( 01 00 16 53 79 73 74 65 6D 2E 50 72 69 76 61 74   // ...System.Privat
                                                                                    65 2E 43 6F 72 65 4C 69 62 00 00 )                // e.CoreLib..
  .hash algorithm 0x00008004
  .ver 1:0:0:0
}
.module System.Private.CoreLib.dll
// MVID: {c18620d2-59f0-4e78-80da-0732a42af703}
.custom instance void System.Runtime.CompilerServices.RefSafetyRulesAttribute::.ctor(int32) = ( 01 00 0B 00 00 00 00 00 ) 
.imagebase 0x10000000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY
// Image base: 0x0x10052c000


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi sealed beforefieldinit Microsoft.CodeAnalysis.EmbeddedAttribute
       extends System.Attribute
{
  .custom instance void Microsoft.CodeAnalysis.EmbeddedAttribute::.ctor() = ( 01 00 00 00 ) 
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method EmbeddedAttribute::.ctor

} // end of class Microsoft.CodeAnalysis.EmbeddedAttribute

.class private auto ansi sealed beforefieldinit System.Runtime.CompilerServices.IsReadOnlyAttribute
       extends System.Attribute
{
  .custom instance void Microsoft.CodeAnalysis.EmbeddedAttribute::.ctor() = ( 01 00 00 00 ) 
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method IsReadOnlyAttribute::.ctor

} // end of class System.Runtime.CompilerServices.IsReadOnlyAttribute

.class private auto ansi sealed beforefieldinit System.Runtime.CompilerServices.NullableAttribute
       extends System.Attribute
{
  .custom instance void Microsoft.CodeAnalysis.EmbeddedAttribute::.ctor() = ( 01 00 00 00 ) 
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 84 6B 00 00 02 00 54 02 0D 41 6C 6C 6F 77   // ...k....T..Allow
                                                                                                     4D 75 6C 74 69 70 6C 65 00 54 02 09 49 6E 68 65   // Multiple.T..Inhe
                                                                                                     72 69 74 65 64 00 )                               // rited.
  .field public initonly uint8[] NullableFlags
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(uint8 A_1) cil managed
  {
    // Code size       24 (0x18)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  ldarg.0
    IL_0008:  ldc.i4.1
    IL_0009:  newarr     System.Byte
    IL_000e:  dup
    IL_000f:  ldc.i4.0
    IL_0010:  ldarg.1
    IL_0011:  stelem.i1
    IL_0012:  stfld      uint8[] System.Runtime.CompilerServices.NullableAttribute::NullableFlags
    IL_0017:  ret
  } // end of method NullableAttribute::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(uint8[] A_1) cil managed
  {
    // Code size       15 (0xf)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  ldarg.0
    IL_0008:  ldarg.1
    IL_0009:  stfld      uint8[] System.Runtime.CompilerServices.NullableAttribute::NullableFlags
    IL_000e:  ret
  } // end of method NullableAttribute::.ctor

} // end of class System.Runtime.CompilerServices.NullableAttribute

.class private auto ansi sealed beforefieldinit System.Runtime.CompilerServices.NullableContextAttribute
       extends System.Attribute
{
  .custom instance void Microsoft.CodeAnalysis.EmbeddedAttribute::.ctor() = ( 01 00 00 00 ) 
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 4C 14 00 00 02 00 54 02 0D 41 6C 6C 6F 77   // ..L.....T..Allow
                                                                                                     4D 75 6C 74 69 70 6C 65 00 54 02 09 49 6E 68 65   // Multiple.T..Inhe
                                                                                                     72 69 74 65 64 00 )                               // rited.
  .field public initonly uint8 Flag
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(uint8 A_1) cil managed
  {
    // Code size       15 (0xf)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  ldarg.0
    IL_0008:  ldarg.1
    IL_0009:  stfld      uint8 System.Runtime.CompilerServices.NullableContextAttribute::Flag
    IL_000e:  ret
  } // end of method NullableContextAttribute::.ctor

} // end of class System.Runtime.CompilerServices.NullableContextAttribute

.class private auto ansi sealed beforefieldinit System.Runtime.CompilerServices.RefSafetyRulesAttribute
       extends System.Attribute
{
  .custom instance void Microsoft.CodeAnalysis.EmbeddedAttribute::.ctor() = ( 01 00 00 00 ) 
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 02 00 00 00 02 00 54 02 0D 41 6C 6C 6F 77   // ........T..Allow
                                                                                                     4D 75 6C 74 69 70 6C 65 00 54 02 09 49 6E 68 65   // Multiple.T..Inhe
                                                                                                     72 69 74 65 64 00 )                               // rited.
  .field public initonly int32 Version
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(int32 A_1) cil managed
  {
    // Code size       15 (0xf)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  ldarg.0
    IL_0008:  ldarg.1
    IL_0009:  stfld      int32 System.Runtime.CompilerServices.RefSafetyRulesAttribute::Version
    IL_000e:  ret
  } // end of method RefSafetyRulesAttribute::.ctor

} // end of class System.Runtime.CompilerServices.RefSafetyRulesAttribute

.class public abstract auto ansi beforefieldinit System.Array
       extends System.Object
{
  .field static assembly literal int32 MaxArrayLength = int32(0x7FEFFFFF)
  .field static assembly literal int32 MaxByteArrayLength = int32(0x7FFFFFC7)
  .method famandassem hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       9 (0x9)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ret
  } // end of method Array::.ctor

} // end of class System.Array

.class public auto ansi sealed System.AttributeTargets
       extends System.Enum
{
  .custom instance void System.FlagsAttribute::.ctor() = ( 01 00 00 00 ) 
  .field public specialname rtspecialname int32 value__
  .field public static literal valuetype System.AttributeTargets Assembly = int32(0x00000001)
  .field public static literal valuetype System.AttributeTargets Module = int32(0x00000002)
  .field public static literal valuetype System.AttributeTargets Class = int32(0x00000004)
  .field public static literal valuetype System.AttributeTargets Struct = int32(0x00000008)
  .field public static literal valuetype System.AttributeTargets Enum = int32(0x00000010)
  .field public static literal valuetype System.AttributeTargets Constructor = int32(0x00000020)
  .field public static literal valuetype System.AttributeTargets Method = int32(0x00000040)
  .field public static literal valuetype System.AttributeTargets Property = int32(0x00000080)
  .field public static literal valuetype System.AttributeTargets Field = int32(0x00000100)
  .field public static literal valuetype System.AttributeTargets Event = int32(0x00000200)
  .field public static literal valuetype System.AttributeTargets Interface = int32(0x00000400)
  .field public static literal valuetype System.AttributeTargets Parameter = int32(0x00000800)
  .field public static literal valuetype System.AttributeTargets Delegate = int32(0x00001000)
  .field public static literal valuetype System.AttributeTargets ReturnValue = int32(0x00002000)
  .field public static literal valuetype System.AttributeTargets GenericParameter = int32(0x00004000)
  .field public static literal valuetype System.AttributeTargets All = int32(0x00007FFF)
} // end of class System.AttributeTargets

.class public auto ansi sealed beforefieldinit System.AttributeUsageAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 04 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 01 )                                  // ited.
  .field private initonly valuetype System.AttributeTargets _attributeTarget
  .field private bool _allowMultiple
  .field private bool _inherited
  .field static assembly initonly class System.AttributeUsageAttribute Default
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(valuetype System.AttributeTargets validOn) cil managed
  {
    // Code size       23 (0x17)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      valuetype System.AttributeTargets System.AttributeUsageAttribute::_attributeTarget
    IL_000f:  ldarg.0
    IL_0010:  ldc.i4.1
    IL_0011:  stfld      bool System.AttributeUsageAttribute::_inherited
    IL_0016:  ret
  } // end of method AttributeUsageAttribute::.ctor

  .method assembly hidebysig specialname rtspecialname 
          instance void  .ctor(valuetype System.AttributeTargets validOn,
                               bool allowMultiple,
                               bool inherited) cil managed
  {
    // Code size       30 (0x1e)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      valuetype System.AttributeTargets System.AttributeUsageAttribute::_attributeTarget
    IL_000f:  ldarg.0
    IL_0010:  ldarg.2
    IL_0011:  stfld      bool System.AttributeUsageAttribute::_allowMultiple
    IL_0016:  ldarg.0
    IL_0017:  ldarg.3
    IL_0018:  stfld      bool System.AttributeUsageAttribute::_inherited
    IL_001d:  ret
  } // end of method AttributeUsageAttribute::.ctor

  .method public hidebysig specialname instance valuetype System.AttributeTargets 
          get_ValidOn() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      valuetype System.AttributeTargets System.AttributeUsageAttribute::_attributeTarget
    IL_0006:  ret
  } // end of method AttributeUsageAttribute::get_ValidOn

  .method public hidebysig specialname instance bool 
          get_AllowMultiple() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      bool System.AttributeUsageAttribute::_allowMultiple
    IL_0006:  ret
  } // end of method AttributeUsageAttribute::get_AllowMultiple

  .method public hidebysig specialname instance void 
          set_AllowMultiple(bool 'value') cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  stfld      bool System.AttributeUsageAttribute::_allowMultiple
    IL_0007:  ret
  } // end of method AttributeUsageAttribute::set_AllowMultiple

  .method public hidebysig specialname instance bool 
          get_Inherited() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      bool System.AttributeUsageAttribute::_inherited
    IL_0006:  ret
  } // end of method AttributeUsageAttribute::get_Inherited

  .method public hidebysig specialname instance void 
          set_Inherited(bool 'value') cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  stfld      bool System.AttributeUsageAttribute::_inherited
    IL_0007:  ret
  } // end of method AttributeUsageAttribute::set_Inherited

  .method private hidebysig specialname rtspecialname static 
          void  .cctor() cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldc.i4     0x7fff
    IL_0005:  newobj     instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets)
    IL_000a:  stsfld     class System.AttributeUsageAttribute System.AttributeUsageAttribute::Default
    IL_000f:  ret
  } // end of method AttributeUsageAttribute::.cctor

  .property instance callconv(8) valuetype System.AttributeTargets
          ValidOn()
  {
    .get instance valuetype System.AttributeTargets System.AttributeUsageAttribute::get_ValidOn()
  } // end of property AttributeUsageAttribute::ValidOn
  .property instance callconv(8) bool AllowMultiple()
  {
    .get instance bool System.AttributeUsageAttribute::get_AllowMultiple()
    .set instance void System.AttributeUsageAttribute::set_AllowMultiple(bool)
  } // end of property AttributeUsageAttribute::AllowMultiple
  .property instance callconv(8) bool Inherited()
  {
    .get instance bool System.AttributeUsageAttribute::get_Inherited()
    .set instance void System.AttributeUsageAttribute::set_Inherited(bool)
  } // end of property AttributeUsageAttribute::Inherited
} // end of class System.AttributeUsageAttribute

.class public sequential ansi sealed beforefieldinit System.Boolean
       extends System.ValueType
{
  .custom instance void System.Runtime.CompilerServices.IsReadOnlyAttribute::.ctor() = ( 01 00 00 00 ) 
  .field private initonly bool m_value
  .field static assembly literal int32 True = int32(0x00000001)
  .field static assembly literal int32 False = int32(0x00000000)
  .field static assembly literal string TrueLiteral = "True"
  .field static assembly literal string FalseLiteral = "False"
  .field public static initonly string TrueString
  .field public static initonly string FalseString
  .method public hidebysig virtual instance int32 
          GetHashCode() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldind.u1
    IL_0003:  brtrue.s   IL_0008

    IL_0005:  ldc.i4.0
    IL_0006:  br.s       IL_0009

    IL_0008:  ldc.i4.1
    IL_0009:  stloc.0
    IL_000a:  br.s       IL_000c

    IL_000c:  ldloc.0
    IL_000d:  ret
  } // end of method Boolean::GetHashCode

  .method public hidebysig virtual instance string 
          ToString() cil managed
  {
    // Code size       29 (0x1d)
    .maxstack  2
    .locals init (bool V_0,
             string V_1)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldind.u1
    IL_0003:  ldc.i4.0
    IL_0004:  ceq
    IL_0006:  stloc.0
    IL_0007:  ldloc.0
    IL_0008:  brfalse.s  IL_0013

    IL_000a:  nop
    IL_000b:  ldstr      "False"
    IL_0010:  stloc.1
    IL_0011:  br.s       IL_001b

    IL_0013:  ldstr      "True"
    IL_0018:  stloc.1
    IL_0019:  br.s       IL_001b

    IL_001b:  ldloc.1
    IL_001c:  ret
  } // end of method Boolean::ToString

  .method private hidebysig specialname rtspecialname static 
          void  .cctor() cil managed
  {
    // Code size       21 (0x15)
    .maxstack  8
    IL_0000:  ldstr      "True"
    IL_0005:  stsfld     string System.Boolean::TrueString
    IL_000a:  ldstr      "False"
    IL_000f:  stsfld     string System.Boolean::FalseString
    IL_0014:  ret
  } // end of method Boolean::.cctor

} // end of class System.Boolean

.class public sequential ansi sealed beforefieldinit System.Byte
       extends System.ValueType
{
  .custom instance void System.Runtime.CompilerServices.NullableContextAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
  .custom instance void System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 00 00 00 ) 
  .custom instance void System.Runtime.CompilerServices.IsReadOnlyAttribute::.ctor() = ( 01 00 00 00 ) 
  .field private initonly uint8 m_value
  .field public static literal uint8 MaxValue = uint8(0xFF)
  .field public static literal uint8 MinValue = uint8(0x00)
  .method public hidebysig instance int32 
          CompareTo(object 'value') cil managed
  {
    // Code size       46 (0x2e)
    .maxstack  2
    .locals init (bool V_0,
             int32 V_1,
             bool V_2)
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  ldnull
    IL_0003:  ceq
    IL_0005:  stloc.0
    IL_0006:  ldloc.0
    IL_0007:  brfalse.s  IL_000e

    IL_0009:  nop
    IL_000a:  ldc.i4.1
    IL_000b:  stloc.1
    IL_000c:  br.s       IL_002c

    IL_000e:  ldarg.1
    IL_000f:  isinst     System.Byte
    IL_0014:  ldnull
    IL_0015:  cgt.un
    IL_0017:  ldc.i4.0
    IL_0018:  ceq
    IL_001a:  stloc.2
    IL_001b:  ldloc.2
    IL_001c:  brfalse.s  IL_0020

    IL_001e:  nop
    IL_001f:  nop
    IL_0020:  ldarg.0
    IL_0021:  ldind.u1
    IL_0022:  ldarg.1
    IL_0023:  unbox.any  System.Byte
    IL_0028:  sub
    IL_0029:  stloc.1
    IL_002a:  br.s       IL_002c

    IL_002c:  ldloc.1
    IL_002d:  ret
  } // end of method Byte::CompareTo

  .method public hidebysig instance int32 
          CompareTo(uint8 'value') cil managed
  {
    // Code size       10 (0xa)
    .maxstack  2
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldind.u1
    IL_0003:  ldarg.1
    IL_0004:  sub
    IL_0005:  stloc.0
    IL_0006:  br.s       IL_0008

    IL_0008:  ldloc.0
    IL_0009:  ret
  } // end of method Byte::CompareTo

  .method public hidebysig virtual instance bool 
          Equals(object obj) cil managed
  {
    // Code size       37 (0x25)
    .maxstack  2
    .locals init (bool V_0,
             bool V_1)
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  isinst     System.Byte
    IL_0007:  ldnull
    IL_0008:  cgt.un
    IL_000a:  ldc.i4.0
    IL_000b:  ceq
    IL_000d:  stloc.0
    IL_000e:  ldloc.0
    IL_000f:  brfalse.s  IL_0016

    IL_0011:  nop
    IL_0012:  ldc.i4.0
    IL_0013:  stloc.1
    IL_0014:  br.s       IL_0023

    IL_0016:  ldarg.0
    IL_0017:  ldind.u1
    IL_0018:  ldarg.1
    IL_0019:  unbox.any  System.Byte
    IL_001e:  ceq
    IL_0020:  stloc.1
    IL_0021:  br.s       IL_0023

    IL_0023:  ldloc.1
    IL_0024:  ret
  } // end of method Byte::Equals

  .method public hidebysig instance bool 
          Equals(uint8 obj) cil managed
  {
    .custom instance void System.Runtime.Versioning.NonVersionableAttribute::.ctor() = ( 01 00 00 00 ) 
    // Code size       11 (0xb)
    .maxstack  2
    .locals init (bool V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldind.u1
    IL_0003:  ldarg.1
    IL_0004:  ceq
    IL_0006:  stloc.0
    IL_0007:  br.s       IL_0009

    IL_0009:  ldloc.0
    IL_000a:  ret
  } // end of method Byte::Equals

  .method public hidebysig virtual instance int32 
          GetHashCode() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldind.u1
    IL_0003:  stloc.0
    IL_0004:  br.s       IL_0006

    IL_0006:  ldloc.0
    IL_0007:  ret
  } // end of method Byte::GetHashCode

} // end of class System.Byte

.class public sequential ansi sealed beforefieldinit System.Char
       extends System.ValueType
{
  .custom instance void System.Runtime.CompilerServices.IsReadOnlyAttribute::.ctor() = ( 01 00 00 00 ) 
  .field private initonly char m_value
  .field public static literal char MaxValue = char(0xFFFF)
  .field public static literal char MinValue = char(0x0000)
  .field private static literal uint8 IsWhiteSpaceFlag = uint8(0x80)
  .field private static literal uint8 IsUpperCaseLetterFlag = uint8(0x40)
  .field private static literal uint8 IsLowerCaseLetterFlag = uint8(0x20)
  .field private static literal uint8 UnicodeCategoryMask = uint8(0x1F)
  .method private hidebysig static bool  IsAscii(char ch) cil managed
  {
    // Code size       14 (0xe)
    .maxstack  2
    .locals init (bool V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldc.i4.s   127
    IL_0004:  cgt.un
    IL_0006:  ldc.i4.0
    IL_0007:  ceq
    IL_0009:  stloc.0
    IL_000a:  br.s       IL_000c

    IL_000c:  ldloc.0
    IL_000d:  ret
  } // end of method Char::IsAscii

  .method public hidebysig virtual instance int32 
          GetHashCode() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  3
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldind.u2
    IL_0003:  ldarg.0
    IL_0004:  ldind.u2
    IL_0005:  ldc.i4.s   16
    IL_0007:  shl
    IL_0008:  or
    IL_0009:  stloc.0
    IL_000a:  br.s       IL_000c

    IL_000c:  ldloc.0
    IL_000d:  ret
  } // end of method Char::GetHashCode

  .method public hidebysig virtual instance bool 
          Equals(object obj) cil managed
  {
    .custom instance void System.Runtime.CompilerServices.NullableContextAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
    // Code size       37 (0x25)
    .maxstack  2
    .locals init (bool V_0,
             bool V_1)
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  isinst     System.Char
    IL_0007:  ldnull
    IL_0008:  cgt.un
    IL_000a:  ldc.i4.0
    IL_000b:  ceq
    IL_000d:  stloc.0
    IL_000e:  ldloc.0
    IL_000f:  brfalse.s  IL_0016

    IL_0011:  nop
    IL_0012:  ldc.i4.0
    IL_0013:  stloc.1
    IL_0014:  br.s       IL_0023

    IL_0016:  ldarg.0
    IL_0017:  ldind.u2
    IL_0018:  ldarg.1
    IL_0019:  unbox.any  System.Char
    IL_001e:  ceq
    IL_0020:  stloc.1
    IL_0021:  br.s       IL_0023

    IL_0023:  ldloc.1
    IL_0024:  ret
  } // end of method Char::Equals

  .method public hidebysig instance bool 
          Equals(char obj) cil managed
  {
    .custom instance void System.Runtime.Versioning.NonVersionableAttribute::.ctor() = ( 01 00 00 00 ) 
    // Code size       11 (0xb)
    .maxstack  2
    .locals init (bool V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldind.u2
    IL_0003:  ldarg.1
    IL_0004:  ceq
    IL_0006:  stloc.0
    IL_0007:  br.s       IL_0009

    IL_0009:  ldloc.0
    IL_000a:  ret
  } // end of method Char::Equals

  .method public hidebysig instance int32 
          CompareTo(char 'value') cil managed
  {
    // Code size       10 (0xa)
    .maxstack  2
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldind.u2
    IL_0003:  ldarg.1
    IL_0004:  sub
    IL_0005:  stloc.0
    IL_0006:  br.s       IL_0008

    IL_0008:  ldloc.0
    IL_0009:  ret
  } // end of method Char::CompareTo

  .method assembly hidebysig static bool 
          IsInRange(char c,
                    char min,
                    char max) cil managed
  {
    // Code size       12 (0xc)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  sub
    IL_0003:  ldarg.2
    IL_0004:  ldarg.1
    IL_0005:  sub
    IL_0006:  cgt.un
    IL_0008:  ldc.i4.0
    IL_0009:  ceq
    IL_000b:  ret
  } // end of method Char::IsInRange

} // end of class System.Char

.class public sequential ansi sealed beforefieldinit System.Double
       extends System.ValueType
{
  .custom instance void System.Runtime.CompilerServices.IsReadOnlyAttribute::.ctor() = ( 01 00 00 00 ) 
  .field private initonly float64 m_value
} // end of class System.Double

.class public abstract auto ansi beforefieldinit System.Enum
       extends System.ValueType
{
  .method family hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.ValueType::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Enum::.ctor

} // end of class System.Enum

.class public auto ansi beforefieldinit System.Exception
       extends System.Object
{
  .field private string _message
  .field private class System.Exception _innerException
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldstr      "Exception of type 'System.Exception' was thrown."
    IL_0006:  call       instance void System.Exception::.ctor(string)
    IL_000b:  nop
    IL_000c:  nop
    IL_000d:  ret
  } // end of method Exception::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Exception::_message
    IL_000f:  ret
  } // end of method Exception::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message,
                               class System.Exception innerException) cil managed
  {
    // Code size       17 (0x11)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void System.Exception::.ctor(string)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ldarg.0
    IL_000a:  ldarg.2
    IL_000b:  stfld      class System.Exception System.Exception::_innerException
    IL_0010:  ret
  } // end of method Exception::.ctor

  .method public hidebysig newslot specialname virtual 
          instance string  get_Message() cil managed
  {
    // Code size       12 (0xc)
    .maxstack  1
    .locals init (string V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      string System.Exception::_message
    IL_0007:  stloc.0
    IL_0008:  br.s       IL_000a

    IL_000a:  ldloc.0
    IL_000b:  ret
  } // end of method Exception::get_Message

  .method public hidebysig specialname instance class System.Exception 
          get_InnerException() cil managed
  {
    // Code size       12 (0xc)
    .maxstack  1
    .locals init (class System.Exception V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      class System.Exception System.Exception::_innerException
    IL_0007:  stloc.0
    IL_0008:  br.s       IL_000a

    IL_000a:  ldloc.0
    IL_000b:  ret
  } // end of method Exception::get_InnerException

  .method public hidebysig virtual instance string 
          ToString() cil managed
  {
    // Code size       12 (0xc)
    .maxstack  1
    .locals init (string V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  callvirt   instance string System.Exception::get_Message()
    IL_0007:  stloc.0
    IL_0008:  br.s       IL_000a

    IL_000a:  ldloc.0
    IL_000b:  ret
  } // end of method Exception::ToString

  .property instance callconv(8) string Message()
  {
    .get instance string System.Exception::get_Message()
  } // end of property Exception::Message
  .property instance callconv(8) class System.Exception
          InnerException()
  {
    .get instance class System.Exception System.Exception::get_InnerException()
  } // end of property Exception::InnerException
} // end of class System.Exception

.class public auto ansi beforefieldinit System.SystemException
       extends System.Exception
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldstr      "Exception of type 'System.SystemException' was thr"
    + "own."
    IL_0006:  call       instance void System.Exception::.ctor(string)
    IL_000b:  nop
    IL_000c:  nop
    IL_000d:  ret
  } // end of method SystemException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message) cil managed
  {
    // Code size       10 (0xa)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void System.Exception::.ctor(string)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ret
  } // end of method SystemException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message,
                               class System.Exception innerException) cil managed
  {
    // Code size       11 (0xb)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  ldarg.2
    IL_0003:  call       instance void System.Exception::.ctor(string,
                                                               class System.Exception)
    IL_0008:  nop
    IL_0009:  nop
    IL_000a:  ret
  } // end of method SystemException::.ctor

} // end of class System.SystemException

.class public auto ansi beforefieldinit System.ArithmeticException
       extends System.SystemException
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldstr      "Exception of type 'System.ArithmeticException' was"
    + " thrown."
    IL_0006:  call       instance void System.SystemException::.ctor(string)
    IL_000b:  nop
    IL_000c:  nop
    IL_000d:  ret
  } // end of method ArithmeticException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message) cil managed
  {
    // Code size       10 (0xa)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void System.SystemException::.ctor(string)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ret
  } // end of method ArithmeticException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message,
                               class System.Exception innerException) cil managed
  {
    // Code size       11 (0xb)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  ldarg.2
    IL_0003:  call       instance void System.SystemException::.ctor(string,
                                                                     class System.Exception)
    IL_0008:  nop
    IL_0009:  nop
    IL_000a:  ret
  } // end of method ArithmeticException::.ctor

} // end of class System.ArithmeticException

.class public auto ansi beforefieldinit System.DivideByZeroException
       extends System.ArithmeticException
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldstr      "Exception of type 'System.DivideByZeroException' w"
    + "as thrown."
    IL_0006:  call       instance void System.ArithmeticException::.ctor(string)
    IL_000b:  nop
    IL_000c:  nop
    IL_000d:  ret
  } // end of method DivideByZeroException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message) cil managed
  {
    // Code size       10 (0xa)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void System.ArithmeticException::.ctor(string)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ret
  } // end of method DivideByZeroException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message,
                               class System.Exception innerException) cil managed
  {
    // Code size       11 (0xb)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  ldarg.2
    IL_0003:  call       instance void System.ArithmeticException::.ctor(string,
                                                                         class System.Exception)
    IL_0008:  nop
    IL_0009:  nop
    IL_000a:  ret
  } // end of method DivideByZeroException::.ctor

} // end of class System.DivideByZeroException

.class public auto ansi beforefieldinit System.NullReferenceException
       extends System.SystemException
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldstr      "Exception of type 'System.NullReferenceException' "
    + "was thrown."
    IL_0006:  call       instance void System.SystemException::.ctor(string)
    IL_000b:  nop
    IL_000c:  nop
    IL_000d:  ret
  } // end of method NullReferenceException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message) cil managed
  {
    // Code size       10 (0xa)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void System.SystemException::.ctor(string)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ret
  } // end of method NullReferenceException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message,
                               class System.Exception innerException) cil managed
  {
    // Code size       11 (0xb)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  ldarg.2
    IL_0003:  call       instance void System.SystemException::.ctor(string,
                                                                     class System.Exception)
    IL_0008:  nop
    IL_0009:  nop
    IL_000a:  ret
  } // end of method NullReferenceException::.ctor

} // end of class System.NullReferenceException

.class public auto ansi beforefieldinit System.IndexOutOfRangeException
       extends System.SystemException
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldstr      "Exception of type 'System.IndexOutOfRangeException"
    + "' was thrown."
    IL_0006:  call       instance void System.SystemException::.ctor(string)
    IL_000b:  nop
    IL_000c:  nop
    IL_000d:  ret
  } // end of method IndexOutOfRangeException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message) cil managed
  {
    // Code size       10 (0xa)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void System.SystemException::.ctor(string)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ret
  } // end of method IndexOutOfRangeException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message,
                               class System.Exception innerException) cil managed
  {
    // Code size       11 (0xb)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  ldarg.2
    IL_0003:  call       instance void System.SystemException::.ctor(string,
                                                                     class System.Exception)
    IL_0008:  nop
    IL_0009:  nop
    IL_000a:  ret
  } // end of method IndexOutOfRangeException::.ctor

} // end of class System.IndexOutOfRangeException

.class public auto ansi beforefieldinit System.InvalidCastException
       extends System.SystemException
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldstr      "Exception of type 'System.InvalidCastException' wa"
    + "s thrown."
    IL_0006:  call       instance void System.SystemException::.ctor(string)
    IL_000b:  nop
    IL_000c:  nop
    IL_000d:  ret
  } // end of method InvalidCastException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message) cil managed
  {
    // Code size       10 (0xa)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void System.SystemException::.ctor(string)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ret
  } // end of method InvalidCastException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message,
                               class System.Exception innerException) cil managed
  {
    // Code size       11 (0xb)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  ldarg.2
    IL_0003:  call       instance void System.SystemException::.ctor(string,
                                                                     class System.Exception)
    IL_0008:  nop
    IL_0009:  nop
    IL_000a:  ret
  } // end of method InvalidCastException::.ctor

} // end of class System.InvalidCastException

.class public auto ansi beforefieldinit System.ArrayTypeMismatchException
       extends System.SystemException
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldstr      "Exception of type 'System.ArrayTypeMismatchExcepti"
    + "on' was thrown."
    IL_0006:  call       instance void System.SystemException::.ctor(string)
    IL_000b:  nop
    IL_000c:  nop
    IL_000d:  ret
  } // end of method ArrayTypeMismatchException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message) cil managed
  {
    // Code size       10 (0xa)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void System.SystemException::.ctor(string)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ret
  } // end of method ArrayTypeMismatchException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message,
                               class System.Exception innerException) cil managed
  {
    // Code size       11 (0xb)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  ldarg.2
    IL_0003:  call       instance void System.SystemException::.ctor(string,
                                                                     class System.Exception)
    IL_0008:  nop
    IL_0009:  nop
    IL_000a:  ret
  } // end of method ArrayTypeMismatchException::.ctor

} // end of class System.ArrayTypeMismatchException

.class public auto ansi beforefieldinit System.OverflowException
       extends System.ArithmeticException
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldstr      "Exception of type 'System.OverflowException' was t"
    + "hrown."
    IL_0006:  call       instance void System.ArithmeticException::.ctor(string)
    IL_000b:  nop
    IL_000c:  nop
    IL_000d:  ret
  } // end of method OverflowException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message) cil managed
  {
    // Code size       10 (0xa)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void System.ArithmeticException::.ctor(string)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ret
  } // end of method OverflowException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message,
                               class System.Exception innerException) cil managed
  {
    // Code size       11 (0xb)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  ldarg.2
    IL_0003:  call       instance void System.ArithmeticException::.ctor(string,
                                                                         class System.Exception)
    IL_0008:  nop
    IL_0009:  nop
    IL_000a:  ret
  } // end of method OverflowException::.ctor

} // end of class System.OverflowException

.class public auto ansi beforefieldinit System.InvalidOperationException
       extends System.SystemException
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldstr      "Exception of type 'System.InvalidOperationExceptio"
    + "n' was thrown."
    IL_0006:  call       instance void System.SystemException::.ctor(string)
    IL_000b:  nop
    IL_000c:  nop
    IL_000d:  ret
  } // end of method InvalidOperationException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message) cil managed
  {
    // Code size       10 (0xa)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void System.SystemException::.ctor(string)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ret
  } // end of method InvalidOperationException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message,
                               class System.Exception innerException) cil managed
  {
    // Code size       11 (0xb)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  ldarg.2
    IL_0003:  call       instance void System.SystemException::.ctor(string,
                                                                     class System.Exception)
    IL_0008:  nop
    IL_0009:  nop
    IL_000a:  ret
  } // end of method InvalidOperationException::.ctor

} // end of class System.InvalidOperationException

.class public auto ansi beforefieldinit System.ArgumentException
       extends System.SystemException
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldstr      "Exception of type 'System.ArgumentException' was t"
    + "hrown."
    IL_0006:  call       instance void System.SystemException::.ctor(string)
    IL_000b:  nop
    IL_000c:  nop
    IL_000d:  ret
  } // end of method ArgumentException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message) cil managed
  {
    // Code size       10 (0xa)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void System.SystemException::.ctor(string)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ret
  } // end of method ArgumentException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message,
                               class System.Exception innerException) cil managed
  {
    // Code size       11 (0xb)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  ldarg.2
    IL_0003:  call       instance void System.SystemException::.ctor(string,
                                                                     class System.Exception)
    IL_0008:  nop
    IL_0009:  nop
    IL_000a:  ret
  } // end of method ArgumentException::.ctor

} // end of class System.ArgumentException

.class public auto ansi beforefieldinit System.ArgumentNullException
       extends System.ArgumentException
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldstr      "Exception of type 'System.ArgumentNullException' w"
    + "as thrown."
    IL_0006:  call       instance void System.ArgumentException::.ctor(string)
    IL_000b:  nop
    IL_000c:  nop
    IL_000d:  ret
  } // end of method ArgumentNullException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message) cil managed
  {
    // Code size       10 (0xa)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void System.ArgumentException::.ctor(string)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ret
  } // end of method ArgumentNullException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message,
                               class System.Exception innerException) cil managed
  {
    // Code size       11 (0xb)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  ldarg.2
    IL_0003:  call       instance void System.ArgumentException::.ctor(string,
                                                                       class System.Exception)
    IL_0008:  nop
    IL_0009:  nop
    IL_000a:  ret
  } // end of method ArgumentNullException::.ctor

} // end of class System.ArgumentNullException

.class public auto ansi beforefieldinit System.NotImplementedException
       extends System.SystemException
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldstr      "Exception of type 'System.NotImplementedException'"
    + " was thrown."
    IL_0006:  call       instance void System.SystemException::.ctor(string)
    IL_000b:  nop
    IL_000c:  nop
    IL_000d:  ret
  } // end of method NotImplementedException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message) cil managed
  {
    // Code size       10 (0xa)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void System.SystemException::.ctor(string)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ret
  } // end of method NotImplementedException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message,
                               class System.Exception innerException) cil managed
  {
    // Code size       11 (0xb)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  ldarg.2
    IL_0003:  call       instance void System.SystemException::.ctor(string,
                                                                     class System.Exception)
    IL_0008:  nop
    IL_0009:  nop
    IL_000a:  ret
  } // end of method NotImplementedException::.ctor

} // end of class System.NotImplementedException

.class public auto ansi beforefieldinit System.NotSupportedException
       extends System.SystemException
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldstr      "Exception of type 'System.NotSupportedException' w"
    + "as thrown."
    IL_0006:  call       instance void System.SystemException::.ctor(string)
    IL_000b:  nop
    IL_000c:  nop
    IL_000d:  ret
  } // end of method NotSupportedException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message) cil managed
  {
    // Code size       10 (0xa)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  call       instance void System.SystemException::.ctor(string)
    IL_0007:  nop
    IL_0008:  nop
    IL_0009:  ret
  } // end of method NotSupportedException::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string message,
                               class System.Exception innerException) cil managed
  {
    // Code size       11 (0xb)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  ldarg.2
    IL_0003:  call       instance void System.SystemException::.ctor(string,
                                                                     class System.Exception)
    IL_0008:  nop
    IL_0009:  nop
    IL_000a:  ret
  } // end of method NotSupportedException::.ctor

} // end of class System.NotSupportedException

.class public auto ansi beforefieldinit System.FlagsAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 10 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       9 (0x9)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ret
  } // end of method FlagsAttribute::.ctor

} // end of class System.FlagsAttribute

.class public sequential ansi sealed beforefieldinit System.Int32
       extends System.ValueType
{
  .custom instance void System.Runtime.CompilerServices.IsReadOnlyAttribute::.ctor() = ( 01 00 00 00 ) 
  .field private initonly int32 m_value
  .field public static literal int32 MaxValue = int32(0x7FFFFFFF)
  .field public static literal int32 MinValue = int32(0x80000000)
  .method public hidebysig instance int32 
          CompareTo(object 'value') cil managed
  {
    .custom instance void System.Runtime.CompilerServices.NullableContextAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
    // Code size       78 (0x4e)
    .maxstack  2
    .locals init (int32 V_0,
             bool V_1,
             int32 V_2,
             bool V_3,
             bool V_4,
             bool V_5)
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  ldnull
    IL_0003:  ceq
    IL_0005:  stloc.1
    IL_0006:  ldloc.1
    IL_0007:  brfalse.s  IL_000e

    IL_0009:  nop
    IL_000a:  ldc.i4.1
    IL_000b:  stloc.2
    IL_000c:  br.s       IL_004c

    IL_000e:  ldarg.1
    IL_000f:  isinst     System.Int32
    IL_0014:  brfalse.s  IL_0020

    IL_0016:  ldarg.1
    IL_0017:  unbox.any  System.Int32
    IL_001c:  stloc.0
    IL_001d:  ldc.i4.1
    IL_001e:  br.s       IL_0021

    IL_0020:  ldc.i4.0
    IL_0021:  stloc.3
    IL_0022:  ldloc.3
    IL_0023:  brfalse.s  IL_0048

    IL_0025:  nop
    IL_0026:  ldarg.0
    IL_0027:  ldind.i4
    IL_0028:  ldloc.0
    IL_0029:  clt
    IL_002b:  stloc.s    V_4
    IL_002d:  ldloc.s    V_4
    IL_002f:  brfalse.s  IL_0035

    IL_0031:  ldc.i4.m1
    IL_0032:  stloc.2
    IL_0033:  br.s       IL_004c

    IL_0035:  ldarg.0
    IL_0036:  ldind.i4
    IL_0037:  ldloc.0
    IL_0038:  cgt
    IL_003a:  stloc.s    V_5
    IL_003c:  ldloc.s    V_5
    IL_003e:  brfalse.s  IL_0044

    IL_0040:  ldc.i4.1
    IL_0041:  stloc.2
    IL_0042:  br.s       IL_004c

    IL_0044:  ldc.i4.0
    IL_0045:  stloc.2
    IL_0046:  br.s       IL_004c

    IL_0048:  ldc.i4.0
    IL_0049:  stloc.2
    IL_004a:  br.s       IL_004c

    IL_004c:  ldloc.2
    IL_004d:  ret
  } // end of method Int32::CompareTo

  .method public hidebysig instance int32 
          CompareTo(int32 'value') cil managed
  {
    // Code size       33 (0x21)
    .maxstack  2
    .locals init (bool V_0,
             int32 V_1,
             bool V_2)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldind.i4
    IL_0003:  ldarg.1
    IL_0004:  clt
    IL_0006:  stloc.0
    IL_0007:  ldloc.0
    IL_0008:  brfalse.s  IL_000e

    IL_000a:  ldc.i4.m1
    IL_000b:  stloc.1
    IL_000c:  br.s       IL_001f

    IL_000e:  ldarg.0
    IL_000f:  ldind.i4
    IL_0010:  ldarg.1
    IL_0011:  cgt
    IL_0013:  stloc.2
    IL_0014:  ldloc.2
    IL_0015:  brfalse.s  IL_001b

    IL_0017:  ldc.i4.1
    IL_0018:  stloc.1
    IL_0019:  br.s       IL_001f

    IL_001b:  ldc.i4.0
    IL_001c:  stloc.1
    IL_001d:  br.s       IL_001f

    IL_001f:  ldloc.1
    IL_0020:  ret
  } // end of method Int32::CompareTo

  .method public hidebysig virtual instance bool 
          Equals(object obj) cil managed
  {
    .custom instance void System.Runtime.CompilerServices.NullableContextAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
    // Code size       37 (0x25)
    .maxstack  2
    .locals init (bool V_0,
             bool V_1)
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  isinst     System.Int32
    IL_0007:  ldnull
    IL_0008:  cgt.un
    IL_000a:  ldc.i4.0
    IL_000b:  ceq
    IL_000d:  stloc.0
    IL_000e:  ldloc.0
    IL_000f:  brfalse.s  IL_0016

    IL_0011:  nop
    IL_0012:  ldc.i4.0
    IL_0013:  stloc.1
    IL_0014:  br.s       IL_0023

    IL_0016:  ldarg.0
    IL_0017:  ldind.i4
    IL_0018:  ldarg.1
    IL_0019:  unbox.any  System.Int32
    IL_001e:  ceq
    IL_0020:  stloc.1
    IL_0021:  br.s       IL_0023

    IL_0023:  ldloc.1
    IL_0024:  ret
  } // end of method Int32::Equals

  .method public hidebysig instance bool 
          Equals(int32 obj) cil managed
  {
    // Code size       11 (0xb)
    .maxstack  2
    .locals init (bool V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldind.i4
    IL_0003:  ldarg.1
    IL_0004:  ceq
    IL_0006:  stloc.0
    IL_0007:  br.s       IL_0009

    IL_0009:  ldloc.0
    IL_000a:  ret
  } // end of method Int32::Equals

  .method public hidebysig virtual instance int32 
          GetHashCode() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldind.i4
    IL_0003:  stloc.0
    IL_0004:  br.s       IL_0006

    IL_0006:  ldloc.0
    IL_0007:  ret
  } // end of method Int32::GetHashCode

  .method public hidebysig virtual instance string 
          ToString() cil managed internalcall
  {
  } // end of method Int32::ToString

} // end of class System.Int32

.class private auto ansi beforefieldinit System.Math
       extends System.Object
{
  .method public hidebysig static float64 
          Sqrt(float64 o) cil managed internalcall
  {
  } // end of method Math::Sqrt

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Math::.ctor

} // end of class System.Math

.class private auto ansi beforefieldinit System.Console
       extends System.Object
{
  .method public hidebysig static void  Write(int32 i) cil managed internalcall
  {
  } // end of method Console::Write

  .method public hidebysig static void  Write(char i) cil managed internalcall
  {
  } // end of method Console::Write

  .method public hidebysig static void  Write(float64 d) cil managed internalcall
  {
  } // end of method Console::Write

  .method public hidebysig static void  Write(string s) cil managed internalcall
  {
  } // end of method Console::Write

  .method public hidebysig static void  Write(object o) cil managed internalcall
  {
  } // end of method Console::Write

  .method public hidebysig static void  WriteLine(int32 i) cil managed internalcall
  {
  } // end of method Console::WriteLine

  .method public hidebysig static void  WriteLine(char 'value') cil managed internalcall
  {
  } // end of method Console::WriteLine

  .method public hidebysig static void  WriteLine(uint32 'value') cil managed internalcall
  {
  } // end of method Console::WriteLine

  .method public hidebysig static void  WriteLine(int64 'value') cil managed internalcall
  {
  } // end of method Console::WriteLine

  .method public hidebysig static void  WriteLine(uint64 'value') cil managed internalcall
  {
  } // end of method Console::WriteLine

  .method public hidebysig static void  WriteLine(float32 'value') cil managed internalcall
  {
  } // end of method Console::WriteLine

  .method public hidebysig static void  WriteLine(string s) cil managed internalcall
  {
  } // end of method Console::WriteLine

  .method public hidebysig static void  WriteLine(object o) cil managed internalcall
  {
  } // end of method Console::WriteLine

  .method public hidebysig static void  WriteLine(bool b) cil managed internalcall
  {
  } // end of method Console::WriteLine

  .method public hidebysig static void  WriteLine(float64 b) cil managed internalcall
  {
  } // end of method Console::WriteLine

  .method public hidebysig static void  WriteLine() cil managed internalcall
  {
  } // end of method Console::WriteLine

  .method public hidebysig static int32  Read() cil managed internalcall
  {
  } // end of method Console::Read

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Console::.ctor

} // end of class System.Console

.class private auto ansi beforefieldinit System.Convert
       extends System.Object
{
  .method public hidebysig static bool  ToBoolean(int32 i) cil managed internalcall
  {
  } // end of method Convert::ToBoolean

  .method public hidebysig static char  ToChar(int32 i) cil managed internalcall
  {
  } // end of method Convert::ToChar

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Convert::.ctor

} // end of class System.Convert

.class public auto ansi beforefieldinit System.Object
{
  .custom instance void System.Runtime.CompilerServices.NullableContextAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       2 (0x2)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ret
  } // end of method Object::.ctor

  .method family hidebysig newslot virtual 
          instance void  Finalize() cil managed
  {
    // Code size       2 (0x2)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ret
  } // end of method Object::Finalize

  .method public hidebysig newslot virtual 
          instance string  ToString() cil managed
  {
    // Code size       11 (0xb)
    .maxstack  1
    .locals init (string V_0)
    IL_0000:  nop
    IL_0001:  ldstr      ""
    IL_0006:  stloc.0
    IL_0007:  br.s       IL_0009

    IL_0009:  ldloc.0
    IL_000a:  ret
  } // end of method Object::ToString

  .method public hidebysig newslot virtual 
          instance bool  Equals(object obj) cil managed
  {
    // Code size       7 (0x7)
    .maxstack  1
    .locals init (bool V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.0
    IL_0002:  stloc.0
    IL_0003:  br.s       IL_0005

    IL_0005:  ldloc.0
    IL_0006:  ret
  } // end of method Object::Equals

  .method public hidebysig newslot virtual 
          instance int32  GetHashCode() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.s   42
    IL_0003:  stloc.0
    IL_0004:  br.s       IL_0006

    IL_0006:  ldloc.0
    IL_0007:  ret
  } // end of method Object::GetHashCode

} // end of class System.Object

.class public sequential ansi sealed beforefieldinit System.SByte
       extends System.ValueType
{
  .pack 0
  .size 1
} // end of class System.SByte

.class public sequential ansi sealed beforefieldinit System.Int16
       extends System.ValueType
{
  .pack 0
  .size 1
} // end of class System.Int16

.class public sequential ansi sealed beforefieldinit System.UInt16
       extends System.ValueType
{
  .pack 0
  .size 1
} // end of class System.UInt16

.class public sequential ansi sealed beforefieldinit System.Int64
       extends System.ValueType
{
  .pack 0
  .size 1
} // end of class System.Int64

.class public sequential ansi sealed beforefieldinit System.UInt64
       extends System.ValueType
{
  .pack 0
  .size 1
} // end of class System.UInt64

.class public sequential ansi sealed beforefieldinit System.Single
       extends System.ValueType
{
  .pack 0
  .size 1
} // end of class System.Single

.class public abstract auto ansi beforefieldinit System.Attribute
       extends System.Object
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 FF 7F 00 00 02 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 01 54 02 0D 41 6C 6C 6F 77 4D 75 6C   // ited.T..AllowMul
                                                                                                     74 69 70 6C 65 00 )                               // tiple.
  .method family hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       9 (0x9)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ret
  } // end of method Attribute::.ctor

  .method public hidebysig newslot virtual 
          instance bool  Match(object obj) cil managed
  {
    .custom instance void System.Runtime.CompilerServices.NullableContextAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  callvirt   instance bool System.Object::Equals(object)
    IL_0007:  ret
  } // end of method Attribute::Match

  .method public hidebysig newslot virtual 
          instance bool  IsDefaultAttribute() cil managed
  {
    // Code size       2 (0x2)
    .maxstack  8
    IL_0000:  ldc.i4.0
    IL_0001:  ret
  } // end of method Attribute::IsDefaultAttribute

} // end of class System.Attribute

.class public auto ansi beforefieldinit System.String
       extends System.Object
{
  .method public hidebysig static string 
          Concat(string[] args) cil managed internalcall
  {
  } // end of method String::Concat

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method String::.ctor

} // end of class System.String

.class public sequential ansi sealed beforefieldinit System.UInt32
       extends System.ValueType
{
  .custom instance void System.Runtime.CompilerServices.IsReadOnlyAttribute::.ctor() = ( 01 00 00 00 ) 
  .field private initonly uint32 m_value
  .field public static literal uint32 MaxValue = uint32(0xFFFFFFFF)
  .field public static literal uint32 MinValue = uint32(0x00000000)
  .method public hidebysig instance int32 
          CompareTo(object 'value') cil managed
  {
    .custom instance void System.Runtime.CompilerServices.NullableContextAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
    // Code size       78 (0x4e)
    .maxstack  2
    .locals init (uint32 V_0,
             bool V_1,
             int32 V_2,
             bool V_3,
             bool V_4,
             bool V_5)
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  ldnull
    IL_0003:  ceq
    IL_0005:  stloc.1
    IL_0006:  ldloc.1
    IL_0007:  brfalse.s  IL_000e

    IL_0009:  nop
    IL_000a:  ldc.i4.1
    IL_000b:  stloc.2
    IL_000c:  br.s       IL_004c

    IL_000e:  ldarg.1
    IL_000f:  isinst     System.UInt32
    IL_0014:  brfalse.s  IL_0020

    IL_0016:  ldarg.1
    IL_0017:  unbox.any  System.UInt32
    IL_001c:  stloc.0
    IL_001d:  ldc.i4.1
    IL_001e:  br.s       IL_0021

    IL_0020:  ldc.i4.0
    IL_0021:  stloc.3
    IL_0022:  ldloc.3
    IL_0023:  brfalse.s  IL_0048

    IL_0025:  nop
    IL_0026:  ldarg.0
    IL_0027:  ldind.u4
    IL_0028:  ldloc.0
    IL_0029:  clt.un
    IL_002b:  stloc.s    V_4
    IL_002d:  ldloc.s    V_4
    IL_002f:  brfalse.s  IL_0035

    IL_0031:  ldc.i4.m1
    IL_0032:  stloc.2
    IL_0033:  br.s       IL_004c

    IL_0035:  ldarg.0
    IL_0036:  ldind.u4
    IL_0037:  ldloc.0
    IL_0038:  cgt.un
    IL_003a:  stloc.s    V_5
    IL_003c:  ldloc.s    V_5
    IL_003e:  brfalse.s  IL_0044

    IL_0040:  ldc.i4.1
    IL_0041:  stloc.2
    IL_0042:  br.s       IL_004c

    IL_0044:  ldc.i4.0
    IL_0045:  stloc.2
    IL_0046:  br.s       IL_004c

    IL_0048:  ldc.i4.0
    IL_0049:  stloc.2
    IL_004a:  br.s       IL_004c

    IL_004c:  ldloc.2
    IL_004d:  ret
  } // end of method UInt32::CompareTo

  .method public hidebysig instance int32 
          CompareTo(uint32 'value') cil managed
  {
    // Code size       33 (0x21)
    .maxstack  2
    .locals init (bool V_0,
             int32 V_1,
             bool V_2)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldind.u4
    IL_0003:  ldarg.1
    IL_0004:  clt.un
    IL_0006:  stloc.0
    IL_0007:  ldloc.0
    IL_0008:  brfalse.s  IL_000e

    IL_000a:  ldc.i4.m1
    IL_000b:  stloc.1
    IL_000c:  br.s       IL_001f

    IL_000e:  ldarg.0
    IL_000f:  ldind.u4
    IL_0010:  ldarg.1
    IL_0011:  cgt.un
    IL_0013:  stloc.2
    IL_0014:  ldloc.2
    IL_0015:  brfalse.s  IL_001b

    IL_0017:  ldc.i4.1
    IL_0018:  stloc.1
    IL_0019:  br.s       IL_001f

    IL_001b:  ldc.i4.0
    IL_001c:  stloc.1
    IL_001d:  br.s       IL_001f

    IL_001f:  ldloc.1
    IL_0020:  ret
  } // end of method UInt32::CompareTo

  .method public hidebysig virtual instance bool 
          Equals(object obj) cil managed
  {
    .custom instance void System.Runtime.CompilerServices.NullableContextAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
    // Code size       37 (0x25)
    .maxstack  2
    .locals init (bool V_0,
             bool V_1)
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  isinst     System.UInt32
    IL_0007:  ldnull
    IL_0008:  cgt.un
    IL_000a:  ldc.i4.0
    IL_000b:  ceq
    IL_000d:  stloc.0
    IL_000e:  ldloc.0
    IL_000f:  brfalse.s  IL_0016

    IL_0011:  nop
    IL_0012:  ldc.i4.0
    IL_0013:  stloc.1
    IL_0014:  br.s       IL_0023

    IL_0016:  ldarg.0
    IL_0017:  ldind.u4
    IL_0018:  ldarg.1
    IL_0019:  unbox.any  System.UInt32
    IL_001e:  ceq
    IL_0020:  stloc.1
    IL_0021:  br.s       IL_0023

    IL_0023:  ldloc.1
    IL_0024:  ret
  } // end of method UInt32::Equals

  .method public hidebysig instance bool 
          Equals(uint32 obj) cil managed
  {
    // Code size       11 (0xb)
    .maxstack  2
    .locals init (bool V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldind.u4
    IL_0003:  ldarg.1
    IL_0004:  ceq
    IL_0006:  stloc.0
    IL_0007:  br.s       IL_0009

    IL_0009:  ldloc.0
    IL_000a:  ret
  } // end of method UInt32::Equals

  .method public hidebysig virtual instance int32 
          GetHashCode() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldind.u4
    IL_0003:  stloc.0
    IL_0004:  br.s       IL_0006

    IL_0006:  ldloc.0
    IL_0007:  ret
  } // end of method UInt32::GetHashCode

  .method public hidebysig virtual instance string 
          ToString() cil managed
  {
    // Code size       11 (0xb)
    .maxstack  1
    .locals init (string V_0)
    IL_0000:  nop
    IL_0001:  ldstr      ""
    IL_0006:  stloc.0
    IL_0007:  br.s       IL_0009

    IL_0009:  ldloc.0
    IL_000a:  ret
  } // end of method UInt32::ToString

} // end of class System.UInt32

.class public abstract auto ansi beforefieldinit System.ValueType
       extends System.Object
{
  .method private hidebysig static bool  CanCompareBits(object obj) cil managed internalcall
  {
  } // end of method ValueType::CanCompareBits

  .method private hidebysig static bool  FastEqualsCheck(object a,
                                                         object b) cil managed internalcall
  {
  } // end of method ValueType::FastEqualsCheck

  .method public hidebysig virtual instance int32 
          GetHashCode() cil managed internalcall
  {
  } // end of method ValueType::GetHashCode

  .method public hidebysig virtual instance string 
          ToString() cil managed
  {
    .custom instance void System.Runtime.CompilerServices.NullableContextAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
    // Code size       11 (0xb)
    .maxstack  1
    .locals init (string V_0)
    IL_0000:  nop
    IL_0001:  ldstr      ""
    IL_0006:  stloc.0
    IL_0007:  br.s       IL_0009

    IL_0009:  ldloc.0
    IL_000a:  ret
  } // end of method ValueType::ToString

  .method family hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method ValueType::.ctor

} // end of class System.ValueType

.class public sequential ansi sealed beforefieldinit System.Void
       extends System.ValueType
{
  .pack 0
  .size 1
} // end of class System.Void

.class private auto ansi sealed beforefieldinit System.Runtime.Versioning.NonVersionableAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 6C 00 00 00 02 00 54 02 0D 41 6C 6C 6F 77   // ..l.....T..Allow
                                                                                                     4D 75 6C 74 69 70 6C 65 00 54 02 09 49 6E 68 65   // Multiple.T..Inhe
                                                                                                     72 69 74 65 64 00 )                               // rited.
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       9 (0x9)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ret
  } // end of method NonVersionableAttribute::.ctor

} // end of class System.Runtime.Versioning.NonVersionableAttribute

.class public auto ansi sealed beforefieldinit System.Runtime.Versioning.TargetFrameworkAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 02 00 54 02 0D 41 6C 6C 6F 77   // ........T..Allow
                                                                                                     4D 75 6C 74 69 70 6C 65 00 54 02 09 49 6E 68 65   // Multiple.T..Inhe
                                                                                                     72 69 74 65 64 00 )                               // rited.
  .field private initonly string _frameworkName
  .field private string _frameworkDisplayName
  .custom instance void System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string frameworkName) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Runtime.Versioning.TargetFrameworkAttribute::_frameworkName
    IL_000f:  ret
  } // end of method TargetFrameworkAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_FrameworkName() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Runtime.Versioning.TargetFrameworkAttribute::_frameworkName
    IL_0006:  ret
  } // end of method TargetFrameworkAttribute::get_FrameworkName

  .method public hidebysig specialname instance string 
          get_FrameworkDisplayName() cil managed
  {
    .custom instance void System.Runtime.CompilerServices.NullableContextAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Runtime.Versioning.TargetFrameworkAttribute::_frameworkDisplayName
    IL_0006:  ret
  } // end of method TargetFrameworkAttribute::get_FrameworkDisplayName

  .method public hidebysig specialname instance void 
          set_FrameworkDisplayName(string 'value') cil managed
  {
    .custom instance void System.Runtime.CompilerServices.NullableContextAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  stfld      string System.Runtime.Versioning.TargetFrameworkAttribute::_frameworkDisplayName
    IL_0007:  ret
  } // end of method TargetFrameworkAttribute::set_FrameworkDisplayName

  .property instance callconv(8) string FrameworkName()
  {
    .get instance string System.Runtime.Versioning.TargetFrameworkAttribute::get_FrameworkName()
  } // end of property TargetFrameworkAttribute::FrameworkName
  .property instance callconv(8) string FrameworkDisplayName()
  {
    .custom instance void System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
    .get instance string System.Runtime.Versioning.TargetFrameworkAttribute::get_FrameworkDisplayName()
    .set instance void System.Runtime.Versioning.TargetFrameworkAttribute::set_FrameworkDisplayName(string)
  } // end of property TargetFrameworkAttribute::FrameworkDisplayName
} // end of class System.Runtime.Versioning.TargetFrameworkAttribute

.class public auto ansi sealed System.Runtime.CompilerServices.MethodCodeType
       extends System.Enum
{
  .field public specialname rtspecialname int32 value__
  .field public static literal valuetype System.Runtime.CompilerServices.MethodCodeType IL = int32(0x00000000)
  .field public static literal valuetype System.Runtime.CompilerServices.MethodCodeType Native = int32(0x00000001)
  .field public static literal valuetype System.Runtime.CompilerServices.MethodCodeType OPTIL = int32(0x00000002)
  .field public static literal valuetype System.Runtime.CompilerServices.MethodCodeType Runtime = int32(0x00000003)
} // end of class System.Runtime.CompilerServices.MethodCodeType

.class public auto ansi sealed beforefieldinit System.Runtime.CompilerServices.MethodImplAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 60 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ..`.....T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field public valuetype System.Runtime.CompilerServices.MethodCodeType MethodCodeType
  .field private initonly valuetype System.Runtime.CompilerServices.MethodImplOptions '<Value>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(valuetype System.Runtime.CompilerServices.MethodImplOptions methodImplOptions) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      valuetype System.Runtime.CompilerServices.MethodImplOptions System.Runtime.CompilerServices.MethodImplAttribute::'<Value>k__BackingField'
    IL_000f:  ret
  } // end of method MethodImplAttribute::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(int32 'value') cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      valuetype System.Runtime.CompilerServices.MethodImplOptions System.Runtime.CompilerServices.MethodImplAttribute::'<Value>k__BackingField'
    IL_000f:  ret
  } // end of method MethodImplAttribute::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       9 (0x9)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ret
  } // end of method MethodImplAttribute::.ctor

  .method public hidebysig specialname instance valuetype System.Runtime.CompilerServices.MethodImplOptions 
          get_Value() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      valuetype System.Runtime.CompilerServices.MethodImplOptions System.Runtime.CompilerServices.MethodImplAttribute::'<Value>k__BackingField'
    IL_0006:  ret
  } // end of method MethodImplAttribute::get_Value

  .property instance callconv(8) valuetype System.Runtime.CompilerServices.MethodImplOptions
          Value()
  {
    .get instance valuetype System.Runtime.CompilerServices.MethodImplOptions System.Runtime.CompilerServices.MethodImplAttribute::get_Value()
  } // end of property MethodImplAttribute::Value
} // end of class System.Runtime.CompilerServices.MethodImplAttribute

.class public auto ansi sealed System.Runtime.CompilerServices.MethodImplOptions
       extends System.Enum
{
  .custom instance void System.FlagsAttribute::.ctor() = ( 01 00 00 00 ) 
  .field public specialname rtspecialname int32 value__
  .field public static literal valuetype System.Runtime.CompilerServices.MethodImplOptions Unmanaged = int32(0x00000004)
  .field public static literal valuetype System.Runtime.CompilerServices.MethodImplOptions NoInlining = int32(0x00000008)
  .field public static literal valuetype System.Runtime.CompilerServices.MethodImplOptions ForwardRef = int32(0x00000010)
  .field public static literal valuetype System.Runtime.CompilerServices.MethodImplOptions Synchronized = int32(0x00000020)
  .field public static literal valuetype System.Runtime.CompilerServices.MethodImplOptions NoOptimization = int32(0x00000040)
  .field public static literal valuetype System.Runtime.CompilerServices.MethodImplOptions PreserveSig = int32(0x00000080)
  .field public static literal valuetype System.Runtime.CompilerServices.MethodImplOptions AggressiveInlining = int32(0x00000100)
  .field public static literal valuetype System.Runtime.CompilerServices.MethodImplOptions AggressiveOptimization = int32(0x00000200)
  .field public static literal valuetype System.Runtime.CompilerServices.MethodImplOptions InternalCall = int32(0x00001000)
} // end of class System.Runtime.CompilerServices.MethodImplOptions

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyCompanyAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field private initonly string '<Company>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string company) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblyCompanyAttribute::'<Company>k__BackingField'
    IL_000f:  ret
  } // end of method AssemblyCompanyAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_Company() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyCompanyAttribute::'<Company>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyCompanyAttribute::get_Company

  .property instance callconv(8) string Company()
  {
    .get instance string System.Reflection.AssemblyCompanyAttribute::get_Company()
  } // end of property AssemblyCompanyAttribute::Company
} // end of class System.Reflection.AssemblyCompanyAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyConfigurationAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field private initonly string '<Configuration>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string configuration) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblyConfigurationAttribute::'<Configuration>k__BackingField'
    IL_000f:  ret
  } // end of method AssemblyConfigurationAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_Configuration() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyConfigurationAttribute::'<Configuration>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyConfigurationAttribute::get_Configuration

  .property instance callconv(8) string Configuration()
  {
    .get instance string System.Reflection.AssemblyConfigurationAttribute::get_Configuration()
  } // end of property AssemblyConfigurationAttribute::Configuration
} // end of class System.Reflection.AssemblyConfigurationAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyCopyrightAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field private initonly string '<Copyright>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string copyright) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblyCopyrightAttribute::'<Copyright>k__BackingField'
    IL_000f:  ret
  } // end of method AssemblyCopyrightAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_Copyright() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyCopyrightAttribute::'<Copyright>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyCopyrightAttribute::get_Copyright

  .property instance callconv(8) string Copyright()
  {
    .get instance string System.Reflection.AssemblyCopyrightAttribute::get_Copyright()
  } // end of property AssemblyCopyrightAttribute::Copyright
} // end of class System.Reflection.AssemblyCopyrightAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyCultureAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field private initonly string '<Culture>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string culture) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblyCultureAttribute::'<Culture>k__BackingField'
    IL_000f:  ret
  } // end of method AssemblyCultureAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_Culture() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyCultureAttribute::'<Culture>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyCultureAttribute::get_Culture

  .property instance callconv(8) string Culture()
  {
    .get instance string System.Reflection.AssemblyCultureAttribute::get_Culture()
  } // end of property AssemblyCultureAttribute::Culture
} // end of class System.Reflection.AssemblyCultureAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyDefaultAliasAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field private initonly string '<DefaultAlias>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string defaultAlias) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblyDefaultAliasAttribute::'<DefaultAlias>k__BackingField'
    IL_000f:  ret
  } // end of method AssemblyDefaultAliasAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_DefaultAlias() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyDefaultAliasAttribute::'<DefaultAlias>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyDefaultAliasAttribute::get_DefaultAlias

  .property instance callconv(8) string DefaultAlias()
  {
    .get instance string System.Reflection.AssemblyDefaultAliasAttribute::get_DefaultAlias()
  } // end of property AssemblyDefaultAliasAttribute::DefaultAlias
} // end of class System.Reflection.AssemblyDefaultAliasAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyDelaySignAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field private initonly bool '<DelaySign>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(bool delaySign) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      bool System.Reflection.AssemblyDelaySignAttribute::'<DelaySign>k__BackingField'
    IL_000f:  ret
  } // end of method AssemblyDelaySignAttribute::.ctor

  .method public hidebysig specialname instance bool 
          get_DelaySign() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      bool System.Reflection.AssemblyDelaySignAttribute::'<DelaySign>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyDelaySignAttribute::get_DelaySign

  .property instance callconv(8) bool DelaySign()
  {
    .get instance bool System.Reflection.AssemblyDelaySignAttribute::get_DelaySign()
  } // end of property AssemblyDelaySignAttribute::DelaySign
} // end of class System.Reflection.AssemblyDelaySignAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyDescriptionAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field private initonly string '<Description>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string description) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblyDescriptionAttribute::'<Description>k__BackingField'
    IL_000f:  ret
  } // end of method AssemblyDescriptionAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_Description() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyDescriptionAttribute::'<Description>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyDescriptionAttribute::get_Description

  .property instance callconv(8) string Description()
  {
    .get instance string System.Reflection.AssemblyDescriptionAttribute::get_Description()
  } // end of property AssemblyDescriptionAttribute::Description
} // end of class System.Reflection.AssemblyDescriptionAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyFileVersionAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field private initonly string '<Version>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string version) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblyFileVersionAttribute::'<Version>k__BackingField'
    IL_000f:  ret
  } // end of method AssemblyFileVersionAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_Version() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyFileVersionAttribute::'<Version>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyFileVersionAttribute::get_Version

  .property instance callconv(8) string Version()
  {
    .get instance string System.Reflection.AssemblyFileVersionAttribute::get_Version()
  } // end of property AssemblyFileVersionAttribute::Version
} // end of class System.Reflection.AssemblyFileVersionAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyInformationalVersionAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field private initonly string '<InformationalVersion>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string informationalVersion) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblyInformationalVersionAttribute::'<InformationalVersion>k__BackingField'
    IL_000f:  ret
  } // end of method AssemblyInformationalVersionAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_InformationalVersion() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyInformationalVersionAttribute::'<InformationalVersion>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyInformationalVersionAttribute::get_InformationalVersion

  .property instance callconv(8) string InformationalVersion()
  {
    .get instance string System.Reflection.AssemblyInformationalVersionAttribute::get_InformationalVersion()
  } // end of property AssemblyInformationalVersionAttribute::InformationalVersion
} // end of class System.Reflection.AssemblyInformationalVersionAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyKeyFileAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field private initonly string '<KeyFile>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string keyFile) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblyKeyFileAttribute::'<KeyFile>k__BackingField'
    IL_000f:  ret
  } // end of method AssemblyKeyFileAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_KeyFile() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyKeyFileAttribute::'<KeyFile>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyKeyFileAttribute::get_KeyFile

  .property instance callconv(8) string KeyFile()
  {
    .get instance string System.Reflection.AssemblyKeyFileAttribute::get_KeyFile()
  } // end of property AssemblyKeyFileAttribute::KeyFile
} // end of class System.Reflection.AssemblyKeyFileAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyKeyNameAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field private initonly string '<KeyName>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string keyName) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblyKeyNameAttribute::'<KeyName>k__BackingField'
    IL_000f:  ret
  } // end of method AssemblyKeyNameAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_KeyName() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyKeyNameAttribute::'<KeyName>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyKeyNameAttribute::get_KeyName

  .property instance callconv(8) string KeyName()
  {
    .get instance string System.Reflection.AssemblyKeyNameAttribute::get_KeyName()
  } // end of property AssemblyKeyNameAttribute::KeyName
} // end of class System.Reflection.AssemblyKeyNameAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyMetadataAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 02 00 54 02 0D 41 6C 6C 6F 77   // ........T..Allow
                                                                                                     4D 75 6C 74 69 70 6C 65 01 54 02 09 49 6E 68 65   // Multiple.T..Inhe
                                                                                                     72 69 74 65 64 00 )                               // rited.
  .field private initonly string '<Key>k__BackingField'
  .field private initonly string '<Value>k__BackingField'
  .custom instance void System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string key,
                               string 'value') cil managed
  {
    .param [2]
    .custom instance void System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
    // Code size       23 (0x17)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblyMetadataAttribute::'<Key>k__BackingField'
    IL_000f:  ldarg.0
    IL_0010:  ldarg.2
    IL_0011:  stfld      string System.Reflection.AssemblyMetadataAttribute::'<Value>k__BackingField'
    IL_0016:  ret
  } // end of method AssemblyMetadataAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_Key() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyMetadataAttribute::'<Key>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyMetadataAttribute::get_Key

  .method public hidebysig specialname instance string 
          get_Value() cil managed
  {
    .custom instance void System.Runtime.CompilerServices.NullableContextAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyMetadataAttribute::'<Value>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyMetadataAttribute::get_Value

  .property instance callconv(8) string Key()
  {
    .get instance string System.Reflection.AssemblyMetadataAttribute::get_Key()
  } // end of property AssemblyMetadataAttribute::Key
  .property instance callconv(8) string Value()
  {
    .custom instance void System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
    .get instance string System.Reflection.AssemblyMetadataAttribute::get_Value()
  } // end of property AssemblyMetadataAttribute::Value
} // end of class System.Reflection.AssemblyMetadataAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyProductAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field private initonly string '<Product>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string product) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblyProductAttribute::'<Product>k__BackingField'
    IL_000f:  ret
  } // end of method AssemblyProductAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_Product() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyProductAttribute::'<Product>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyProductAttribute::get_Product

  .property instance callconv(8) string Product()
  {
    .get instance string System.Reflection.AssemblyProductAttribute::get_Product()
  } // end of property AssemblyProductAttribute::Product
} // end of class System.Reflection.AssemblyProductAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblySignatureKeyAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 02 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 54 02 0D 41 6C 6C 6F 77 4D 75 6C   // ited.T..AllowMul
                                                                                                     74 69 70 6C 65 00 )                               // tiple.
  .field private initonly string '<PublicKey>k__BackingField'
  .field private initonly string '<Countersignature>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string publicKey,
                               string countersignature) cil managed
  {
    // Code size       23 (0x17)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblySignatureKeyAttribute::'<PublicKey>k__BackingField'
    IL_000f:  ldarg.0
    IL_0010:  ldarg.2
    IL_0011:  stfld      string System.Reflection.AssemblySignatureKeyAttribute::'<Countersignature>k__BackingField'
    IL_0016:  ret
  } // end of method AssemblySignatureKeyAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_PublicKey() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblySignatureKeyAttribute::'<PublicKey>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblySignatureKeyAttribute::get_PublicKey

  .method public hidebysig specialname instance string 
          get_Countersignature() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblySignatureKeyAttribute::'<Countersignature>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblySignatureKeyAttribute::get_Countersignature

  .property instance callconv(8) string PublicKey()
  {
    .get instance string System.Reflection.AssemblySignatureKeyAttribute::get_PublicKey()
  } // end of property AssemblySignatureKeyAttribute::PublicKey
  .property instance callconv(8) string Countersignature()
  {
    .get instance string System.Reflection.AssemblySignatureKeyAttribute::get_Countersignature()
  } // end of property AssemblySignatureKeyAttribute::Countersignature
} // end of class System.Reflection.AssemblySignatureKeyAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyTitleAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field private initonly string '<Title>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string title) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblyTitleAttribute::'<Title>k__BackingField'
    IL_000f:  ret
  } // end of method AssemblyTitleAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_Title() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyTitleAttribute::'<Title>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyTitleAttribute::get_Title

  .property instance callconv(8) string Title()
  {
    .get instance string System.Reflection.AssemblyTitleAttribute::get_Title()
  } // end of property AssemblyTitleAttribute::Title
} // end of class System.Reflection.AssemblyTitleAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyTrademarkAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field private initonly string '<Trademark>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string trademark) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblyTrademarkAttribute::'<Trademark>k__BackingField'
    IL_000f:  ret
  } // end of method AssemblyTrademarkAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_Trademark() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyTrademarkAttribute::'<Trademark>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyTrademarkAttribute::get_Trademark

  .property instance callconv(8) string Trademark()
  {
    .get instance string System.Reflection.AssemblyTrademarkAttribute::get_Trademark()
  } // end of property AssemblyTrademarkAttribute::Trademark
} // end of class System.Reflection.AssemblyTrademarkAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.AssemblyVersionAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 01 00 54 02 09 49 6E 68 65 72   // ........T..Inher
                                                                                                     69 74 65 64 00 )                                  // ited.
  .field private initonly string '<Version>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string version) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.AssemblyVersionAttribute::'<Version>k__BackingField'
    IL_000f:  ret
  } // end of method AssemblyVersionAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_Version() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.AssemblyVersionAttribute::'<Version>k__BackingField'
    IL_0006:  ret
  } // end of method AssemblyVersionAttribute::get_Version

  .property instance callconv(8) string Version()
  {
    .get instance string System.Reflection.AssemblyVersionAttribute::get_Version()
  } // end of property AssemblyVersionAttribute::Version
} // end of class System.Reflection.AssemblyVersionAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.DefaultMemberAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 0C 04 00 00 00 00 ) 
  .field private initonly string '<MemberName>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(string memberName) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Attribute::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      string System.Reflection.DefaultMemberAttribute::'<MemberName>k__BackingField'
    IL_000f:  ret
  } // end of method DefaultMemberAttribute::.ctor

  .method public hidebysig specialname instance string 
          get_MemberName() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.DefaultMemberAttribute::'<MemberName>k__BackingField'
    IL_0006:  ret
  } // end of method DefaultMemberAttribute::get_MemberName

  .property instance callconv(8) string MemberName()
  {
    .get instance string System.Reflection.DefaultMemberAttribute::get_MemberName()
  } // end of property DefaultMemberAttribute::MemberName
} // end of class System.Reflection.DefaultMemberAttribute

.class public auto ansi sealed System.Reflection.MethodImplAttributes
       extends System.Enum
{
  .field public specialname rtspecialname int32 value__
  .field public static literal valuetype System.Reflection.MethodImplAttributes CodeTypeMask = int32(0x00000003)
  .field public static literal valuetype System.Reflection.MethodImplAttributes IL = int32(0x00000000)
  .field public static literal valuetype System.Reflection.MethodImplAttributes Native = int32(0x00000001)
  .field public static literal valuetype System.Reflection.MethodImplAttributes OPTIL = int32(0x00000002)
  .field public static literal valuetype System.Reflection.MethodImplAttributes Runtime = int32(0x00000003)
  .field public static literal valuetype System.Reflection.MethodImplAttributes ManagedMask = int32(0x00000004)
  .field public static literal valuetype System.Reflection.MethodImplAttributes Unmanaged = int32(0x00000004)
  .field public static literal valuetype System.Reflection.MethodImplAttributes Managed = int32(0x00000000)
  .field public static literal valuetype System.Reflection.MethodImplAttributes ForwardRef = int32(0x00000010)
  .field public static literal valuetype System.Reflection.MethodImplAttributes PreserveSig = int32(0x00000080)
  .field public static literal valuetype System.Reflection.MethodImplAttributes InternalCall = int32(0x00001000)
  .field public static literal valuetype System.Reflection.MethodImplAttributes Synchronized = int32(0x00000020)
  .field public static literal valuetype System.Reflection.MethodImplAttributes NoInlining = int32(0x00000008)
  .field public static literal valuetype System.Reflection.MethodImplAttributes AggressiveInlining = int32(0x00000100)
  .field public static literal valuetype System.Reflection.MethodImplAttributes NoOptimization = int32(0x00000040)
  .field public static literal valuetype System.Reflection.MethodImplAttributes AggressiveOptimization = int32(0x00000200)
  .field public static literal valuetype System.Reflection.MethodImplAttributes MaxMethodImplVal = int32(0x0000FFFF)
} // end of class System.Reflection.MethodImplAttributes

.class public auto ansi sealed beforefieldinit System.Reflection.ObfuscateAssemblyAttribute
       extends System.Attribute
{
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 01 00 00 00 02 00 54 02 0D 41 6C 6C 6F 77   // ........T..Allow
                                                                                                     4D 75 6C 74 69 70 6C 65 00 54 02 09 49 6E 68 65   // Multiple.T..Inhe
                                                                                                     72 69 74 65 64 00 )                               // rited.
  .field private initonly bool '<AssemblyIsPrivate>k__BackingField'
  .field private bool '<StripAfterObfuscation>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(bool assemblyIsPrivate) cil managed
  {
    // Code size       23 (0x17)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldc.i4.1
    IL_0002:  stfld      bool System.Reflection.ObfuscateAssemblyAttribute::'<StripAfterObfuscation>k__BackingField'
    IL_0007:  ldarg.0
    IL_0008:  call       instance void System.Attribute::.ctor()
    IL_000d:  nop
    IL_000e:  nop
    IL_000f:  ldarg.0
    IL_0010:  ldarg.1
    IL_0011:  stfld      bool System.Reflection.ObfuscateAssemblyAttribute::'<AssemblyIsPrivate>k__BackingField'
    IL_0016:  ret
  } // end of method ObfuscateAssemblyAttribute::.ctor

  .method public hidebysig specialname instance bool 
          get_AssemblyIsPrivate() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      bool System.Reflection.ObfuscateAssemblyAttribute::'<AssemblyIsPrivate>k__BackingField'
    IL_0006:  ret
  } // end of method ObfuscateAssemblyAttribute::get_AssemblyIsPrivate

  .method public hidebysig specialname instance bool 
          get_StripAfterObfuscation() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      bool System.Reflection.ObfuscateAssemblyAttribute::'<StripAfterObfuscation>k__BackingField'
    IL_0006:  ret
  } // end of method ObfuscateAssemblyAttribute::get_StripAfterObfuscation

  .method public hidebysig specialname instance void 
          set_StripAfterObfuscation(bool 'value') cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  stfld      bool System.Reflection.ObfuscateAssemblyAttribute::'<StripAfterObfuscation>k__BackingField'
    IL_0007:  ret
  } // end of method ObfuscateAssemblyAttribute::set_StripAfterObfuscation

  .property instance callconv(8) bool AssemblyIsPrivate()
  {
    .get instance bool System.Reflection.ObfuscateAssemblyAttribute::get_AssemblyIsPrivate()
  } // end of property ObfuscateAssemblyAttribute::AssemblyIsPrivate
  .property instance callconv(8) bool StripAfterObfuscation()
  {
    .get instance bool System.Reflection.ObfuscateAssemblyAttribute::get_StripAfterObfuscation()
    .set instance void System.Reflection.ObfuscateAssemblyAttribute::set_StripAfterObfuscation(bool)
  } // end of property ObfuscateAssemblyAttribute::StripAfterObfuscation
} // end of class System.Reflection.ObfuscateAssemblyAttribute

.class public auto ansi sealed beforefieldinit System.Reflection.ObfuscationAttribute
       extends System.Attribute
{
  .custom instance void System.Runtime.CompilerServices.NullableContextAttribute::.ctor(uint8) = ( 01 00 02 00 00 ) 
  .custom instance void System.Runtime.CompilerServices.NullableAttribute::.ctor(uint8) = ( 01 00 00 00 00 ) 
  .custom instance void System.AttributeUsageAttribute::.ctor(valuetype System.AttributeTargets) = ( 01 00 DD 1F 00 00 02 00 54 02 0D 41 6C 6C 6F 77   // ........T..Allow
                                                                                                     4D 75 6C 74 69 70 6C 65 01 54 02 09 49 6E 68 65   // Multiple.T..Inhe
                                                                                                     72 69 74 65 64 00 )                               // rited.
  .field private bool '<StripAfterObfuscation>k__BackingField'
  .field private bool '<Exclude>k__BackingField'
  .field private bool '<ApplyToMembers>k__BackingField'
  .field private string '<Feature>k__BackingField'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       41 (0x29)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldc.i4.1
    IL_0002:  stfld      bool System.Reflection.ObfuscationAttribute::'<StripAfterObfuscation>k__BackingField'
    IL_0007:  ldarg.0
    IL_0008:  ldc.i4.1
    IL_0009:  stfld      bool System.Reflection.ObfuscationAttribute::'<Exclude>k__BackingField'
    IL_000e:  ldarg.0
    IL_000f:  ldc.i4.1
    IL_0010:  stfld      bool System.Reflection.ObfuscationAttribute::'<ApplyToMembers>k__BackingField'
    IL_0015:  ldarg.0
    IL_0016:  ldstr      "all"
    IL_001b:  stfld      string System.Reflection.ObfuscationAttribute::'<Feature>k__BackingField'
    IL_0020:  ldarg.0
    IL_0021:  call       instance void System.Attribute::.ctor()
    IL_0026:  nop
    IL_0027:  nop
    IL_0028:  ret
  } // end of method ObfuscationAttribute::.ctor

  .method public hidebysig specialname instance bool 
          get_StripAfterObfuscation() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      bool System.Reflection.ObfuscationAttribute::'<StripAfterObfuscation>k__BackingField'
    IL_0006:  ret
  } // end of method ObfuscationAttribute::get_StripAfterObfuscation

  .method public hidebysig specialname instance void 
          set_StripAfterObfuscation(bool 'value') cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  stfld      bool System.Reflection.ObfuscationAttribute::'<StripAfterObfuscation>k__BackingField'
    IL_0007:  ret
  } // end of method ObfuscationAttribute::set_StripAfterObfuscation

  .method public hidebysig specialname instance bool 
          get_Exclude() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      bool System.Reflection.ObfuscationAttribute::'<Exclude>k__BackingField'
    IL_0006:  ret
  } // end of method ObfuscationAttribute::get_Exclude

  .method public hidebysig specialname instance void 
          set_Exclude(bool 'value') cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  stfld      bool System.Reflection.ObfuscationAttribute::'<Exclude>k__BackingField'
    IL_0007:  ret
  } // end of method ObfuscationAttribute::set_Exclude

  .method public hidebysig specialname instance bool 
          get_ApplyToMembers() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      bool System.Reflection.ObfuscationAttribute::'<ApplyToMembers>k__BackingField'
    IL_0006:  ret
  } // end of method ObfuscationAttribute::get_ApplyToMembers

  .method public hidebysig specialname instance void 
          set_ApplyToMembers(bool 'value') cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  stfld      bool System.Reflection.ObfuscationAttribute::'<ApplyToMembers>k__BackingField'
    IL_0007:  ret
  } // end of method ObfuscationAttribute::set_ApplyToMembers

  .method public hidebysig specialname instance string 
          get_Feature() cil managed
  {
    // Code size       7 (0x7)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldfld      string System.Reflection.ObfuscationAttribute::'<Feature>k__BackingField'
    IL_0006:  ret
  } // end of method ObfuscationAttribute::get_Feature

  .method public hidebysig specialname instance void 
          set_Feature(string 'value') cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  ldarg.1
    IL_0002:  stfld      string System.Reflection.ObfuscationAttribute::'<Feature>k__BackingField'
    IL_0007:  ret
  } // end of method ObfuscationAttribute::set_Feature

  .property instance callconv(8) bool StripAfterObfuscation()
  {
    .get instance bool System.Reflection.ObfuscationAttribute::get_StripAfterObfuscation()
    .set instance void System.Reflection.ObfuscationAttribute::set_StripAfterObfuscation(bool)
  } // end of property ObfuscationAttribute::StripAfterObfuscation
  .property instance callconv(8) bool Exclude()
  {
    .get instance bool System.Reflection.ObfuscationAttribute::get_Exclude()
    .set instance void System.Reflection.ObfuscationAttribute::set_Exclude(bool)
  } // end of property ObfuscationAttribute::Exclude
  .property instance callconv(8) bool ApplyToMembers()
  {
    .get instance bool System.Reflection.ObfuscationAttribute::get_ApplyToMembers()
    .set instance void System.Reflection.ObfuscationAttribute::set_ApplyToMembers(bool)
  } // end of property ObfuscationAttribute::ApplyToMembers
  .property instance callconv(8) string Feature()
  {
    .get instance string System.Reflection.ObfuscationAttribute::get_Feature()
    .set instance void System.Reflection.ObfuscationAttribute::set_Feature(string)
  } // end of property ObfuscationAttribute::Feature
} // end of class System.Reflection.ObfuscationAttribute

.class private auto ansi beforefieldinit System.IO.File
       extends System.Object
{
  .method public hidebysig static uint8[] 
          ReadAllBytes(string name) cil managed internalcall
  {
  } // end of method File::ReadAllBytes

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method File::.ctor

} // end of class System.IO.File


// =============================================================

// *********** DISASSEMBLY COMPLETE ***********************
