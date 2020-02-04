package types

enum class CoreElementType {
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

class TypeInfo(val name: String?, val type: CoreElementType, val size: Int, val isArray: Boolean, val isPrimitive: Boolean, val isFloat: Boolean, val isModifier: Boolean, val isGenericVariable: Boolean)

object CoreTypeInfo {
    val TARGET_POINTER_SIZE = 8;
    val NO_SIZE = 0;
    val types = arrayOf(
        TypeInfo("System.Void", CoreElementType.VOID,          0,                    false,  true,   false,  false,  false) // 0x01
        ,TypeInfo("System.Boolean", CoreElementType.BOOLEAN,   1,   false,  true,   false,  false,  false) // 0x02
        ,TypeInfo("System.Char", CoreElementType.CHAR,         2,   false,  true,   false,  false,  false) // 0x03
        ,TypeInfo("System.SByte", CoreElementType.I1,          1,   false,  true,   false,  false,  false) // 0x04
        ,TypeInfo("System.Byte", CoreElementType.U1,           1,   false,  true,   false,  false,  false) // 0x05
        ,TypeInfo("System.Int16", CoreElementType.I2,          2,   false,  true,   false,  false,  false) // 0x06
        ,TypeInfo("System.UInt16", CoreElementType.U2,         2,   false,  true,   false,  false,  false) // 0x07
        ,TypeInfo("System.Int32", CoreElementType.I4,          4,   false,  true,   false,  false,  false) // 0x08
        ,TypeInfo("System.UInt32", CoreElementType.U4,         4,   false,  true,   false,  false,  false) // 0x09
        ,TypeInfo("System.Int64", CoreElementType.I8,          8,   false,  true,   false,  false,  false) // 0x0a
        ,TypeInfo("System.UInt64", CoreElementType.U8,         8,   false,  true,   false,  false,  false) // 0x0b

        ,TypeInfo("System.Single", CoreElementType.R4,         4,   false,  true,   true,   false,  false) // 0x0c
        ,TypeInfo("System.Double", CoreElementType.R8,         8,   false,  true,   true,   false,  false) // 0x0d

        ,TypeInfo("System.String", CoreElementType.STRING,         TARGET_POINTER_SIZE,    false,  false,  false,  false,  false) // 0x0e
        ,TypeInfo(null, CoreElementType.PTR,                 TARGET_POINTER_SIZE,   false,  false,  false,  true,   false) // 0x0f
        ,TypeInfo(null, CoreElementType.BYREF,                 TARGET_POINTER_SIZE,  false,  false,  false,  true,   false) // 0x10
        ,TypeInfo(null, CoreElementType.VALUETYPE,                 NO_SIZE,  false,  false,  false,  false,  false) // 0x11
        ,TypeInfo(null, CoreElementType.CLASS,                 TARGET_POINTER_SIZE,    false,  false,  false,  false,  false) // 0x12
        ,TypeInfo(null, CoreElementType.VAR,                 TARGET_POINTER_SIZE,  false,  false,  false,  false,  true)  // 0x13
        ,TypeInfo(null, CoreElementType.ARRAY,                 TARGET_POINTER_SIZE,    true,   false,  false,  true,   false) // 0x14

        ,TypeInfo(null, CoreElementType.GENERICINST,                 TARGET_POINTER_SIZE,  false,  false,  false,  false,  false) // 0x15
        ,TypeInfo("System.TypedReference", CoreElementType.TYPEDBYREF, 2*TARGET_POINTER_SIZE,  false,  false,  false,  false, false) // 0x16
        ,TypeInfo(" NULL.NULL", CoreElementType.VALUEARRAY_UNSUPPORTED,        NO_SIZE,   false,  false,  false,  false,  false) // 0x17 (unsupported, not in the ECMA spec)

        ,TypeInfo("System.IntPtr", CoreElementType.I,         TARGET_POINTER_SIZE,   false,  true,   false,  false,  false) // 0x18
        ,TypeInfo("System.UIntPtr", CoreElementType.U,        TARGET_POINTER_SIZE,   false,  true,   false,  false,  false) // 0x19
        ,TypeInfo("NULL. NULL", CoreElementType.R_UNSUPPORTED,                 NO_SIZE,   false,  false,  false,  false,  false) // 0x1a (unsupported, not in the ECMA spec)

        ,TypeInfo(null, CoreElementType.FNPTR,                 TARGET_POINTER_SIZE,   false,  false,  false,  false,  false) // 0x1b
        ,TypeInfo("System.Object", CoreElementType.OBJECT,         TARGET_POINTER_SIZE,    false,  false,  false,  false,  false) // 0x1c
        ,TypeInfo(null, CoreElementType.SZARRAY,                 TARGET_POINTER_SIZE,    true,   false,  false,  true,   false) // 0x1d
        ,TypeInfo(null, CoreElementType.MVAR,                 TARGET_POINTER_SIZE,  false,  false,  false,  false,  true)  // x01e
        ,TypeInfo(null, CoreElementType.CMOD_REQD,                 0,   false,  false,  false,  false,  false) // 0x1f
        ,TypeInfo(null, CoreElementType.CMOD_OPT,                 0,   false,  false,  false,  false,  false) // 0x20
        ,TypeInfo(null, CoreElementType.INTERNAL,                 0,  false,  false,  false,  false,  false) // 0x21
    )

    val typeByName by lazy {
        types.map { Pair(it.name, it) }.toMap()
    }

    val typeByElementType by lazy {
        types.map { Pair(it.type, it) }.toMap()
    }
}

