using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Richards;

namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            var richards = new Richards.Richards();
            richards.run();
        }
    }
}
