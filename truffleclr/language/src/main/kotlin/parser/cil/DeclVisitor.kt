package parser.cil

import Cil.CilBaseVisitor
import Cil.CilParser
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTree
import parser.generic.IlAppDomain
import parser.generic.IlAssembly
import parser.generic.IlModule
import parser.generic.IlType
import java.util.*


class DeclVisitor(var appDomain: IlAppDomain) : Cil.CilBaseVisitor<Unit>() {
    lateinit var module: IlModule
    lateinit var assembly: IlAssembly
    private val namespaces = Stack<String>()


    val lateClasses: Queue<CilParser.ClassContext> = LinkedList()

    val decl_children: Queue<Pair<CilBaseVisitor<*>, ParserRuleContext>> = LinkedList()

    fun layerVisit() {
        while (lateClasses.isNotEmpty()) {
            transformClass(lateClasses.remove())
        }

        for ((visitor, tree) in decl_children) {
            tree.accept(visitor)
        }
    }


    override fun visitAssembly(ctx: CilParser.AssemblyContext) {
        val assembly = ctx.assemblyHead().dottedName().text
        this.assembly = IlAssembly(assembly)
        appDomain.assemblies.add(this.assembly)
    }

    override fun visitModule(ctx: CilParser.ModuleContext) {
        val module = ctx.moduleHead().dottedName().text
        this.module = IlModule(module)
        assembly.modules.add(this.module)
    }

    override fun visitNamespace(ctx: CilParser.NamespaceContext) {
        namespaces.push(ctx.nameSpaceHead().dottedName.text)
        for (decl in ctx.decls().decl()) {
            (decl as ParseTree).accept(this)
        }
        namespaces.pop()
    }

    override fun visitClass(ctx: CilParser.ClassContext) = transformClass(ctx)
    private fun transformClass(ctx: CilParser.ClassContext) {
        var head = ctx.classHead()
        val name = if (namespaces.isNotEmpty()) {
            "${namespaces.peek()}."
        } else {
            ""
        } + head.classHeadBegin().dottedName().text

        val extends: String? = head.extendsClause().typeSpec()?.toClassName()

        val extendsType = if (extends == null) {
            null
        } else if (assembly.types.contains(extends)) {
            assembly.types.getValue(extends)
        } else if (appDomain.assemblies.map { it.types }.any { it.contains(extends) }) { // Very bad code but I don't have a global table of types
            appDomain.assemblies.map { it.types }.first { it.contains(extends) }.getValue(extends)
        } else {
            lateClasses.add(ctx)
            return
        }

        val type = IlType(name)

        type.extends = extendsType
        type.attribtes = head.classHeadBegin().classAttr().map { it.text }.toSet()

        assembly.types.put(name, type)
        decl_children.add(Pair(ClassVisitor(appDomain, type), ctx.classDecls()))
    }

    override fun visitMethod(ctx: CilParser.MethodContext) {
        TODO("Implement methods outside of classes")
    }

}