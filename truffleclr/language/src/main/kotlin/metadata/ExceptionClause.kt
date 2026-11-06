package metadata

/** Half-open instruction ranges; labels also allow forward references in EH tables. */
data class ExceptionClause(
    val tryStart: String, val tryEnd: String,
    val handlerStart: String, val handlerEnd: String,
    val kind: String, val catchType: String? = null, val filterStart: String? = null
)
