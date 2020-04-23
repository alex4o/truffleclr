package main

import Cil.CilLexer
import Cil.CilParser
import com.oracle.truffle.api.CallTarget
import com.oracle.truffle.api.Scope
import com.oracle.truffle.api.Truffle
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
import java.io.File
import kotlin.collections.MutableIterable


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
    // TODO: Remove without breaking debug
    // it is a bad idea to store the context globally
    lateinit var tmp: ClrContext

    override fun createContext(env: Env): ClrContext {
        val context = ClrContext()
        context.env = env
        return context
    }

    override fun isObjectOfLanguage(`object`: Any?): Boolean {
        return false; // We don's support objects yet.
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

        parseFile(
            appDomain, CharStreams.fromPath(
                File("./language/src/main/resources/System.Private.CoreLib.il").toPath()
            )
        )



        parseFile(appDomain, CharStreams.fromReader(request.source.reader))
        val context = getCurrentContext(Clr::class.java)
        tmp = context

        val frameDescriptor = FrameDescriptor()
        return Truffle.getRuntime().createCallTarget(
            Initialize(appDomain, context, frameDescriptor, this)
        )
    }

    /**
     * Returns the scopes that are obtained through `context.getBindings`
     */
    override fun findTopScopes(context: ClrContext): MutableIterable<Scope> {
        return context.scopes
    }
}