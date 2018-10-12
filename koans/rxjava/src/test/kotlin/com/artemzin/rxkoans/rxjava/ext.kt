package com.artemzin.rxkoans.rxjava

inline fun <reified KoanSolution : Any> check(possibleSolutions: Set<KoanSolution>, userSolution: KoanSolution, check: (KoanSolution) -> Unit) {
    val solutions: Set<KoanSolution> = when (System.getenv("COM_ARTEMZIN_RXKOANS_TEST_TARGET")) {
        "provided-solutions" -> possibleSolutions
        else -> setOf(userSolution)
    }

    solutions.forEach { solution ->
        try {
            check(solution)
        } catch (error: Throwable) {
            throw KoanSolutionFailedException(solution::class.java, error)
        }
    }
}

class KoanSolutionFailedException(solutionClass: Class<out Any>, cause: Throwable) : Error("Koan solution failed, solution class = $solutionClass", cause)
