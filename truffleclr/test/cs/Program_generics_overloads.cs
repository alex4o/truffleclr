using System;
namespace HelloWorld {
    class Base<T> {
        public virtual int Pick(T item) { return 1; }
        public virtual int Pick(int item) { return 2; }
    }
    class Derived<T> : Base<T> {
        public override int Pick(T item) { return 3; }
    }
    interface IPick<T> { int Pick(T item); }
    class Implementation<T> : IPick<T> {
        public virtual int Pick(int item) { return 4; }
        public virtual int Pick(T item) { return 5; }
    }
    class Program {
        static int First<T>(Base<T> receiver, T item) { return receiver.Pick(item); }
        static int Second<T>(Base<T> receiver, int item) { return receiver.Pick(item); }
        static T Identity<T>(T item) { return item; }
        static U Identity<U>(U item, int ignored) { return item; }
        static void Main() {
            Base<int> value = new Derived<int>();
            Console.WriteLine(First<int>(value, 7));
            Console.WriteLine(Second<int>(value, 7));
            IPick<int> face = new Implementation<int>();
            Console.WriteLine(face.Pick(7));
            Console.WriteLine(Identity<int>(8));
            Console.WriteLine(Identity<int>(9, 0));
        }
    }
}
