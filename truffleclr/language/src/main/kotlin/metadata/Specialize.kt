package metadata

import metadata.instruction.*

/** Closed metadata is interned before walking its dependencies. Runtime shapes and
 * bytecode constants never contain type variables; bytecode compilation stays lazy.
 */
class Specialize(private val domain: IlAppDomain) {
    private val definitions = domain.assemblies.flatMap { it.types.values }.associateBy { it.name }
    private val types = linkedMapOf<String, IlType>()
    private var failure: Throwable? = null
    private val origins = mutableMapOf<IlType, Pair<IlType, List<IlType>>>()
    private val pending = ArrayDeque<() -> Unit>()
    private val methods = mutableMapOf<Triple<IlMethod, IlType, List<IlType>>, IlMethod>()
    private val newTypes = mutableListOf<IlType>()
    private val newMethods = mutableListOf<IlMethod>()
    private var publishing = false
    private val assemblyOwners = domain.assemblies.flatMap { assembly ->
        assembly.types.values.map { it to assembly }
    }.toMap()

    /** Construction failures poison interning, unlike a failed body whose
     * successfully constructed dependencies can still be published later. */
    private inline fun <T> construct(build: () -> T): T {
        failure?.let { throw it }
        val typeCount = types.size
        val methodCount = methods.size
        try {
            return build()
        } catch (error: Throwable) {
            if (types.size != typeCount || methods.size != methodCount) failure = error
            throw error
        }
    }

    /** Signatures and MethodImpl declarations never require decoding IL bodies. */
    private fun publish() {
        failure?.let { throw it }
        if (publishing || (newTypes.isEmpty() && newMethods.isEmpty())) return
        publishing = true
        try {
            // Eager text bodies can request publication while this queue drains.
            // Only the outermost caller installs the complete batch.
            while (pending.isNotEmpty()) pending.removeFirst().invoke()
            for (type in newTypes) {
                assemblyOwners.getValue(origins.getValue(type).first).types[type.name] = type
            }
            domain.metadataChanged?.invoke(newTypes, newMethods)
            newTypes.clear()
            newMethods.clear()
        } catch (error: Throwable) {
            failure = error
            throw error
        } finally {
            publishing = false
        }
    }

    private fun substitute(name: String, typeArgs: List<IlType>, methodArgs: List<IlType>): String =
        domain.mapTypeName(name) { text ->
            Regex("(!!?)([0-9]+)").replace(text) {
                val args = if (it.groupValues[1] == "!!") methodArgs else typeArgs
                args.getOrNull(it.groupValues[2].toInt())?.fullName
                    ?: error("Unbound generic parameter "+it.value+" in $name")
            }
        }

    private fun type(name: String, typeArgs: List<IlType> = emptyList(), methodArgs: List<IlType> = emptyList()): IlType =
        construct { constructType(name, typeArgs, methodArgs) }

