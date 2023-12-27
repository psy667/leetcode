fun canConstruct(s: String, t: String): Boolean {
    val map = mutableMapOf<Char, Int>()

    for (it in t) {
        map[it] =  (map[it] ?: 0) - 1
    }
    for (it in s) {
        map[it] =  (map[it] ?: 0) + 1
    }
    for (value in map.values) {
        if (value > 0) { return false }
    }
    return true
}
