package com.artemzin.rxkoans.rxjava.tier1.solutions

import com.artemzin.rxkoans.rxjava.tier1.Koan5Test
import io.reactivex.Observable

class Koan5Solutions {

    class Solution1 : Koan5Test.Koan5 {
        override fun mapStringToItsLength(upstream: Observable<String>): Observable<Int> = upstream
                .map { it.length }
    }

    class Solution2 : Koan5Test.Koan5 {
        override fun mapStringToItsLength(upstream: Observable<String>): Observable<Int> = upstream
                .flatMap { Observable.just(it.length) }
    }
}
