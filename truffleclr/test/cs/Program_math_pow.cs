using System;
namespace HelloWorld
{
    class Program
    {
        static void Check(double x, double y, double expected)
        {
            double actual = Math.Pow(x, y);
            Console.WriteLine((actual == expected || actual != actual && expected != expected) &&
                (expected != 0 || 1.0 / actual == 1.0 / expected));
        }
        static void Main()
        {
            double zero = 0.0, inf = 1.0 / zero, nan = zero / zero;
            Check(nan, zero, 1);
            Check(nan, -zero, 1);
            Check(nan, 2, nan);
            Check(2, nan, nan);
            Check(1, nan, 1);
            Check(1, inf, 1);
            Check(1, -inf, 1);
            Check(-1, inf, 1);
            Check(-1, -inf, 1);
            Check(zero, -3, inf);
            Check(-zero, -3, -inf);
            Check(zero, -inf, inf);
            Check(-zero, -inf, inf);
            Check(zero, inf, zero);
            Check(-zero, inf, zero);
            Check(zero, 3, zero);
            Check(-zero, 3, -zero);
            Check(0.5, inf, zero);
            Check(-0.5, inf, zero);
            Check(2, inf, inf);
            Check(-2, inf, inf);
            Check(0.5, -inf, inf);
            Check(-0.5, -inf, inf);
            Check(2, -inf, zero);
            Check(-2, -inf, zero);
            Check(inf, -2, zero);
            Check(inf, 2, inf);
            Check(-inf, -3, -zero);
            Check(-inf, 3, -inf);
            Check(-inf, -2, zero);
            Check(-inf, -0.5, zero);
            Check(-inf, 2, inf);
            Check(-inf, 0.5, inf);
            Check(-zero, -2, inf);
            Check(-zero, -0.5, inf);
            Check(-zero, 2, zero);
            Check(-zero, 0.5, zero);
            Check(-2, 0.5, nan);
            Check(-2, 3, -8);
            Check(2, 10, 1024);
            Check(-2, zero, 1);
        }
    }
}
