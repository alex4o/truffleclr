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
        public static int max(int a, int b) {
            if(a > b) {
                return a;
            }else{
                return b;
            }
        }
        public static int fannkuch(int n)
        {
            int[] perm = new int[n];
            int[] perm1 = new int[n];
            int[] count = new int[n];
            int maxFlipsCount = 0;
            int permCount = 0;
            int checksum = 0;

            for (int i = 0; i < n; i++) perm1[i] = i;
            int r = n;

            while (true)
            {

                while (r != 1) { count[r - 1] = r; r--; }

                for (int i = 0; i < n; i++) perm[i] = perm1[i];
                int flipsCount = 0;
                int k;

                while (!((k = perm[0]) == 0))
                {
                    int k2 = (k + 1) >> 1;
                    for (int i = 0; i < k2; i++)
                    {
                        int temp = perm[i]; perm[i] = perm[k - i]; perm[k - i] = temp;
                    }
                    flipsCount++;
                }

                maxFlipsCount = max(maxFlipsCount, flipsCount);
                checksum += permCount % 2 == 0 ? flipsCount : -flipsCount;

                // Use incremental change to generate another permutation
                while (true)
                {
                    if (r == n)
                    {
                        Console.WriteLine(checksum);
                        return maxFlipsCount;
                    }
                    int perm0 = perm1[0];
                    int i = 0;
                    while (i < r)
                    {
                        int j = i + 1;
                        perm1[i] = perm1[j];
                        i = j;
                    }
                    perm1[r] = perm0;

                    count[r] = count[r] - 1;
                    if (count[r] > 0) break;
                    r++;
                }

                permCount++;
            }
        }

        public static void Main(String[] args)
        {                    using (System.IO.StreamWriter file = new System.IO.StreamWriter("./fannkuchen_cs.csv")) {
                                                   for(int c = 0; c <= 100; c++) {
                                                       Stopwatch stopwatch = Stopwatch.StartNew();
            int n = 10;
            // if (args.length > 0) n = Integer.parseInt(args[0]);
            Console.Write("Pfannkuchen(");
            Console.Write(n);
            Console.Write(") = ");
            Console.WriteLine(fannkuch(n));
                      stopwatch.Stop();
                                                                    file.WriteLine($"fannkuchen,{c},{stopwatch.Elapsed.TotalMilliseconds}");
                                                                    }
                                                                    }
        }
    }
}