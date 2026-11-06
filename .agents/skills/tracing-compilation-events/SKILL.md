---
name: tracing-compilation-events
description: Logs every compilation event with timing, tier (T1/T2), success/failure, and invalidation reasons. Use to verify hot code is compiling, diagnose compilation failures/bailouts, track recompilation cycles, and understand tiered compilation behavior. Shows WHEN compilation happens. Combine with detecting-performance-warnings to understand WHY compilation fails.
---

# Tracing Compilation Events

Logs every compilation event with timing, tier levels, success/failure status, and invalidation reasons. Essential for understanding what the compiler is doing.

## When to Use This Skill

- Verify hot code is compiling
- Diagnose compilation failures and bailouts
- Track recompilation cycles
- Understand tiered compilation behavior

## Quick Start

```bash
# Basic compilation trace
<launcher> --experimental-options \
  --engine.TraceCompilation <program>

# With timing details
<launcher> --experimental-options \
  --engine.TraceCompilation \
  --engine.TraceCompilationDetails <program>

# Combined with performance warnings (RECOMMENDED)
<launcher> --experimental-options \
  --engine.TraceCompilation \
  --compiler.TracePerformanceWarnings=all \
  <program> 2>&1 | tee compilation.log
```

## ⚠️ REQUIRED: Fermi Verification (Every Tool Invocation)

**Before running**:
- [ ] Pre-calculate: Expected # of compilations (5-20 for typical benchmark)
- [ ] Smoke test: `<launcher> --experimental-options --engine.TraceCompilation -c 'print 1;'` → Verify compilation events appear

**After running**:
- [ ] Validate: Expected functions appear in trace? YES / NO
- [ ] If NO: **STOP** - Check if functions are hot enough (increase iterations)
- [ ] Save output: `tool-outputs/trace-compilation-[benchmark].txt`

**Gate**: All boxes checked? → Proceed to analysis

## Key Options

| Option | Description |
|--------|-------------|
| `--engine.TraceCompilation` | Basic compilation events |
| `--engine.TraceCompilationDetails` | Detailed timing |
| `--engine.TraceCompilationPolymorphism` | Polymorphic specializations |
| `--engine.CompileOnly=<name>` | Filter to specific function |

## Understanding Output

### Successful Compilation

```
[engine] opt done    root sieve  <tier1>   |Time:    45ms
[engine] opt done    root sieve  <tier2>   |Time:   234ms
```

### Compilation Failure

```
[engine] opt failed  root sieve  |Reason: Bailout
```

### Invalidation

```
[engine] opt deopt   root sieve  |Reason: Assumption invalidated
```

## Event Types

| Event | Meaning | Action |
|-------|---------|--------|
| `opt done` | Compilation succeeded ✅ | Good |
| `opt failed` | Compilation failed ❌ | Investigate reason |
| `opt deopt` | Invalidated ⚠️ | Check for deoptimization loops |
| `opt queued` | Waiting for compilation | Normal |

## Tier Levels

| Tier | Description | Expected |
|------|-------------|----------|
| tier1 | First-tier compilation | Fast, basic optimizations |
| tier2 | Full optimization | Slower, maximum optimization |

## Problem Patterns

### Pattern 1: No Compilation Events

**Symptom**: Function never appears in trace
**Cause**: Not hot enough, or compilation disabled
**Fix**: Check thresholds, verify function is called enough

### Pattern 2: Repeated Deopt Cycles

```
opt done    myFunc  <tier1>
opt deopt   myFunc
opt done    myFunc  <tier1>
opt deopt   myFunc
...repeating...
```

**Cause**: Type instability or deoptimization loop
**Fix**: Use `detecting-deoptimizations` skill

### Pattern 3: Compilation Bailout

```
opt failed  myFunc  |Reason: Bailout
```

**Cause**: Code too complex or unsupported pattern
**Fix**: Use `detecting-performance-warnings` to find barriers

## Integration with Other Skills

| Finding | Next Skill |
|---------|-----------|
| No compilations | Check thresholds |
| Deopt cycles | `detecting-deoptimizations` |
| Bailouts | `detecting-performance-warnings` |
| Still unclear | `compiler-graph-analyst` |

## Related Skills

- `profiling-with-cpu-sampler` - Identify hot functions first
- `detecting-performance-warnings` - Find barriers
- `detecting-deoptimizations` - Track deoptimizations
- `tracing-inlining-decisions` - Inlining behavior

## Reference

```bash
<launcher> --help:engine | grep -i trace
```
