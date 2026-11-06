# CLR static objects

Each runtime Type owns a StaticShape extending its base type's shape. Field metadata
is the StaticProperty: inherited properties retain identity, including when a derived
type hides a field name. CilCompiler resolves fields before emitting bytecode, so
loads/stores carry constant properties, not names. ClrObject is the custom allocation
base; its final Type reference identifies virtual dispatch and interop members.

Instance fields use primitive storage (boolean, byte, short, char, int, long, float,
double) or Object storage. Small integral loads normalize to the CIL int32 stack.
Null reference storage reads as CTSNull. Allocations use the shape factory; JVM
zeroing supplies defaults, with no per-field initialization loop. Each Type also owns
one separately shaped object for declared static fields; inherited static accesses
resolve to the declaring type's storage.

Initialization runs before field access, allocation or entry to a method of a type
with a .cctor (excluding .cctor entry itself). This intentionally initializes
beforefieldinit types at their first method call too. The synchronized slow path
allows same-thread recursive initialization to observe partial/zero storage, records
failure without retrying, and invalidates compiled code once upon initialization.
The supported execution model remains one thread executing a guest context.

Instance interop reads/writes existing fields only. Boolean/character interop values
remain Boolean/string rather than stack integers. Insertion and removal are rejected.
Field identity is suitable for future (instance, property) managed references; this
change does not add structs, copying, managed pointers or guest exception handling.
Existing castclass/isinst and conversion opcode limitations are unchanged.

## Verification

GraalVM CE 25.5.5.0.3+1.1, baseline 313ce0a, macOS arm64. Commands from this directory:

- ./gradlew :launcher:installDist :launcher:test --console=plain: successful.
- 39 FullOutputTest cases and 3 host/IL integration tests passed, no failures/errors.
- New .NET-generated fixtures: object_inheritance, static_initialization, typed_fields.
  Cover hidden fields at three inheritance levels, a three-type virtual call site,
  static defaults/writes/initializers, circular initialization, constructor/method
  triggers, and all primitive/reference field kinds. Host integration covers fixed
  layout, Boolean/character round trips, method-entry initialization and sticky failure.
- compare.sh restricted to its 23 historical fixtures: passed=22 failed=1.
  spectralnorm still fails at unsupported stind; its old debug stdout differs, so the
  script does NOT report 23/0. Running compare.sh without a name list also counts newer
  fixtures as failures because it has no historical output files for them.
- TraceCompilation: zero opt failed across the seven benchmarks below. Combined
  TraceTransferToInterpreter: binary_trees had 12 completed compilations and two
  transfers (OSR uncommon path and final output); richards had 18 compilations and zero
  transfers. No repeated compile/deopt loop observed. The short loop smoke test had
  neither transfers nor compilations.
- Both independent reviews cleared the final implementation after fixes.

Five separate launcher processes per benchmark, using the launcher's Completed in
milliseconds (startup/compilation-sensitive, not warmed-up throughput):

| Program | Before median | After median |
| --- | ---: | ---: |
| binary_trees | 1668 | 2112 |
| richards | 219 | 366 |
| car_simple_callvirt | 21 | 16 |
| Pfannkuchen | 678 | 356 |
| n_body | 257 | 205 |
| nqueen | 74 | 77 |
| func_fib | 115 | 113 |

Object-heavy regressions remain: binary_trees +27%, richards +67%. These are reported,
not claimed as improvements; no steady-state performance claim is made. Pfannkuchen
baseline samples were bimodal (346–682ms). Trace logs and individual timing samples
from this run are in /tmp/truffleclr-static-objects (not tracked).
