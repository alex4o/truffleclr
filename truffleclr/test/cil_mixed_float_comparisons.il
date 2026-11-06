// ECMA-335 I.12.1.3 (evaluation-stack F), III.3.21-26: float32/float64 mixed comparisons.
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
    IL_0: ldstr "r4 zero / r8 negative-zero"
    IL_1: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_3: ldc.r4 0.0
    IL_4: ldc.r8 -0.0
    IL_5: ceq
    IL_6: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_8: ldc.r4 0.0
    IL_9: ldc.r8 -0.0
    IL_10: cgt
    IL_11: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_13: ldc.r4 0.0
    IL_14: ldc.r8 -0.0
    IL_15: cgt.un
    IL_16: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_18: ldc.r4 0.0
    IL_19: ldc.r8 -0.0
    IL_20: clt
    IL_21: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_23: ldc.r4 0.0
    IL_24: ldc.r8 -0.0
    IL_25: clt.un
    IL_26: call void [System.Console]System.Console::WriteLine(int32)
    // beq
    IL_28: ldc.r4 0.0
    IL_29: ldc.r8 -0.0
    IL_30: beq IL_33
    IL_31: ldc.i4.0
    IL_32: br IL_34
    IL_33: ldc.i4.1
    IL_34: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un
    IL_36: ldc.r4 0.0
    IL_37: ldc.r8 -0.0
    IL_38: bne.un IL_41
    IL_39: ldc.i4.0
    IL_40: br IL_42
    IL_41: ldc.i4.1
    IL_42: call void [System.Console]System.Console::WriteLine(int32)
    // bgt
    IL_44: ldc.r4 0.0
    IL_45: ldc.r8 -0.0
    IL_46: bgt IL_49
    IL_47: ldc.i4.0
    IL_48: br IL_50
    IL_49: ldc.i4.1
    IL_50: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un
    IL_52: ldc.r4 0.0
    IL_53: ldc.r8 -0.0
    IL_54: bgt.un IL_57
    IL_55: ldc.i4.0
    IL_56: br IL_58
    IL_57: ldc.i4.1
    IL_58: call void [System.Console]System.Console::WriteLine(int32)
    // bge
    IL_60: ldc.r4 0.0
    IL_61: ldc.r8 -0.0
    IL_62: bge IL_65
    IL_63: ldc.i4.0
    IL_64: br IL_66
    IL_65: ldc.i4.1
    IL_66: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un
    IL_68: ldc.r4 0.0
    IL_69: ldc.r8 -0.0
    IL_70: bge.un IL_73
    IL_71: ldc.i4.0
    IL_72: br IL_74
    IL_73: ldc.i4.1
    IL_74: call void [System.Console]System.Console::WriteLine(int32)
    // blt
    IL_76: ldc.r4 0.0
    IL_77: ldc.r8 -0.0
    IL_78: blt IL_81
    IL_79: ldc.i4.0
    IL_80: br IL_82
    IL_81: ldc.i4.1
    IL_82: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un
    IL_84: ldc.r4 0.0
    IL_85: ldc.r8 -0.0
    IL_86: blt.un IL_89
    IL_87: ldc.i4.0
    IL_88: br IL_90
    IL_89: ldc.i4.1
    IL_90: call void [System.Console]System.Console::WriteLine(int32)
    // ble
    IL_92: ldc.r4 0.0
    IL_93: ldc.r8 -0.0
    IL_94: ble IL_97
    IL_95: ldc.i4.0
    IL_96: br IL_98
    IL_97: ldc.i4.1
    IL_98: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un
    IL_100: ldc.r4 0.0
    IL_101: ldc.r8 -0.0
    IL_102: ble.un IL_105
    IL_103: ldc.i4.0
    IL_104: br IL_106
    IL_105: ldc.i4.1
    IL_106: call void [System.Console]System.Console::WriteLine(int32)
    IL_107: ldstr "r8 negative-zero / r4 zero"
    IL_108: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_110: ldc.r8 -0.0
    IL_111: ldc.r4 0.0
    IL_112: ceq
    IL_113: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_115: ldc.r8 -0.0
    IL_116: ldc.r4 0.0
    IL_117: cgt
    IL_118: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_120: ldc.r8 -0.0
    IL_121: ldc.r4 0.0
    IL_122: cgt.un
    IL_123: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_125: ldc.r8 -0.0
    IL_126: ldc.r4 0.0
    IL_127: clt
    IL_128: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_130: ldc.r8 -0.0
    IL_131: ldc.r4 0.0
    IL_132: clt.un
    IL_133: call void [System.Console]System.Console::WriteLine(int32)
    // beq
    IL_135: ldc.r8 -0.0
    IL_136: ldc.r4 0.0
    IL_137: beq IL_140
    IL_138: ldc.i4.0
    IL_139: br IL_141
    IL_140: ldc.i4.1
    IL_141: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un
    IL_143: ldc.r8 -0.0
    IL_144: ldc.r4 0.0
    IL_145: bne.un IL_148
    IL_146: ldc.i4.0
    IL_147: br IL_149
    IL_148: ldc.i4.1
    IL_149: call void [System.Console]System.Console::WriteLine(int32)
    // bgt
    IL_151: ldc.r8 -0.0
    IL_152: ldc.r4 0.0
    IL_153: bgt IL_156
    IL_154: ldc.i4.0
    IL_155: br IL_157
    IL_156: ldc.i4.1
    IL_157: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un
    IL_159: ldc.r8 -0.0
    IL_160: ldc.r4 0.0
    IL_161: bgt.un IL_164
    IL_162: ldc.i4.0
    IL_163: br IL_165
    IL_164: ldc.i4.1
    IL_165: call void [System.Console]System.Console::WriteLine(int32)
    // bge
    IL_167: ldc.r8 -0.0
    IL_168: ldc.r4 0.0
    IL_169: bge IL_172
    IL_170: ldc.i4.0
    IL_171: br IL_173
    IL_172: ldc.i4.1
    IL_173: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un
    IL_175: ldc.r8 -0.0
    IL_176: ldc.r4 0.0
    IL_177: bge.un IL_180
    IL_178: ldc.i4.0
    IL_179: br IL_181
    IL_180: ldc.i4.1
    IL_181: call void [System.Console]System.Console::WriteLine(int32)
    // blt
    IL_183: ldc.r8 -0.0
    IL_184: ldc.r4 0.0
    IL_185: blt IL_188
    IL_186: ldc.i4.0
    IL_187: br IL_189
    IL_188: ldc.i4.1
    IL_189: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un
    IL_191: ldc.r8 -0.0
    IL_192: ldc.r4 0.0
    IL_193: blt.un IL_196
    IL_194: ldc.i4.0
    IL_195: br IL_197
    IL_196: ldc.i4.1
    IL_197: call void [System.Console]System.Console::WriteLine(int32)
    // ble
    IL_199: ldc.r8 -0.0
    IL_200: ldc.r4 0.0
    IL_201: ble IL_204
    IL_202: ldc.i4.0
    IL_203: br IL_205
    IL_204: ldc.i4.1
    IL_205: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un
    IL_207: ldc.r8 -0.0
    IL_208: ldc.r4 0.0
    IL_209: ble.un IL_212
    IL_210: ldc.i4.0
    IL_211: br IL_213
    IL_212: ldc.i4.1
    IL_213: call void [System.Console]System.Console::WriteLine(int32)
    IL_214: ldstr "r4 NaN / r8 one"
    IL_215: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_217: ldc.r4 0.0
    IL_218: ldc.r4 0.0
    IL_219: div
    IL_220: ldc.r8 1.0
    IL_221: ceq
    IL_222: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_224: ldc.r4 0.0
    IL_225: ldc.r4 0.0
    IL_226: div
    IL_227: ldc.r8 1.0
    IL_228: cgt
    IL_229: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_231: ldc.r4 0.0
    IL_232: ldc.r4 0.0
    IL_233: div
    IL_234: ldc.r8 1.0
    IL_235: cgt.un
    IL_236: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_238: ldc.r4 0.0
    IL_239: ldc.r4 0.0
    IL_240: div
    IL_241: ldc.r8 1.0
    IL_242: clt
    IL_243: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_245: ldc.r4 0.0
    IL_246: ldc.r4 0.0
    IL_247: div
    IL_248: ldc.r8 1.0
    IL_249: clt.un
    IL_250: call void [System.Console]System.Console::WriteLine(int32)
    // beq
    IL_252: ldc.r4 0.0
    IL_253: ldc.r4 0.0
    IL_254: div
    IL_255: ldc.r8 1.0
    IL_256: beq IL_259
    IL_257: ldc.i4.0
    IL_258: br IL_260
    IL_259: ldc.i4.1
    IL_260: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un
    IL_262: ldc.r4 0.0
    IL_263: ldc.r4 0.0
    IL_264: div
    IL_265: ldc.r8 1.0
    IL_266: bne.un IL_269
    IL_267: ldc.i4.0
    IL_268: br IL_270
    IL_269: ldc.i4.1
    IL_270: call void [System.Console]System.Console::WriteLine(int32)
    // bgt
    IL_272: ldc.r4 0.0
    IL_273: ldc.r4 0.0
    IL_274: div
    IL_275: ldc.r8 1.0
    IL_276: bgt IL_279
    IL_277: ldc.i4.0
    IL_278: br IL_280
    IL_279: ldc.i4.1
    IL_280: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un
    IL_282: ldc.r4 0.0
    IL_283: ldc.r4 0.0
    IL_284: div
    IL_285: ldc.r8 1.0
    IL_286: bgt.un IL_289
    IL_287: ldc.i4.0
    IL_288: br IL_290
    IL_289: ldc.i4.1
    IL_290: call void [System.Console]System.Console::WriteLine(int32)
    // bge
    IL_292: ldc.r4 0.0
    IL_293: ldc.r4 0.0
    IL_294: div
    IL_295: ldc.r8 1.0
    IL_296: bge IL_299
    IL_297: ldc.i4.0
    IL_298: br IL_300
    IL_299: ldc.i4.1
    IL_300: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un
    IL_302: ldc.r4 0.0
    IL_303: ldc.r4 0.0
    IL_304: div
    IL_305: ldc.r8 1.0
    IL_306: bge.un IL_309
    IL_307: ldc.i4.0
    IL_308: br IL_310
    IL_309: ldc.i4.1
    IL_310: call void [System.Console]System.Console::WriteLine(int32)
    // blt
    IL_312: ldc.r4 0.0
    IL_313: ldc.r4 0.0
    IL_314: div
    IL_315: ldc.r8 1.0
    IL_316: blt IL_319
    IL_317: ldc.i4.0
    IL_318: br IL_320
    IL_319: ldc.i4.1
    IL_320: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un
    IL_322: ldc.r4 0.0
    IL_323: ldc.r4 0.0
    IL_324: div
    IL_325: ldc.r8 1.0
    IL_326: blt.un IL_329
    IL_327: ldc.i4.0
    IL_328: br IL_330
    IL_329: ldc.i4.1
    IL_330: call void [System.Console]System.Console::WriteLine(int32)
    // ble
    IL_332: ldc.r4 0.0
    IL_333: ldc.r4 0.0
    IL_334: div
    IL_335: ldc.r8 1.0
    IL_336: ble IL_339
    IL_337: ldc.i4.0
    IL_338: br IL_340
    IL_339: ldc.i4.1
    IL_340: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un
    IL_342: ldc.r4 0.0
    IL_343: ldc.r4 0.0
    IL_344: div
    IL_345: ldc.r8 1.0
    IL_346: ble.un IL_349
    IL_347: ldc.i4.0
    IL_348: br IL_350
    IL_349: ldc.i4.1
    IL_350: call void [System.Console]System.Console::WriteLine(int32)
    IL_351: ldstr "r8 one / r4 NaN"
    IL_352: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_354: ldc.r8 1.0
    IL_355: ldc.r4 0.0
    IL_356: ldc.r4 0.0
    IL_357: div
    IL_358: ceq
    IL_359: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_361: ldc.r8 1.0
    IL_362: ldc.r4 0.0
    IL_363: ldc.r4 0.0
    IL_364: div
    IL_365: cgt
    IL_366: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_368: ldc.r8 1.0
    IL_369: ldc.r4 0.0
    IL_370: ldc.r4 0.0
    IL_371: div
    IL_372: cgt.un
    IL_373: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_375: ldc.r8 1.0
    IL_376: ldc.r4 0.0
    IL_377: ldc.r4 0.0
    IL_378: div
    IL_379: clt
    IL_380: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_382: ldc.r8 1.0
    IL_383: ldc.r4 0.0
    IL_384: ldc.r4 0.0
    IL_385: div
    IL_386: clt.un
    IL_387: call void [System.Console]System.Console::WriteLine(int32)
    // beq
    IL_389: ldc.r8 1.0
    IL_390: ldc.r4 0.0
    IL_391: ldc.r4 0.0
    IL_392: div
    IL_393: beq IL_396
    IL_394: ldc.i4.0
    IL_395: br IL_397
    IL_396: ldc.i4.1
    IL_397: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un
    IL_399: ldc.r8 1.0
    IL_400: ldc.r4 0.0
    IL_401: ldc.r4 0.0
    IL_402: div
    IL_403: bne.un IL_406
    IL_404: ldc.i4.0
    IL_405: br IL_407
    IL_406: ldc.i4.1
    IL_407: call void [System.Console]System.Console::WriteLine(int32)
    // bgt
    IL_409: ldc.r8 1.0
    IL_410: ldc.r4 0.0
    IL_411: ldc.r4 0.0
    IL_412: div
    IL_413: bgt IL_416
    IL_414: ldc.i4.0
    IL_415: br IL_417
    IL_416: ldc.i4.1
    IL_417: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un
    IL_419: ldc.r8 1.0
    IL_420: ldc.r4 0.0
    IL_421: ldc.r4 0.0
    IL_422: div
    IL_423: bgt.un IL_426
    IL_424: ldc.i4.0
    IL_425: br IL_427
    IL_426: ldc.i4.1
    IL_427: call void [System.Console]System.Console::WriteLine(int32)
    // bge
    IL_429: ldc.r8 1.0
    IL_430: ldc.r4 0.0
    IL_431: ldc.r4 0.0
    IL_432: div
    IL_433: bge IL_436
    IL_434: ldc.i4.0
    IL_435: br IL_437
    IL_436: ldc.i4.1
    IL_437: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un
    IL_439: ldc.r8 1.0
    IL_440: ldc.r4 0.0
    IL_441: ldc.r4 0.0
    IL_442: div
    IL_443: bge.un IL_446
    IL_444: ldc.i4.0
    IL_445: br IL_447
    IL_446: ldc.i4.1
    IL_447: call void [System.Console]System.Console::WriteLine(int32)
    // blt
    IL_449: ldc.r8 1.0
    IL_450: ldc.r4 0.0
    IL_451: ldc.r4 0.0
    IL_452: div
    IL_453: blt IL_456
    IL_454: ldc.i4.0
    IL_455: br IL_457
    IL_456: ldc.i4.1
    IL_457: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un
    IL_459: ldc.r8 1.0
    IL_460: ldc.r4 0.0
    IL_461: ldc.r4 0.0
    IL_462: div
    IL_463: blt.un IL_466
    IL_464: ldc.i4.0
    IL_465: br IL_467
    IL_466: ldc.i4.1
    IL_467: call void [System.Console]System.Console::WriteLine(int32)
    // ble
    IL_469: ldc.r8 1.0
    IL_470: ldc.r4 0.0
    IL_471: ldc.r4 0.0
    IL_472: div
    IL_473: ble IL_476
    IL_474: ldc.i4.0
    IL_475: br IL_477
    IL_476: ldc.i4.1
    IL_477: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un
    IL_479: ldc.r8 1.0
    IL_480: ldc.r4 0.0
    IL_481: ldc.r4 0.0
    IL_482: div
    IL_483: ble.un IL_486
    IL_484: ldc.i4.0
    IL_485: br IL_487
    IL_486: ldc.i4.1
    IL_487: call void [System.Console]System.Console::WriteLine(int32)
    IL_488: ldstr "r8 NaN / r4 one"
    IL_489: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_491: ldc.r8 0.0
    IL_492: ldc.r8 0.0
    IL_493: div
    IL_494: ldc.r4 1.0
    IL_495: ceq
    IL_496: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_498: ldc.r8 0.0
    IL_499: ldc.r8 0.0
    IL_500: div
    IL_501: ldc.r4 1.0
    IL_502: cgt
    IL_503: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_505: ldc.r8 0.0
    IL_506: ldc.r8 0.0
    IL_507: div
    IL_508: ldc.r4 1.0
    IL_509: cgt.un
    IL_510: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_512: ldc.r8 0.0
    IL_513: ldc.r8 0.0
    IL_514: div
    IL_515: ldc.r4 1.0
    IL_516: clt
    IL_517: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_519: ldc.r8 0.0
    IL_520: ldc.r8 0.0
    IL_521: div
    IL_522: ldc.r4 1.0
    IL_523: clt.un
    IL_524: call void [System.Console]System.Console::WriteLine(int32)
    // beq
    IL_526: ldc.r8 0.0
    IL_527: ldc.r8 0.0
    IL_528: div
    IL_529: ldc.r4 1.0
    IL_530: beq IL_533
    IL_531: ldc.i4.0
    IL_532: br IL_534
    IL_533: ldc.i4.1
    IL_534: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un
    IL_536: ldc.r8 0.0
    IL_537: ldc.r8 0.0
    IL_538: div
    IL_539: ldc.r4 1.0
    IL_540: bne.un IL_543
    IL_541: ldc.i4.0
    IL_542: br IL_544
    IL_543: ldc.i4.1
    IL_544: call void [System.Console]System.Console::WriteLine(int32)
    // bgt
    IL_546: ldc.r8 0.0
    IL_547: ldc.r8 0.0
    IL_548: div
    IL_549: ldc.r4 1.0
    IL_550: bgt IL_553
    IL_551: ldc.i4.0
    IL_552: br IL_554
    IL_553: ldc.i4.1
    IL_554: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un
    IL_556: ldc.r8 0.0
    IL_557: ldc.r8 0.0
    IL_558: div
    IL_559: ldc.r4 1.0
    IL_560: bgt.un IL_563
    IL_561: ldc.i4.0
    IL_562: br IL_564
    IL_563: ldc.i4.1
    IL_564: call void [System.Console]System.Console::WriteLine(int32)
    // bge
    IL_566: ldc.r8 0.0
    IL_567: ldc.r8 0.0
    IL_568: div
    IL_569: ldc.r4 1.0
    IL_570: bge IL_573
    IL_571: ldc.i4.0
    IL_572: br IL_574
    IL_573: ldc.i4.1
    IL_574: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un
    IL_576: ldc.r8 0.0
    IL_577: ldc.r8 0.0
    IL_578: div
    IL_579: ldc.r4 1.0
    IL_580: bge.un IL_583
    IL_581: ldc.i4.0
    IL_582: br IL_584
    IL_583: ldc.i4.1
    IL_584: call void [System.Console]System.Console::WriteLine(int32)
    // blt
    IL_586: ldc.r8 0.0
    IL_587: ldc.r8 0.0
    IL_588: div
    IL_589: ldc.r4 1.0
    IL_590: blt IL_593
    IL_591: ldc.i4.0
    IL_592: br IL_594
    IL_593: ldc.i4.1
    IL_594: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un
    IL_596: ldc.r8 0.0
    IL_597: ldc.r8 0.0
    IL_598: div
    IL_599: ldc.r4 1.0
    IL_600: blt.un IL_603
    IL_601: ldc.i4.0
    IL_602: br IL_604
    IL_603: ldc.i4.1
    IL_604: call void [System.Console]System.Console::WriteLine(int32)
    // ble
    IL_606: ldc.r8 0.0
    IL_607: ldc.r8 0.0
    IL_608: div
    IL_609: ldc.r4 1.0
    IL_610: ble IL_613
    IL_611: ldc.i4.0
    IL_612: br IL_614
    IL_613: ldc.i4.1
    IL_614: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un
    IL_616: ldc.r8 0.0
    IL_617: ldc.r8 0.0
    IL_618: div
    IL_619: ldc.r4 1.0
    IL_620: ble.un IL_623
    IL_621: ldc.i4.0
    IL_622: br IL_624
    IL_623: ldc.i4.1
    IL_624: call void [System.Console]System.Console::WriteLine(int32)
    IL_625: ldstr "r4 one / r8 NaN"
    IL_626: call void [System.Console]System.Console::WriteLine(string)
    // ceq
    IL_628: ldc.r4 1.0
    IL_629: ldc.r8 0.0
    IL_630: ldc.r8 0.0
    IL_631: div
    IL_632: ceq
    IL_633: call void [System.Console]System.Console::WriteLine(int32)
    // cgt
    IL_635: ldc.r4 1.0
    IL_636: ldc.r8 0.0
    IL_637: ldc.r8 0.0
    IL_638: div
    IL_639: cgt
    IL_640: call void [System.Console]System.Console::WriteLine(int32)
    // cgt.un
    IL_642: ldc.r4 1.0
    IL_643: ldc.r8 0.0
    IL_644: ldc.r8 0.0
    IL_645: div
    IL_646: cgt.un
    IL_647: call void [System.Console]System.Console::WriteLine(int32)
    // clt
    IL_649: ldc.r4 1.0
    IL_650: ldc.r8 0.0
    IL_651: ldc.r8 0.0
    IL_652: div
    IL_653: clt
    IL_654: call void [System.Console]System.Console::WriteLine(int32)
    // clt.un
    IL_656: ldc.r4 1.0
    IL_657: ldc.r8 0.0
    IL_658: ldc.r8 0.0
    IL_659: div
    IL_660: clt.un
    IL_661: call void [System.Console]System.Console::WriteLine(int32)
    // beq
    IL_663: ldc.r4 1.0
    IL_664: ldc.r8 0.0
    IL_665: ldc.r8 0.0
    IL_666: div
    IL_667: beq IL_670
    IL_668: ldc.i4.0
    IL_669: br IL_671
    IL_670: ldc.i4.1
    IL_671: call void [System.Console]System.Console::WriteLine(int32)
    // bne.un
    IL_673: ldc.r4 1.0
    IL_674: ldc.r8 0.0
    IL_675: ldc.r8 0.0
    IL_676: div
    IL_677: bne.un IL_680
    IL_678: ldc.i4.0
    IL_679: br IL_681
    IL_680: ldc.i4.1
    IL_681: call void [System.Console]System.Console::WriteLine(int32)
    // bgt
    IL_683: ldc.r4 1.0
    IL_684: ldc.r8 0.0
    IL_685: ldc.r8 0.0
    IL_686: div
    IL_687: bgt IL_690
    IL_688: ldc.i4.0
    IL_689: br IL_691
    IL_690: ldc.i4.1
    IL_691: call void [System.Console]System.Console::WriteLine(int32)
    // bgt.un
    IL_693: ldc.r4 1.0
    IL_694: ldc.r8 0.0
    IL_695: ldc.r8 0.0
    IL_696: div
    IL_697: bgt.un IL_700
    IL_698: ldc.i4.0
    IL_699: br IL_701
    IL_700: ldc.i4.1
    IL_701: call void [System.Console]System.Console::WriteLine(int32)
    // bge
    IL_703: ldc.r4 1.0
    IL_704: ldc.r8 0.0
    IL_705: ldc.r8 0.0
    IL_706: div
    IL_707: bge IL_710
    IL_708: ldc.i4.0
    IL_709: br IL_711
    IL_710: ldc.i4.1
    IL_711: call void [System.Console]System.Console::WriteLine(int32)
    // bge.un
    IL_713: ldc.r4 1.0
    IL_714: ldc.r8 0.0
    IL_715: ldc.r8 0.0
    IL_716: div
    IL_717: bge.un IL_720
    IL_718: ldc.i4.0
    IL_719: br IL_721
    IL_720: ldc.i4.1
    IL_721: call void [System.Console]System.Console::WriteLine(int32)
    // blt
    IL_723: ldc.r4 1.0
    IL_724: ldc.r8 0.0
    IL_725: ldc.r8 0.0
    IL_726: div
    IL_727: blt IL_730
    IL_728: ldc.i4.0
    IL_729: br IL_731
    IL_730: ldc.i4.1
    IL_731: call void [System.Console]System.Console::WriteLine(int32)
    // blt.un
    IL_733: ldc.r4 1.0
    IL_734: ldc.r8 0.0
    IL_735: ldc.r8 0.0
    IL_736: div
    IL_737: blt.un IL_740
    IL_738: ldc.i4.0
    IL_739: br IL_741
    IL_740: ldc.i4.1
    IL_741: call void [System.Console]System.Console::WriteLine(int32)
    // ble
    IL_743: ldc.r4 1.0
    IL_744: ldc.r8 0.0
    IL_745: ldc.r8 0.0
    IL_746: div
    IL_747: ble IL_750
    IL_748: ldc.i4.0
    IL_749: br IL_751
    IL_750: ldc.i4.1
    IL_751: call void [System.Console]System.Console::WriteLine(int32)
    // ble.un
    IL_753: ldc.r4 1.0
    IL_754: ldc.r8 0.0
    IL_755: ldc.r8 0.0
    IL_756: div
    IL_757: ble.un IL_760
    IL_758: ldc.i4.0
    IL_759: br IL_761
    IL_760: ldc.i4.1
    IL_761: call void [System.Console]System.Console::WriteLine(int32)
    IL_762: ret
  }
}
