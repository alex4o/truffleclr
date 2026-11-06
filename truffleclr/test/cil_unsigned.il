// ECMA-335 III.3.21-26, III.3.32, III.3.56, III.3.59-60; expected values derived in cil_semantics.md.
.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly HelloWorld {}
.module HelloWorld.dll
.class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object
{
  .method public static void Compare32(int32 left, int32 right) cil managed
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
    // beq.s
    IL_26: ldarg.0
    IL_27: ldarg.1
    IL_28: beq.s IL_31
    IL_29: ldc.i4.0
    IL_30: br IL_32
    IL_31: ldc.i4.1
    IL_32: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un.s
    IL_34: ldarg.0
    IL_35: ldarg.1
    IL_36: bne.un.s IL_39
    IL_37: ldc.i4.0
    IL_38: br IL_40
    IL_39: ldc.i4.1
    IL_40: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.s
    IL_42: ldarg.0
    IL_43: ldarg.1
    IL_44: bgt.s IL_47
    IL_45: ldc.i4.0
    IL_46: br IL_48
    IL_47: ldc.i4.1
    IL_48: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un.s
    IL_50: ldarg.0
    IL_51: ldarg.1
    IL_52: bgt.un.s IL_55
    IL_53: ldc.i4.0
    IL_54: br IL_56
    IL_55: ldc.i4.1
    IL_56: call void [System.Console]System.Console::WriteLine(int32)
    // bge.s
    IL_58: ldarg.0
    IL_59: ldarg.1
    IL_60: bge.s IL_63
    IL_61: ldc.i4.0
    IL_62: br IL_64
    IL_63: ldc.i4.1
    IL_64: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un.s
    IL_66: ldarg.0
    IL_67: ldarg.1
    IL_68: bge.un.s IL_71
    IL_69: ldc.i4.0
    IL_70: br IL_72
    IL_71: ldc.i4.1
    IL_72: call void [System.Console]System.Console::WriteLine(int32)
    // blt.s
    IL_74: ldarg.0
    IL_75: ldarg.1
    IL_76: blt.s IL_79
    IL_77: ldc.i4.0
    IL_78: br IL_80
    IL_79: ldc.i4.1
    IL_80: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un.s
    IL_82: ldarg.0
    IL_83: ldarg.1
    IL_84: blt.un.s IL_87
    IL_85: ldc.i4.0
    IL_86: br IL_88
    IL_87: ldc.i4.1
    IL_88: call void [System.Console]System.Console::WriteLine(int32)
    // ble.s
    IL_90: ldarg.0
    IL_91: ldarg.1
    IL_92: ble.s IL_95
    IL_93: ldc.i4.0
    IL_94: br IL_96
    IL_95: ldc.i4.1
    IL_96: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un.s
    IL_98: ldarg.0
    IL_99: ldarg.1
    IL_100: ble.un.s IL_103
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
    IL_0: ldstr "i4 minus-one / one"
    IL_1: call void [System.Console]System.Console::WriteLine(string)
    IL_2: ldc.i4 0xffffffff
    IL_3: ldc.i4 1
    IL_4: call void HelloWorld.Program::Compare32(int32,int32)
    IL_5: ldstr "i4 one / minus-one"
    IL_6: call void [System.Console]System.Console::WriteLine(string)
    IL_7: ldc.i4 1
    IL_8: ldc.i4 0xffffffff
    IL_9: call void HelloWorld.Program::Compare32(int32,int32)
    IL_10: ldstr "i4 minimum / maximum"
    IL_11: call void [System.Console]System.Console::WriteLine(string)
    IL_12: ldc.i4 0x80000000
    IL_13: ldc.i4 0x7fffffff
    IL_14: call void HelloWorld.Program::Compare32(int32,int32)
    IL_15: ldstr "i4 minus-one / minimum"
    IL_16: call void [System.Console]System.Console::WriteLine(string)
    IL_17: ldc.i4 0xffffffff
    IL_18: ldc.i4 0x80000000
    IL_19: call void HelloWorld.Program::Compare32(int32,int32)
    IL_20: ldstr "i4 minimum / minus-one"
    IL_21: call void [System.Console]System.Console::WriteLine(string)
    IL_22: ldc.i4 0x80000000
    IL_23: ldc.i4 0xffffffff
    IL_24: call void HelloWorld.Program::Compare32(int32,int32)
    IL_25: ldstr "i4 minimum / minimum"
    IL_26: call void [System.Console]System.Console::WriteLine(string)
    IL_27: ldc.i4 0x80000000
    IL_28: ldc.i4 0x80000000
    IL_29: call void HelloWorld.Program::Compare32(int32,int32)
    IL_30: ldstr "i8 minus-one / one"
    IL_31: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_33: ldc.i8 0xffffffffffffffff
    IL_34: ldc.i8 1
    IL_35: ceq
    IL_36: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_38: ldc.i8 0xffffffffffffffff
    IL_39: ldc.i8 1
    IL_40: cgt
    IL_41: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_43: ldc.i8 0xffffffffffffffff
    IL_44: ldc.i8 1
    IL_45: cgt.un
    IL_46: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_48: ldc.i8 0xffffffffffffffff
    IL_49: ldc.i8 1
    IL_50: clt
    IL_51: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_53: ldc.i8 0xffffffffffffffff
    IL_54: ldc.i8 1
    IL_55: clt.un
    IL_56: call void [System.Console]System.Console::WriteLine(int32)
    // beq
    IL_58: ldc.i8 0xffffffffffffffff
    IL_59: ldc.i8 1
    IL_60: beq IL_63
    IL_61: ldc.i4.0
    IL_62: br IL_64
    IL_63: ldc.i4.1
    IL_64: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un
    IL_66: ldc.i8 0xffffffffffffffff
    IL_67: ldc.i8 1
    IL_68: bne.un IL_71
    IL_69: ldc.i4.0
    IL_70: br IL_72
    IL_71: ldc.i4.1
    IL_72: call void [System.Console]System.Console::WriteLine(int32)
    // bgt
    IL_74: ldc.i8 0xffffffffffffffff
    IL_75: ldc.i8 1
    IL_76: bgt IL_79
    IL_77: ldc.i4.0
    IL_78: br IL_80
    IL_79: ldc.i4.1
    IL_80: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un
    IL_82: ldc.i8 0xffffffffffffffff
    IL_83: ldc.i8 1
    IL_84: bgt.un IL_87
    IL_85: ldc.i4.0
    IL_86: br IL_88
    IL_87: ldc.i4.1
    IL_88: call void [System.Console]System.Console::WriteLine(int32)
    // bge
    IL_90: ldc.i8 0xffffffffffffffff
    IL_91: ldc.i8 1
    IL_92: bge IL_95
    IL_93: ldc.i4.0
    IL_94: br IL_96
    IL_95: ldc.i4.1
    IL_96: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un
    IL_98: ldc.i8 0xffffffffffffffff
    IL_99: ldc.i8 1
    IL_100: bge.un IL_103
    IL_101: ldc.i4.0
    IL_102: br IL_104
    IL_103: ldc.i4.1
    IL_104: call void [System.Console]System.Console::WriteLine(int32)
    // blt
    IL_106: ldc.i8 0xffffffffffffffff
    IL_107: ldc.i8 1
    IL_108: blt IL_111
    IL_109: ldc.i4.0
    IL_110: br IL_112
    IL_111: ldc.i4.1
    IL_112: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un
    IL_114: ldc.i8 0xffffffffffffffff
    IL_115: ldc.i8 1
    IL_116: blt.un IL_119
    IL_117: ldc.i4.0
    IL_118: br IL_120
    IL_119: ldc.i4.1
    IL_120: call void [System.Console]System.Console::WriteLine(int32)
    // ble
    IL_122: ldc.i8 0xffffffffffffffff
    IL_123: ldc.i8 1
    IL_124: ble IL_127
    IL_125: ldc.i4.0
    IL_126: br IL_128
    IL_127: ldc.i4.1
    IL_128: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un
    IL_130: ldc.i8 0xffffffffffffffff
    IL_131: ldc.i8 1
    IL_132: ble.un IL_135
    IL_133: ldc.i4.0
    IL_134: br IL_136
    IL_135: ldc.i4.1
    IL_136: call void [System.Console]System.Console::WriteLine(int32)
    IL_137: ldstr "i8 one / minus-one"
    IL_138: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_140: ldc.i8 1
    IL_141: ldc.i8 0xffffffffffffffff
    IL_142: ceq
    IL_143: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_145: ldc.i8 1
    IL_146: ldc.i8 0xffffffffffffffff
    IL_147: cgt
    IL_148: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_150: ldc.i8 1
    IL_151: ldc.i8 0xffffffffffffffff
    IL_152: cgt.un
    IL_153: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_155: ldc.i8 1
    IL_156: ldc.i8 0xffffffffffffffff
    IL_157: clt
    IL_158: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_160: ldc.i8 1
    IL_161: ldc.i8 0xffffffffffffffff
    IL_162: clt.un
    IL_163: call void [System.Console]System.Console::WriteLine(int32)
    // beq
    IL_165: ldc.i8 1
    IL_166: ldc.i8 0xffffffffffffffff
    IL_167: beq IL_170
    IL_168: ldc.i4.0
    IL_169: br IL_171
    IL_170: ldc.i4.1
    IL_171: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un
    IL_173: ldc.i8 1
    IL_174: ldc.i8 0xffffffffffffffff
    IL_175: bne.un IL_178
    IL_176: ldc.i4.0
    IL_177: br IL_179
    IL_178: ldc.i4.1
    IL_179: call void [System.Console]System.Console::WriteLine(int32)
    // bgt
    IL_181: ldc.i8 1
    IL_182: ldc.i8 0xffffffffffffffff
    IL_183: bgt IL_186
    IL_184: ldc.i4.0
    IL_185: br IL_187
    IL_186: ldc.i4.1
    IL_187: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un
    IL_189: ldc.i8 1
    IL_190: ldc.i8 0xffffffffffffffff
    IL_191: bgt.un IL_194
    IL_192: ldc.i4.0
    IL_193: br IL_195
    IL_194: ldc.i4.1
    IL_195: call void [System.Console]System.Console::WriteLine(int32)
    // bge
    IL_197: ldc.i8 1
    IL_198: ldc.i8 0xffffffffffffffff
    IL_199: bge IL_202
    IL_200: ldc.i4.0
    IL_201: br IL_203
    IL_202: ldc.i4.1
    IL_203: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un
    IL_205: ldc.i8 1
    IL_206: ldc.i8 0xffffffffffffffff
    IL_207: bge.un IL_210
    IL_208: ldc.i4.0
    IL_209: br IL_211
    IL_210: ldc.i4.1
    IL_211: call void [System.Console]System.Console::WriteLine(int32)
    // blt
    IL_213: ldc.i8 1
    IL_214: ldc.i8 0xffffffffffffffff
    IL_215: blt IL_218
    IL_216: ldc.i4.0
    IL_217: br IL_219
    IL_218: ldc.i4.1
    IL_219: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un
    IL_221: ldc.i8 1
    IL_222: ldc.i8 0xffffffffffffffff
    IL_223: blt.un IL_226
    IL_224: ldc.i4.0
    IL_225: br IL_227
    IL_226: ldc.i4.1
    IL_227: call void [System.Console]System.Console::WriteLine(int32)
    // ble
    IL_229: ldc.i8 1
    IL_230: ldc.i8 0xffffffffffffffff
    IL_231: ble IL_234
    IL_232: ldc.i4.0
    IL_233: br IL_235
    IL_234: ldc.i4.1
    IL_235: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un
    IL_237: ldc.i8 1
    IL_238: ldc.i8 0xffffffffffffffff
    IL_239: ble.un IL_242
    IL_240: ldc.i4.0
    IL_241: br IL_243
    IL_242: ldc.i4.1
    IL_243: call void [System.Console]System.Console::WriteLine(int32)
    IL_244: ldstr "i8 minimum / maximum"
    IL_245: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_247: ldc.i8 0x8000000000000000
    IL_248: ldc.i8 0x7fffffffffffffff
    IL_249: ceq
    IL_250: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_252: ldc.i8 0x8000000000000000
    IL_253: ldc.i8 0x7fffffffffffffff
    IL_254: cgt
    IL_255: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_257: ldc.i8 0x8000000000000000
    IL_258: ldc.i8 0x7fffffffffffffff
    IL_259: cgt.un
    IL_260: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_262: ldc.i8 0x8000000000000000
    IL_263: ldc.i8 0x7fffffffffffffff
    IL_264: clt
    IL_265: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_267: ldc.i8 0x8000000000000000
    IL_268: ldc.i8 0x7fffffffffffffff
    IL_269: clt.un
    IL_270: call void [System.Console]System.Console::WriteLine(int32)
    // beq
    IL_272: ldc.i8 0x8000000000000000
    IL_273: ldc.i8 0x7fffffffffffffff
    IL_274: beq IL_277
    IL_275: ldc.i4.0
    IL_276: br IL_278
    IL_277: ldc.i4.1
    IL_278: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un
    IL_280: ldc.i8 0x8000000000000000
    IL_281: ldc.i8 0x7fffffffffffffff
    IL_282: bne.un IL_285
    IL_283: ldc.i4.0
    IL_284: br IL_286
    IL_285: ldc.i4.1
    IL_286: call void [System.Console]System.Console::WriteLine(int32)
    // bgt
    IL_288: ldc.i8 0x8000000000000000
    IL_289: ldc.i8 0x7fffffffffffffff
    IL_290: bgt IL_293
    IL_291: ldc.i4.0
    IL_292: br IL_294
    IL_293: ldc.i4.1
    IL_294: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un
    IL_296: ldc.i8 0x8000000000000000
    IL_297: ldc.i8 0x7fffffffffffffff
    IL_298: bgt.un IL_301
    IL_299: ldc.i4.0
    IL_300: br IL_302
    IL_301: ldc.i4.1
    IL_302: call void [System.Console]System.Console::WriteLine(int32)
    // bge
    IL_304: ldc.i8 0x8000000000000000
    IL_305: ldc.i8 0x7fffffffffffffff
    IL_306: bge IL_309
    IL_307: ldc.i4.0
    IL_308: br IL_310
    IL_309: ldc.i4.1
    IL_310: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un
    IL_312: ldc.i8 0x8000000000000000
    IL_313: ldc.i8 0x7fffffffffffffff
    IL_314: bge.un IL_317
    IL_315: ldc.i4.0
    IL_316: br IL_318
    IL_317: ldc.i4.1
    IL_318: call void [System.Console]System.Console::WriteLine(int32)
    // blt
    IL_320: ldc.i8 0x8000000000000000
    IL_321: ldc.i8 0x7fffffffffffffff
    IL_322: blt IL_325
    IL_323: ldc.i4.0
    IL_324: br IL_326
    IL_325: ldc.i4.1
    IL_326: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un
    IL_328: ldc.i8 0x8000000000000000
    IL_329: ldc.i8 0x7fffffffffffffff
    IL_330: blt.un IL_333
    IL_331: ldc.i4.0
    IL_332: br IL_334
    IL_333: ldc.i4.1
    IL_334: call void [System.Console]System.Console::WriteLine(int32)
    // ble
    IL_336: ldc.i8 0x8000000000000000
    IL_337: ldc.i8 0x7fffffffffffffff
    IL_338: ble IL_341
    IL_339: ldc.i4.0
    IL_340: br IL_342
    IL_341: ldc.i4.1
    IL_342: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un
    IL_344: ldc.i8 0x8000000000000000
    IL_345: ldc.i8 0x7fffffffffffffff
    IL_346: ble.un IL_349
    IL_347: ldc.i4.0
    IL_348: br IL_350
    IL_349: ldc.i4.1
    IL_350: call void [System.Console]System.Console::WriteLine(int32)
    IL_351: ldstr "i8 minus-one / minimum"
    IL_352: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_354: ldc.i8 0xffffffffffffffff
    IL_355: ldc.i8 0x8000000000000000
    IL_356: ceq
    IL_357: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_359: ldc.i8 0xffffffffffffffff
    IL_360: ldc.i8 0x8000000000000000
    IL_361: cgt
    IL_362: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_364: ldc.i8 0xffffffffffffffff
    IL_365: ldc.i8 0x8000000000000000
    IL_366: cgt.un
    IL_367: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_369: ldc.i8 0xffffffffffffffff
    IL_370: ldc.i8 0x8000000000000000
    IL_371: clt
    IL_372: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_374: ldc.i8 0xffffffffffffffff
    IL_375: ldc.i8 0x8000000000000000
    IL_376: clt.un
    IL_377: call void [System.Console]System.Console::WriteLine(int32)
    // beq
    IL_379: ldc.i8 0xffffffffffffffff
    IL_380: ldc.i8 0x8000000000000000
    IL_381: beq IL_384
    IL_382: ldc.i4.0
    IL_383: br IL_385
    IL_384: ldc.i4.1
    IL_385: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un
    IL_387: ldc.i8 0xffffffffffffffff
    IL_388: ldc.i8 0x8000000000000000
    IL_389: bne.un IL_392
    IL_390: ldc.i4.0
    IL_391: br IL_393
    IL_392: ldc.i4.1
    IL_393: call void [System.Console]System.Console::WriteLine(int32)
    // bgt
    IL_395: ldc.i8 0xffffffffffffffff
    IL_396: ldc.i8 0x8000000000000000
    IL_397: bgt IL_400
    IL_398: ldc.i4.0
    IL_399: br IL_401
    IL_400: ldc.i4.1
    IL_401: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un
    IL_403: ldc.i8 0xffffffffffffffff
    IL_404: ldc.i8 0x8000000000000000
    IL_405: bgt.un IL_408
    IL_406: ldc.i4.0
    IL_407: br IL_409
    IL_408: ldc.i4.1
    IL_409: call void [System.Console]System.Console::WriteLine(int32)
    // bge
    IL_411: ldc.i8 0xffffffffffffffff
    IL_412: ldc.i8 0x8000000000000000
    IL_413: bge IL_416
    IL_414: ldc.i4.0
    IL_415: br IL_417
    IL_416: ldc.i4.1
    IL_417: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un
    IL_419: ldc.i8 0xffffffffffffffff
    IL_420: ldc.i8 0x8000000000000000
    IL_421: bge.un IL_424
    IL_422: ldc.i4.0
    IL_423: br IL_425
    IL_424: ldc.i4.1
    IL_425: call void [System.Console]System.Console::WriteLine(int32)
    // blt
    IL_427: ldc.i8 0xffffffffffffffff
    IL_428: ldc.i8 0x8000000000000000
    IL_429: blt IL_432
    IL_430: ldc.i4.0
    IL_431: br IL_433
    IL_432: ldc.i4.1
    IL_433: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un
    IL_435: ldc.i8 0xffffffffffffffff
    IL_436: ldc.i8 0x8000000000000000
    IL_437: blt.un IL_440
    IL_438: ldc.i4.0
    IL_439: br IL_441
    IL_440: ldc.i4.1
    IL_441: call void [System.Console]System.Console::WriteLine(int32)
    // ble
    IL_443: ldc.i8 0xffffffffffffffff
    IL_444: ldc.i8 0x8000000000000000
    IL_445: ble IL_448
    IL_446: ldc.i4.0
    IL_447: br IL_449
    IL_448: ldc.i4.1
    IL_449: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un
    IL_451: ldc.i8 0xffffffffffffffff
    IL_452: ldc.i8 0x8000000000000000
    IL_453: ble.un IL_456
    IL_454: ldc.i4.0
    IL_455: br IL_457
    IL_456: ldc.i4.1
    IL_457: call void [System.Console]System.Console::WriteLine(int32)
    IL_458: ldstr "i8 minimum / minus-one"
    IL_459: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_461: ldc.i8 0x8000000000000000
    IL_462: ldc.i8 0xffffffffffffffff
    IL_463: ceq
    IL_464: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_466: ldc.i8 0x8000000000000000
    IL_467: ldc.i8 0xffffffffffffffff
    IL_468: cgt
    IL_469: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_471: ldc.i8 0x8000000000000000
    IL_472: ldc.i8 0xffffffffffffffff
    IL_473: cgt.un
    IL_474: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_476: ldc.i8 0x8000000000000000
    IL_477: ldc.i8 0xffffffffffffffff
    IL_478: clt
    IL_479: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_481: ldc.i8 0x8000000000000000
    IL_482: ldc.i8 0xffffffffffffffff
    IL_483: clt.un
    IL_484: call void [System.Console]System.Console::WriteLine(int32)
    // beq
    IL_486: ldc.i8 0x8000000000000000
    IL_487: ldc.i8 0xffffffffffffffff
    IL_488: beq IL_491
    IL_489: ldc.i4.0
    IL_490: br IL_492
    IL_491: ldc.i4.1
    IL_492: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un
    IL_494: ldc.i8 0x8000000000000000
    IL_495: ldc.i8 0xffffffffffffffff
    IL_496: bne.un IL_499
    IL_497: ldc.i4.0
    IL_498: br IL_500
    IL_499: ldc.i4.1
    IL_500: call void [System.Console]System.Console::WriteLine(int32)
    // bgt
    IL_502: ldc.i8 0x8000000000000000
    IL_503: ldc.i8 0xffffffffffffffff
    IL_504: bgt IL_507
    IL_505: ldc.i4.0
    IL_506: br IL_508
    IL_507: ldc.i4.1
    IL_508: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un
    IL_510: ldc.i8 0x8000000000000000
    IL_511: ldc.i8 0xffffffffffffffff
    IL_512: bgt.un IL_515
    IL_513: ldc.i4.0
    IL_514: br IL_516
    IL_515: ldc.i4.1
    IL_516: call void [System.Console]System.Console::WriteLine(int32)
    // bge
    IL_518: ldc.i8 0x8000000000000000
    IL_519: ldc.i8 0xffffffffffffffff
    IL_520: bge IL_523
    IL_521: ldc.i4.0
    IL_522: br IL_524
    IL_523: ldc.i4.1
    IL_524: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un
    IL_526: ldc.i8 0x8000000000000000
    IL_527: ldc.i8 0xffffffffffffffff
    IL_528: bge.un IL_531
    IL_529: ldc.i4.0
    IL_530: br IL_532
    IL_531: ldc.i4.1
    IL_532: call void [System.Console]System.Console::WriteLine(int32)
    // blt
    IL_534: ldc.i8 0x8000000000000000
    IL_535: ldc.i8 0xffffffffffffffff
    IL_536: blt IL_539
    IL_537: ldc.i4.0
    IL_538: br IL_540
    IL_539: ldc.i4.1
    IL_540: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un
    IL_542: ldc.i8 0x8000000000000000
    IL_543: ldc.i8 0xffffffffffffffff
    IL_544: blt.un IL_547
    IL_545: ldc.i4.0
    IL_546: br IL_548
    IL_547: ldc.i4.1
    IL_548: call void [System.Console]System.Console::WriteLine(int32)
    // ble
    IL_550: ldc.i8 0x8000000000000000
    IL_551: ldc.i8 0xffffffffffffffff
    IL_552: ble IL_555
    IL_553: ldc.i4.0
    IL_554: br IL_556
    IL_555: ldc.i4.1
    IL_556: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un
    IL_558: ldc.i8 0x8000000000000000
    IL_559: ldc.i8 0xffffffffffffffff
    IL_560: ble.un IL_563
    IL_561: ldc.i4.0
    IL_562: br IL_564
    IL_563: ldc.i4.1
    IL_564: call void [System.Console]System.Console::WriteLine(int32)
    IL_565: ldstr "i8 minimum / minimum"
    IL_566: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_568: ldc.i8 0x8000000000000000
    IL_569: ldc.i8 0x8000000000000000
    IL_570: ceq
    IL_571: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_573: ldc.i8 0x8000000000000000
    IL_574: ldc.i8 0x8000000000000000
    IL_575: cgt
    IL_576: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_578: ldc.i8 0x8000000000000000
    IL_579: ldc.i8 0x8000000000000000
    IL_580: cgt.un
    IL_581: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_583: ldc.i8 0x8000000000000000
    IL_584: ldc.i8 0x8000000000000000
    IL_585: clt
    IL_586: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_588: ldc.i8 0x8000000000000000
    IL_589: ldc.i8 0x8000000000000000
    IL_590: clt.un
    IL_591: call void [System.Console]System.Console::WriteLine(int32)
    // beq
    IL_593: ldc.i8 0x8000000000000000
    IL_594: ldc.i8 0x8000000000000000
    IL_595: beq IL_598
    IL_596: ldc.i4.0
    IL_597: br IL_599
    IL_598: ldc.i4.1
    IL_599: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un
    IL_601: ldc.i8 0x8000000000000000
    IL_602: ldc.i8 0x8000000000000000
    IL_603: bne.un IL_606
    IL_604: ldc.i4.0
    IL_605: br IL_607
    IL_606: ldc.i4.1
    IL_607: call void [System.Console]System.Console::WriteLine(int32)
    // bgt
    IL_609: ldc.i8 0x8000000000000000
    IL_610: ldc.i8 0x8000000000000000
    IL_611: bgt IL_614
    IL_612: ldc.i4.0
    IL_613: br IL_615
    IL_614: ldc.i4.1
    IL_615: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un
    IL_617: ldc.i8 0x8000000000000000
    IL_618: ldc.i8 0x8000000000000000
    IL_619: bgt.un IL_622
    IL_620: ldc.i4.0
    IL_621: br IL_623
    IL_622: ldc.i4.1
    IL_623: call void [System.Console]System.Console::WriteLine(int32)
    // bge
    IL_625: ldc.i8 0x8000000000000000
    IL_626: ldc.i8 0x8000000000000000
    IL_627: bge IL_630
    IL_628: ldc.i4.0
    IL_629: br IL_631
    IL_630: ldc.i4.1
    IL_631: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un
    IL_633: ldc.i8 0x8000000000000000
    IL_634: ldc.i8 0x8000000000000000
    IL_635: bge.un IL_638
    IL_636: ldc.i4.0
    IL_637: br IL_639
    IL_638: ldc.i4.1
    IL_639: call void [System.Console]System.Console::WriteLine(int32)
    // blt
    IL_641: ldc.i8 0x8000000000000000
    IL_642: ldc.i8 0x8000000000000000
    IL_643: blt IL_646
    IL_644: ldc.i4.0
    IL_645: br IL_647
    IL_646: ldc.i4.1
    IL_647: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un
    IL_649: ldc.i8 0x8000000000000000
    IL_650: ldc.i8 0x8000000000000000
    IL_651: blt.un IL_654
    IL_652: ldc.i4.0
    IL_653: br IL_655
    IL_654: ldc.i4.1
    IL_655: call void [System.Console]System.Console::WriteLine(int32)
    // ble
    IL_657: ldc.i8 0x8000000000000000
    IL_658: ldc.i8 0x8000000000000000
    IL_659: ble IL_662
    IL_660: ldc.i4.0
    IL_661: br IL_663
    IL_662: ldc.i4.1
    IL_663: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un
    IL_665: ldc.i8 0x8000000000000000
    IL_666: ldc.i8 0x8000000000000000
    IL_667: ble.un IL_670
    IL_668: ldc.i4.0
    IL_669: br IL_671
    IL_670: ldc.i4.1
    IL_671: call void [System.Console]System.Console::WriteLine(int32)
    IL_672: ldstr "i4 signed -5 / 3"
    IL_673: call void [System.Console]System.Console::WriteLine(string)
    IL_674: ldc.i4 -5
    IL_675: ldc.i4 3
    IL_676: div
    IL_677: call void [System.Console]System.Console::WriteLine(int32)
    IL_678: ldstr "i4 unsigned -5 / 3"
    IL_679: call void [System.Console]System.Console::WriteLine(string)
    IL_680: ldc.i4 -5
    IL_681: ldc.i4 3
    IL_682: div.un
    IL_683: call void [System.Console]System.Console::WriteLine(int32)
    IL_684: ldstr "i4 signed -5 remainder 3"
    IL_685: call void [System.Console]System.Console::WriteLine(string)
    IL_686: ldc.i4 -5
    IL_687: ldc.i4 3
    IL_688: rem
    IL_689: call void [System.Console]System.Console::WriteLine(int32)
    IL_690: ldstr "i4 unsigned -5 remainder 3"
    IL_691: call void [System.Console]System.Console::WriteLine(string)
    IL_692: ldc.i4 -5
    IL_693: ldc.i4 3
    IL_694: rem.un
    IL_695: call void [System.Console]System.Console::WriteLine(int32)
    IL_696: ldstr "i4 unsigned 5 / -3"
    IL_697: call void [System.Console]System.Console::WriteLine(string)
    IL_698: ldc.i4 5
    IL_699: ldc.i4 -3
    IL_700: div.un
    IL_701: call void [System.Console]System.Console::WriteLine(int32)
    IL_702: ldstr "i4 unsigned 5 remainder -3"
    IL_703: call void [System.Console]System.Console::WriteLine(string)
    IL_704: ldc.i4 5
    IL_705: ldc.i4 -3
    IL_706: rem.un
    IL_707: call void [System.Console]System.Console::WriteLine(int32)
    IL_708: ldstr "i4 unsigned -5 / -3"
    IL_709: call void [System.Console]System.Console::WriteLine(string)
    IL_710: ldc.i4 -5
    IL_711: ldc.i4 -3
    IL_712: div.un
    IL_713: call void [System.Console]System.Console::WriteLine(int32)
    IL_714: ldstr "i4 unsigned -5 remainder -3"
    IL_715: call void [System.Console]System.Console::WriteLine(string)
    IL_716: ldc.i4 -5
    IL_717: ldc.i4 -3
    IL_718: rem.un
    IL_719: call void [System.Console]System.Console::WriteLine(int32)
    IL_720: ldstr "i4 unsigned minimum / -1"
    IL_721: call void [System.Console]System.Console::WriteLine(string)
    IL_722: ldc.i4 0x80000000
    IL_723: ldc.i4 -1
    IL_724: div.un
    IL_725: call void [System.Console]System.Console::WriteLine(int32)
    IL_726: ldstr "i4 unsigned minimum remainder -1"
    IL_727: call void [System.Console]System.Console::WriteLine(string)
    IL_728: ldc.i4 0x80000000
    IL_729: ldc.i4 -1
    IL_730: rem.un
    IL_731: call void [System.Console]System.Console::WriteLine(int32)
    IL_732: ldstr "i4 unsigned -1 / 2"
    IL_733: call void [System.Console]System.Console::WriteLine(string)
    IL_734: ldc.i4 -1
    IL_735: ldc.i4 2
    IL_736: div.un
    IL_737: call void [System.Console]System.Console::WriteLine(int32)
    IL_738: ldstr "i4 unsigned -1 remainder 2"
    IL_739: call void [System.Console]System.Console::WriteLine(string)
    IL_740: ldc.i4 -1
    IL_741: ldc.i4 2
    IL_742: rem.un
    IL_743: call void [System.Console]System.Console::WriteLine(int32)
    IL_744: ldstr "i4 signed -1 shift 1"
    IL_745: call void [System.Console]System.Console::WriteLine(string)
    IL_746: ldc.i4 -1
    IL_747: ldc.i4 1
    IL_748: shr
    IL_749: call void [System.Console]System.Console::WriteLine(int32)
    IL_750: ldstr "i4 unsigned -1 shift 1"
    IL_751: call void [System.Console]System.Console::WriteLine(string)
    IL_752: ldc.i4 -1
    IL_753: ldc.i4 1
    IL_754: shr.un
    IL_755: call void [System.Console]System.Console::WriteLine(int32)
    IL_756: ldstr "i4 unsigned minimum shift 31"
    IL_757: call void [System.Console]System.Console::WriteLine(string)
    IL_758: ldc.i4 0x80000000
    IL_759: ldc.i4 31
    IL_760: shr.un
    IL_761: call void [System.Console]System.Console::WriteLine(int32)
    IL_762: ldstr "i4 signed minimum shift 31"
    IL_763: call void [System.Console]System.Console::WriteLine(string)
    IL_764: ldc.i4 0x80000000
    IL_765: ldc.i4 31
    IL_766: shr
    IL_767: call void [System.Console]System.Console::WriteLine(int32)
    IL_768: ldstr "i4 unsigned -1 shift 0"
    IL_769: call void [System.Console]System.Console::WriteLine(string)
    IL_770: ldc.i4 -1
    IL_771: ldc.i4 0
    IL_772: shr.un
    IL_773: call void [System.Console]System.Console::WriteLine(int32)
    IL_774: ldstr "i8 signed -5 / 3"
    IL_775: call void [System.Console]System.Console::WriteLine(string)
    IL_776: ldc.i8 -5
    IL_777: ldc.i8 3
    IL_778: div
    IL_779: ldc.i8 -1
    IL_780: ceq
    IL_781: call void [System.Console]System.Console::WriteLine(int32)
    IL_782: ldstr "i8 unsigned -5 / 3"
    IL_783: call void [System.Console]System.Console::WriteLine(string)
    IL_784: ldc.i8 -5
    IL_785: ldc.i8 3
    IL_786: div.un
    IL_787: ldc.i8 6148914691236517203
    IL_788: ceq
    IL_789: call void [System.Console]System.Console::WriteLine(int32)
    IL_790: ldstr "i8 signed -5 remainder 3"
    IL_791: call void [System.Console]System.Console::WriteLine(string)
    IL_792: ldc.i8 -5
    IL_793: ldc.i8 3
    IL_794: rem
    IL_795: ldc.i8 -2
    IL_796: ceq
    IL_797: call void [System.Console]System.Console::WriteLine(int32)
    IL_798: ldstr "i8 unsigned -5 remainder 3"
    IL_799: call void [System.Console]System.Console::WriteLine(string)
    IL_800: ldc.i8 -5
    IL_801: ldc.i8 3
    IL_802: rem.un
    IL_803: ldc.i8 2
    IL_804: ceq
    IL_805: call void [System.Console]System.Console::WriteLine(int32)
    IL_806: ldstr "i8 unsigned 5 / -3"
    IL_807: call void [System.Console]System.Console::WriteLine(string)
    IL_808: ldc.i8 5
    IL_809: ldc.i8 -3
    IL_810: div.un
    IL_811: ldc.i8 0
    IL_812: ceq
    IL_813: call void [System.Console]System.Console::WriteLine(int32)
    IL_814: ldstr "i8 unsigned 5 remainder -3"
    IL_815: call void [System.Console]System.Console::WriteLine(string)
    IL_816: ldc.i8 5
    IL_817: ldc.i8 -3
    IL_818: rem.un
    IL_819: ldc.i8 5
    IL_820: ceq
    IL_821: call void [System.Console]System.Console::WriteLine(int32)
    IL_822: ldstr "i8 unsigned -5 / -3"
    IL_823: call void [System.Console]System.Console::WriteLine(string)
    IL_824: ldc.i8 -5
    IL_825: ldc.i8 -3
    IL_826: div.un
    IL_827: ldc.i8 0
    IL_828: ceq
    IL_829: call void [System.Console]System.Console::WriteLine(int32)
    IL_830: ldstr "i8 unsigned -5 remainder -3"
    IL_831: call void [System.Console]System.Console::WriteLine(string)
    IL_832: ldc.i8 -5
    IL_833: ldc.i8 -3
    IL_834: rem.un
    IL_835: ldc.i8 -5
    IL_836: ceq
    IL_837: call void [System.Console]System.Console::WriteLine(int32)
    IL_838: ldstr "i8 unsigned minimum / -1"
    IL_839: call void [System.Console]System.Console::WriteLine(string)
    IL_840: ldc.i8 -9223372036854775808
    IL_841: ldc.i8 -1
    IL_842: div.un
    IL_843: ldc.i8 0
    IL_844: ceq
    IL_845: call void [System.Console]System.Console::WriteLine(int32)
    IL_846: ldstr "i8 unsigned minimum remainder -1"
    IL_847: call void [System.Console]System.Console::WriteLine(string)
    IL_848: ldc.i8 0x8000000000000000
    IL_849: ldc.i8 -1
    IL_850: rem.un
    IL_851: ldc.i8 0x8000000000000000
    IL_852: ceq
    IL_853: call void [System.Console]System.Console::WriteLine(int32)
    IL_854: ldstr "i8 unsigned -1 / 2"
    IL_855: call void [System.Console]System.Console::WriteLine(string)
    IL_856: ldc.i8 0xffffffffffffffff
    IL_857: ldc.i8 2
    IL_858: div.un
    IL_859: ldc.i8 9223372036854775807
    IL_860: ceq
    IL_861: call void [System.Console]System.Console::WriteLine(int32)
    IL_862: ldstr "i8 unsigned -1 remainder 2"
    IL_863: call void [System.Console]System.Console::WriteLine(string)
    IL_864: ldc.i8 -1
    IL_865: ldc.i8 2
    IL_866: rem.un
    IL_867: ldc.i8 1
    IL_868: ceq
    IL_869: call void [System.Console]System.Console::WriteLine(int32)
    IL_870: ldstr "i8 signed -1 shift 1"
    IL_871: call void [System.Console]System.Console::WriteLine(string)
    IL_872: ldc.i8 -1
    IL_873: ldc.i4 1
    IL_874: shr
    IL_875: ldc.i8 -1
    IL_876: ceq
    IL_877: call void [System.Console]System.Console::WriteLine(int32)
    IL_878: ldstr "i8 unsigned -1 shift 1"
    IL_879: call void [System.Console]System.Console::WriteLine(string)
    IL_880: ldc.i8 -1
    IL_881: ldc.i4 1
    IL_882: shr.un
    IL_883: ldc.i8 9223372036854775807
    IL_884: ceq
    IL_885: call void [System.Console]System.Console::WriteLine(int32)
    IL_886: ldstr "i8 unsigned minimum shift 63"
    IL_887: call void [System.Console]System.Console::WriteLine(string)
    IL_888: ldc.i8 0x8000000000000000
    IL_889: ldc.i4 63
    IL_890: shr.un
    IL_891: ldc.i8 1
    IL_892: ceq
    IL_893: call void [System.Console]System.Console::WriteLine(int32)
    IL_894: ldstr "i8 signed minimum shift 63"
    IL_895: call void [System.Console]System.Console::WriteLine(string)
    IL_896: ldc.i8 0x8000000000000000
    IL_897: ldc.i4 63
    IL_898: shr
    IL_899: ldc.i8 -1
    IL_900: ceq
    IL_901: call void [System.Console]System.Console::WriteLine(int32)
    IL_902: ldstr "i8 unsigned -1 shift 0"
    IL_903: call void [System.Console]System.Console::WriteLine(string)
    IL_904: ldc.i8 -1
    IL_905: ldc.i4 0
    IL_906: shr.un
    IL_907: ldc.i8 -1
    IL_908: ceq
    IL_909: call void [System.Console]System.Console::WriteLine(int32)
    IL_910: ret
  }
}
