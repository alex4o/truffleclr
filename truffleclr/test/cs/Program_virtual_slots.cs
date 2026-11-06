using System;
namespace HelloWorld {
    public class Base {
        public virtual int Read() { return 1; }
        public int Plain() { return 6; }
    }
    public class Hidden : Base { public new virtual int Read() { return 2; } }
    public class OverrideBase : Base { public override int Read() { return 3; } }
    public class OverrideHidden : Hidden { public override int Read() { return 4; } }
    public class NonVirtual : Base {
        public new int Read() { return 5; }
        public new int Plain() { return 7; }
    }
    public class Program {
        static void ViaBase(Base obj) { Console.WriteLine(obj.Read()); }
        static void ViaHidden(Hidden obj) { Console.WriteLine(obj.Read()); }
        public static void Main(string[] args) {
            Hidden hidden = new Hidden();
            ViaBase(hidden);
            ViaHidden(hidden);
            ViaBase(new OverrideBase());
            OverrideHidden overridden = new OverrideHidden();
            ViaBase(overridden);
            ViaHidden(overridden);
            Console.WriteLine(overridden.Read());
            NonVirtual ordinary = new NonVirtual();
            ViaBase(ordinary);
            Console.WriteLine(ordinary.Read());
            Base baseReference = ordinary;
            Console.WriteLine(baseReference.Plain());
            Console.WriteLine(ordinary.Plain());
        }
    }
}
