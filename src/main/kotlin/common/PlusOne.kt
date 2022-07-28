package common

class PlusOne {

    fun plusOne(digits: IntArray): IntArray {
        if (digits.last() < 9) {
            digits[digits.lastIndex] = digits.last() + 1
            return digits
        }
        var index = digits.lastIndex
        while (index >= 0) {
            digits[index]++
            if (digits[index] >= 10) {
                digits[index] = 0
            } else {
                return digits
            }
            index--
        }
        return intArrayOf(1, *digits)
    }
}