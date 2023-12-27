import utils.TreeNode

fun toStr(node: TreeNode?): List<String> {
    if(node == null) return listOf("n")

    if(node.left == null && node.right == null) return listOf(node.`val`.toString())

    return listOf("|") + toStr(node.left) + node.`val`.toString() + toStr(node.right) + listOf("|")
}

fun isSymmetric(root: TreeNode?): Boolean {
    if (root == null) return true

    return toStr(root.left) == toStr(root.right).reversed()
}
