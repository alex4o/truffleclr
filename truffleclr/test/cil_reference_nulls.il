// ECMA-335 III.3.14, III.3.21, III.3.23: CIL null equality is independent of host representation.
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
    IL_0: ldstr "ldnull / ldnull"
    IL_1: call void [System.Console]System.Console::WriteLine(string)
    IL_2: ldnull
    IL_3: ldnull
    IL_4: ceq
    IL_5: call void [System.Console]System.Console::WriteLine(int32)
    IL_6: ldstr "array null / ldnull"
    IL_7: call void [System.Console]System.Console::WriteLine(string)
    IL_8: ldc.i4.1
    IL_9: newarr [System.Runtime]System.Object
    IL_10: ldc.i4.0
    IL_11: ldelem.ref
    IL_12: ldnull
    IL_13: ceq
    IL_14: call void [System.Console]System.Console::WriteLine(int32)
    IL_15: ldstr "ldnull / array null"
    IL_16: call void [System.Console]System.Console::WriteLine(string)
    IL_17: ldnull
    IL_18: ldc.i4.1
    IL_19: newarr [System.Runtime]System.Object
    IL_20: ldc.i4.0
    IL_21: ldelem.ref
    IL_22: ceq
    IL_23: call void [System.Console]System.Console::WriteLine(int32)
    IL_24: ldstr "array null / array null"
    IL_25: call void [System.Console]System.Console::WriteLine(string)
    IL_26: ldc.i4.1
    IL_27: newarr [System.Runtime]System.Object
    IL_28: ldc.i4.0
    IL_29: ldelem.ref
    IL_30: ldc.i4.1
    IL_31: newarr [System.Runtime]System.Object
    IL_32: ldc.i4.0
    IL_33: ldelem.ref
    IL_34: ceq
    IL_35: call void [System.Console]System.Console::WriteLine(int32)
    IL_36: ldstr "array null cgt.un ldnull"
    IL_37: call void [System.Console]System.Console::WriteLine(string)
    IL_38: ldc.i4.1
    IL_39: newarr [System.Runtime]System.Object
    IL_40: ldc.i4.0
    IL_41: ldelem.ref
    IL_42: ldnull
    IL_43: cgt.un
    IL_44: call void [System.Console]System.Console::WriteLine(int32)
    IL_45: ldstr "object cgt.un ldnull"
    IL_46: call void [System.Console]System.Console::WriteLine(string)
    IL_47: newobj instance void [System.Runtime]System.Object::.ctor()
    IL_48: ldnull
    IL_49: cgt.un
    IL_50: call void [System.Console]System.Console::WriteLine(int32)
    IL_51: ldstr "different objects"
    IL_52: call void [System.Console]System.Console::WriteLine(string)
    IL_53: newobj instance void [System.Runtime]System.Object::.ctor()
    IL_54: newobj instance void [System.Runtime]System.Object::.ctor()
    IL_55: ceq
    IL_56: call void [System.Console]System.Console::WriteLine(int32)
    IL_57: ldstr "same object"
    IL_58: call void [System.Console]System.Console::WriteLine(string)
    IL_59: newobj instance void [System.Runtime]System.Object::.ctor()
    IL_60: dup
    IL_61: ceq
    IL_62: call void [System.Console]System.Console::WriteLine(int32)
    IL_63: ldstr "null representations bne.un"
    IL_64: call void [System.Console]System.Console::WriteLine(string)
    IL_65: ldc.i4.1
    IL_66: newarr [System.Runtime]System.Object
    IL_67: ldc.i4.0
    IL_68: ldelem.ref
    IL_69: ldnull
    IL_70: bne.un IL_73
    IL_71: ldc.i4.0
    IL_72: br IL_74
    IL_73: ldc.i4.1
    IL_74: call void [System.Console]System.Console::WriteLine(int32)
    IL_75: ldstr "null representations reversed bne.un"
    IL_76: call void [System.Console]System.Console::WriteLine(string)
    IL_77: ldnull
    IL_78: ldc.i4.1
    IL_79: newarr [System.Runtime]System.Object
    IL_80: ldc.i4.0
    IL_81: ldelem.ref
    IL_82: bne.un IL_85
    IL_83: ldc.i4.0
    IL_84: br IL_86
    IL_85: ldc.i4.1
    IL_86: call void [System.Console]System.Console::WriteLine(int32)
    IL_87: ldstr "null versus instance bne.un"
    IL_88: call void [System.Console]System.Console::WriteLine(string)
    IL_89: ldc.i4.1
    IL_90: newarr [System.Runtime]System.Object
    IL_91: ldc.i4.0
    IL_92: ldelem.ref
    IL_93: newobj instance void [System.Runtime]System.Object::.ctor()
    IL_94: bne.un IL_97
    IL_95: ldc.i4.0
    IL_96: br IL_98
    IL_97: ldc.i4.1
    IL_98: call void [System.Console]System.Console::WriteLine(int32)
    IL_99: ret
  }
}
