using System;
using System.Threading.Tasks;
namespace HelloWorld { class Program { static Task Unsupported() { return Task.CompletedTask.ContinueWith((Action<Task>)null); } static void Main() { } } }
