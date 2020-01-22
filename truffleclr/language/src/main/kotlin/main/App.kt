package main

import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import parser.generic.IlAppDomain

fun main() {
    val clr = Clr()
    val appDomain = IlAppDomain()
    clr.parseFile(appDomain, CharStreams.fromFileName("./test/array.il"))


}