// Direct IL coverage for opcodes not normally emitted by safe C#.
// Expected output verified by .NET 10 ilasm + dotnet, not the interpreter.
.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly managed_opcodes {}
.module managed_opcodes.dll
.class public sequential ansi sealed HelloWorld.Point extends [System.Runtime]System.ValueType {
    .field public int32 X
}
.class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object {
    .field public static int32 Number
    .method public static int32 Argument(int32 x) cil managed {
        .maxstack 3
        L_0: ldc.i4.8
        L_1: starg.s x
        L_2: ldarga.s x
        L_3: dup
        L_4: ldind.i4
        L_5: ldc.i4.1
        L_6: add
        L_7: stind.i4
        L_8: ldarg.0
        L_9: ret
    }
    .method public static void Main() cil managed {
        .entrypoint
        .maxstack 3
        .locals init (valuetype HelloWorld.Point V_0, valuetype HelloWorld.Point V_1, object V_2, int32[] V_3, uint8[] V_4)
        L_10: ldloca.s V_0
        L_11: initobj HelloWorld.Point
        L_12: ldloca.s V_0
        L_13: ldc.i4.s 12
        L_14: stfld int32 HelloWorld.Point::X
        L_15: ldloca.s V_1
        L_16: ldloca.s V_0
        L_17: cpobj HelloWorld.Point
        L_18: ldloca.s V_1
        L_19: ldflda int32 HelloWorld.Point::X
        L_20: ldc.i4.s 20
        L_21: stind.i4
        L_22: ldloc.0
        L_23: ldfld int32 HelloWorld.Point::X
        L_24: call void [System.Console]System.Console::WriteLine(int32)
        L_25: ldloc.1
        L_26: ldfld int32 HelloWorld.Point::X
        L_27: call void [System.Console]System.Console::WriteLine(int32)
        L_28: ldloc.0
        L_29: box HelloWorld.Point
        L_30: stloc.2
        L_31: ldloc.2
        L_32: unbox HelloWorld.Point
        L_33: ldflda int32 HelloWorld.Point::X
        L_34: ldc.i4.s 33
        L_35: stind.i4
        L_36: ldloc.2
        L_37: unbox.any HelloWorld.Point
        L_38: ldfld int32 HelloWorld.Point::X
        L_39: call void [System.Console]System.Console::WriteLine(int32)
        L_40: ldloc.0
        L_41: ldfld int32 HelloWorld.Point::X
        L_42: call void [System.Console]System.Console::WriteLine(int32)
        L_43: ldloca.s V_0
        L_44: ldflda int32 HelloWorld.Point::X
        L_45: ldloca.s V_0
        L_46: ldflda int32 HelloWorld.Point::X
        L_47: ceq
        L_48: call void [System.Console]System.Console::WriteLine(bool)
        L_49: ldsflda int32 HelloWorld.Program::Number
        L_50: ldsflda int32 HelloWorld.Program::Number
        L_51: ceq
        L_52: call void [System.Console]System.Console::WriteLine(bool)
        L_53: ldc.i4.2
        L_54: newarr [System.Runtime]System.Int32
        L_55: stloc.3
        L_56: ldloc.3
        L_57: ldc.i4.0
        L_58: ldelema [System.Runtime]System.Int32
        L_59: ldloc.3
        L_60: ldc.i4.0
        L_61: readonly.
        L_62: ldelema [System.Runtime]System.Int32
        L_63: ceq
        L_64: call void [System.Console]System.Console::WriteLine(bool)
        L_65: ldloc.3
        L_66: ldc.i4.0
        L_67: ldelema [System.Runtime]System.Int32
        L_68: ldloc.3
        L_69: ldc.i4.1
        L_70: ldelema [System.Runtime]System.Int32
        L_71: ceq
        L_72: call void [System.Console]System.Console::WriteLine(bool)
        L_73: ldc.i4.1
        L_74: call int32 HelloWorld.Program::Argument(int32)
        L_75: call void [System.Console]System.Console::WriteLine(int32)
        L_76: ldc.i4.m1
        L_77: conv.u
        L_78: conv.u8
        L_79: call void [System.Console]System.Console::WriteLine(uint64)
        L_80: ldc.i4.1
        L_81: newarr [System.Runtime]System.Byte
        L_82: stloc.s V_4
        L_83: ldloc.s V_4
        L_84: ldc.i4.0
        L_85: ldc.i4 255
        L_86: stelem.i1
        L_87: ldloc.s V_4
        L_88: ldc.i4.0
        L_89: ldelema [System.Runtime]System.Byte
        L_90: ldobj [System.Runtime]System.Byte
        L_91: call void [System.Console]System.Console::WriteLine(int32)
        L_92: ldloc.s V_4
        L_93: ldc.i4.0
        L_94: ldelem [System.Runtime]System.Byte
        L_95: call void [System.Console]System.Console::WriteLine(int32)
        L_96: ret
    }
}
