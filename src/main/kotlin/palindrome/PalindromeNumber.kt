package palindrome

class PalindromeNumber {

    fun isPalindrome(x: Int): Boolean {
        if(x < 0)
            return false
        if(x in 0..9) return true
        var num = x
        var rev = 0
        while(num != 0){
            rev = (rev * 10) + num % 10
            num /= 10
        }
        return rev in 10..2147483647 && rev == x
    }

}