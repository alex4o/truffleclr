using System.Runtime.CompilerServices;

namespace System
{
    public class Object
    {
        public Object() { }
        ~Object() { }

        [MethodImpl(MethodImplOptions.InternalCall)]
        public virtual extern string ToString();

        public virtual bool Equals(object obj) { return this == obj; }
        public static bool Equals(object a, object b)
        {
            return a == b || (a != null && b != null && a.Equals(b));
        }
        public static bool ReferenceEquals(object a, object b) { return a == b; }

        [MethodImpl(MethodImplOptions.InternalCall)]
        public virtual extern int GetHashCode();
    }
}
