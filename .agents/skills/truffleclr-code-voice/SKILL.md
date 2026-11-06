---
name: truffleclr-code-voice
description: The author's measured pre-AI Kotlin style for TruffleCLR (a code "voiceprint" from commit 535b251). Use when writing or reviewing Kotlin in this repo so new code reads like the author's, when restyling AI-written code, or when checking a diff for AI tells.
---

# TruffleCLR code voiceprint

How to use: imitate **Style rules**, either way is fine for **Neutral**, never imitate or "fix" **Defects** unless asked, remove **Tells** from new code. Priority when they conflict: behaviour and Truffle performance > minimal expression (skill `minimal-expression`) > this profile. Only edit lines you are already changing; leave original 2020 lines alone.


## Summary
- Authority: the pre-AI tree at commit 535b251 (2019–2020), all by the author.
- Corpus: 101 Kotlin files / 6,860 lines total; H excludes the 1,271-line generated-and-edited GraphToNodes.kt: 100 files / 5,589 lines.
- Voice: direct, explicitly typed, block-bodied Kotlin; small domain classes and annotation-driven Truffle nodes.
- Collections and extension helpers coexist with mutable state and ordinary loops; scope-function pipelines are absent.
- Preserve behavior, contracts, visibility and diagnostics; imitate STYLE, allow NEUTRAL, never introduce DEFECTS.

## Measurements table
H = primary Kotlin excluding GraphToNodes; G = GraphToNodes only. Counts shown as **count (per 1,000 physical lines)** unless stated.
Primary includes launcher tests (one of its two files). ANTLR Java and node_modules excluded. Secondary is separate, never pooled.
Reproduce: `git archive 535b251 | tar -x -C /tmp/voice-base && node scripts/measure.mjs /tmp/voice-base /tmp` (writes measurements.json, supplement.json). Run it on new code to compare against these rates.
Method: lexical script plus rg/manual source checks, not a Kotlin AST. Comments/literals masked for code counts; interpolation internals may be missed.
Raw-text proxies: template markers, comment lines and commented-code candidates. Named-argument proxy includes annotation arguments; not a count of distinct call sites.
Nullable count is a type-token proxy, not unique declarations. Function signatures/lengths are heuristic; parameter types and non-Unit block-body return annotations are required Kotlin syntax, not independent style preferences.

| Measure | H | G |
|---|---:|---:|
| Files / physical lines | 100 / 5,589 | 1 / 1,271 |
| val / var | 294 (52.6) / 162 (29.0) | 197 (155.0) / 4 (3.1) |
| val:var ratio | 1.81:1 | 49.25:1 |
| when / if (includes else-if) | 14 (2.5) / 118 (21.1) | 1 (0.8) / 171 (134.5) |
| else-if links, not chain count | 13 (2.3) | 9 (7.1) |
| !! / ?. / ?: | 40 (7.2) / 5 (0.9) / 5 (0.9) | 6 (4.7) / 4 (3.1) / 0 |
| .let / .apply / .also | 0 / 0 / 0 | 1 (0.8) / 0 / 0 |
| .run / Kotlin with | 1 (0.2) / 0 | 0 / 0 |
| Functions: block / expression / bodyless | 353 / 7 / 6 | 1 / 0 / 0 |
| Explicit return annotations / functions | 310 / 366 (84.7%) | 1 / 1 |
| Typed function parameters / extension functions | 406 / 9 (1.6) | 4 / 1 (0.8) |
| by lazy | 19 (3.4) | 0 |
| error / TODO calls | 25 (4.5) / 20 (3.6) | 39 (30.7) / 45 (35.4) |
| require / check / requireNotNull / checkNotNull | 0 / 0 / 0 / 0 | 0 / 0 / 0 / 0 |
| throw / try / catch | 3 / 3 / 3 (each 0.5) | 0 / 0 / 0 |
| Class declarations / data classes | 126 / 16 (2.9) | 0 / 0 |
| Named objects / anonymous objects / companions | 3 / 2 / 14 | 0 / 0 / 0 |
| sealed declarations | 0 | 0 |
| private / protected modifiers | 10 (1.8) / 35 (6.3) | 0 / 0 |
| Explicit public / internal declaration modifiers | 0 / 0 | 0 / 0 |
| Nullable type-token proxy | 117 (20.9) | 0 |
| Selected collection operations¹ / for / while | 62 (11.1) / 29 (5.2) / 6 (1.1) | 22 (17.3) / 1 / 1 |
| Trailing-lambda proxy² | 99 (17.7) | 18 (14.2) |
| String-template marker proxy | 129 (23.1) | 23 (18.1) |
| Named-argument proxy (including annotations) | 109 (19.5) | 0 |
| File lines: median / p90 / max | 33 / 122 / 431 | 1,271 |
| Function lines: median / p90 / max³ | 3 / 10 / 105 | 1,241 |
| Line characters: median / p90 / max | 25 / 59 / 264 | 37 / 74 / 444 |
| Lines over 120 characters | 23 (4.1) | 7 (5.5) |
| Blank lines | 880 (15.7%) | 142 (11.2%) |
| Blank runs: 1 / 2 / 3 lines | 768 / 47 / 6 | 113 / 13 / 1 |
| Space-indented lines on four-column grid | 3,313 / 3,479 (95.2%); no tab-leading lines | 979 / 988 (99.1%); no tabs |
| Comment-only lines / //-only lines | 329 (58.9) / 114 (20.4) | 207 (162.9) / 197 (155.0) |
| KDoc blocks / other block comments | 57 (10.2) / 10 (1.8) | 1 / 0 |
| @param / @return / @throws documentation tags | 0 / 0 / 0 | 0 / 0 / 0 |
| Commented-code candidate lines⁴ | 83 (14.9) | 130 (102.3) |
| Imports / wildcard imports | 620 / 17 (2.7% of imports) | 15 / 9 (60%) |
| Semicolon tokens outside comments/strings | 59 (10.6) | 2 (1.6) |
| if-space / if-no-space | 92 / 26 | 171 / 0 |
| Closing brace + else: same / next line | 69 / 6 | 27 / 0 |
| @Specialization / @NodeInfo | 116 (20.8) / 49 (8.8) | 0 / 0 |
| @NodeChild / @Child / @Children | 6 / 17 / 7 | 0 / 0 / 0 |
| @CompilationFinal / @TruffleBoundary | 33 (5.9) / 24 (4.3) | 0 / 1 |
| Classes ending Node | 4 / 126 | none |
| PascalCase class names | 123 / 126 | none |
| lowerCamelCase function names / framework snake_case | 359 / 7 | 1 / 0 |
| Backtick identifiers (occurrences) | 33: only object and class | 1: object |

