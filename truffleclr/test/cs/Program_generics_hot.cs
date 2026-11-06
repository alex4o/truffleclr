using System;

namespace HelloWorld
{
    class Growable<T>
    {
        T[] items = new T[1];
        int count;

        public void Add(T value)
        {
            if (count == items.Length)
            {
                T[] larger = new T[items.Length * 2];
                for (int i = 0; i < count; i++)
                    larger[i] = items[i];
                items = larger;
            }
            items[count] = value;
            count++;
        }

        public T Get(int index) { return items[index]; }
        public void Set(int index, T value) { items[index] = value; }
    }

    class Program
    {
        static T Identity<T>(T value) { return value; }

        static void Main(string[] args)
        {
            Growable<int> values = new Growable<int>();
            for (int i = 0; i < 16; i++)
                values.Add(i);

            // Repeated generic array access/calls without allocations in the hot loop.
            int checksum = 0;
            for (int i = 0; i < 200000; i++)
            {
                int index = i & 15;
                int value = Identity(values.Get(index));
                checksum += value;
                values.Set(index, value + 1);
            }
            Console.WriteLine(checksum);
            Console.WriteLine(values.Get(0));
            Console.WriteLine(values.Get(15));
        }
    }
}
