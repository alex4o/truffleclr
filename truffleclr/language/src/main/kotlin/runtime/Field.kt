package runtime

import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.staticobject.StaticProperty
import metadata.IlField
import types.CTSNull

/** The property itself is a bytecode constant, also suitable for a future field reference. */
class Field(val metadata: IlField, val owner: Type) : StaticProperty(), TruffleObject {
    private val kind = if (metadata.type.isPrimiteive) metadata.type.type else CorElementType.OBJECT
    val storageType: Class<*> = when (kind) {
        CorElementType.BOOLEAN -> Boolean::class.javaPrimitiveType!!
        CorElementType.I1, CorElementType.U1 -> Byte::class.javaPrimitiveType!!
        CorElementType.I2, CorElementType.U2 -> Short::class.javaPrimitiveType!!
        CorElementType.CHAR -> Char::class.javaPrimitiveType!!
        CorElementType.I4, CorElementType.U4 -> Int::class.javaPrimitiveType!!
        CorElementType.I8, CorElementType.U8, CorElementType.I, CorElementType.U -> Long::class.javaPrimitiveType!!
        CorElementType.R4 -> Float::class.javaPrimitiveType!!
        CorElementType.R8 -> Double::class.javaPrimitiveType!!
        else -> Any::class.java
    }
    override fun getId(): String = metadata.name

    // Small integers are sign/zero extended to the CIL int32 evaluation-stack type.
    fun read(receiver: ClrObject): Any = when (kind) {
        CorElementType.BOOLEAN -> if (getBoolean(receiver)) 1 else 0
        CorElementType.I1 -> getByte(receiver).toInt()
        CorElementType.U1 -> getByte(receiver).toInt() and 0xff
        CorElementType.I2 -> getShort(receiver).toInt()
        CorElementType.U2 -> getShort(receiver).toInt() and 0xffff
        CorElementType.CHAR -> getChar(receiver).code
        CorElementType.I4, CorElementType.U4 -> getInt(receiver)
        CorElementType.I8, CorElementType.U8, CorElementType.I, CorElementType.U -> getLong(receiver)
        CorElementType.R4 -> getFloat(receiver)
        CorElementType.R8 -> getDouble(receiver)
        else -> getObject(receiver) ?: CTSNull
    }

    fun write(receiver: ClrObject, value: Any) {
        when (kind) {
            CorElementType.BOOLEAN -> setBoolean(receiver, if (value is Boolean) value else (value as Number).toInt() != 0)
            CorElementType.I1, CorElementType.U1 -> setByte(receiver, (value as Number).toByte())
            CorElementType.I2, CorElementType.U2 -> setShort(receiver, (value as Number).toShort())
            CorElementType.CHAR -> setChar(receiver, if (value is Char) value else (value as Number).toInt().toChar())
            CorElementType.I4, CorElementType.U4 -> setInt(receiver, (value as Number).toInt())
            CorElementType.I8, CorElementType.U8, CorElementType.I, CorElementType.U -> setLong(receiver, (value as Number).toLong())
            CorElementType.R4 -> setFloat(receiver, (value as Number).toFloat())
            CorElementType.R8 -> setDouble(receiver, (value as Number).toDouble())
            else -> setObject(receiver, if (value === CTSNull) null else value)
        }
    }
}
