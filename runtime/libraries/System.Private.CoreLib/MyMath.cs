using System.Runtime.CompilerServices;

namespace System
{
    public static class Math
    {
        public static int Abs(int value) { if (value == Int32.MinValue) throw new OverflowException(); return value < 0 ? -value : value; }
        public static long Abs(long value) { if (value == -9223372036854775808L) throw new OverflowException(); return value < 0 ? -value : value; }
        public static int Min(int a, int b) { return a < b ? a : b; }
        public static int Max(int a, int b) { return a > b ? a : b; }
        public static long Min(long a, long b) { return a < b ? a : b; }
        public static long Max(long a, long b) { return a > b ? a : b; }
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Abs(double a);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Min(double a, double b);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Max(double a, double b);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Floor(double a);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Ceiling(double a);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Round(double a);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Pow(double a, double b);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Sin(double a);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Cos(double a);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Tan(double a);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Atan(double a);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Atan2(double a, double b);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Exp(double a);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Log(double a);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Sqrt(double a);
    }
}
