using System;
namespace HelloWorld {
    class Overloads<T> {
        public int Pick(T item) { return 1; }
        public int Pick(int item) { return 2; }
    }
    interface IValue<T> { T Read(); }
    interface IOther { void Other(); }
    class Base : IValue<int> { public virtual int Read() { return 3; } }
    class Derived : Base { public override int Read() { return 4; } }
    struct Value : IValue<int> { public int Read() { return 5; } }
    class Quoted { public int Read() { return 6; } }
    struct Plain { public int Number; }
    class Program {
        static T Identity<T>(T item) { return item; }
        static int GenericPick<T>(T item) { return new Overloads<T>().Pick(item); }
        static int IntPick<T>(int item) { return new Overloads<T>().Pick(item); }
        static bool Describe<T>(ref T item) { return item.ToString() != null; }
        static void Main() {
            Console.WriteLine(GenericPick<int>(7));
            Console.WriteLine(IntPick<int>(7));
            int[] a = new int[2];
            Console.WriteLine(Identity<int[]>(a).Length);
            Console.WriteLine(Identity<int[]>(a).Length);
            Console.WriteLine(Describe(ref a));
            Plain plain = new Plain();
            Console.WriteLine(Describe(ref plain));
            object derived = new Derived();
            Console.WriteLine(((IValue<int>)derived).Read());
            object boxed = new Value();
            Console.WriteLine(((IValue<int>)boxed).Read());
            Console.WriteLine(boxed is IValue<int>);
            Console.WriteLine(boxed is IValue<string>);
            Console.WriteLine(boxed is IOther);
            try { Console.WriteLine(((IOther)boxed) != null); }
            catch (InvalidCastException) { Console.WriteLine("bad-cast"); }
            string missing = null;
            try { Describe(ref missing); }
            catch (NullReferenceException) { Console.WriteLine("null-reference"); }
            Console.WriteLine(new Quoted().Read());
        }
    }
}
