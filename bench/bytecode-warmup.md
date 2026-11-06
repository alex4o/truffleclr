# Bytecode interpreter warm-up investigation

Branch: stack/01-bytecode-interpreter. Interpreter revision: 2ce0364.
No source optimization was retained: the tested approaches did not meet the
short-run targets without compromising other workloads. This is evidence about
these experiments, not proof that further optimization is impossible.

## Protocol and final verification

GraalVM CE 25.5.5.0.3, JDK 25, unchanged engine compilation thresholds.
Each timing is the launcher's Completed-in value from a fresh JVM. Five serial
runs per workload; tracing and profiling runs excluded from timing medians.
No benchmark-specific interpreter behavior or changes to workloads.

Final clean :launcher:installDist and :launcher:test: BUILD SUCCESSFUL,
33 tests, zero failures/errors. Historical compare.sh over the original 23
programs: passed=22 failed=1. The sole difference is **accepted spectralnorm**:
the old AST compiler printed its symbolic stack before failing on stind; the
new compiler fails clearly on the same unsupported opcode without that debug
println. Do not restore this obsolete diagnostic or change the baseline to hide it.

| Workload | Post-flags reference ms | Final five samples ms | Median ms |
|---|---:|---|---:|
| binary_trees | 1767 | 1685, 1676, 1720, 1715, 1716 | 1715 |
| Pfannkuchen | 5742 | 347, 351, 536, 545, 356 | 356 |
| richards | 236 | 251, 221, 220, 218, 220 | 220 |
| n_body | 132 | 205, 244, 246, 250, 252 | 246 |
| nqueen | 49 | 76, 79, 74, 71, 72 | 74 |
| func_fib | 87 | 109, 109, 110, 109, 112 | 109 |

The post-flags references are the original single-run measurements, not five-run
medians. The three short workloads remain above the approximately 145/54/96 ms
targets. Longer workloads retain their gains; Pfannkuchen retains tier-2 OSR.

## Controlled lever experiments

Each row is a five-run median in milliseconds, with other settings held at the
interpreter revision above. Initial and final unchanged-source controls show
measurement drift; small differences are not convincing improvements.

| Experiment | binary_trees | Pfannkuchen | richards | n_body | nqueen | func_fib |
|---|---:|---:|---:|---:|---:|---:|
| baseline | 1709 | 350 | 226 | 250 | 76 | 111 |
| be-int | 1757 | 313 | 246 | 262 | 84 | 115 |
| be-long | 1760 | 562 | 238 | 269 | 82 | 117 |
| be-double | 1750 | 514 | 240 | 288 | 81 | 117 |
| be-boolean | 1756 | 395 | 239 | 275 | 84 | 120 |
| be-combined | 1797 | 345 | 290 | 284 | 94 | 134 |
| no-quickening | 1715 | 355 | 220 | 253 | 76 | 112 |
| force-quickening | 1763 | 409 | 240 | 254 | 81 | 118 |
| bci-frame | 1769 | 396 | 248 | 262 | 85 | 117 |
| uncached-16 | 1847 | 389 | 244 | 277 | 83 | 122 |
| uncached-0 | 1784 | 555 | 241 | 264 | 80 | 115 |
| uncached-128 | 1876 | 650 | 266 | 263 | 92 | 128 |
| argument-locals | 2128 | 708 | 312 | 339 | 115 | 163 |
| argument-locals-be | 2119 | 422 | 387 | 339 | 135 | 171 |
| constant-comparisons | 1691 | 350 | 223 | 250 | 75 | 111 |
| no-threaded-switch | 1697 | 541 | 216 | 240 | 74 | 109 |
| tail-handlers | 1730 | 358 | 224 | 257 | 78 | 124 |
| fallthrough | 1733 | 383 | 228 | 265 | 80 | 119 |
| hot-specialization-order | 1698 | 473 | 221 | 250 | 74 | 112 |
| typed-arguments | 1731 | 361 | 227 | 255 | 76 | 112 |
| typed-arguments-be | 1798 | 350 | 293 | 301 | 99 | 136 |
| on-demand-internals | 1798 | 384 | 253 | 275 | 82 | 117 |
| final-control | 1754 | 368 | 232 | 273 | 79 | 116 |

