package convert

class IntToRoman {
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
        "III" to 3,
        "II" to 2,
        "I" to 1
    )

    fun intToRoman(num: Int): String {
        val sb = StringBuilder()
        var updatedNum = num
        for ((key, value) in dic) {
            if(updatedNum == 0)
                break
            while (updatedNum != 0) {
                val times = updatedNum / value
                if (times > 0) {
                    for(i in 0 until times){
                        sb.append(key)
                    }
                    updatedNum %= value
                } else {
                    break
                }
            }
        }
        return sb.toString()
    }
}