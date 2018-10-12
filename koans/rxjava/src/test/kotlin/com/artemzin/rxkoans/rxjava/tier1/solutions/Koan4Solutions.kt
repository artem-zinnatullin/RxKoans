package com.artemzin.rxkoans.rxjava.tier1.solutions

import com.artemzin.rxkoans.rxjava.MyException
import com.artemzin.rxkoans.rxjava.tier1.Koan4Test
import io.reactivex.Observable

class Koan4Solutions {
    class Solution1 : Koan4Test.Koan4 {
        override fun noValuesAndAErrorObservable(): Observable<Any> = Observable.error(MyException("oops"))
    }

    class Solution2 : Koan4Test.Koan4 {
        override fun noValuesAndAErrorObservable(): Observable<Any> = Observable.fromCallable { throw MyException("oops") }
    }

    class Solution3 : Koan4Test.Koan4 {
        override fun noValuesAndAErrorObservable(): Observable<Any> = Observable.create { emitter ->
            emitter.onError(MyException("oops"))
        }
    }
}
