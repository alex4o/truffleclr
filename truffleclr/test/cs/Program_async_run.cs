using System;
using System.Threading.Tasks;
namespace HelloWorld { class Program { static Task Unsupported() { return Task.Run((Action)null); } static void Main() { } } }
