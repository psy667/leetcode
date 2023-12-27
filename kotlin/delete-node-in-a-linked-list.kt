import utils.ListNode

fun deleteNode(node: ListNode?) {
    val next = node!!.next!!

    node.next = next.next
    node.`val` = next.`val`
}