¹ map/mapIndexed/mapNotNull/flatMap/filter/filterNot/forEach/forEachIndexed/fold/reduce/associate variants/groupBy/any/all/find/first/firstOrNull/indexOfFirst/joinToString/zip; calls, not chains. Java stream calls also count.
² Selected call-name regex, including lazy and parser match/case/default; approximate, not all lambdas or proof of chaining. Collection lambdas are common despite near-zero scope functions.
³ Includes expression-body first-line spans; large multiline expression bodies can be underestimated. G is the complete braced extension. H's longest measured braced function: parser/cil/MethodVisitor.kt:36.
⁴ Heuristic // lines containing code punctuation/keywords/calls; not a verified dead-code count. Comments embedded in code lines are not in comment-only totals.
Manual disambiguation: runtime/Object.kt:105 calls shape.check, not Kotlin check; ControlFlowGraph.kt:62 calls Graphviz .with, not the scope function. Backticked object is not an object declaration.

### Generator boundary and secondary corpus
- G's independent opcode if-ladder, s0/s1 stack temporaries, Pair(type,node) pushes, type guards, TODO stubs and //types labels match emitter scaffolding. Do not infer an author preference for giant functions or 49:1 val:var from G.
- Evidence: G:19–27 explicitly claims opcode.def generation; opparse/kotlin.js:83–118,122–156 emits the scaffolding. The script actually reads op.csv, not opcode.def; archive alone cannot prove exact line ancestry.
- G has 100 instruction-equality/type guards, 45 active not-implemented TODOs and 38 NodeGen.create calls. Concrete arithmetic/return node construction (G:100–125) and block finalization (G:1239–1267) go beyond the emitter's null-node TODO template; consistent with hand edits, not independently dated.
- Secondary sizes (lines/blank/max width): truffleclr/build.gradle 28/6/66; settings.gradle 4/1/31; opparse/index.js 13/4/144; kotlin.js 158/55/198; bench/plot.py 35/14/97.
- Secondary evidence is weak and language-specific: plain Gradle blocks; JS let/const, arrow map/groupBy transforms, mixed quotes/semicolons; Python a straight-line plotting script with short df/ax names. Do not export Kotlin rules mechanically to these languages.

