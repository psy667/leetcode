import utils.ListNode

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var p1 = list1
    var p2 = list2
    var res = ListNode(0)
    val start = res

    while (p1 != null || p2 != null) {
        if (p1 == null) {
            res.next = p2
            p2 = p2!!.next
        } else if (p2 == null) {
            res.next = p1
            p1 = p1.next
        } else if (p1.`val` >= p2.`val`) {
            res.next = p2
            p2 = p2.next
        } else {
            res.next = p1
            p1 = p1.next
        }
        res = res.next!!
    }

    return start.next
}
