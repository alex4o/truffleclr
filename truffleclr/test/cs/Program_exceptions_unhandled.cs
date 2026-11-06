using System;
namespace HelloWorld {
    class Program {
        static void Main() {
            try {
                Console.WriteLine("before");
                throw new InvalidOperationException("uncaught");
            } finally {
                Console.WriteLine("cleanup");
            }
        }
    }
}
