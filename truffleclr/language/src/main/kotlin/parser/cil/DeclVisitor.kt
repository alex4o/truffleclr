package parser.cil

import Cil.CilBaseVisitor
import Cil.CilParser
import metadata.IlAppDomain
import metadata.IlAssembly
import metadata.IlModule
import metadata.IlType
import runtime.CoreTypeInfo
import runtime.CorElementType

/** Register every declaration before resolving signatures, including nested types. */
@kotlin.ExperimentalUnsignedTypes
class DeclVisitor(val appDomain: IlAppDomain) : CilBaseVisitor<Unit>() {
    lateinit var assembly: IlAssembly
    private val namespaces = mutableListOf<String>()
    private val classes = mutableListOf<Triple<IlType, CilParser.ClassHeadContext, CilParser.ClassDeclsContext>>()

    override fun visitAssembly(ctx: CilParser.AssemblyContext) {
        assembly = IlAssembly(ctx.assemblyHead().dottedName().text)
        appDomain.assemblies.add(assembly)
    }

    override fun visitModule(ctx: CilParser.ModuleContext) {
        assembly.modules.add(IlModule(ctx.moduleHead().dottedName().text))
    }

    override fun visitNamespace(ctx: CilParser.NamespaceContext) {
        namespaces.add(ctx.nameSpaceHead().dottedName().text)
        visit(ctx.decls())
        namespaces.removeAt(namespaces.lastIndex)
    }

    override fun visitClass(ctx: CilParser.ClassContext) {
        declare(ctx.classHead(), ctx.classDecls(), namespaces.joinToString(".").let { if (it.isEmpty()) "" else "$it." })
    }

    private fun declare(head: CilParser.ClassHeadContext, body: CilParser.ClassDeclsContext, prefix: String) {
        val name = prefix + head.classHeadBegin().dottedName().text.trim('\'')
        val type = IlType(name, CoreTypeInfo.typeByName[name]?.type ?: CorElementType.OBJECT)
        type.attribtes = head.classHeadBegin().classAttr().map { it.text }.toSet()
        type.isInterface = "interface" in type.attribtes
        type.genericParameters = head.classHeadBegin().typarsClause().parameterNames()
        type.isGeneric = type.genericParameters.isNotEmpty()
        check(assembly.types.put(name, type) == null) { "Duplicate type $name" }
        classes.add(Triple(type, head, body))
        for (child in body.classDecl().filterIsInstance<CilParser.Class_classContext>()) {
            declare(child.classHead(), child.classDecls(), "$name/")
        }
    }

    fun layerVisit() {
        for ((type, head, _) in classes) {
            val base = head.extendsClause().typeSpec()?.toClassName()
                ?: if (type.name != "System.Object") "System.Object" else null
            type.extends = base?.let { appDomain.getType(it.normalizeParameters(type.genericParameters)) }
            fun interfaces(list: CilParser.ImplListContext?): List<IlType> = if (list == null) emptyList() else
                interfaces(list.implList()) + appDomain.getType(list.typeSpec().toClassName().normalizeParameters(type.genericParameters))
            type.interfaces = interfaces(head.implClause().implList())
        }
        for ((type, _, body) in classes) body.accept(ClassVisitor(appDomain, type))
    }

    override fun visitMethod(ctx: CilParser.MethodContext) {
        error("Methods outside classes are unsupported")
    }
}
