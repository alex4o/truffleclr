using System;
namespace HelloWorld {
    public class Box<T> {
        public T Value;
        public Box<T> Self;
        public Box(T value) { Value = value; Self = this; }
        public T Read() { return Self.ReadValue(); }
        public T ReadValue() { return Value; }
    }
    public struct Late<T> { public T Value; }
    public class Program {
        public static double Bad() {
            var box = new Box<int>(7);
            return Math.Acos(box.Read());
        }
        public static int Good() {
            return new Box<int>(42).Read();
        }
        public static int LateValue() {
            var late = new Late<int>();
            late.Value = 23;
            return late.Value;
        }
        public static string Lazy() { return "native: Български 漢字 😀"; }
        public static void Main(string[] args) {
            Console.WriteLine(Lazy());
            Console.WriteLine(Good());
            Console.WriteLine(LateValue());
        }
    }
}
