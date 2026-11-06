namespace System
{
    public class AggregateException : Exception
    {
        private readonly Collections.ObjectModel.ReadOnlyCollection<Exception> innerExceptions;
        public AggregateException() : this("One or more errors occurred.") { }
        public AggregateException(string message) : base(message)
        {
            innerExceptions = new Collections.ObjectModel.ReadOnlyCollection<Exception>(new Exception[0]);
        }
        public AggregateException(Exception innerException) : this("One or more errors occurred.", innerException) { }
        public AggregateException(string message, Exception innerException) : base(message, innerException)
        {
            if (innerException == null) throw new ArgumentNullException();
            innerExceptions = new Collections.ObjectModel.ReadOnlyCollection<Exception>(new Exception[] { innerException });
        }
        public AggregateException(Exception[] exceptions) : this("One or more errors occurred.", exceptions) { }
        public AggregateException(string message, Exception[] exceptions) : base(message, First(exceptions))
        {
            Exception[] copy = new Exception[exceptions.Length];
            for (int i = 0; i < exceptions.Length; i++)
            {
                if (exceptions[i] == null) throw new ArgumentException("An element of innerExceptions was null.");
                copy[i] = exceptions[i];
            }
            innerExceptions = new Collections.ObjectModel.ReadOnlyCollection<Exception>(copy);
        }
        private static Exception First(Exception[] exceptions)
        {
            if (exceptions == null) throw new ArgumentNullException();
            return exceptions.Length == 0 ? null : exceptions[0];
        }
        public Collections.ObjectModel.ReadOnlyCollection<Exception> InnerExceptions { get { return innerExceptions; } }
        public override string Message
        {
            get
            {
                string message = base.Message;
                for (int i = 0; i < innerExceptions.Count; i++)
                    message = String.Concat(message, " (", innerExceptions[i].Message, ")");
                return message;
            }
        }
    }
}

namespace System.Collections.ObjectModel
{
    // Minimal read-only view needed by AggregateException; storage is owned by CoreLib.
    public class ReadOnlyCollection<T>
    {
        private readonly T[] items;
        internal ReadOnlyCollection(T[] values) { items = values; }
        public int Count { get { return items.Length; } }
        public T this[int index]
        {
            get
            {
                if (index < 0 || index >= items.Length) throw new ArgumentOutOfRangeException();
                return items[index];
            }
        }
    }
}
