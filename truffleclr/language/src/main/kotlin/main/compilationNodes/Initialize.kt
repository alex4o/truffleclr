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
        // Field types can refer forward or back to their owner. Resolve only after
        // every shape exists; no recursive processType calls for field signatures.
        for (type in context.types.values) {
            for (field in type.members.values.filterIsInstance<Field>()) {
                field.valueType = context.types[field.metadata.type.fullName]?.takeIf { it.isValueType }
            }
        }
        for (type in context.types.values) type.prepareValueLayout()

        // Reference/static cycles are legal, but recursively embedded structs are not.
        val visiting = mutableSetOf<Type>()
        val visited = mutableSetOf<Type>()
        fun validateLayout(type: Type) {
            if (type in visited) return
            check(visiting.add(type)) { "Recursive value-type layout: ${type.name}" }
            for (field in type.layoutFields) field.valueType?.let { validateLayout(it) }
            visiting.remove(type)
            visited.add(type)
        }
        for (type in context.types.values) validateLayout(type)
        for (type in context.types.values) {
            for (field in type.staticFields.values) {
                field.valueType?.let { field.writeRaw(type.staticObject, it.newValue()) }
            }
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
            if (method.virtual) {
                val inherited = if (method.newSlot) -1 else
                    virtualTable.indexOfLast { it.metadata.toString(false) == method.toString(false) }
                member.virtualSlot = if (inherited < 0) virtualTable.size else inherited
                if (inherited < 0) virtualTable.add(member) else virtualTable[inherited] = member
            }
        }
        type.virtualTable = virtualTable.toTypedArray()
        base?.let { type.instanceFields.putAll(it.instanceFields) }
        val instances = StaticShape.newBuilder(language)
        val statics = StaticShape.newBuilder(language)
        val layoutFields = base?.layoutFields?.toMutableList() ?: mutableListOf()
        for (metadataField in metadata.fields.values) {
            val field = Field(metadataField, type)
            type.members[metadataField.name] = field
            if (metadataField.static) {
                statics.property(field, field.storageType, false)
                type.staticFields[metadataField.name] = field
            } else {
                instances.property(field, field.storageType, false)
                type.instanceFields[metadataField.name] = field
                layoutFields.add(field)
            }
        }
        type.layoutFields = layoutFields.toTypedArray()
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
