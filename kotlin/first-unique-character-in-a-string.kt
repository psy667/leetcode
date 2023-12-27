fun firstUniqChar(s: String): Int {
    val map = HashMap<Char, Int>()

    s.forEach {
        map[it] = map.getOrDefault(it, 0) + 1
    }

    return s.indexOfFirst { map[it] == 1 }
}
