package common

class NumberStepsReduceNumberZero {
    fun numberOfSteps(num: Int): Int {
        if (num == 0) return 0
        val bn = StringBuilder()
        var hasOneAdded = false
        for (c in 31 downTo 0) {
            val k = num shr c
            val zeroOrOne = (k and 1)
            if (zeroOrOne == 1) {
                hasOneAdded = true
            }
            if (hasOneAdded) {
                bn.append(zeroOrOne)
            }
        }
        return bn.count { it == '1' } + bn.length - 1
    }
}