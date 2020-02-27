package main.compilationNodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.TruffleOptions
import com.oracle.truffle.api.`object`.Layout
import com.oracle.truffle.api.`object`.Property
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.RepeatingNode
import com.oracle.truffle.api.nodes.RootNode
import nodes.ExpressionNode
import nodes.expressions.LoadConst
import nodes.expressions.LoadLocalNodeGen
import nodes.expressions.math.SubtractNodeGen
import nodes.internal.InternalTable
import nodes.statements.StoreLocalNodeGen
import metadata.IlAppDomain
import metadata.IlMethod
import metadata.IlType
import runtime.*
import sun.security.provider.SHA
import java.util.*

class Initialize(
    appDomain: IlAppDomain,
    var context: ClrContext,
    frameDescriptor: FrameDescriptor,
    val language: TruffleLanguage<*>
) :
    RootNode(
//        language, frameDescriptor
        null, null
    ) {

    var compileChildren = mutableListOf<CompileMethod>()

    val internalMethods by lazy() {
        InternalTable.staticMethods()
    }

    init {
//        val methodQueue = LinkedList<IlMethod>()

        for (assembly in appDomain.assemblies) {
            assembly.types.forEach { k, v ->
                if (!context.types.contains(v.fullName)) {
                    context.types.put(v.fullName, processType(v))
                }

                val type = context.types.getValue(v.fullName)

                compileChildren.addAll(v.methods.values
                    .map {
                        type.members[it.toString()] = Method(it, null)
                        CompileMethod(it, this, language, type)
                    })

                type.shape = if (type.baseType != null) {
                    val objectType = ClrObject(type.name)
                    val virtualTable = mutableListOf(*(type.baseType.shape.objectType as ClrObject).virtualTable)

                    for(method in type.members.map { it.value as Method }) {
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
//                val name = allocator.locationForValue(0)
//                type.shape = type.shape.addProperty(Property.create(type.name, name, 0))

                for (field in v.fields.values) {
                    val location = if (field.type.isPrimiteive) {
                        allocator.locationForType(
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
                        )
                    } else if (field.type.isArray) {
                        if (field.type.elementClass.isPrimiteive) {
                            allocator.locationForType(
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
                            )
                        } else {
                            allocator.locationForType(Array<Any>::class.java)
                        }
                    } else {
                        allocator.locationForType(Any::class.java)
                    }

                    type.shape = type.shape.addProperty(Property.create(field.name, location, 0))

                    type.members[field.name] = Field(field, context)
                }

//                methodQueue.addAll(v.methods.values)


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

    override fun getName() = "Compile"

    override fun toString(): String {
        return name
    }
}