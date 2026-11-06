using System;
namespace HelloWorld
{
    class Item { }
    class Box<T> { }
    struct Value { public int Number; }
    class Program
    {
        static void Print(object value) { Console.WriteLine(value.ToString()); Console.WriteLine(value); }
        static void Main()
        {
            Print(new int[1]); Print(new uint[1]); Print(new long[1]); Print(new ulong[1]);
            Print(new byte[1]); Print(new sbyte[1]); Print(new short[1]); Print(new ushort[1]);
            Print(new char[1]); Print(new bool[1]); Print(new float[1]); Print(new double[1]);
            Print(new Box<int>[1]); Print(new Box<Box<int>>[1]); Print(new Box<int[]>[1]);
            Print(new string[1]); Print(new object[1]); Print(new Item[1]); Print(new Value[1]);
        }
    }
}
