package nodes.internal

import com.sun.org.apache.xpath.internal.ExpressionNode

object InternalTable {
    var staticMethods = mutableMapOf(
        "void System.Console::Write(int32)" to ConsoleWrite(),
        "void System.Console::Write(object)" to ConsoleWrite(),
        "void System.Console::Write(string)" to ConsoleWrite(),
        "void System.Console::WriteLine(int32)" to ConsoleWriteLine(),
        "void System.Console::WriteLine(string)" to ConsoleWriteLine(),
        "void System.Console::WriteLine(object)" to ConsoleWriteLine(),
        "void System.Console::WriteLine()" to ConsoleWriteLine0(),
        "bool System.Convert::ToBoolean(int32)" to ToBoolean(),
        "bool System.ValueType::CanCompareBits(object)" to CanCompareBits(),
        "bool System.ValueType::FastEqualsCheck(object,object)" to FastEqualsCheck(),
        "int32 System.ValueType::GetHashCode()" to GetHashCode()
    )
}