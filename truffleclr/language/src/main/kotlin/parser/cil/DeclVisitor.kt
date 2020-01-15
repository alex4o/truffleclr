package parser.cil

import Cil.CilParser
import org.antlr.v4.runtime.tree.ParseTree
import parser.generic.AppDomain
import parser.generic.Assembly
import parser.generic.Module
import parser.generic.Type


class DeclVisitor(var appDomain: AppDomain, var namespace: String = "global") : Cil.CilBaseVisitor<Any>() {
    companion object {
        lateinit var module: Module
        lateinit var assembly: Assembly
    }

    override fun visitAssembly(ctx: CilParser.AssemblyContext): Any {
        val assembly = ctx.assemblyHead().dottedName().text
        DeclVisitor.assembly = Assembly(assembly)
        appDomain.assemblies.add(DeclVisitor.assembly)
        return assembly
    }

    override fun visitModule(ctx: CilParser.ModuleContext): Any {
        val module = ctx.moduleHead().dottedName().text
        DeclVisitor.module = Module(module)
        assembly.modules.add(DeclVisitor.module)
        return module
    }

    override fun visitNamespace(ctx: CilParser.NamespaceContext): Any {

        for(decl in ctx.decls().decl()){
            (decl as ParseTree).accept(DeclVisitor(appDomain, ctx.nameSpaceHead().dottedName.text))
        }

        return 0
    }

    override fun visitClass(ctx: CilParser.ClassContext): Any {
        val name = ctx.classHead().classHeadBegin().dottedName().text
        val type = Type(name)
        type.attribtes = ctx.classHead().classHeadBegin().classAttr().map {it.text }.toSet()
        type.namespace = namespace

        module.types.put(name, type)
        return (ctx.classDecls() as ParseTree).accept(ClassVisitor(appDomain, namespace, type))
    }

    override fun visitMethod(ctx: CilParser.MethodContext): Any {
        TODO("Implement methods outside of classes")
    }

}