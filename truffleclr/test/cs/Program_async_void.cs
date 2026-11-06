using System;
using System.Threading.Tasks;
namespace HelloWorld { class Program { static async void Unsupported() { await Task.Yield(); } static void Main() { } } }
