# Vendored skills

| Skills | Source | Commit | License |
|---|---|---|---|
| detecting-deoptimizations, detecting-performance-warnings, fetching-truffle-documentation, optimization-workflow-orchestrator, profiling-memory-allocations, profiling-with-cpu-sampler, tracing-compilation-events, tracing-execution-counts, tracing-inlining-decisions | https://github.com/hpi-swa-lab/cc-truffle-performance-plugin | 91d51cd | MIT |
| gradle-best-practices, gradle-wrapper-upgrade | https://github.com/gradle/gradle-skills | 6d30a9c | Apache-2.0 |

Local changes: the Claude Code sub-agent briefs from the Truffle plugin are copied to `optimization-workflow-orchestrator/agents/`, and a pi adapter note is prepended to that skill. Update by re-copying from upstream and reapplying the note.

Project-specific skills (`truffleclr-*`) are not vendored.
