using System;
using System.Threading.Tasks;
namespace HelloWorld
{
    class Program
    {
        static async Task Main() { await Task.Yield(); throw new InvalidOperationException("async unhandled"); }
    }
}
