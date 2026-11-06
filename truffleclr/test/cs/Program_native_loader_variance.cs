// Compiled with the .NET SDK as test/rejected/generic_variance.dll.
namespace HelloWorld {
    public interface Covariant<out T> { T Read(); }
    public class Program {
        public static void Main(string[] args) { Use(null); }
        public static void Use(Covariant<object> value) {}
    }
}
