package com.artemzin.rxkoans.rxjava.tier1

import com.artemzin.rxkoans.rxjava.check
import com.artemzin.rxkoans.rxjava.tier1.solutions.Koan2Solutions
import io.reactivex.Observable
import org.junit.Test

class Koan2Test {

    interface Koan2 {
        fun emptyObservable(): Observable<Any>
    }

    class Koan2Todo : Koan2 {

        /**
         * Task: return an [Observable] that completes normally without values.
         *
         * Purpose: showcase that [Observable] is capable of completing without values.
         *
         * Hint: standard way to do this is [Observable.empty] operator.
         */
        override fun emptyObservable(): Observable<Any> = TODO()
    }

    @Test
    fun test() {
        check(
                possibleSolutions = setOf(
                        Koan2Solutions.Solution1(),
                        Koan2Solutions.Solution2(),
                        Koan2Solutions.Solution3(),
                        Koan2Solutions.Solution4()
                ),
                userSolution = Koan2Todo()
        ) { solution ->
            solution.emptyObservable()
                    .test()
                    .assertNoValues()
                    .assertNoErrors()
                    .assertComplete()
        }
    }
}
