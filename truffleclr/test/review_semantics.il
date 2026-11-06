// Direct IL regressions; expected output recorded with .NET 10.
// Every instruction is labeled for the CIL parser.
.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly review_semantics {}
.module review_semantics.dll
.class public sequential ansi sealed HelloWorld.Point extends [System.Runtime]System.ValueType {
    .field public int32 X
    .method public instance int32 ReadThis() cil managed {
        .maxstack 8
        // Taking the this-slot address must not change the later ldarg.0 type.
        L_0: ldarga.s 0
        L_1: pop
        L_2: ldarg.0
        L_3: ldobj HelloWorld.Point
        L_4: ldfld int32 HelloWorld.Point::X
        L_5: ret
    }
    .method public instance int32 ReadThisSlot() cil managed {
        .maxstack 8
        // The this slot contains a managed pointer, not a struct value.
        L_6: ldarga.s 0
        L_7: ldind.ref
        L_8: ldobj HelloWorld.Point
        L_9: ldfld int32 HelloWorld.Point::X
        L_10: ret
    }
}
.class public auto ansi sealed HelloWorld.Kind extends [System.Runtime]System.Enum {
    .field public specialname rtspecialname int32 value__
}
.class public auto ansi HelloWorld.Item extends [System.Runtime]System.Object {}
.class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object {
    .method public static string LiteralA() cil managed {
        .maxstack 8
        L_11: ldstr "interned across methods"
        L_12: ret
    }
    .method public static string LiteralB() cil managed {
        .maxstack 8
        L_13: ldstr "interned across methods"
        L_14: ret
    }
    .method public static void Main() cil managed {
        .maxstack 8
        .locals init (valuetype HelloWorld.Point V_0, object V_1, string[] V_2, class [System.Runtime]System.ValueType[] V_3, object[] V_4)
        .entrypoint
        // readonly. permits a covariant array element address using System.Object.
        L_15: ldc.i4.1
        L_16: newarr [System.Runtime]System.String
        L_17: stloc.2
        L_18: ldloc.2
        L_19: ldc.i4.0
        L_20: ldstr "readonly covariance"
        L_21: stelem.ref
        L_22: ldloc.2
        L_23: ldc.i4.0
        L_24: readonly.
        L_25: ldelema [System.Runtime]System.Object
        L_26: ldind.ref
        L_27: call void [System.Console]System.Console::WriteLine(string)
        // Initialize a struct used by boxed-array and implicit-this tests.
        L_28: ldloca.s V_0
        L_29: initobj HelloWorld.Point
        L_30: ldloca.s V_0
        L_31: ldc.i4.s 42
        L_32: stfld int32 HelloWorld.Point::X
        // [System.Runtime]System.ValueType[] accepts boxed primitive and user value types.
        L_33: ldc.i4.2
        L_34: newarr [System.Runtime]System.ValueType
        L_35: stloc.s V_3
        L_36: ldloc.s V_3
        L_37: ldc.i4.0
        L_38: ldc.i4.s 17
        L_39: box [System.Runtime]System.Int32
        L_40: stelem.ref
        L_41: ldloc.s V_3
        L_42: ldc.i4.1
        L_43: ldloc.0
        L_44: box HelloWorld.Point
        L_45: stelem.ref
        L_46: ldloc.s V_3
        L_47: ldc.i4.0
        L_48: ldelem.ref
        L_49: isinst [System.Runtime]System.Int32
        L_50: ldnull
        L_51: cgt.un
        L_52: call void [System.Console]System.Console::WriteLine(bool)
        L_53: ldloc.s V_3
        L_54: ldc.i4.0
        L_55: ldelem.ref
        L_56: unbox.any [System.Runtime]System.Int32
        L_57: call void [System.Console]System.Console::WriteLine(int32)
        L_58: ldloc.s V_3
        L_59: ldc.i4.1
        L_60: ldelem.ref
        L_61: isinst HelloWorld.Point
        L_62: ldnull
        L_63: cgt.un
        L_64: call void [System.Console]System.Console::WriteLine(bool)
        L_65: ldloc.s V_3
        L_66: ldc.i4.1
        L_67: ldelem.ref
        L_68: unbox.any HelloWorld.Point
        L_69: ldfld int32 HelloWorld.Point::X
        L_70: call void [System.Console]System.Console::WriteLine(int32)
        // [System.Runtime]System.Object[] accepts boxed primitive and user value types.
        L_71: ldc.i4.2
        L_72: newarr [System.Runtime]System.Object
        L_73: stloc.s V_4
        L_74: ldloc.s V_4
        L_75: ldc.i4.0
        L_76: ldc.i4.s 17
        L_77: box [System.Runtime]System.Int32
        L_78: stelem.ref
        L_79: ldloc.s V_4
        L_80: ldc.i4.1
        L_81: ldloc.0
        L_82: box HelloWorld.Point
        L_83: stelem.ref
        L_84: ldloc.s V_4
        L_85: ldc.i4.0
        L_86: ldelem.ref
        L_87: isinst [System.Runtime]System.Int32
        L_88: ldnull
        L_89: cgt.un
        L_90: call void [System.Console]System.Console::WriteLine(bool)
        L_91: ldloc.s V_4
        L_92: ldc.i4.0
        L_93: ldelem.ref
        L_94: unbox.any [System.Runtime]System.Int32
        L_95: call void [System.Console]System.Console::WriteLine(int32)
        L_96: ldloc.s V_4
        L_97: ldc.i4.1
        L_98: ldelem.ref
        L_99: isinst HelloWorld.Point
        L_100: ldnull
        L_101: cgt.un
        L_102: call void [System.Console]System.Console::WriteLine(bool)
        L_103: ldloc.s V_4
        L_104: ldc.i4.1
        L_105: ldelem.ref
        L_106: unbox.any HelloWorld.Point
        L_107: ldfld int32 HelloWorld.Point::X
        L_108: call void [System.Console]System.Console::WriteLine(int32)
        // Unsigned floating conversion from r4 above signed maxima.
        L_109: ldc.r4 3000000000.0
        L_110: conv.u4
        L_111: call void [System.Console]System.Console::WriteLine(uint32)
        L_112: ldc.r4 9223372036854775808.0
        L_113: conv.u8
        L_114: call void [System.Console]System.Console::WriteLine(uint64)
        L_115: ldc.r4 13835058055282163712.0
        L_116: conv.u8
        L_117: call void [System.Console]System.Console::WriteLine(uint64)
        // Unsigned floating conversion from r8 above signed maxima.
        L_118: ldc.r8 3000000000.0
        L_119: conv.u4
        L_120: call void [System.Console]System.Console::WriteLine(uint32)
        L_121: ldc.r8 9223372036854775808.0
        L_122: conv.u8
        L_123: call void [System.Console]System.Console::WriteLine(uint64)
        L_124: ldc.r8 13835058055282163712.0
        L_125: conv.u8
        L_126: call void [System.Console]System.Console::WriteLine(uint64)
        // box [System.Runtime]System.String is an identity operation for references, including null.
        L_127: ldstr "box identity"
        L_128: dup
        L_129: box [System.Runtime]System.String
        L_130: ceq
        L_131: call void [System.Console]System.Console::WriteLine(bool)
        L_132: ldnull
        L_133: box [System.Runtime]System.String
        L_134: ldnull
        L_135: ceq
        L_136: call void [System.Console]System.Console::WriteLine(bool)
        // box [System.Runtime]System.Object is an identity operation for references, including null.
        L_137: ldstr "object identity"
        L_138: dup
        L_139: box [System.Runtime]System.Object
        L_140: ceq
        L_141: call void [System.Console]System.Console::WriteLine(bool)
        L_142: ldnull
        L_143: box [System.Runtime]System.Object
        L_144: ldnull
        L_145: ceq
        L_146: call void [System.Console]System.Console::WriteLine(bool)
        // box int32[] is an identity operation for references, including null.
        L_147: ldc.i4.1
        L_148: newarr [System.Runtime]System.Int32
        L_149: dup
        L_150: box int32[]
        L_151: ceq
        L_152: call void [System.Console]System.Console::WriteLine(bool)
        L_153: ldnull
        L_154: box int32[]
        L_155: ldnull
        L_156: ceq
        L_157: call void [System.Console]System.Console::WriteLine(bool)
        // ldstr is interned across method boundaries.
        L_158: call string HelloWorld.Program::LiteralA()
        L_159: call string HelloWorld.Program::LiteralB()
        L_160: ceq
        L_161: call void [System.Console]System.Console::WriteLine(bool)
        // unbox.any [System.Runtime]System.String has castclass identity/null semantics.
        L_162: ldstr "unbox reference"
        L_163: dup
        L_164: unbox.any [System.Runtime]System.String
        L_165: ceq
        L_166: call void [System.Console]System.Console::WriteLine(bool)
        L_167: ldnull
        L_168: unbox.any [System.Runtime]System.String
        L_169: ldnull
        L_170: ceq
        L_171: call void [System.Console]System.Console::WriteLine(bool)
        // unbox.any int32[] has castclass identity/null semantics.
        L_172: ldc.i4.1
        L_173: newarr [System.Runtime]System.Int32
        L_174: dup
        L_175: unbox.any int32[]
        L_176: ceq
        L_177: call void [System.Console]System.Console::WriteLine(bool)
        L_178: ldnull
        L_179: unbox.any int32[]
        L_180: ldnull
        L_181: ceq
        L_182: call void [System.Console]System.Console::WriteLine(bool)
        // unbox.any valuetype HelloWorld.Point[] has castclass identity/null semantics.
        L_183: ldc.i4.1
        L_184: newarr HelloWorld.Point
        L_185: dup
        L_186: unbox.any valuetype HelloWorld.Point[]
        L_187: ceq
        L_188: call void [System.Console]System.Console::WriteLine(bool)
        L_189: ldnull
        L_190: unbox.any valuetype HelloWorld.Point[]
        L_191: ldnull
        L_192: ceq
        L_193: call void [System.Console]System.Console::WriteLine(bool)
        // unbox.any class HelloWorld.Item[] has castclass identity/null semantics.
        L_194: ldc.i4.1
        L_195: newarr HelloWorld.Item
        L_196: dup
        L_197: unbox.any class HelloWorld.Item[]
        L_198: ceq
        L_199: call void [System.Console]System.Console::WriteLine(bool)
        L_200: ldnull
        L_201: unbox.any class HelloWorld.Item[]
        L_202: ldnull
        L_203: ceq
        L_204: call void [System.Console]System.Console::WriteLine(bool)
        // ldarga.0 precedes ldarg.0 inside ReadThis, isolating this-slot metadata.
        L_205: ldloca.s V_0
        L_206: call instance int32 HelloWorld.Point::ReadThis()
        L_207: call void [System.Console]System.Console::WriteLine(int32)
        L_208: ldloca.s V_0
        L_209: call instance int32 HelloWorld.Point::ReadThisSlot()
        L_210: call void [System.Console]System.Console::WriteLine(int32)
        // Enums retain their type when boxed and remain valid ValueType[] elements.
        L_211: ldc.i4.0
        L_212: box HelloWorld.Kind
        L_213: stloc.1
        L_214: ldloc.1
        L_215: isinst [System.Runtime]System.Enum
        L_216: ldnull
        L_217: cgt.un
        L_218: call void [System.Console]System.Console::WriteLine(bool)
        L_219: ldloc.3
        L_220: ldc.i4.0
        L_221: ldloc.1
        L_222: stelem.ref
        L_223: ldloc.3
        L_224: ldc.i4.0
        L_225: ldelem.ref
        L_226: unbox.any HelloWorld.Kind
        L_227: call void [System.Console]System.Console::WriteLine(int32)
        L_228: ldloc.1
        L_229: dup
        L_230: box [System.Runtime]System.Object
        L_231: ceq
        L_232: call void [System.Console]System.Console::WriteLine(bool)
        L_233: ret
    }
}
