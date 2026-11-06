using System;
using System.Threading.Tasks;
namespace HelloWorld
{
    class Program
    {
        static async Task<int> Loop()
        {
            int sum = 0;
            for (int i = 0; i < 100000; i++) sum += await Task.FromResult(1);
            for (int i = 0; i < 10000; i++) { await Task.Yield(); sum++; }
            return sum;
        }
        static void Main() { Console.WriteLine(Loop().GetAwaiter().GetResult()); }
    }
}
