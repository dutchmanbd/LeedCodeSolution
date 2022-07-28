package anagram

class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        val lengthS = s.length
        val lengthT = t.length
        if (lengthS != lengthT) {
            return false
        }
        val num1 = IntArray(26) { 0 }
        val num2 = IntArray(26) { 0 }

        for (index in 0 until lengthS) {
            num1[s[index] - 'a']++
            num2[t[index] - 'a']++
        }

        for (index in 0 until 26) {
            if (num1[index] != num2[index]) {
                return false
            }
        }
        return true
    }
}