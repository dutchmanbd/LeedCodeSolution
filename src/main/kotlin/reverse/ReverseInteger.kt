package reverse

class ReverseInteger {

    fun reverse(x: Int): Int {
        if (x >= -9 && x <= 9) {
            return x
        }
        var num = x
        var rev: Long = 0
        while (num != 0) {
            rev = (rev * 10) + (num % 10)
            num /= 10
        }
        return if (rev >= -2147483648 && rev <= 2147483647) {
            rev.toInt()
        } else {
            0
        }
    }

}