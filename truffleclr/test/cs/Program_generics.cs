using System;

namespace HelloWorld
{
    class Growable<T>
    {
        T[] items = new T[1];
        public int Count;

        public void Add(T value)
        {
            if (Count == items.Length)
            {
                T[] larger = new T[items.Length * 2];
                for (int i = 0; i < Count; i++)
                    larger[i] = items[i];
                items = larger;
            }
            items[Count] = value;
            Count++;
        }

        public T Get(int index) { return items[index]; }
    }

    struct Point
    {
        public int X;
        public int Y;
        public Point(int x, int y) { X = x; Y = y; }
    }

    struct Pair<T, U>
    {
        public T First;
        public U Second;
        public Pair(T first, U second) { First = first; Second = second; }
    }

    interface IValue<T>
    {
        T Get();
    }

    interface IAccumulator<T> : IValue<T>
    {
        void Add(T value);
    }

    class ClassAccumulator : IAccumulator<int>
    {
        int value;
        public ClassAccumulator(int initial) { value = initial; }
        public int Get() { return value; }
        public void Add(int amount) { value += amount; }
    }

    struct StructAccumulator : IAccumulator<int>
    {
        public int Value;
        public StructAccumulator(int initial) { Value = initial; }
        public int Get() { return Value; }
        public void Add(int amount) { Value += amount; }
    }

    class ExplicitValue : IValue<string>
    {
        string IValue<string>.Get() { return "explicit-class"; }
    }

    struct ExplicitStructValue : IValue<int>
    {
        int IValue<int>.Get() { return 47; }
    }

    interface IStateMachine
    {
        void MoveNext();
    }

    struct StructMachine : IStateMachine
    {
        public int State;
        public void MoveNext() { State += 3; }
    }

    class ClassMachine : IStateMachine
    {
        public int State;
        public void MoveNext() { State += 5; }
    }

    struct Builder
    {
        public void Start<TSM>(ref TSM machine) where TSM : IStateMachine
        {
            machine.MoveNext();
        }
    }

    class Slots<T>
    {
        public static int Number;
        public static T Value;
        static Slots()
        {
            Console.WriteLine("slots-init");
            Number = 7;
            Value = default(T);
        }
    }

    class Outer<T>
    {
        public class Inner<U>
        {
            public T First;
            public U Second;
            public Inner(T first, U second) { First = first; Second = second; }
        }
    }

    class GenericBase<T>
    {
        T value;
        public GenericBase(T initial) { value = initial; }
        public T Get() { return value; }
        public void Set(T next) { value = next; }
    }

    class StringChild : GenericBase<string>
    {
        public StringChild(string value) : base(value) { }
    }

    class Program
    {
        static T Identity<T>(T value) { return value; }
        static T Relay<T>(T value) { return Identity<T>(Identity<T>(value)); }
        static T Default<T>() { return default(T); }
        static void Swap<T>(ref T left, ref T right)
        {
            T temp = left;
            left = right;
            right = temp;
        }
        static T Read<T>(IValue<T> value) { return value.Get(); }
        static void Accumulate<TAccumulator>(ref TAccumulator accumulator, int value)
            where TAccumulator : IAccumulator<int>
        {
            accumulator.Add(value);
        }

        static void Main(string[] args)
        {
            Console.WriteLine("containers");
            Growable<int> ints = new Growable<int>();
            Growable<string> strings = new Growable<string>();
            Growable<Point> points = new Growable<Point>();
            for (int i = 0; i < 5; i++)
            {
                ints.Add(i * 3);
                points.Add(new Point(i, i + 10));
            }
            strings.Add("alpha");
            strings.Add("beta");
            strings.Add("gamma");
            Console.WriteLine(ints.Count);
            Console.WriteLine(ints.Get(0));
            Console.WriteLine(ints.Get(4));
            Console.WriteLine(strings.Get(0));
            Console.WriteLine(strings.Get(2));
            Point copy = points.Get(4);
            copy.X = 99;
            Console.WriteLine(points.Get(4).X);
            Console.WriteLine(points.Get(4).Y);
            Console.WriteLine(copy.X);

            Console.WriteLine("generic-methods");
            Pair<int, string> pair = Relay(new Pair<int, string>(23, "pair"));
            Console.WriteLine(pair.First);
            Console.WriteLine(pair.Second);
            int left = 11;
            int right = 29;
            Swap(ref left, ref right);
            Console.WriteLine(Relay(left));
            Console.WriteLine(Identity(right));
            string a = "left";
            string b = "right";
            Swap(ref a, ref b);
            Console.WriteLine(Relay(a));
            Console.WriteLine(b);
            Point p = new Point(1, 2);
            Point q = new Point(8, 9);
            Swap(ref p, ref q);
            Console.WriteLine(Relay(p).X);
            Console.WriteLine(q.Y);

            Console.WriteLine("interfaces");
            ClassAccumulator reference = new ClassAccumulator(10);
            IAccumulator<int> inherited = reference;
            inherited.Add(2);
            Console.WriteLine(Read<int>(inherited));
            Accumulate(ref reference, 3);
            Console.WriteLine(reference.Get());
            StructAccumulator value = new StructAccumulator(20);
            Accumulate(ref value, 4);
            Console.WriteLine(value.Value);
            IAccumulator<int> boxed = value;
            boxed.Add(6);
            Console.WriteLine(Read<int>(boxed));
            Console.WriteLine(value.Value);
            Console.WriteLine(Read<string>(new ExplicitValue()));
            Console.WriteLine(Read<int>(new ExplicitStructValue()));

            Console.WriteLine("state-machines");
            Builder builder = new Builder();
            StructMachine sm = new StructMachine();
            sm.State = 1;
            builder.Start(ref sm);
            builder.Start(ref sm);
            Console.WriteLine(sm.State);
            ClassMachine cm = new ClassMachine();
            cm.State = 2;
            builder.Start(ref cm);
            builder.Start(ref cm);
            Console.WriteLine(cm.State);

            Console.WriteLine("statics");
            Console.WriteLine(Slots<int>.Number);
            Slots<int>.Number = 19;
            Slots<int>.Value = 42;
            Console.WriteLine(Slots<string>.Number);
            Slots<string>.Number = 31;
            Slots<string>.Value = "slot";
            Console.WriteLine(Slots<int>.Number);
            Console.WriteLine(Slots<int>.Value);
            Console.WriteLine(Slots<string>.Number);
            Console.WriteLine(Slots<string>.Value);

            Console.WriteLine("nested-default-base");
            Outer<int>.Inner<string> nested = new Outer<int>.Inner<string>(61, "nested");
            Outer<string>.Inner<int> reversed = new Outer<string>.Inner<int>("outer", 73);
            Console.WriteLine(nested.First);
            Console.WriteLine(nested.Second);
            Console.WriteLine(reversed.First);
            Console.WriteLine(reversed.Second);
            Console.WriteLine(Default<int>());
            Console.WriteLine(Default<string>() == null);
            Point zero = Default<Point>();
            Console.WriteLine(zero.X);
            Console.WriteLine(zero.Y);
            StringChild child = new StringChild("base");
            GenericBase<string> parent = child;
            Console.WriteLine(parent.Get());
            child.Set("changed");
            Console.WriteLine(parent.Get());
        }
    }
}
