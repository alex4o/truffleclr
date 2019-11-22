package parser.generic

import guru.nidi.graphviz.attribute.Color
import guru.nidi.graphviz.attribute.Label
import guru.nidi.graphviz.attribute.Shape
import guru.nidi.graphviz.engine.Format
import guru.nidi.graphviz.engine.Graphviz
import guru.nidi.graphviz.model.Factory.mutGraph
import guru.nidi.graphviz.model.Factory.mutNode
import guru.nidi.graphviz.model.MutableNode
import main.getNodes
import parser.generic.instruction.InstructionBrTarget
import java.io.File
import java.util.*
import kotlin.collections.LinkedHashMap

class Graph(var root: String, var nodes: LinkedHashMap<String, InstructionBlock>, var method: Method) {

    fun visualise() {
        val nodes = nodes.map { Pair(it.key, mutNode(it.key)) }.toMap()
        val visited = mutableMapOf<String, MutableNode>()
        val stack = Stack<Pair<String, MutableNode>>()
        stack.push(Pair(root, nodes.getValue(root)))
        var prev = Pair<String, MutableNode>("", mutNode(""))
        while (stack.isNotEmpty()) {

            val (target, node) = stack.pop()
            val block = this.nodes[target]!!

            if (visited.contains(target)) {
                val visitedNode = visited.getValue(target)
                println(target)
//                var p = path(target);
//                p.forEach { nodes[it]!!.attrs().add(Color.PINK) }
//                println(Pair(target, p))
                if(dominators(prev.first).contains(target)) {
                    visitedNode.attrs().add(Color.GREEN)
                    block.loopHeader = true
                }


//                prev.second.attrs().add(Color.BLUE)
                continue
            }

            prev = Pair(target, node)

            val nodesText = this.getNodes(target).toString()
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace(">=", "&gt;=")
                .replace("=<", "=&lt;")
                .replace("\n", "<br align='left'/>")
            node.attrs().add(
                Label.html("<b>$target</b><br/>${nodesText}").justify(
                    Label.Justification.LEFT
                )
            )

            node.attrs().add(Shape.RECTANGLE)
            visited.put(target, node)
            if (block.targets.size > 0) {
                block.targets.forEach {
                    val nextNode = nodes.getValue(it)
                    node.addLink(nextNode)
                    if (it != target) {
                        stack.push(Pair(it, nextNode))
                    }
                }
            }
        }

        val g = mutGraph("example1").setDirected(true)
        nodes.values.forEach { g.add(it) }
        // Basic block
        Graphviz.fromGraph(g).render(Format.XDOT).toFile(File("demo.xdot"))
    }


    val dominators by lazy {
        val lt = LengauerTarjan(this)
        lt.compute()
        lt
    }

    fun dominators(node: String): Set<String> {
        if(node == root) {
            return setOf(root)
        }
        return dominators.tree.filter { it.value.contains(node) }.map { setOf(it.key) + dominators(it.key) }.reduce { acc, current -> acc + current }
    }

}

class LengauerTarjan(val graph: Graph) {
    var tree = mutableMapOf<String, MutableSet<String>>()

    val bucket = mutableMapOf<InstructionBlock, MutableSet<InstructionBlock>>()
    val dfnum = mutableMapOf<InstructionBlock, Int>()
    val semi = mutableMapOf<InstructionBlock, InstructionBlock?>()
    val ancestor = mutableMapOf<InstructionBlock, InstructionBlock?>()
    val idom = mutableMapOf<InstructionBlock, InstructionBlock?>()
    val samedom = mutableMapOf<InstructionBlock, InstructionBlock?>()
    val best = mutableMapOf<InstructionBlock, InstructionBlock?>()
    val parent = mutableMapOf<InstructionBlock, InstructionBlock?>()
    val vertex = mutableMapOf<Int, InstructionBlock>()

    var N = 0

    var visited = mutableSetOf<InstructionBlock>()
    fun dfs(p: InstructionBlock?, n: InstructionBlock) {
        if (dfnum[n] == 0) {
            visited.add(n)
            dfnum[n] = N
            vertex[N] = n
            parent[n] = p
            N = N + 1
            for (w in n.targets.map { graph.nodes.getValue(it) }) {
                if (visited.contains(w)) {
                    continue
                }
                dfs(n, w)
            }
        }
    }

    fun ancestorWithLowestSemi(v: InstructionBlock): InstructionBlock? {
        val a = ancestor[v]!!
        if (ancestor[a] != null) {
            val b = ancestorWithLowestSemi(a)
            ancestor[v] = ancestor[a]
            if (dfnum[semi[b]]!! < dfnum[semi[best[v]]]!!) {
                best[v] = b
            }
        }
        return best[v]
    }

    fun link(p: InstructionBlock, n: InstructionBlock) {
        ancestor[n] = p
        best[n] = n
    }

    fun compute() {
        for (block in graph.nodes.values) {
            bucket[block] = mutableSetOf()
            dfnum[block] = 0
            semi[block] = null
            ancestor[block] = null
            idom[block] = null
            samedom[block] = null
        }

        dfs(null, graph.nodes.getValue(graph.root))
        for (i in N - 1 downTo 1) {
            val n = vertex[i]!!
            val p = parent[n]!!
            var s = p

            var ts: InstructionBlock? = null
            for (v in graph.nodes.values.filter { it.targets.contains(n.name) }) {
                if (dfnum[v]!! <= dfnum[n]!!) {
                    ts = v
                } else {
                    ts = semi[ancestorWithLowestSemi(v)]
                }
                if (dfnum[ts]!! <= dfnum[s]!!) {
                    s = ts!!
                }
            }
            semi[n] = s
            bucket[s]!!.add(n)
            link(p, n)
            for (v in bucket[p]!!) {
                val y = ancestorWithLowestSemi(v)
                if (semi[y] == semi[v]) {
                    idom[v] = p
                } else {
                    samedom[v] = y
                }
            }
            bucket[p] = mutableSetOf()
        }
        for (i in 1 until N - 1) {
            val n = vertex[i]
            if (samedom[n] != null) {
                idom[n!!] = idom[samedom[n]]
            }
        }

        for ((key, value) in idom) {
            tree.put(key.name, mutableSetOf())
        }

        for ((key, value) in idom) {
            if (value != null) {
                tree[value.name]!!.add(key.name)
            }
        }
    }


    fun visualise() {
        val nodes = tree.keys.map { Pair(it, mutNode(it)) }.toMap()
        val visited = mutableMapOf<String, MutableNode>()
        val stack = Stack<Pair<String, MutableNode>>()
        stack.push(Pair(graph.root, nodes.getValue(graph.root)))
        var prev = Pair<String, MutableNode>("", mutNode(""))
        while (stack.isNotEmpty()) {

            val (target, node) = stack.pop()

            if (visited.contains(target)) {
                continue
            }

            prev = Pair(target, node)

            node.attrs().add(Shape.RECTANGLE)
            visited.put(target, node)
            if (tree.getValue(target).size > 0) {
                tree.getValue(target).forEach {
                    val nextNode = nodes.getValue(it)
                    node.addLink(nextNode)
                    if (it != target) {
                        stack.push(Pair(it, nextNode))
                    }
                }
            }
        }

        val g = mutGraph("dom").setDirected(true)
        nodes.values.forEach { g.add(it) }
        // Basic block
        Graphviz.fromGraph(g).render(Format.XDOT).toFile(File("domination.xdot"))
    }

}
