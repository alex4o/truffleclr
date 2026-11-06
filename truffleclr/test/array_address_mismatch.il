// Taking an incompatible address must fail before it is dereferenced.
// .NET 10 throws System.ArrayTypeMismatchException at ldelema.
.assembly extern System.Runtime {}
.assembly array_address_mismatch {}
.module array_address_mismatch.dll
.class public auto ansi HelloWorld.Program extends [System.Runtime]System.Object {
    .method public static void Main() cil managed {
        .entrypoint
        .maxstack 3
        L_0: ldc.i4.1
        L_1: newarr [System.Runtime]System.String
        L_1a: dup
        L_1b: ldc.i4.0
        L_1c: readonly.
        L_1d: ldelema [System.Runtime]System.Object
        L_1e: pop
        // The same operand without readonly. must still fail in this method.
        L_2: ldc.i4.0
        L_3: ldelema [System.Runtime]System.Object
        L_4: pop
        L_5: ret
    }
}
