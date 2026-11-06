using System;
namespace HelloWorld { class Program {
static bool Filter(int value) { Console.WriteLine(value); if(value==2) throw new Exception("filter throws"); return value==3; }
static void Main() {
try { throw new InvalidOperationException("filtered"); }
catch(ArgumentException) { Console.WriteLine("wrong type"); }
catch(Exception) when(Filter(1)) { Console.WriteLine("wrong false"); }
catch(Exception) when(Filter(2)) { Console.WriteLine("wrong throw"); }
catch(InvalidOperationException ex) when(Filter(3)) { Console.WriteLine(ex.Message); }
try { try { throw new Exception("again"); } catch(Exception ex) { throw ex; } } catch(Exception ex) { Console.WriteLine(ex.Message); }
int count=0;
for(int i=0;i<100000;i++) { try { throw new Exception("hot"); } catch(Exception) { count++; } }
Console.WriteLine(count);
}
}}
