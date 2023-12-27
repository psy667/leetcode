import utils.ListNode

fun reverseList(head: ListNode): ListNode {
    fun iter(cur: ListNode?, prev: ListNode): ListNode {
        if (cur == null) return prev

        val next = cur.next
        cur.next = prev

        return iter(next, cur)
    }
    return iter(head.next, head).also { head.next = null }
}
