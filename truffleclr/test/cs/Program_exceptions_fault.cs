using System;
namespace HelloWorld { class Program {
static void Fault(bool fail) { try { if(fail) throw new Exception("fault"); } catch { Console.WriteLine("fault cleanup"); throw; } }
static void Main() { Fault(false); Console.WriteLine("normal"); try { Fault(true); } catch(Exception e) { Console.WriteLine(e.Message); } }
}}
