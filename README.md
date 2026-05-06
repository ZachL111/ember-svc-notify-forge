# ember-svc-notify-forge

`ember-svc-notify-forge` is a compact Kotlin repository for backend services, centered on this goal: Design a Kotlin verification harness for notify systems, covering security rule linting, safe and unsafe fixtures, and failure-oriented tests.

## Project Rationale

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how queue pressure and worker slack should influence a review result.

## Ember Svc Notify Forge Review Notes

For a quick review, compare `worker slack` with `queue pressure` before reading the middle cases.

## Feature Set

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/ember-svc-notify-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `worker slack` and `queue pressure`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The Kotlin implementation avoids hidden state so fixture changes are easy to reason about.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Test Command

That command is also the regression path. It verifies the domain cases and catches mismatches between the CSV, metadata, and code.

## Next Improvements

This remains a local project with deterministic fixtures. It does not depend on credentials, hosted services, or live data. Future work should add richer malformed inputs before widening the public API.
