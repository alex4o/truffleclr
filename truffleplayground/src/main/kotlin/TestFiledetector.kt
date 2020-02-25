package mylang

import com.oracle.truffle.api.TruffleFile
import java.nio.charset.Charset

class TestFiledetector : TruffleFile.FileTypeDetector {
    override fun findMimeType(file: TruffleFile): String? {
        return if (file.name.endsWith(".test")) {
            "application/test"
        } else {
            null
        }
    }

    override fun findEncoding(file: TruffleFile?): Charset = Charset.defaultCharset()
}