## Style rules (imitate)
Paths below are relative to truffleclr/language/src/main/kotlin unless prefixed with launcher/ (relative to truffleclr). G above abbreviates main/GraphToNodes.kt.
1. **STYLE — Block-bodied functions.** Prefer ordinary braces and return, even for short arithmetic; supply the required result types and routinely omit Unit. This does not imply adding optional annotations everywhere. Do not rewrite every one-liner into an expression body.
   - nodes/expressions/math/Add.kt:25–27: fun add(left: Int, right: Int): Int { return left + right }; metadata/IlType.kt:42: override fun toString(): String { return name }.
2. **STYLE — Small domain classes; behavior-sized methods.** Use descriptive operation names, PascalCase classes and lowerCamelCase helpers; retain framework-mandated names. AST operation classes need no universal Node suffix.
   - nodes/expressions/math/Add.kt:7: abstract class Add(): BinaryExpression(); metadata/IlType.kt:32: fun makeArray(rank: Int): IlType. Common abbreviations include ctx, env, arg, res, id; do not force expansions everywhere.
3. **STYLE — Direct Truffle DSL structure.** Put @NodeInfo on the class and @Specialization directly above typed overloads; use the established base class/child declarations. Keep framework annotations semantically required, never decorative.
   - nodes/expressions/math/Add.kt:6–10: @NodeInfo(shortName = "add") … @Specialization; nodes/expressions/math/BinaryExpression.kt:10–11: @NodeChildren(NodeChild("left"), NodeChild("right")) … BinaryExpression : ExpressionNode().
4. **STYLE — Local vals, explicit mutable state when needed.** Prefer val for new stable bindings without pretending the author avoided var, mutable collections or stateful classes. Do not change mutation semantics for appearance.
   - metadata/IlType.kt:8–11: var methods … mutableMapOf(), var extends: IlType? = null; main/ControlFlowGraph.kt:34–36: val visited … val stack … stack.push(...).
5. **STYLE — Direct control flow, selective collection transforms.** Use if for decisions, when for type/value dispatch; map/filter and trailing lambdas for transformations, loops for stateful traversal. Avoid scope-function wrapping of ordinary statements.
   - parser/cil/Util.kt:95–103: return when (this) { is TypeClassContext -> … }; main/ControlFlowGraph.kt:180–196: for (block in graph.nodes) … for (v in graph.nodes.filter { … }).
6. **STYLE — Domain extension helpers and lazy derived fields.** Existing parser/compiler helpers can be top-level extensions; cache derived data with by lazy when semantics warrant it. Do not invent extension layers merely to match a count.
   - parser/cil/Util.kt:66: fun TypeSpecContext.toClassName(): String; main/ControlFlowGraph.kt:115–119: val dominators by lazy { val lt = LengauerTarjan(this); lt.compute(); lt }.
7. **STYLE — Direct failures and short contextual diagnostics.** For existing internal unsupported states, error("… $context") fits better than a new validation framework. Preserve required exception classes; never replace boundary validation with !! or TODO.
   - parser/cil/Util.kt:75: error("Unable to determine typeSpec for $parent (line: …)"); runtime/Object.kt:51: throw UnknownIdentifierException.create(member).
8. **STYLE — String templates for diagnostic/debug representations.** Use compact domain descriptions, not verbose explanatory messages or extra builders.
   - nodes/expressions/math/Add.kt:45: return "(add …)" interpolates children.joinToString; metadata/IlType.kt:37: IlType("$name[]", CorElementType.ARRAY).
9. **STYLE — Concise, purposeful comments.** Brief KDoc introductions and local // explanations are normal; don't add tag-heavy API manuals to trivial members. Explain intent/constraints, not every statement. Preserve existing tone without manufacturing mistakes or self-deprecation.
   - main/ControlFlowGraph.kt:16–18: “Control Flow Graph class…”; parser/cil/Util.kt:173–176: “Transforms cil types to be CTS type names” followed by an informal design observation.
10. **STYLE — Conventional visual skeleton.** Four-space indentation, opening braces on declaration/control lines, usually one blank line between methods/groups. Prefer readable short lines, but retain meaningful long expressions rather than enforcing a rigid column cap.
    - nodes/expressions/math/Add.kt:9–27: repeated annotation/method/blank-line groups; main/ControlFlowGraph.kt:125: one long filter/map/reduce expression.
11. **STYLE — Short domain packages and ordinary imports.** Follow the existing main, metadata, nodes (expressions/math/object, controlflow, internal), parser.cil, runtime, types, util layout; one dominant class per small file, related variants may share a file. Escape Kotlin keywords only when required.
    - nodes/expressions/math/Add.kt:1–4: package nodes.expressions.math plus explicit imports; main/Instruction.kt:22–38: related Instruction data classes together. runtime/Object.kt:5: import …api.`object`.DynamicObject (backticks, not a naming flourish).

