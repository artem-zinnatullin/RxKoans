package com.artemzin.rxkoans.rxjava.tier1.solutions

import com.artemzin.rxkoans.rxjava.tier1.Koan6Test
import io.reactivex.Observable

class Koan6Solutions {
    class Solution1 : Koan6Test.Koan6 {
        override fun filterOutStringsThatStartWithCapitalLetter(upstream: Observable<String>): Observable<String> = upstream
                .filter { it.firstOrNull()?.isUpperCase() == false }
    }
}
