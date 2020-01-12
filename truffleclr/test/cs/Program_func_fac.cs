using System;
using System.Diagnostics;

namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            for (int i = 0; i < 1100; i++)
            {
                Console.Write(i);
                Console.Write(" ");
                Console.WriteLine(fac(i % 13));
            }
        }

        static int fac(int n)
        {
            if (n == 1)
            {
                return 1;
            }
            if (n == 1)
            {
                return 1;
            }
            return n * fac(n - 1);
        }
    }
}
