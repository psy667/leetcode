import utils.TreeNode

fun isValidBST(root: TreeNode?, minV: Long = Long.MIN_VALUE, maxV: Long = Long.MAX_VALUE): Boolean {
    if(root == null) return true

    return if ((root.`val` > minV && root.`val` < maxV )) {
        isValidBST(root.left, minV, root.`val`.toLong()) &&
                isValidBST(root.right, root.`val`.toLong(), maxV)
    } else {
        false
    }
}
