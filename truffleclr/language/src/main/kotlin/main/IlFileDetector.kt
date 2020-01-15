package main

import com.oracle.truffle.api.TruffleFile
import java.nio.charset.Charset

class IlFileDetector : TruffleFile.FileTypeDetector {
    override fun findMimeType(file: TruffleFile): String? {
        return if (file.name.endsWith(".il")) {
            "application/il"
        } else {
            null
        }
    }

    override fun findEncoding(file: TruffleFile?): Charset = Charset.defaultCharset()
}