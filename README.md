# RxKoans

## Purpose

Goal of this project is to reduce the steepness of the Rx (RxJava, RxSwift, Project Reactor, etc) learning curve.

It was noted by RxJava lead, David Karnok @akarnokd in [this tweet](https://twitter.com/akarnokd/status/979732723152687106):

>I've been thinking about learning curves of RxJava and Coroutines lately, but I don't have enough experience with coroutine-based problem solving. Therefore, I have drawn the following comparison diagram to test my theory about their relative complexity in various topics:

![](https://pbs.twimg.com/media/DZi1ex7WAAAcGlk.jpg)

## Target Audience

***RxKoans targets reactive juniors, middles and seniors.***

- Reactive Juniors:
    - We encourage you to go through all tiers slowly, starting with tier1
    - We encourage you to rely on Hints and use easiest and most natural ways of solving the Koans
    - Once you feel comfortable, we encourage you to check alternative solutions for same Koans that you've already solved, debug and understand them
- Reactive Middles:
    - We encourage you to go through all tiers fast, starting with tier1
    - We encourage you to NOT rely on Hints and use easiest and most natural ways of solving the Koans
    - Once you feel comfortable, we encourage you to check alternative solutions for same Koans that you've already solved, debug and understand them
- Reactive Seniors:
    - We encourage you to go through all tiers FAST, starting with tier1
    - We encourage you to NOT rely on Hints and use most ELEGANT ways of solving the Koans
    - Once you feel comfortable, we encourage you to submit your solutions if you find them more elegant

## How to use

### Structure

- Koans are essentially unit tests where you need to provide implementation according to the "Task" so that the test passes.
- Koans are split into "tiers" from `1` to `n`, where `1` means the easiest, the basics.
- Koans can have **multiple solutions**, it's totally up to on how to implement them. There are however "hints" provided in each Koan.
- Koans have multiple solutions provided in the repo so you could explore them, they're also used for tests on CI.

### Steps

1. Clone the repo
1. Open the project in your favorite IDE/editor
1. Navigate to koans/rxjava[other]/src/test/…/tier
1. Open particular Koan and read through the Task defined in class `Koan[n]Todo`
1. Try to implement the Koan according to the task using Hint and references to specific documentation
1. Run the test in the Koan class either from IDE/editor or from Terminal like this: `./gradlew test --tests com.artemzin.rxkoans.rxjava.tier1.Koan6Test`


