using System;
namespace HelloWorld {
    public class Invalid<T> {
        public virtual U Identity<U>(U value) { return value; }
        public static int Value() { return 17; }
    }
    public class Valid<T> {
        public static int Value() { return 42; }
    }
    public class Program {
        public static int Good() { return Valid<int>.Value(); }
        // Distinct lazy bodies retry the same failed closed specialization.
        public static int First() { return Invalid<int>.Value(); }
        public static int Second() { return Invalid<int>.Value(); }
        public static void Main(string[] args) { Console.WriteLine(Good()); }
    }
}
