/* The Great Computer Language Shootout
   http://shootout.alioth.debian.org/
 
   contributed by Jarkko Miettinen
*/

using System;
using System.Diagnostics;

namespace HelloWorld
{

    public class Program
    {

        const int minDepth = 4;

        static void Print(int depth, int check)
        {
            Console.Write("tree of depth ");
            Console.Write(depth);
            Console.Write("\t check: ");
            Console.WriteLine(check);
        }

        public static void Main(string[] args)
        {
            int n = 18;
            // if (args.length > 0) n = Integer.parseInt(args[0]);

            int maxDepth = (minDepth + 2 > n) ? minDepth + 2 : n;
            int stretchDepth = maxDepth + 1;

            int check = (TreeNode.BottomUpTree(0, stretchDepth)).itemCheck();
            Console.Write("stretch ");
            Print(maxDepth, check);

            TreeNode longLivedTree = TreeNode.BottomUpTree(0, maxDepth);

            for (int depth = minDepth; depth <= maxDepth; depth += 2)
            {
                int iterations = 1 << (maxDepth - depth + minDepth);
                check = 0;

                for (int i = 1; i <= iterations; i++)
                {
                    check += (TreeNode.BottomUpTree(i, depth)).itemCheck();
                    check += (TreeNode.BottomUpTree(-i, depth)).itemCheck();
                }

                Console.Write(iterations * 2);
                Console.Write("\t ");
                Print(depth, check);
            }
            Console.Write("long lived ");
            Print(maxDepth, longLivedTree.itemCheck());
        }
    }

    public class TreeNode
    {
        private TreeNode left, right;
        private int item;

        TreeNode(int item)
        {
            this.item = item;
        }

        public static TreeNode BottomUpTree(int item, int depth)
        {
            if (depth > 0)
            {
                return new TreeNode(
                    BottomUpTree(2 * item - 1, depth - 1)
                    , BottomUpTree(2 * item, depth - 1)
                    , item
                );
            }
            else
            {
                return new TreeNode(item);
            }
        }

        TreeNode(TreeNode left, TreeNode right, int item)
        {
            this.left = left;
            this.right = right;
            this.item = item;
        }

        public int itemCheck()
        {
            // if necessary deallocate here
            if (left == null) return item;
            else return item + left.itemCheck() - right.itemCheck();
        }
    }
}