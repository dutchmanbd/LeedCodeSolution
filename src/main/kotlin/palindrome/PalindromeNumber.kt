package palindrome

class PalindromeNumber {

    fun isPalindrome(x: Int): Boolean {
        var num = x
        var rev = 0
        while(num != 0){
            rev = (rev * 10) + num % 10
            num /= 10
        }
        return rev >= -2147483648 && rev <= 2147483647 && rev == x
    }

}