## Neutral
- **NEUTRAL — Visibility is usually implicit, not universally private.** Existing protected DSL helpers are common. Keep API visibility and annotation access requirements intact; counts are not permission to expose members.
- **NEUTRAL — Explicit local/property types vs inference.** Both occur, including explicit types where inference is possible. Match adjacent code; parameter types are language-required.
- **NEUTRAL — when vs if/else-if, loop vs collection expression, named vs positional arguments.** All have legitimate use; no blanket conversion. Most visible named arguments are Truffle annotations, not evidence for naming every call argument.
- **NEUTRAL — Null handling.** !! is more common than safe calls/Elvis, but all occur; retain established null contracts, never introduce unchecked assumptions to imitate the ratio.
- **NEUTRAL — data classes, objects and companions.** Compact instruction records, singleton tables and JVM static interop have distinct roles; not every record/helper should become one.
- **NEUTRAL — Formatting edges.** if( versus if (, }else{ versus } else {, empty constructor (), wildcard imports and occasional semicolons vary. Follow the touched neighborhood, default to spaced braces and no gratuitous semicolons; no global cleanup.
- **NEUTRAL — Rare expression bodies, larger algorithm files, terse algorithm abbreviations.** Present and acceptable. Framework visitor snake_case and three lower-case export classes are contextual exceptions, not a general naming scheme.
- **NEUTRAL — Secondary languages.** Mixed JS quotes/semicolons and Python whitespace are not reliable identity rules; retain local conventions without copying accidental global variables or brittle script assumptions.

## Defects (do not imitate)
- **DEFECT — Misspellings:** launcher/src/main/kotlin/App.kt:20 “Evidance”; nodes/expressions/math/Reminder.kt:7 (remainder); metadata/IlType.kt:10 attribtes, :48 isPrimiteive. Never introduce these into new names/comments; don't rename existing APIs unless asked.
- **DEFECT — Stale/commented-out experiments:** main/ControlFlowGraph.kt:46–49,69–71; parser/cil/Util.kt:164. Don't seed dead code, debug printlns or commented alternatives to increase authenticity.
- **DEFECT — Unimplemented paths / empty diagnostics:** TODOs and generator error("") are incompleteness, not voice. Don't add TODOs instead of requested implementations or discard useful error messages.
- **DEFECT — Unused scaffolding:** parser/cil/Util.kt:55–61 test computes an unused methodName; :169–171 empty ParsedType. Don't introduce unused locals/types/parameters. Required framework override parameters are not inherently defects.
- Existing bugs, unsafe assumptions and duplication are not style-edit targets. Preserve them unless separately authorized to fix; report concerns rather than silently changing behavior.

## Tells (avoid)
These are corpus-relative mismatch signals, not proof of AI authorship; preserve a construct when correctness/API requirements need it.
- Scope-function-heavy “idiomatic Kotlin”: H let/apply/also/with = 0; run = 1 (0.2/1k); G has one let around its instruction ladder. Collection lambdas are NOT a tell.
- Added blanket precondition scaffolding: Kotlin require/check/requireNotNull/checkNotNull = 0 throughout H and G. Do not remove needed validation from input-facing code.
- New sealed taxonomies for ordinary records: sealed = 0; author uses ordinary/data classes. Do not replace an existing sealed contract merely to restyle.
- Mechanical expression-body compression: only 7/366 H functions (1.9%) are expression-bodied; braced overloads are the norm.
- Blanket explicit public/internal modifiers: 0; automatic private-everywhere also mismatches (only 10 private tokens, 1.8/1k). API preservation wins.
- Tagged documentation boilerplate: @param/@return/@throws tags = 0. KDoc itself is NOT a tell: 57 blocks (10.2/1k).
- Universal Node suffix for new AST operation names: only 4/126 H class names end Node; Add, LoadField and ConsoleWrite illustrate the shorter domain names. Generated NodeGen names are framework artifacts.

## Truffle-node template
Shape adapted from nodes/expressions/math/Add.kt:6–26; illustrative Int specialization, not a complete opcode implementation. Reuse the existing BinaryExpression child declarations.
```kotlin
@NodeInfo(shortName = "add")
abstract class Add(): BinaryExpression() {

    @Specialization
    fun add(left: Int, right: Int): Int {
        return left + right
    }
}
```
