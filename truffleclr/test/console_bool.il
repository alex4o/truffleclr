.assembly extern System.Runtime {}
.assembly extern System.Console {}
.assembly console_bool {}
.class public HelloWorld.Program extends [System.Runtime]System.Object
{
    .method public static void Main() cil managed
    {
        .entrypoint
        .maxstack 1
        ldc.i4.2
        call void [System.Console]System.Console::Write(bool)
        ldc.i4.m1
        call void [System.Console]System.Console::WriteLine(bool)
        ret
    }
}
