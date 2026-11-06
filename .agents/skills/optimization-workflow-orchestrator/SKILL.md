---
name: optimization-workflow-orchestrator
description: "Orchestrates an optimization loop for Truffle languages. Use when the user asks to optimize performance, speed up benchmarks, or find bottlenecks in a Truffle language implementation."
---

> **pi adapter (TruffleCLR).** Upstream targets Claude Code. Map `subagent_type: "cc-truffle-performance-plugin:<name>"` to a pi `agent(...)` call whose task contains the brief from `agents/<name>.md` (in this skill directory) plus the quoted prompt: use `scout` for explorer, `worker` for baseline-establisher / hypothesis-validator / compiler-graph-analyst / implementation-planner, `codewriter` for implementer. The MCP AWFY server is not installed: skip AWFY reference results and mark them N/A. TruffleCLR benchmarks are the `truffleclr/test/{richards,binary_trees,n_body,Pfannkuchen}.il` programs; historical timings are in `bench/*.csv`. Build/run commands: skill `truffleclr-build-run`.


# Optimization Workflow Orchestrator

## Workflow

```text
Step 0: Baseline  (once)
    ↓
┌─ Step 1: Explore ←───────────────┐
│  Step 2: Validate hypothesis      │
│  Step 3: Plan                     │
│  Step 4: Implement                │
│  Step 5: Validate benchmarks      │
│  slower? ─────────────────────────┘
│  faster? ↓
│  Step 6: Refresh baseline
│  Step 7: Update lessons learned
│  Step 8: Clean up
│  Step 9: Commit → STOP
```

Copy this checklist and track your progress:

```
Optimization Progress:
- [ ] Step 0: Establish baseline
- [ ] Step 1: Explore
- [ ] Step 2: Validate hypothesis
- [ ] Step 3: Plan
- [ ] Step 4: Implement
- [ ] Step 5: Validate benchmarks
- [ ] Step 6: Refresh baseline
- [ ] Step 7: Update lessons learned
- [ ] Step 8: Clean up
- [ ] Step 9: Commit
```

**Step 0 — Baseline**: Create a performance baseline if needed.

- If `BENCHMARK_BASELINE.md` doesn't exist, launch the `cc-truffle-performance-plugin:baseline-establisher` sub-agent.
- The prompt: "Please run all available benchmarks and collect timing data for a performance baseline. Generate `BENCHMARK_BASELINE.md` with both language and MCP AWFY reference results."
- Wait for the sub-agent to complete. It writes the baseline report to `BENCHMARK_BASELINE.md`.

**Step 1 — Explore**: Spawn an Explore sub-agent to find performance issues.

- Launch a Task tool sub-agent with `subagent_type: "cc-truffle-performance-plugin:explorer"`.
- The prompt: "Explore the language implementation for performance issues and write ranked hypotheses to `HYPOTHESES.md`."
- Wait for the sub-agent to complete. It writes hypotheses to `HYPOTHESES.md`.

**Step 2 — Validate hypothesis**: Validate the most critical unverified hypothesis with profiling tools or compiler graph analysis.

- Read `HYPOTHESES.md` and pick the most critical unverified hypothesis. Note its title and suggested validation approach.
- Based on the suggested validation approach:
  - If the hypothesis requires compiler graph analysis → spawn a sub-agent with `subagent_type: "cc-truffle-performance-plugin:compiler-graph-analyst"` with the prompt: "Read `HYPOTHESES.md` and validate the hypothesis '{hypothesis title}' from `HYPOTHESES.md`."
  - Otherwise → spawn a sub-agent with `subagent_type: cc-truffle-performance-plugin:hypothesis-validator` with the prompt: "Read `HYPOTHESES.md` and validate the hypothesis '{hypothesis title}' from `HYPOTHESES.md`."
- Both sub-agents update `HYPOTHESES.md` with their results (status, evidence, lessons). After the sub-agent completes, read the updated `HYPOTHESES.md`.
- If not 100% rejected → proceed to Step 3. The Plan agent will use all evidence from `HYPOTHESES.md`.
- If 100% rejected → append an entry to `LESSONS_LEARNED.md` (see `LESSONS_LEARNED_FORMAT.md`). Then try the next hypothesis (repeat Step 2).
- If all hypotheses are rejected → return to Step 1 with updated context, continue the agent session with the new information.

**Step 3 — Plan**: Spawn a Plan sub-agent to design the implementation.

- Launch a Task tool sub-agent with `subagent_type: "cc-truffle-performance-plugin:implementation-planner"`.
- The prompt: "Design an implementation plan for the confirmed hypothesis and write it to `IMPLEMENTATION_PLAN.md`."
- Wait for the sub-agent to complete. It writes the plan to `IMPLEMENTATION_PLAN.md`.
- **Review the plan**: Read `IMPLEMENTATION_PLAN.md` and check for issues — unclear steps, missing details, risky changes, approaches that conflict with `LESSONS_LEARNED.md`, or anything that seems off.
- If the plan looks good → proceed to Step 4.
- If you have questions or feedback → resume the Plan sub-agent with your feedback. It revises `IMPLEMENTATION_PLAN.md`. Review again (max three review rounds).

**Step 4 — Implement** _(critical)_: Implement the plan using a Task sub-agent.

- Launch a Task tool sub-agent with `subagent_type: "cc-truffle-performance-plugin:implementer"`.
- The prompt: "Implement the optimization plan from `IMPLEMENTATION_PLAN.md`."
- Wait for the sub-agent to complete before proceeding to validation.

**Step 5 — Validate benchmarks**: Validate the performance improvement against the baseline.

- Rerun **every language benchmark** using the commands and iteration counts from the `BENCHMARK_BASELINE.md` to validate the performance improvement.
- Run local benchmarks one at the time, not in parallel, look how to run benchmarks in `BENCHMARK_BASELINE.md` and follow the same pattern.
- After collecting all new timing data, call the `cc-truffle-performance-plugin:compute_geomean_speedup` MCP tool with the baseline and new average times to determine whether the change is faster. The tool computes speedup ratios (baseline / new), and geometric mean.
- Faster (`is_faster` is true) → continue to Step 6
- Slower → append an entry to `LESSONS_LEARNED.md` (see `LESSONS_LEARNED_FORMAT.md`). Review the implementation and ask the sub-agent in Step 4 to improve the implementation max three times. Otherwise restart from Step 1.

**Step 6 — Refresh baseline**: Replace the baseline values.

- Replace the language results table in `BENCHMARK_BASELINE.md` with the new timing data.
- Remove the old values completely. Keep the reference results (AWFY Python) section unchanged.

**Step 7 — Update lessons learned**: Record what was tried and what was learned.

- Read `HYPOTHESES.md` for hypothesis results.
- Create `LESSONS_LEARNED.md` if it doesn't exist.
- Append an entry for the successful implementation to `LESSONS_LEARNED.md` (see `LESSONS_LEARNED_FORMAT.md`).

**Step 8 — Clean up**: Remove intermediate artifacts so the next iteration starts fresh.

- Delete all files in `tool-outputs/`, `compiler-graph/` directory.
- Delete `IMPLEMENTATION_PLAN.md`.
- Do NOT delete `BENCHMARK_BASELINE.md` or `LESSONS_LEARNED.md` — they carry over between iterations.
- Delete all other files created during this iteration that are not part of the baseline or lessons learned.

**Step 9 — Commit**: Commit the implementation.

- Commit the changes with a concise commit message describing what was optimized and the benchmark delta.
- Don't write a summary to file
