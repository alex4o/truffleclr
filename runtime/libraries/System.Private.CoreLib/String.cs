using System.Runtime.CompilerServices;

namespace System
{
    public class String
    {
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern string Concat(string[] args);
    }
}