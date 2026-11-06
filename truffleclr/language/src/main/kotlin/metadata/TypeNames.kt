package metadata

// Angle brackets inside compiler-generated names (<Main>d__0) are not type arguments.
fun String.genericArgumentStart(): Int = Regex("`[0-9]+<").find(this)?.range?.last ?: -1
fun String.genericDefinitionName(): String = genericArgumentStart().let { if (it < 0) this else substring(0, it) }
