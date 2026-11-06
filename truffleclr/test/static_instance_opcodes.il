.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly HelloWorld {}
.module HelloWorld.dll

.class public auto ansi HelloWorld.Storage extends [System.Runtime]System.Object {
  .field public static int32 Number
  .method private static specialname rtspecialname void .cctor() cil managed {
    .maxstack 2
    IL_0: ldstr "load cctor"
    IL_1: call void [System.Console]System.Console::WriteLine(string)
    IL_2: ldc.i4.7
    IL_3: stsfld int32 HelloWorld.Storage::Number
    IL_4: ret
  }
}
.class public auto ansi HelloWorld.Child extends HelloWorld.Storage { }
.class public auto ansi HelloWorld.StoreFirst extends [System.Runtime]System.Object {
  .field public static int32 Number
  .method private static specialname rtspecialname void .cctor() cil managed {
    .maxstack 2
    IL_0: ldstr "store cctor"
    IL_1: call void [System.Console]System.Console::WriteLine(string)
    IL_2: ldc.i4.3
    IL_3: stsfld int32 HelloWorld.StoreFirst::Number
    IL_4: ret
  }
}
.class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object {
  .method public static object Receiver() cil managed {
    .maxstack 2
    IL_0: ldstr "receiver"
    IL_1: call void [System.Console]System.Console::WriteLine(string)
    IL_2: ldnull
    IL_3: ret
  }
  .method public static int32 Value() cil managed {
    .maxstack 2
    IL_0: ldstr "value"
    IL_1: call void [System.Console]System.Console::WriteLine(string)
    IL_2: ldc.i4.s 9
    IL_3: ret
  }
  .method public static void Main(string[] args) cil managed {
    .entrypoint
    .maxstack 8
    IL_0: call object HelloWorld.Program::Receiver()
    IL_1: ldfld int32 HelloWorld.Child::Number
    IL_2: call void [System.Console]System.Console::WriteLine(int32)
    IL_3: call object HelloWorld.Program::Receiver()
    IL_4: call int32 HelloWorld.Program::Value()
    IL_5: stfld int32 HelloWorld.StoreFirst::Number
    IL_6: ldsfld int32 HelloWorld.StoreFirst::Number
    IL_7: call void [System.Console]System.Console::WriteLine(int32)
    IL_8: ldnull
    IL_9: ldc.i4.s 11
    IL_10: stfld int32 HelloWorld.Child::Number
    IL_11: ldnull
    IL_12: ldfld int32 HelloWorld.Child::Number
    IL_13: call void [System.Console]System.Console::WriteLine(int32)
    IL_14: ldc.i4.s 100
    IL_15: call object HelloWorld.Program::Receiver()
    IL_16: ldfld int32 HelloWorld.Child::Number
    IL_17: add
    IL_18: call void [System.Console]System.Console::WriteLine(int32)
    IL_19: ret
  }
}
