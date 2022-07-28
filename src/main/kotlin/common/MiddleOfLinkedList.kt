package common

class MiddleOfLinkedList {
    fun middleNode(head: ListNode?): ListNode? {
        if (head == null) return null
        val nodes = mutableListOf<ListNode?>()
        var currentHead = head
        nodes.add(head)
        while (currentHead?.next != null) {
            nodes.add(currentHead.next)
            currentHead = currentHead.next
        }
        val length = nodes.size
        return if (length == 1) {
            nodes.first()
        } else {
            val middle = length / 2
            nodes[middle]
        }
    }
}

