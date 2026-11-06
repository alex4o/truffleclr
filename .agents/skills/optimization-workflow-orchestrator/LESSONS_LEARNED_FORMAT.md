# Lessons-Learned Entry Format

Use this format everywhere an entry is appended to `LESSONS_LEARNED.md` (Steps 2, 5, and 7). Every entry follows the same structure — one line per field, no extra prose:

```
### <short title>
- **Status:** rejected | slower | faster
- **What:** <one sentence: what was hypothesized or implemented>
- **Benchmark delta:** <geomean speedup ratio, e.g. "−4%" or "+12%"; "n/a" if rejected before benchmarking>
- **Why:** <one sentence: why it was rejected / slower / faster>
```
