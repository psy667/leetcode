import utils.TreeNode

fun maxDepth(root: TreeNode?, level: Int = 1): Int {
    if(root == null) return level - 1

    return Math.max(
        maxDepth(root.left, level + 1),
        maxDepth(root.right, level + 1)
    )
}
