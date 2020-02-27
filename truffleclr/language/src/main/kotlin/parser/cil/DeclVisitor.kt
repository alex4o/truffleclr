package parser.cil

import Cil.CilBaseVisitor
import Cil.CilParser
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTree
import metadata.IlAppDomain
import metadata.IlAssembly
import metadata.IlModule
import metadata.IlType
import runtime.CoreTypeInfo
import java.util.*

@kotlin.ExperimentalUnsignedTypes
class DeclVisitor(var appDomain: IlAppDomain) : Cil.CilBaseVisitor<Unit>() {
    lateinit var module: IlModule
    lateinit var assembly: IlAssembly
    private val namespaces = Stack<String>()


    val lateClasses: Queue<CilParser.ClassContext> = LinkedList()

    val decl_children: Queue<Pair<ClassVisitor, ParserRuleContext>> = LinkedList()

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
        namespaces.push(ctx.nameSpaceHead().dottedName().text)
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

        val corType = if(CoreTypeInfo.typeByName.containsKey(name)) {
            CoreTypeInfo.typeByName.getValue(name).type
        }else{
            extendsType!!.type
        }
        val type = IlType(name, corType)

        type.extends = extendsType
        type.attribtes = head.classHeadBegin().classAttr().map { it.text }.toSet()


        assembly.types.put(name, type)
        decl_children.add(Pair(ClassVisitor(appDomain, type), ctx.classDecls()))
        this.visit(ctx.classDecls())
    }

    override fun visitClass_class(ctx: CilParser.Class_classContext) {
        var head = ctx.classHead()
        val name = decl_children.last().first.type.name + "/" + head.classHeadBegin().dottedName().text

        val extends: String? = head.extendsClause().typeSpec()?.toClassName()

        val extendsType = if (extends == null) {
            null
        } else if (assembly.types.contains(extends)) {
            assembly.types.getValue(extends)
        } else if (appDomain.assemblies.map { it.types }.any { it.contains(extends) }) { // Very bad code but I don't have a global table of types
            appDomain.assemblies.map { it.types }.first { it.contains(extends) }.getValue(extends)
        } else {
            // TODO: add to the queue too
            error("Internal classes can't inherit from non initialized classes")
        }

        val corType = extendsType!!.type

        val type = IlType(name, corType)

        type.extends = extendsType
        type.attribtes = head.classHeadBegin().classAttr().map { it.text }.toSet()

        assembly.types.put(name, type)
        decl_children.add(Pair(ClassVisitor(appDomain, type), ctx.classDecls()))
    }


    override fun visitMethod(ctx: CilParser.MethodContext) {
        TODO("Implement methods outside of classes")
    }

}