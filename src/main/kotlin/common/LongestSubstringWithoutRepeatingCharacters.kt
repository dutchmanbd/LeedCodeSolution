package common

import kotlin.math.max

class LongestSubstringWithoutRepeatingCharacters {

    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0
        var max = -1
        val length = s.length
        var chars = IntArray(256) { 0 }
        for (i in 0 until length) {

            for (j in i until length) {
                val char = s[j]
                if (chars[char - ' '] >= 1) {
                    break
                } else {
                    chars[char - ' ']++
                    max = max(max, (j - i + 1))
                }

            }
            chars = IntArray(256) { 0 }
        }
        return max
    }

    private fun isValidSubstring(s: String, start: Int, end: Int): Boolean {
        val chars = IntArray(256) { 0 }
        for (index in start..end) {
            val char = s[index]
            if (chars[char - ' '] >= 1) {
                return false
            }
            chars[char - ' ']++
        }
        return true
    }


}