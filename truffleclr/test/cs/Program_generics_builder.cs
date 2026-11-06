using System;
namespace HelloWorld {
    interface IStateMachine { void MoveNext(); }
    interface IAwaiter { void Complete(); }
    struct Machine : IStateMachine {
        public int State;
        public void MoveNext() { State++; }
    }
    struct Awaiter : IAwaiter {
        public int Calls;
        public void Complete() { Calls++; }
    }
    struct Result { public int Value; }
    struct Builder<TResult> {
        TResult result;
        public void Start<TStateMachine>(ref TStateMachine stateMachine) where TStateMachine : IStateMachine {
            stateMachine.MoveNext();
        }
        public void AwaitUnsafeOnCompleted<TAwaiter, TStateMachine>(ref TAwaiter awaiter, ref TStateMachine stateMachine)
            where TAwaiter : IAwaiter where TStateMachine : IStateMachine {
            awaiter.Complete();
            Start<TStateMachine>(ref stateMachine);
        }
        public void SetResult(TResult value) { result = value; }
        public TResult GetResult() { return result; }
    }
    class Program {
        static T Default<T>() { return default(T); }
        static void Main() {
            Builder<int> builder = new Builder<int>();
            Machine machine = new Machine();
            Awaiter awaiter = new Awaiter();
            builder.Start(ref machine);
            builder.AwaitUnsafeOnCompleted(ref awaiter, ref machine);
            builder.SetResult(42);
            Console.WriteLine(machine.State);
            Console.WriteLine(awaiter.Calls);
            Console.WriteLine(builder.GetResult());
            Builder<string> text = new Builder<string>();
            text.SetResult("ready");
            text.AwaitUnsafeOnCompleted(ref awaiter, ref machine);
            Console.WriteLine(text.GetResult());
            Console.WriteLine(machine.State);
            Console.WriteLine(awaiter.Calls);
            Builder<Result> value = new Builder<Result>();
            Result result = new Result();
            result.Value = 7;
            value.SetResult(result);
            result.Value = 99;
            Console.WriteLine(value.GetResult().Value);
            Console.WriteLine(Default<int[]>() == null);
        }
    }
}