- BE: individual primitive types and combined int/long/double/boolean generally
  increased short-run cost. Retained boxingEliminationTypes is empty.
- Quickening: disabling it was neutral; forcing int/double/boolean quickenings
  did not help. Existing quickening remains enabled.
- Arguments: copying Object[] arguments into BytecodeLocals was substantially
  worse, including with BE. Typed constant-index argument loads were neutral
  without BE and worse with it. The Truffle call ABI still uses Object[].
- Constants: targets, shapes, keys and constructor arity already use constant
  operands. Splitting comparison conditions into separate operations was neutral.
- Uncached interpreter: thresholds 0/16/128 did not improve warm-up. The cached
  interpreter remains selected. These are interpreter-tier thresholds, not
  altered engine compilation thresholds.
- BCI: storing the index in the frame did not help; installed default false
  remains. Threaded-switch/tail-handler alternatives did not offer a safe gain.
- Fallthrough removal, numeric-specialization ordering and on-demand builtin
  construction did not yield convincing improvements.
- Disabling instruction tracing/rewriting together hit a processor-generated
  Java error: missing publishOldBytecodes(). No generated-code patch retained.

A further structural experiment selected single-specialization int/double
arithmetic and comparisons only for operands proven by the frontend. It removed
specialization checks but retained Object frame boxing. Generic operations also
use singleton nodes, so this did not remove per-site node allocation.

| Workload | Control | Static arithmetic | Restored control |
|---|---:|---:|---:|
| binary_trees | 1683 | 1691 | 1684 |
| Pfannkuchen | 529 | 354 | 351 |
| richards | 217 | 225 | 222 |
| n_body | 247 | 250 | 252 |
| nqueen | 76 | 77 | 75 |
| func_fib | 109 | 110 | 110 |

Coverage was deliberately conservative: fib used two typed comparisons and two
typed subtractions; n_body Advance had none because field/call-derived values
remained unknown. This does not rule out a stronger sound type analysis.

## Diagnostic evidence

TraceCompilation, TraceTransferToInterpreter and TraceInlining were used.
Counts below compare initial and restored-source diagnostic runs, not an
optimization-induced before/after change.

| Workload | opt done before/after | opt failed | opt inval before/after | opt deopt before/after |
|---|---|---|---|---|
| binary_trees | 12/12 | 0/0 | 0/0 | 4/4 |
| Pfannkuchen | 4/4 | 0/0 | 0/0 | 1/1 |
| richards | 39/38 | 0/0 | 3/2 | 1/1 |
| n_body | 4/4 | 0/0 | 0/0 | 0/0 |
| nqueen | 1/1 | 0/0 | 0/0 | 0/0 |
| func_fib | 1/1 | 0/0 | 0/0 | 0/0 |

There is no evidence of short-workload deoptimization loops. Inlining traces:
n_body Advance reaches T1 then T2; Sqrt is cutoff at T1 and inlined at T2.
nqueen only completes ToBoolean T1 in the traced short run. Fib completes T1;
recursive T2 inlining starts, bounded at depth four, but no T2 compilation
finishes before exit. Changing compilation thresholds was deliberately excluded.

The Truffle CPU-sampler jar was unavailable. Host JFR sampling at 1 ms was used
instead; it does not provide equivalent guest-tier attribution. Among stacks
containing bytecode execution, n_body had 113/136 top frames in generated
continueAt dispatch; fib had 16/32 in OptimizedCallTarget.doInvoke and 9/32 in
dispatch. nqueen had only 12 such samples, too few for precise attribution.

Temporary instrumentation measured lazy construction medians of 17.6/15.2/10.8 ms
for n_body/nqueen/fib. Removing all of that measured cost alone would not close
the initial-control gaps to target (105/22/15 ms). Instrumentation was removed.
Dispatch/call warm-up is a promising next investigation; these experiments did
not establish a successful optimization or exclude other approaches.
