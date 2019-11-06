package main

import Cil.CilLexer
import Cil.CilParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import parser.cil.DeclVisitor
import parser.generic.AppDomain
import java.io.FileReader
import java.util.*


fun main() {
    var appDomain = AppDomain()

    var reader = FileReader("./test/test.il");

    var stream = CharStreams.fromReader(reader, "useless");
    var lexer = CilLexer(stream)

    val tstream = CommonTokenStream(lexer);

    var parser = CilParser(tstream)
    var tree = parser.decls()
    var rootVisitor = DeclVisitor(appDomain)
    for(decl in tree.children) {
        decl.accept(rootVisitor)
    }

    var stack = Stack<Long>();
    var locals = Array<Long>(2) { 0 };

    for(instruction in appDomain.entryPoint.instructions) {
        when(instruction.instruction) {
            "nop" -> { }
            "ldc.i4.1" -> stack.push(1)
            "stloc.0" -> locals[0] = stack.pop()
            "ldc.i4.3" -> stack.push(3)
            "stloc.1" -> locals[1] = stack.pop()
            "ldloc.0" -> stack.push(locals[0])
            "ldloc.1" -> stack.push(locals[1])
            "add" -> stack.push(stack.pop() + stack.pop())
            "call" -> println(stack.pop())
            "ret" -> { }
        }
    }

    println(rootVisitor)
}






