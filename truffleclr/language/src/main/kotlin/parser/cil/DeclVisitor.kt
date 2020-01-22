package parser.cil

import Cil.CilParser
import org.antlr.v4.runtime.tree.ParseTree
import parser.generic.IlAppDomain
import parser.generic.IlAssembly
import parser.generic.IlModule
import parser.generic.IlType
import java.util.*


class DeclVisitor(var appDomain: IlAppDomain) : Cil.CilBaseVisitor<Any>() {
    lateinit var module: IlModule
    lateinit var assembly: IlAssembly
    private val namespaces = Stack<String>()

    override fun visitAssembly(ctx: CilParser.AssemblyContext): Any {
        val assembly = ctx.assemblyHead().dottedName().text
        this.assembly = IlAssembly(assembly)
        appDomain.assemblies.add(this.assembly)
        return assembly
    }

    override fun visitModule(ctx: CilParser.ModuleContext): Any {
        val module = ctx.moduleHead().dottedName().text
        this.module = IlModule(module)
        assembly.modules.add(this.module)
        return module
    }

    override fun visitNamespace(ctx: CilParser.NamespaceContext): Any {
        namespaces.push(ctx.nameSpaceHead().dottedName.text)
        for (decl in ctx.decls().decl()) {
            (decl as ParseTree).accept(this)
        }
        return namespaces.pop()
    }

    override fun visitClass(ctx: CilParser.ClassContext): Any? {
        val name = if(namespaces.isNotEmpty()) { "${namespaces.peek()}." } else { "" } + ctx.classHead().classHeadBegin().dottedName().text
        val type = IlType(name)

        type.attribtes = ctx.classHead().classHeadBegin().classAttr().map { it.text }.toSet()

        assembly.types.put(name, type)
        return (ctx.classDecls() as ParseTree).accept(ClassVisitor(appDomain, type))
    }

    override fun visitMethod(ctx: CilParser.MethodContext): Any {
        TODO("Implement methods outside of classes")
    }

}