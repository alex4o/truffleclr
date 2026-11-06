using System.Runtime.CompilerServices;

namespace System.Threading.Tasks
{
    public class Task
    {
        private bool completed;
        private Exception failure;
        private Continuation waiting;
        private Continuation lastWaiting;
        internal IAsyncStateMachine StateMachine;
        private static readonly Task completedTask = Complete();
        public static Task CompletedTask { get { return completedTask; } }
        public bool IsCompleted { get { return completed; } }
        public bool IsFaulted { get { return completed && failure != null; } }
        public TaskAwaiter GetAwaiter() { return new TaskAwaiter(this); }

        private static Task Complete() { Task task = new Task(); task.Finish(null); return task; }
        public static Task<T> FromResult<T>(T value)
        {
            Task<T> task = new Task<T>();
            task.SetResult(value);
            return task;
        }
        public static YieldAwaitable Yield() { return new YieldAwaitable(); }
        public static Task Delay(int millisecondsDelay)
        {
            if (millisecondsDelay < -1) throw new ArgumentOutOfRangeException();
            if (millisecondsDelay == -1) throw new NotSupportedException("Infinite delays cannot complete on the single-threaded scheduler.");
            if (millisecondsDelay == 0) return CompletedTask;
            Task task = new Task();
            Scheduler.AddTimer(task, millisecondsDelay);
            return task;
        }
        internal void Finish(Exception exception)
        {
            if (completed) throw new InvalidOperationException("Task already completed.");
            failure = exception;
            completed = true;
            while (waiting != null)
            {
                Scheduler.Enqueue(waiting.Machine);
                waiting = waiting.Next;
            }
            lastWaiting = null;
            StateMachine = null;
        }
        internal void Register(IAsyncStateMachine machine)
        {
            if (completed) { Scheduler.Enqueue(machine); return; }
            Continuation item = new Continuation(machine);
            if (lastWaiting == null) waiting = item;
            else lastWaiting.Next = item;
            lastWaiting = item;
        }
        private void WaitForCompletion()
        {
            while (!completed) Scheduler.Step();
        }
        public void Wait()
        {
            WaitForCompletion();
            if (failure != null) throw new AggregateException(failure);
        }
        internal void GetResult()
        {
            WaitForCompletion();
            if (failure != null) throw failure;
        }
    }

    public class Task<T> : Task
    {
        private T result;
        public T Result { get { Wait(); return result; } }
        internal T GetAwaitedResult() { GetResult(); return result; }
        public new TaskAwaiter<T> GetAwaiter() { return new TaskAwaiter<T>(this); }
        internal void SetResult(T value) { result = value; Finish(null); }
    }

    internal sealed class Continuation
    {
        internal IAsyncStateMachine Machine;
        internal Continuation Next;
        internal Continuation(IAsyncStateMachine machine) { Machine = machine; }
    }

    internal sealed class Timer
    {
        internal Task Task;
        internal long Due;
        internal Timer Next;
        internal Timer(Task task, long due) { Task = task; Due = due; }
    }

    // No host threads or wall-clock sleeps: time advances only when the FIFO is empty.
    internal static class Scheduler
    {
        private static Continuation first;
        private static Continuation last;
        private static Timer timers;
        private static long clock;
        internal static void Enqueue(IAsyncStateMachine machine)
        {
            Continuation item = new Continuation(machine);
            if (last == null) first = item;
            else last.Next = item;
            last = item;
        }
        internal static void AddTimer(Task task, int delay)
        {
            Timer timer = new Timer(task, clock + delay);
            if (timers == null || timer.Due < timers.Due)
            {
                timer.Next = timers;
                timers = timer;
                return;
            }
            Timer previous = timers;
            while (previous.Next != null && previous.Next.Due <= timer.Due) previous = previous.Next;
            timer.Next = previous.Next;
            previous.Next = timer;
        }
        internal static void Step()
        {
            if (first != null)
            {
                Continuation item = first;
                first = item.Next;
                if (first == null) last = null;
                item.Machine.MoveNext();
                return;
            }
            if (timers == null) throw new InvalidOperationException("Task cannot complete: no queued continuations or timers.");
            clock = timers.Due;
            do
            {
                Timer timer = timers;
                timers = timer.Next;
                timer.Task.Finish(null);
            } while (timers != null && timers.Due <= clock);
        }
    }
}
