using System.Runtime.CompilerServices;

namespace System
{
    class Convert
    {
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern bool ToBoolean(int i);

        public static char ToChar(int i)
        {
            if (i < 0 || i > 65535) throw new OverflowException();
            return (char)i;
        }

    }
}