using System.Runtime.CompilerServices;

namespace System.IO
{
    class File
    {
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern byte[] ReadAllBytes(string name);
    }
}