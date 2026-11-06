namespace System
{
    public class Exception
    {
        private string _message;
        private Exception _innerException;
        public Exception() : this("Exception of type 'System.Exception' was thrown.") { }
        public Exception(string message) { _message = message; }
        public Exception(string message, Exception innerException) : this(message) { _innerException = innerException; }
        public virtual string Message { get { return _message; } }
        public Exception InnerException { get { return _innerException; } }
        public override string ToString() { return Message; }
    }
    public class SystemException : Exception
    {
        public SystemException() : base("Exception of type 'System.SystemException' was thrown.") { }
        public SystemException(string message) : base(message) { }
        public SystemException(string message, Exception innerException) : base(message, innerException) { }
    }
    public class ArithmeticException : SystemException
    {
        public ArithmeticException() : base("Exception of type 'System.ArithmeticException' was thrown.") { }
        public ArithmeticException(string message) : base(message) { }
        public ArithmeticException(string message, Exception innerException) : base(message, innerException) { }
    }
    public class DivideByZeroException : ArithmeticException
    {
        public DivideByZeroException() : base("Exception of type 'System.DivideByZeroException' was thrown.") { }
        public DivideByZeroException(string message) : base(message) { }
        public DivideByZeroException(string message, Exception innerException) : base(message, innerException) { }
    }
    public class NullReferenceException : SystemException
    {
        public NullReferenceException() : base("Exception of type 'System.NullReferenceException' was thrown.") { }
        public NullReferenceException(string message) : base(message) { }
        public NullReferenceException(string message, Exception innerException) : base(message, innerException) { }
    }
    public class IndexOutOfRangeException : SystemException
    {
        public IndexOutOfRangeException() : base("Exception of type 'System.IndexOutOfRangeException' was thrown.") { }
        public IndexOutOfRangeException(string message) : base(message) { }
        public IndexOutOfRangeException(string message, Exception innerException) : base(message, innerException) { }
    }
    public class InvalidCastException : SystemException
    {
        public InvalidCastException() : base("Exception of type 'System.InvalidCastException' was thrown.") { }
        public InvalidCastException(string message) : base(message) { }
        public InvalidCastException(string message, Exception innerException) : base(message, innerException) { }
    }
    public class ArrayTypeMismatchException : SystemException
    {
        public ArrayTypeMismatchException() : base("Exception of type 'System.ArrayTypeMismatchException' was thrown.") { }
        public ArrayTypeMismatchException(string message) : base(message) { }
        public ArrayTypeMismatchException(string message, Exception innerException) : base(message, innerException) { }
    }
    public class OverflowException : ArithmeticException
    {
        public OverflowException() : base("Exception of type 'System.OverflowException' was thrown.") { }
        public OverflowException(string message) : base(message) { }
        public OverflowException(string message, Exception innerException) : base(message, innerException) { }
    }
    public class InvalidOperationException : SystemException
    {
        public InvalidOperationException() : base("Exception of type 'System.InvalidOperationException' was thrown.") { }
        public InvalidOperationException(string message) : base(message) { }
        public InvalidOperationException(string message, Exception innerException) : base(message, innerException) { }
    }
    public class ArgumentException : SystemException
    {
        public ArgumentException() : base("Exception of type 'System.ArgumentException' was thrown.") { }
        public ArgumentException(string message) : base(message) { }
        public ArgumentException(string message, Exception innerException) : base(message, innerException) { }
    }
    public class ArgumentOutOfRangeException : ArgumentException
    {
        public ArgumentOutOfRangeException() : base("Argument out of range.") { }
    }
    public class ArgumentNullException : ArgumentException
    {
        public ArgumentNullException() : base("Exception of type 'System.ArgumentNullException' was thrown.") { }
        public ArgumentNullException(string message) : base(message) { }
        public ArgumentNullException(string message, Exception innerException) : base(message, innerException) { }
    }
    public class NotImplementedException : SystemException
    {
        public NotImplementedException() : base("Exception of type 'System.NotImplementedException' was thrown.") { }
        public NotImplementedException(string message) : base(message) { }
        public NotImplementedException(string message, Exception innerException) : base(message, innerException) { }
    }
    public class NotSupportedException : SystemException
    {
        public NotSupportedException() : base("Exception of type 'System.NotSupportedException' was thrown.") { }
        public NotSupportedException(string message) : base(message) { }
        public NotSupportedException(string message, Exception innerException) : base(message, innerException) { }
    }
}
