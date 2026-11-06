# Deoptimization Patterns

## Pattern 1: Deoptimization Loop (CRITICAL!)

### Symptoms

```
[engine] transferToInterpreter at MyNode.execute(<source>:42)
[engine] transferToInterpreter at MyNode.execute(<source>:42)
[engine] transferToInterpreter at MyNode.execute(<source>:42)
...dozens or hundreds of times...
```

### Root Cause

Unstable type assumptions:
- Node compiles with type assumptions (e.g., "always integer")
- Encounters value violating assumption (e.g., receives double)
- Deoptimizes and invalidates
- Recompiles with new assumptions
- Cycle repeats

### Why It's Catastrophic

- Often **worse than never compiling**
- Wastes compilation time repeatedly
- Execution constantly switching compiled/interpreted
- Performance degrades 10-100x

### Resolution

**Language Implementation**:
```java
@Specialization
int doIntegers(int a, int b) { return a + b; }

@Specialization
double doDoubles(double a, double b) { return a + b; }

@Specialization
Object doGeneric(Object a, Object b) { /* fallback */ }
```

**Guest Language**:
```lox
// ❌ BAD: Mixing types in hot loop
for (var i = 0; i < 1000; i = i + 1) {
  var x = someFunction(i);  // Sometimes int, sometimes double
  process(x);
}

// ✅ GOOD: Consistent types
for (var i = 0; i < 1000; i = i + 1) {
  var x = someFunction(i);  // Always same type
  process(x);
}
```

---

## Pattern 2: Property Access Deoptimizations

### Symptoms

```
[engine] transferToInterpreter at
getProperty(<source>:123)
...
PropertyCacheNode.deoptimize(...)
```

### Root Cause

Unstable object shapes:
- Objects add/remove properties dynamically
- Property types change (int → double)
- Compiler caches property locations
- Shape changes invalidate caches

### Resolution

```lox
// ❌ BAD: Adding properties dynamically
class Point {
  init(x, y) {
    self.x = x;
    self.y = y;
  }
}
var p = Point(1, 2);
p.z = 3;  // Shape change! Deoptimizes!

// ✅ GOOD: All properties in constructor
class Point {
  init(x, y, z) {
    self.x = x;
    self.y = y;
    self.z = z;  // Define all upfront
  }
}
```

---

## Pattern 3: Warmup Transfers (Normal)

### Symptoms

```
[First 5 seconds]
[engine] transferToInterpreter at function1(...)
[engine] transferToInterpreter at function2(...)
...many transfers...

[After 10+ seconds]
[No more transfers]  ✅
```

### When Acceptable

- ✅ Transfers decrease over time
- ✅ Stops after reasonable warmup (10-20 seconds)
- ✅ Doesn't resume during steady-state

### When Problematic

- ❌ Continues indefinitely
- ❌ Takes very long to stabilize (>60 seconds)
- ❌ Resumes after appearing to stabilize

### Resolution for Excessive Warmup

```bash
# Increase first-tier threshold for more profiling
<launcher> --experimental-options \
  --engine.FirstTierCompilationThreshold=800 \
  --engine.TraceTransferToInterpreter \
  <program>
```

---

## Pattern 4: Rare Path Transfers (Acceptable)

### Symptoms

```
[During entire execution]
[engine] transferToInterpreter at errorHandler(<source>:250)
[engine] transferToInterpreter at validateInput(<source>:89)
```

### When Acceptable

- ✅ Infrequent (single digits)
- ✅ From error handling or validation
- ✅ Don't repeat at same location

### When Problematic

- ❌ "Rare" paths executing frequently
- ❌ Many different rare paths

---

## Verification Workflow

### Step 1: Initial Trace

```bash
<launcher> --experimental-options \
  --engine.TraceTransferToInterpreter \
  --engine.TraceCompilation \
  <program> 2>&1 | tee initial-trace.log
```

### Step 2: Count and Categorize

```bash
# Total transfers
grep -c "transferToInterpreter" initial-trace.log

# Transfers per location
grep "transferToInterpreter at" initial-trace.log | \
  sort | uniq -c | sort -rn > transfer-counts.txt

# Look for high counts (deoptimization loops)
head -20 transfer-counts.txt
```

### Step 3: Identify Deoptimization Loops

```bash
# Locations with 10+ transfers
awk '$1 >= 10' transfer-counts.txt
```

### Step 4: Fix and Verify

```bash
# After fix, count should be zero or single-digit
grep -c "transferToInterpreter" fixed-trace.log
```
