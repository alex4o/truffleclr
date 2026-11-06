// ECMA-335 III.3.5-14, III.3.21-26, III.3.31. See cil_semantics.md for the output matrix.
.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly HelloWorld {}
.module HelloWorld.dll
.class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object
{
  .method public static void Compare(float64 left, float64 right) cil managed
  {
    .maxstack 8
    // ceq
    IL_1: ldarg.0
    IL_2: ldarg.1
    IL_3: ceq
    IL_4: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_6: ldarg.0
    IL_7: ldarg.1
    IL_8: cgt
    IL_9: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_11: ldarg.0
    IL_12: ldarg.1
    IL_13: cgt.un
    IL_14: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_16: ldarg.0
    IL_17: ldarg.1
    IL_18: clt
    IL_19: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_21: ldarg.0
    IL_22: ldarg.1
    IL_23: clt.un
    IL_24: call void [System.Console]System.Console::WriteLine(int32)
    // beq
    IL_26: ldarg.0
    IL_27: ldarg.1
    IL_28: beq IL_31
    IL_29: ldc.i4.0
    IL_30: br IL_32
    IL_31: ldc.i4.1
    IL_32: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un
    IL_34: ldarg.0
    IL_35: ldarg.1
    IL_36: bne.un IL_39
    IL_37: ldc.i4.0
    IL_38: br IL_40
    IL_39: ldc.i4.1
    IL_40: call void [System.Console]System.Console::WriteLine(int32)
    // bgt
    IL_42: ldarg.0
    IL_43: ldarg.1
    IL_44: bgt IL_47
    IL_45: ldc.i4.0
    IL_46: br IL_48
    IL_47: ldc.i4.1
    IL_48: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un
    IL_50: ldarg.0
    IL_51: ldarg.1
    IL_52: bgt.un IL_55
    IL_53: ldc.i4.0
    IL_54: br IL_56
    IL_55: ldc.i4.1
    IL_56: call void [System.Console]System.Console::WriteLine(int32)
    // bge
    IL_58: ldarg.0
    IL_59: ldarg.1
    IL_60: bge IL_63
    IL_61: ldc.i4.0
    IL_62: br IL_64
    IL_63: ldc.i4.1
    IL_64: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un
    IL_66: ldarg.0
    IL_67: ldarg.1
    IL_68: bge.un IL_71
    IL_69: ldc.i4.0
    IL_70: br IL_72
    IL_71: ldc.i4.1
    IL_72: call void [System.Console]System.Console::WriteLine(int32)
    // blt
    IL_74: ldarg.0
    IL_75: ldarg.1
    IL_76: blt IL_79
    IL_77: ldc.i4.0
    IL_78: br IL_80
    IL_79: ldc.i4.1
    IL_80: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un
    IL_82: ldarg.0
    IL_83: ldarg.1
    IL_84: blt.un IL_87
    IL_85: ldc.i4.0
    IL_86: br IL_88
    IL_87: ldc.i4.1
    IL_88: call void [System.Console]System.Console::WriteLine(int32)
    // ble
    IL_90: ldarg.0
    IL_91: ldarg.1
    IL_92: ble IL_95
    IL_93: ldc.i4.0
    IL_94: br IL_96
    IL_95: ldc.i4.1
    IL_96: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un
    IL_98: ldarg.0
    IL_99: ldarg.1
    IL_100: ble.un IL_103
    IL_101: ldc.i4.0
    IL_102: br IL_104
    IL_103: ldc.i4.1
    IL_104: call void [System.Console]System.Console::WriteLine(int32)
    IL_105: ret
  }
  .method public static void Main(string[] args) cil managed
  {
    .entrypoint
    .maxstack 8
    IL_0: ldstr "positive-zero / negative-zero"
    IL_1: call void [System.Console]System.Console::WriteLine(string)
    IL_2: ldc.r8 0.0
    IL_3: ldc.r8 -0.0
    IL_4: call void HelloWorld.Program::Compare(float64,float64)
    IL_5: ldstr "negative-zero / positive-zero"
    IL_6: call void [System.Console]System.Console::WriteLine(string)
    IL_7: ldc.r8 -0.0
    IL_8: ldc.r8 0.0
    IL_9: call void HelloWorld.Program::Compare(float64,float64)
    IL_10: ldstr "NaN / one"
    IL_11: call void [System.Console]System.Console::WriteLine(string)
    IL_12: ldc.r8 0.0
    IL_13: ldc.r8 0.0
    IL_14: div
    IL_15: ldc.r8 1.0
    IL_16: call void HelloWorld.Program::Compare(float64,float64)
    IL_17: ldstr "one / NaN"
    IL_18: call void [System.Console]System.Console::WriteLine(string)
    IL_19: ldc.r8 1.0
    IL_20: ldc.r8 0.0
    IL_21: ldc.r8 0.0
    IL_22: div
    IL_23: call void HelloWorld.Program::Compare(float64,float64)
    IL_24: ldstr "NaN / NaN"
    IL_25: call void [System.Console]System.Console::WriteLine(string)
    IL_26: ldc.r8 0.0
    IL_27: ldc.r8 0.0
    IL_28: div
    IL_29: ldc.r8 0.0
    IL_30: ldc.r8 0.0
    IL_31: div
    IL_32: call void HelloWorld.Program::Compare(float64,float64)
    IL_33: ldstr "infinity / one"
    IL_34: call void [System.Console]System.Console::WriteLine(string)
    IL_35: ldc.r8 1.0
    IL_36: ldc.r8 0.0
    IL_37: div
    IL_38: ldc.r8 1.0
    IL_39: call void HelloWorld.Program::Compare(float64,float64)
    IL_40: ldstr "one / infinity"
    IL_41: call void [System.Console]System.Console::WriteLine(string)
    IL_42: ldc.r8 1.0
    IL_43: ldc.r8 1.0
    IL_44: ldc.r8 0.0
    IL_45: div
    IL_46: call void HelloWorld.Program::Compare(float64,float64)
    IL_47: ldstr "negative-infinity / one"
    IL_48: call void [System.Console]System.Console::WriteLine(string)
    IL_49: ldc.r8 -1.0
    IL_50: ldc.r8 0.0
    IL_51: div
    IL_52: ldc.r8 1.0
    IL_53: call void HelloWorld.Program::Compare(float64,float64)
    IL_54: ldstr "one / negative-infinity"
    IL_55: call void [System.Console]System.Console::WriteLine(string)
    IL_56: ldc.r8 1.0
    IL_57: ldc.r8 -1.0
    IL_58: ldc.r8 0.0
    IL_59: div
    IL_60: call void HelloWorld.Program::Compare(float64,float64)
    IL_61: ldstr "infinity / infinity"
    IL_62: call void [System.Console]System.Console::WriteLine(string)
    IL_63: ldc.r8 1.0
    IL_64: ldc.r8 0.0
    IL_65: div
    IL_66: ldc.r8 1.0
    IL_67: ldc.r8 0.0
    IL_68: div
    IL_69: call void HelloWorld.Program::Compare(float64,float64)
    IL_70: ret
  }
}
