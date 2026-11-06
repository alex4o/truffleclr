using System.Runtime.CompilerServices;

namespace System
{
    public class String
    {
        public override string ToString() { return this; }
        [MethodImpl(MethodImplOptions.InternalCall)]
        public static extern string Concat(string[] args);
        public static string Concat(string a, string b) { return Concat(new string[] { a, b }); }
        public static string Concat(string a, string b, string c) { return Concat(new string[] { a, b, c }); }
        public static string Concat(string a, string b, string c, string d) { return Concat(new string[] { a, b, c, d }); }
        public static string Concat(object a) { return a == null ? "" : (a.ToString() ?? ""); }
        public static string Concat(object a, object b) { return Concat(Concat(a), Concat(b)); }
        public static string Concat(object a, object b, object c) { return Concat(Concat(a), Concat(b), Concat(c)); }
        public static string Concat(object[] args)
        {
            if (args == null) throw new ArgumentNullException();
            string[] strings = new string[args.Length];
            for (int i = 0; i < args.Length; i++) strings[i] = Concat(args[i]);
            return Concat(strings);
        }
    }
}
