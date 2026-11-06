using System.Runtime.CompilerServices;

namespace System
{
    public abstract class ValueType
    {
        [MethodImpl(MethodImplOptions.InternalCall)]
        public override extern bool Equals(object obj);
        [MethodImpl(MethodImplOptions.InternalCall)]
        public override extern int GetHashCode();
    }
}
