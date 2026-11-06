package main

import Cil.CilLexer
import Cil.CilParser
import com.oracle.truffle.api.CallTarget
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.debug.DebuggerTags
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.instrumentation.ProvidedTags
import com.oracle.truffle.api.instrumentation.StandardTags
import main.compilationNodes.Initialize
import metadata.*
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import parser.cil.ClassVisitor
import parser.cil.DeclVisitor
import runtime.ClrContext


@kotlin.ExperimentalUnsignedTypes
@TruffleLanguage.Registration(
    id = "clr",
    name = "clr",
    defaultMimeType = "application/il",
    characterMimeTypes = ["application/il"],
    contextPolicy = TruffleLanguage.ContextPolicy.SHARED,
    fileTypeDetectors = [ClrIlFileDetector::class]
)
@ProvidedTags(
    StandardTags.CallTag::class,
    StandardTags.StatementTag::class,
    StandardTags.RootTag::class,
    StandardTags.RootBodyTag::class,
    StandardTags.ExpressionTag::class,
    DebuggerTags.AlwaysHalt::class
)
class Clr : TruffleLanguage<ClrContext>() {
    companion object {
        @JvmField
        val contextReference: ContextReference<ClrContext> = ContextReference.create(Clr::class.java)
    }

    // TODO: Remove without breaking debug
    // it is a bad idea to store the context globally
    lateinit var tmp: ClrContext

    override fun createContext(env: Env): ClrContext {
        val context = ClrContext()
        context.env = env
        return context
    }


    /**
     * Helper method used to parse a file.
     * It first visits all the root nodes.
     * Then after all the classes are collected they are visited.
     */
    fun parseFile(appDomain: IlAppDomain, stream: CharStream) {
        val lexer = CilLexer(stream)
        val tokenStream = CommonTokenStream(lexer);

        val parser = CilParser(tokenStream)
        val tree = parser.decls()
        val rootVisitor = DeclVisitor(appDomain)
        for (decl in tree.children) {
            decl.accept(rootVisitor)
        }

        rootVisitor.layerVisit()
        ClassVisitor.layerVisit()
    }

    /**
     * This is the method called when `Context.eval` is used.
     * It first parses the runtime and then parses the user provided source file.
     * In the end it uses Truffle nodes to transform all the methods and classes.
     */
    override fun parse(request: ParsingRequest): CallTarget {

        val appDomain = IlAppDomain()

        val coreLibrary = checkNotNull(Clr::class.java.getResourceAsStream("/System.Private.CoreLib.il")) {
            "Missing classpath resource: /System.Private.CoreLib.il"
        }
        coreLibrary.use {
            parseFile(appDomain, CharStreams.fromStream(it))
        }



        parseFile(appDomain, CharStreams.fromReader(request.source.reader))
        val context = contextReference.get(null)
        tmp = context

        val frameDescriptor = FrameDescriptor.newBuilder().build()
        return Initialize(appDomain, context, frameDescriptor, this).callTarget
    }

    /** Returns the global scope exposed by `Context.getBindings`. */
    override fun getScope(context: ClrContext): Any = context
}