package nodes.internal

import com.sun.org.apache.xpath.internal.ExpressionNode

object InternalTable {
    var staticMethods = mutableMapOf(
        "void Write(int32)" to ConsoleWrite(),
        "void Write(object)" to ConsoleWrite(),
        "void Write(string)" to ConsoleWrite(),
        "void WriteLine(int32)" to ConsoleWriteLine(),
        "void WriteLine(string)" to ConsoleWriteLine(),
        "void WriteLine(object)" to ConsoleWriteLine(),
        "bool CanCompareBits(object)" to CanCompareBits(),
        "bool FastEqualsCheck(object,object)" to FastEqualsCheck(),
        "int32 GetHashCode()" to GetHashCode()
    )
}