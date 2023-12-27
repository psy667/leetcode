fun toCharNumbers(s: String): List<Int> {
    val dict = mutableListOf<Char>()

    return s.toList().map {
        var idx = dict.indexOf(it)

        if (idx == -1) {
            idx = dict.size
            dict.add(it)
        }

        idx
    }
}

fun isIsomorphic(s: String, t: String): Boolean {
    return toCharNumbers(s) == toCharNumbers(t)
}
