// ECMA-335 III.3.21-26: comparison results are int32 0/1. Boolean formatting is a BCL boundary.
.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly HelloWorld {}
.module HelloWorld.dll
.class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object
{
  .method public static void Main(string[] args) cil managed
  {
    .entrypoint
    .maxstack 8
    .locals init (int32 V_0, bool V_1)
    // ceq -> int32, usable directly in add.
    IL_1: ldc.i4.1
    IL_2: ldc.i4.1
    IL_3: ceq
    IL_4: ldc.i4.2
    IL_5: add
    IL_6: call void [System.Console]System.Console::WriteLine(int32)
    // clt -> int32, usable in mul.
    IL_8: ldc.i4.1
    IL_9: ldc.i4.2
    IL_10: clt
    IL_11: ldc.i4.3
    IL_12: mul
    IL_13: call void [System.Console]System.Console::WriteLine(int32)
    // cgt -> int32, usable in sub.
    IL_15: ldc.i4.3
    IL_16: ldc.i4.1
    IL_17: cgt
    IL_18: ldc.i4.4
    IL_19: sub
    IL_20: call void [System.Console]System.Console::WriteLine(int32)
    // Chained comparison and int32 local storage.
    IL_22: ldc.i4.1
    IL_23: ldc.i4.1
    IL_24: ceq
    IL_25: stloc.0
    IL_26: ldloc.0
    IL_27: ldc.i4.0
    IL_28: cgt
    IL_29: call void [System.Console]System.Console::WriteLine(int32)
    // i8 comparison still returns int32 (not int64).
    IL_31: ldc.i8 -1
    IL_32: ldc.i8 0
    IL_33: cgt.un
    IL_34: ldc.i4.5
    IL_35: add
    IL_36: call void [System.Console]System.Console::WriteLine(int32)
    // Float comparisons also return int32.
    IL_38: ldc.r8 1.0
    IL_39: ldc.r8 2.0
    IL_40: clt
    IL_41: ldc.i4.1
    IL_42: add
    IL_43: call void [System.Console]System.Console::WriteLine(int32)
    IL_44: ldc.r4 1.0
    IL_45: ldc.r4 2.0
    IL_46: clt
    IL_47: ldc.i4.1
    IL_48: add
    IL_49: call void [System.Console]System.Console::WriteLine(int32)
    // Comparison results can be used as array indices.
    IL_51: ldc.i4.2
    IL_52: newarr [System.Runtime]System.Int32
    IL_53: dup
    IL_54: ldc.i4.0
    IL_55: ldc.i4.s 41
    IL_56: stelem.i4
    IL_57: dup
    IL_58: ldc.i4.1
    IL_59: ldc.i4.s 42
    IL_60: stelem.i4
    IL_61: ldc.i4.1
    IL_62: ldc.i4.1
    IL_63: ceq
    IL_64: ldelem.i4
    IL_65: call void [System.Console]System.Console::WriteLine(int32)
    // Boolean storage/BCL boundaries preserve True/False formatting.
    IL_67: ldc.i4.1
    IL_68: ldc.i4.1
    IL_69: ceq
    IL_70: stloc.1
    IL_71: ldloc.1
    IL_72: call void [System.Console]System.Console::WriteLine(bool)
    IL_73: ldc.i4.0
    IL_74: ldloc.1
    IL_75: clt
    IL_76: call void [System.Console]System.Console::WriteLine(int32)
    IL_77: ldloc.1
    IL_78: ldc.i4.m1
    IL_79: cgt
    IL_80: call void [System.Console]System.Console::WriteLine(int32)
    IL_81: ldloc.1
    IL_82: ldc.i4.m1
    IL_83: cgt.un
    IL_84: call void [System.Console]System.Console::WriteLine(int32)
    IL_85: ldc.i4.m1
    IL_86: ldloc.1
    IL_87: cgt.un
    IL_88: call void [System.Console]System.Console::WriteLine(int32)
    IL_89: ldc.i4.1
    IL_90: ldc.i4.2
    IL_91: ceq
    IL_92: stloc.1
    IL_93: ldloc.1
    IL_94: call void [System.Console]System.Console::WriteLine(bool)
    // Passing a comparison directly to the Boolean overload is also valid.
    IL_96: ldc.i4.1
    IL_97: ldc.i4.2
    IL_98: clt
    IL_99: call void [System.Console]System.Console::WriteLine(bool)
    IL_100: ret
  }
}
