package runtime

import com.oracle.truffle.api.CompilerDirectives.CompilationFinal
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
    /** Resolved only after all runtime shapes exist. Null for primitive/reference fields. */
    @CompilationFinal var valueType: Type? = null
        internal set

    override fun getId(): String = metadata.name

    /** Ordinary CIL loads/stores transfer ownership; location access uses the raw APIs. */
    fun read(receiver: ClrObject): Any {
        val value = readRaw(receiver)
        return valueType?.copyValue(value as ClrObject) ?: value
    }

    fun write(receiver: ClrObject, value: Any) {
        val structType = valueType
        if (structType == null) {
            writeRaw(receiver, value)
        } else {
            structType.copyInto(readRaw(receiver) as ClrObject, value as ClrObject)
        }
    }

    // Direct enum comparisons fold during PE; Kotlin enum-switch mapping arrays do not.
    // Small integers are sign/zero extended to the CIL int32 evaluation-stack type.
    fun readRaw(receiver: ClrObject): Any = when {
        kind == CorElementType.BOOLEAN -> if (getBoolean(receiver)) 1 else 0
        kind == CorElementType.I1 -> getByte(receiver).toInt()
        kind == CorElementType.U1 -> getByte(receiver).toInt() and 0xff
        kind == CorElementType.I2 -> getShort(receiver).toInt()
        kind == CorElementType.U2 -> getShort(receiver).toInt() and 0xffff
        kind == CorElementType.CHAR -> getChar(receiver).code
        kind == CorElementType.I4 || kind == CorElementType.U4 -> getInt(receiver)
        kind == CorElementType.I8 || kind == CorElementType.U8 || kind == CorElementType.I || kind == CorElementType.U -> getLong(receiver)
        kind == CorElementType.R4 -> getFloat(receiver)
        kind == CorElementType.R8 -> getDouble(receiver)
        else -> getObject(receiver) ?: CTSNull
    }

    /** Install owned storage during initialization. Pointer stores must use write,
     * not replace struct slots through this API: interior pointers retain slot identity.
     */
    fun writeRaw(receiver: ClrObject, value: Any) {
        val structType = valueType
        if (structType != null && (value !is ClrObject || value.type !== structType)) {
            throw ClassCastException("Expected ${structType.name} for ${metadata.name}")
        }
        when {
            kind == CorElementType.BOOLEAN -> setBoolean(receiver, if (value is Boolean) value else (value as Number).toInt() != 0)
            kind == CorElementType.I1 || kind == CorElementType.U1 -> setByte(receiver, (value as Number).toByte())
            kind == CorElementType.I2 || kind == CorElementType.U2 -> setShort(receiver, (value as Number).toShort())
            kind == CorElementType.CHAR -> setChar(receiver, if (value is Char) value else (value as Number).toInt().toChar())
            kind == CorElementType.I4 || kind == CorElementType.U4 -> setInt(receiver, (value as Number).toInt())
            kind == CorElementType.I8 || kind == CorElementType.U8 || kind == CorElementType.I || kind == CorElementType.U -> setLong(receiver, (value as Number).toLong())
            kind == CorElementType.R4 -> setFloat(receiver, (value as Number).toFloat())
            kind == CorElementType.R8 -> setDouble(receiver, (value as Number).toDouble())
            else -> setObject(receiver, if (value === CTSNull) null else value)
        }
    }
}
