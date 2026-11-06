---
name: profiling-memory-allocations
description: Experimental allocation profiler tracking memory allocations at guest-language level. Shows allocation sites, object types, and memory pressure patterns. Use to identify allocation-heavy locations, find unnecessary object creation, and understand memory behavior. High allocations in hot loops = optimization opportunity if escape analysis isn't eliminating them.
---

# Profiling Memory Allocations

Experimental allocation profiler tracking memory allocations at the guest-language level. Identifies allocation-heavy locations and unnecessary object creation.

## When to Use This Skill

- Identify allocation-heavy locations in hot loops
- Find unnecessary object creation
- Understand memory behavior patterns
- Detect escape analysis opportunities

**Note**: High allocations in hot loops = optimization opportunity if escape analysis isn't eliminating them.

## Quick Start

```bash
# Basic memory tracing
<launcher> --memtracer <program>

# With stack traces
<launcher> --memtracer --memtracer.TraceStackTraces=true <program>

# Filter by allocation count
<launcher> --memtracer --memtracer.TraceMem=1000 <program>
```

## ⚠️ REQUIRED: Fermi Verification (Every Tool Invocation)

**Before running**:

- [ ] Pre-calculate: Expected allocation count (estimate based on loops/iterations)
- [ ] Smoke test: `<launcher> --memtracer -c 'var a = [1, 2, 3];'` → Verify shows allocations

**After running**:

- [ ] Validate: Actual vs estimate within 1 order of magnitude? YES / NO
- [ ] If NO: **STOP** - Debug tool before proceeding (test with known allocating code)
- [ ] Save output: `tool-outputs/memtracer-[benchmark].txt`

**Gate**: All boxes checked? → Proceed to analysis

## Key Options

| Option                              | Description                     |
| ----------------------------------- | ------------------------------- |
| `--memtracer`                       | Enable memory tracer            |
| `--memtracer.TraceStackTraces=true` | Include allocation stack traces |
| `--memtracer.TraceMem=<bytes>`      | Filter by minimum allocation    |
| `--memtracer.Output=json`           | JSON output format              |
| `--memtracer.OutputFile=<file>`     | Save to file                    |

## Understanding Output

### Sample Output

```
Memory Tracer. Recorded 45678 allocations.

Source Location           || Count   || Size      || Type
queens.lox:42            || 50000   || 400KB     || LoxArray
queens.lox:55            || 25000   || 200KB     || LoxObject
```

## Interpretation

### Allocation Patterns

| Pattern                       | Status     | Action                  |
| ----------------------------- | ---------- | ----------------------- |
| Few allocations in hot path   | ✅ Good    | Escape analysis working |
| Many allocations in hot loop  | ⚠️ Problem | Objects escaping        |
| Allocations only in cold path | ✅ OK      | Expected behavior       |

### High Allocation Sites

If hot loop shows many allocations:

1. Check if objects escape the loop
2. Verify escape analysis is running
3. Consider restructuring to avoid allocation

## Common Issues

### Issue 1: Array Allocations in Loop

```
queens.lox:42  || 50000 allocations
```

**Cause**: Creating arrays inside hot loop
**Fix**: Reuse arrays, or ensure they're eliminated by EA

### Issue 2: Object Allocations for Temporaries

```
Point creation || 100000 allocations
```

**Cause**: Temporary objects not eliminated
**Fix**: Keep objects local, avoid escaping references

## Integration with Other Skills

| Finding           | Next Skill                          |
| ----------------- | ----------------------------------- |
| High allocations  | `compiler-graph-analyst` (check EA) |
| Unclear source    | Add stack traces                    |
| Performance issue | `profiling-with-cpu-sampler`        |

## Related Skills

- `profiling-with-cpu-sampler` - Time-based profiling
- `compiler-graph-analyst` - Check escape analysis
- `detecting-performance-warnings` - Find barriers

## Reference

```bash
<launcher> --help:memtracer
```
