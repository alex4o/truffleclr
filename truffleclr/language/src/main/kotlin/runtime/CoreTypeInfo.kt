package runtime

/**
 * The core types described the CLI and their meta-data, this meta-data is in the code as
 * it is not contained anywhere else. This means it needs to be merged with the types parsed from the runtime.
 */
enum class CorElementType {
    VOID,
    BOOLEAN,
    CHAR,
    I1,
    U1,
    I2,
    U2,
    I4,
    U4,
    I8,
    U8,

    R4,
    R8,

    STRING,
    PTR,
    BYREF,
    VALUETYPE,
    CLASS,
    VAR,
    ARRAY,

    GENERICINST,
    TYPEDBYREF,
    VALUEARRAY_UNSUPPORTED,

    I,
    U,
    R_UNSUPPORTED,

    FNPTR,
    OBJECT,
    SZARRAY,
    MVAR,
    CMOD_REQD,
    CMOD_OPT,
    INTERNAL
}

class TypeInfo(val name: String?, val type: CorElementType, val size: Int, val isArray: Boolean, val isPrimitive: Boolean, val isFloat: Boolean, val isModifier: Boolean, val isGenericVariable: Boolean)

object CoreTypeInfo {
    val TARGET_POINTER_SIZE = 8;
    val NO_SIZE = 0;
    val types = arrayOf(
        TypeInfo(
            "System.Void",
            CorElementType.VOID,
            0,
            false,
            true,
            false,
            false,
            false
        ) // 0x01
        ,
        TypeInfo(
            "System.Boolean",
            CorElementType.BOOLEAN,
            1,
            false,
            true,
            false,
            false,
            false
        ) // 0x02
        ,
        TypeInfo(
            "System.Char",
            CorElementType.CHAR,
            2,
            false,
            true,
            false,
            false,
            false
        ) // 0x03
        ,
        TypeInfo(
            "System.SByte",
            CorElementType.I1,
            1,
            false,
            true,
            false,
            false,
            false
        ) // 0x04
        ,
        TypeInfo(
            "System.Byte",
            CorElementType.U1,
            1,
            false,
            true,
            false,
            false,
            false
        ) // 0x05
        ,
        TypeInfo(
            "System.Int16",
            CorElementType.I2,
            2,
            false,
            true,
            false,
            false,
            false
        ) // 0x06
        ,
        TypeInfo(
            "System.UInt16",
            CorElementType.U2,
            2,
            false,
            true,
            false,
            false,
            false
        ) // 0x07
        ,
        TypeInfo(
            "System.Int32",
            CorElementType.I4,
            4,
            false,
            true,
            false,
            false,
            false
        ) // 0x08
        ,
        TypeInfo(
            "System.UInt32",
            CorElementType.U4,
            4,
            false,
            true,
            false,
            false,
            false
        ) // 0x09
        ,
        TypeInfo(
            "System.Int64",
            CorElementType.I8,
            8,
            false,
            true,
            false,
            false,
            false
        ) // 0x0a
        ,
        TypeInfo(
            "System.UInt64",
            CorElementType.U8,
            8,
            false,
            true,
            false,
            false,
            false
        ) // 0x0b

        ,
        TypeInfo(
            "System.Single",
            CorElementType.R4,
            4,
            false,
            true,
            true,
            false,
            false
        ) // 0x0c
        ,
        TypeInfo(
            "System.Double",
            CorElementType.R8,
            8,
            false,
            true,
            true,
            false,
            false
        ) // 0x0d

        ,
        TypeInfo(
            "System.String",
            CorElementType.STRING,
            TARGET_POINTER_SIZE,
            false,
            false,
            false,
            false,
            false
        ) // 0x0e
        ,
        TypeInfo(
            null,
            CorElementType.PTR,
            TARGET_POINTER_SIZE,
            false,
            false,
            false,
            true,
            false
        ) // 0x0f
        ,
        TypeInfo(
            null,
            CorElementType.BYREF,
            TARGET_POINTER_SIZE,
            false,
            false,
            false,
            true,
            false
        ) // 0x10
        ,
        TypeInfo(
            null,
            CorElementType.VALUETYPE,
            NO_SIZE,
            false,
            false,
            false,
            false,
            false
        ) // 0x11
        ,
        TypeInfo(
            null,
            CorElementType.CLASS,
            TARGET_POINTER_SIZE,
            false,
            false,
            false,
            false,
            false
        ) // 0x12
        ,
        TypeInfo(
            null,
            CorElementType.VAR,
            TARGET_POINTER_SIZE,
            false,
            false,
            false,
            false,
            true
        )  // 0x13
        ,
        TypeInfo(
            null,
            CorElementType.ARRAY,
            TARGET_POINTER_SIZE,
            true,
            false,
            false,
            true,
            false
        ) // 0x14

        ,
        TypeInfo(
            null,
            CorElementType.GENERICINST,
            TARGET_POINTER_SIZE,
            false,
            false,
            false,
            false,
            false
        ) // 0x15
        ,
        TypeInfo(
            "System.TypedReference",
            CorElementType.TYPEDBYREF,
            2 * TARGET_POINTER_SIZE,
            false,
            false,
            false,
            false,
            false
        ) // 0x16
        ,
        TypeInfo(
            "NULL.NULL",
            CorElementType.VALUEARRAY_UNSUPPORTED,
            NO_SIZE,
            false,
            false,
            false,
            false,
            false
        ) // 0x17 (unsupported, not in the ECMA spec)

        ,
        TypeInfo(
            "System.IntPtr",
            CorElementType.I,
            TARGET_POINTER_SIZE,
            false,
            true,
            false,
            false,
            false
        ) // 0x18
        ,
        TypeInfo(
            "System.UIntPtr",
            CorElementType.U,
            TARGET_POINTER_SIZE,
            false,
            true,
            false,
            false,
            false
        ) // 0x19
        ,
        TypeInfo(
            null,
            CorElementType.R_UNSUPPORTED,
            NO_SIZE,
            false,
            false,
            false,
            false,
            false
        ) // 0x1a (unsupported, not in the ECMA spec)

        ,
        TypeInfo(
            null,
            CorElementType.FNPTR,
            TARGET_POINTER_SIZE,
            false,
            false,
            false,
            false,
            false
        ) // 0x1b
        ,
        TypeInfo(
            "System.Object",
            CorElementType.OBJECT,
            TARGET_POINTER_SIZE,
            false,
            false,
            false,
            false,
            false
        ) // 0x1c
        ,
        TypeInfo(
            null,
            CorElementType.SZARRAY,
            TARGET_POINTER_SIZE,
            true,
            false,
            false,
            true,
            false
        ) // 0x1d
        ,
        TypeInfo(
            null,
            CorElementType.MVAR,
            TARGET_POINTER_SIZE,
            false,
            false,
            false,
            false,
            true
        )  // x01e
        ,
        TypeInfo(
            null,
            CorElementType.CMOD_REQD,
            0,
            false,
            false,
            false,
            false,
            false
        ) // 0x1f
        ,
        TypeInfo(
            null,
            CorElementType.CMOD_OPT,
            0,
            false,
            false,
            false,
            false,
            false
        ) // 0x20
        ,
        TypeInfo(
            null,
            CorElementType.INTERNAL,
            0,
            false,
            false,
            false,
            false,
            false
        ) // 0x21
    )

    val typeByName by lazy {
        types.filter { it.name != null }.map { Pair(it.name, it) }.toMap()
    }

    val typeByElementType by lazy {
        types.map { Pair(it.type, it) }.toMap()
    }
}

