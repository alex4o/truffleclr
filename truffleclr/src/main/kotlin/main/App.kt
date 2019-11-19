package main

import Cil.CilLexer
import Cil.CilParser
import com.oracle.truffle.api.Truffle
import guru.nidi.graphviz.attribute.Color
import guru.nidi.graphviz.engine.Format
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import parser.cil.DeclVisitor
import parser.generic.AppDomain
import java.io.FileReader
import java.util.*
import java.io.File
import guru.nidi.graphviz.engine.Graphviz
import guru.nidi.graphviz.model.Factory.mutGraph
import guru.nidi.graphviz.model.Factory.mutNode
import guru.nidi.graphviz.model.MutableGraph
import guru.nidi.graphviz.model.MutableNode
import parser.generic.Block
import kotlin.collections.LinkedHashMap



fun fromTreeToGraph(tree: Pair<String, LinkedHashMap<String, Block>>) {
    fun graphNodes(target: String, node: MutableNode): List<MutableNode> {
        val block = tree.second[target]!!
        return if(block.targets.size > 0) {
            block.targets.flatMap {
                val nextNode = mutNode(it)
                node.addLink(nextNode)
                listOf(node) + graphNodes(it, nextNode)
            }
        }else{
            listOf(node)
        }
    }


    val nodes= mutNode("a").add(Color.RED).addLink(mutNode("b"))

    val g = mutGraph("example1").setDirected(true)
    graphNodes(tree.first, mutNode(tree.first)).forEach { g.add(it) }

    Graphviz.fromGraph(g).render(Format.XDOT).toFile(File("demo.xdot"))
    "xdot demo.xdot".runCommand()
}

fun String.runCommand() {
    ProcessBuilder(*split(" ").toTypedArray())
        .directory(File("."))
        .start()
}

fun main() {

    var appDomain = AppDomain()

    var reader = FileReader("./test/cond.il");

    var stream = CharStreams.fromReader(reader, "useless");
    var lexer = CilLexer(stream)

    val tstream = CommonTokenStream(lexer);

    var parser = CilParser(tstream)
    var tree = parser.decls()
    var rootVisitor = DeclVisitor(appDomain)
    for(decl in tree.children) {
        decl.accept(rootVisitor)
    }

    var stack = Stack<Long>();
    var locals = Array<Long>(2) { 0 };


    val code = appDomain.entryPoint.tree

    fromTreeToGraph(code)



//
//    var target = Truffle.getRuntime().createCallTarget()
//    target.call()

    println(rootVisitor)
}






