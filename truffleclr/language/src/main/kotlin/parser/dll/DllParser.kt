package parser.dll

import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import metadata.*
import runtime.CoreTypeInfo
import runtime.CorElementType
import types.CTSNull

internal fun JsonObject.text(key: String): String = get(key)?.asString ?: error("Missing DLL JSON field: $key")
internal fun JsonObject.flag(key: String): Boolean = get(key)?.takeUnless { it.isJsonNull }?.asBoolean ?: false
internal fun JsonObject.optional(key: String): JsonElement? = get(key)?.takeUnless { it.isJsonNull }
internal fun JsonObject.items(key: String): List<JsonObject> = getAsJsonArray(key).map { it.asJsonObject }
internal fun unsupported(message: String): Nothing = throw UnsupportedOperationException("DLL: $message")
internal fun utf16(value: JsonElement): String = value.asJsonArray.map {
    val unit = it.asInt
    require(unit in 0..65535) { "Invalid UTF-16 code unit: $unit" }
    unit.toChar()
}.toCharArray().concatToString()

internal object LoadingTrace {
    fun <T> measure(stage: String, action: () -> T): T {
        if (!java.lang.Boolean.getBoolean("clr.traceLoading")) return action()
        val start = System.nanoTime()
        try { return action() }
        finally { System.err.println("[clr.loading] $stage: ${(System.nanoTime() - start) / 1_000_000.0} ms") }
    }
}

/** JSON is a transport for structured metadata, never an IL/display-string parser. */
object DllParser {
    fun load(domain: IlAppDomain, bytes: ByteArray, source: String) {
        val handle = LoadingTrace.measure("open $source") { NativeDll(bytes) }
        try {
            domain.own(handle)
            LoadingTrace.measure("map $source") {
                DllMetadataMapper(domain, handle, source).map(readJson(handle.metadata()))
            }
        } catch (failure: Throwable) {
            try { handle.close() } catch (cleanup: Throwable) { failure.addSuppressed(cleanup) }
            throw failure
        }
    }

    internal fun readJson(json: String): JsonObject {
        val value = JsonParser.parseString(json).asJsonObject
        value.optional("error")?.let { throw IllegalArgumentException("Native DLL reader: ${it.asString}") }
        return value
    }
}

