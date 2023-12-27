fun isAnagram(s: String, t: String): Boolean {
    val map = mutableMapOf<Char, Int>()
    if (s.length != t.length) { return false }

    for (idx in s.indices) {
        map[s[idx]] =  (map[s[idx]] ?: 0) + 1
        map[t[idx]] =  (map[t[idx]] ?: 0) - 1
    }
    for (value in map.values) {
        if (value != 0) { return false }
    }
    return true
}
