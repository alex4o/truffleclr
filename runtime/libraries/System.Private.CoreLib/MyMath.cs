using System.Runtime.CompilerServices;

namespace System {
    class Math {
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern double Sqrt(double o);
    }
}