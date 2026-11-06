package metadata

/** A generic application recorded from the IL grammar, not inferred from its name. */
data class GenericTypeName(val definition: String, val arguments: List<String>)
