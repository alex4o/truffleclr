package main.compilationNodes

import com.oracle.truffle.api.`object`.DynamicObjectLibrary
import main.Clr
import main.bytecode.CilRootNodeGen
import com.oracle.truffle.api.bytecode.BytecodeConfig
import com.oracle.truffle.api.TruffleLanguage
import types.CTSNull
import nodes.internal.InternalTable
import metadata.IlAppDomain
import metadata.IlType
import runtime.*

class Initialize(
    appDomain: IlAppDomain,
    var context: ClrContext,
    val language: TruffleLanguage<*>
) {

    var compileChildren = mutableListOf<CompileMethod>()

    val internalMethods by lazy() {
        InternalTable.staticMethods()
    }

    /**
     * In this constructor the assemblies are iterated to gather all the methods and types.
     * After this the types are prepared. Methods are transformed inside of the CompileMethod class.
     */
    init {

        for (assembly in appDomain.assemblies) {
            assembly.types.forEach { k, v ->
                if (!context.types.contains(v.fullName)) {
                    context.types.put(v.fullName, processType(v))
                }

                val type = context.types.getValue(v.fullName)


                // Iterate the available methods and create their CompileMethods.
                compileChildren.addAll(v.methods.values
                    .map {
                        type.members[it.toString()] = Method(it, null)
                        CompileMethod(it, this, language, type)
                    })

                // Setup a shape and a virtual table
                val objects = DynamicObjectLibrary.getUncached()
                val objectType = ClrObject(type.name)
                objectType.allocationShape = com.oracle.truffle.api.`object`.Shape.newBuilder()
                    .layout(ClrDynamicObject::class.java, java.lang.invoke.MethodHandles.lookup())
                    .dynamicType(objectType)
                    .build()
                val template = ClrDynamicObject(objectType.allocationShape)
                if (type.baseType != null) {
                    val baseObjectType = type.baseType.shape.dynamicType as ClrObject
                    objectType.fieldDefaults.putAll(baseObjectType.fieldDefaults)
                    for ((name, value) in baseObjectType.fieldDefaults) {
                        objects.putWithFlags(template, name, value, type.baseType.shape.getProperty(name).flags)
                    }
                    val virtualTable = mutableListOf(*baseObjectType.virtualTable)

                    for (method in type.members.map { it.value as Method }) {
                        val index =
                            virtualTable.indexOfFirst { it.metadata.toString(false) == method.metadata.toString(false) }
                        if (index == -1) {
                            virtualTable.add(method)
                        } else {
                            virtualTable[index] = method
                        }
                    }
                    objectType.virtualTable = virtualTable.toTypedArray()
                } else {
                    objectType.virtualTable = type.members.map { it.value as Method }.toTypedArray()
                }

                // Use the fields to create all the properties.
                for (field in v.fields.values) {
                    val locationType = if (field.type.isPrimiteive) {

                        // TODO: CorElementType to java Class object conversion
                        when (field.type.type) {
                            CorElementType.BOOLEAN -> Boolean::class.java
                            CorElementType.U1 -> Byte::class.java
                            CorElementType.CHAR -> Short::class.java
                            CorElementType.I4 -> Int::class.java
                            CorElementType.U4 -> Int::class.java
                            CorElementType.I8 -> Long::class.java
                            CorElementType.U8 -> Long::class.java
                            CorElementType.R4 -> Float::class.java
                            CorElementType.R8 -> Double::class.java
                            CorElementType.STRING -> String::class.java
                            else -> error("Unexpected type: ${field.type.type}")
                        }

                    } else if (field.type.isArray) {
                        if (field.type.elementClass.isPrimiteive) {

                            when (field.type.elementClass.type) {
                                CorElementType.BOOLEAN -> BooleanArray::class.java
                                CorElementType.U1 -> ByteArray::class.java
                                CorElementType.CHAR -> ShortArray::class.java
                                CorElementType.I4 -> IntArray::class.java
                                CorElementType.U4 -> IntArray::class.java
                                CorElementType.I8 -> LongArray::class.java
                                CorElementType.U8 -> LongArray::class.java
                                CorElementType.R4 -> FloatArray::class.java
                                CorElementType.R8 -> DoubleArray::class.java
                                CorElementType.STRING -> Array<String>::class.java
                                else -> error("Unexpected array type: ${field.type.type}")
                            }

                        } else {
                            Array<Any>::class.java
                        }
                    } else {
                        Any::class.java
                    }

                    val defaultValue: Any = when (locationType) {
                        Boolean::class.java -> false
                        Byte::class.java -> 0.toByte()
                        Short::class.java -> 0.toShort()
                        Int::class.java -> 0
                        Long::class.java -> 0L
                        Float::class.java -> 0.0f
                        Double::class.java -> 0.0
                        else -> CTSNull
                    }
                    objectType.fieldDefaults[field.name] = defaultValue
                    objects.putWithFlags(template, field.name, defaultValue, if (locationType.isPrimitive) 0 else 1)

                    type.members[field.name] = Field(field, context)
                }
                type.shape = template.shape
            }
        }
    }

    fun processType(ilType: IlType): Type {
        val type = Type(
            ilType.fullName,
            if (ilType.extends != null) {
                if (context.types.contains(ilType.extends?.fullName)) {
                    context.types.getValue(ilType.extends!!.fullName)
                } else {
                    processType(ilType.extends!!)
                }
            } else {
                null
            }
        )

        return type
    }

    // Initialization uses the same interpreter as methods, but only installs lazy
    // compilers. This initializes interpreter infrastructure without parsing bodies.
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