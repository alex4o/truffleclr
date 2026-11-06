---
name: detecting-deoptimizations
description: Traces deoptimization events where execution falls back from compiled code to interpreter. Use to detect deoptimization loops, unstable assumptions, and type instability. Zero transfers in steady-state is the goal. Many transfers indicate severe performance problems. Critical for diagnosing compilation instability.
---

# Detecting Deoptimizations

Traces every deoptimization event where execution falls back from compiled code to interpreter. Critical for finding the most severe performance problems.

## Why Deoptimizations Are Catastrophic

- **Single transfer cost**: Hundreds of nanoseconds (vs ~5ns for normal call)
- **Deoptimization loops**: 10-100x slower than pure interpreter!
- **Wasted compilation**: Compile → deoptimize → recompile → deoptimize = disaster

**Goal: Zero transfers in steady-state execution!**

## When to Use This Skill

- Investigate poor performance despite successful compilation
- Profile shows methods in interpreted mode
- Debug why compiled code keeps falling back
- Verify benchmarks have properly warmed up

## Quick Start

```bash
# Basic deoptimization trace
<launcher> --experimental-options \
  --engine.TraceTransferToInterpreter <program>

# Combined with compilation trace (HIGHLY RECOMMENDED)
<launcher> --experimental-options \
  --engine.TraceTransferToInterpreter \
  --engine.TraceCompilation \
  <program> 2>&1 | tee transfers.log

# Focus on specific function
<launcher> --experimental-options \
  --engine.TraceTransferToInterpreter \
  --engine.CompileOnly=functionName \
  <program>
```

## ⚠️ REQUIRED: Fermi Verification (Every Tool Invocation)

**Before running**:
- [ ] Pre-calculate: Expected transfers (0-50 during warmup, 0 in steady-state)
- [ ] Smoke test: `<launcher> --experimental-options --engine.TraceTransferToInterpreter -c 'print 1;'` → Verify no false transfers

**After running**:
- [ ] Validate: Transfer count within expectation? YES / NO
- [ ] If >100 transfers: **CRITICAL** - Deoptimization loop, analyze repeated locations
- [ ] Save output: `tool-outputs/trace-transfers-[benchmark].txt`

**Gate**: All boxes checked? → Proceed to analysis

## Key Options

| Option | Description |
|--------|-------------|
| `--engine.TraceTransferToInterpreter` | Trace all deoptimizations |
| `--engine.TraceCompilation` | Combine for full picture |
| `--engine.CompileOnly=<name>` | Filter to specific function |
| `--engine.TraceStackTraceLimit=<n>` | Stack trace depth (default 20) |

## Understanding Output

### Transfer Event

```
[engine] transferToInterpreter at
problemFunction(<source>:42:123-456)
callerFunction(<source>:18:78-90)
topLevelFunction(<source>:5:10-50)
```

## Problem Patterns

### Pattern 1: Deoptimization Loop (CRITICAL!)

```
[engine] transferToInterpreter at MyNode.execute(<source>:42)
[engine] transferToInterpreter at MyNode.execute(<source>:42)
[engine] transferToInterpreter at MyNode.execute(<source>:42)
...dozens more at same location...
```

**🚨 This is catastrophic!** Often worse than never compiling.

**Cause**: Unstable type assumptions
**Fix**: Implement proper type specializations, avoid mixing types

### Pattern 2: Warmup Transfers (Normal)

```
[First 5 seconds]
...many transfers...
[After 10+ seconds]
[No more transfers]  ✅
```

**Acceptable**: Decreases over time, stops after warmup

### Pattern 3: Rare Path Transfers (Acceptable)

```
[During entire execution]
[engine] transferToInterpreter at errorHandler(<source>:250)
```

**Acceptable**: Infrequent, from error handling or validation

## Transfer Count Guidelines

| Count | Status | Action |
|-------|--------|--------|
| 0 | ✅ Perfect | Ideal state |
| 1-10 | ✅ OK | Likely warmup or rare paths |
| 10-100 | ⚠️ Investigate | May have issues |
| 100+ | ❌ Critical | Deoptimization loop likely |

## Analysis Commands

```bash
# Count total transfers
grep -c "transferToInterpreter" transfers.log

# Count unique locations
grep "transferToInterpreter at" transfers.log | sort -u | wc -l

# Find repeated locations (deoptimization loops)
grep "transferToInterpreter at" transfers.log | sort | uniq -c | sort -rn
```

## Integration with Other Skills

| Finding | Next Skill |
|---------|-----------|
| Deopt loops | Fix type stability, add specializations |
| Property access deopts | Stabilize object shapes |
| Unclear cause | `compiler-graph-analyst` |

## Related Skills

- `tracing-compilation-events` - See compilation cycles
- `profiling-with-cpu-sampler` - Measure impact
- `detecting-performance-warnings` - Find barriers
- `compiler-graph-analyst` - Deep analysis

## Reference

```bash
<launcher> --help:engine | grep -i transfer
```

See [PATTERNS.md](PATTERNS.md) for detailed problem patterns and solutions.
