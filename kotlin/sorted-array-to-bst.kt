import utils.TreeNode

fun sortedArrayToBST(nums: IntArray): TreeNode {
    val mid = nums.size / 2

    val left = nums.slice(0 until mid).toIntArray()
    val right = nums.slice(mid + 1 until nums.size).toIntArray()

    val node = TreeNode(nums[mid])

    if(left.isNotEmpty()) {
        node.left = sortedArrayToBST(left)
    }
    if(right.isNotEmpty()) {
        node.right = sortedArrayToBST(right)
    }

    return node
}