    private fun constructType(name: String, typeArgs: List<IlType>, methodArgs: List<IlType>): IlType {
        val closedName = substitute(name, typeArgs, methodArgs)
        if (closedName.startsWith("System.Func`") || closedName.startsWith("System.Action`")) {
            throw UnsupportedOperationException("Delegates are unsupported: $closedName")
        }
        if (closedName.startsWith("System.Threading.Tasks.ValueTask") ||
            closedName.startsWith("System.Threading.CancellationToken") ||
            closedName == "System.Threading.Thread" ||
            closedName.startsWith("System.Runtime.CompilerServices.Configured") ||
            closedName == "System.Runtime.CompilerServices.AsyncVoidMethodBuilder") {
            throw UnsupportedOperationException("Unsupported async/threading API: $closedName; only single-threaded Task awaiters are supported")
        }
        if (closedName.endsWith("&")) return type(closedName.dropLast(1)).makeByRef()
        if (closedName.endsWith("[]")) {
            type("System.Array")
            return type(closedName.dropLast(2)).makeArray(1)
        }
        types[closedName]?.let { return it }
        val instance = domain.getType(closedName).genericInstance
        val definitionName = instance?.definition ?: closedName
        val definition = definitions[definitionName] ?: error("Unknown type $definitionName")
        val args = instance?.arguments?.map { type(it) } ?: emptyList()
        require(args.size == definition.genericParameters.size) { "Generic arity mismatch: $closedName" }
        check(types.size < 10000) { "Generic specialization exceeded 10000 types (expanding recursive instantiation): $closedName" }
        definition.ensureMetadata()
        val closed = IlType(closedName, definition.type)
        closed.genericInstance = instance
        types[closedName] = closed
        newTypes.add(closed)
        origins[closed] = definition to args
        closed.attribtes = definition.attribtes
        closed.polyglot = definition.polyglot
        closed.isInterface = definition.isInterface
        closed.extends = definition.extends?.let { type(it.name, args) }
        closed.interfaces = definition.interfaces.map { type(it.name, args) }
        for (field in definition.fields.values) {
            closed.fields[field.name] = IlField(field.name, type(field.type.name, args), field.defaultValue, field.static, field.initialValue)
        }
        for (method in definition.methods.values) {
            require(!method.virtual || method.genericParameters.isEmpty()) {
                "Generic virtual methods are unsupported: $method"
            }
            if (method.genericParameters.isEmpty()) method(method, closed, emptyList())
        }
        return closed
    }

    private fun method(definition: IlMethod, owner: IlType, args: List<IlType>): IlMethod =
        construct { constructMethod(definition, owner, args) }

    private fun constructMethod(definition: IlMethod, owner: IlType, args: List<IlType>): IlMethod {
        val key = Triple(definition, owner, args)
        methods[key]?.let { return it }
        require(args.size == definition.genericParameters.size) { "Generic method arity mismatch: $definition" }
        check(methods.size < 50000) { "Generic specialization exceeded 50000 methods: $definition" }
        val typeArgs = origins.getValue(owner).second
        val closed = IlMethod(definition.name, definition.arguments.map { it.first to type(it.second.name, typeArgs, args) })
        closed.definitionSignature = definition.toString(false)
        closed.memberOf = owner
        closed.returnType = type(definition.returnType.name, typeArgs, args)
        closed.genericArguments = args
        closed.isPublic = definition.isPublic
        closed.static = definition.static
        closed.virtual = definition.virtual
        closed.newSlot = definition.newSlot
        closed.internal = definition.internal
        closed.abstract = definition.abstract
        methods[key] = closed
        newMethods.add(closed)
        check(owner.methods.put(closed.key(), closed) == null) { "Ambiguous specialized method: $closed" }
        pending.add {
            val explicit = definition.overrideReferences.map { resolve(it, typeArgs, args) }
            closed.overrides.addAll(explicit.map { it.key() })
            if (definition.virtual && !definition.newSlot && explicit.none { !it.memberOf!!.isInterface }) {
                inheritedDeclaration(definition, owner)?.let { closed.overrides.add(it.key()) }
            }
        }
        closed.deferBody {
            definition.ensureBody()
            closed.locals = definition.locals.map { type(it.name, typeArgs, args) }
            closed.maxstack = definition.maxstack
            closed.initLocals = definition.initLocals
            closed.pinnedLocals = definition.pinnedLocals
            closed.labels.putAll(definition.labels)
            closed.instructionOffsets.putAll(definition.instructionOffsets)
            closed.jumpLabels.addAll(definition.jumpLabels)
            closed.exceptionClauses.addAll(definition.exceptionClauses.map { it.copy(catchType = it.catchType?.let { name -> type(name, typeArgs, args).name }) })
            closed.instructions = definition.instructions.map { instruction ->
                val result = when (instruction) {
                    is InstructionString -> instruction.also { type("System.String") }
                    is InstructionType -> {
                        if (instruction.instruction == "newarr") type("System.Array")
                        InstructionType(instruction.instruction, type(instruction.type, typeArgs, args).name)
                    }
                    is InstructionField -> InstructionField(instruction.instruction, instruction.type,
                        type(instruction.member, typeArgs, args).name, instruction.name)
                    is InstructionMethod -> InstructionMethod(instruction.instruction, resolve(instruction.method, typeArgs, args), instruction.callConv)
                    else -> instruction
                }
                if (result !== instruction) result.instructionArgs.addAll(instruction.instructionArgs)
                result
            }.toMutableList()
            publish()
        }
        // Text IL was already decoded by ANTLR; retain its declaration-time
        // validation. Native definitions have no instructions until first compile.
        if (definition.instructions.isNotEmpty()) pending.add { closed.ensureBody() }
        return closed
    }

