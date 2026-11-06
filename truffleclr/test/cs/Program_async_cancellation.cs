using System;
using System.Threading.Tasks;
namespace HelloWorld { class Program { static Task Unsupported(System.Threading.CancellationToken token) { return Task.Delay(1, token); } static void Main() { } } }
