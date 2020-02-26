using System;


namespace HelloWorld
{

    class Car {
        public int speed = 0;

        public void Accelerate(int x) {
            speed += x;
        }

        public void Print() {
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
