
namespace System
{
    // [Serializable]
    public abstract partial class Array
    //  : ICloneable, IList, IStructuralComparable, IStructuralEquatable
    {
        internal const int MaxArrayLength = 0X7FEFFFFF;
        internal const int MaxByteArrayLength = 0x7FFFFFC7;

        // This ctor exists solely to prevent C# from generating a protected .ctor that violates the surface area.
        private protected Array() {
            
         }


    }
}