using System;

namespace HelloWorld
{
    class Program
    {
        static void Main()
        {
            Solve();
        }

        public const int N = 8;

        private static void PrintSolution(int[] board)
        {
            for (int i = 0; i < N; ++i)
            {
                for (int j = 0; j < N; ++j){
                    Console.Write(" ");
                    Console.Write(board[i*N + j]);
                    Console.Write(" ");
                }

                Console.WriteLine();
            }
        }

        private static bool IsSafe(int[] board, int row, int col)
        {
            int i, j;

            for (i = 0; i < col; ++i)
                if (Convert.ToBoolean(board[row*N + i]))
                    return false;

            for (i = row, j = col; i >= 0 && j >= 0; --i, --j)
                if (Convert.ToBoolean(board[i*N + j]))
                    return false;

            for (i = row, j = col; j >= 0 && i < N; ++i, --j)
                if (Convert.ToBoolean(board[i*N + j]))
                    return false;

            return true;
        }

        private static bool SolveNQ(int[] board, int col)
        {
            if (col >= N)
                return true;

            for (int i = 0; i < N; ++i)
            {
                if (IsSafe(board, i, col))
                {
                    board[i*N + col] = 1;

                    if (SolveNQ(board, col + 1))
                        return true;

                    board[i*N + col] = 0;
                }
            }

            return false;
        }

        public static bool Solve()
        {
            int[] board = {
                0, 0, 0, 0, 0, 0, 0, 0 ,
                0, 0, 0, 0, 0, 0, 0, 0 ,
                0, 0, 0, 0, 0, 0, 0, 0 ,
                0, 0, 0, 0, 0, 0, 0, 0 ,
                0, 0, 0, 0, 0, 0, 0, 0 ,
                0, 0, 0, 0, 0, 0, 0, 0 ,
                0, 0, 0, 0, 0, 0, 0, 0 ,
                0, 0, 0, 0, 0, 0, 0, 0 ,
            };

            if (SolveNQ(board, 0) == false)
                return false;

            PrintSolution(board);
            return true;
        }
    }
}
