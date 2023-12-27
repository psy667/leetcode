fun simplifyPath(path: String): String {
    val stack = ArrayDeque<String>()
    
//    fun <E>ArrayDeque<E>.removeLastOrNull(): E? = if (this.isEmpty()) null else this.removeLast()
    
    path.split("/").filter(String::isNotEmpty).forEach {
        when (it) {
            "." -> {}
            ".." -> stack.removeLastOrNull()
            else -> stack.addLast(it)
        }
    }

    return "/" + stack.joinToString("/")
}