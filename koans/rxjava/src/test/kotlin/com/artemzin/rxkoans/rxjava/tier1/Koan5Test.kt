package com.artemzin.rxkoans.rxjava.tier1

import com.artemzin.rxkoans.rxjava.check
import com.artemzin.rxkoans.rxjava.tier1.solutions.Koan5Solutions
import io.reactivex.Observable
import org.junit.Test
import java.util.*

class Koan5Test {

    interface Koan5 {
        fun mapStringToItsLength(upstream: Observable<String>): Observable<Int>
    }

    class Koan5Todo : Koan5 {

        /**
         * Task: map each value of `upstream` [Observable] of strings to their respective length.
         *
         * Purpose: showcase that [Observable] values can be transformed into other values.
         *
         * Hint: standard way to do this is [Observable.map] operator.
         */
        override fun mapStringToItsLength(upstream: Observable<String>): Observable<Int> = TODO()
    }

    @Test
    fun test() {
        check(
                possibleSolutions = setOf(
                        Koan5Solutions.Solution1(),
                        Koan5Solutions.Solution2()
                ),
                userSolution = Koan5Todo()
        ) { solution ->
            solution.mapStringToItsLength(Observable.fromArray("a", "aa", "abc", "b"))
                    .test()
                    .assertValues(1, 2, 3, 1)
                    .assertNoErrors()
                    .assertComplete()
        }
    }
}
