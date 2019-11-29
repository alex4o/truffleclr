package main

import Cil.CilLexer
import Cil.CilParser
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.frame.FrameDescriptor
import nodes.DispatchNode
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

    val code = appDomain.entryPoint.graph

    println(appDomain.entryPoint.locals)

    code.visualise()
    code.dominators.visualise()

    var dispatchNode = DispatchNode( code.nodes.map { code.getNodes(it.index) }.toTypedArray() )


    println(dispatchNode)
    // the dup instruction just creates a local variable nambed dup{N} and stores stuff inside


    val target = Truffle.getRuntime().createCallTarget(Method(dispatchNode, code.method.frameDescriptor))
    target.call()
}

/*
TODO: List
- Check if my symbolic evaluation is correct
- Use block interpretation withc MERGE_EXPLODE as in LLVM
- Compare CFG results with the ones obtained from ILSpy to verify my outputs
- Implement method calling of static method as this would be strightforward
- Implement support for structs in the begining all the structs are going to be on the heap and after I find a way to put them on the stack that is going to change. TruffleObjects will be used.
- Implement arrays same as prev.
- Implement objects and real methods.


- Check the control flow optimizations that ILSpy uses to detect loops
- Read about either the Relooper or the Stackifier algorithms so loops can be produced withouth gotos
- Reimplement parts of mscorelib or whaterver it is called in netcore   

*/