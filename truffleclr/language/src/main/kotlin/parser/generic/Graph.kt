package parser.generic

import com.oracle.truffle.api.TruffleLanguage
import guru.nidi.graphviz.attribute.Color
import guru.nidi.graphviz.attribute.Label
import guru.nidi.graphviz.attribute.Shape
import guru.nidi.graphviz.engine.Format
import guru.nidi.graphviz.engine.Graphviz
import guru.nidi.graphviz.model.Factory.mutGraph
import guru.nidi.graphviz.model.Factory.mutNode
import guru.nidi.graphviz.model.MutableNode
import main.compilationNodes.CompileMethod
import main.getNodes
import java.io.File
import java.util.*

class Graph(var nodes: List<InstructionBlock>, var compileNode: CompileMethod) {
    var root = 0

    fun visualise(language: TruffleLanguage<*>) {
        val nodes = compileNode.compiled.map { (index, node)  -> Pair(index, mutNode(node.name)) }.toMap()
        val visited = mutableMapOf<Int, MutableNode>()
        val stack = Stack<Pair<Int, MutableNode>>()
        stack.push(Pair(0, nodes.getValue(0)))
        var prev = Pair<Int, MutableNode>(0, mutNode(""))
        while (stack.isNotEmpty()) {

            var (target, node) = stack.pop()
            val block = compileNode.compiled[target]!!

            if (visited.contains(target)) {
                val visitedNode = visited.getValue(target)
                println(target)
//                var p = path(target);
//                p.forEach { nodes[it]!!.attrs().add(Color.PINK) }
//                println(Pair(target, p))
                if(dominators( compileNode.compiled[prev.first]!!.name ).contains( compileNode.compiled[target]!!.name ) ) {
                    visitedNode.attrs().add(Color.GREEN)
//                    block.loopHeader = true
                }
//                prev.second.attrs().add(Color.BLUE)
                continue
            }

            visited.put(target, node)

//            if(this.nodes[target]!!.stolen == 1) {
////                node = prev.second
//            }else {

                val nodesText = this.getNodes(target, language!!).toString()
                    .replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace(">=", "&gt;=")
                    .replace("=<", "=&lt;")
                    .replace("\n", "<br align='left'/>")

//            val nodesText = this.nodes[target]!!.instructions.joinToString("<br align='left'/>")
                node.attrs().add(
                    Label.html("<b>$target: ${this.nodes[target]!!.label}</b><br/>${nodesText}").justify(
                        Label.Justification.LEFT
                    )
                )

                node.attrs().add(Shape.RECTANGLE)

//            }

            if (block.controlFlowNode.successors.isNotEmpty()) {
                block.controlFlowNode.successors.forEach {
                    val nextNode = nodes.getValue(it)
//                    if(this.nodes[target]!!.stolen != 1) {
//                        if (this.nodes[it]!!.stolen != 1) {
                    node.addLink(nextNode)
//                        } else {
//                            this.nodes[it]!!.targets.map { nodes.getValue(it) }.forEach {
//                                node.addLink(it)
//                            }
//                        }
//                    }
                    if (it != target) {
                        stack.push(Pair(it, nextNode))
                    }
                }
            }
            prev = Pair(target, node)
        }

        val g = mutGraph(compileNode.method.name).setDirected(true)
        nodes.values.forEach { g.add(it) }
        // Basic block


        Graphviz.fromGraph(g).render(Format.XDOT).toFile(File("${compileNode.method}.xdot"))
    }


    val dominators by lazy {
        val lt = LengauerTarjan(this)
        lt.compute()
        lt
    }

    fun dominators(node: String): Set<String> {
        if(node == nodes[root].label) {
            return setOf(nodes[root].label)
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
            for (w in n.targets.map { graph.nodes[it] }) {
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
        for (block in graph.nodes) {
            bucket[block] = mutableSetOf()
            dfnum[block] = 0
            semi[block] = null
            ancestor[block] = null
            idom[block] = null
            samedom[block] = null
        }

        dfs(null, graph.nodes[0 /* 0 == root */])
        for (i in N - 1 downTo 1) {
            val n = vertex[i]!!
            val p = parent[n]!!
            var s = p

            var ts: InstructionBlock? = null
            for (v in graph.nodes.filter { it.targets.contains(n.index) }) {
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
            tree.put(key.label, mutableSetOf())
        }

        for ((key, value) in idom) {
            if (value != null) {
                tree[value.label]!!.add(key.label)
            }
        }
    }


    fun visualise() {
        val nodes = tree.keys.map { Pair(it, mutNode(it)) }.toMap()
        val visited = mutableMapOf<Int, MutableNode>()
        val stack = Stack<Pair<Int, MutableNode>>()
        stack.push(Pair(0, nodes.getValue(graph.nodes[graph.root].label)))
        var prev = Pair<Int, MutableNode>(0, mutNode(""))
        while (stack.isNotEmpty()) {

            val (target, node) = stack.pop()

            if (visited.contains(target)) {
                continue
            }

            prev = Pair(target, node)

            node.attrs().add(Shape.RECTANGLE)
            visited.put(target, node)
            val targetLabel = graph.nodes[target].label
            if (tree.getValue(targetLabel).size > 0) {
                tree.getValue(targetLabel).forEach {
                    val nextNode = nodes.getValue(it)
                    node.addLink(nextNode)
                    if (it != targetLabel) {
                        stack.push(Pair(graph.compileNode.method.blockByLabel[it]!!.index, nextNode))
                    }
                }
            }
        }

        val g = mutGraph("dom").setDirected(true)
        nodes.values.forEach { g.add(it) }
        // Basic block
        Graphviz.fromGraph(g).render(Format.XDOT).toFile(File("${graph.compileNode.method.name}_domination.xdot"))
    }

}
