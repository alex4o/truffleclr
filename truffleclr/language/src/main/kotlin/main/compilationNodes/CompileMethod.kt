package main.compilationNodes

import com.oracle.truffle.api.CallTarget
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.frame.FrameDescriptor
import main.Clr
import main.bytecode.CilCompiler
import metadata.IlMethod
import nodes.internal.InternalMethod
import runtime.Method
import runtime.Type

/** Installation is eager; parsing each method's bytecode is deferred until its first call. */
class CompileMethod(val method: IlMethod, val initialize: Initialize,
                    val language: TruffleLanguage<*>, val type: Type) {
    private fun compile(): CallTarget = if (method.internal) {
        InternalMethod(checkNotNull(initialize.internalMethods[method.toString()]),
            FrameDescriptor.newBuilder().build(), language).callTarget
    } else {
        CilCompiler(method, language as Clr, initialize.context).compile().callTarget
    }

    fun install() {
        (type.members.getValue(method.key()) as Method).setCompiler(::compile)
    }
}
