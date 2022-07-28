import common.ListNode
import common.MiddleOfLinkedList

fun main(args: Array<String>) {

//    val l0 = ListNode(6)
    val l1 = ListNode(5).apply {
//        next = l0
    }
    val l2 = ListNode(4).apply {
        next = l1
    }
    val l3 = ListNode(3).apply {
        next = l2
    }
    val l4 = ListNode(2).apply {
        next = l3
    }
    val l5 = ListNode(1).apply {
        next = l4
    }
    var result = MiddleOfLinkedList().middleNode(l5)
    val sb = StringBuilder()
    while (result != null) {
        sb.append(result.`val`).append(",")
        result = result.next
    }
    println(sb.toString())

}