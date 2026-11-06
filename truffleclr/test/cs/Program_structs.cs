using System;

namespace HelloWorld
{
    struct Pair
    {
        public int X;
        public int Y;
        public static Pair Shared;

        public Pair(int x, int y)
        {
            X = x;
            Y = y;
        }

        public void Add(int amount)
        {
            X += amount;
            Y += amount;
        }

        public void Reset(int x, int y)
        {
            this = new Pair(x, y);
        }

        public override string ToString()
        {
            return "boxed pair";
        }
    }

    struct Nested
    {
        public Pair Value;
        public int Tag;
    }

    class Holder
    {
        public Nested Item;
        public static Pair Shared;
    }

    class Program
    {
        static Pair Make(int x, int y)
        {
            return new Pair(x, y);
        }

        static Pair ChangeCopy(Pair value)
        {
            value.Add(10);
            return value;
        }

        static void Print(Pair value)
        {
            Console.WriteLine(value.X);
            Console.WriteLine(value.Y);
        }

        static void Main(string[] args)
        {
            Pair zero = default(Pair);
            Print(zero);
            Pair original = new Pair(2, 3);
            Pair copy = original;
            copy.Add(4);
            Print(original);
            Print(copy);
            Print(ChangeCopy(original));
            Print(original);
            copy.Reset(7, 8);
            Print(copy);

            Nested nested = default(Nested);
            nested.Value = Make(11, 12);
            nested.Tag = 13;
            Nested nestedCopy = nested;
            nestedCopy.Value.X = 99;
            Print(nested.Value);
            Print(nestedCopy.Value);
            Console.WriteLine(nestedCopy.Tag);

            Holder holder = new Holder();
            Print(holder.Item.Value);
            holder.Item = nested;
            holder.Item.Value.Add(2);
            Print(holder.Item.Value);
            Print(nested.Value);

            Print(Holder.Shared);
            Print(Pair.Shared);
            Holder.Shared = Make(20, 21);
            Holder.Shared.Add(3);
            Print(Holder.Shared);
            Pair.Shared = Make(30, 31);
            Pair.Shared.Y++;
            Print(Pair.Shared);

            Pair[] values = new Pair[2];
            Print(values[0]);
            values[0] = original;
            values[1] = values[0];
            values[1].Add(5);
            values[0].X++;
            Print(values[0]);
            Print(values[1]);
            Print(original);

            object boxed = original;
            original.Add(100);
            Console.WriteLine(boxed.ToString());
            Console.WriteLine(boxed);
            Console.WriteLine(boxed is Pair);
            Console.WriteLine(boxed is Holder);
            object integer = 42;
            Console.WriteLine(integer is int);
            Console.WriteLine(integer is Pair);
            Console.WriteLine((int)integer);
            Console.WriteLine(integer);
            Pair unboxed = (Pair)boxed;
            unboxed.Add(20);
            Print(unboxed);
            Print((Pair)boxed);
            Print(original);
        }
    }
}
