package metadata


import metadata.instruction.Instruction


// TODO: Split into two distinct method types the Runtime one and the parsing one.
class IlMethod(var name: String, var arguments: List<Pair<String, IlType>>) {
    private var bodyLoader: (() -> Unit)? = null
    private var loadingBody = false
    private var bodyFailure: Throwable? = null

    /** The native definition and each closed specialization decode at most once.
     * Keep failures sticky: a partially populated body must never be compiled.
     */
    fun deferBody(loader: () -> Unit) {
        check(bodyLoader == null && !loadingBody && bodyFailure == null) { "Body loader already set for $this" }
        bodyLoader = loader
    }

    @Synchronized
    fun ensureBody() {
        bodyFailure?.let { throw it }
        val loader = bodyLoader ?: return
        check(!loadingBody) { "Recursive body loading for $this" }
        loadingBody = true
        try {
            loader()
            bodyLoader = null
        } catch (failure: Throwable) {
            bodyFailure = failure
            throw failure
        } finally {
            loadingBody = false
        }
    }

    var definitionSignature: String? = null
    fun key(): String = definitionSignature?.let { "$memberOf::$it${genericSuffix()}" } ?: toString()

    var genericParameters: List<String> = emptyList()
    var genericArguments: List<IlType> = emptyList()
    val overrides = mutableListOf<String>()
    val overrideReferences = mutableListOf<IlMethod>()
    val exceptionClauses = mutableListOf<ExceptionClause>()
    var initLocals: Boolean = true
    // Pinning does not change JVM managed storage; retain it instead of losing
    // signature information. Managed references themselves keep their owner alive.
    var pinnedLocals: Set<Int> = emptySet()
    var maxstack: Int = 0
    var locals: List<IlType> = mutableListOf()
    var instructions = mutableListOf<Instruction>()
    val instructionOffsets = mutableMapOf(0 to 0)
    var jumpLabels = mutableListOf<String>()
    var labels = linkedMapOf<String, Int>()
    lateinit var returnType: IlType

    var memberOf: IlType? = null

    var isPublic = false
    var virtual = false
    var newSlot = false
    var static = false
    var internal = false
    var abstract = false


    override fun toString(): String {
          return "$returnType $memberOf::$name${genericSuffix()}(${arguments.map { it.second }.joinToString(",")})"
    }

    private fun genericSuffix(): String = when {
        genericArguments.isNotEmpty() -> genericArguments.joinToString(",", "<", ">")
        genericParameters.isNotEmpty() -> "<${genericParameters.size}>"
        else -> ""
    }

    fun toString(memberOf: Boolean = false) : String {
        return "$returnType $name${genericSuffix()}(${arguments.map { it.second }.joinToString(",")})"
    }
}
