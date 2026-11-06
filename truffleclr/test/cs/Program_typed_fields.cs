using System;

namespace HelloWorld
{
    public class Fields
    {
        public sbyte SignedByte;
        public byte UnsignedByte;
        public short SignedShort;
        public ushort UnsignedShort;
        public int SignedInt;
        public uint UnsignedInt;
        public long SignedLong;
        public ulong UnsignedLong;
        public char Character;
        public bool Flag;
        public float Single;
        public double Double;
        public string Text;
        public object Reference;
        public Fields Next;

        public static sbyte StaticSignedByte;
        public static byte StaticUnsignedByte;
        public static short StaticSignedShort;
        public static ushort StaticUnsignedShort;
        public static int StaticSignedInt;
        public static uint StaticUnsignedInt;
        public static long StaticSignedLong;
        public static ulong StaticUnsignedLong;
        public static char StaticCharacter;
        public static bool StaticFlag;
        public static float StaticSingle;
        public static double StaticDouble;
        public static string StaticText;
        public static object StaticReference;
        public static Fields StaticNext;
    }

    public class Program
    {
        public static Fields CreateFields() { return new Fields(); }

        static void Check(bool condition)
        {
            Console.WriteLine(condition ? 1 : 0);
        }

        public static void Main(string[] args)
        {
            Fields fields = CreateFields();
            Fields other = new Fields();
            object reference = other;

            Check(fields.SignedByte == 0 && fields.UnsignedByte == 0);
            Check(fields.SignedShort == 0 && fields.UnsignedShort == 0);
            Check(fields.SignedInt == 0 && fields.UnsignedInt == 0);
            // Compare the zero-initialized 64-bit fields to each other to avoid conv.i8.
            Check(fields.SignedLong == other.SignedLong);
            Check(fields.UnsignedLong == other.UnsignedLong);
            Check(fields.Character == '\0' && !fields.Flag);
            Check(fields.Single == 0.0f && fields.Double == 0.0);
            Check(fields.Text == null && fields.Reference == null && fields.Next == null);
            Check(Fields.StaticSignedByte == 0 && Fields.StaticUnsignedByte == 0);
            Check(Fields.StaticSignedShort == 0 && Fields.StaticUnsignedShort == 0);
            Check(Fields.StaticSignedInt == 0 && Fields.StaticUnsignedInt == 0);
            Check(Fields.StaticSignedLong == other.SignedLong);
            Check(Fields.StaticUnsignedLong == other.UnsignedLong);
            Check(Fields.StaticCharacter == '\0' && !Fields.StaticFlag);
            Check(Fields.StaticSingle == 0.0f && Fields.StaticDouble == 0.0);
            Check(Fields.StaticText == null && Fields.StaticReference == null && Fields.StaticNext == null);

            fields.SignedByte = -101;
            fields.UnsignedByte = 251;
            fields.SignedShort = -30001;
            fields.UnsignedShort = 60001;
            fields.SignedInt = -2000000001;
            fields.UnsignedInt = 4000000001U;
            fields.SignedLong = -5000000001L;
            fields.UnsignedLong = 12000000000000000001UL;
            fields.Character = 'Z';
            fields.Flag = true;
            fields.Single = 1.5f;
            fields.Double = 2.5;
            fields.Text = "instance";
            fields.Reference = reference;
            fields.Next = other;

            Console.WriteLine(fields.SignedByte);
            Console.WriteLine(fields.UnsignedByte);
            Console.WriteLine(fields.SignedShort);
            Console.WriteLine(fields.UnsignedShort);
            Console.WriteLine(fields.SignedInt);
            Console.WriteLine(fields.UnsignedInt);
            Console.WriteLine(fields.SignedLong);
            Console.WriteLine(fields.UnsignedLong);
            Console.WriteLine(fields.Character);
            Console.WriteLine(fields.Flag);
            Console.WriteLine(fields.Single);
            Console.Write(fields.Character);
            Console.WriteLine();

            Check(fields.SignedByte == -101);
            Check(fields.UnsignedByte == 251);
            Check(fields.SignedShort == -30001);
            Check(fields.UnsignedShort == 60001);
            Check(fields.SignedInt == -2000000001);
            Check(fields.UnsignedInt == 4000000001U);
            Check(fields.SignedLong == -5000000001L);
            Check(fields.UnsignedLong == 12000000000000000001UL);
            Check(fields.Character == 'Z');
            Check(fields.Flag);
            Check(fields.Single == 1.5f);
            Console.WriteLine(fields.Double);
            Console.WriteLine(fields.Text);
            Check(fields.Reference == reference);
            Check(fields.Next == other);
            fields.Next.SignedInt = 123;
            Console.WriteLine(other.SignedInt);
            Console.WriteLine(fields.SignedInt);

            Fields.StaticSignedByte = fields.SignedByte;
            Fields.StaticUnsignedByte = fields.UnsignedByte;
            Fields.StaticSignedShort = fields.SignedShort;
            Fields.StaticUnsignedShort = fields.UnsignedShort;
            Fields.StaticSignedInt = fields.SignedInt;
            Fields.StaticUnsignedInt = fields.UnsignedInt;
            Fields.StaticSignedLong = fields.SignedLong;
            Fields.StaticUnsignedLong = fields.UnsignedLong;
            Fields.StaticCharacter = fields.Character;
            Fields.StaticFlag = fields.Flag;
            Fields.StaticSingle = fields.Single;
            Fields.StaticDouble = fields.Double;
            Fields.StaticText = "static";
            Fields.StaticReference = fields.Reference;
            Fields.StaticNext = fields.Next;

            Check(Fields.StaticSignedByte == -101);
            Check(Fields.StaticUnsignedByte == 251);
            Check(Fields.StaticSignedShort == -30001);
            Check(Fields.StaticUnsignedShort == 60001);
            Check(Fields.StaticSignedInt == -2000000001);
            Check(Fields.StaticUnsignedInt == 4000000001U);
            Check(Fields.StaticSignedLong == -5000000001L);
            Check(Fields.StaticUnsignedLong == 12000000000000000001UL);
            Check(Fields.StaticCharacter == 'Z');
            Check(Fields.StaticFlag);
            Check(Fields.StaticSingle == 1.5f);
            Console.WriteLine(Fields.StaticDouble);
            Console.WriteLine(Fields.StaticText);
            Check(Fields.StaticReference == reference);
            Check(Fields.StaticNext == other);

            fields.Reference = null;
            fields.Next = null;
            fields.Flag = false;
            Check(fields.Reference == null && fields.Next == null && !fields.Flag);
            Check(Fields.StaticReference == reference && Fields.StaticNext == other && Fields.StaticFlag);
            Fields.StaticReference = null;
            Fields.StaticNext = null;
            Fields.StaticText = null;
            Fields.StaticFlag = false;
            Check(Fields.StaticReference == null && Fields.StaticNext == null && Fields.StaticText == null && !Fields.StaticFlag);
        }
    }
}
