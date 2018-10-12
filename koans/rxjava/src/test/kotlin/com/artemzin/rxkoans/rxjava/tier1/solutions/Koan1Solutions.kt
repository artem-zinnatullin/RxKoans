package com.artemzin.rxkoans.rxjava.tier1.solutions

import com.artemzin.rxkoans.rxjava.tier1.Koan1Test
import io.reactivex.Observable

class Koan1Solutions {

    class Solution1 : Koan1Test.Koan1 {
        override fun oneValueAndCompletionObservable(): Observable<String> = Observable.just("Hello World!")
    }

    class Solution2 : Koan1Test.Koan1 {
        override fun oneValueAndCompletionObservable(): Observable<String> = Observable.fromArray("Hello World!")
    }

    class Solution3 : Koan1Test.Koan1 {
        override fun oneValueAndCompletionObservable(): Observable<String> = Observable.fromCallable { "Hello World!" }
    }

    class Solution4 : Koan1Test.Koan1 {
        override fun oneValueAndCompletionObservable(): Observable<String> = Observable.defer { Observable.just("Hello World!") }
    }

    class Solution5 : Koan1Test.Koan1 {
        override fun oneValueAndCompletionObservable(): Observable<String> = Observable.create { emitter ->
            emitter.onNext("Hello World!")
            emitter.onComplete()
        }
    }
}
