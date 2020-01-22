package main

import Cil.CilLexer
import Cil.CilParser
import com.oracle.truffle.api.*
import com.oracle.truffle.api.debug.DebuggerTags
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.instrumentation.ProvidedTags
import com.oracle.truffle.api.instrumentation.StandardTags
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.library.LibraryFactory
import main.compilationNodes.*
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import parser.cil.DeclVisitor
import parser.generic.IlAppDomain
import runtime.Methods
import java.io.File

@TruffleLanguage.Registration(
    id = "trufflecrl",
    name = "clr",
    defaultMimeType = "application/il",
    characterMimeTypes = ["application/il"],
    contextPolicy = TruffleLanguage.ContextPolicy.SHARED,
    fileTypeDetectors = [IlFileDetector::class]
)
@ProvidedTags(
    StandardTags.CallTag::class,
    StandardTags.StatementTag::class,
    StandardTags.RootTag::class,
    StandardTags.RootBodyTag::class,
    StandardTags.ExpressionTag::class,
    DebuggerTags.AlwaysHalt::class
)
class Clr : TruffleLanguage<IlAppDomain>() {

    override fun createContext(env: Env?): IlAppDomain {
        return IlAppDomain()
    }

    override fun isObjectOfLanguage(`object`: Any?): Boolean {
        return false; // We don's support objects yet.
    }

    fun parseFile(appDomain: IlAppDomain, stream: CharStream) {
        val lexer = CilLexer(stream)
        val tokenStream = CommonTokenStream(lexer);


        val parser = CilParser(tokenStream)
        val tree = parser.decls()
        val rootVisitor = DeclVisitor(appDomain)
        for (decl in tree.children) {
            decl.accept(rootVisitor)
        }
    }

    var methods = Methods()
    override fun parse(request: ParsingRequest): CallTarget {
        val appDomain = IlAppDomain()

        parseFile(
            appDomain, CharStreams.fromPath(
                File("./language/src/main/resources/System.Private.CoreLib.il").toPath()
            )
        )


        parseFile(appDomain, CharStreams.fromReader(request.source.reader))


        LibraryFactory.resolve(InteropLibrary::class.java)

        val frameDescriptor = FrameDescriptor()
        return Truffle.getRuntime().createCallTarget(
            Initialize(appDomain, methods, frameDescriptor, this)
        )
    }


    override fun findTopScopes(context: IlAppDomain?): MutableIterable<Scope> {
        return mutableListOf(Scope.newBuilder("HelloWorld", methods).build())
    }

}