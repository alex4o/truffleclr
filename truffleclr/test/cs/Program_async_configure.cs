using System;
using System.Threading.Tasks;
namespace HelloWorld { class Program { static async Task Unsupported() { await Task.CompletedTask.ConfigureAwait(false); } static void Main() { } } }
