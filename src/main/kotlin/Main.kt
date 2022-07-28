import common.RansomNote
import palindrome.ListNode
import palindrome.PalindromeLinkedList


fun main(args: Array<String>) {

    val l1 = ListNode(1)
    val l2 = ListNode(2).apply {
        next = l1
    }
    val l3 = ListNode(2).apply {
        next = l2
    }
    val l4 = ListNode(4).apply {
        next = l3
    }
    val head = ListNode(1).apply {
        next = l4
    }

    println(PalindromeLinkedList().isPalindrome(head))

}