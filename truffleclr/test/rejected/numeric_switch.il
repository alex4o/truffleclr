.assembly extern System.Runtime {}
.assembly numeric_switch {}
.class public HelloWorld.Program extends [System.Runtime]System.Object
{
    .method public static void Main() cil managed
    {
        .entrypoint
        ldc.i4.0
        switch (0, 1)
        ret
    }
}
