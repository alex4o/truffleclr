using System;
using System.Diagnostics;

namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            // var watch = new Stopwatch(); 
            // watch.Start();

            for (int i = 0; i < 1100; i++)
            {
                // Action test = () =>
                // {
                //     i++;
                //     Console.WriteLine("Shit");
                // };

                Console.Write(i);
                Console.Write(" ");

                Console.WriteLine(fib(i % 30));

                // test();
            }

            // watch.Stop();
            // Console.WriteLine(" Time Elapsed {0} ms", watch.Elapsed.TotalMilliseconds);
        }

        static int fib(int n)
        {
            if (n == 0)
            {
                return 0;
            }
            if (n == 1)
            {
                return 1;
            }
            return fib(n - 1) + fib(n - 2);
        }
    }
}
