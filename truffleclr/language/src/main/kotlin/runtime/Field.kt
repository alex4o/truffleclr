package runtime

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.RootCallTarget
import com.oracle.truffle.api.dsl.Cached
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import com.oracle.truffle.api.nodes.DirectCallNode
import com.oracle.truffle.api.nodes.IndirectCallNode
import main.Clr
import metadata.IlField

//@ExportLibrary(InteropLibrary::class)
class Field(val metadata: IlField, val context: ClrContext) : TruffleObject {

    val memberType = MemberType.Field

    val type by lazy {
        context.types.getValue(metadata.type.name)
    }

    val defaultValue: Any
        get() = metadata.defaultValue

    val name
        get() = metadata.name

    fun isInstance(obj: TruffleObject?): Boolean {
        return obj is Field
    }
}