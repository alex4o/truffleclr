using System;
namespace HelloWorld
{
    struct Pair { public int X; public string Text; }
    struct Nested { public Pair P; public double D; }
    struct Modulo
    {
        public int Value;
        public override bool Equals(object other) { return other is Modulo && Value % 10 == ((Modulo)other).Value % 10; }
        public override int GetHashCode() { return Value % 10; }
    }
    struct Wrapper { public Modulo Value; }
    class NullText { public override string ToString() { return null; } }
    class Named { public override string ToString() { return "named"; } }
    class Program
    {
        static void Main()
        {
            Array array = new int[3]; Console.WriteLine(array.Length);
            Array objects = new Named[4]; Console.WriteLine(objects.Length);
            Wrapper w1 = new Wrapper { Value = new Modulo { Value = 1 } };
            Wrapper w2 = new Wrapper { Value = new Modulo { Value = 11 } };
            Console.WriteLine(w1.Equals(w2)); Console.WriteLine(w1.GetHashCode() == w2.GetHashCode());
            object a = new object(), b = new object();
            Console.WriteLine(a.Equals(a)); Console.WriteLine(a.Equals(b));
            Console.WriteLine(Object.Equals(null, null)); Console.WriteLine(Object.Equals(a, null));
            Console.WriteLine(Object.Equals(null, a)); Console.WriteLine(Object.Equals(a, a));
            Console.WriteLine(Object.ReferenceEquals(a, b)); Console.WriteLine(Object.ReferenceEquals(a, a));
            Console.WriteLine(a.GetHashCode() == a.GetHashCode()); Console.WriteLine(a.ToString());
            Console.WriteLine(new Program().ToString());
            Pair p = new Pair { X = 3, Text = "abc" }, q = new Pair { X = 3, Text = "abc" };
            Console.WriteLine(p.Equals(q)); Console.WriteLine(p.GetHashCode() == q.GetHashCode());
            q.X++; Console.WriteLine(p.Equals(q)); Console.WriteLine(p.Equals(null));
            Nested n = new Nested { P = p, D = -0.0 }, m = new Nested { P = p, D = 0.0 };
            Console.WriteLine(n.Equals(m)); Console.WriteLine(n.GetHashCode() == m.GetHashCode());
            Console.WriteLine(p.ToString());
            Console.WriteLine(Object.ReferenceEquals(String.Concat(new NullText()), null));
            Console.WriteLine(String.Concat(new string[] { "a", null, "b", "c" }));
            Console.WriteLine(String.Concat("a", "b")); Console.WriteLine(String.Concat("a", "b", "c"));
            Console.WriteLine(String.Concat("a", "b", "c", "d"));
            Console.WriteLine(String.Concat((object)new Named(), null, (object)12));
            Console.WriteLine(String.Concat(new object[] { new Named(), null, 13 }));
            try { String.Concat((string[])null); } catch (ArgumentNullException) { Console.WriteLine("null concat"); }
            int number = 5; byte small = 7;
            Console.WriteLine(number.CompareTo((object)4)); Console.WriteLine(number.CompareTo(null));
            Console.WriteLine(small.CompareTo((object)(byte)7)); Console.WriteLine(small.CompareTo(null));
            try { number.CompareTo("wrong"); } catch (ArgumentException) { Console.WriteLine("int wrong type"); }
            try { small.CompareTo("wrong"); } catch (ArgumentException) { Console.WriteLine("byte wrong type"); }
            Console.WriteLine((int)Convert.ToChar(0)); Console.WriteLine((int)Convert.ToChar(65535));
            try { Convert.ToChar(-1); } catch (OverflowException) { Console.WriteLine("char low"); }
            try { Convert.ToChar(65536); } catch (OverflowException) { Console.WriteLine("char high"); }
            Console.Write(-1234567890123L); Console.Write('|'); Console.Write(true); Console.Write('|');
            Console.Write(1.5f); Console.Write('|'); Console.Write(uint.MaxValue); Console.Write('|');
            Console.Write(ulong.MaxValue); Console.Write('|'); Console.Write((object)new Named()); Console.WriteLine();
            Console.WriteLine(-1234567890123L); Console.WriteLine('Z'); Console.WriteLine(false);
            Console.WriteLine(1.5f); Console.WriteLine(uint.MaxValue); Console.WriteLine(ulong.MaxValue);
            Console.WriteLine((object)new Named()); Console.Write((object)null); Console.WriteLine((object)null);
            Console.WriteLine(Math.Abs(-5)); Console.WriteLine(Math.Abs(-1234567890123L)); Console.WriteLine((int)Math.Abs(-2.0));
            try { Math.Abs(int.MinValue); } catch (OverflowException) { Console.WriteLine("abs int overflow"); }
            try { Math.Abs(long.MinValue); } catch (OverflowException) { Console.WriteLine("abs long overflow"); }
            Console.WriteLine(Math.Min(2, 7)); Console.WriteLine(Math.Max(2, 7));
            Console.WriteLine(Math.Min(-8L, 7L)); Console.WriteLine(Math.Max(-8L, 7L));
            Console.WriteLine((int)Math.Min(2.0, 7.0)); Console.WriteLine((int)Math.Max(2.0, 7.0));
            Console.WriteLine((int)Math.Floor(2.7)); Console.WriteLine((int)Math.Ceiling(2.1));
            Console.WriteLine((int)Math.Round(2.5)); Console.WriteLine((int)Math.Round(3.5));
            Console.WriteLine((int)Math.Pow(2, 5)); Console.WriteLine((int)Math.Sqrt(81));
            Console.WriteLine((int)Math.Sin(0)); Console.WriteLine((int)Math.Cos(0));
            Console.WriteLine((int)Math.Tan(0)); Console.WriteLine((int)Math.Atan(0));
            Console.WriteLine((int)Math.Atan2(0, 1)); Console.WriteLine((int)Math.Exp(0)); Console.WriteLine((int)Math.Log(1));
        }
    }
}
