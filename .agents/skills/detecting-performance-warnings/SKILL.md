---
name: detecting-performance-warnings
description: Detects optimization barriers during Truffle compilation. Identifies virtual calls, non-constant stores, unresolved type checks, and TruffleBoundary issues that prevent peak performance. Reports exact source locations with stack traces. Use as essential step for eliminating compilation warnings. ONLY works with traditional Truffle DSL nodes (NOT Bytecode DSL).
---

# Detecting Performance Warnings

Detects optimization barriers during Truffle compilation. Essential for finding virtual calls, type instabilities, and boundary issues that prevent peak performance.

## When to Use This Skill

- Find optimization barriers preventing compilation
- Identify virtual calls that should be direct
- Detect non-constant stores and type check failures
- Locate TruffleBoundary issues in hot paths

**Use EARLY** in performance investigation - often reveals root causes quickly.

## Quick Start

```bash
# Basic warning detection
<launcher> --experimental-options \
  --compiler.TracePerformanceWarnings=all <program>

# Combined with compilation trace (RECOMMENDED)
<launcher> --experimental-options \
  --compiler.TracePerformanceWarnings=all \
  --engine.TraceCompilation \
  <program> 2>&1 | tee warnings.log
```

## ⚠️ REQUIRED: Fermi Verification (Every Tool Invocation)

**Before running**:
- [ ] Pre-calculate: Expected warnings (0-10 for well-optimized code, 0 is ideal)
- [ ] Smoke test: `<launcher> --experimental-options --compiler.TracePerformanceWarnings=all -c 'print 1;'` → Verify no false warnings

**After running**:
- [ ] Validate: Warning count within expectation? YES / NO
- [ ] If many warnings (>20): **Document each** - these are critical optimization barriers
- [ ] Save output: `tool-outputs/perf-warnings-[benchmark].txt`

**Gate**: All boxes checked? → Proceed to analysis

## Key Options

| Option | Description |
|--------|-------------|
| `--compiler.TracePerformanceWarnings=all` | All warning types |
| `--compiler.TracePerformanceWarnings=call` | Call-related only |
| `--compiler.TracePerformanceWarnings=instanceof` | Type checks only |
| `--compiler.TracePerformanceWarnings=store` | Store operations only |

## Understanding Output

### Virtual Call Warning (Critical!)

```
[engine] Performance warning: observed virtual call at
  com.example.CallNode.call(CallNode.java:42)
  Reason: CallTarget is not constant
```

**Fix**: Add `@Cached` for CallTarget lookup.

### Type Check Warning

```
[engine] Performance warning: observed type check at
  com.example.TypeNode.execute(TypeNode.java:55)
  Reason: Type is not constant
```

**Fix**: Add type-specific specializations.

### Store Warning

```
[engine] Performance warning: observed store at
  com.example.StoreNode.execute(StoreNode.java:33)
  Reason: Store is not frame or final field
```

**Fix**: Use frame slots or final fields.

## Warning Severity

| Warning Type | Severity | Impact |
|-------------|----------|--------|
| Virtual call | Critical | Blocks inlining, 10-100x slower |
| Type check | High | Prevents specialization |
| Store | Medium | May escape optimization |

## Integration with Other Skills

| Finding | Next Skill |
|---------|-----------|
| Many virtual calls | `compiler-graph-analyst` for details |
| Type instability | `detecting-deoptimizations` |
| Still confused | `fetching-truffle-documentation` |

## Common Fixes

### Virtual Call → Direct Call

```java
// ❌ BAD
CallTarget target = lookupFunction(name);
target.call(args);

// ✅ GOOD
@Specialization(guards = "func == cachedFunc")
Object cached(@Cached("func") Function cachedFunc,
              @Cached("cachedFunc.getCallTarget()") CallTarget target) {
    return target.call(args);
}
```

### Type Check → Specialization

```java
// ❌ BAD
if (value instanceof Integer) { ... }

// ✅ GOOD
@Specialization
int doInt(int value) { ... }
```

## Related Skills

- `profiling-with-cpu-sampler` - Identify hot functions first
- `tracing-compilation-events` - See compilation status
- `compiler-graph-analyst` - Deep IR analysis
- `fetching-truffle-documentation` - API reference

## Reference

```bash
<launcher> --help:compiler:internal | grep -i trace
```
