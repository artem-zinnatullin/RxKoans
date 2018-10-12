package com.artemzin.rxkoans.rxjava.tier1.solutions

import com.artemzin.rxkoans.rxjava.tier1.Koan2Test
import io.reactivex.Observable

class Koan2Solutions {
    class Solution1 : Koan2Test.Koan2 {
        override fun emptyObservable(): Observable<Any> = Observable.empty()
    }

    class Solution2 : Koan2Test.Koan2 {
        override fun emptyObservable(): Observable<Any> = Observable.fromArray()
    }

    class Solution3 : Koan2Test.Koan2 {
        override fun emptyObservable(): Observable<Any> = Observable.fromIterable(emptyList())
    }

    class Solution4 : Koan2Test.Koan2 {
        override fun emptyObservable(): Observable<Any> = Observable.create { emitter ->
            emitter.onComplete()
        }
    }
}
