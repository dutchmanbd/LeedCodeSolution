package fibo

class ClimbStairs {
    private val fibs = mutableListOf<Int>()

    init {
        sieveFibs()
    }
    private fun sieveFibs() {
        fibs.add(1)
        fibs.add(1)
        for (index in 2..45) {
            fibs.add(fibs[index - 1] + fibs[index - 2])
        }
    }

    fun climbStairs(n: Int): Int {
        return fibs[n]
    }
}