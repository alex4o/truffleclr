package runtime

import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.library.ExportLibrary

@ExportLibrary(InteropLibrary::class)
class ClrContext(val env: TruffleLanguage.Env): TruffleObject {
    init {

    }
}