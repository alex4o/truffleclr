namespace System
{
    public struct RuntimeFieldHandle
    {
        // Opaque managed RVA payload, populated by ldtoken. No native pointers.
        private byte[] _data;
    }
}

namespace System.Runtime.CompilerServices
{
    public static class RuntimeHelpers
    {
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void InitializeArray(System.Array array, System.RuntimeFieldHandle fldHandle);
    }
}
