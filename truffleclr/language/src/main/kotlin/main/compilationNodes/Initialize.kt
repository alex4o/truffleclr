package main.compilationNodes

import com.oracle.truffle.`object`.LocationImpl
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.`object`.Property
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.RootNode
import nodes.internal.InternalTable
import metadata.IlAppDomain
import metadata.IlType
import runtime.*

class Initialize(
    appDomain: IlAppDomain,
    var context: ClrContext,
    frameDescriptor: FrameDescriptor,
    val language: TruffleLanguage<*>
) : RootNode(language, frameDescriptor) {

    @Children
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
                type.shape = if (type.baseType != null) {
                    val objectType = ClrObject(type.name)
                    val virtualTable = mutableListOf(*(type.baseType.shape.objectType as ClrObject).virtualTable)

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
                    type.baseType.shape.createSeparateShape(null).changeType(objectType)
                } else {
                    val objectType = ClrObject(type.name)
                    objectType.virtualTable = type.members.map { it.value as Method }.toTypedArray()
                    context.baseObject.createSeparateShape(null).changeType(objectType)
                }

                val allocator = type.shape.allocator()

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

                    val location = allocator.locationForType(locationType)
                    val property = Property.create(field.name, location, if(locationType.isPrimitive) { 0 } else { 1 })

                    type.shape = type.shape.addProperty(property)

                    type.members[field.name] = Field(field, context)
                }
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

    var runtime = Truffle.getRuntime()

    override fun execute(env: VirtualFrame): Any? {

        for (compileNode in compileChildren) {
            compileNode.executeVoid(env)
        }

        return 0
    }

    override fun getName() = "Initialize"

    override fun toString(): String {
        return name
    }
}