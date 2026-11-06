---
name: tracing-inlining-decisions
description: Shows inlining decisions during compilation with call tree and reasons for inline/don't-inline. Use to verify critical calls are inlined, understand why inlining failed (too large, recursive, boundary), and optimize method sizes. Good inlining = better compilation. Recursive functions show 'not inlined' - expected behavior for Bytecode DSL limitation.
---

# Tracing Inlining Decisions

Shows inlining decisions during compilation with call tree structure and reasons. Essential for understanding why calls aren't being optimized.

## When to Use This Skill

- Verify critical calls are being inlined
- Understand why inlining failed
- Optimize method sizes for better inlining
- Debug recursive function compilation

## Quick Start

```bash
# Basic inlining trace
<launcher> --experimental-options \
  --engine.TraceInlining <program>

# Combined with compilation trace (RECOMMENDED)
<launcher> --experimental-options \
  --engine.TraceInlining \
  --engine.TraceCompilation \
  <program> 2>&1 | tee inlining.log

# Focus on specific function
<launcher> --experimental-options \
  --engine.TraceInlining \
  --engine.CompileOnly="*hotFunction*" \
  <program>
```

## ⚠️ REQUIRED: Fermi Verification (Every Tool Invocation)

**Before running**:
- [ ] Pre-calculate: Expected hot helper functions to inline (list 2-5 function names)
- [ ] Smoke test: `<launcher> --experimental-options --engine.TraceInlining -c 'print 1;'` → Verify inlining decisions appear

**After running**:
- [ ] Validate: Critical functions inlined as expected? YES / NO
- [ ] If NO: **Document why** (budgetExhausted, TooLarge, TruffleBoundary)
- [ ] Save output: `tool-outputs/trace-inlining-[benchmark].txt`

**Gate**: All boxes checked? → Proceed to analysis

## Key Options

| Option | Description |
|--------|-------------|
| `--engine.TraceInlining` | Show inlining decisions |
| `--engine.TraceInliningDetails` | Detailed reasoning |
| `--engine.CompileOnly=<name>` | Filter to specific function |

## Understanding Output

### Inlined Successfully

```
[engine] Inlined: hasConflict
  Reason: trivialSize
```

### Not Inlined

```
[engine] Not inlined: recursiveFunc
  Reason: RecursiveInlining
```

```
[engine] Not inlined: bigFunction
  Reason: budgetExhausted
```

## Inlining Reasons

### Good (Inlined)

| Reason | Meaning |
|--------|---------|
| `trivialSize` | Small enough to inline |
| `forced` | @Specialization forced inline |
| `relevant` | Deemed performance-relevant |

### Bad (Not Inlined)

| Reason | Meaning | Fix |
|--------|---------|-----|
| `RecursiveInlining` | Recursive call | Expected for recursion |
| `budgetExhausted` | Inlining budget used | Reduce method sizes |
| `TooLarge` | Method too big | Split method |
| `TruffleBoundary` | Marked as boundary | Review boundary usage |
| `notRelevant` | Not performance-critical | May be OK |

## Problem Patterns

### Pattern 1: Budget Exhausted for Hot Functions

**Symptom**: Critical function not inlined due to budget
**Fix**: Reduce sizes of other methods, or increase budget

### Pattern 2: Unexpected Boundary

**Symptom**: Hot call not inlined due to TruffleBoundary
**Fix**: Remove boundary if not needed, or restructure

### Pattern 3: Too Many Recursive Levels

**Symptom**: Recursive function shows "RecursiveInlining"
**Expected**: Normal for recursive algorithms (Bytecode DSL limitation)

## Integration with Other Skills

| Finding | Next Skill |
|---------|-----------|
| Budget issues | Refactor code, reduce sizes |
| Boundaries | Review TruffleBoundary usage |
| Still slow | `profiling-with-cpu-sampler` |

## Related Skills

- `profiling-with-cpu-sampler` - Identify hot functions first
- `tracing-compilation-events` - Overall compilation status
- `detecting-performance-warnings` - Find barriers
- `fetching-truffle-documentation` - API reference

## Reference

```bash
<launcher> --help:engine | grep -i inlin
```
