package mylang

import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.`object`.Layout
import java.util.*

class Context(val env: TruffleLanguage.Env) {
    val stack = Stack<Int>()
    val layout = Layout.createLayout()
    val shape = layout.createShape(TestObject())

    companion object {
        lateinit var envg: TruffleLanguage.Env
    }

    init {
        Context.envg = env
    }
}