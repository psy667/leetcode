import utils.ListNode

fun isPalindrome(head: ListNode?): Boolean {
    var slow = head
    var fast = head?.next

    // Move slow to the middle of list
    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    // Reverse the right side of list
    slow?.next = reverseList(slow?.next!!)

    // Move p1 from the start, p2 from the second half and compare
    var p1 = head
    var p2 = slow.next

    while (p2 != null) {
        if(p1?.`val` != p2.`val`) {
            return false
        }

        p1 = p1.next
        p2 = p2.next
    }
    return true
}
