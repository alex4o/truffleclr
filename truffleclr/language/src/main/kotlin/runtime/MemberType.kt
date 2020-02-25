package runtime

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.RootCallTarget
import com.oracle.truffle.api.interop.TruffleObject

enum class MemberType(val flag: Int) {
    Constructor(1),
    Event(2),
    Field(4),
    Method(8),
    Property(16),
    TypeInfo(32),
    Custom(64),
    NestedType(128),
    All(191)
}