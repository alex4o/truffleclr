# CPU Sampler Problem Patterns

## Pattern 1: High Interpreter Time (>30% T0)

### Symptoms
```
Name     || Total Time  || T0     | T1   | T2
hotFunc  || 1850ms 88%  || 95.2%  | 3.1% | 1.7%  ← Critical!
```

### Diagnosis
Code is not compiling properly or deoptimizing.

### Next Steps
1. Use `tracing-compilation-events` to check compilation status
2. Use `detecting-deoptimizations` to find deoptimization loops
3. Use `detecting-performance-warnings` to find barriers

---

## Pattern 2: Time in Unexpected Functions

### Symptoms
```
Name           || Total Time
utilityFunc    || 1500ms 72%  ← Not expected to be hot
mainAlgorithm  || 200ms 10%   ← Expected to be hot
```

### Diagnosis
Algorithm inefficiency or wrong function being called.

### Next Steps
1. Review algorithm design
2. Check for unnecessary computations
3. Profile with flame graph for call chains

---

## Pattern 3: High T1, Low T2

### Symptoms
```
Name     || T0   | T1    | T2
hotFunc  || 5%   | 85%   | 10%  ← Stuck in first tier
```

### Diagnosis
First-tier compilation succeeds but optimization fails.

### Next Steps
1. Use `detecting-performance-warnings` to find barriers
2. Check for virtual calls preventing optimization
3. Examine type instability

---

## Pattern 4: Even Distribution Across Many Functions

### Symptoms
```
Name    || Total Time
func1   || 150ms 8%
func2   || 140ms 7%
func3   || 135ms 7%
...many more similar...
```

### Diagnosis
No clear hot function - either well-balanced or no optimization opportunity.

### Next Steps
1. Focus on architectural improvements
2. Check if expected hot paths are actually hot
3. Consider algorithm redesign

---

## Advanced Usage

### Generate Flame Graph

```bash
<launcher> --cpusampler --cpusampler.Output=flamegraph \
  --cpusampler.OutputFile=profile.html <program>
```

### Profile Internal Frames

```bash
<launcher> --cpusampler --cpusampler.SampleInternal=true \
  --cpusampler.ShowTiers=true <program>
```

### Exclude Warmup Completely

```bash
<launcher> --cpusampler --cpusampler.Delay=10000 \
  --cpusampler.ShowTiers=true <program>
```
