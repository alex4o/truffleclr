using System;

namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = 0;
            while(true) {
                i++;
                if(i < 5) {
                    continue;
                }

                if(i > 10) {
                    break;
                }

                Console.WriteLine(i);
            }
        }

    }
}
