using System;
namespace HelloWorld { class Program {
static int NestedReturn() { try { try { return 9; } finally { Console.WriteLine("nested inner"); } } finally { Console.WriteLine("nested outer"); } }
static void Replace() { try { throw new Exception("old"); } finally { throw new InvalidOperationException("new"); } }
static void Rethrow() { try { throw new Exception("original"); } catch(Exception) { try { throw new Exception("nested"); } catch(Exception e) { Console.WriteLine(e.Message); } throw; } }
static void Main() {
Console.WriteLine(NestedReturn());
try { Replace(); } catch(Exception e) { Console.WriteLine(e.Message); }
try { Rethrow(); } catch(Exception e) { Console.WriteLine(e.Message); }
int count=0;
try { for(int i=0;i<5;i++) { try { if(i==1) throw new ArgumentException("arg"); if(i==2) continue; if(i==4) break; count+=i; } catch(SystemException) { count+=10; } finally { count++; } } } finally { Console.WriteLine(count); }
try { throw new ArgumentNullException("x"); } catch(ArgumentException) { Console.WriteLine("base first"); } catch(Exception) { Console.WriteLine("wrong base"); }
try { try { throw new Exception("e"); } finally { try { throw new Exception("f"); } catch(Exception e) { Console.WriteLine(e.Message); } } } catch(Exception e) { Console.WriteLine(e.Message); }
}
}}
