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
import parser.generic.Graph
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
class Clr: TruffleLanguage<AppDomain>()  {
    override fun createContext(env: Env?): AppDomain {
        return AppDomain()
    }

    override fun isObjectOfLanguage(`object`: Any?): Boolean {
        return false; // We don's support objects yet.
    }

    override fun parse(request: ParsingRequest): CallTarget {
        // TODO: Should fix that and use DI :D
        Graph.language = this

        val lexer = CilLexer(CharStreams.fromReader(request.source.reader))
        val tokenStream = CommonTokenStream(lexer);


        val appDomain = this.contextReference.get();

        val parser = CilParser(tokenStream)
        val tree = parser.decls()
        val rootVisitor = DeclVisitor(appDomain)
        for (decl in tree.children) {
            decl.accept(rootVisitor)
        }

        for(assembly in appDomain.assemblies) {
            val types = assembly.types
            println(types)
            for(type in types) {
                println(type.methods)
                type.methods.forEach {
                    it.value.compile()
                    it.value.graph.visualise()
                    it.value.graph.dominators.visualise()
                }

            }
        }

        return appDomain.entryPoint.callTarget(this)
    }


}