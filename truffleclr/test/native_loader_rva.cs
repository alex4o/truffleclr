// Compile as a library with a .NET SDK, then pass the resulting DLL to
// native_loader_lazy_generate.rs to add primitive RVA fields.
public static class RvaArrays
{
    public static readonly byte[] Bytes = { 3, 1, 4, 1, 5 };
    public static readonly int[] Ints = { 0x1020304, 0x11223344, 0x55667788 };
}
