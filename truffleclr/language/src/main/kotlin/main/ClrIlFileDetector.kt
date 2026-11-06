package main

import com.oracle.truffle.api.TruffleFile
import java.nio.charset.Charset

class ClrIlFileDetector : TruffleFile.FileTypeDetector {
    override fun findMimeType(file: TruffleFile): String? {
        return when (file.name.substringAfterLast('.', "").lowercase()) {
            "il" -> "application/il"
            "dll", "exe" -> "application/x-dotnet-assembly"
            else -> null
        }
    }

    override fun findEncoding(file: TruffleFile?): Charset? =
        if (file?.name?.substringAfterLast('.', "")?.lowercase() in setOf("dll", "exe")) null
        else Charset.defaultCharset()
}