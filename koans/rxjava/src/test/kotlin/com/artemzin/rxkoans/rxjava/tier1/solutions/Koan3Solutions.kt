package com.artemzin.rxkoans.rxjava.tier1.solutions

import com.artemzin.rxkoans.rxjava.tier1.Koan3Test
import io.reactivex.Observable

class Koan3Solutions {
    class Solution1 : Koan3Test.Koan3 {
        override fun threeValuesAndCompletionObservable(): Observable<String> = Observable
                .fromArray("Hello", "World", "!")
    }

    class Solution2 : Koan3Test.Koan3 {
        override fun threeValuesAndCompletionObservable(): Observable<String> = Observable
                .fromIterable(listOf("Hello", "World", "!"))
    }

    class Solution3 : Koan3Test.Koan3 {
        override fun threeValuesAndCompletionObservable(): Observable<String> = Observable
                .fromArray("Hello", "World", "!")
    }

    class Solution4 : Koan3Test.Koan3 {
        override fun threeValuesAndCompletionObservable(): Observable<String> = Observable.create { emitter ->
            emitter.onNext("Hello")
            emitter.onNext("World")
            emitter.onNext("!")
            emitter.onComplete()
        }
    }
}
