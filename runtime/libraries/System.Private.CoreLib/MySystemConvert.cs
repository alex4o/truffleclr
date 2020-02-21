using System.Runtime.CompilerServices;

namespace System
{
    class Convert
    {
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern bool ToBoolean(int i);

        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern char ToChar(int i);

    }
}