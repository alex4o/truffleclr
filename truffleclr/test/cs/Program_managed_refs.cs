using System;

namespace HelloWorld
{
    struct Pair
    {
        public int X;
        public int Y;

        public Pair(int x, int y)
        {
            X = x;
            Y = y;
        }
    }

    class Holder
    {
        public int Number;
        public Pair Value;
        public static int SharedNumber;
        public static Pair SharedValue;
    }

    class Program
    {
        static void Add(ref int value, int amount)
        {
            value += amount;
        }

        static void Set(out int value)
        {
            value = 40;
        }

        static void Move(ref Pair value)
        {
            value.X += 2;
            value.Y += 3;
        }

        static void SetPair(out Pair value)
        {
            value = new Pair(10, 20);
        }

        static void Replace(ref Pair value)
        {
            value = new Pair(70, 80);
        }

        static ref int Identity(ref int value)
        {
            return ref value;
        }

        static ref Pair Element(Pair[] values, int index)
        {
            return ref values[index];
        }

        static void Print(Pair value)
        {
            Console.WriteLine(value.X);
            Console.WriteLine(value.Y);
        }

        static void Main(string[] args)
        {
            int number;
            Set(out number);
            Add(ref number, 2);
            Console.WriteLine(number);
            ref int alias = ref Identity(ref number);
            alias++;
            Console.WriteLine(number);
            Console.WriteLine(alias++);
            Console.WriteLine(++alias);
            alias *= 2;
            Console.WriteLine(number);

            Pair pair;
            SetPair(out pair);
            Move(ref pair);
            Print(pair);
            ref Pair pairAlias = ref pair;
            pairAlias.X++;
            Print(pair);
            ref int interior = ref pairAlias.X;
            Replace(ref pairAlias);
            Print(pair);
            interior++;
            Print(pair);

            int[] numbers = new int[2];
            Set(out numbers[0]);
            Add(ref numbers[0], 5);
            ref int element = ref numbers[0];
            element += 6;
            Console.WriteLine(numbers[0]);
            Console.WriteLine(numbers[1]);

            Pair[] pairs = new Pair[2];
            SetPair(out pairs[0]);
            Move(ref pairs[0]);
            ref Pair selected = ref Element(pairs, 0);
            selected.Y++;
            Add(ref selected.X, 5);
            Print(pairs[0]);
            Print(pairs[1]);
            Element(pairs, 1) = new Pair(30, 40);
            Print(pairs[1]);

            Holder holder = new Holder();
            Set(out holder.Number);
            Add(ref holder.Number, 1);
            Console.WriteLine(holder.Number);
            SetPair(out holder.Value);
            ref int fieldInterior = ref holder.Value.X;
            Move(ref holder.Value);
            holder.Value = new Pair(12, 23);
            fieldInterior += 4;
            Print(holder.Value);

            Set(out Holder.SharedNumber);
            ref int sharedAlias = ref Holder.SharedNumber;
            sharedAlias -= 7;
            Console.WriteLine(Holder.SharedNumber);
            SetPair(out Holder.SharedValue);
            Move(ref Holder.SharedValue);
            ref Pair sharedPair = ref Holder.SharedValue;
            sharedPair.Y *= 2;
            Print(Holder.SharedValue);
        }
    }
}
