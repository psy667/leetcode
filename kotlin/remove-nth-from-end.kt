import utils.ListNode

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val start = ListNode(0)
    var p1 = start
    var p2: ListNode? = p1
    p1.next = head

    repeat(n) {
        p2 = p2?.next
    }

    while(p2?.next != null) {
        p1 = p1.next!!
        p2 = p2!!.next
    }

    p1.next = p1.next?.next
    return start.next
}
