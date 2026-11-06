// ECMA-335 III.3.5-14, III.3.21-26, III.3.31. Inline float32 stack values; see cil_semantics.md.
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
    IL_0: ldstr "positive-zero / negative-zero"
    IL_1: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_3: ldc.r4 0.0
    IL_4: ldc.r4 -0.0
    IL_5: ceq
    IL_6: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_8: ldc.r4 0.0
    IL_9: ldc.r4 -0.0
    IL_10: cgt
    IL_11: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_13: ldc.r4 0.0
    IL_14: ldc.r4 -0.0
    IL_15: cgt.un
    IL_16: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_18: ldc.r4 0.0
    IL_19: ldc.r4 -0.0
    IL_20: clt
    IL_21: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_23: ldc.r4 0.0
    IL_24: ldc.r4 -0.0
    IL_25: clt.un
    IL_26: call void [System.Console]System.Console::WriteLine(int32)
    // beq.s
    IL_28: ldc.r4 0.0
    IL_29: ldc.r4 -0.0
    IL_30: beq.s IL_33
    IL_31: ldc.i4.0
    IL_32: br IL_34
    IL_33: ldc.i4.1
    IL_34: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un.s
    IL_36: ldc.r4 0.0
    IL_37: ldc.r4 -0.0
    IL_38: bne.un.s IL_41
    IL_39: ldc.i4.0
    IL_40: br IL_42
    IL_41: ldc.i4.1
    IL_42: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.s
    IL_44: ldc.r4 0.0
    IL_45: ldc.r4 -0.0
    IL_46: bgt.s IL_49
    IL_47: ldc.i4.0
    IL_48: br IL_50
    IL_49: ldc.i4.1
    IL_50: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un.s
    IL_52: ldc.r4 0.0
    IL_53: ldc.r4 -0.0
    IL_54: bgt.un.s IL_57
    IL_55: ldc.i4.0
    IL_56: br IL_58
    IL_57: ldc.i4.1
    IL_58: call void [System.Console]System.Console::WriteLine(int32)
    // bge.s
    IL_60: ldc.r4 0.0
    IL_61: ldc.r4 -0.0
    IL_62: bge.s IL_65
    IL_63: ldc.i4.0
    IL_64: br IL_66
    IL_65: ldc.i4.1
    IL_66: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un.s
    IL_68: ldc.r4 0.0
    IL_69: ldc.r4 -0.0
    IL_70: bge.un.s IL_73
    IL_71: ldc.i4.0
    IL_72: br IL_74
    IL_73: ldc.i4.1
    IL_74: call void [System.Console]System.Console::WriteLine(int32)
    // blt.s
    IL_76: ldc.r4 0.0
    IL_77: ldc.r4 -0.0
    IL_78: blt.s IL_81
    IL_79: ldc.i4.0
    IL_80: br IL_82
    IL_81: ldc.i4.1
    IL_82: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un.s
    IL_84: ldc.r4 0.0
    IL_85: ldc.r4 -0.0
    IL_86: blt.un.s IL_89
    IL_87: ldc.i4.0
    IL_88: br IL_90
    IL_89: ldc.i4.1
    IL_90: call void [System.Console]System.Console::WriteLine(int32)
    // ble.s
    IL_92: ldc.r4 0.0
    IL_93: ldc.r4 -0.0
    IL_94: ble.s IL_97
    IL_95: ldc.i4.0
    IL_96: br IL_98
    IL_97: ldc.i4.1
    IL_98: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un.s
    IL_100: ldc.r4 0.0
    IL_101: ldc.r4 -0.0
    IL_102: ble.un.s IL_105
    IL_103: ldc.i4.0
    IL_104: br IL_106
    IL_105: ldc.i4.1
    IL_106: call void [System.Console]System.Console::WriteLine(int32)
    IL_107: ldstr "negative-zero / positive-zero"
    IL_108: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_110: ldc.r4 -0.0
    IL_111: ldc.r4 0.0
    IL_112: ceq
    IL_113: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_115: ldc.r4 -0.0
    IL_116: ldc.r4 0.0
    IL_117: cgt
    IL_118: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_120: ldc.r4 -0.0
    IL_121: ldc.r4 0.0
    IL_122: cgt.un
    IL_123: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_125: ldc.r4 -0.0
    IL_126: ldc.r4 0.0
    IL_127: clt
    IL_128: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_130: ldc.r4 -0.0
    IL_131: ldc.r4 0.0
    IL_132: clt.un
    IL_133: call void [System.Console]System.Console::WriteLine(int32)
    // beq.s
    IL_135: ldc.r4 -0.0
    IL_136: ldc.r4 0.0
    IL_137: beq.s IL_140
    IL_138: ldc.i4.0
    IL_139: br IL_141
    IL_140: ldc.i4.1
    IL_141: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un.s
    IL_143: ldc.r4 -0.0
    IL_144: ldc.r4 0.0
    IL_145: bne.un.s IL_148
    IL_146: ldc.i4.0
    IL_147: br IL_149
    IL_148: ldc.i4.1
    IL_149: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.s
    IL_151: ldc.r4 -0.0
    IL_152: ldc.r4 0.0
    IL_153: bgt.s IL_156
    IL_154: ldc.i4.0
    IL_155: br IL_157
    IL_156: ldc.i4.1
    IL_157: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un.s
    IL_159: ldc.r4 -0.0
    IL_160: ldc.r4 0.0
    IL_161: bgt.un.s IL_164
    IL_162: ldc.i4.0
    IL_163: br IL_165
    IL_164: ldc.i4.1
    IL_165: call void [System.Console]System.Console::WriteLine(int32)
    // bge.s
    IL_167: ldc.r4 -0.0
    IL_168: ldc.r4 0.0
    IL_169: bge.s IL_172
    IL_170: ldc.i4.0
    IL_171: br IL_173
    IL_172: ldc.i4.1
    IL_173: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un.s
    IL_175: ldc.r4 -0.0
    IL_176: ldc.r4 0.0
    IL_177: bge.un.s IL_180
    IL_178: ldc.i4.0
    IL_179: br IL_181
    IL_180: ldc.i4.1
    IL_181: call void [System.Console]System.Console::WriteLine(int32)
    // blt.s
    IL_183: ldc.r4 -0.0
    IL_184: ldc.r4 0.0
    IL_185: blt.s IL_188
    IL_186: ldc.i4.0
    IL_187: br IL_189
    IL_188: ldc.i4.1
    IL_189: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un.s
    IL_191: ldc.r4 -0.0
    IL_192: ldc.r4 0.0
    IL_193: blt.un.s IL_196
    IL_194: ldc.i4.0
    IL_195: br IL_197
    IL_196: ldc.i4.1
    IL_197: call void [System.Console]System.Console::WriteLine(int32)
    // ble.s
    IL_199: ldc.r4 -0.0
    IL_200: ldc.r4 0.0
    IL_201: ble.s IL_204
    IL_202: ldc.i4.0
    IL_203: br IL_205
    IL_204: ldc.i4.1
    IL_205: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un.s
    IL_207: ldc.r4 -0.0
    IL_208: ldc.r4 0.0
    IL_209: ble.un.s IL_212
    IL_210: ldc.i4.0
    IL_211: br IL_213
    IL_212: ldc.i4.1
    IL_213: call void [System.Console]System.Console::WriteLine(int32)
    IL_214: ldstr "NaN / one"
    IL_215: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_217: ldc.r4 0.0
    IL_218: ldc.r4 0.0
    IL_219: div
    IL_220: ldc.r4 1.0
    IL_221: ceq
    IL_222: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_224: ldc.r4 0.0
    IL_225: ldc.r4 0.0
    IL_226: div
    IL_227: ldc.r4 1.0
    IL_228: cgt
    IL_229: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_231: ldc.r4 0.0
    IL_232: ldc.r4 0.0
    IL_233: div
    IL_234: ldc.r4 1.0
    IL_235: cgt.un
    IL_236: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_238: ldc.r4 0.0
    IL_239: ldc.r4 0.0
    IL_240: div
    IL_241: ldc.r4 1.0
    IL_242: clt
    IL_243: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_245: ldc.r4 0.0
    IL_246: ldc.r4 0.0
    IL_247: div
    IL_248: ldc.r4 1.0
    IL_249: clt.un
    IL_250: call void [System.Console]System.Console::WriteLine(int32)
    // beq.s
    IL_252: ldc.r4 0.0
    IL_253: ldc.r4 0.0
    IL_254: div
    IL_255: ldc.r4 1.0
    IL_256: beq.s IL_259
    IL_257: ldc.i4.0
    IL_258: br IL_260
    IL_259: ldc.i4.1
    IL_260: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un.s
    IL_262: ldc.r4 0.0
    IL_263: ldc.r4 0.0
    IL_264: div
    IL_265: ldc.r4 1.0
    IL_266: bne.un.s IL_269
    IL_267: ldc.i4.0
    IL_268: br IL_270
    IL_269: ldc.i4.1
    IL_270: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.s
    IL_272: ldc.r4 0.0
    IL_273: ldc.r4 0.0
    IL_274: div
    IL_275: ldc.r4 1.0
    IL_276: bgt.s IL_279
    IL_277: ldc.i4.0
    IL_278: br IL_280
    IL_279: ldc.i4.1
    IL_280: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un.s
    IL_282: ldc.r4 0.0
    IL_283: ldc.r4 0.0
    IL_284: div
    IL_285: ldc.r4 1.0
    IL_286: bgt.un.s IL_289
    IL_287: ldc.i4.0
    IL_288: br IL_290
    IL_289: ldc.i4.1
    IL_290: call void [System.Console]System.Console::WriteLine(int32)
    // bge.s
    IL_292: ldc.r4 0.0
    IL_293: ldc.r4 0.0
    IL_294: div
    IL_295: ldc.r4 1.0
    IL_296: bge.s IL_299
    IL_297: ldc.i4.0
    IL_298: br IL_300
    IL_299: ldc.i4.1
    IL_300: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un.s
    IL_302: ldc.r4 0.0
    IL_303: ldc.r4 0.0
    IL_304: div
    IL_305: ldc.r4 1.0
    IL_306: bge.un.s IL_309
    IL_307: ldc.i4.0
    IL_308: br IL_310
    IL_309: ldc.i4.1
    IL_310: call void [System.Console]System.Console::WriteLine(int32)
    // blt.s
    IL_312: ldc.r4 0.0
    IL_313: ldc.r4 0.0
    IL_314: div
    IL_315: ldc.r4 1.0
    IL_316: blt.s IL_319
    IL_317: ldc.i4.0
    IL_318: br IL_320
    IL_319: ldc.i4.1
    IL_320: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un.s
    IL_322: ldc.r4 0.0
    IL_323: ldc.r4 0.0
    IL_324: div
    IL_325: ldc.r4 1.0
    IL_326: blt.un.s IL_329
    IL_327: ldc.i4.0
    IL_328: br IL_330
    IL_329: ldc.i4.1
    IL_330: call void [System.Console]System.Console::WriteLine(int32)
    // ble.s
    IL_332: ldc.r4 0.0
    IL_333: ldc.r4 0.0
    IL_334: div
    IL_335: ldc.r4 1.0
    IL_336: ble.s IL_339
    IL_337: ldc.i4.0
    IL_338: br IL_340
    IL_339: ldc.i4.1
    IL_340: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un.s
    IL_342: ldc.r4 0.0
    IL_343: ldc.r4 0.0
    IL_344: div
    IL_345: ldc.r4 1.0
    IL_346: ble.un.s IL_349
    IL_347: ldc.i4.0
    IL_348: br IL_350
    IL_349: ldc.i4.1
    IL_350: call void [System.Console]System.Console::WriteLine(int32)
    IL_351: ldstr "one / NaN"
    IL_352: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_354: ldc.r4 1.0
    IL_355: ldc.r4 0.0
    IL_356: ldc.r4 0.0
    IL_357: div
    IL_358: ceq
    IL_359: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_361: ldc.r4 1.0
    IL_362: ldc.r4 0.0
    IL_363: ldc.r4 0.0
    IL_364: div
    IL_365: cgt
    IL_366: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_368: ldc.r4 1.0
    IL_369: ldc.r4 0.0
    IL_370: ldc.r4 0.0
    IL_371: div
    IL_372: cgt.un
    IL_373: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_375: ldc.r4 1.0
    IL_376: ldc.r4 0.0
    IL_377: ldc.r4 0.0
    IL_378: div
    IL_379: clt
    IL_380: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_382: ldc.r4 1.0
    IL_383: ldc.r4 0.0
    IL_384: ldc.r4 0.0
    IL_385: div
    IL_386: clt.un
    IL_387: call void [System.Console]System.Console::WriteLine(int32)
    // beq.s
    IL_389: ldc.r4 1.0
    IL_390: ldc.r4 0.0
    IL_391: ldc.r4 0.0
    IL_392: div
    IL_393: beq.s IL_396
    IL_394: ldc.i4.0
    IL_395: br IL_397
    IL_396: ldc.i4.1
    IL_397: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un.s
    IL_399: ldc.r4 1.0
    IL_400: ldc.r4 0.0
    IL_401: ldc.r4 0.0
    IL_402: div
    IL_403: bne.un.s IL_406
    IL_404: ldc.i4.0
    IL_405: br IL_407
    IL_406: ldc.i4.1
    IL_407: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.s
    IL_409: ldc.r4 1.0
    IL_410: ldc.r4 0.0
    IL_411: ldc.r4 0.0
    IL_412: div
    IL_413: bgt.s IL_416
    IL_414: ldc.i4.0
    IL_415: br IL_417
    IL_416: ldc.i4.1
    IL_417: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un.s
    IL_419: ldc.r4 1.0
    IL_420: ldc.r4 0.0
    IL_421: ldc.r4 0.0
    IL_422: div
    IL_423: bgt.un.s IL_426
    IL_424: ldc.i4.0
    IL_425: br IL_427
    IL_426: ldc.i4.1
    IL_427: call void [System.Console]System.Console::WriteLine(int32)
    // bge.s
    IL_429: ldc.r4 1.0
    IL_430: ldc.r4 0.0
    IL_431: ldc.r4 0.0
    IL_432: div
    IL_433: bge.s IL_436
    IL_434: ldc.i4.0
    IL_435: br IL_437
    IL_436: ldc.i4.1
    IL_437: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un.s
    IL_439: ldc.r4 1.0
    IL_440: ldc.r4 0.0
    IL_441: ldc.r4 0.0
    IL_442: div
    IL_443: bge.un.s IL_446
    IL_444: ldc.i4.0
    IL_445: br IL_447
    IL_446: ldc.i4.1
    IL_447: call void [System.Console]System.Console::WriteLine(int32)
    // blt.s
    IL_449: ldc.r4 1.0
    IL_450: ldc.r4 0.0
    IL_451: ldc.r4 0.0
    IL_452: div
    IL_453: blt.s IL_456
    IL_454: ldc.i4.0
    IL_455: br IL_457
    IL_456: ldc.i4.1
    IL_457: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un.s
    IL_459: ldc.r4 1.0
    IL_460: ldc.r4 0.0
    IL_461: ldc.r4 0.0
    IL_462: div
    IL_463: blt.un.s IL_466
    IL_464: ldc.i4.0
    IL_465: br IL_467
    IL_466: ldc.i4.1
    IL_467: call void [System.Console]System.Console::WriteLine(int32)
    // ble.s
    IL_469: ldc.r4 1.0
    IL_470: ldc.r4 0.0
    IL_471: ldc.r4 0.0
    IL_472: div
    IL_473: ble.s IL_476
    IL_474: ldc.i4.0
    IL_475: br IL_477
    IL_476: ldc.i4.1
    IL_477: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un.s
    IL_479: ldc.r4 1.0
    IL_480: ldc.r4 0.0
    IL_481: ldc.r4 0.0
    IL_482: div
    IL_483: ble.un.s IL_486
    IL_484: ldc.i4.0
    IL_485: br IL_487
    IL_486: ldc.i4.1
    IL_487: call void [System.Console]System.Console::WriteLine(int32)
    IL_488: ldstr "NaN / NaN"
    IL_489: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_491: ldc.r4 0.0
    IL_492: ldc.r4 0.0
    IL_493: div
    IL_494: ldc.r4 0.0
    IL_495: ldc.r4 0.0
    IL_496: div
    IL_497: ceq
    IL_498: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_500: ldc.r4 0.0
    IL_501: ldc.r4 0.0
    IL_502: div
    IL_503: ldc.r4 0.0
    IL_504: ldc.r4 0.0
    IL_505: div
    IL_506: cgt
    IL_507: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_509: ldc.r4 0.0
    IL_510: ldc.r4 0.0
    IL_511: div
    IL_512: ldc.r4 0.0
    IL_513: ldc.r4 0.0
    IL_514: div
    IL_515: cgt.un
    IL_516: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_518: ldc.r4 0.0
    IL_519: ldc.r4 0.0
    IL_520: div
    IL_521: ldc.r4 0.0
    IL_522: ldc.r4 0.0
    IL_523: div
    IL_524: clt
    IL_525: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_527: ldc.r4 0.0
    IL_528: ldc.r4 0.0
    IL_529: div
    IL_530: ldc.r4 0.0
    IL_531: ldc.r4 0.0
    IL_532: div
    IL_533: clt.un
    IL_534: call void [System.Console]System.Console::WriteLine(int32)
    // beq.s
    IL_536: ldc.r4 0.0
    IL_537: ldc.r4 0.0
    IL_538: div
    IL_539: ldc.r4 0.0
    IL_540: ldc.r4 0.0
    IL_541: div
    IL_542: beq.s IL_545
    IL_543: ldc.i4.0
    IL_544: br IL_546
    IL_545: ldc.i4.1
    IL_546: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un.s
    IL_548: ldc.r4 0.0
    IL_549: ldc.r4 0.0
    IL_550: div
    IL_551: ldc.r4 0.0
    IL_552: ldc.r4 0.0
    IL_553: div
    IL_554: bne.un.s IL_557
    IL_555: ldc.i4.0
    IL_556: br IL_558
    IL_557: ldc.i4.1
    IL_558: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.s
    IL_560: ldc.r4 0.0
    IL_561: ldc.r4 0.0
    IL_562: div
    IL_563: ldc.r4 0.0
    IL_564: ldc.r4 0.0
    IL_565: div
    IL_566: bgt.s IL_569
    IL_567: ldc.i4.0
    IL_568: br IL_570
    IL_569: ldc.i4.1
    IL_570: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un.s
    IL_572: ldc.r4 0.0
    IL_573: ldc.r4 0.0
    IL_574: div
    IL_575: ldc.r4 0.0
    IL_576: ldc.r4 0.0
    IL_577: div
    IL_578: bgt.un.s IL_581
    IL_579: ldc.i4.0
    IL_580: br IL_582
    IL_581: ldc.i4.1
    IL_582: call void [System.Console]System.Console::WriteLine(int32)
    // bge.s
    IL_584: ldc.r4 0.0
    IL_585: ldc.r4 0.0
    IL_586: div
    IL_587: ldc.r4 0.0
    IL_588: ldc.r4 0.0
    IL_589: div
    IL_590: bge.s IL_593
    IL_591: ldc.i4.0
    IL_592: br IL_594
    IL_593: ldc.i4.1
    IL_594: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un.s
    IL_596: ldc.r4 0.0
    IL_597: ldc.r4 0.0
    IL_598: div
    IL_599: ldc.r4 0.0
    IL_600: ldc.r4 0.0
    IL_601: div
    IL_602: bge.un.s IL_605
    IL_603: ldc.i4.0
    IL_604: br IL_606
    IL_605: ldc.i4.1
    IL_606: call void [System.Console]System.Console::WriteLine(int32)
    // blt.s
    IL_608: ldc.r4 0.0
    IL_609: ldc.r4 0.0
    IL_610: div
    IL_611: ldc.r4 0.0
    IL_612: ldc.r4 0.0
    IL_613: div
    IL_614: blt.s IL_617
    IL_615: ldc.i4.0
    IL_616: br IL_618
    IL_617: ldc.i4.1
    IL_618: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un.s
    IL_620: ldc.r4 0.0
    IL_621: ldc.r4 0.0
    IL_622: div
    IL_623: ldc.r4 0.0
    IL_624: ldc.r4 0.0
    IL_625: div
    IL_626: blt.un.s IL_629
    IL_627: ldc.i4.0
    IL_628: br IL_630
    IL_629: ldc.i4.1
    IL_630: call void [System.Console]System.Console::WriteLine(int32)
    // ble.s
    IL_632: ldc.r4 0.0
    IL_633: ldc.r4 0.0
    IL_634: div
    IL_635: ldc.r4 0.0
    IL_636: ldc.r4 0.0
    IL_637: div
    IL_638: ble.s IL_641
    IL_639: ldc.i4.0
    IL_640: br IL_642
    IL_641: ldc.i4.1
    IL_642: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un.s
    IL_644: ldc.r4 0.0
    IL_645: ldc.r4 0.0
    IL_646: div
    IL_647: ldc.r4 0.0
    IL_648: ldc.r4 0.0
    IL_649: div
    IL_650: ble.un.s IL_653
    IL_651: ldc.i4.0
    IL_652: br IL_654
    IL_653: ldc.i4.1
    IL_654: call void [System.Console]System.Console::WriteLine(int32)
    IL_655: ldstr "infinity / one"
    IL_656: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_658: ldc.r4 1.0
    IL_659: ldc.r4 0.0
    IL_660: div
    IL_661: ldc.r4 1.0
    IL_662: ceq
    IL_663: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_665: ldc.r4 1.0
    IL_666: ldc.r4 0.0
    IL_667: div
    IL_668: ldc.r4 1.0
    IL_669: cgt
    IL_670: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_672: ldc.r4 1.0
    IL_673: ldc.r4 0.0
    IL_674: div
    IL_675: ldc.r4 1.0
    IL_676: cgt.un
    IL_677: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_679: ldc.r4 1.0
    IL_680: ldc.r4 0.0
    IL_681: div
    IL_682: ldc.r4 1.0
    IL_683: clt
    IL_684: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_686: ldc.r4 1.0
    IL_687: ldc.r4 0.0
    IL_688: div
    IL_689: ldc.r4 1.0
    IL_690: clt.un
    IL_691: call void [System.Console]System.Console::WriteLine(int32)
    // beq.s
    IL_693: ldc.r4 1.0
    IL_694: ldc.r4 0.0
    IL_695: div
    IL_696: ldc.r4 1.0
    IL_697: beq.s IL_700
    IL_698: ldc.i4.0
    IL_699: br IL_701
    IL_700: ldc.i4.1
    IL_701: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un.s
    IL_703: ldc.r4 1.0
    IL_704: ldc.r4 0.0
    IL_705: div
    IL_706: ldc.r4 1.0
    IL_707: bne.un.s IL_710
    IL_708: ldc.i4.0
    IL_709: br IL_711
    IL_710: ldc.i4.1
    IL_711: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.s
    IL_713: ldc.r4 1.0
    IL_714: ldc.r4 0.0
    IL_715: div
    IL_716: ldc.r4 1.0
    IL_717: bgt.s IL_720
    IL_718: ldc.i4.0
    IL_719: br IL_721
    IL_720: ldc.i4.1
    IL_721: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un.s
    IL_723: ldc.r4 1.0
    IL_724: ldc.r4 0.0
    IL_725: div
    IL_726: ldc.r4 1.0
    IL_727: bgt.un.s IL_730
    IL_728: ldc.i4.0
    IL_729: br IL_731
    IL_730: ldc.i4.1
    IL_731: call void [System.Console]System.Console::WriteLine(int32)
    // bge.s
    IL_733: ldc.r4 1.0
    IL_734: ldc.r4 0.0
    IL_735: div
    IL_736: ldc.r4 1.0
    IL_737: bge.s IL_740
    IL_738: ldc.i4.0
    IL_739: br IL_741
    IL_740: ldc.i4.1
    IL_741: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un.s
    IL_743: ldc.r4 1.0
    IL_744: ldc.r4 0.0
    IL_745: div
    IL_746: ldc.r4 1.0
    IL_747: bge.un.s IL_750
    IL_748: ldc.i4.0
    IL_749: br IL_751
    IL_750: ldc.i4.1
    IL_751: call void [System.Console]System.Console::WriteLine(int32)
    // blt.s
    IL_753: ldc.r4 1.0
    IL_754: ldc.r4 0.0
    IL_755: div
    IL_756: ldc.r4 1.0
    IL_757: blt.s IL_760
    IL_758: ldc.i4.0
    IL_759: br IL_761
    IL_760: ldc.i4.1
    IL_761: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un.s
    IL_763: ldc.r4 1.0
    IL_764: ldc.r4 0.0
    IL_765: div
    IL_766: ldc.r4 1.0
    IL_767: blt.un.s IL_770
    IL_768: ldc.i4.0
    IL_769: br IL_771
    IL_770: ldc.i4.1
    IL_771: call void [System.Console]System.Console::WriteLine(int32)
    // ble.s
    IL_773: ldc.r4 1.0
    IL_774: ldc.r4 0.0
    IL_775: div
    IL_776: ldc.r4 1.0
    IL_777: ble.s IL_780
    IL_778: ldc.i4.0
    IL_779: br IL_781
    IL_780: ldc.i4.1
    IL_781: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un.s
    IL_783: ldc.r4 1.0
    IL_784: ldc.r4 0.0
    IL_785: div
    IL_786: ldc.r4 1.0
    IL_787: ble.un.s IL_790
    IL_788: ldc.i4.0
    IL_789: br IL_791
    IL_790: ldc.i4.1
    IL_791: call void [System.Console]System.Console::WriteLine(int32)
    IL_792: ldstr "one / infinity"
    IL_793: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_795: ldc.r4 1.0
    IL_796: ldc.r4 1.0
    IL_797: ldc.r4 0.0
    IL_798: div
    IL_799: ceq
    IL_800: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_802: ldc.r4 1.0
    IL_803: ldc.r4 1.0
    IL_804: ldc.r4 0.0
    IL_805: div
    IL_806: cgt
    IL_807: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_809: ldc.r4 1.0
    IL_810: ldc.r4 1.0
    IL_811: ldc.r4 0.0
    IL_812: div
    IL_813: cgt.un
    IL_814: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_816: ldc.r4 1.0
    IL_817: ldc.r4 1.0
    IL_818: ldc.r4 0.0
    IL_819: div
    IL_820: clt
    IL_821: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_823: ldc.r4 1.0
    IL_824: ldc.r4 1.0
    IL_825: ldc.r4 0.0
    IL_826: div
    IL_827: clt.un
    IL_828: call void [System.Console]System.Console::WriteLine(int32)
    // beq.s
    IL_830: ldc.r4 1.0
    IL_831: ldc.r4 1.0
    IL_832: ldc.r4 0.0
    IL_833: div
    IL_834: beq.s IL_837
    IL_835: ldc.i4.0
    IL_836: br IL_838
    IL_837: ldc.i4.1
    IL_838: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un.s
    IL_840: ldc.r4 1.0
    IL_841: ldc.r4 1.0
    IL_842: ldc.r4 0.0
    IL_843: div
    IL_844: bne.un.s IL_847
    IL_845: ldc.i4.0
    IL_846: br IL_848
    IL_847: ldc.i4.1
    IL_848: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.s
    IL_850: ldc.r4 1.0
    IL_851: ldc.r4 1.0
    IL_852: ldc.r4 0.0
    IL_853: div
    IL_854: bgt.s IL_857
    IL_855: ldc.i4.0
    IL_856: br IL_858
    IL_857: ldc.i4.1
    IL_858: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un.s
    IL_860: ldc.r4 1.0
    IL_861: ldc.r4 1.0
    IL_862: ldc.r4 0.0
    IL_863: div
    IL_864: bgt.un.s IL_867
    IL_865: ldc.i4.0
    IL_866: br IL_868
    IL_867: ldc.i4.1
    IL_868: call void [System.Console]System.Console::WriteLine(int32)
    // bge.s
    IL_870: ldc.r4 1.0
    IL_871: ldc.r4 1.0
    IL_872: ldc.r4 0.0
    IL_873: div
    IL_874: bge.s IL_877
    IL_875: ldc.i4.0
    IL_876: br IL_878
    IL_877: ldc.i4.1
    IL_878: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un.s
    IL_880: ldc.r4 1.0
    IL_881: ldc.r4 1.0
    IL_882: ldc.r4 0.0
    IL_883: div
    IL_884: bge.un.s IL_887
    IL_885: ldc.i4.0
    IL_886: br IL_888
    IL_887: ldc.i4.1
    IL_888: call void [System.Console]System.Console::WriteLine(int32)
    // blt.s
    IL_890: ldc.r4 1.0
    IL_891: ldc.r4 1.0
    IL_892: ldc.r4 0.0
    IL_893: div
    IL_894: blt.s IL_897
    IL_895: ldc.i4.0
    IL_896: br IL_898
    IL_897: ldc.i4.1
    IL_898: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un.s
    IL_900: ldc.r4 1.0
    IL_901: ldc.r4 1.0
    IL_902: ldc.r4 0.0
    IL_903: div
    IL_904: blt.un.s IL_907
    IL_905: ldc.i4.0
    IL_906: br IL_908
    IL_907: ldc.i4.1
    IL_908: call void [System.Console]System.Console::WriteLine(int32)
    // ble.s
    IL_910: ldc.r4 1.0
    IL_911: ldc.r4 1.0
    IL_912: ldc.r4 0.0
    IL_913: div
    IL_914: ble.s IL_917
    IL_915: ldc.i4.0
    IL_916: br IL_918
    IL_917: ldc.i4.1
    IL_918: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un.s
    IL_920: ldc.r4 1.0
    IL_921: ldc.r4 1.0
    IL_922: ldc.r4 0.0
    IL_923: div
    IL_924: ble.un.s IL_927
    IL_925: ldc.i4.0
    IL_926: br IL_928
    IL_927: ldc.i4.1
    IL_928: call void [System.Console]System.Console::WriteLine(int32)
    IL_929: ldstr "negative-infinity / one"
    IL_930: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_932: ldc.r4 -1.0
    IL_933: ldc.r4 0.0
    IL_934: div
    IL_935: ldc.r4 1.0
    IL_936: ceq
    IL_937: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_939: ldc.r4 -1.0
    IL_940: ldc.r4 0.0
    IL_941: div
    IL_942: ldc.r4 1.0
    IL_943: cgt
    IL_944: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_946: ldc.r4 -1.0
    IL_947: ldc.r4 0.0
    IL_948: div
    IL_949: ldc.r4 1.0
    IL_950: cgt.un
    IL_951: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_953: ldc.r4 -1.0
    IL_954: ldc.r4 0.0
    IL_955: div
    IL_956: ldc.r4 1.0
    IL_957: clt
    IL_958: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_960: ldc.r4 -1.0
    IL_961: ldc.r4 0.0
    IL_962: div
    IL_963: ldc.r4 1.0
    IL_964: clt.un
    IL_965: call void [System.Console]System.Console::WriteLine(int32)
    // beq.s
    IL_967: ldc.r4 -1.0
    IL_968: ldc.r4 0.0
    IL_969: div
    IL_970: ldc.r4 1.0
    IL_971: beq.s IL_974
    IL_972: ldc.i4.0
    IL_973: br IL_975
    IL_974: ldc.i4.1
    IL_975: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un.s
    IL_977: ldc.r4 -1.0
    IL_978: ldc.r4 0.0
    IL_979: div
    IL_980: ldc.r4 1.0
    IL_981: bne.un.s IL_984
    IL_982: ldc.i4.0
    IL_983: br IL_985
    IL_984: ldc.i4.1
    IL_985: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.s
    IL_987: ldc.r4 -1.0
    IL_988: ldc.r4 0.0
    IL_989: div
    IL_990: ldc.r4 1.0
    IL_991: bgt.s IL_994
    IL_992: ldc.i4.0
    IL_993: br IL_995
    IL_994: ldc.i4.1
    IL_995: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un.s
    IL_997: ldc.r4 -1.0
    IL_998: ldc.r4 0.0
    IL_999: div
    IL_1000: ldc.r4 1.0
    IL_1001: bgt.un.s IL_1004
    IL_1002: ldc.i4.0
    IL_1003: br IL_1005
    IL_1004: ldc.i4.1
    IL_1005: call void [System.Console]System.Console::WriteLine(int32)
    // bge.s
    IL_1007: ldc.r4 -1.0
    IL_1008: ldc.r4 0.0
    IL_1009: div
    IL_1010: ldc.r4 1.0
    IL_1011: bge.s IL_1014
    IL_1012: ldc.i4.0
    IL_1013: br IL_1015
    IL_1014: ldc.i4.1
    IL_1015: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un.s
    IL_1017: ldc.r4 -1.0
    IL_1018: ldc.r4 0.0
    IL_1019: div
    IL_1020: ldc.r4 1.0
    IL_1021: bge.un.s IL_1024
    IL_1022: ldc.i4.0
    IL_1023: br IL_1025
    IL_1024: ldc.i4.1
    IL_1025: call void [System.Console]System.Console::WriteLine(int32)
    // blt.s
    IL_1027: ldc.r4 -1.0
    IL_1028: ldc.r4 0.0
    IL_1029: div
    IL_1030: ldc.r4 1.0
    IL_1031: blt.s IL_1034
    IL_1032: ldc.i4.0
    IL_1033: br IL_1035
    IL_1034: ldc.i4.1
    IL_1035: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un.s
    IL_1037: ldc.r4 -1.0
    IL_1038: ldc.r4 0.0
    IL_1039: div
    IL_1040: ldc.r4 1.0
    IL_1041: blt.un.s IL_1044
    IL_1042: ldc.i4.0
    IL_1043: br IL_1045
    IL_1044: ldc.i4.1
    IL_1045: call void [System.Console]System.Console::WriteLine(int32)
    // ble.s
    IL_1047: ldc.r4 -1.0
    IL_1048: ldc.r4 0.0
    IL_1049: div
    IL_1050: ldc.r4 1.0
    IL_1051: ble.s IL_1054
    IL_1052: ldc.i4.0
    IL_1053: br IL_1055
    IL_1054: ldc.i4.1
    IL_1055: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un.s
    IL_1057: ldc.r4 -1.0
    IL_1058: ldc.r4 0.0
    IL_1059: div
    IL_1060: ldc.r4 1.0
    IL_1061: ble.un.s IL_1064
    IL_1062: ldc.i4.0
    IL_1063: br IL_1065
    IL_1064: ldc.i4.1
    IL_1065: call void [System.Console]System.Console::WriteLine(int32)
    IL_1066: ldstr "one / negative-infinity"
    IL_1067: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_1069: ldc.r4 1.0
    IL_1070: ldc.r4 -1.0
    IL_1071: ldc.r4 0.0
    IL_1072: div
    IL_1073: ceq
    IL_1074: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_1076: ldc.r4 1.0
    IL_1077: ldc.r4 -1.0
    IL_1078: ldc.r4 0.0
    IL_1079: div
    IL_1080: cgt
    IL_1081: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_1083: ldc.r4 1.0
    IL_1084: ldc.r4 -1.0
    IL_1085: ldc.r4 0.0
    IL_1086: div
    IL_1087: cgt.un
    IL_1088: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_1090: ldc.r4 1.0
    IL_1091: ldc.r4 -1.0
    IL_1092: ldc.r4 0.0
    IL_1093: div
    IL_1094: clt
    IL_1095: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_1097: ldc.r4 1.0
    IL_1098: ldc.r4 -1.0
    IL_1099: ldc.r4 0.0
    IL_1100: div
    IL_1101: clt.un
    IL_1102: call void [System.Console]System.Console::WriteLine(int32)
    // beq.s
    IL_1104: ldc.r4 1.0
    IL_1105: ldc.r4 -1.0
    IL_1106: ldc.r4 0.0
    IL_1107: div
    IL_1108: beq.s IL_1111
    IL_1109: ldc.i4.0
    IL_1110: br IL_1112
    IL_1111: ldc.i4.1
    IL_1112: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un.s
    IL_1114: ldc.r4 1.0
    IL_1115: ldc.r4 -1.0
    IL_1116: ldc.r4 0.0
    IL_1117: div
    IL_1118: bne.un.s IL_1121
    IL_1119: ldc.i4.0
    IL_1120: br IL_1122
    IL_1121: ldc.i4.1
    IL_1122: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.s
    IL_1124: ldc.r4 1.0
    IL_1125: ldc.r4 -1.0
    IL_1126: ldc.r4 0.0
    IL_1127: div
    IL_1128: bgt.s IL_1131
    IL_1129: ldc.i4.0
    IL_1130: br IL_1132
    IL_1131: ldc.i4.1
    IL_1132: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un.s
    IL_1134: ldc.r4 1.0
    IL_1135: ldc.r4 -1.0
    IL_1136: ldc.r4 0.0
    IL_1137: div
    IL_1138: bgt.un.s IL_1141
    IL_1139: ldc.i4.0
    IL_1140: br IL_1142
    IL_1141: ldc.i4.1
    IL_1142: call void [System.Console]System.Console::WriteLine(int32)
    // bge.s
    IL_1144: ldc.r4 1.0
    IL_1145: ldc.r4 -1.0
    IL_1146: ldc.r4 0.0
    IL_1147: div
    IL_1148: bge.s IL_1151
    IL_1149: ldc.i4.0
    IL_1150: br IL_1152
    IL_1151: ldc.i4.1
    IL_1152: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un.s
    IL_1154: ldc.r4 1.0
    IL_1155: ldc.r4 -1.0
    IL_1156: ldc.r4 0.0
    IL_1157: div
    IL_1158: bge.un.s IL_1161
    IL_1159: ldc.i4.0
    IL_1160: br IL_1162
    IL_1161: ldc.i4.1
    IL_1162: call void [System.Console]System.Console::WriteLine(int32)
    // blt.s
    IL_1164: ldc.r4 1.0
    IL_1165: ldc.r4 -1.0
    IL_1166: ldc.r4 0.0
    IL_1167: div
    IL_1168: blt.s IL_1171
    IL_1169: ldc.i4.0
    IL_1170: br IL_1172
    IL_1171: ldc.i4.1
    IL_1172: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un.s
    IL_1174: ldc.r4 1.0
    IL_1175: ldc.r4 -1.0
    IL_1176: ldc.r4 0.0
    IL_1177: div
    IL_1178: blt.un.s IL_1181
    IL_1179: ldc.i4.0
    IL_1180: br IL_1182
    IL_1181: ldc.i4.1
    IL_1182: call void [System.Console]System.Console::WriteLine(int32)
    // ble.s
    IL_1184: ldc.r4 1.0
    IL_1185: ldc.r4 -1.0
    IL_1186: ldc.r4 0.0
    IL_1187: div
    IL_1188: ble.s IL_1191
    IL_1189: ldc.i4.0
    IL_1190: br IL_1192
    IL_1191: ldc.i4.1
    IL_1192: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un.s
    IL_1194: ldc.r4 1.0
    IL_1195: ldc.r4 -1.0
    IL_1196: ldc.r4 0.0
    IL_1197: div
    IL_1198: ble.un.s IL_1201
    IL_1199: ldc.i4.0
    IL_1200: br IL_1202
    IL_1201: ldc.i4.1
    IL_1202: call void [System.Console]System.Console::WriteLine(int32)
    IL_1203: ldstr "infinity / infinity"
    IL_1204: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_1206: ldc.r4 1.0
    IL_1207: ldc.r4 0.0
    IL_1208: div
    IL_1209: ldc.r4 1.0
    IL_1210: ldc.r4 0.0
    IL_1211: div
    IL_1212: ceq
    IL_1213: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_1215: ldc.r4 1.0
    IL_1216: ldc.r4 0.0
    IL_1217: div
    IL_1218: ldc.r4 1.0
    IL_1219: ldc.r4 0.0
    IL_1220: div
    IL_1221: cgt
    IL_1222: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_1224: ldc.r4 1.0
    IL_1225: ldc.r4 0.0
    IL_1226: div
    IL_1227: ldc.r4 1.0
    IL_1228: ldc.r4 0.0
    IL_1229: div
    IL_1230: cgt.un
    IL_1231: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_1233: ldc.r4 1.0
    IL_1234: ldc.r4 0.0
    IL_1235: div
    IL_1236: ldc.r4 1.0
    IL_1237: ldc.r4 0.0
    IL_1238: div
    IL_1239: clt
    IL_1240: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_1242: ldc.r4 1.0
    IL_1243: ldc.r4 0.0
    IL_1244: div
    IL_1245: ldc.r4 1.0
    IL_1246: ldc.r4 0.0
    IL_1247: div
    IL_1248: clt.un
    IL_1249: call void [System.Console]System.Console::WriteLine(int32)
    // beq.s
    IL_1251: ldc.r4 1.0
    IL_1252: ldc.r4 0.0
    IL_1253: div
    IL_1254: ldc.r4 1.0
    IL_1255: ldc.r4 0.0
    IL_1256: div
    IL_1257: beq.s IL_1260
    IL_1258: ldc.i4.0
    IL_1259: br IL_1261
    IL_1260: ldc.i4.1
    IL_1261: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un.s
    IL_1263: ldc.r4 1.0
    IL_1264: ldc.r4 0.0
    IL_1265: div
    IL_1266: ldc.r4 1.0
    IL_1267: ldc.r4 0.0
    IL_1268: div
    IL_1269: bne.un.s IL_1272
    IL_1270: ldc.i4.0
    IL_1271: br IL_1273
    IL_1272: ldc.i4.1
    IL_1273: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.s
    IL_1275: ldc.r4 1.0
    IL_1276: ldc.r4 0.0
    IL_1277: div
    IL_1278: ldc.r4 1.0
    IL_1279: ldc.r4 0.0
    IL_1280: div
    IL_1281: bgt.s IL_1284
    IL_1282: ldc.i4.0
    IL_1283: br IL_1285
    IL_1284: ldc.i4.1
    IL_1285: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un.s
    IL_1287: ldc.r4 1.0
    IL_1288: ldc.r4 0.0
    IL_1289: div
    IL_1290: ldc.r4 1.0
    IL_1291: ldc.r4 0.0
    IL_1292: div
    IL_1293: bgt.un.s IL_1296
    IL_1294: ldc.i4.0
    IL_1295: br IL_1297
    IL_1296: ldc.i4.1
    IL_1297: call void [System.Console]System.Console::WriteLine(int32)
    // bge.s
    IL_1299: ldc.r4 1.0
    IL_1300: ldc.r4 0.0
    IL_1301: div
    IL_1302: ldc.r4 1.0
    IL_1303: ldc.r4 0.0
    IL_1304: div
    IL_1305: bge.s IL_1308
    IL_1306: ldc.i4.0
    IL_1307: br IL_1309
    IL_1308: ldc.i4.1
    IL_1309: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un.s
    IL_1311: ldc.r4 1.0
    IL_1312: ldc.r4 0.0
    IL_1313: div
    IL_1314: ldc.r4 1.0
    IL_1315: ldc.r4 0.0
    IL_1316: div
    IL_1317: bge.un.s IL_1320
    IL_1318: ldc.i4.0
    IL_1319: br IL_1321
    IL_1320: ldc.i4.1
    IL_1321: call void [System.Console]System.Console::WriteLine(int32)
    // blt.s
    IL_1323: ldc.r4 1.0
    IL_1324: ldc.r4 0.0
    IL_1325: div
    IL_1326: ldc.r4 1.0
    IL_1327: ldc.r4 0.0
    IL_1328: div
    IL_1329: blt.s IL_1332
    IL_1330: ldc.i4.0
    IL_1331: br IL_1333
    IL_1332: ldc.i4.1
    IL_1333: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un.s
    IL_1335: ldc.r4 1.0
    IL_1336: ldc.r4 0.0
    IL_1337: div
    IL_1338: ldc.r4 1.0
    IL_1339: ldc.r4 0.0
    IL_1340: div
    IL_1341: blt.un.s IL_1344
    IL_1342: ldc.i4.0
    IL_1343: br IL_1345
    IL_1344: ldc.i4.1
    IL_1345: call void [System.Console]System.Console::WriteLine(int32)
    // ble.s
    IL_1347: ldc.r4 1.0
    IL_1348: ldc.r4 0.0
    IL_1349: div
    IL_1350: ldc.r4 1.0
    IL_1351: ldc.r4 0.0
    IL_1352: div
    IL_1353: ble.s IL_1356
    IL_1354: ldc.i4.0
    IL_1355: br IL_1357
    IL_1356: ldc.i4.1
    IL_1357: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un.s
    IL_1359: ldc.r4 1.0
    IL_1360: ldc.r4 0.0
    IL_1361: div
    IL_1362: ldc.r4 1.0
    IL_1363: ldc.r4 0.0
    IL_1364: div
    IL_1365: ble.un.s IL_1368
    IL_1366: ldc.i4.0
    IL_1367: br IL_1369
    IL_1368: ldc.i4.1
    IL_1369: call void [System.Console]System.Console::WriteLine(int32)
    IL_1370: ret
  }
}
