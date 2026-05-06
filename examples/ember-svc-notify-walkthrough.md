# Ember Svc Notify Forge Walkthrough

This walk-through keeps the domain vocabulary close to the data instead of burying it in prose.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 224 | ship |
| stress | retry load | 208 | ship |
| edge | worker slack | 225 | ship |
| recovery | session drift | 208 | ship |
| stale | queue pressure | 194 | ship |

Start with `edge` and `stale`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

`edge` is the optimistic case; use it to make sure the scoring path still rewards strong signal.
