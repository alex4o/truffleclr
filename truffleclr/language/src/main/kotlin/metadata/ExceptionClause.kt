package metadata

/** Table boundaries retain their meaning until all method instructions are parsed. */
sealed interface CodeBoundary {
    data class Label(val name: String) : CodeBoundary
    data class Offset(val bytes: Int) : CodeBoundary
    data class Index(val instruction: Int) : CodeBoundary
}

/** Half-open instruction ranges, including forward references in EH tables. */
data class ExceptionClause(
    val tryStart: CodeBoundary, val tryEnd: CodeBoundary,
    val handlerStart: CodeBoundary, val handlerEnd: CodeBoundary,
    val kind: String, val catchType: String? = null, val filterStart: CodeBoundary? = null
)
