package nodes.internal

import runtime.CorElementType

/**
 * All the internal methods are implemented as nodes, this allows them to also use specializations.
 */
object InternalTable {
    fun staticMethods() = mutableMapOf(
        "System.Void System.Runtime.CompilerServices.RuntimeHelpers::InitializeArray(System.Array,System.RuntimeFieldHandle)" to InitializeArray(),
        "System.Int32 System.Array::get_Length()" to ArrayLength(),
        "System.Int32 System.Console::Read()" to ConsoleRead(),
        "System.Void System.Console::Write(System.Int32)" to ConsoleWrite(),
        "System.Void System.Console::Write(System.Object)" to ConsoleWrite(),
        "System.Void System.Console::Write(System.String)" to ConsoleWrite(),
        "System.Void System.Console::Write(System.Double)" to ConsoleWrite(),
        "System.Void System.Console::Write(System.Char)" to ConsoleWrite(CorElementType.CHAR),
        "System.Void System.Console::Write(System.Boolean)" to ConsoleWrite(CorElementType.BOOLEAN),
        "System.Void System.Console::Write(System.UInt32)" to ConsoleWrite(CorElementType.U4),
        "System.Void System.Console::Write(System.UInt64)" to ConsoleWrite(CorElementType.U8),
        "System.Void System.Console::Write(System.Int64)" to ConsoleWrite(CorElementType.I8),
        "System.Void System.Console::Write(System.Single)" to ConsoleWrite(CorElementType.R4),
        "System.Void System.Console::WriteLine(System.Int32)" to ConsoleWrite(newline = true),
        "System.Void System.Console::WriteLine(System.Boolean)" to ConsoleWrite(CorElementType.BOOLEAN, newline = true),
        "System.Void System.Console::WriteLine(System.Char)" to ConsoleWrite(CorElementType.CHAR, newline = true),
        "System.Void System.Console::WriteLine(System.UInt32)" to ConsoleWrite(CorElementType.U4, newline = true),
        "System.Void System.Console::WriteLine(System.Int64)" to ConsoleWrite(newline = true),
        "System.Void System.Console::WriteLine(System.UInt64)" to ConsoleWrite(CorElementType.U8, newline = true),
        "System.Void System.Console::WriteLine(System.Single)" to ConsoleWrite(newline = true),
        "System.Void System.Console::WriteLine(System.String)" to ConsoleWrite(newline = true),
        "System.Void System.Console::WriteLine(System.Double)" to ConsoleWrite(newline = true),
        "System.Void System.Console::WriteLine(System.Object)" to ConsoleWrite(newline = true),
        "System.Void System.Console::WriteLine()" to ConsoleWriteLine0(),
        "System.Boolean System.Convert::ToBoolean(System.Int32)" to ToBoolean(),
        "System.Byte[] System.IO.File::ReadAllBytes(System.String)" to ReadAllBytes(),
        "System.String System.Object::ToString()" to ObjectTypeName(),
        "System.Int32 System.Object::GetHashCode()" to IdentityHashCode(),
        "System.Boolean System.ValueType::Equals(System.Object)" to ValueEquals(),
        "System.Int32 System.ValueType::GetHashCode()" to ValueHashCode(),
        "System.Double System.Math::Abs(System.Double)" to MathFunction("Abs"),
        "System.Double System.Math::Min(System.Double,System.Double)" to MathFunction("Min"),
        "System.Double System.Math::Max(System.Double,System.Double)" to MathFunction("Max"),
        "System.Double System.Math::Floor(System.Double)" to MathFunction("Floor"),
        "System.Double System.Math::Ceiling(System.Double)" to MathFunction("Ceiling"),
        "System.Double System.Math::Round(System.Double)" to MathFunction("Round"),
        "System.Double System.Math::Pow(System.Double,System.Double)" to MathFunction("Pow"),
        "System.Double System.Math::Sin(System.Double)" to MathFunction("Sin"),
        "System.Double System.Math::Cos(System.Double)" to MathFunction("Cos"),
        "System.Double System.Math::Tan(System.Double)" to MathFunction("Tan"),
        "System.Double System.Math::Atan(System.Double)" to MathFunction("Atan"),
        "System.Double System.Math::Atan2(System.Double,System.Double)" to MathFunction("Atan2"),
        "System.Double System.Math::Exp(System.Double)" to MathFunction("Exp"),
        "System.Double System.Math::Log(System.Double)" to MathFunction("Log"),
        "System.Double System.Math::Sqrt(System.Double)" to MathFunction("Sqrt"),
        "System.String System.String::Concat(System.String[])" to StringConcat(),
        "System.String System.Int32::ToString()" to ToString()
    )

}