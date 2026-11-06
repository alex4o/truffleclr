using System;

namespace HelloWorld
{
    interface I<T>
    {
        int M(T value);
    }

    class One<T> : I<T>
    {
        public int M(T value) { return 1; }
    }

    class Two<T> : I<T>
    {
        public int M(T value) { return 2; }
    }

    class Three<T> : I<T>
    {
        public int M(T value) { return 3; }
    }

    class Four<T> : I<T>
    {
        public int M(T value) { return 4; }
    }

    class Five<T> : I<T>
    {
        public int M(T value) { return 5; }
    }

    class Six<T> : I<T>
    {
        public int M(T value) { return 6; }
    }

    class Program
    {
        static int Call<T>(I<T> receiver, T value) { return receiver.M(value); }

        static void Main(string[] args)
        {
            I<int>[] receivers = new I<int>[]
            {
                new One<int>(), new Two<int>(), new Three<int>(),
                new Four<int>(), new Five<int>(), new Six<int>()
            };
            int sum = 0;
            // All six receiver types revisit the same interface callsite after warmup.
            for (int i = 0; i < 2400000; i++)
                sum += Call<int>(receivers[i % receivers.Length], i);
            Console.WriteLine(sum); // 8400000
        }
    }
}
