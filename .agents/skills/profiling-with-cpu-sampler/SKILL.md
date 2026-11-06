---
name: profiling-with-cpu-sampler
description: Time-based sampling profiler showing WHERE execution time is spent (wall-clock time, not frequency). Provides histogram with self/total time, compilation tiers (T0/T1/T2), and flame graphs. Use as FIRST step to identify hot functions consuming most time. Low overhead, suitable for longer runs. Pair with tracing-execution-counts to understand time-per-execution vs execution frequency.
---

# Profiling with CPU Sampler

Time-based sampling profiler that identifies WHERE your program spends execution time. Shows wall-clock time distribution across functions with compilation tier breakdown.

## When to Use This Skill

**Use FIRST** when investigating any performance issue:

- Identify hot functions consuming most time
- Verify code is compiling (tier distribution)
- Measure time spent in interpreter vs compiled code
- Generate flame graphs for visualization

## Quick Start

```bash
# Basic profiling
<launcher> --cpusampler <program>

# With tier breakdown (RECOMMENDED)
<launcher> --cpusampler --cpusampler.ShowTiers=true <program>

# Skip warmup (recommended for steady-state analysis)
<launcher> --cpusampler --cpusampler.Delay=5000 --cpusampler.ShowTiers=true <program>
```

## ⚠️ REQUIRED: Fermi Verification (Every Tool Invocation)

**Before running**:

- [ ] Pre-calculate: Expected hot functions (1-5 names), T0/T1/T2 split
- [ ] Smoke test: `<launcher> --cpusampler -c 'print 1;'` → Verify output format

**After running**:

- [ ] Validate: Actual vs estimate within 1 order of magnitude? YES / NO
- [ ] If NO: **STOP** - Debug tool before proceeding (run `--help:cpusampler`, test on known-good input)
- [ ] Save output: `tool-outputs/cpu-sampler-[benchmark].txt`

**Gate**: All boxes checked? → Proceed to analysis

## Key Options

| Option                             | Description             | Recommended Value     |
| ---------------------------------- | ----------------------- | --------------------- |
| `--cpusampler.ShowTiers=true`      | Show T0/T1/T2 breakdown | **Always use**        |
| `--cpusampler.Delay=<ms>`          | Skip warmup             | 2000-10000            |
| `--cpusampler.Period=<ms>`         | Sample interval         | 10 (default)          |
| `--cpusampler.Output=calltree`     | Output format           | Default: histogram    |
| `--cpusampler.OutputFile=<file>`   | Save to file            | For later analysis    |
| `--cpusampler.SampleInternal=true` | Include internal frames | For Truffle debugging |

## Understanding Output

### Tier Columns

| Tier | Meaning             | Target                 |
| ---- | ------------------- | ---------------------- |
| T0   | Interpreter         | <10% for hot functions |
| T1   | First-tier compiled | Transitional           |
| T2   | Fully optimized     | >80% for hot functions |

### Sample Output

```
Sampling Histogram. Recorded 412 samples with period 10ms.
  Self Time: Time spent in function (excluding callees)
  Total Time: Time in function including callees

Name          || Total Time   || Self Time    || T0    | T1   | T2
queens        || 1850ms 88.0% || 1850ms 88.0% || 5.2%  | 3.1% | 91.7%
hasConflict   || 250ms 11.9%  || 250ms 11.9%  || 8.8%  | 4.2% | 87.0%
```

## Interpretation Guidelines

### Good Performance

- ✅ Hot functions show >80% T2 time
- ✅ <10% T0 (interpreter) time
- ✅ Time concentrated in expected hot functions

### Performance Problems

- ⚠️ >30% T0 time → Compilation issues
- ⚠️ High T1 but low T2 → Optimization barriers
- ⚠️ Time in unexpected functions → Algorithm issues

## Integration with Other Skills

**Next steps based on findings**:

| Finding                 | Next Skill                       |
| ----------------------- | -------------------------------- |
| High T0 time            | `tracing-compilation-events`     |
| Optimization barriers   | `detecting-performance-warnings` |
| Memory issues suspected | `profiling-memory-allocations`   |
| Inlining problems       | `tracing-inlining-decisions`     |

## Related Skills

- `tracing-execution-counts` - Execution frequency (not time)
- `detecting-performance-warnings` - Find optimization barriers
- `tracing-compilation-events` - Compilation behavior

## Reference

```bash
# Full help
<launcher> --help:cpusampler
```

See [PATTERNS.md](PATTERNS.md) for common problem patterns and solutions.
