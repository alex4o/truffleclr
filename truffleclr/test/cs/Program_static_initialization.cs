using System;

namespace HelloWorld
{
    public class Counter
    {
        public static int Created;
        public int Id;

        static Counter()
        {
            Console.WriteLine(100);
            Created = 10;
        }

        public Counter()
        {
            Created = Created + 1;
            Id = Created;
        }
    }

    public class First
    {
        public static int Value;
        public static int SeenSecond;

        static First()
        {
            Console.WriteLine(200);
            Value = 7;
            // Second reads First while this initializer is still running.
            SeenSecond = Second.Value;
            Value = Value + 1;
        }
    }

    public class Second
    {
        public static int Value;
        public static int SeenFirst;
        public static int SeenPending;

        static Second()
        {
            Console.WriteLine(300);
            SeenFirst = First.Value;
            SeenPending = First.SeenSecond;
            Value = SeenFirst + 20;
        }
    }

    public class BeforeAllocation
    {
        public static int Seed = 42;
        static BeforeAllocation() { Console.WriteLine(400); }
        public BeforeAllocation()
        {
            Console.WriteLine(401);
            Console.WriteLine(Seed);
        }
    }

    public class DerivedCounter : Counter { }

    public class MethodOnly
    {
        static MethodOnly() { Console.WriteLine(500); }
        public static void Run() { Console.WriteLine(501); }
    }

    public class InitializedBase
    {
        static InitializedBase() { Console.WriteLine(600); }
        public InitializedBase() { Console.WriteLine(601); }
    }

    public class InitializedDerived : InitializedBase { }

    public class FailureProbe
    {
        public static int Attempts;
        public static int Zero;
    }

    public class FailedInitialization
    {
        public static int Result;
        static FailedInitialization()
        {
            FailureProbe.Attempts = FailureProbe.Attempts + 1;
            Result = 1 / FailureProbe.Zero;
        }
    }

    public class Program
    {
        public static int TryFailure() { return FailedInitialization.Result; }
        public static int FailureAttempts() { return FailureProbe.Attempts; }

        public static void Main(string[] args)
        {
            // Static field access initializes Counter before the first newobj.
            Console.WriteLine(Counter.Created);
            Counter first = new Counter();
            Counter second = new Counter();
            Console.WriteLine(first.Id);
            Console.WriteLine(second.Id);
            Console.WriteLine(Counter.Created);
            Counter.Created = 50;
            Counter third = new Counter();
            Console.WriteLine(third.Id);
            Console.WriteLine(first.Id);
            Console.WriteLine(Counter.Created);

            Console.WriteLine(First.Value);
            Console.WriteLine(First.SeenSecond);
            Console.WriteLine(Second.SeenFirst);
            Console.WriteLine(Second.SeenPending);
            Console.WriteLine(Second.Value);
            // Repeated reads must neither rerun nor recursively restart .cctor.
            Console.WriteLine(First.Value);
            Console.WriteLine(Second.Value);
            new BeforeAllocation();
            new BeforeAllocation();
            Console.WriteLine(DerivedCounter.Created);
            DerivedCounter.Created = 60;
            Console.WriteLine(Counter.Created);
            MethodOnly.Run();
            MethodOnly.Run();
            new InitializedDerived();
            new InitializedDerived();
        }
    }
}
