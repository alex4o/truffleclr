package nodes.expressions.array

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.dsl.NodeChild
import com.oracle.truffle.api.dsl.Specialization
import nodes.ExpressionNode
import runtime.CorElementType
import runtime.CorElementType.*

@NodeChild("sizeNode")
abstract class NewArray(@CompilerDirectives.CompilationFinal @JvmField val type: CorElementType) : ExpressionNode() {

    @CompilerDirectives.CompilationFinal
    val builder: (Int) -> Any = when(type) {
        VOID -> TODO()
        BOOLEAN -> ({ BooleanArray(it) })
        CHAR -> ({ CharArray(it) })
        I1 -> ({ ByteArray(it) })
        U1 -> ({ UByteArray(it) })
        I2 -> ({ ShortArray(it) })
        U2 -> ({ UShortArray(it) })
        I4 -> ({ IntArray(it) })
        U4 -> ({ UIntArray(it) })
        I8 -> ({ LongArray(it) })
        U8 -> ({ ULongArray(it) })
        R4 -> ({ FloatArray(it) })
        R8 -> ({ DoubleArray(it) })
        STRING -> ({ arrayOfNulls<String>(it) })
        PTR -> ({ arrayOfNulls<Any>(it) })
        BYREF -> TODO()
        VALUETYPE -> TODO()
        CLASS -> TODO()
        VAR -> TODO()
        ARRAY -> TODO()
        GENERICINST -> TODO()
        TYPEDBYREF -> TODO()
        VALUEARRAY_UNSUPPORTED -> TODO()
        I -> TODO()
        U -> TODO()
        R_UNSUPPORTED -> TODO()
        FNPTR -> TODO()
        OBJECT -> ({ arrayOfNulls<Any>(it) })
        SZARRAY -> TODO()
        MVAR -> TODO()
        CMOD_REQD -> TODO()
        CMOD_OPT -> TODO()
        INTERNAL -> TODO()
    }

    @Specialization
    fun create(size: Int): Any {
       var res =  builder(size)
        return res
    }

    override fun toString(): String {
        return "(newarr $type ${this.children.joinToString(" ")})"
    }
}