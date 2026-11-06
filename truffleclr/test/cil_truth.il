// ECMA-335 III.3.17-18: integers and null references; i8 stack values inline, see cil_semantics.md.
// Narrow CLI values can arrive as host char; zero must still be false.
.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly HelloWorld {}
.module HelloWorld.dll
.class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object
{
  .method public static void Reference(object item) cil managed
  {
    .maxstack 8
    // brtrue
    IL_1: ldarg.0
    IL_2: brtrue IL_5
    IL_3: ldc.i4.0
    IL_4: br IL_6
    IL_5: ldc.i4.1
    IL_6: call void [System.Console]System.Console::WriteLine(int32)
    // brfalse
    IL_8: ldarg.0
    IL_9: brfalse IL_12
    IL_10: ldc.i4.0
    IL_11: br IL_13
    IL_12: ldc.i4.1
    IL_13: call void [System.Console]System.Console::WriteLine(int32)
    IL_14: ret
  }
  .method public static void Number32(int32 item) cil managed
  {
    .maxstack 8
    // brtrue
    IL_1: ldarg.0
    IL_2: brtrue.s IL_5
    IL_3: ldc.i4.0
    IL_4: br IL_6
    IL_5: ldc.i4.1
    IL_6: call void [System.Console]System.Console::WriteLine(int32)
    // brfalse
    IL_8: ldarg.0
    IL_9: brfalse.s IL_12
    IL_10: ldc.i4.0
    IL_11: br IL_13
    IL_12: ldc.i4.1
    IL_13: call void [System.Console]System.Console::WriteLine(int32)
    IL_14: ret
  }
  .method public static void Boolean(bool item) cil managed
  {
    .maxstack 8
    // brtrue
    IL_1: ldarg.0
    IL_2: brtrue.s IL_5
    IL_3: ldc.i4.0
    IL_4: br IL_6
    IL_5: ldc.i4.1
    IL_6: call void [System.Console]System.Console::WriteLine(int32)
    // brfalse
    IL_8: ldarg.0
    IL_9: brfalse.s IL_12
    IL_10: ldc.i4.0
    IL_11: br IL_13
    IL_12: ldc.i4.1
    IL_13: call void [System.Console]System.Console::WriteLine(int32)
    IL_14: ret
  }
  .method public static void Main(string[] args) cil managed
  {
    .entrypoint
    .maxstack 8
    .locals init (bool V_0)
    IL_0: ldstr "ldnull"
    IL_1: call void [System.Console]System.Console::WriteLine(string)
    IL_2: ldnull
    IL_3: call void HelloWorld.Program::Reference(object)
    IL_4: ldstr "null array element"
    IL_5: call void [System.Console]System.Console::WriteLine(string)
    IL_6: ldc.i4.1
    IL_7: newarr [System.Runtime]System.Object
    IL_8: ldc.i4.0
    IL_9: ldelem.ref
    IL_10: call void HelloWorld.Program::Reference(object)
    IL_11: ldstr "empty string"
    IL_12: call void [System.Console]System.Console::WriteLine(string)
    IL_13: ldstr ""
    IL_14: call void HelloWorld.Program::Reference(object)
    IL_15: ldstr "nonempty string"
    IL_16: call void [System.Console]System.Console::WriteLine(string)
    IL_17: ldstr "alive"
    IL_18: call void HelloWorld.Program::Reference(object)
    IL_19: ldstr "empty array"
    IL_20: call void [System.Console]System.Console::WriteLine(string)
    IL_21: ldc.i4.0
    IL_22: newarr [System.Runtime]System.Object
    IL_23: call void HelloWorld.Program::Reference(object)
    IL_24: ldstr "new object"
    IL_25: call void [System.Console]System.Console::WriteLine(string)
    IL_26: newobj instance void [System.Runtime]System.Object::.ctor()
    IL_27: call void HelloWorld.Program::Reference(object)
    IL_28: ldstr "i4 0"
    IL_29: call void [System.Console]System.Console::WriteLine(string)
    IL_30: ldc.i4 0
    IL_31: call void HelloWorld.Program::Number32(int32)
    IL_32: ldstr "i4 -1"
    IL_33: call void [System.Console]System.Console::WriteLine(string)
    IL_34: ldc.i4 -1
    IL_35: call void HelloWorld.Program::Number32(int32)
    IL_36: ldstr "i4 1"
    IL_37: call void [System.Console]System.Console::WriteLine(string)
    IL_38: ldc.i4 1
    IL_39: call void HelloWorld.Program::Number32(int32)
    IL_40: ldstr "i8 0"
    IL_41: call void [System.Console]System.Console::WriteLine(string)
    // brtrue i8
    IL_43: ldc.i8 0
    IL_44: brtrue IL_47
    IL_45: ldc.i4.0
    IL_46: br IL_48
    IL_47: ldc.i4.1
    IL_48: call void [System.Console]System.Console::WriteLine(int32)
    // brfalse i8
    IL_50: ldc.i8 0
    IL_51: brfalse IL_54
    IL_52: ldc.i4.0
    IL_53: br IL_55
    IL_54: ldc.i4.1
    IL_55: call void [System.Console]System.Console::WriteLine(int32)
    IL_56: ldstr "i8 -1"
    IL_57: call void [System.Console]System.Console::WriteLine(string)
    // brtrue i8
    IL_59: ldc.i8 -1
    IL_60: brtrue IL_63
    IL_61: ldc.i4.0
    IL_62: br IL_64
    IL_63: ldc.i4.1
    IL_64: call void [System.Console]System.Console::WriteLine(int32)
    // brfalse i8
    IL_66: ldc.i8 -1
    IL_67: brfalse IL_70
    IL_68: ldc.i4.0
    IL_69: br IL_71
    IL_70: ldc.i4.1
    IL_71: call void [System.Console]System.Console::WriteLine(int32)
    IL_72: ldstr "i8 1"
    IL_73: call void [System.Console]System.Console::WriteLine(string)
    // brtrue i8
    IL_75: ldc.i8 1
    IL_76: brtrue IL_79
    IL_77: ldc.i4.0
    IL_78: br IL_80
    IL_79: ldc.i4.1
    IL_80: call void [System.Console]System.Console::WriteLine(int32)
    // brfalse i8
    IL_82: ldc.i8 1
    IL_83: brfalse IL_86
    IL_84: ldc.i4.0
    IL_85: br IL_87
    IL_86: ldc.i4.1
    IL_87: call void [System.Console]System.Console::WriteLine(int32)
    IL_88: ldstr "i8 4294967296"
    IL_89: call void [System.Console]System.Console::WriteLine(string)
    // brtrue i8
    IL_91: ldc.i8 4294967296
    IL_92: brtrue IL_95
    IL_93: ldc.i4.0
    IL_94: br IL_96
    IL_95: ldc.i4.1
    IL_96: call void [System.Console]System.Console::WriteLine(int32)
    // brfalse i8
    IL_98: ldc.i8 4294967296
    IL_99: brfalse IL_102
    IL_100: ldc.i4.0
    IL_101: br IL_103
    IL_102: ldc.i4.1
    IL_103: call void [System.Console]System.Console::WriteLine(int32)
    IL_104: ldstr "i8 -9223372036854775808"
    IL_105: call void [System.Console]System.Console::WriteLine(string)
    // brtrue i8
    IL_107: ldc.i8 -9223372036854775808
    IL_108: brtrue IL_111
    IL_109: ldc.i4.0
    IL_110: br IL_112
    IL_111: ldc.i4.1
    IL_112: call void [System.Console]System.Console::WriteLine(int32)
    // brfalse i8
    IL_114: ldc.i8 -9223372036854775808
    IL_115: brfalse IL_118
    IL_116: ldc.i4.0
    IL_117: br IL_119
    IL_118: ldc.i4.1
    IL_119: call void [System.Console]System.Console::WriteLine(int32)
    IL_120: ldstr "bool 0"
    IL_121: call void [System.Console]System.Console::WriteLine(string)
    IL_122: ldc.i4.0
    IL_123: stloc.0
    IL_124: ldloc.0
    IL_125: call void HelloWorld.Program::Boolean(bool)
    IL_126: ldstr "bool 1"
    IL_127: call void [System.Console]System.Console::WriteLine(string)
    IL_128: ldc.i4.1
    IL_129: stloc.0
    IL_130: ldloc.0
    IL_131: call void HelloWorld.Program::Boolean(bool)
    IL_132: ldstr "zero character array element"
    IL_133: call void [System.Console]System.Console::WriteLine(string)
    IL_134: ldc.i4.1
    IL_135: newarr [System.Runtime]System.Char
    IL_136: ldc.i4.0
    IL_137: ldelem.u2
    IL_138: call void HelloWorld.Program::Number32(int32)
    IL_139: ldstr "zero character return"
    IL_140: call void [System.Console]System.Console::WriteLine(string)
    IL_141: ldc.i4.0
    IL_142: call char [System.Runtime]System.Convert::ToChar(int32)
    IL_143: call void HelloWorld.Program::Number32(int32)
    IL_144: ldstr "nonzero character return"
    IL_145: call void [System.Console]System.Console::WriteLine(string)
    IL_146: ldc.i4.1
    IL_147: call char [System.Runtime]System.Convert::ToChar(int32)
    IL_148: call void HelloWorld.Program::Number32(int32)
    IL_149: ret
  }
}
