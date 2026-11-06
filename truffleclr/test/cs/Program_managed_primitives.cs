using System;
namespace HelloWorld {
    struct Point {
        public int X;
        public int Y;
        public Point(int x) { this = default(Point); X = x; }
        public void Reset() { this = default(Point); }
    }
    class Program {
        static Point Make(int x) { return new Point(x); }
        static int Arg(int x) { Bump(ref x); return x; }
        static void Bump(ref int x) { x++; }
        static void U8(ref byte x) { x = 255; }
        static void I8(ref sbyte x) { x = -128; }
        static void U16(ref ushort x) { x = 65535; }
        static void I16(ref short x) { x = -32768; }
        static void U32(ref uint x) { x = uint.MaxValue; }
        static void U64(ref ulong x) { x = ulong.MaxValue; }
        static void B(ref bool x) { x = true; }
        static void C(ref char x) { x = 'Z'; }
        static void R(ref object x) { x = "changed"; }
        static void Clear(ref string x) { x = null; }
        static void Main(string[] args) {
            Point p = Make(9); Console.WriteLine(p.X); Console.WriteLine(p.Y);
            p.Reset(); Console.WriteLine(p.X);
            Console.WriteLine(Arg(6));
            byte[] u8 = new byte[1]; U8(ref u8[0]); Console.WriteLine((int)u8[0]);
            sbyte[] i8 = new sbyte[1]; I8(ref i8[0]); Console.WriteLine((int)i8[0]);
            ushort[] u16 = new ushort[1]; U16(ref u16[0]); Console.WriteLine((int)u16[0]);
            short[] i16 = new short[1]; I16(ref i16[0]); Console.WriteLine((int)i16[0]);
            uint[] u32 = new uint[1]; U32(ref u32[0]); Console.WriteLine(u32[0]);
            ulong[] u64 = new ulong[1]; U64(ref u64[0]); Console.WriteLine(u64[0]);
            bool[] b = new bool[1]; B(ref b[0]); Console.WriteLine(b[0]);
            char[] c = new char[1]; C(ref c[0]); Console.WriteLine(c[0]);
            object[] r = new object[1]; R(ref r[0]); Console.WriteLine(r[0]);
            string[] strings = new string[] { "old" }; Clear(ref strings[0]); Console.WriteLine(strings[0] == null);
            object classes = new Program[1]; Console.WriteLine(classes is Program[]); Console.WriteLine(((Program[])classes).Length);
            object primitiveArray = new int[2]; Console.WriteLine(primitiveArray is object); Console.WriteLine(primitiveArray is int[]); Console.WriteLine(((int[])primitiveArray).Length);
            object structArray = new Point[0]; Console.WriteLine(structArray is object); Console.WriteLine(structArray is Point[]); Console.WriteLine(((Point[])structArray).Length);
            Console.WriteLine((object)true); Console.WriteLine((object)'Z'); Console.WriteLine((object)uint.MaxValue); Console.WriteLine((object)ulong.MaxValue);
        }
    }
}
