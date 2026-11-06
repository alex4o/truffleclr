# Exception fixtures

`exceptions_basic`, `exceptions_control`, `exceptions_filters`, and
`exceptions_runtime` were generated with `mktest.sh` from their matching
`cs/Program_*.cs` sources; expected output comes from .NET 10.

`exceptions_table` uses the control source and `exceptions_filters_table` uses
the filters source, disassembled with ildasm 10 `-utf8 -raweh`. Their expected
outputs are identical to the structured versions.

`exceptions_fault` starts from its matching C# catch/rethrow program and .NET
output. Its IL replaces that catch with `fault`, removes the exception-stack
`pop`, and replaces `rethrow` with the `endfault` alias. C# cannot emit fault
clauses directly. The table-gap/layout fixtures are hand-written IL with
explicit expected outputs, exercising mixed numeric/label bounds, preceding
handlers, backward leaves, external gap entry and crossing loops.
`exceptions_numeric_bounds` uses non-IL labels, forward numeric tables,
variable-width instructions, numeric filters and a method-end boundary.
`array_address_mismatch` catches the incompatible `ldelema` in guest code
and prints a marker after first checking the permitted `readonly.` form.

`exceptions_unhandled` deliberately has no expected-output file. Run it manually:
stdout must be `before` then `cleanup`; stderr must be
`Unhandled exception. System.InvalidOperationException: uncaught`; exit status 1.

## Semantics

Handlers are ordered by metadata clause order and match CLR subclass identity.
`leave` clears the operand stack; Bytecode DSL TryFinally runs cleanup on
branches, returns and exceptions. Fault runs only on exceptional exits.

**Filter deviation:** this interpreter uses one-pass unwinding. A filter runs
after inner finally blocks (including inner method frames), not during the
CLR’s first-pass search. Therefore filters observing state changed by inner
cleanup can select a different handler than .NET. A false or throwing filter
continues searching subsequent clauses.

For example, an inner finally can mutate state that an outer filter reads:


```csharp
int state = 0;
try {
    try { throw new Exception(); }
    finally { state = 1; }
}
catch (Exception) when (state == 0) { Console.WriteLine("filtered"); }
catch (Exception) { Console.WriteLine("fallback"); }
```

.NET selects the filter before running the finally and prints "filtered".
TruffleCLR runs the finally first, so the filter sees 1 and prints "fallback".
This one-pass deviation is intentional for now; two-pass filters are deferred.

Expected runtime failures throw guest exceptions directly. The Bytecode DSL
invalidates compiled code before its internal-exception interception hook, so
that hook is only a safety net. The runtime fixture catches 600,000 failures
across division, null calls, bounds, casts, array stores and negative lengths;
the filter fixture separately throws/catches 100,000 guest exceptions.

CoreLib exceptions deliberately provide only constructors, Message,
InnerException and a minimal ToString (the message). They do not implement
serialization, stack-trace properties or full framework-specific default
messages/argument-name formatting.
