package common

class RansomNote {

    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val ranLength = ransomNote.length
        val magLength = magazine.length
        if (ranLength > magLength) return false

        val ranNum = Array(26) { 0 }
        val magNum = Array(26) { 0 }

        for (index in 0 until magLength) {
            if (index < ranLength) {
                ranNum[ransomNote[index] - 'a']++
            }
            magNum[magazine[index] - 'a']++
        }

        for (index in 0..25) {
            if (ranNum[index] > 0 && ranNum[index] > magNum[index]) {
                return false
            }
        }
        return true
    }

}