using System;

namespace HelloWorld
{
    public class Root
    {
        public int Value;

        public Root(int value)
        {
            Value = value;
        }

        public virtual int Read()
        {
            return Value;
        }
    }

    public class Middle : Root
    {
        public new int Value;

        public Middle(int root, int middle) : base(root)
        {
            Value = middle;
        }

        public override int Read()
        {
            return base.Read() + Value;
        }
    }

    public class Leaf : Middle
    {
        public new int Value;

        public Leaf(int root, int middle, int leaf) : base(root, middle)
        {
            Value = leaf;
        }

        public override int Read()
        {
            return base.Read() + Value;
        }
    }

    public class Program
    {
        static void Print(Root instance)
        {
            // All three receiver types reach the same virtual call site.
            Console.WriteLine(instance.Read());
        }

        public static void Main(string[] args)
        {
            Root root = new Root(1);
            Middle middle = new Middle(2, 20);
            Leaf leaf = new Leaf(3, 30, 300);
            Root leafRoot = leaf;
            Middle leafMiddle = leaf;

            Console.WriteLine(leafRoot.Value);
            Console.WriteLine(leafMiddle.Value);
            Console.WriteLine(leaf.Value);
            leafRoot.Value = 4;
            leafMiddle.Value = 40;
            leaf.Value = 400;
            Console.WriteLine(leafRoot.Value);
            Console.WriteLine(leafMiddle.Value);
            Console.WriteLine(leaf.Value);
            Console.WriteLine(middle.Value);

            for (int i = 0; i < 3; i++)
            {
                Print(root);
                Print(middle);
                Print(leaf);
            }

            // A second object must not share any of the first object's fields.
            Leaf other = new Leaf(5, 50, 500);
            Print(other);
            Print(leaf);
        }
    }
}
