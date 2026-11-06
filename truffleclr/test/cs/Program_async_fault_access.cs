using System;
using System.Threading.Tasks;
namespace HelloWorld
{
    class Program
    {
        static Exception original = new InvalidOperationException("inner message");
        static async Task<int> Fault() { await Task.Yield(); throw original; }
        static async Task Observe(Task<int> task)
        {
            try { await task; } catch (InvalidOperationException e) { Console.WriteLine(Object.ReferenceEquals(e, original)); }
        }
        static void Show(AggregateException e)
        {
            Console.WriteLine(e.Message);
            Console.WriteLine(Object.ReferenceEquals(e.InnerException, original));
            Console.WriteLine(e.InnerExceptions.Count);
            Console.WriteLine(Object.ReferenceEquals(e.InnerExceptions[0], original));
        }
        static void Main()
        {
            Task<int> task = Fault();
            try { Console.WriteLine(task.Result); } catch (AggregateException e) { Show(e); }
            try { task.Wait(); } catch (AggregateException e) { Show(e); }
            try { task.GetAwaiter().GetResult(); } catch (InvalidOperationException e) { Console.WriteLine(Object.ReferenceEquals(e, original)); }
            try { ((Task)task).GetAwaiter().GetResult(); } catch (InvalidOperationException e) { Console.WriteLine(Object.ReferenceEquals(e, original)); }
            Observe(task).GetAwaiter().GetResult();
            Console.WriteLine(Task.FromResult(42).Result);
            Task.CompletedTask.Wait();
            Console.WriteLine(new AggregateException().InnerExceptions.Count);
            Console.WriteLine(new AggregateException().Message);
            Exception[] source = new Exception[] { original, new Exception("second") };
            var aggregate = new AggregateException(source);
            source[0] = new Exception("replacement");
            Console.WriteLine(aggregate.Message);
            Console.WriteLine(aggregate.InnerExceptions.Count);
            Console.WriteLine(Object.ReferenceEquals(aggregate.InnerException, original));
            Console.WriteLine(Object.ReferenceEquals(aggregate.InnerExceptions[0], original));
            var errors = new AggregateException(original).InnerExceptions;
            try { Console.WriteLine(errors[-1]); } catch (ArgumentOutOfRangeException) { Console.WriteLine("negative index"); }
            try { Console.WriteLine(errors[errors.Count]); } catch (ArgumentOutOfRangeException) { Console.WriteLine("past end"); }
            try { Console.WriteLine(new AggregateException().InnerExceptions[0]); } catch (ArgumentOutOfRangeException) { Console.WriteLine("empty list"); }
        }
    }
}
