using System;
using System.Threading.Tasks;
namespace HelloWorld { class Program { static ValueTask Unsupported() { return new ValueTask(); } static void Main() { } } }