    /** Match in the derived definition's open context, not after closing X and Y
     * to the same type. Each base edge composes its parameter substitution.
     */
    private fun inheritedDeclaration(implementation: IlMethod, owner: IlType): IlMethod? {
        var current = implementation.memberOf!!
        var parameters = current.genericParameters.indices.map { domain.getType("!$it") }
        var closedBase = owner.extends
        while (closedBase != null) {
            val base = current.extends!!
            val instance = base.genericInstance
            current = definitions.getValue(instance?.definition ?: base.name)
            parameters = instance?.arguments?.map {
                domain.getType(substitute(it, parameters, emptyList()))
            } ?: emptyList()
            val matches = current.methods.values.filter {
                it.virtual && !it.static && it.genericParameters.isEmpty() &&
                    substitute(it.toString(false), parameters, emptyList()) == implementation.toString(false)
            }
            require(matches.size <= 1) { "Ambiguous virtual override $implementation; use an explicit .override" }
            if (matches.isNotEmpty()) return method(matches.single(), closedBase, emptyList())
            closedBase = closedBase.extends
        }
        return null
    }

    private fun resolve(reference: IlMethod, typeArgs: List<IlType>, methodArgs: List<IlType>): IlMethod {
        if (reference.memberOf!!.name.startsWith("System.Threading.Tasks.Task") &&
            reference.name in listOf("Run", "ContinueWith", "ConfigureAwait")) {
            throw UnsupportedOperationException("Unsupported Task API: " + reference.name + "; delegates and configured awaiters are not supported")
        }
        var owner: IlType? = type(reference.memberOf!!.name, typeArgs, methodArgs)
        val args = reference.genericArguments.map { type(it.name, typeArgs, methodArgs) }
        while (owner != null) {
            val (definition, ownerArgs) = origins.getValue(owner)
            fun signatureType(name: String): IlType = type(name, ownerArgs, args)
            val returnType = signatureType(reference.returnType.name).name
            val parameters = reference.arguments.map { signatureType(it.second.name).name }
            val named = definition.methods.values.filter {
                it.name == reference.name && it.static == reference.static && it.genericParameters.size == args.size
            }
            // MemberRef signatures identify definitions, before substitution. F(!0)
            // and F(int32) remain distinct even when the owner is C<int32>.
            val exact = named.filter {
                it.returnType.name == reference.returnType.name &&
                    it.arguments.map { arg -> arg.second.name } == reference.arguments.map { arg -> arg.second.name }
            }
            val candidates = exact.ifEmpty { named.filter {
                signatureType(it.returnType.name).name == returnType &&
                    it.arguments.map { arg -> signatureType(arg.second.name).name } == parameters
            } }
            require(candidates.size <= 1) { "Ambiguous method reference $reference" }
            if (candidates.isNotEmpty()) return method(candidates.single(), owner, args)
            owner = owner.extends
        }
        error("Unresolved method $reference")
    }

    fun run() {
        domain.availableTypes = definitions.values.filter { it.genericParameters.isEmpty() }.map { it.name }.toSet()
        domain.materializeType = { name ->
            type(name)
            publish()
        }
        // Text IL retains eager declaration validation; native type members remain lazy.
        for (definition in definitions.values) {
            if (!definition.hasDeferredMetadata && definition.genericParameters.isEmpty()) type(definition.name)
        }
        domain.entryTypeName?.let { type(it) }
        // Replace the definition snapshot once; subsequent publications append deltas.
        domain.assemblies.forEach { it.types.clear() }
        publish()
    }
}
