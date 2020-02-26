using System;
using System.Runtime.CompilerServices;


// namespace java {

//     [AttributeUsage(AttributeTargets.Class)]
//     public class PolyglotAttribute : Attribute

//     {

//     }

//     namespace io {
//         [Polyglot]
//         class PrintStream {
//             [MethodImpl(MethodImplOptions.InternalCall)]
//             public static extern void println();
//         }
//     }

//     namespace lang {
//         [Polyglot]

//         class System {
//             public static java.io.PrintStream @out;
//         }
//     }
// }

namespace HelloWorld
{

    class Vehicale
    {
        public int speed = 0;

        public void Accelerate(int x)
        {
            speed += x;
        }

    }

    class Car : Vehicale
    {

        public void Print()
        {
            Console.Write("Car(speed: ");
            Console.Write(this.speed);
            Console.WriteLine(")");
        }

    }

    internal class Program
    {


        private static void Main(string[] args)
        {
            Car car = new Car();
            // car.speed += 5;
            // car.speed += 10;
            // car.speed += 15;

            // Console.WriteLine(car.speed);
            car.Accelerate(5);
            car.Accelerate(10);
            car.Accelerate(15);

            car.Print();


        }
    }
}
