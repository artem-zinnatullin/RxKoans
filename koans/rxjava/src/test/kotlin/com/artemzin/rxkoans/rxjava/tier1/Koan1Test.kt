package com.artemzin.rxkoans.rxjava.tier1

import com.artemzin.rxkoans.rxjava.check
import com.artemzin.rxkoans.rxjava.tier1.solutions.Koan1Solutions
import io.reactivex.Observable
import org.junit.Test

class Koan1Test {

    interface Koan1 {
        fun oneValueAndCompletionObservable(): Observable<String>
    }

    class Koan1Todo : Koan1 {

        /**
         * Task: return an [Observable] that emits single string `Hello World!` and completes normally.
         *
         * Purpose: showcase that [Observable] is capable of emitting a single value.
         *
         * Hint: standard way to do this is [Observable.just] operator.
         */
        override fun oneValueAndCompletionObservable(): Observable<String> = TODO()
    }

    @Test
    fun test() {
        check(
                possibleSolutions = setOf(
                        Koan1Solutions.Solution1(),
                        Koan1Solutions.Solution2(),
                        Koan1Solutions.Solution3(),
                        Koan1Solutions.Solution4(),
                        Koan1Solutions.Solution5()
                ),
                userSolution = Koan1Todo()
        ) { solution ->
            solution.oneValueAndCompletionObservable()
                    .test()
                    .assertValues("Hello World!")
                    .assertNoErrors()
                    .assertComplete()
        }
    }
}
