package main

import Cil.CilLexer
import Cil.CilParser
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.frame.FrameDescriptor
import com.sun.jmx.remote.internal.ArrayQueue
import guru.nidi.graphviz.attribute.Color
import guru.nidi.graphviz.attribute.Label
import guru.nidi.graphviz.attribute.Shape
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
import nodes.Method
import parser.generic.Block
import parser.generic.instruction.Instruction
import parser.generic.instruction.InstructionBrTarget
import parser.generic.instruction.InstructionMethod
import kotlin.collections.HashMap
import kotlin.collections.LinkedHashMap

fun fromTreeToGraph(tree: Pair<String, LinkedHashMap<String, Block>>) {
    val nodes = tree.second.map { Pair(it.key, mutNode(it.key)) }.toMap()
    val visited = mutableMapOf<String, MutableNode>()
//    val stack = Stack<Pair<>>


    fun graphNodes(target: String, node: MutableNode): List<MutableNode> {
        if(visited.contains(target)) {
            val visitedNode = visited.getValue(target)
            visitedNode.attrs().add(Color.GREEN)
            return listOf(visitedNode)
        }

        val block = tree.second[target]!!
        node.attrs().add(Label.html("<b>$target</b><br/>${block.instructions.joinToString("<br align='left'/>", postfix = "<br align='left'/>")}").justify(Label.Justification.LEFT))
        node.attrs().add(Shape.RECTANGLE)
        visited.put(target, node)
        return if(block.targets.size > 0) {
            block.targets.flatMap {
                val nextNode = nodes.getValue(it)

                node.addLink(nextNode)
                listOf(node) + if(it != target){ graphNodes(it, nextNode) } else { listOf() }
            }
        }else{
            listOf(node)
        }
    }

    val g = mutGraph("example1").setDirected(true)
    graphNodes(tree.first, nodes.getValue(tree.first)).forEach { g.add(it) }
    // Basic block
    Graphviz.fromGraph(g).render(Format.XDOT).toFile(File("demo.xdot"))
}

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

    var reader = FileReader("./test/loop2.il");

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

    println(appDomain.entryPoint.locals)

    fromTreeToGraph(code)

    // use the opcode table to generate the if table then fill it manually by hand with the nodes.

    val startBlock = BlockToNodes.getNodes(code.second.values.first(), appDomain.entryPoint, code.second)

    println(startBlock)
        // the dup instruction just creates a local variable nambed dub{N} and stores stuff inside


//
    val frameDescriptor = FrameDescriptor()

    val target = Truffle.getRuntime().createCallTarget(Method(startBlock, frameDescriptor))
    target.call()
}






