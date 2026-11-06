using System;
namespace HelloWorld { class A { public int X; public virtual int Read() { return X; } } class B { }
class Program {
static int Zero() { return 0; }
static void Main() {
try { Console.WriteLine(5/Zero()); } catch(DivideByZeroException) { Console.WriteLine("divide"); }
try { Console.WriteLine(5%Zero()); } catch(ArithmeticException) { Console.WriteLine("remainder"); }
A a = null;
try { Console.WriteLine(a.X); } catch(NullReferenceException) { Console.WriteLine("field null"); }
try { Console.WriteLine(a.Read()); } catch(NullReferenceException) { Console.WriteLine("call null"); }
int[] array = null;
try { Console.WriteLine(array.Length); } catch(NullReferenceException) { Console.WriteLine("array null"); }
array=new int[1];
try { Console.WriteLine(array[1]); } catch(IndexOutOfRangeException) { Console.WriteLine("bounds"); }
object b=new B();
try { a=(A)b; } catch(InvalidCastException) { Console.WriteLine("cast"); }
object[] objects=new A[1];
try { objects[0]=b; } catch(ArrayTypeMismatchException) { Console.WriteLine("array type"); }
try { throw null; } catch(NullReferenceException) { Console.WriteLine("throw null"); }
int size=-1;
try { array=new int[size]; } catch(OverflowException) { Console.WriteLine("negative length"); }
object boxed=null;
try { Console.WriteLine((int)boxed); } catch(NullReferenceException) { Console.WriteLine("unbox null"); }
boxed="string";
try { Console.WriteLine((int)boxed); } catch(InvalidCastException) { Console.WriteLine("unbox type"); }
int minimum=int.MinValue;
try { Console.WriteLine(minimum/size); } catch(OverflowException) { Console.WriteLine("divide overflow"); }
try { Console.WriteLine(minimum%size); } catch(OverflowException) { Console.WriteLine("remainder overflow"); }
long wide=long.MinValue;
try { Console.WriteLine(wide/size); } catch(OverflowException) { Console.WriteLine("long divide overflow"); }
try { Console.WriteLine(wide%size); } catch(OverflowException) { Console.WriteLine("long remainder overflow"); }
int caught=0;
for(int i=0;i<100000;i++) {
try { Console.WriteLine(1/Zero()); } catch(DivideByZeroException) { caught++; }
try { Console.WriteLine(a.Read()); } catch(NullReferenceException) { caught++; }
try { Console.WriteLine(array[1]); } catch(IndexOutOfRangeException) { caught++; }
try { a=(A)b; } catch(InvalidCastException) { caught++; }
try { objects[0]=b; } catch(ArrayTypeMismatchException) { caught++; }
try { array=new int[size]; } catch(OverflowException) { caught++; }
}
Console.WriteLine(caught);
}
}}
