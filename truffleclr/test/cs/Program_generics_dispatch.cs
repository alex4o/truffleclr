using System;

namespace HelloWorld
{
    interface I<T>
    {
        int M(T value);
    }

    class B<T>
    {
        public virtual int M(T value) { return 1; }
    }

    class D : B<int>, I<int>
    {
        public override int M(int value) { return 2; }
    }

    class Combined : B<int>, I<int>
    {
        public override int M(int value) { return 11; }
    }

    class Reimplemented : D, I<int>
    {
        public new virtual int M(int value) { return 3; }
    }

    class InheritedOverride : D
    {
        public override int M(int value) { return 4; }
    }

    class PrivateShadow : B<int>, I<int>
    {
        private new int M(int value) { return 5; }
    }

    class Explicit : B<int>, I<int>
    {
        int I<int>.M(int value) { return 6; }
    }

    class ReimplementedOverride : Reimplemented
    {
        public override int M(int value) { return 7; }
    }

    class Hidden : D
    {
        public new virtual int M(int value) { return 8; }
    }

    class HiddenOverride : Hidden
    {
        public override int M(int value) { return 9; }
    }

    class B<TA, TB>
    {
        public virtual int M(TA value) { return 10; }
        public virtual int M(TB value) { return 20; }
    }

    class D<X, Y> : B<Y, X>
    {
        public override int M(Y value) { return 30; }
    }

    class ExplicitSwapped<X, Y> : B<Y, X>
    {
        public override int M(Y value) { return 40; }
    }

    interface IValue<T> { T Get(); }
    class Named<U> : IValue<U>
    {
        U value;
        public Named(U value) { this.value = value; }
        U IValue<U>.Get() { return value; }
    }
    class Same<T> : IValue<T>
    {
        T value;
        public Same(T value) { this.value = value; }
        T IValue<T>.Get() { return value; }
    }

    class Program
    {
        static int Call<T>(I<T> receiver, T value) { return receiver.M(value); }
        static int First<A, C>(B<A, C> receiver, A value) { return receiver.M(value); }
        static int Second<A, C>(B<A, C> receiver, C value) { return receiver.M(value); }

        static void Main(string[] args)
        {
            Console.WriteLine(new B<int>().M(0)); // 1
            D derived = new D();
            Console.WriteLine(Call<int>(derived, 0)); // 2
            Console.WriteLine(((B<int>)derived).M(0)); // 2
            Reimplemented reimplemented = new Reimplemented();
            Console.WriteLine(Call<int>(reimplemented, 0)); // 3
            Console.WriteLine(((B<int>)reimplemented).M(0)); // 2: original slot
            Console.WriteLine(Call<int>(new InheritedOverride(), 0)); // 4
            Console.WriteLine(Call<int>(new PrivateShadow(), 0)); // 1: private shadow is not an implementation
            Explicit explicitImplementation = new Explicit();
            Console.WriteLine(Call<int>(explicitImplementation, 0)); // 6
            Console.WriteLine(explicitImplementation.M(0)); // 1
            ReimplementedOverride overridden = new ReimplementedOverride();
            Console.WriteLine(Call<int>(overridden, 0)); // 7: inherited interface selects new slot
            Console.WriteLine(((B<int>)overridden).M(0)); // 2
            HiddenOverride hidden = new HiddenOverride();
            Console.WriteLine(Call<int>(hidden, 0)); // 2: hiding does not remap inherited interface
            Console.WriteLine(((Hidden)hidden).M(0)); // 9

            // Helpers select distinct open signatures before both arguments become int.
            B<int, int> baseline = new B<int, int>();
            Console.WriteLine(First<int, int>(baseline, 0)); // 10
            Console.WriteLine(Second<int, int>(baseline, 0)); // 20
            D<int, int> swapped = new D<int, int>();
            Console.WriteLine(First<int, int>(swapped, 0)); // 30
            Console.WriteLine(Second<int, int>(swapped, 0)); // 20
            ExplicitSwapped<int, int> explicitSwap = new ExplicitSwapped<int, int>();
            Console.WriteLine(First<int, int>(explicitSwap, 0)); // 40
            Console.WriteLine(Second<int, int>(explicitSwap, 0)); // 20
            Console.WriteLine(((IValue<int>)new Named<int>(41)).Get());
            Console.WriteLine(((IValue<int>)new Same<int>(42)).Get());
            Combined combined = new Combined();
            Console.WriteLine(((B<int>)combined).M(0));
            Console.WriteLine(Call<int>(combined, 0));
        }
    }
}
