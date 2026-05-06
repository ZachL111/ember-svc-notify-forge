# Review Journal

The review surface for `ember-svc-notify-forge` is deliberately narrow: one fixture, one scoring rule, and one local check.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its backend services focus without claiming live deployment or external usage.

## Cases

- `baseline`: `queue pressure`, score 224, lane `ship`
- `stress`: `retry load`, score 208, lane `ship`
- `edge`: `worker slack`, score 225, lane `ship`
- `recovery`: `session drift`, score 208, lane `ship`
- `stale`: `queue pressure`, score 194, lane `ship`

## Note

The useful failure mode here is a wrong decision on a named case, not a vague style disagreement.
