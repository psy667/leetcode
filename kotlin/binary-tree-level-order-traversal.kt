import utils.TreeNode

fun levelOrder(root: TreeNode?, acc: MutableList<MutableList<Int>> = mutableListOf(), level: Int = 0): List<List<Int>> {
    if(root == null) return acc

    if(level >= acc.size) {
        acc.add(mutableListOf())
    }

    acc[level].add(root.`val`)

    levelOrder(root.left, acc, level + 1)
    levelOrder(root.right, acc, level + 1)


    return acc
}
