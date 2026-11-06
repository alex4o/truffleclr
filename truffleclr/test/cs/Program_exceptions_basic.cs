using System;
namespace HelloWorld {
class Boom : Exception { public int Code; public Boom(string text, int code) : base(text) { Code = code; } }
class Program {
static void Deep() { throw new Boom("boom", 7); }
static void Middle() { try { Deep(); } finally { Console.WriteLine("middle finally"); } }
static int Return() { try { return 42; } finally { Console.WriteLine("return finally"); } }
static void Main() {
try { try { Middle(); } catch (InvalidOperationException) { Console.WriteLine("wrong"); } catch (Boom ex) { Console.WriteLine(ex.Message); Console.WriteLine(ex.Code); throw; } finally { Console.WriteLine("inner finally"); } }
catch (Exception ex) { Console.WriteLine(ex.Message); }
Console.WriteLine(Return());
for (int i=0;i<4;i++) { try { if(i==0) continue; if(i==2) break; Console.WriteLine(i); } finally { Console.WriteLine("loop finally"); } }
Console.WriteLine("done");
}
}}
