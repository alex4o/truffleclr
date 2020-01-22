package types

import com.oracle.truffle.api.dsl.TypeCheck
import com.oracle.truffle.api.dsl.TypeSystem

@TypeSystem(Int::class, Boolean::class, String::class, CTSNull::class)
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
    }
}