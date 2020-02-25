package main.compilationNodes

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.FrameSlot
import com.oracle.truffle.api.frame.VirtualFrame
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
import runtime.ClrContext
import runtime.Field
import runtime.Method
import runtime.Type
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
        val methodQueue = LinkedList<IlMethod>()

        for (assembly in appDomain.assemblies) {
            assembly.types.forEach { k, v ->
                if (!context.types.contains(v.fullName)) {
                    context.types.put(v.fullName, processType(v))
                }

                val type = context.types.getValue(v.fullName)

                for(field in v.fields.values) {
                    // TODO: Setup the shape for each type here, by recursively going through parents and adding all of their fields to it.
                    type.members[field.name] = Field(field, context)
                }

                methodQueue.addAll(v.methods.values)

                compileChildren.addAll(v.methods.values
                    .map {
                        type.members[it.toString()] = Method(it,null)
                        CompileMethod(it, this, language, type)
                    })
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