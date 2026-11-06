using System.Runtime.CompilerServices;

namespace System
{
    public static class Console
    {
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(int value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(long value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(char value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(bool value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(float value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(double value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(uint value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(ulong value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(string value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void Write(object value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine(int value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine(long value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine(char value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine(bool value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine(float value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine(double value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine(uint value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine(ulong value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine(string value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine(object value);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern void WriteLine();
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern int Read();
    }
}
