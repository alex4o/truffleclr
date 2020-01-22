package runtime.util

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.InvalidArrayIndexException
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage

@ExportLibrary(InteropLibrary::class)
internal class Keys(private val keys: Array<Any>) : TruffleObject {
    @ExportMessage
    fun hasArrayElements(): Boolean {
        return true
    }

    @ExportMessage
    fun isArrayElementReadable(index: Long): Boolean {
        return index >= 0 && index < keys.size
    }

    @get:ExportMessage
    val arraySize: Long
        get() = keys.size.toLong()

    @ExportMessage
    @Throws(InvalidArrayIndexException::class)
    fun readArrayElement(index: Long): Any {
        if (!isArrayElementReadable(index)) {
            CompilerDirectives.transferToInterpreter()
            throw InvalidArrayIndexException.create(index)
        }
        return keys[index.toInt()]
    }

}