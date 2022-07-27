package convert

class StringToInt {

    fun myAtoi(s: String): Int {
        val maxLimit = Int.MAX_VALUE
        val minLimit = Int.MIN_VALUE
        val length = s.length
        var index = 0
        var isPositive = true
        if(s.isEmpty())
            return 0
        while (index < length && s[index] == ' ') {
            index++
        }
        if(index >= length)
            return 0
        if(s[index] == '+' || s[index] == '-'){
            isPositive = s[index] != '-'
            index++
        }
        if(index >= length)
            return 0

        if ((s[index] - '0') < 0 || (s[index] - '0') > 9) {
            return 0
        }
        var num = 0
        while (index < length && s[index] in '0'..'9') {
            if (num > maxLimit / 10 || (num == maxLimit / 10 && (s[index] - '0') > 7)) {
                return if (isPositive) maxLimit else minLimit
            }
            num = num * 10 + (s[index] - '0')
            index++
        }
        return if (isPositive) num else num * -1
    }


}