package com.artemzin.rxkoans.rxjava.tier1

import com.artemzin.rxkoans.rxjava.tier1.solutions.Koan6Solutions
import io.reactivex.Observable
import org.junit.Test

class Koan6Test {

    interface Koan6 {
        fun filterOutStringsThatStartWithCapitalLetter(upstream: Observable<String>): Observable<String>
    }

    class Koan6Todo : Koan6 {

        /**
         * Task: filter out those values of `upstream` [Observable] of strings that start with capital letter.
         *
         * Purpose: showcase that [Observable] values can be filtered out.
         *
         * Hint: standard way to do this is [Observable.filter] operator.
         */
        override fun filterOutStringsThatStartWithCapitalLetter(upstream: Observable<String>): Observable<String> = TODO()
    }

    @Test
    fun test() {
        com.artemzin.rxkoans.rxjava.check(
                possibleSolutions = setOf(
                        Koan6Solutions.Solution1()
                ),
                userSolution = Koan6Todo()
        ) { solution ->
            solution
                    .filterOutStringsThatStartWithCapitalLetter(Observable.fromArray("Test1", "test2", "tes3T", "Tes4t"))
                    .test()
                    .assertValues("test2", "tes3T")
                    .assertNoErrors()
                    .assertComplete()
        }
    }
}
