# CIL comparison, unsigned arithmetic, and truth fixtures

These are explicit IL programs and fixed expected-output files, not generated
JUnit cases. Expected values were derived from ECMA-335, not captured from this
interpreter. No .NET/Mono toolchain was installed for an independent execution.

Normative source: [ECMA-335, sixth edition](https://ecma-international.org/publications-and-standards/standards/ecma-335/).
Readable clause transcription: [Partition III](https://github.com/stakx/ecma-335/tree/master/docs).

## Comparison output order

Every comparison group in `cil_unsigned.il` and the three floating-point
fixtures prints the following 15 results, in order:

1. `ceq`, `cgt`, `cgt.un`, `clt`, `clt.un`.
2. Taken/not-taken (1/0) for `beq`, `bne.un`, `bgt`, `bgt.un`,
   `bge`, `bge.un`, `blt`, `blt.un`, `ble`, `ble.un`.

Partition III §§3.21–26 specify that comparison instructions push **int32 0/1**.
§§3.5–14 specify the corresponding branches. Unsigned integer comparison treats
negative bit patterns as values in [0, 2^N). Floating-point ordered comparisons
are false when either operand is NaN; the unordered `.un` variants are true.
In particular, `ceq` is false even for NaN/NaN, while `bne.un` is true.
Positive and negative zero are equal. Infinities retain their normal ordering.

The float32 and float64 files cover both operand orders, NaN/NaN, positive and
negative zero, infinities, and short/long branch forms. The mixed file exercises
the evaluation-stack F type across float32/float64 producers (Partition I §12.1.3).
For example, every unordered group has the fixed result vector:

`0 0 1 0 1 | 0 1 0 1 0 1 0 1 0 1`

Every equal ordered group (including the two signed zeros) has:

`1 0 0 0 0 | 1 0 0 0 1 1 0 0 1 1`

## Unsigned arithmetic

Partition III §§3.32, 3.56 and 3.60 define `div.un`, `rem.un` and zero-filling
`shr.un`. §3.40 defines the width of numeric constants. The fixture uses decimal
negative values and full-width hexadecimal bit patterns for both i4 and i8.
It covers positive/negative dividends and divisors, minimum values, maximum
unsigned values, and shifts by zero, one and width-minus-one. Signed operations
are included as controls. Out-of-range shift counts and signed overflow division
are deliberately not assigned expectations by these fixtures.

Examples derived arithmetically:

- i4 -5 is 2^32 - 5 = 4294967291: quotient by 3 is 1431655763, remainder 2.
- i8 -5 is 2^64 - 5 = 18446744073709551611: quotient by 3 is
  6148914691236517203, remainder 2.
- Unsigned -1 divided or shifted right by one produces 2^(N-1) - 1.
- Unsigned minimum divided by unsigned -1 is zero; its remainder retains the
  minimum-value bit pattern.

For i8 arithmetic the fixture compares the actual result with an explicit i8
constant using `ceq` and prints the resulting int32. Every such check expects 1;
this does not require adding an Int64 Console overload. i8 values are used
inline on the evaluation stack because the minimal CoreLib does not declare
Int64. Similarly, float32 tests do not depend on missing Single metadata.

## Result representation and truth

`cil_comparison_values.il` uses comparison results in add/sub/mul, chained
comparisons, an int32 local, and an array index. It checks Boolean-local and
Console Boolean-overload compatibility without changing the int32 result of
comparison instructions.

`cil_truth.il` follows Partition III §§3.17–18: zero integers and null references
are false; nonzero integers and non-null references are true. It checks brtrue
and brfalse, i4 and i8 (including nonzero high bits), Boolean storage, ldnull,
an actual null array element, empty/nonempty strings, an empty array, and a new
object. Empty strings and arrays are non-null and therefore true. Character-array
zero and zero/nonzero Char return values cover narrow integral host representations.

`cil_reference_nulls.il` checks that null reference-array elements and `ldnull`
compare equal, do not take `bne.un`, and both fail the `cgt.un` null test. It also
checks equal/distinct object identities and non-null/null comparisons.

## Harness-test migration

`long_expression.il` moves the successful 5000-add/maximum-stack-two regression
into the ordinary IL/output harness and expects 5000. Existing `virtual_cache.il`
still covers successful loading with an unused unsupported method. Existing
stack/evaluation-order fixtures remain in the output suite.

The removed host-harness tests were **not all migrated**:

- Two contexts sharing an Engine, and repeated host evaluation of a cached
  Source, cannot be expressed by one guest IL program in this harness.
- The pending divide-by-zero exception-order assertion and calling an unsupported
  method require expected-exception assertions. The output-only harness does not
  support these, and this interpreter does not support guest exception handlers.
  They are removed, not claimed as equivalent successful-output coverage.

All remaining tests are parameterized end-to-end IL/output fixtures. The output
line-count assertion remains, and Gradle tracks IL/expected files as test inputs.

## Unchanged object-model limitations

Reference comparison still uses host equality for strings rather than managed
reference identity. The existing `box` operation also passes an integer through
instead of allocating a boxed object: boxed zero therefore still tests false.
These pre-existing representation limitations are not covered or fixed by the
null/reference tests above; fixing boxing belongs with the object-model work.
