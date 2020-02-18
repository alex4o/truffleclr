using System.Runtime.CompilerServices;

namespace System
{
    class Console
    {
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(Int32 i);

        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(String s);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(Object o);

        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine(Int32 i);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine(String s);

        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine(Object o);

        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine();
    }
}