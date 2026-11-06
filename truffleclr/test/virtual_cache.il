.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly HelloWorld {}
.module HelloWorld.dll

.class public auto ansi HelloWorld.Base extends [System.Runtime]System.Object
{
  .field public int32 seed
  .method public specialname rtspecialname instance void .ctor() cil managed
  {
    .maxstack 2
    IL_0: ldarg.0
    IL_1: ldc.i4.s 10
    IL_2: stfld int32 HelloWorld.Base::seed
    IL_3: ret
  }
  .method public virtual instance int32 Value() cil managed
  {
    .maxstack 1
    IL_0: ldarg.0
    IL_1: ldfld int32 HelloWorld.Base::seed
    IL_2: ret
  }
}

.class public auto ansi HelloWorld.D0 extends HelloWorld.Base
{
  .method public specialname rtspecialname instance void .ctor() cil managed
  {
    .maxstack 1
    IL_0: ldarg.0
    IL_1: call instance void HelloWorld.Base::.ctor()
    IL_2: ret
  }
  .method public virtual instance int32 Value() cil managed
  {
    .maxstack 2
    IL_0: ldarg.0
    IL_1: call instance int32 HelloWorld.Base::Value()
    IL_2: ldc.i4.0
    IL_3: add
    IL_4: ret
  }
}

.class public auto ansi HelloWorld.D1 extends HelloWorld.Base
{
  .method public specialname rtspecialname instance void .ctor() cil managed
  {
    .maxstack 1
    IL_0: ldarg.0
    IL_1: call instance void HelloWorld.Base::.ctor()
    IL_2: ret
  }
  .method public virtual instance int32 Value() cil managed
  {
    .maxstack 2
    IL_0: ldarg.0
    IL_1: call instance int32 HelloWorld.Base::Value()
    IL_2: ldc.i4.1
    IL_3: add
    IL_4: ret
  }
}

.class public auto ansi HelloWorld.D2 extends HelloWorld.Base
{
  .method public specialname rtspecialname instance void .ctor() cil managed
  {
    .maxstack 1
    IL_0: ldarg.0
    IL_1: call instance void HelloWorld.Base::.ctor()
    IL_2: ret
  }
  .method public virtual instance int32 Value() cil managed
  {
    .maxstack 2
    IL_0: ldarg.0
    IL_1: call instance int32 HelloWorld.Base::Value()
    IL_2: ldc.i4.2
    IL_3: add
    IL_4: ret
  }
}

.class public auto ansi HelloWorld.D3 extends HelloWorld.Base
{
  .method public specialname rtspecialname instance void .ctor() cil managed
  {
    .maxstack 1
    IL_0: ldarg.0
    IL_1: call instance void HelloWorld.Base::.ctor()
    IL_2: ret
  }
  .method public virtual instance int32 Value() cil managed
  {
    .maxstack 2
    IL_0: ldarg.0
    IL_1: call instance int32 HelloWorld.Base::Value()
    IL_2: ldc.i4.3
    IL_3: add
    IL_4: ret
  }
}

.class public auto ansi HelloWorld.D4 extends HelloWorld.Base
{
  .method public specialname rtspecialname instance void .ctor() cil managed
  {
    .maxstack 1
    IL_0: ldarg.0
    IL_1: call instance void HelloWorld.Base::.ctor()
    IL_2: ret
  }
  .method public virtual instance int32 Value() cil managed
  {
    .maxstack 2
    IL_0: ldarg.0
    IL_1: call instance int32 HelloWorld.Base::Value()
    IL_2: ldc.i4.4
    IL_3: add
    IL_4: ret
  }
}

.class public auto ansi HelloWorld.D5 extends HelloWorld.Base
{
  .method public specialname rtspecialname instance void .ctor() cil managed
  {
    .maxstack 1
    IL_0: ldarg.0
    IL_1: call instance void HelloWorld.Base::.ctor()
    IL_2: ret
  }
  .method public virtual instance int32 Value() cil managed
  {
    .maxstack 2
    IL_0: ldarg.0
    IL_1: call instance int32 HelloWorld.Base::Value()
    IL_2: ldc.i4.5
    IL_3: add
    IL_4: ret
  }
}

.class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object
{
  // A single call site sees repeated shapes and then exceeds the five-entry PIC.
  .method private static void Print(class HelloWorld.Base item) cil managed
  {
    .maxstack 1
    IL_0: ldarg.0
    IL_1: callvirt instance int32 HelloWorld.Base::Value()
    IL_2: call void [System.Console]System.Console::WriteLine(int32)
    IL_3: ret
  }
  // This body must not be compiled merely because its class is loaded.
  .method public static int32 Unsupported() cil managed
  {
    .maxstack 1
    IL_0: ldc.i4.1
    IL_1: not
    IL_2: ret
  }
  .method public static void Main(string[] args) cil managed
  {
    .entrypoint
    .maxstack 1
    IL_0: newobj instance void HelloWorld.D0::.ctor()
    IL_1: call void HelloWorld.Program::Print(class HelloWorld.Base)
    IL_2: newobj instance void HelloWorld.D1::.ctor()
    IL_3: call void HelloWorld.Program::Print(class HelloWorld.Base)
    IL_4: newobj instance void HelloWorld.D0::.ctor()
    IL_5: call void HelloWorld.Program::Print(class HelloWorld.Base)
    IL_6: newobj instance void HelloWorld.D2::.ctor()
    IL_7: call void HelloWorld.Program::Print(class HelloWorld.Base)
    IL_8: newobj instance void HelloWorld.D3::.ctor()
    IL_9: call void HelloWorld.Program::Print(class HelloWorld.Base)
    IL_10: newobj instance void HelloWorld.D4::.ctor()
    IL_11: call void HelloWorld.Program::Print(class HelloWorld.Base)
    IL_12: newobj instance void HelloWorld.D2::.ctor()
    IL_13: call void HelloWorld.Program::Print(class HelloWorld.Base)
    IL_14: newobj instance void HelloWorld.D5::.ctor()
    IL_15: call void HelloWorld.Program::Print(class HelloWorld.Base)
    IL_16: newobj instance void HelloWorld.D0::.ctor()
    IL_17: call void HelloWorld.Program::Print(class HelloWorld.Base)
    IL_18: newobj instance void HelloWorld.D5::.ctor()
    IL_19: call void HelloWorld.Program::Print(class HelloWorld.Base)
    IL_20: ret
  }
}
