.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly HelloWorld {}
.module HelloWorld.dll

.class public auto ansi HelloWorld.Precise extends [System.Runtime]System.Object {
  .method private static specialname rtspecialname void .cctor() cil managed {
    .maxstack 1
    IL_0: ldstr "precise cctor"
    IL_1: call void [System.Console]System.Console::WriteLine(string)
    IL_2: ret
  }
  .method public instance void M() cil managed {
    .maxstack 1
    IL_0: ldstr "instance"
    IL_1: call void [System.Console]System.Console::WriteLine(string)
    IL_2: ret
  }
  .method public static void Touch() cil managed {
    .maxstack 1
    IL_0: ldstr "static"
    IL_1: call void [System.Console]System.Console::WriteLine(string)
    IL_2: ret
  }
}
.class public auto ansi beforefieldinit HelloWorld.Eager extends [System.Runtime]System.Object {
  .method private static specialname rtspecialname void .cctor() cil managed {
    .maxstack 1
    IL_0: ldstr "eager cctor"
    IL_1: call void [System.Console]System.Console::WriteLine(string)
    IL_2: ret
  }
  .method public instance void M() cil managed {
    .maxstack 1
    IL_0: ldstr "eager instance"
    IL_1: call void [System.Console]System.Console::WriteLine(string)
    IL_2: ret
  }
}
.class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object {
  .method public static void Main(string[] args) cil managed {
    .entrypoint
    .maxstack 2
    IL_0: ldnull
    IL_1: call instance void HelloWorld.Precise::M()
    IL_2: ldstr "before trigger"
    IL_3: call void [System.Console]System.Console::WriteLine(string)
    IL_4: call void HelloWorld.Precise::Touch()
    IL_5: ldnull
    IL_6: call instance void HelloWorld.Precise::M()
    IL_7: ldnull
    IL_8: call instance void HelloWorld.Eager::M()
    IL_9: ldnull
    IL_10: call instance void HelloWorld.Eager::M()
    IL_11: ret
  }
}
