package convert

class RomanToInt {
    private val dic = mapOf(
        "M" to 1000,
        "CM" to 900,
        "D" to 500,
        "CD" to 400,
        "C" to 100,
        "XC" to 90,
        "L" to 50,
        "XL" to 40,
        "X" to 10,
        "IX" to 9,
        "V" to 5,
        "IV" to 4,
        "I" to 1
    )

    fun romanToInt(s: String): Int {
        var num = 0
        val length = s.length
        var index = 0
        while (index < length - 1) {
            if (s[index] == 'C' && s[index + 1] == 'M') {
                num += 900
                index += 2
            } else if (s[index] == 'C' && s[index + 1] == 'D') {
                num += 400
                index += 2
            } else if (s[index] == 'X' && s[index + 1] == 'C') {
                num += 90
                index += 2
            } else if (s[index] == 'X' && s[index + 1] == 'L') {
                num += 40
                index += 2
            } else if (s[index] == 'I' && s[index + 1] == 'X') {
                num += 9
                index += 2
            } else if (s[index] == 'I' && s[index + 1] == 'V') {
                num += 4
                index += 2
            } else {
                val key = "${s[index]}"
                num += dic[key]!!
                index++
            }
        }
        if (index < length) {
            val key = "${s[index]}"
            num += dic[key]!!
        }
        return num
    }

    private fun Char.toRoman(): Int {
        return if (this == 'M') 1000
        else if (this == 'D') 500
        else if (this == 'C') 100
        else if (this == 'L') 50
        else if (this == 'X') 40
        else if (this == 'V') 5
        else 1
    }
}