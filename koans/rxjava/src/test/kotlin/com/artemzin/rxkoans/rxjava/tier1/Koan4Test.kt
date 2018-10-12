package com.artemzin.rxkoans.rxjava.tier1

import com.artemzin.rxkoans.rxjava.MyException
import com.artemzin.rxkoans.rxjava.check
import com.artemzin.rxkoans.rxjava.tier1.solutions.Koan4Solutions
import io.reactivex.Observable
import org.junit.Test

class Koan4Test {

    interface Koan4 {
        fun noValuesAndAErrorObservable(): Observable<Any>
    }

    class Koan4Todo : Koan4 {

        /**
         * Task: return an [Observable] that emits no values but a [MyException] error with a message "oops".
         *
         * Purpose: showcase that [Observable] is capable of emitting an error without values.
         *
         * Hint: standard way to do this is [Observable.error] operator.
         */
        override fun noValuesAndAErrorObservable(): Observable<Any> = TODO()
    }

    @Test
    fun test() {
        check(
                possibleSolutions = setOf(
                        Koan4Solutions.Solution1(),
                        Koan4Solutions.Solution2(),
                        Koan4Solutions.Solution3()
                ),
                userSolution = Koan4Todo()
        ) { solution ->
            solution.noValuesAndAErrorObservable()
                    .test()
                    .assertNoValues()
                    .assertNotComplete()
                    .assertError(MyException::class.java)
                    .assertErrorMessage("oops")
        }
    }
}
