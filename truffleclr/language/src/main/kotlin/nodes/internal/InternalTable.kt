package nodes.internal

import com.sun.org.apache.xpath.internal.ExpressionNode

/**
 * All the internal methods are implemented as nodes, this allows them to also use specializations.
 */
object InternalTable {
    fun staticMethods() = mutableMapOf(
        "System.Int32 System.Console::Read()" to ConsoleRead(),
        "System.Void System.Console::Write(System.Int32)" to ConsoleWrite(),
        "System.Void System.Console::Write(System.Object)" to ConsoleWrite(),
        "System.Void System.Console::Write(System.String)" to ConsoleWrite(),
        "System.Void System.Console::Write(System.Double)" to ConsoleWrite(),
        "System.Void System.Console::Write(System.Char)" to ConsoleWrite(),
        "System.Void System.Console::WriteLine(System.Int32)" to ConsoleWriteLine(),
        "System.Void System.Console::WriteLine(System.Boolean)" to ConsoleWriteLine(),
        "System.Void System.Console::WriteLine(System.String)" to ConsoleWriteLine(),
        "System.Void System.Console::WriteLine(System.Double)" to ConsoleWriteLine(),
        "System.Void System.Console::WriteLine(System.Object)" to ConsoleWriteLine(),
        "System.Void System.Console::WriteLine()" to ConsoleWriteLine0(),
        "System.Boolean System.Convert::ToBoolean(System.Int32)" to ToBoolean(),
        "System.Char System.Convert::ToChar(System.Int32)" to ToChar(),
        "System.Byte[] System.IO.File::ReadAllBytes(System.String)" to ReadAllBytes(),
        "System.Boolean System.ValueType::CanCompareBits(System.Object)" to CanCompareBits(),
        "System.Boolean System.ValueType::FastEqualsCheck(System.Object,System.Object)" to FastEqualsCheck(),
        "System.Int32 System.ValueType::GetHashCode()" to GetHashCode(),
        "System.Double System.Math::Sqrt(System.Double)" to Sqrt(),
        "System.String System.String::Concat(System.String[])" to StringConcat(),
        "System.String System.Int32::ToString()" to ToString()
    )

}