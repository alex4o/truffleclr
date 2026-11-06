---
name: tracing-execution-counts
description: Counts exact execution frequencies (not time) at function/statement level. Shows interpreted vs compiled execution split. Use to verify functions compile (>95% compiled), understand control flow patterns, and validate algorithmic complexity. Complements profiling-with-cpu-sampler by showing frequency rather than duration.
---

# Tracing Execution Counts

Counts exact execution frequencies (NOT time) at function and statement level. Complements CPU Sampler by showing HOW OFTEN code runs rather than how much time it takes.

## When to Use This Skill

- Verify functions are compiling (aim for >95% compiled executions)
- Understand control flow patterns
- Validate algorithmic complexity (O(n) vs O(n²))
- Quantify how often code paths execute

## Quick Start

```bash
# Basic execution count tracing
<launcher> --cputracer <program>

# With tier breakdown (RECOMMENDED)
<launcher> --cputracer --cputracer.TraceTiers=true <program>

# Per-statement granularity
<launcher> --cputracer --cputracer.TraceStatements=true <program>
```

## ⚠️ REQUIRED: Fermi Verification (Every Tool Invocation)

**Before running**:
- [ ] Pre-calculate: Expected call counts (based on algorithm complexity, e.g., O(n²) for nested loops)
- [ ] Smoke test: `<launcher> --cputracer -c 'var x = 0; for (var i = 0; i < 10; i = i + 1) { x = x + 1; }'` → Verify counts

**After running**:
- [ ] Validate: Counts within 1 OOM of estimate? YES / NO
- [ ] If NO: **STOP** - Either algorithm issue or wrong estimate (recalculate)
- [ ] Save output: `tool-outputs/cpu-tracer-[benchmark].txt`

**Gate**: All boxes checked? → Proceed to analysis

## Key Options

| Option | Description | Recommended |
|--------|-------------|-------------|
| `--cputracer.TraceTiers=true` | Show interpreted vs compiled | **Always use** |
| `--cputracer.TraceStatements=true` | Statement-level detail | When needed |
| `--cputracer.FilterRootName=<name>` | Filter by function | Focus analysis |
| `--cputracer.Output=json` | JSON output | For parsing |
| `--cputracer.OutputFile=<file>` | Save to file | For analysis |

## Understanding Output

### Sample Output with Tiers

```
Tracing Histogram. Counted 1234567 executions.

Name          || Count       || Interpreted | Compiled
queens        || 500000 40%  || 2.1%        | 97.9%      ✅
hasConflict   || 750000 60%  || 1.8%        | 98.2%      ✅
```

### Interpretation

| Compiled % | Status | Action |
|------------|--------|--------|
| >95% | ✅ Good | Code is well-optimized |
| 80-95% | ⚠️ Check | May have warmup or minor issues |
| <80% | ❌ Problem | Compilation failures or deoptimization |

## Key Insights

### Frequency vs Time
- **CPU Sampler**: Shows WHERE time is spent
- **CPU Tracer**: Shows HOW OFTEN code runs

A function called 1M times at 1µs each = 1 second total.
A function called 100 times at 10ms each = 1 second total.

Same time, very different optimization strategies!

### Algorithmic Complexity

```
Expected for queens(N=8):
- hasConflict called ~92 times per queen placement
- Total calls = O(N!)

If counts much higher → algorithm issue
If counts much lower → early termination bug
```

## Integration with Other Skills

| Finding | Next Skill |
|---------|-----------|
| Low compiled % | `tracing-compilation-events` |
| Unexpected counts | Review algorithm |
| Hot functions | `profiling-with-cpu-sampler` for time |

## Related Skills

- `profiling-with-cpu-sampler` - Time-based profiling
- `tracing-compilation-events` - Why compilation fails
- `detecting-performance-warnings` - Optimization barriers

## Reference

```bash
<launcher> --help:cputracer
```
