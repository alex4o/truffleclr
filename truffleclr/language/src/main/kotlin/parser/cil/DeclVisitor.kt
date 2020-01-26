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

    companion object {
        val decl_children: Queue<Pair<CilBaseVisitor<*>, ParserRuleContext>> = LinkedList()

        fun layerVisit() {
            for((visitor, tree) in decl_children) {
                tree.accept(visitor)
            }
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

    override fun visitClass(ctx: CilParser.ClassContext) {
        val name = if(namespaces.isNotEmpty()) { "${namespaces.peek()}." } else { "" } + ctx.classHead().classHeadBegin().dottedName().text
        val type = IlType(name)

        type.attribtes = ctx.classHead().classHeadBegin().classAttr().map { it.text }.toSet()

        assembly.types.put(name, type)
        decl_children.add(Pair(ClassVisitor(appDomain, type), ctx.classDecls()))
    }

    override fun visitMethod(ctx: CilParser.MethodContext) {
        TODO("Implement methods outside of classes")
    }

}