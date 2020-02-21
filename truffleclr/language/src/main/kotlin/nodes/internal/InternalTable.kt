package nodes.internal

import com.sun.org.apache.xpath.internal.ExpressionNode

object InternalTable {
    fun staticMethods() = mutableMapOf(
        "int32 System.Console::Read()" to ConsoleRead(),
        "void System.Console::Write(int32)" to ConsoleWrite(),
        "void System.Console::Write(object)" to ConsoleWrite(),
        "void System.Console::Write(string)" to ConsoleWrite(),
        "void System.Console::Write(char)" to ConsoleWrite(),
        "void System.Console::WriteLine(int32)" to ConsoleWriteLine(),
        "void System.Console::WriteLine(bool)" to ConsoleWriteLine(),
        "void System.Console::WriteLine(string)" to ConsoleWriteLine(),
        "void System.Console::WriteLine(object)" to ConsoleWriteLine(),
        "void System.Console::WriteLine()" to ConsoleWriteLine0(),
        "bool System.Convert::ToBoolean(int32)" to ToBoolean(),
        "char System.Convert::ToChar(int32)" to ToChar(),
        "uint8[] System.IO.File::ReadAllBytes(string)" to ReadAllBytes(),
        "bool System.ValueType::CanCompareBits(object)" to CanCompareBits(),
        "bool System.ValueType::FastEqualsCheck(object,object)" to FastEqualsCheck(),
        "int32 System.ValueType::GetHashCode()" to GetHashCode()
    )

}