using System;

namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            for(int i = 0; i < 1100; i++) {
                 Console.Write(i);
                 Console.Write(" ");
                 Console.WriteLine(f(i % 13));
            }        
        }

        static int f(int n) {
            if(n == 1 || n == 0) {
                return 1;
            }
            return f(n - 1) * n;
        }
    }
}
