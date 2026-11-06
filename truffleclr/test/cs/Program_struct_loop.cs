using System;

namespace HelloWorld
{
    struct Vector
    {
        public int X;
        public int Y;

        public Vector(int x, int y)
        {
            X = x;
            Y = y;
        }

        public void Step()
        {
            X += 1;
            Y += 2;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Vector[] vectors = new Vector[64];
            for (int i = 0; i < vectors.Length; i++)
                vectors[i] = new Vector(i, i * 2);

            for (int round = 0; round < 20000; round++)
            {
                for (int i = 0; i < vectors.Length; i++)
                {
                    ref Vector value = ref vectors[i];
                    value.Step();
                }
            }

            int checksum = 0;
            for (int i = 0; i < vectors.Length; i++)
                checksum += vectors[i].X + vectors[i].Y;
            Console.WriteLine(checksum);
            Console.WriteLine(vectors[0].X);
            Console.WriteLine(vectors[0].Y);
            Console.WriteLine(vectors[63].X);
            Console.WriteLine(vectors[63].Y);
        }
    }
}
