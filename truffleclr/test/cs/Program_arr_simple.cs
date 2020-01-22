using System;

namespace HelloWorld
{
    class Program
    {
        public static void Main()
        {
            int[] a = new int[5];

            for(int i = 0; i < 5; i++) {
                a[i] = i * i;
            }

            foreach (var value in a)
            {
                Console.WriteLine(value);
            }
        }

    }
}