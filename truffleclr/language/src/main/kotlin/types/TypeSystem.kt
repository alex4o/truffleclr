package types

import com.oracle.truffle.api.dsl.TypeCheck
import com.oracle.truffle.api.dsl.TypeSystem

@ExperimentalUnsignedTypes
@TypeSystem(
    Int::class,
    Long::class,
    Byte::class,
    Short::class,
    Float::class,
    Double::class,
    Boolean::class,
    String::class,
    CTSNull::class
)
open class TypeSystem {
    companion object {
        @JvmStatic
        @TypeCheck(Int::class)
        fun isInt(value: Any): Boolean {
            return value is Int
        }

        @JvmStatic
        @TypeCheck(Boolean::class)
        fun isBoolean(value: Any): Boolean {
            return value is Boolean
        }

        @JvmStatic
        @TypeCheck(CTSNull::class)
        fun isNull(value: Any): Boolean {
            return value is CTSNull
        }

        @JvmStatic
        @TypeCheck(Long::class)
        fun isLong(value: Any): Boolean {
            return value is Long
        }

        @JvmStatic
        @TypeCheck(Float::class)
        fun isFloat(value: Any): Boolean {
            return value is Float
        }

        @JvmStatic
        @TypeCheck(Double::class)
        fun isDouble(value: Any): Boolean {
            return value is Double
        }

        @JvmStatic
        @TypeCheck(Short::class)
        fun isShort(value: Any): Boolean {
            return value is Short
        }

        @JvmStatic
        @TypeCheck(Byte::class)
        fun isByte(value: Any): Boolean {
            return value is Byte
        }
    }
}