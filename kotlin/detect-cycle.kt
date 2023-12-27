import utils.ListNode

fun detectCycle(head: ListNode?): ListNode? {
    if(head?.next == null) return null

    var slow = head
    var fast = head

    while (slow?.next != null || fast?.next?.next != null) {
        fast = fast?.next?.next
        slow = slow?.next

        if (slow == fast) break
    }
    slow = head
    while (slow != fast) {
        slow = slow?.next
        fast = fast?.next
    }

    return fast
}
