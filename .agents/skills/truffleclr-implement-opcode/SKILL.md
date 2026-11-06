---
name: truffleclr-implement-opcode
description: Implement or fix a CIL instruction in TruffleCLR's IL-to-Truffle-AST compiler (GraphToNodes.kt) with a Truffle DSL node. Use when an .il program hits TODO("not implemented"), wrong arithmetic/compare/branch results, stack type errors, or when adding @Specialization nodes.
---

# Implement a CIL opcode

Paths relative to `truffleclr/language/src/main/kotlin/`.

## Pipeline

1. `parser/cil/MethodVisitor.kt` parses instructions into `main/Instruction.kt` classes. The opcode name before the first dot is `instruction` (`ldc.i4.s` → `"ldc"`); suffixes are in `instructionArgs`. Operand kind selects the subclass: `InstructionNone`, `InstructionI`, `InstructionI8`, `InstructionR`, `InstructionR8`, `InstructionVar`, `InstructionBrTarget`, `InstructionMethod`, `InstructionField`, `InstructionType`, `InstructionString`, `InstructionSwitch`, ...
2. `main/ControlFlowGraph.kt` splits the method into basic blocks.
3. `main/GraphToNodes.kt` `ControlFlowGraph.getNodes` is an if-ladder (one `if (it.instruction == "x" && it is InstructionKind)` per opcode family, preceded by a `//types: "x.y",...` comment) that symbolically executes the evaluation stack: `stack: Stack<Pair<String, ExpressionNode>>` holds (CLR type name, node). Expressions push nodes; side effects append `StatementNode`s to `res`. Blocks with a non-empty stack at the end are merged with the next block.
4. `main/compilationNodes/CompileMethod.kt` wraps the result in a `RootNode`; locals/args map to integer frame-slot indexes (built with `FrameDescriptor.newBuilder()`; kinds chosen by `CorElementType`).

## Add an opcode

1. Find its branch: `grep -n '"<op>"' main/GraphToNodes.kt`. Most unimplemented ones already have a stub with `TODO("not implemented")` and the pop/push shape.
2. Create a node under `nodes/expressions/<area>/` (math, array, object) or `nodes/statements/`, `nodes/controlflow/`. Follow `nodes/expressions/math/Add.kt`:
   ```kotlin
   @NodeInfo(shortName = "not")
   abstract class Not : UnaryExpression() {          // or BinaryExpression() with @NodeChildren(left,right)
       @Specialization fun not(v: Int): Int = v.inv()
       @Specialization fun not(v: Long): Long = v.inv()
   }
   ```
   If no unary base exists, mirror `BinaryExpression.kt` with `@NodeChild("value")`. One `@Specialization` per CLR stack type (int32→Int, int64→Long, F→Double/Float; chars and bytes arrive as Char/Byte/Short per `types/TypeSystem.kt`).
3. Replace the `TODO` with `XxxNodeGen.create(...)` (kapt generates `NodeGen` on build; the IDE shows it unresolved until `./gradlew :language:compileKotlin`). Pop operands in reverse: `s0` = top = right operand, `s1` = left. Push the correct result type string (`"System.Int32"`, `"System.Int64"`, `"System.Double"`, `"Ref"`); downstream `dup`/`stloc` choose frame-slot kinds from it.
4. Control flow nodes set `successors` (indices into the block array); `Return`/`ReturnValue` use `intArrayOf()`.
5. Hot helpers that allocate, format or touch Java collections need `@CompilerDirectives.TruffleBoundary`.

## Known gaps worth knowing

- `conv.*` pushes the value unchanged typed `System.Int32` — wrong for `conv.r8`, `conv.i8`, `conv.u1`. Fixing it needs a `Convert` node keyed on `instructionArgs`.
- `.un` and `.ovf` variants are mostly treated as signed/unchecked.
- `switch`, `throw`, `leave`, `endfinally`, `calli`, `jmp`, `localloc`, `shr.un`, `not` are TODO.
- The traversal is "neither BFS nor DFS" (see file doc comment); block-ordering bugs surface as wrong stack contents at merges.

## Verify

Write a minimal C# program that exercises the opcode (skill `truffleclr-add-test-program`), confirm the `.il` contains it, then build and run the tests (skill `truffleclr-build-run`).
