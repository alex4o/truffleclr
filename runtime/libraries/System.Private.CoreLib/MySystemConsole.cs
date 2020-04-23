using System.Runtime.CompilerServices;

namespace System
{
    class Console
    {
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(Int32 i);

        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(char i);

        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(Double d);

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
        public static extern void WriteLine(Boolean b);


        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine(Double b);

        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine();

        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern int Read();

    }
}
