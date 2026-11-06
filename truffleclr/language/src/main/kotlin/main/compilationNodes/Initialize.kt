package main.compilationNodes

import main.Clr
import main.bytecode.CilRootNodeGen
import com.oracle.truffle.api.bytecode.BytecodeConfig
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.staticobject.StaticShape
import nodes.internal.InternalTable
import metadata.IlAppDomain
import metadata.IlType
import runtime.*

class Initialize(appDomain: IlAppDomain, val context: ClrContext, val language: TruffleLanguage<*>) {
    private val compileChildren = mutableListOf<CompileMethod>()
    val internalMethods by lazy { InternalTable.staticMethods() }

    init {
        for (assembly in appDomain.assemblies) {
            assembly.types.values.forEach { processType(it) }
        }
    }

    /** Prepare bases first, even when the assembly declares a derived class first. */
    private fun processType(metadata: IlType): Type {
        context.types[metadata.fullName]?.let { return it }
        val base = metadata.extends?.let { processType(it) }
        val type = Type(metadata.fullName, base)
        context.types[metadata.fullName] = type
        val virtualTable = base?.virtualTable?.toMutableList() ?: mutableListOf()
        for (method in metadata.methods.values) {
            val member = Method(method)
            type.members[method.toString()] = member
            compileChildren.add(CompileMethod(method, this, language, type))
            if (method.name == ".cctor") type.initializer = member
            val index = virtualTable.indexOfFirst { it.metadata.toString(false) == method.toString(false) }
            if (index < 0) virtualTable.add(member) else virtualTable[index] = member
        }
        type.virtualTable = virtualTable.toTypedArray()
        base?.let { type.instanceFields.putAll(it.instanceFields) }
        val instances = StaticShape.newBuilder(language)
        val statics = StaticShape.newBuilder(language)
        for (metadataField in metadata.fields.values) {
            val field = Field(metadataField, type)
            type.members[metadataField.name] = field
            if (metadataField.static) {
                statics.property(field, field.storageType, false)
                type.staticFields[metadataField.name] = field
            } else {
                instances.property(field, field.storageType, false)
                type.instanceFields[metadataField.name] = field
            }
        }
        type.shape = if (base == null) instances.build(ClrObject::class.java, ClrObjectFactory::class.java)
            else instances.build(base.shape)
        if (type.staticFields.isNotEmpty()) {
            type.staticObject = statics.build(ClrObject::class.java, ClrObjectFactory::class.java).factory.create(type)
        }
        return type
    }

    // Install every lazy method compiler before any guest code (including .cctor) runs.
    val callTarget = CilRootNodeGen.create(language as Clr, BytecodeConfig.DEFAULT) { builder ->
        builder.beginRoot()
        builder.emitInitializeContext(this)
        builder.beginReturn()
        builder.emitLoadConstant(0)
        builder.endReturn()
        builder.endRoot()
    }.nodes.single().also { it.setMethodName("Initialize") }.callTarget

    fun install() { compileChildren.forEach { it.install() } }
    override fun toString() = "Initialize"
}
