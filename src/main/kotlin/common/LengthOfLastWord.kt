package common

class LengthOfLastWord {

    fun lengthOfLastWord(s: String): Int {
        var index = s.length-1
        if (index < 0) return 0
        while (index >= 0) {
            if (s[index] != ' ') break
            index--
        }
        if (index == 0)
            return if (s[index] == ' ') 0 else 1
        var length = 0

        while (index >= 0) {
            if (s[index] == ' ') break
            length++
            index--
        }
        return length
    }
}