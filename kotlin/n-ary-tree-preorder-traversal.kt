class Node(var `val`: Int) {
    var children: List<Node?> = listOf()
}

fun preorder(root: Node?, acc: MutableList<Int> = mutableListOf()): List<Int> {
    if(root == null) return acc

    if(root.children.isEmpty()) {
        acc.add(root.`val`)
        return acc
    }
    acc.add(root.`val`)

    var res = listOf<Int>()

    root.children.forEach {
        res = preorder(it, acc)
    }

    return res
}