internal class DllMetadataMapper(
    private val domain: IlAppDomain,
    private val handle: NativeDll,
    private val source: String
) {
    private val methods = mutableMapOf<Long, IlMethod>()
    private lateinit var assembly: IlAssembly
    private var registered = false
    private var declaredTypes: Map<IlAssembly, Set<String>> = emptyMap()
    private var definitions: Map<String, IlType> = emptyMap()

    fun map(root: JsonObject) {
        require(root.get("schema_version").asInt == 1) { "Unsupported DLL metadata schema" }
        assembly = IlAssembly(root.optional("assembly")?.asString ?: root.text("module"))
        assembly.modules.add(IlModule(root.text("module")))
        val declarations = root.items("types").filter { declaration ->
            val module = declaration.getAsJsonObject("type").text("name") == "<Module>"
            require(!module || (declaration.items("fields").isEmpty() && declaration.items("methods").isEmpty())) {
                "Global module fields/methods are unsupported"
            }
            !module
        }
        // Register all definitions before interpreting any signatures or MethodImpls.
        for (declaration in declarations) {
            val name = typeName(declaration.getAsJsonObject("type"))
            require(domain.assemblies.none { name in it.types }) { "Duplicate type across loaded assemblies: $name" }
            val type = IlType(name, CoreTypeInfo.typeByName[name]?.type ?: CorElementType.OBJECT)
            if (declaration.flag("variant")) unsupported("generic variance on $name")
            type.genericParameters = declaration.getAsJsonArray("generic").map { it.asString }
            type.isGeneric = type.genericParameters.isNotEmpty()
            type.isInterface = declaration.get("flags").asLong and 0x20L != 0L
            check(assembly.types.put(name, type) == null) { "Duplicate DLL type: $name" }
        }
        definitions = assembly.types.toMap()
        domain.assemblies.add(assembly)
        declaredTypes = domain.assemblies.associateWith { it.types.keys.toSet() }
        registered = true
        for (declaration in declarations) {
            val owner = assembly.types.getValue(typeName(declaration.getAsJsonObject("type")))
            owner.extends = declaration.optional("extends")?.let { type(it.asJsonObject) }
                ?: if (owner.name != "System.Object") domain.getType("System.Object") else null
            owner.interfaces = declaration.items("implements").map(::type)
            for (field in declaration.items("fields")) {
                modifiers(field)
                if (field.optional("initial_value") != null) unsupported("RVA field ${owner.name}::${field.text("name")}")
                if (field.optional("offset") != null) unsupported("explicit field layout on ${owner.name}")
                var fieldType = type(field.getAsJsonObject("type"))
                if (field.flag("by_ref")) fieldType = fieldType.makeByRef()
                val name = field.text("name")
                check(owner.fields.put(name, IlField(name, fieldType,
                    field.optional("constant")?.let { constant(it.asJsonObject) } ?: CTSNull,
                    field.flag("static"))) == null) { "Duplicate DLL field: $owner::$name" }
            }
            for (declarationMethod in declaration.items("methods")) {
                if (declarationMethod.optional("pinvoke") != null) unsupported("P/Invoke method ${declarationMethod.text("name")}")
                val method = signature(declarationMethod.text("name"), owner,
                    declarationMethod.getAsJsonObject("signature"))
                method.genericParameters = declarationMethod.getAsJsonArray("generic").map { it.asString }
                method.virtual = declarationMethod.flag("virtual")
                method.abstract = declarationMethod.flag("abstract")
                method.internal = declarationMethod.flag("internal_call")
                method.newSlot = declarationMethod.flag("new_slot")
                method.isPublic = declarationMethod.get("accessibility").asInt == 6
                val id = declarationMethod.get("id").asLong
                require(id >= 0 && methods.put(id, method) == null) { "Duplicate or invalid DLL method id: $id" }
                check(owner.methods.put(method.toString(), method) == null) { "Duplicate DLL method: $method" }
                method.deferBody {
                    LoadingTrace.measure("body $source method=$id $method") {
                        val body = DllParser.readJson(handle.body(id))
                        require(body.get("method_id").asLong == id) { "DLL method body id mismatch" }
                        DllBodyMapper(this).map(method, body)
                    }
                }
            }
        }
        for (declaration in declarations) {
            for (methodImpl in declaration.items("overrides")) {
                val implementation = methodImpl.getAsJsonObject("implementation")
                require(implementation.text("kind") == "method" && implementation.has("id")) {
                    "MethodImpl implementation must be a local method definition"
                }
                val method = methods.getValue(implementation.get("id").asLong)
                method.overrideReferences.add(methodReference(methodImpl.getAsJsonObject("declaration")))
            }
        }
        root.optional("entry_point")?.asJsonObject?.let {
            if (it.text("kind") != "method") unsupported("multi-module entry point")
            domain.entryPoint = methods.getValue(it.get("id").asLong)
            domain.entryAssembly = assembly
        }
    }

    private fun typeName(value: JsonObject): String = when (val kind = value.text("kind")) {
        "named" -> {
            val scope = value.getAsJsonObject("scope")
            when (scope.text("kind")) {
                "current_module", "assembly" -> Unit
                else -> unsupported("type resolution scope ${scope.text("kind")}")
            }
            val parent = value.optional("encloser")
            val name = if (parent != null) typeName(parent.asJsonObject) + "/" + value.text("name")
                else value.optional("namespace")?.asString?.takeIf { it.isNotEmpty() }?.let { "$it.${value.text("name")}" }
                    ?: value.text("name")
            if (registered) {
                val target = if (scope.text("kind") == "current_module") assembly else
                    domain.assemblies.singleOrNull { it.name == scope.text("name") }
                        // The minimal CoreLib implements the supported framework facade types.
                        ?: domain.assemblies.singleOrNull { it.name == "System.Private.CoreLib" &&
                            scope.text("name") in frameworkFacades && name in declaredTypes.getValue(it) }
                        ?: unsupported("unloaded assembly ${scope.text("name")} for $name")
                if (name !in declaredTypes.getValue(target)) unsupported("unresolved type $name in assembly ${target.name}")
            }
            name
        }
        "generic" -> domain.genericTypeName(typeName(value.getAsJsonObject("base")), value.items("arguments").map(::typeName))
        "type_generic" -> "!${value.get("index").asInt}"
        "method_generic" -> "!!${value.get("index").asInt}"
        "vector" -> {
            modifiers(value)
            typeName(value.getAsJsonObject("element")) + "[]"
        }
        "array" -> unsupported("multidimensional/non-vector array types")
        "pointer", "function_pointer" -> unsupported("$kind types")
        else -> primitiveNames[kind] ?: unsupported("type kind $kind")
    }

    fun type(value: JsonObject): IlType = domain.getType(typeName(value))

    fun modifiers(value: JsonObject) {
        value.optional("modifiers")?.asJsonArray?.forEach {
            val modifier = it.asJsonObject
            // readonly managed refs have the same stable managed storage here.
            val name = typeName(modifier.getAsJsonObject("type"))
            if (name != "System.Runtime.CompilerServices.IsReadOnlyAttribute") {
                unsupported("custom signature modifier $name")
            }
        }
    }

    private fun parameter(value: JsonObject): IlType {
        modifiers(value)
        return when (value.text("kind")) {
            "void" -> domain.getType("System.Void")
            "value" -> type(value.getAsJsonObject("type"))
            "by_ref" -> type(value.getAsJsonObject("type")).makeByRef()
            else -> unsupported("parameter kind ${value.text("kind")}")
        }
    }

    private fun signature(name: String, owner: IlType, signature: JsonObject): IlMethod {
        val convention = signature.getAsJsonObject("calling_convention").text("kind")
        if (convention !in setOf("default", "generic", "default_managed") || signature.flag("explicit_this") ||
            signature.optional("varargs") != null) unsupported("calling convention $convention on $owner::$name")
        val method = IlMethod(name, signature.items("parameters").mapIndexed { index, p -> "arg$index" to parameter(p) })
        method.memberOf = owner
        method.static = !signature.flag("instance")
        method.returnType = parameter(signature.getAsJsonObject("return_type"))
        return method
    }

    fun methodReference(value: JsonObject): IlMethod {
        if (value.text("kind") == "generic") {
            val method = methodReference(value.getAsJsonObject("base"))
            method.genericArguments = value.items("arguments").map(::type)
            return method
        }
        require(value.text("kind") == "method") { "Invalid DLL method reference" }
        return signature(value.text("name"), referenceOwner(value), value.getAsJsonObject("signature"))
    }

    fun fieldReference(value: JsonObject): Triple<String, String, String> {
        require(value.text("kind") == "field") { "Invalid DLL field reference" }
        modifiers(value)
        var fieldType = typeName(value.getAsJsonObject("type"))
        if (value.flag("by_ref")) fieldType += "&"
        return Triple(fieldType, referenceOwner(value).name, value.text("name"))
    }

    /** MethodDef/FieldDef tokens on a generic owner imply that owner's open
     * instantiation. MemberRefs instead carry their explicit TypeSpec arguments.
     * Preserve !n here so specialization substitutes the calling type's context.
     */
    private fun referenceOwner(reference: JsonObject): IlType {
        val owner = type(reference.getAsJsonObject("owner"))
        val definition = definitions[owner.name]
        return if (reference.has("id") && definition != null && definition.genericParameters.isNotEmpty()) {
            domain.getType(domain.genericTypeName(owner.name, definition.genericParameters.indices.map { "!$it" }))
        } else owner
    }

    private fun constant(value: JsonObject): Any = when (val kind = value.text("kind")) {
        "Null" -> CTSNull
        "Boolean" -> value.get("value").asBoolean
        "Char", "UInt16" -> value.get("value").asInt.toUShort()
        "Int8" -> value.get("value").asInt.toByte()
        "UInt8" -> value.get("value").asInt.toUByte()
        "Int16" -> value.get("value").asInt.toShort()
        "Int32" -> value.get("value").asInt
        "UInt32" -> value.get("value").asLong.toUInt()
        "Int64" -> value.get("value").asLong
        "UInt64" -> value.get("value").asBigInteger.toLong().toULong()
        "Float32" -> Float.fromBits(value.get("bits").asLong.toInt())
        "Float64" -> Double.fromBits(value.get("bits").asBigInteger.toLong())
        "String" -> utf16(value.get("value"))
        else -> unsupported("constant kind $kind")
    }

    companion object {
        private val frameworkFacades = setOf("mscorlib", "netstandard", "System.Runtime", "System.Console",
            "System.Threading.Tasks", "System.Threading", "System.Runtime.Extensions", "System.IO.FileSystem")
        private val primitiveNames = mapOf(
            "Boolean" to "System.Boolean", "Char" to "System.Char", "Int8" to "System.SByte", "UInt8" to "System.Byte",
            "Int16" to "System.Int16", "UInt16" to "System.UInt16", "Int32" to "System.Int32", "UInt32" to "System.UInt32",
            "Int64" to "System.Int64", "UInt64" to "System.UInt64", "Float32" to "System.Single", "Float64" to "System.Double",
            "IntPtr" to "System.IntPtr", "UIntPtr" to "System.UIntPtr", "Object" to "System.Object", "String" to "System.String"
        )
    }
}
