package com.artemzin.rxkoans.rxjava.tier1

import com.artemzin.rxkoans.rxjava.check
import com.artemzin.rxkoans.rxjava.tier1.solutions.Koan3Solutions
import io.reactivex.Observable
import org.junit.Test

class Koan3Test {

    interface Koan3 {
        fun threeValuesAndCompletionObservable(): Observable<String>
    }

    class Koan3Todo : Koan3 {

        /**
         * Task: return an [Observable] that emits 3 separate strings — `Hello`, `World`, `!` and completes normally.
         *
         * Purpose: showcase that [Observable] is capable of emitting multiple values.
         *
         * Hint: standard way to do this is [Observable.fromArray] or alternative operators like [Observable.fromIterable].
         */
        override fun threeValuesAndCompletionObservable(): Observable<String> = TODO()
    }

    @Test
    fun test() {
        check(
                possibleSolutions = setOf(
                        Koan3Solutions.Solution1(),
                        Koan3Solutions.Solution2(),
                        Koan3Solutions.Solution3(),
                        Koan3Solutions.Solution4()
                ),
                userSolution = Koan3Todo()
        ) { solution ->
            solution.threeValuesAndCompletionObservable()
                    .test()
                    .assertValues("Hello", "World", "!")
                    .assertNoErrors()
                    .assertComplete()
        }
    }
}
