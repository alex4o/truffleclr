.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly HelloWorld {}
.module HelloWorld.dll

.class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object {
  .method public static void Main(string[] args) cil managed {
    .entrypoint
    .maxstack 3
    .locals init (int16 V_0, uint16 V_1, int8 V_2, uint8 V_3, char V_4, int32 V_5, uint32 V_6, int64 V_7, uint64 V_8, float32 V_9, float64 V_10, bool V_11, string V_12, object V_13)
    IL_0: ldloc 0
    IL_1: call void [System.Console]System.Console::WriteLine(int32)
    IL_2: ldloc 1
    IL_3: call void [System.Console]System.Console::WriteLine(int32)
    IL_4: ldloc 2
    IL_5: call void [System.Console]System.Console::WriteLine(int32)
    IL_6: ldloc 3
    IL_7: call void [System.Console]System.Console::WriteLine(int32)
    IL_8: ldloc 4
    IL_9: call void [System.Console]System.Console::WriteLine(int32)
    IL_10: ldloc 5
    IL_11: call void [System.Console]System.Console::WriteLine(int32)
    IL_12: ldloc 6
    IL_13: call void [System.Console]System.Console::WriteLine(int32)
    IL_14: ldloc 7
    IL_15: call void [System.Console]System.Console::WriteLine(int64)
    IL_16: ldloc 8
    IL_17: call void [System.Console]System.Console::WriteLine(uint64)
    IL_18: ldloc 9
    IL_19: call void [System.Console]System.Console::WriteLine(float32)
    IL_20: ldloc 10
    IL_21: call void [System.Console]System.Console::WriteLine(float64)
    IL_22: ldloc 11
    IL_23: call void [System.Console]System.Console::WriteLine(bool)
    IL_24: ldloc 12
    IL_25: ldnull
    IL_26: ceq
    IL_27: call void [System.Console]System.Console::WriteLine(int32)
    IL_28: ldloc 13
    IL_29: ldnull
    IL_30: ceq
    IL_31: call void [System.Console]System.Console::WriteLine(int32)
    IL_32: ldloc.0
    IL_33: ldc.i4.1
    IL_34: add
    IL_35: call void [System.Console]System.Console::WriteLine(int32)
    IL_36: ldloc.1
    IL_37: ldc.i4.2
    IL_38: add
    IL_39: call void [System.Console]System.Console::WriteLine(int32)
    IL_40: ret
  }
}
