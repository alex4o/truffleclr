using System;
namespace HelloWorld
{
    class Program
    {
        static readonly byte[] Bytes = { 0, 1, 127, 128, 254, 255 };
        static readonly int[] Ints = { 0x12345678, -2, int.MinValue, int.MaxValue };
        static readonly char[] Chars = { 'A', '\u1234', '\uffff', 'Z' };
        static readonly long[] Longs = { 0x123456789abcdefL, -2L, long.MinValue, long.MaxValue };
        static readonly float[] Singles = { 1.5f, -2.25f, 0.0f, 123.5f };
        static readonly double[] Doubles = { 1.5, -2.25, 0.0, 123.5 };
        static void Main()
        {
            for (int i = 0; i < Bytes.Length; i++) Console.WriteLine((int)Bytes[i]);
            for (int i = 0; i < Ints.Length; i++) Console.WriteLine(Ints[i]);
            for (int i = 0; i < Chars.Length; i++) Console.WriteLine((int)Chars[i]);
            for (int i = 0; i < Longs.Length; i++) Console.WriteLine(Longs[i]);
            Console.WriteLine(Singles[0] == 1.5f && Singles[1] == -2.25f && Singles[2] == 0.0f && Singles[3] == 123.5f);
            Console.WriteLine(Doubles[0] == 1.5 && Doubles[1] == -2.25 && Doubles[2] == 0.0 && Doubles[3] == 123.5);
        }
    }
}
