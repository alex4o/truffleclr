using System;
using System.Threading.Tasks;
namespace HelloWorld
{
    class Program
    {
        int offset = 7;
        static async Task<int> Add(int a, int b) { await Task.Yield(); return a + b; }
        static async Task<int> Sum(int n)
        {
            int sum = 0;
            for (int i = 0; i < n; i++) sum = await Add(sum, i);
            return sum;
        }
        async Task<int> Instance(int n) { await Task.Yield(); offset += n; await Task.Delay(2); return offset; }
        static async Task<int> Nested(int n) { return await Add(await Sum(n), await Add(2, 3)); }
        static Exception original = new InvalidOperationException("async failure");
        static async Task<int> Fault() { await Task.Yield(); throw original; }
        static int resumed;
        static async Task<int> Consumer(Task<int> task, int delay)
        {
            int value = await task;
            await Task.Delay(delay);
            resumed++;
            return value + delay;
        }
        static async Task Main()
        {
            Console.WriteLine(await Sum(10));
            Console.WriteLine(Task.CompletedTask.IsCompleted);
            Console.WriteLine(Task.FromResult(3).IsCompleted);
            await Task.CompletedTask;
            Console.WriteLine(await Task.FromResult(12));
            try { Console.WriteLine(await Fault()); }
            catch (InvalidOperationException e) { Console.WriteLine(e.Message); Console.WriteLine(Object.ReferenceEquals(original, e)); }
            Console.WriteLine(await new Program().Instance(5));
            Console.WriteLine(await Nested(5));
            await Task.Delay(3);
            Console.WriteLine("delay one");
            await Task.Delay(1);
            Console.WriteLine("delay two");
            int sum = 0;
            for (int i = 0; i < 8; i++) { await Task.Yield(); sum += i; await Task.Delay(1); sum++; }
            Console.WriteLine(sum);
            Task<int> shared = Add(4, 5);
            Task<int> first = Consumer(shared, 3);
            Task<int> second = Consumer(shared, 1);
            Console.WriteLine(await first);
            Console.WriteLine(await second);
            Console.WriteLine(resumed);
            Console.WriteLine(Task.Delay(0).IsCompleted);
            try { Task.Delay(-2); } catch (ArgumentOutOfRangeException) { Console.WriteLine("negative delay"); }
        }
    }
}
