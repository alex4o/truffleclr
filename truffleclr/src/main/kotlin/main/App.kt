package main

import Cil.CilLexer
import Cil.CilParser
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.frame.FrameDescriptor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import parser.cil.DeclVisitor
import parser.generic.AppDomain
import java.io.FileReader
import java.util.*
import java.io.File
import nodes.Method
import parser.generic.LengauerTarjan

fun String.runCommand() {
    ProcessBuilder(*split(" ").toTypedArray())
        .directory(File("."))
        .start()
}

/*
 Evidance that some work is done, start with overview (what is the problem, why is it worth tackeling)
 Plan of things to do, priorities, and planned time estimates.

 Tell what does not work
*/

fun main() {

    var appDomain = AppDomain()

    var reader = FileReader("./test/do_while.il");

    var stream = CharStreams.fromReader(reader, "useless");
    var lexer = CilLexer(stream)

    val tstream = CommonTokenStream(lexer);

    var parser = CilParser(tstream)
    var tree = parser.decls()
    var rootVisitor = DeclVisitor(appDomain)
    for (decl in tree.children) {
        decl.accept(rootVisitor)
    }


    var stack = Stack<Long>();
    var locals = Array<Long>(2) { 0 };

    val code = appDomain.entryPoint.graph

    println(appDomain.entryPoint.locals)

    code.visualise()
    code.dominators.visualise()

    val startBlock = code.getNodes(code.root)


    println(startBlock)
    // the dup instruction just creates a local variable nambed dub{N} and stores stuff inside


    val target = Truffle.getRuntime().createCallTarget(Method(startBlock, code.method.frameDescriptor))
    target.call()
}






