package main

import Cil.CilLexer
import Cil.CilParser
import com.oracle.truffle.api.CallTarget
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.debug.DebuggerTags
import com.oracle.truffle.api.instrumentation.ProvidedTags
import com.oracle.truffle.api.instrumentation.StandardTags
import nodes.Method
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import parser.cil.DeclVisitor
import parser.generic.AppDomain
import java.io.FileReader

@TruffleLanguage.Registration(
    id = "trufflecrl",
    name = "clr",
    defaultMimeType = "application/il",
    characterMimeTypes = ["application/il"],
    contextPolicy = TruffleLanguage.ContextPolicy.SHARED,
    fileTypeDetectors = [ IlFileDetector::class ]
)
@ProvidedTags(
    StandardTags.CallTag::class,
    StandardTags.StatementTag::class,
    StandardTags.RootTag::class,
    StandardTags.RootBodyTag::class,
    StandardTags.ExpressionTag::class,
    DebuggerTags.AlwaysHalt::class
)
class Language: TruffleLanguage<AppDomain>()  {
    override fun createContext(env: Env?): AppDomain {
        return AppDomain()
    }

    override fun isObjectOfLanguage(`object`: Any?): Boolean {
        return false; // We don's support objects yet.
    }

    override fun parse(request: ParsingRequest): CallTarget {
        val lexer = CilLexer(CharStreams.fromReader(request.source.reader))
        val tokenStream = CommonTokenStream(lexer);


        val appDomain = this.contextReference.get();

        val parser = CilParser(tokenStream)
        val tree = parser.decls()
        val rootVisitor = DeclVisitor(appDomain)
        for (decl in tree.children) {
            decl.accept(rootVisitor)
        }

        val code = appDomain.entryPoint.graph

        val startBlock = code.getNodes(code.root)

        return Truffle.getRuntime().createCallTarget(Method(startBlock, code.method.frameDescriptor))
    }

}