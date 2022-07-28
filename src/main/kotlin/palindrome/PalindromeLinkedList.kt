package palindrome

import common.ListNode

class PalindromeLinkedList {
    fun isPalindrome(head: ListNode?): Boolean {
        if (head == null) return false
        val numbers = mutableListOf<Int>()
        var currentHead = head
        numbers.add(head.`val`)
        while (currentHead?.next != null) {
            numbers.add(currentHead.next?.`val` ?: 0)
            currentHead = currentHead.next
        }

        var left = 0
        var right = numbers.size - 1
        while (left < right) {
            if (numbers[left] != numbers[right]) {
                return false
            }
            left++
            right--
        }
        return true
    }
}


