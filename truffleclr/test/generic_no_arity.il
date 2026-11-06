.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly generic_no_arity {}
.module generic_no_arity.dll

// Generic structure comes from <T>, not a `1 suffix. References are forward.
.class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object
{
  .method public static void Main(string[] args) cil managed
  {
    .entrypoint
    .maxstack 1
    L0: ldc.i4.s 42
    L1: call !!0 class G<int32>::Identity<int32>(!!0)
    L2: call void [System.Console]System.Console::WriteLine(int32)
    L3: ldc.i4.s 43
    L4: call !0 class G<int32>::Echo(!0)
    L5: call void [System.Console]System.Console::WriteLine(int32)
    L6: call int32 class G<class '<Main>d__0'>::Number()
    L7: call void [System.Console]System.Console::WriteLine(int32)
    L8: call int32 '<Main>d__0'::Value()
    L9: call void [System.Console]System.Console::WriteLine(int32)
    L19: ldc.i4.1
    L20: newarr class G<class '<Main>d__0'>
    L21: callvirt instance string [System.Runtime]System.Object::ToString()
    L22: call void [System.Console]System.Console::WriteLine(string)
    L10: ret
  }
}

.class public auto ansi G<T> extends [System.Runtime]System.Object
{
  .method public static !!U Identity<U>(!!U 'value') cil managed
  {
    .maxstack 1
    L11: ldarg.0
    L12: ret
  }
  .method public static !T Echo(!T 'value') cil managed
  {
    .maxstack 1
    L13: ldarg.0
    L14: ret
  }
  .method public static int32 Number() cil managed
  {
    .maxstack 1
    L15: ldc.i4.s 44
    L16: ret
  }
}

// These brackets are part of the identifier, including inside a type argument.
.class private auto ansi '<Main>d__0' extends [System.Runtime]System.Object
{
  .method public static int32 Value() cil managed
  {
    .maxstack 1
    L17: ldc.i4.s 45
    L18: ret
  }
}
