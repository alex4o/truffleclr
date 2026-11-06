using System.Threading.Tasks;

namespace System
{
    public abstract class Delegate { }
    public abstract class MulticastDelegate : Delegate { }
    // Signature placeholders only; delegate construction/invocation is unsupported.
    public sealed class Action { private Action() { } }
}

namespace System.Runtime.CompilerServices
{
    public interface IAsyncStateMachine
    {
        void MoveNext();
        void SetStateMachine(IAsyncStateMachine stateMachine);
    }
    public interface INotifyCompletion { void OnCompleted(Action continuation); }
    public interface ICriticalNotifyCompletion : INotifyCompletion { void UnsafeOnCompleted(Action continuation); }
    internal interface IStateMachineAwaiter { void Schedule(IAsyncStateMachine machine); }

    public struct TaskAwaiter : ICriticalNotifyCompletion, IStateMachineAwaiter
    {
        private Task task;
        internal TaskAwaiter(Task value) { task = value; }
        public bool IsCompleted { get { return task.IsCompleted; } }
        public void GetResult() { task.GetResult(); }
        void IStateMachineAwaiter.Schedule(IAsyncStateMachine machine) { task.Register(machine); }
        public void OnCompleted(Action continuation) { throw new NotSupportedException("Delegate continuations are not supported."); }
        public void UnsafeOnCompleted(Action continuation) { OnCompleted(continuation); }
    }
    public struct TaskAwaiter<T> : ICriticalNotifyCompletion, IStateMachineAwaiter
    {
        private Task<T> task;
        internal TaskAwaiter(Task<T> value) { task = value; }
        public bool IsCompleted { get { return task.IsCompleted; } }
        public T GetResult() { return task.Result; }
        void IStateMachineAwaiter.Schedule(IAsyncStateMachine machine) { task.Register(machine); }
        public void OnCompleted(Action continuation) { throw new NotSupportedException("Delegate continuations are not supported."); }
        public void UnsafeOnCompleted(Action continuation) { OnCompleted(continuation); }
    }
    public struct YieldAwaitable
    {
        public YieldAwaiter GetAwaiter() { return new YieldAwaiter(); }
        public struct YieldAwaiter : ICriticalNotifyCompletion, IStateMachineAwaiter
        {
            public bool IsCompleted { get { return false; } }
            public void GetResult() { }
            void IStateMachineAwaiter.Schedule(IAsyncStateMachine machine) { Scheduler.Enqueue(machine); }
            public void OnCompleted(Action continuation) { throw new NotSupportedException("Delegate continuations are not supported."); }
            public void UnsafeOnCompleted(Action continuation) { OnCompleted(continuation); }
        }
    }

    public struct AsyncTaskMethodBuilder
    {
        private Task task;
        public static AsyncTaskMethodBuilder Create()
        {
            AsyncTaskMethodBuilder builder = new AsyncTaskMethodBuilder();
            builder.task = new Task();
            return builder;
        }
        public Task Task { get { return task; } }
        public void Start<TStateMachine>(ref TStateMachine stateMachine) where TStateMachine : IAsyncStateMachine
        { stateMachine.MoveNext(); }
        public void SetResult() { task.Finish(null); }
        public void SetException(Exception exception) { task.Finish(exception); }
        public void SetStateMachine(IAsyncStateMachine stateMachine) { task.StateMachine = stateMachine; }
        public void AwaitOnCompleted<TAwaiter, TStateMachine>(ref TAwaiter awaiter, ref TStateMachine stateMachine)
            where TAwaiter : INotifyCompletion where TStateMachine : IAsyncStateMachine
        {
            if (task.StateMachine == null) task.StateMachine = stateMachine;
            ((IStateMachineAwaiter)(object)awaiter).Schedule(task.StateMachine);
        }
        public void AwaitUnsafeOnCompleted<TAwaiter, TStateMachine>(ref TAwaiter awaiter, ref TStateMachine stateMachine)
            where TAwaiter : ICriticalNotifyCompletion where TStateMachine : IAsyncStateMachine
        { AwaitOnCompleted(ref awaiter, ref stateMachine); }
    }
    public struct AsyncTaskMethodBuilder<T>
    {
        private Task<T> task;
        public static AsyncTaskMethodBuilder<T> Create()
        {
            AsyncTaskMethodBuilder<T> builder = new AsyncTaskMethodBuilder<T>();
            builder.task = new Task<T>();
            return builder;
        }
        public Task<T> Task { get { return task; } }
        public void Start<TStateMachine>(ref TStateMachine stateMachine) where TStateMachine : IAsyncStateMachine
        { stateMachine.MoveNext(); }
        public void SetResult(T result) { task.SetResult(result); }
        public void SetException(Exception exception) { task.Finish(exception); }
        public void SetStateMachine(IAsyncStateMachine stateMachine) { task.StateMachine = stateMachine; }
        public void AwaitOnCompleted<TAwaiter, TStateMachine>(ref TAwaiter awaiter, ref TStateMachine stateMachine)
            where TAwaiter : INotifyCompletion where TStateMachine : IAsyncStateMachine
        {
            if (task.StateMachine == null) task.StateMachine = stateMachine;
            ((IStateMachineAwaiter)(object)awaiter).Schedule(task.StateMachine);
        }
        public void AwaitUnsafeOnCompleted<TAwaiter, TStateMachine>(ref TAwaiter awaiter, ref TStateMachine stateMachine)
            where TAwaiter : ICriticalNotifyCompletion where TStateMachine : IAsyncStateMachine
        { AwaitOnCompleted(ref awaiter, ref stateMachine); }
    }
}
