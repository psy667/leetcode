import utils.TreeNode

fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    if (p == null || q == null) { return null }

    val (minV, maxV) = listOf(p.`val`, q.`val`).sorted()

    var node = root

    while (node != null) {
        if(node.`val` in minV .. maxV) {
            return node
        }

        node = if(node.`val` > maxV) {
            node.left
        } else {
            node.right
        }
    }

    return null
}
