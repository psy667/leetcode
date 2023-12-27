// public fun <T> MutableList<T>.removeLastOrNull(): T? = if (isEmpty()) null else removeAt(lastIndex)

fun backspaceCompare(s: String, t: String): Boolean {
    val (a, b) = listOf(s, t).map {
        val list = mutableListOf<Char>()
        for(ch in it) {
            when (ch) {
                '#' -> list.removeLastOrNull()
                else -> list.add(ch)
            }
        }
        list.toString()
    }

    return a == b
}
